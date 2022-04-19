package aulasgrasp;

public class Hora {
	private int hours, minutes, seconds, milisegundos;

	public Hora(int hours, int minutes, int seconds) {
//preenchendo as horas
		if (hours >= 0 && hours < 24)
			this.hours = hours;
		else
			throw new IllegalArgumentException("Hora inv�lida");

//preenchendo os minutos
		if (minutes >= 0 && minutes < 60)
			this.minutes = minutes;
		else
			throw new IllegalArgumentException("Minutos inv�lidos");

//preenchendo os segundos
		if (seconds >= 0 && seconds < 60)
			this.seconds = seconds;
		else
			throw new IllegalArgumentException("Segundos inv�lidos");

	}

	@Override
	public String toString() {
		return String.format("%d:%d:%d", getHour(), getMinute(), getSecond());
	}

	public int getHour() {
		return this.hours;
	}

	public int getMinute() {
		return this.minutes;
	}

	public int getSecond() {
		return this.seconds;
	}

}
