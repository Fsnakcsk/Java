import java.util.*;

class StringArray extends ArrayList<String>
{
	StringArray() {
		super();
	}
	StringArray(int n) {
		super();
		for (int i = 0; i < n; i++) 
			add(null);
	}
	StringArray(StringArray sa) {
		// AarrayList 복사할 때 Iterator Class를 많이 사용함, 네널리클레스이라서 Iterator<String>명시해야 함.

		Iterator<String> iterator = sa.iterator();
			while(iterator.hasNext()) {
				add(iterator.next());
			}
	} 
	void readDataFromConsole()
	{
		String buffer;

		for(int i = 0; i < size(); i++) {
			System.out.print((i+1) + "번째 이름은: ");
			buffer = System.console().readLine();
			set(i,buffer);
		}
	}
	public String toString()
	{
		String tmp = "";
		for(int i = 0; i < size(); i++) {
			tmp = tmp + get(i) + "\n";
		}
		return tmp; 
	}
}


