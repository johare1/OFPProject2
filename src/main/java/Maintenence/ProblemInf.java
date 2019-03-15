package Maintenence;

//problem implementation

public interface ProblemInf {

	public String toString();

	public String getInfo();

	public int getProblemRate();

	public int getDowntime();

	public void setInfo(String info);

	public void setProblemRate(int problemRate);

	public void setDowntime(int downtime);
}

