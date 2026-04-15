# Resume Analyzer & Job Matcher

A smart web application that analyzes resumes using NLP techniques and matches them with job descriptions to provide a **match score**, **skill comparison**, and **improvement suggestions**.

---

## Features

- Upload resume (PDF format)
- Extract key skills using NLP
- Match resume with job description
- Generate match score (percentage)
- Identify missing skills
- Provide suggestions for improvement
- Interactive web interface using Streamlit

---

## Tech Stack

- **Frontend & Backend:** Python (Streamlit)
- **NLP:** NLTK / spaCy
- **Machine Learning:** Scikit-learn (TF-IDF, Cosine Similarity)
- **PDF Processing:** PyPDF2

---

## Project Structure
resume-analyzer/
│
├── app.py # Main Streamlit app
├── utils.py # Core logic functions
├── skills.py # Skills database
├── requirements.txt # Dependencies
└── README.md # Project documentation
## ⚙️ Installation

1. Clone the repository:
2. git clone https://github.com/dibjyotih/python_minorproject.git

cd python_minorproject

## Run the Application
streamlit run app.py
