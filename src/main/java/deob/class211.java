package deob;

@ObfuscatedName("hv")
public class class211 extends class195 {

    @ObfuscatedName("hv.e")
    public final int field2585;

    @ObfuscatedName("hv.o")
    public final int field2587;

    @ObfuscatedName("hv.m")
    public final int[] field2584;

    @ObfuscatedName("hv.g")
    public final int[] field2582;

    public class211(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2585 = arg0;
        this.field2587 = arg1;
        this.field2584 = arg2;
        this.field2582 = arg3;
    }

    @ObfuscatedName("hv.e(III)Z")
    public boolean method3586(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2582.length) {
            int var3 = this.field2582[arg1];
            if (arg0 >= var3 && arg0 <= this.field2584[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
