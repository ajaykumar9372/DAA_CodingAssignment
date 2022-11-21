import java.util.Scanner;

public class BoyerMoore{

static int chars=100;

static int max(int x, int y)
{
    return (x>y)? x: y;
}

static void badCharHeuristic(char []st,int size, int badChar[] ){
for(int i=0; i<chars; i++){
    badChar[i]= -1;
}

for(int i=0; i<size; i++){
badChar[(int) st[i]]=i;

}
}

static void search(char txt[], char pattern[]){
int m=pattern.length;
int n=txt.length;


int badchar[] =new int[chars];


badCharHeuristic(pattern, m, badchar);

int s=0;


while(s<= (n-m))
{

    int j=m-1;


while(j>=0 && pattern[j]==txt[s+j])
j--;



if(j<0)
{

System.out.println("Pattern occur at position = "+s);



s+= (s+m<n)? m-badchar[txt[s+m]]: 1;
}
else
s +=max(1, j- badchar[txt[s+j]]);






}



}






public static void main(String[] args) {


    Scanner sc= new Scanner(System.in);
System.out.println("Enter the text in Capital");
char text[]=sc.nextLine().toCharArray();
System.out.println("Enter the pattern in Capital");
char pattern[]=sc.nextLine().toCharArray();


    search(text, pattern);
 sc.close();
}
}

