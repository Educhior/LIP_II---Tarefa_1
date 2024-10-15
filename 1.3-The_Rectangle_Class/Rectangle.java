public class Rectangle {
   // Atributos - são definidos como variáveis privadas para garantir o encapsulamento.
   private float length;
   private float width;

   // Construtor padrão - O construtor padrão inicializa ambos os valores para 1.0f. O segundo construtor permite que você crie um objeto Rectangle com dimensões específicas
   public Rectangle() {
      this.length = 1.0f;
      this.width = 1.0f;
   }

   // Construtor com parâmetros -  São métodos públicos que permitem obter e modificar os valores de length e width
   public Rectangle(float length, float width) {
      this.length = length;
      this.width = width;
   }

   // Getters - retorna o valor de length e width
   public float getLength() {
      return length;
   }

   public float getWidth() {
      return width;
   }

   // Setters - define o valor de length e width
   public void setLength(float length) {
      this.length = length;
   }

   public void setWidth(float width) {
      this.width = width;
   }

   // Método para calcular a área - retorna a área do retângulo
   public float getArea() {
      return length * width;
   }

   // Método para calcular o perímetro - retorna o perímetro do retângulo
   public float getPerimeter() {
      return 2 * (length + width);
   }

   // Método toString - retorna uma representação de string do objeto Rectangle
   @Override
   public String toString() {
      return "Rectangle[length=" + length + ",width=" + width + "]";
   }
}
