package jeuxDeGrilles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestJeuxDeGrilles {

	@Test
	void test() {
		//fail("Not yet implemented");
		Morpion Morpion = new Morpion();
		System.out.println(Morpion.toString());
		
		for(int i=1;i<=3;++i) {
			for(int j=1;j<=3;++j) {
				int [] Coup= {i,j};
				Morpion.JouerCoup(Coup);
			}
		}
		
		System.out.println(Morpion.toString());
		assertTrue(Morpion.estRemplie());
		
		Puissance4 Puissance4 = new Puissance4();
		System.out.println(Puissance4.toString());
		
		for(int i=1;i<=7;++i) {
			for(int j=1;j<=6;++j) {
				int [] Coup= {i};
				Puissance4.JouerCoup(Coup);
			}
		}
		
		System.out.println(Puissance4.toString());
		assertTrue(Puissance4.estRemplie());
		
		
		
	
	}

}
