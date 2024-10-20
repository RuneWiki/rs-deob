package deob;

@ObfuscatedName("kp")
public class class287 extends class405 {

    @ObfuscatedName("kp.c")
    public final int field3321;

    @ObfuscatedName("kp.v")
    public final int field3317;

    @ObfuscatedName("kp.q")
    public final int[] field3316;

    @ObfuscatedName("kp.f")
    public final int[] field3318;

    public class287(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3321 = arg0;
        this.field3317 = arg1;
        this.field3316 = arg2;
        this.field3318 = arg3;
    }

    @ObfuscatedName("kp.c(III)Z")
    public boolean method4990(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3318.length) {
            int var3 = this.field3318[arg1];
            if (arg0 >= var3 && arg0 <= this.field3316[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
