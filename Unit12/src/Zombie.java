
import static java.lang.System.*; 

	public class Zombie implements Monster
	{
		//add instance variables	
		private String name;
		private int size;

		//add a constructor
		public Zombie (String n, int s) {
			name = n;
			size = s;
		}

		//add code to implement the Monster interface
		public int getHowBig() {
			return this.size;
		}
		
		public String getName() {
			return this.name;
		}
		
		public boolean isBigger(Monster other) {
			return (other.getHowBig() < this.size);
		}
		
		public boolean isSmaller(Monster other) {
			return (other.getHowBig() > this.size);
		}
		
		public boolean namesTheSame(Monster other) {
			return (name.equals(other.getName()));
		}

		//add a toString
		public String toString() {
			return name + " " + size;
		}
	}

