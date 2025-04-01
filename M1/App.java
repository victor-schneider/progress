public class App {
    public static void main(String[] args) throws Exception {
        Hotel h1 = new Hotel("Marambaia");
        Cargo almoxarife = new Cargo("Almoxarife");
        Cargo recepcionista = new Cargo("Recepcionista");
        Funcionario f1 = new Funcionario("Marquito", 5000.00, almoxarife);
        Funcionario f2 = new Funcionario("Elias", 4200.00, recepcionista);

        Quarto q1 = new Quarto(505, 5, h1);
        Quarto q2 = new Quarto(207, 2, h1);

        Hospede hospede1 = new Hospede("Victor", "Rua A", "123456789-00");
        Hospede hospede2 = new Hospede("Allan", "Avenida B", "234567890-12");
        Reserva r1 = new Reserva("30/03/2025", "31/03/2025", q1, new Hospede[]{hospede1, hospede2});
        Veiculo v1 = new Veiculo("RAD-3762", "BMW 320I", r1);
        
        Hospede hospede3 = new Hospede("Juliana", "Avenida da Saudade", "987453890-32");
        Reserva r2 = new Reserva("02/04/2025", "05/04/2025", q2, new Hospede[]{hospede3});



        r2.cancelar(r2, new Hospede[]{hospede3});

        r1.checkIn(new Hospede[]{hospede1, hospede2});
        

        f1.mudarSalario(5250.00);
        f2.mudarSalario(4000.00);
    }
}
