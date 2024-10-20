package deob;

@ObfuscatedName("fl")
public class class166 extends class195 {

    @ObfuscatedName("fl.n")
    public final int field2791;

    @ObfuscatedName("fl.w")
    public final int field2790;

    @ObfuscatedName("fl.i")
    public final int[] field2789;

    @ObfuscatedName("fl.e")
    public final int[] field2792;

    @ObfuscatedName("fl.h")
    public final int field2793;

    public class166(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2791 = arg0;
        this.field2790 = arg1;
        this.field2789 = arg2;
        this.field2792 = arg3;
        this.field2793 = arg4;
    }

    @ObfuscatedName("fl.n(III)Z")
    public boolean method3037(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2792.length) {
            int var3 = this.field2792[arg1];
            if (arg0 >= var3 && arg0 <= this.field2789[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
