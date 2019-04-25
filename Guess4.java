class Guess4{
public static void main(String args[])
 throws java.io.IOException {
char ch, ignore, answer='k';
do {
System.out.println("i am thinking of a letter between A and Z.");
System.out.println("can you guess it:");
ch= (char) System.in.read();
do {
ignore= (char) System.in.read();
}
while (ignore !='\n');
if (ch==answer)
System.out.println("** right **");
else {
System.out.println("...  sorry ..");
if (ch<answer)
System.out.println("too low");
else
System.out.println("too high");
System.out.println("try again!\n");
}
} while (answer !=ch);
}
}