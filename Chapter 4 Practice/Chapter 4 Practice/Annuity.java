public class Annuity
{
    public static void main(String[] args)
    {
        AnnuityCalc a = new AnnuityCalc(10000,.08,20);
        double annuity = a.getAnnuity();
        System.out.println(annuity);
    }
}