package com.example.forRoadside.forRoadside.entity;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "user_problems")

public class UserProblems {
    @Id
    public String problemDescription;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    public byte[] problemImage;

    public UserProblems() {
    }

    public UserProblems(byte[] problemImage, String problemDescription) {
        this.problemImage = problemImage;
        this.problemDescription = problemDescription;
    }

    public byte[] getProblemImage() {
        return problemImage;
    }

    public void setProblemImage(byte[] problemImage) {
        this.problemImage = problemImage;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    @Override
    public String toString() {
        return "UserProblems{" +
                "problemImage=" + Arrays.toString(problemImage) +
                ", problemDescription='" + problemDescription + '\'' +
                '}';
    }
}
