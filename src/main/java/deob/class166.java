package deob;

@ObfuscatedName("fa")
public class class166 extends class195 {

    @ObfuscatedName("fa.n")
    public final int field2802;

    @ObfuscatedName("fa.o")
    public final int field2801;

    @ObfuscatedName("fa.a")
    public final int[] field2804;

    @ObfuscatedName("fa.w")
    public final int[] field2803;

    @ObfuscatedName("fa.m")
    public final int field2806;

    public class166(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2802 = arg0;
        this.field2801 = arg1;
        this.field2804 = arg2;
        this.field2803 = arg3;
        this.field2806 = arg4;
    }

    @ObfuscatedName("fa.n(III)Z")
    public boolean method3105(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2803.length) {
            int var3 = this.field2803[arg1];
            if (arg0 >= var3 && arg0 <= this.field2804[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
