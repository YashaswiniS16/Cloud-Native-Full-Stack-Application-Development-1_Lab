package lab4_designpatterns4;


interface mediaplayer{
	public void play(String audioType,String filename);
	
	
}
interface Advancemediaplayer{
	public void playmp4(String filename);
	public void playvlc(String filename);
}
class vlcplayer implements Advancemediaplayer{
	
	
	public void playvlc(String filename)
	{
		System.out.println("Filename = "+ filename);
		
	}
	public void playmp4(String filname) {
		
		}

	
}


class mp4player implements Advancemediaplayer{
	
	
	public void playmp4(String filename)
	{
		System.out.println("Filename = "+filename);
		
	}

	public void playvlc(String filename)
	{
		
		
	}
}

 class mediaAdapter implements mediaplayer{
	private Advancemediaplayer mp;
	
	public mediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("mp4")) {
			mp =new mp4player();
			
		}else if(audioType.equalsIgnoreCase("vlc")) {
			mp =new vlcplayer();
			
	}
	}
	public void play(String audioType,String filename) {
		if (audioType.equalsIgnoreCase("mp4")) {
			mp.playmp4(filename);
		}
		else if (audioType.equalsIgnoreCase("vlc")){
			mp.playvlc(filename);
		}
	
}
 }
public class designPatterns{
		 public static void main(String args[]) {
			 System.out.println("Advancemediaplayer");
			 Advancemediaplayer a=new vlcplayer();
			 a.playvlc("h1.vlc");
			 Advancemediaplayer a2=new mp4player();
			 a2.playmp4("h2.mp4");
			 System.out.println("MediaAdapter");
			 mediaplayer mp=new mediaAdapter("mp4");
			 
			 mp.play("mp4","testmp4");
			 mediaplayer vlc=new mediaAdapter("vlc");
			 vlc.play("vlc","testvlc");
		 }
			 
	}
