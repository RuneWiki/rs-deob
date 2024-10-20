package deob;

@ObfuscatedName("hu")
public class class211 extends class195 {

    @ObfuscatedName("hu.d")
    public final int field2616;

    @ObfuscatedName("hu.k")
    public final int field2612;

    @ObfuscatedName("hu.e")
    public final int[] field2614;

    @ObfuscatedName("hu.p")
    public final int[] field2617;

    public class211(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2616 = arg0;
        this.field2612 = arg1;
        this.field2614 = arg2;
        this.field2617 = arg3;
    }

    @ObfuscatedName("hu.d(IIB)Z")
    public boolean method3709(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2617.length) {
            int var3 = this.field2617[arg1];
            if (arg0 >= var3 && arg0 <= this.field2614[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
