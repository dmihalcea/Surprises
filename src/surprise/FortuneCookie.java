package surprise;

import java.util.ArrayList;
import java.util.Random;

public class FortuneCookie implements ISurprise {

	private static Random randomNumberGenerator = new Random();
	private String message;

	public FortuneCookie(String message) {
		this.message = message;
	}

	@Override
	public void enjoy() {
		System.out.println("Ai primit o prajitura cu mesajul \"" + this.message + "\"");
	}

	@Override
	public String toString() {
		return "Prajitura cu mesajul: " + this.message + "";
	}

	public static FortuneCookie generate() {
		ArrayList<String> zicale = new ArrayList<String>();
		zicale.add("Not today!");
		zicale.add("Easy come, easy go!");
		zicale.add("Si drumul cel mai lung incepe tot cu un pas.");
		zicale.add("Asculta totul, dar sa nu crezi totul.");
		zicale.add("Vorba dulce mult aduce.");
		zicale.add("Ochii sunt poarta catre suflet.");
		zicale.add("Esti ceea ce gandesti.");
		zicale.add("Limba amutita, viata linistita.");
		zicale.add("Lupul, cand e singur, devine leu.");
		zicale.add("Ce nu poti evita, accepta cu placere.");
		zicale.add("Rabdarea este amara, dar da roade dulci.");
		zicale.add("Sa intelegi totul inseamna sa ierti totul.");
		zicale.add("Amana pe maine odihna, nu si munca.");
		zicale.add("Cine are cat ii trebuie, este un om bogat.");
		zicale.add("Fii generos cu zambetele tale.");
		zicale.add("Acela care asculta bine, vorbeste bine.");
		zicale.add("Nimic nu e mai scump decat ceea ce primesti gratis.");
		zicale.add("Pregateste-te pentru ce e mai bine, dar nu te teme de ce e mai rau.");
		zicale.add("Piatra pretioasa daca nu e slefuita, nu straluceste.");
		zicale.add("Ai ochi de vultur cand cauti ce te intereseaza.");

		return new FortuneCookie(zicale.get(FortuneCookie.randomNumberGenerator.nextInt(20)));
	}
}
