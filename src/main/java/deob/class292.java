package deob;

@ObfuscatedName("kl")
public class class292 extends class425 {

    @ObfuscatedName("kl.a")
    public final int field3385;

    @ObfuscatedName("kl.f")
    public final int field3383;

    @ObfuscatedName("kl.c")
    public final int[] field3384;

    @ObfuscatedName("kl.x")
    public final int[] field3382;

    public class292(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3385 = arg0;
        this.field3383 = arg1;
        this.field3384 = arg2;
        this.field3382 = arg3;
    }

    @ObfuscatedName("kl.a(III)Z")
    public boolean method5133(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3382.length) {
            int var3 = this.field3382[arg1];
            if (arg0 >= var3 && arg0 <= this.field3384[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
