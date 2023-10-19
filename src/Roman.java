import java.util.HashMap;

public class Roman {
    public String convert(int number) {
        var result = "";
        var romanNumbers = initializeMap();
        String[] dividedNumbers = String.valueOf(number).split("");

        for (int i=0; i<dividedNumbers.length; i++){
            String aux = "";
            for (int j =i; j<dividedNumbers.length-1; j++){
                aux += "0";
            }
            if(Integer.parseInt(dividedNumbers[i])!=1&&Integer.parseInt(dividedNumbers[i])!=5){
                switch (Integer.parseInt(dividedNumbers[i])){
                    case 2:
                        result+= romanNumbers.get(Integer.parseInt("1"+aux));
                        result+= romanNumbers.get(Integer.parseInt("1"+aux));
                        break;
                    case 3:
                        result+= romanNumbers.get(Integer.parseInt("1"+aux));
                        result+= romanNumbers.get(Integer.parseInt("1"+aux));
                        result+= romanNumbers.get(Integer.parseInt("1"+aux));
                        break;
                    case 4:
                        result+= romanNumbers.get(Integer.parseInt("1"+aux));
                        result+= romanNumbers.get(Integer.parseInt("5"+aux));
                        break;
                    case 6:
                        result+= romanNumbers.get(Integer.parseInt("5"+aux));
                        result+= romanNumbers.get(Integer.parseInt("1"+aux));
                        break;
                    case 7:
                        result+= romanNumbers.get(Integer.parseInt("5"+aux));
                        result+= romanNumbers.get(Integer.parseInt("1"+aux));
                        result+= romanNumbers.get(Integer.parseInt("1"+aux));
                        break;
                    case 8:
                        result+= romanNumbers.get(Integer.parseInt("5"+aux));
                        result+= romanNumbers.get(Integer.parseInt("1"+aux));
                        result+= romanNumbers.get(Integer.parseInt("1"+aux));
                        result+= romanNumbers.get(Integer.parseInt("1"+aux));
                        break;
                    case 9:
                        result+= romanNumbers.get(Integer.parseInt("1"+aux));
                        result+= romanNumbers.get(Integer.parseInt("10"+aux));
                        break;
                    default:
                        result+="";

                }
            }else {
                result+= romanNumbers.get(Integer.parseInt(dividedNumbers[i]+aux));

            }
        }
        return result;
    }

    private HashMap<Integer, String> initializeMap() {
        var romanNumbers = new HashMap<Integer, String>();
        romanNumbers.put(1, "I");
        romanNumbers.put(5, "V");
        romanNumbers.put(10, "X");
        romanNumbers.put(50, "L");
        romanNumbers.put(100, "C");
        romanNumbers.put(500, "D");
        romanNumbers.put(1000, "M");

        return romanNumbers;
    }
}
