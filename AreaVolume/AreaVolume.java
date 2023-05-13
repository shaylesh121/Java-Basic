
package areavolume;
    class area{
        int l,b,h;
        
        area(int x, int y, int z){
            l=x;
            b=y;
            h=z;
        }
        public float area(){
            return l*b;
        }
    }
    class volume extends area{
        volume(int x, int y, int z){
            super(x,y,z);
        }
        public float volume(){
            float volume;
            volume=(l*b*h);
            return volume;
        }
    }
        

public class AreaVolume {

    
    public static void main(String[] args) {
        volume obj = new volume(8,4,7);
        System.out.println("Area="+obj.area());
        System.out.println("Volume="+obj.volume());
    }
    
}
