
public class Shape {
	private static int count=0;
	private int w,h,r,type=0,a,b;
private float angle;
public Shape(int w1,int h1){
	w=w1;h=h1;type=1;count++;
	
}
public Shape(int r1){
	type=2;r=r1;count++;
}
public Shape(int a1,int  b1,float angle1 ){
	a=a1;b=b1;angle=angle1;type=3;count++;
}
public float getPerimeter(){
	float answer = 0.0f;
	switch(type){
	case 1:
		answer = 2*w+2*h;
		break;
	case 2:
		answer=2*3.1415926f;//TODO 2
		break;
	case 3:
		answer=0;//TODO 3
		break;
	}
	return answer;
}
public float getArea(){
	float AREA = 0.0f;
	switch(type){
	case 1:
		AREA=0;//TODO 1
		break;
	case 2:
		AREA=2*3.1415926f;//TODO 2
		break;
	case 3:
		AREA=0;//TODO 3
	
	}
	return AREA;
}

}
