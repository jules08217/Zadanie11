class Main {
  public static void main(String[] args) {
    int [][] m1 = new int [8][8];
    for(int i = 0; i < 8; i++){
      for(int j = 0; j < 8;j++){
        if ((i + j) % 2 == 0) m1[i][j] = 1;
        else m1[i][j] = 0;
        System.out.print(m1[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    int [][] m2 = new int [10][10]; 
    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 10; j++){
        m2[i][j] = (int)(Math.random()*100);
        System.out.print(m2[i][j] + "  ");
      } 
      System.out.println();
    }
    String str = "";
    for(int o = 0; o < 10; o++){
      int s = 0;   
      for(int p = 0; p < 10;p++){
        s += m2[o][p];
      }
      int g = o+1;
      str += "Строка: " + g + " Сумма: " + s + "\n";  
    }
    System.out.print(str);
    System.out.println();
    
    String str2 = "Просты числа: ";
    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 10; j++){
        boolean c = true;
        if(m2[i][j] > 1){
        for(int d = 2; d <= m2[i][j]/d; d++){
          if(m2[i][j]%d==0) c = false;
        }
        if (c == true) str2 = str2 + m2[i][j] + " ";
        }
      } 
    }
    System.out.print(str2);
  }
}