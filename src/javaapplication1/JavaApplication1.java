package javaapplication1;
import java.io.*;
import java.util.*;
public class JavaApplication1 {
    public static void BT1(){
        System.out.println("Hello! I'm Dung");
        System.out.println("This is my first java program");
    }
    public static void BT2(){
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien:");
        String MSV = x.nextLine();
        System.out.print("Nhap Ho ten sinh vien:");
        String HoTen = x.nextLine();
        System.out.print("Nhap nam sinh sinh vien:");
        int Year = x.nextInt();
        System.out.print("Nhap diem trung binh sinh vien:");
        float Point = x.nextFloat();
        System.out.println(MSV);
        System.out.println(HoTen);
        System.out.println(Year);
        System.out.println(Point);
        
    }
    public static void BT3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x:");
        int x = sc.nextInt();
        System.out.print("Nhap y:");
        int y = sc.nextInt();
        float z = (float)x/y;
        System.out.println("Tong cua x va y la: "+(x+y));
        System.out.println("Hieu cua x va y la: "+(x-y));
        System.out.println("Tich cua x va y la: "+(x*y));
        System.out.println("Thuong cua x va y la: "+z);
    }
    public static void BT4(){
        int a=-1;
        int b=-1;
        Scanner sc = new Scanner(System.in);
        while(a<0 || b<0){
            System.out.print("Nhap a:");
            a = sc.nextInt();
            System.out.print("Nhap b:");
            b = sc.nextInt();
        }
        int c = USCLN(a,b);
        System.out.println("USCLN cua "+a+" va "+b+" la : "+ c);
        System.out.println("BSCNN cua "+a+" va "+b+" la : "+ BSCNN(a,b,c));
    }
    public static int USCLN(int a,int b){
        if(b==0){
            return a;
        }
        return USCLN(b, a%b);
    }
    public static int BSCNN(int a,int b,int c){
        return (a*b)/c;
    }
    public static void BT5(){
        int n =-1;
        Scanner sc = new Scanner(System.in);
        while(n<0){
            System.out.print("\n5Nhap so nguyen duong n = ");
            n = sc.nextInt();
        }
        System.out.println("Cac so nguyen to nho hon " + n+" la : ");
        if(n>=2) System.out.print(2);
        for (int i=3;i<n;i+=2){
            if(Snt(i)){
                System.out.print(" " +i);
            }
        }
    }
    public static boolean Snt(int n){
        int sq = (int) Math.sqrt(n);
        for(int i=2;i<=sq;i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
    public static boolean Scp(int n){
        int i=0;
        while (i*i <=n){
            if(i*i==n && n !=0){
                return true;
            }
            i++;
        }
        return false;
    }
    public static void Sx(int []a){
        int b = a[0];
        for ( int i=0;i<a.length-1;i++){
            for(int j =i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    b = a[j];
                    a[j] =a[i];
                    a[i] = b;
                }
            }
        }
    }
    public static void BT6(){
        int a[];
        int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong mang : ");
        n = sc.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Nhap phan tu thu "+(i+1)+" la: ");
            a[i] = sc.nextInt();
        }
        int m = a[0];
        int u=0;
        for(int i=0;i<n;i++){
            if(m<a[i]) m =a[i];
            if(a[i]<2) continue;
            if(Snt(a[i])){
                u++;
            }
        }
        if(u==0){
            System.out.print("Trong mang khong co so nguyen to.");
        }
        else{
            System.out.println("Cac so nguyen to co trong mang la: ");
            for(int i=0;i<n;i++){
            if(m<a[i]) m =a[i];
            if(a[i]<2) continue;
            if(Snt(a[i])){
                System.out.print(a[i] + " ");
            }
        }
        }
        System.out.println("\nGia tri lon nhat trong mang la: "+m);
        int p=0;
        for(int i=0;i<n;i++){
            if(Scp(a[i])){
                p++;
            }
        }
        System.out.println("So luong phan tu la so chinh phuong co trong mang la: "+p);
        Sx(a);
        System.out.println("Mang sau khi sap xep la:");
        for (int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        BT1();
        BT2();
        BT3();
        BT4();
        BT5();
        BT6();
    }
    
    
}
