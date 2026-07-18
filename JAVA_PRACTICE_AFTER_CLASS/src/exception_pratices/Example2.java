package exception_pratices;

class Example2 {
   public static String s;

	public static void main(String[] args) {
                try {
                    s = null;
                    System.out.println(s.length());
                    /**int[] numbers = {10, 20, 30}; // Length is 3 (Valid indices: 0, 1, 2)
                    // WRONG: i <= numbers.length will look for index 3
                    for (int i = 0; i <= numbers.length; i++) {
                        System.out.println(numbers[i]); // Throws exception_pratices when i = 3
                    }*/
                    
                }
                catch (ArithmeticException e) {
                    System.out.println("Arithmetic Exception");
                }
              /**  catch (NullPointerException e) {
                    System.out.println("Null Pointer Exception");
                }*/
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ArrayIndexOutOfBoundsException");
                }
                /**
                catch (Exception e) {
                    System.out.println("General Exception");
                }*/
            }
        }
