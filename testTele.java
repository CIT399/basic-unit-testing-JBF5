package testingBasics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testTele {
	private String strPNF1 = "(570)-3966449";
	private String strPNF2 = "(570)396-6449";
	private String strPNF3 = "(570)-396-6449";
	private String strPNU = "5703966449";

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("=Set up before class=");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("=Teardown after class=");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("\t=Setup Test=");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("\t=Teardown Test=");
		System.out.println();
	}

	@Test
	void testUnformat1() {
		System.out.println("\t\t=Test One=");
		assertEquals(strPNU, Telephone.unformat(strPNF1));
	}
	
	@Test
	void testUnformat2() {
		System.out.println("\t\t=Test Two=");
		assertEquals(strPNU, Telephone.unformat(strPNF2));
	}
	
	@Test
	void testUnformat3() {
		System.out.println("\t\t=Test Three=");
		assertEquals(strPNU, Telephone.unformat(strPNF3));
	}
}
