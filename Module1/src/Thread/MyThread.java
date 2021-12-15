package Thread;

public class MyThread implements Runnable{
public void run() {
	System.out.println("thread running");
}

public static void main(String[] args)
{
	MyThread threadEX=new MyThread();
	Thread tread=new Thread(threadEX);
	tread.start();
}
}
