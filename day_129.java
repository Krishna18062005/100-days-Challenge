import java.util.*;

public class Main {
  ///2020 land bought-5lk
///2024 --> Land Price Increase by 15%;
///what is the LAND prize in past 100 years...
    public static void main(String[] args) {
      int prize= 500000;
      int year=2020;
      while(year>1900){
      int $Prize=prize/115*100;
      System.out.println(year+" land prize is "+$Prize+" decreased by "+(prize-$Prize));
      prize=$Prize;
      year-=4;
      }
      
  }
}
// Output...
// 2020 land prize is 434700 decreased by 65300
// 2016 land prize is 378000 decreased by 56700
// 2012 land prize is 328600 decreased by 49400
// 2008 land prize is 285700 decreased by 42900
// 2004 land prize is 248400 decreased by 37300
// 2000 land prize is 216000 decreased by 32400
// 1996 land prize is 187800 decreased by 28200
// 1992 land prize is 163300 decreased by 24500
// 1988 land prize is 142000 decreased by 21300
// 1984 land prize is 123400 decreased by 18600
// 1980 land prize is 107300 decreased by 16100
// 1976 land prize is 93300 decreased by 14000
// 1972 land prize is 81100 decreased by 12200
// 1968 land prize is 70500 decreased by 10600
// 1964 land prize is 61300 decreased by 9200
// 1960 land prize is 53300 decreased by 8000
// 1956 land prize is 46300 decreased by 7000
// 1952 land prize is 40200 decreased by 6100
// 1948 land prize is 34900 decreased by 5300
// 1944 land prize is 30300 decreased by 4600
// 1940 land prize is 26300 decreased by 4000
// 1936 land prize is 22800 decreased by 3500
// 1932 land prize is 19800 decreased by 3000
// 1928 land prize is 17200 decreased by 2600
// 1924 land prize is 14900 decreased by 2300
// 1920 land prize is 12900 decreased by 2000
// 1916 land prize is 11200 decreased by 1700
// 1912 land prize is 9700 decreased by 1500
// 1908 land prize is 8400 decreased by 1300
// 1904 land prize is 7300 decreased by 1100
