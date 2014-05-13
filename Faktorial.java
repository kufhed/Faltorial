import java.util.Scanner;
class hitung
{
    public static int hsl(int nilai)
    {
        System.out.println("Faktorial dari "+nilai+"! : ");
        
        int i,tot=1;
        for (i=1;i<=nilai;i++)
        {
            tot=tot*i;
        }
        
        return(tot);
    }
};

class faktorial
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int hasil;
        hitung ht=new hitung();
        hasil=ht.hsl(n);
        for(int i=n; i>0; i++)
        {
            System.out.print(i);
        }
        System.out.println("Hasil Faktorial = "+hasil);
    }
}


