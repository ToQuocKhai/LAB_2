
package lab2;

import java.util.Arrays;
import java.util.Scanner;
public class bai1 {
    private int[] mang;
    private int n;
    public void nhapmang(){
        Scanner nm = new Scanner(System.in);
        System.out.print("nhap so phan tu:");
        n = nm.nextInt();
        mang = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("phan tu thu"+ i+":");
            mang[i] = nm.nextInt();
        }
    }
    public void xuatmang(){
        System.out.print("mang can xuat:");
        for(int x:mang){
            System.out.print(x+"");
        }
    }
    public void timvtr(int x){
        boolean found = false;
        for(int i = 0; i < n;i++){
            if(mang[i]==x){
                System.out.print("tim thay tai vi tri"+i);
                found = true;
            }
        }
        if(!found){
            System.out.print("khong tim thay");
        }
    }
    public int timMax(){
        int Max = mang[0];
        for(int i = 1; i < n;i++){
            if(mang[i]>Max){
                Max = mang[i];
            }     
        }
        return Max;
    }
    public int timMin(){
        int Min = mang[0];
        for(int i = 1;i<n;i++){
            if(mang[i]<Min){
                Min = mang[i];
            }              
        }
        return Min;
    }
    public void vtMax(){
        int Max = timMax();
        for(int i=0; i<n;i++){
            if(mang[i]==Max){
                System.out.print("vi tri mang lon nhat la"+i);
            }
        }
    }
    public void sapxeptangdan(){
        Arrays.sort(mang);
        System.out.print("mang sau khi sap xep");
        xuatmang();
    } 
    public static void main(String[]args){
        bai1 nm = new bai1();
        nm.nhapmang();
        nm.xuatmang();

        nm.timvtr(5);
        System.out.println("Giá trị lớn nhất: " + nm.timMax());
        System.out.println("Giá trị nhỏ nhất: " + nm.timMin());
        nm.vtMax();
        nm.sapxeptangdan();
    }
}
