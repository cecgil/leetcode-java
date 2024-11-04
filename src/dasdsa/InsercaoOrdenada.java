package dasdsa;

public class InsercaoOrdenada {
	
	public static void main(String[] args) {
		char[] a = new char[]{'b', 'a', 'c'};
		
		int n = a.length;
		
		for (int i = 1; i < n; i ++ ) {
			char cur = a[i];
			int j = i - 1;
			while ((j >= 0) && (a[j] > cur)) {
				a[j+1] = a[j--];
				a[j+1] = cur;
			}
		}
	}

}
