class num {
public static void main (String args[]){

int num[] [] = new int [5] [];
num[0] = new int [9];
num[1] = new int [9];
num[2] = new int [9];
num[3] = new int [5];
num[4] = new int [5];
int i, j;
for(i=0;i<3;i++)
for(j=0;j<9;j++)
num[i] [j] = i+j+6;
for(i=3;i<5;i++)
for(j=0;j<5;j++)
num[i] [j] = i+j+6;
System.out.println("per trip during five days:");
for(i=0;i<3;i++){
for(j=0;j<9;j++)
System.out.println(" " + num[i] [j]);
System.out.println();
}
System.out.println("per trip on five days");
System.out.println();

for(i=3;i<5;i++){
for(j=0;j<5;j++)
System.out.println(" " + num[i] [j]);
System.out.println();
}
}
}