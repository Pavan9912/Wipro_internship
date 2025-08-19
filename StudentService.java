package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.*;

public class StudentService {

    public boolean validate(Student student) throws NullStudentException, NullNameException, NullMarksArrayException {
        if (student == null) throw new NullStudentException("Object is null");
        if (student.getName() == null) throw new NullNameException("Name is null");
        if (student.getMarks() == null) throw new NullMarksArrayException("Marks array is null");
        return true;
    }

    public int findNumberOfNullName(Student[] students) {
        int count = 0;
        for (Student s : students) {
            if (s != null && s.getName() == null) count++;
        }
        return count;
    }

    public int findNumberOfNullObjects(Student[] students) {
        int count = 0;
        for (Student s : students) {
            if (s == null) count++;
        }
        return count;
    }

    public int findNumberOfNullMarks(Student[] students) {
        int count = 0;
        for (Student s : students) {
            if (s != null && s.getMarks() == null) count++;
        }
        return count;
    }
}

