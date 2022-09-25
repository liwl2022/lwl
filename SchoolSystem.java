/*package 项目版本管理;

import java.util.ArrayList;

//报名入学接口
interface ISignUp{
  // 打印输出结果
  public void print();
  // 检查是否有 stuType对应的班级名额
  // 如果没有剩余名额，请返回 false ，否则学生将报名进入该班级并返回 true
  public boolean addStudent (int stuType);
  // 解析命令行输入的参数（格式），如文档描述
  public static IParams parse() throws Exception{
	try {
		String[] parse(String input) 
	}
  }
}
interface IParams {
  // 获取大班名额
  public int getBig();
  // 获取中班名额
  public int getMedium();
  // 获取小班名额
  public int getSmall();
  // 获取入学序列，例如 [1 2 2 3] 表示 依次报名入学一名大班学生，中班学生，中班学生，小班学生
  public ArrayList<Integer> getPlanSignUp ();

public class SchoolSystem implements ISignUp {
	private Integer big;
	private Integer medium;
	private Integer smal;
	//打印出结果
	public void print() {
		
	}
	//初始化各个班的名额
	public SchoolSystem(Integer big, Integer medium, Integer smal) {
		this.big = big;
		this.medium = medium;
		this.smal = smal;
		
	}

	
	public static void main(String[] args) throws Exception {
      IParams params = ISignUp.parse();//SchoolSystem.parse();
      SchoolSystem sc = new SchoolSystem (params.getBig(), params.getMedium(),params.getSmall());
      ArrayList<Integer> plan = params. getPlanSignUp ();
      for (int i = 0; i < plan.size(); i++) {
          sc. addStudent (plan.get(i));
      }
      sc.print();
	}
	// 检查是否有 stuType对应的班级名额
	// 如果没有剩余名额，请返回 false ，否则学生将报名进入该班级并返回 true

	public boolean addStudent(int stuType) {
		if(stuType==1||stuType==2||stuType==3) {
			if(stuType == 1){
				if(big != 0) {
					return true;
				}else return false;
			}
			if(stuType == 2){
				if(medium != 0) {
					return true;
				}else return false;
			}
			if(stuType == 3){
				if(medium != 0) {
					return true;
				}else return false;
			}
		}
		return false;
	}

	}

}
*/