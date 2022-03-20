package dependency;
import java.util.*;

//pembuatan class TV
class TV{
    private int size;
   
    TV(int size){
        this.size = size;
    }
    
    public void browseChannels(Antenna a){
        System.out.println(Arrays.toString(a.getAllChannels()));
    }
    
    public void pickRandomChannel(Antenna a){
        System.out.println(a.getRandomChannel());
    }
}

//tv memiliki dependency terhadap antenna
class Antenna{
    String[] channels;
    Antenna(String[] channels){
        this.channels = channels;
    }
    
    public String[] getAllChannels(){
        return channels;
    }
    
    public String getRandomChannel(){
        int rnd = new Random().nextInt(channels.length);
        return channels[rnd];
    }
}

public class Dependency {

    public static void main(String[] args) {
        Antenna a = new Antenna(new String[]{"RCTI", "GTV", "SCTV", "NET.", "MNC TV", "TV ONE"});
        TV tv = new TV(23);
        tv.browseChannels(a);
        tv.pickRandomChannel(a);
    }
    
}

/*
Jawaban:
Dependency adalah suatu relationship dimana suatu instance menerima reference terhadap
class tertentu untuk menggunakan operasinya

Pada kasus ini, TV memerluhan channel dari antenna
*/