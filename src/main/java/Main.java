public class Main {
    public static void main(String[] args) {
        Manusia orangSatu = new Manusia();
        orangSatu.setTubuh("banteng");
        orangSatu.setPikiran("buaya");

        System.out.println(orangSatu.getTubuh());
        System.out.println(orangSatu.getPikiran());

        Manusia.getNama();

    }
}
