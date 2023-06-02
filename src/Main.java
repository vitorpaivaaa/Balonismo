public class Main {
    public static void main(String[] args) {

        Pessoa obj1 = new Pessoa ();
        obj1.nome = "luan";
        obj1.cpf = 2132131111;
        obj1.rg = 312321321;
        obj1.telefone = "(11) 90099-0990";
        obj1.telefoneconotato = "(11) 4002-8922";
        obj1.endereço = "rua california N123 ";
        obj1.falar();
        obj1.pagar();
        obj1.voar();

        Piloto obj2 = new Piloto();
        obj2.nome = "carlos";
        obj2.cpf = 234234342;
        obj2.codAnac = 2342;
        obj2.decolar();
        obj2.pousar();

        Balao obj3 = new Balao();
        obj3.codBalao = 223;
        obj3.codIndent = 74747;
        obj3.subir();
        obj3.descer();
}
}