/**
 *
 * @author Nadia
 */
public class PanjangC
{
private static Integer countLengthC(int xa1, int xa2, int xb1, int xb2)
{
    int panjang_c = 0;
    if (xa1 >= xa2 || xb1 >= xb2){
    return null; // value tidak sesuai
}
    if (xb1 > xa1){
        panjang_c = xa2 - xb1;
    if (xb2 < xa2){
        panjang_c -= xa2 - xb2; // countLengthC(0, 4, 2, 6);
    }
    }
// reverse countLengthC
    else{
        panjang_c = xb2 - xa1;
	if (xa2 < xb2){
	panjang_c -= xb2 - xa2;
	}
	}
    return panjang_c;
}
    public static void main(String[]args){
    Integer length = countLengthC(0, 4, 2, 6); // bilangan bulat >= 0
    if (length == null){
        System.out.println("value tidak sesuai");
    }else if (length > 0){
	System.out.println("panjang garis C " + length);
	}else if (length <= 0){
        System.out.println("A dan B tidak berhimpitan dengan jarak " + (length * -1));
	}
	}

}
