import streamlit as st
from utils import extract_text_from_pdf, extract_skills, compute_similarity, missing_skills
from skills import SKILLS_DB

st.set_page_config(page_title="Resume Analyzer", layout="centered")

st.title("Resume Analyzer & Job Matcher")

st.write("Upload your resume and paste a job description to get a match score!")

resume_file = st.file_uploader("Upload Resume (PDF)", type=["pdf"])

job_description = st.text_area("Paste Job Description")

if st.button("Analyze Resume"):

    if resume_file is not None and job_description.strip() != "":

        resume_text = extract_text_from_pdf(resume_file)

        resume_skills = extract_skills(resume_text, SKILLS_DB)
        jd_skills = extract_skills(job_description, SKILLS_DB)

        score = compute_similarity(resume_text, job_description)

        missing = missing_skills(resume_skills, jd_skills)

        st.subheader("Analysis Result")

        st.write(f"Match Score: {score:.2f}%")

        st.write("Resume Skills")
        st.write(resume_skills)

        st.write("Job Required Skills")
        st.write(jd_skills)

        st.write("Missing Skills")
        st.write(missing)

        if score > 75:
            st.success("Great match!")
        elif score > 50:
            st.warning("Good, but you can improve your resume ")
        else:
            st.error("Low match. Improve your skills section ")

    else:
        st.error("Please upload resume and enter job description")
