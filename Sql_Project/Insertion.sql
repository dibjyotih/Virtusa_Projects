INSERT INTO Patients VALUES
(1, 'Amit', 30, 'Male'),
(2, 'Priya', 25, 'Female'),
(3, 'Rahul', 40, 'Male');


INSERT INTO Doctors VALUES
(101, 'Dr. Sharma', 'Cardiology'),
(102, 'Dr. Mehta', 'Dermatology'),
(103, 'Dr. Rao', 'General');


INSERT INTO Appointments VALUES
(1, 1, 101, '2026-03-01'),
(2, 2, 102, '2026-03-02'),
(3, 1, 101, '2026-03-05'),
(4, 3, 103, '2026-03-06');


INSERT INTO Treatments VALUES
(1, 1, 'Heart Disease', 5000, '2026-03-01'),
(2, 2, 'Skin Allergy', 1500, '2026-03-02'),
(3, 1, 'Heart Disease', 6000, '2026-03-05'),
(4, 3, 'Fever', 800, '2026-03-06');
