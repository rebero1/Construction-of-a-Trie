import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tree {

static  BinTree binTree;
	public static void main(String[] args) {

		binTree=new BinTree();
		try (BufferedReader br = new BufferedReader(new FileReader("file location"))) {
			String line;
			while ((line = br.readLine()) != null) {


				callfunc(line.replaceAll("\\s", ""));


			}
		} catch (IOException e) {


		}
	}


	private static void callfunc(String line){


		if(line.contains("insert")){

			line=  line.replace("insert","");
			binTree.insert(line);


		}
		else if(line.contains("print")){


			// call function print
		binTree.print();
		}
		else  if(line.contains("height")){


			// call a function height
			binTree.height();



		}
		else if(line.contains("search")){

			line=  line.replace("search","");
			binTree.search(line);
			// call a function search
		}
		else  if(line.contains("smallest")){

			line=  line.replace("insert","");
			binTree.smallest();


			// call a function
		} else if(line.contains("largest")){

			line=  line.replace("insert","");
binTree.largest();

			// call a function largest
		}
		else if (line.contains("size")){

			line=  line.replace("insert","");
			binTree.size();



			// call a function size
		}




	}
}