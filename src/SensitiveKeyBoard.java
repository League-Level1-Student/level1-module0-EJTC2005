
public class SensitiveKeyBoard {
	if(){}
	void speak("ouch");
	


static void speak(String Words){
	try{Runtime.getRuntime().exec("say " + Words).waitFor();
    } catch (Exception e) {
        e.printStackTrace();
        }
   }
}