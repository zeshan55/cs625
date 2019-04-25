public class Break2 {
public static void main(String args[])
throws java.io.IOExecption
{
 char ch;
for( ; ; ) {
ch = (char)System.in.read();
if (ch=='q')break;
}
System.out.println("you pressed q!");
}
}













9