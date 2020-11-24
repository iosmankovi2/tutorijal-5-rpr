package ba.unsa.etf.rpr.tutorijal5;

public class Student implements Comparable<Student> {
    String ime;
    String prezime;
    int brojIndeksa;

    public Student(String ime, String prezime, int brojIndeksa){}
   public String getIme(){ return ime; }
   public  String getPrezime() { return prezime; }
   public int getBrojIndeksa() { return brojIndeksa; }
   public  String ispis() { return "...";}

   @Override

    public  int compareTo(Student s) {
        return ispis().compareTo(s.ispis());
   }


}
