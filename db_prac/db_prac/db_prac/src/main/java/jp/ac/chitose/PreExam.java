package jp.ac.chitose;

public class PreExam {

    private String gakusekiCode;
    private String familyName;
    private String firstName;
    private int point;

    public PreExam(String gakusekiCode,String familyName,String firstName,int point){
        this.gakusekiCode = gakusekiCode;
        this.familyName = familyName;
        this.firstName = firstName;
        this.point = point;
    }

    public void print(){
        System.out.println(gakusekiCode+"さんは"+point+"点");
    }
}