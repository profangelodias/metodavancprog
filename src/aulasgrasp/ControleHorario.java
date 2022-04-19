package aulasgrasp;

public class ControleHorario {

	public static void main(String[] args) {

		Hora horaChegada = new Hora(9, 0, 0);
		Hora horaSaida = new Hora(8, 30, 0);
		
		
		Funcionario profAngelo = new Funcionario("Prof. Angelo Dias", horaChegada, horaSaida);

		System.out.println("Hora de chegada: " + horaChegada);
		System.out.println("Hora de saída: " + horaSaida);
		System.out.printf("Horas trabalhadas: %.1f\n", profAngelo.getHorasTrabalhadas());

	}

}
