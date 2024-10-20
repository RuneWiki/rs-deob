package deob;

@ObfuscatedName("fh")
public class class166 extends class195 {

    @ObfuscatedName("fh.b")
    public final int field2780;

    @ObfuscatedName("fh.e")
    public final int field2779;

    @ObfuscatedName("fh.a")
    public final int[] field2782;

    @ObfuscatedName("fh.k")
    public final int[] field2783;

    @ObfuscatedName("fh.p")
    public final int field2781;

    public class166(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2780 = arg0;
        this.field2779 = arg1;
        this.field2782 = arg2;
        this.field2783 = arg3;
        this.field2781 = arg4;
    }

    @ObfuscatedName("fh.b(IIB)Z")
    public boolean method2995(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2783.length) {
            int var3 = this.field2783[arg1];
            if (arg0 >= var3 && arg0 <= this.field2782[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
