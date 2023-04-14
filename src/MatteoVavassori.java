import java.util.Scanner;

public class MatteoVavassori
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
			case 1:
				parolemisteriose();
				break;
			case 2:
				stampapari();
				break;
			case 3:
				arraydivisori();
				break;
			case 4:
				ugualiconsecutivi();
				break;
			default:
				System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{

		System.out.println("1 - Es n. * - Titolo es. *");
		System.out.println("2 - Es n. * - Titolo es. *");
		System.out.println("3 - Es n. * - Titolo es. *");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}

	static void parolemisteriose()
	{
		String [] v = {"ciao", "come", "stai", "bene", "salve"};

		String parola = null;
		for (int i=0; i<4; i++)
		{
			System.out.println("Indovina una parola");
			parola = in.nextLine();
			for(int j=0; j<v.length; j++)
			{
				if(parola.equals(v[j]))
					System.out.println(parola + " hai indovinato!");
				break;
			}

		}
	}//Colucci: bisognava indovinare una parola entro 3 tentativi!
	static void stampapari()
	{
		int [] v = new int [20];
		for (int i =0; i<v.length; i++)
		{
			v[i] = (int) ((Math.random()*100)+1);
		}
		for (int i =0; i<v.length; i++)
			System.out.println(v[i]);

		System.out.println("il secondo è");

		int num = 0;
		for (int i =0; i<v.length; i++)
		{
			if(v[i] % 2 == 0)
				num++;
		}
		int [] a = new int [num];
		for (int i =0, j=0; i<v.length; i++)
		{
			if(v[i] % 2 == 0)
			{
				a[j] = v[i];
				j++;
			}
		}


		{

			for(int j=0; j<a.length; j++)
				for(int z=0; z<a.length;z++)
				{
					if(a[j] < a[z])
						swap(a,j,z);
				}

		}


		for (int i =0; i<a.length; i++)
			System.out.println(a[i]);
	}
	static void swap (int [] v, int i, int j)
	{
		int temp;
		temp = v[i];
		v[i] = v[j];
		v[j] = temp;
	}
	static void arraydivisori()
	{
		int aum = 0;
		int inc =2;
		int [] v = new int [50];
		int [] a = new int [8];
		for (int i =0; i<v.length; i++)
		{
			v[i] = (int) ((Math.random()*100)+1);
		}
		for (int i =0; i<v.length; i++)
		{
			System.out.println(v[i]);
		}
		for (int i=0; i<v.length; i++)
		{	
			if(v[i] % inc == 0)
			{
				for ( int j=0; j<a.length; j++)
				{
					aum ++;
					a[j] = aum;	
					inc ++;
				}
				
			}
			
		}
		for (int i=0; i<a.length; i++)
			System.out.println(a[i]);

	}//Colucci: Eri vicino alla soluzione, bisognava solo capire quando incrementare il divisore.
	static void ugualiconsecutivi()
	{
		int [] v = new int [20];
		for (int i =0; i<v.length; i++)
		{
			v[i] = (int) ((Math.random()*11)-5);
		}
		for (int i=0; i<v.length-1; i++)
		{
			if(v[i] == v[i+1])
			{
				System.out.println(v[i+1]);
				System.out.println("l'indice è " + (i+1));
				System.out.println(v[i]);
				System.out.println("l'indice è " + i);
			}
			else
				System.out.println("non ci sono coppie di valori consecutivi uguali ");


		}


	}//non hai centrato assolutamente la consegna



}
