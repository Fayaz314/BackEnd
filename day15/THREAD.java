package day15;

public class THREAD {
	public void run()
	{
		System.out.println("this thread is internaly called by start/run");
	}



	
	
	public static void main(String[] args) {
	for(int i=0;i<=5;i++)
	{
		System.out.println("Im main thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	

	}

	}
