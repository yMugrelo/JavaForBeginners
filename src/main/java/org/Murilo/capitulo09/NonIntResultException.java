package org.Murilo.capitulo09;

class NonIntResultException extends Exception{
    int n;
    int d;

    NonIntResultException(int i, int j){
        n = i;
        d = j;
    }
    public String toString(){
        return "Result of" + n + " / " + d + " is non-integer.";
    }

    class CustomExceptDemo{
        static void main(String[] args) {
            int numer[] = { 4, 8, 15, 32, 64, 127, 256, 512 };
            int denom[] = { 2, 0, 4, 4, 0, 8 };

            for(int i = 0; i < numer.length; i++){
                try{
                    if((numer[i]%2) != 0){
                        throw new NonIntResultException(numer[i], denom[i]);
                    }
                }catch(ArithmeticException e){
                    System.out.println("Can't divide by zero");
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println(e.getMessage());
                }
                catch(NonIntResultException e){
                    System.out.println(e.getMessage());
                }
            }

        }
    }
}
