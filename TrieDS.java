import java.util.*;
class Node{
	HashMap<Character,Node> map=new HashMap<>();
	int ends=0;
}

class Trie{
	Node root;
	public Trie(){
		root=new Node();
	}

	public void insert(String word){
		int n=word.length();
		Node temp=root;
		for(int i=0;i<n;i++){
			if(!temp.map.containsKey(word.charAt(i))){
				temp.map.put(word.charAt(i),new Node());
			}
			temp=temp.map.get(word.charAt(i));
		}
		temp.ends+=1;
		//System.out.println(word+" "+temp.ends);
	}

	public boolean searchWord(String word){
		int n=word.length();
		Node temp=root;
		for(int i=0;i<n;i++){
			if(!temp.map.containsKey(word.charAt(i))){
				return false;
			}
			temp=temp.map.get(word.charAt(i));
		}
		if(temp!=null && temp.ends>0){
			return true;
		}
		return false;
	}

	public boolean searchPrefix(String word){
		int n=word.length();
		Node temp=root;
		for(int i=0;i<n;i++){
			if(!temp.map.containsKey(word.charAt(i))){
				return false;
			}
			temp=temp.map.get(word.charAt(i));
		}
		if(temp!=null){
			return true;
		}
		return false;
	}
}

public class TrieDS{
	public static void main(String[] args) {
		Trie test=new Trie();
		test.insert("abcd");
		test.insert("abcd");
		test.insert("abcde");
		test.insert("abcdef");
		test.insert("abcdf");
		test.insert("abcdefg");
		System.out.println(test.searchWord("abcdf"));
		System.out.println(test.searchWord("abcdfxd"));
		System.out.println(test.searchPrefix("abcd"));
		System.out.println(test.searchPrefix("abdefg"));
	}
}