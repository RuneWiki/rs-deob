package deob;

@ObfuscatedName("kl")
public class class288 extends class406 {

    @ObfuscatedName("kl.s")
    public final int field3309;

    @ObfuscatedName("kl.h")
    public final int field3311;

    @ObfuscatedName("kl.w")
    public final int[] field3308;

    @ObfuscatedName("kl.v")
    public final int[] field3306;

    public class288(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3309 = arg0;
        this.field3311 = arg1;
        this.field3308 = arg2;
        this.field3306 = arg3;
    }

    @ObfuscatedName("kl.s(III)Z")
    public boolean method4896(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3306.length) {
            int var3 = this.field3306[arg1];
            if (arg0 >= var3 && arg0 <= this.field3308[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
