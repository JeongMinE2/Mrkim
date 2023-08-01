package Mrkim.Fangfang;

import Mrkim.entity.MrkimEntity;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class fangfang {
    Scanner sc = new Scanner(System.in);
    ArrayList<MrkimEntity> mk = new ArrayList<MrkimEntity>();

    int count = 1;

    public void Write() {
        System.out.print("명언 : ");
        String saying = sc.nextLine().trim();
        System.out.print("작가 : ");
        String writer = sc.nextLine().trim();

        MrkimEntity mrkim = new MrkimEntity(count, saying, writer);

        mk.add(mrkim);
        System.out.println(count + "번 명언이 등록되었습니다.");
        count++;
    }

    public void Del() {
        System.out.print("삭제할 정보 id를 입력해주세요.\n명령) ");
        int del = Integer.parseInt(sc.nextLine().trim());
        try {
            if(mk.get(del-1)!=null){
                mk.set(del-1, null);
                System.out.println(del + "번 명언이 삭제 되었습니다.");
            }
        } catch (NullPointerException e){
            System.out.println("명언이 존재하지 않습니다.");
        }
    }

    public void List() {
        System.out.println("== 명언 ==");
        System.out.println("번호 / 작가 / 명언");

        for (int i = 0; i < mk.size(); i++) {
            try {
                if(mk.get(i)!=null){
                    System.out.println(" " + mk.get(i).getId() + "    " + mk.get(i).getWriter() + "  " + mk.get(i).getSaying());
                }
            } catch (NullPointerException e){
                System.out.println("빈칸");
            }
        }
    }

    public void Update() {
        System.out.print("수정할 정보 id를 입력해주세요.\n명령) ");
        int del = Integer.parseInt(sc.nextLine().trim());

        try {
            System.out.println("명언(기존) : " + mk.get(del-1).getSaying());
            System.out.print("명언 : ");
            String updatesaying = sc.nextLine();

            System.out.println("작가(기존) : " + mk.get(del-1).getWriter());
            System.out.print("작가 : ");
            String updatewriter = sc.nextLine();

            for (int i = 0; i < mk.size(); i++) {
                if (mk.get(i) != null) {
                    if (mk.get(i).getId() == del) {
                        mk.get(i).setSaying(updatesaying);
                        mk.get(i).setWriter(updatewriter);
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("명언이 존재하지 않습니다.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("명언이 존재하지 않습니다.");
        }

    }

    public void Insert() {
        System.out.print("삽입할 정보 id를 입력해주세요.\n명령) ");
        int in = Integer.parseInt(sc.nextLine().trim());
        if (mk.get(in-1) == null) {
            System.out.print("명언 : ");
            String insertsaying = sc.nextLine();
            System.out.print("작가 : ");
            String insertwriter = sc.nextLine();

            MrkimEntity inmk = new MrkimEntity(in, insertsaying, insertwriter);

            mk.set(in - 1, inmk);
        }
    }
}
