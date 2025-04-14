
package lab2;
import java.util.Scanner;
public class bai2 {
    private double chieudai;
    private double chieurong;
public double getchieudai(){
    return chieudai;
}
public double getchieurong(){
    return chieurong;
}
public void setchieudai(double chieudai){
    this.chieudai=chieudai;
}
public void setchieurong(double chieurong){
    this.chieurong=chieurong;
}
public double tinhdientich(){
    return chieudai * chieurong;
}
public double tinhchuvi(){
    return (chieudai+chieurong)*2;
}
@Override
public String toString(){
    return "chieu dai: " +chieudai+ "\n" +
           "chieu rong: "+chieuronng+ "\n"+
            "dien tich Hinhchunhat: "+tinhdientich()+ "\n"+
            "chu vi Hinhchunhat: "+tinhchuvi();
}
public static void main(String[]args){
    bai2 baitap = new bai2();
    Scanner nhap = new Scanner(System.in);
    System.out.println("nhap chieu dai: ");
    baitap.setchieudai(nhap.nextDouble());
    System.out.println("nhap chieu rong: ");
    baitap.setchieurong(nhap.nextDouble());
    System.out.println("Tat ca ve Hinhchunhat: ");
    System.out.println(baitap);
}
}
