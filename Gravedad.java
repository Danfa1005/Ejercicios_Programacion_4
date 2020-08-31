
public class Gravedad {
	private static final int PI = 0;
	final float gravedad = (float) 1.1;
	final float frict = (float) 0.9999;

	Pendulo p1, p2;

	final int cx = 700, cy = 700;
	int anchorX, anchorY;
	boolean draw = false;

	PGraphics pg;
	float old_x, old_y;

	void settings(){
	  size(cx, cy);
	  int width = 0;
	anchorX = width/2;
	  int height = 0;
	anchorY = height/2;
	}

	private void size(int cx2, int cy2) {
		
	}

	void setup(){
	  // Crear péndulos
	  p1 = new Pendulo(150, 25, random(0, 2*PI));
	  p2 = new Pendulo(150, 25, random(0, 2*PI));
	 
	  stroke(0);
	  fill(0);
	   
	  pg = createGraphics(cx, cy); 
	  pg.beginDraw();
	  pg.background(255);
	  pg.strokeWeight(1);
	  pg.strokeWeight(150);
	  pg.endDraw();
	  
	   draw = false;
	}

	private PGraphics createGraphics(int cx2, int cy2) {
		return null;
	}

	private void fill(int i) {
		
	}

	private void stroke(int i) {
		
	}

	private float random(int i, int j) {
		return 0;
	}

	void draw(){
	 background(255);
	 image(pg, 0, 0);
	 
	 //Mover al punto de anclaje
	 translate(anchorX, anchorY);

	 // Calcular aceleración de péndulos
	 float calculo = (-gravedad * (2*p1.masa + p2.masa) * sin(p1.angulo) -
	   p2.masa * gravedad * sin(p1.angulo - 2*p2.angulo) - 2 * sin(p1.angulo - p2.angulo) * 
	   p2.masa * (p2.vel * p2.vel * p2.cuerda + p1.vel * p1.vel * p1.cuerda * cos(p1.angulo - p2.angulo)))
	   / (p1.cuerda * (2*p1.masa + p2.masa - p2.masa * cos(2*p1.angulo - 2*p2.angulo))); 
	   
	 float calculo2 = 2 * sin(p1.angulo - p2.angulo) * ( p1.vel * p1.vel * p1.cuerda * (p1.masa + p2.masa)
	   + gravedad * (p1.masa + p2.masa) * cos(p1.angulo) + p2.vel * p2.vel * p2.cuerda * p2.masa * cos(p1.angulo - p2.angulo))
	   / (p2.cuerda * (2*p1.masa + p2.masa - p2.masa * cos(2*p1.angulo - 2*p2.angulo)));
	   
	  // Acelerar y dibujar
	  p1.acelerar(calculo, frict);
	  p2.acelerar(calculo2, frict);
	  p1.dibujar();
	  p2.dibujar(p1.x, p1.y);
	  
	  //Dibujar línea de trazo
	  float drawX = p2.x + p1.x + anchorX;
	  float drawY = p2.y + p1.y + anchorY;
	  pg.beginDraw();
	  if(draw){
	    pg.line(old_x, old_y, drawX, drawY);
	  } else draw = true;
	  pg.endDraw();
	  old_x = drawX;
	  old_y = drawY;
	  
	}

	private float cos(float f) {
		return 0;
	}

	private float sin(float angulo) {
		return 0;
	}

	private void translate(int anchorX2, int anchorY2) {
		
	}

	private void image(PGraphics pg2, int i, int j) {
		
	}

	private void background(int i) {
		
	}

	void mouseClicked(){
	  setup();
	}
}
