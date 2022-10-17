package ifsc;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {

		ArrayList<Gato> gatos = new ArrayList<>();

		Gato gato0 = new Gato();
		gato0.setNome("manolita");
		gato0.setRaca("gato");
		gato0.setComprimento(45.0f);
		gato0.setCor("muitas");
		gato0.setNumerodepatas(4);
		gato0.setEcosistema("dentro de casa");

		gatos.add(gato0);

		Gato gato1 = new Gato();
		gato1.setNome("lulu");
		gato1.setRaca("gato");
		gato1.setCor("preto");
		gato1.setComprimento(47.3f);
		gato1.setNumerodepatas(4);
		gato1.setEcosistema("dentro de casa");

		gatos.add(gato1);

		Gato gato2 = new Gato();
		gato2.setNome("Chico");
		gato2.setCor("cinza");
		gato2.setRaca("siames");
		gato2.setComprimento(49.1f);
		gato2.setNumerodepatas(4);
		gato2.setEcosistema("dentro de casa");

		gatos.add(gato2);

		ArrayList<Cachorro> caozinho = new ArrayList<>();

		Cachorro cao = new Cachorro();
		cao.setNome("Bradock");
		cao.setCor("preto");
		cao.setComprimento(51.7f);
		cao.setNumerodepatas(4);
		cao.setRaca("policial com bombeiro");
		cao.setEcosistema("dentro de casa e no terreno da casa");

		caozinho.add(cao);

		Cachorro cao1 = new Cachorro();
		cao1.setNome("natasha");
		cao1.setCor("preto");
		cao1.setComprimento(60.0f);
		cao1.setNumerodepatas(4);
		cao1.setRaca("policial com bombeiro");
		cao1.setEcosistema("dentro de casa e no terreno da casa");

		caozinho.add(cao1);

		Cachorro cao2 = new Cachorro();
		cao2.setNome("Pingo");
		cao2.setCor("branco e preto");
		cao2.setComprimento(80.0f);
		cao2.setNumerodepatas(4);
		cao2.setRaca("policial com bombeiro");
		cao2.setEcosistema("dentro de casa e no terreno da casa");

		caozinho.add(cao2);

		for (Cachorro cachorro : caozinho) {
			System.out.println(cachorro.getNome());
			System.out.println(cachorro.getCor());
			System.out.println(cachorro.getRaca());
			System.out.println(cachorro.getComprimento());
			System.out.println(cachorro.getNumerodepatas());
			System.out.println(cachorro.getEcosistema());
		}

		for (Gato gato : gatos) {
			System.out.println(gato.getNome());
			System.out.println(gato.getCor());
			System.out.println(gato.getRaca());
			System.out.println(gato.getComprimento());
			System.out.println(gato.getNumerodepatas());
			System.out.println(gato.getEcosistema());

		}
	}
}
