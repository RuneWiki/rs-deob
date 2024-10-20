package deob;

@ObfuscatedName("fc")
public class class176 extends class205 {

    @ObfuscatedName("fc.f")
    public final int field2901;

    @ObfuscatedName("fc.u")
    public final int field2902;

    @ObfuscatedName("fc.x")
    public final int[] field2900;

    @ObfuscatedName("fc.b")
    public final int[] field2899;

    public class176(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2901 = arg0;
        this.field2902 = arg1;
        this.field2900 = arg2;
        this.field2899 = arg3;
    }

    @ObfuscatedName("fc.f(IIB)Z")
    public boolean method3244(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2899.length) {
            int var3 = this.field2899[arg1];
            if (arg0 >= var3 && arg0 <= this.field2900[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
