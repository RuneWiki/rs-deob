package deob;

@ObfuscatedName("fv")
public class class176 extends class205 {

    @ObfuscatedName("fv.t")
    public final int field2919;

    @ObfuscatedName("fv.i")
    public final int field2918;

    @ObfuscatedName("fv.g")
    public final int[] field2923;

    @ObfuscatedName("fv.h")
    public final int[] field2921;

    public class176(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2919 = arg0;
        this.field2918 = arg1;
        this.field2923 = arg2;
        this.field2921 = arg3;
    }

    @ObfuscatedName("fv.t(III)Z")
    public boolean method3186(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2921.length) {
            int var3 = this.field2921[arg1];
            if (arg0 >= var3 && arg0 <= this.field2923[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
