package mio;


/*
 *
 .-'------------------------------|----.
/  |  [_]  [_]  [_]   [_]   [O]   [|]    \
|  | > FE EN DIOS Y A FONDO > ====[OO]   |
'--'----(O)-------------------(O)--------'
 * */
public class Bus {
	
	private String color;
	private String l1;
	private String l2;
	private String l3;
	private String l4;
	
		Bus(String color){
			this.color = color;
			this.l1 = color + ".-'---------------------------|--.";
			this.l2 = color + "/ | [_]  [_] [_]  [_]  [O]   [|]  \\";
			this.l3 = color + "| | > FE EN DIOS Y A FONDO > =[OO] |";
			this.l4 = color + "'--'---(O)---------------(O)------'";
		}
		

		public void alanteL1(){
			this.l1 = " " + l1;
		}
		public void alanteL2(){
			this.l2 = " " + l2;
		}
		public void alanteL3(){
			this.l3 = " " + l3;
		}
		public void alanteL4(){
			this.l4 = " " + l4;
		}
		public void alanteBus() {
			alanteL1();
			alanteL2();
			alanteL3();
			alanteL4();
		}
		
		public String getL1() {
			return l1;
		}


		public void setL1(String l1) {
			this.l1 = l1;
		}


		public String getL2() {
			return l2;
		}


		public void setL2(String l2) {
			this.l2 = l2;
		}


		public String getL3() {
			return l3;
		}


		public void setL3(String l3) {
			this.l3 = l3;
		}


		public String getL4() {
			return l4;
		}


		public void setL4(String l4) {
			this.l4 = l4;
		}


		@Override
		public String toString() {
			return getL1() + "\n" + getL2() + "\n" + getL3() + "\n"+ getL4();
			
		}
}
