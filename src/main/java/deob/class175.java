package deob;

@ObfuscatedName("fm")
public class class175 extends class204 {

    @ObfuscatedName("fm.v")
    public final int field2902;

    @ObfuscatedName("fm.f")
    public final int field2899;

    @ObfuscatedName("fm.i")
    public final int[] field2900;

    @ObfuscatedName("fm.d")
    public final int[] field2901;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2902 = arg0;
        this.field2899 = arg1;
        this.field2900 = arg2;
        this.field2901 = arg3;
    }

    @ObfuscatedName("fm.v(III)Z")
    public boolean method3217(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2901.length) {
            int var3 = this.field2901[arg1];
            if (arg0 >= var3 && arg0 <= this.field2900[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
