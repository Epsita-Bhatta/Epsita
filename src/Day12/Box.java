package Day12;

public class Box {
double width,depth ,height;
	Box(){
		width=height=depth=0;
		
	}
	Box(double w,double h,double d){
		width=w;
		depth =d;
		height=h;
		
	}
	Box(double len){
		width=height=depth=len;
	}
	double volume() {
		return width*height*depth;
	}
}
