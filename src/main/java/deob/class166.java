package deob;

@ObfuscatedName("fv")
public class class166 extends class195 {

    @ObfuscatedName("fv.o")
    public final int field2783;

    @ObfuscatedName("fv.l")
    public final int field2782;

    @ObfuscatedName("fv.g")
    public final int[] field2778;

    @ObfuscatedName("fv.u")
    public final int[] field2777;

    @ObfuscatedName("fv.q")
    public final int field2780;

    public class166(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2783 = arg0;
        this.field2782 = arg1;
        this.field2778 = arg2;
        this.field2777 = arg3;
        this.field2780 = arg4;
    }

    @ObfuscatedName("fv.o(III)Z")
    public boolean method3113(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2777.length) {
            int var3 = this.field2777[arg1];
            if (arg0 >= var3 && arg0 <= this.field2778[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
