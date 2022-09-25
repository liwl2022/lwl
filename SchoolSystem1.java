package 项目版本管理;

interface ISignUp{
     public void print();
     public boolean addStudent (int stuType);     
}
interface IParams {
     public int getBig();
     public int getMedium();
     public int getSmall();
}
public class SchoolSystem1 implements ISignUp {
 int big;
 int medium;
 int small;
 String[]p;
 public void parse(String input) {
  String regex="\\D+";
  String parse[]=input.split(regex);
  p=new String[parse.length];
  for(int i=0;i<parse.length;i++) {
   if(parse[i]!=null)
   this.p[i]=parse[i];
  }
 }
 SchoolSystem1(int big, int medium, int small){
  this.big=big;
  this.medium=medium;
  this.small=small;
 }
 public void print() {
  String str="[";
  String o="\\d{2,}";
  String t="\\d{1}";
  for(int i=0;i<p.length;i++) {
   if(p[i]!=null) {
    if(p[i].matches(o)==true) {
    str +="null, ";
    }
    if(p[i].matches(t)==true) {
     int x;
     x=Integer.parseInt(p[i]);
     if(this.addStudent(x)==true)
      str +="true, ";
     else 
      str +="false, ";
    }
   }
  }
  System.out.println(str+"]");
 }
 public boolean addStudent(int stuType) {
  if(stuType==1) {
   if(this.big>0) {
    this.big-=1;
    return true;
   }else
    return false;
  }
  if(stuType==2) {
   if(this.medium>0) {
    this.medium-=1;
    return true;
   }else
    return false;
  }
  if(stuType==3) {
   if(this.small>0) {
    this.small-=1;
    return true;
   }else
    return false;
  }
  return false;
 }
 public static void main(String[] args) throws Exception {
   SchoolSystem1 sc = new SchoolSystem1 (1,2,1);
         sc.parse("add[1],add[1],add[2],add[3]");
         sc.print();
         
 }
}