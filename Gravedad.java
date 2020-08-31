
class Pendulo {
		  private static final int PI = 0;
		float angulo, cuerda, masa, vel, x, y;
		  
		  Pendulo(){
		   this(200, 10, PI/4);
		  }
		  
		  Pendulo(float r1, float m1, float a1){
		    cuerda = r1;
		    masa = m1;
		    angulo = a1;
		    acelerar(0, 1);
		  }
		   
		  void acelerar(float accel, float frict){
		    vel += accel;
		    angulo += vel;
		    vel *= frict;
		    x = cuerda * sin(angulo);
		    y = cuerda * cos(angulo);
		  }
		  
		  
		  
		  private float cos(float angulo2) {
			// TODO Auto-generated method stub
			return 0;
		}

		private float sin(float angulo2) {
			// TODO Auto-generated method stub
			return 0;
		}

		void dibujar(float x_off, float y_off){
		    line(x_off, y_off, x + x_off, y + y_off);
		    ellipse(x + x_off, y + y_off, 5*log(masa), 5*log(masa));
		  }
		  
		  private void ellipse(float f, float g, int i, int j) {
			// TODO Auto-generated method stub
			
		}

		private int log(float masa2) {
			// TODO Auto-generated method stub
			return 0;
		}

		private void line(float x_off, float y_off, float f, float g) {
			// TODO Auto-generated method stub
			
		}

		void dibujar(){
		     dibujar(0, 0); 
		  }
		  
		}
