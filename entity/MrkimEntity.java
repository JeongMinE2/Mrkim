package Mrkim.entity;

import java.util.Scanner;

public class MrkimEntity {
    int Id;
    String Saying;
    String Writer;

    public MrkimEntity(int Id, String Saying, String Writer) {
        this.Id = Id;
        this.Saying = Saying;
        this.Writer = Writer;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getSaying() {
        return Saying;
    }

    public void setSaying(String saying) {
        Saying = saying;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }
}
