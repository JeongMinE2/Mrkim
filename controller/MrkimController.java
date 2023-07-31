package Mrkim.controller;

import java.util.Scanner;

import Mrkim.Fangfang.fangfang;

public class MrkimController {
    Scanner sc = new Scanner(System.in);
    private fangfang ff = new fangfang();
    boolean run = true;
    public void run() {
        System.out.println("== 명언 앱 ==");

        while(run) {
            System.out.print("명령) ");
            String order = sc.nextLine();

            switch (order) {
                case "종료":
                    run = false;
                    break;

                case "등록":
                    ff.Write();
                    break;

                case "목록":
                    ff.List();
                    break;

                case "수정":
                    ff.Update();
                    break;

                case "삭제":
                    ff.Del();
                    break;

                case "삽입":
                    ff.Insert();
                    break;
            }
        }
    }
}
