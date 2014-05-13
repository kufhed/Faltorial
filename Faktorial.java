class hitung
{
    public static int hsl(int nilai)
    {
        int i,tot=1;
        for (i=1;i<=nilai;i++)
        {
            tot=tot*i;
        }
        System.out.println("Faktorial dari "+nilai+"! : ");
        return(tot);
    }
};

class faktorial
{
    public static void main(String[] args) 
    {
        int hasil;
        hitung ht=new hitung();
        hasil=ht.hsl(7);
        System.out.println("Hasil Faktorial = "+hasil);
    }
}


