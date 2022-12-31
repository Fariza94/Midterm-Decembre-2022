package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
	/*
	 * Find list of Prime numbers from number 2 to 1 million.
	 * Try the best solution as possible.Which will take less CPU life cycle.
	 * Out put number of Prime numbers on the given range.
	 *
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 */
	public static void main(String[] args) {
		System.out.println(primeNumbers(2, 1000000));
	}

	public static ArrayList<Integer> primeNumbers(int start, int end) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int n = start; n < end; n++) {
			boolean prime = true;
			int i = 2;
			while (i <= n / 2) {
				if (n % i == 0) {
					prime = false;
					break;
				}
				i++;
			}
			if (prime) {
				primes.add(n);
			}

		}

		return primes;
	}

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
	  /*connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_primeNumber", "column_sortingNumber");

	List<String> primeNumber = connectToSqlDB.readDataBase("tbl_primeNumber", "sortingNumbers");

		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for (String st : primeNumber) {
			System.out.println(st+" ");*/
		}

