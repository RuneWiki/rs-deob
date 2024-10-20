package deob;

@ObfuscatedName("fz")
public class class176 extends class205 {

    @ObfuscatedName("fz.a")
    public final int field2902;

    @ObfuscatedName("fz.w")
    public final int field2901;

    @ObfuscatedName("fz.d")
    public final int[] field2900;

    @ObfuscatedName("fz.c")
    public final int[] field2903;

    public class176(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2902 = arg0;
        this.field2901 = arg1;
        this.field2900 = arg2;
        this.field2903 = arg3;
    }

    @ObfuscatedName("fz.a(III)Z")
    public boolean method3303(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2903.length) {
            int var3 = this.field2903[arg1];
            if (arg0 >= var3 && arg0 <= this.field2900[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
