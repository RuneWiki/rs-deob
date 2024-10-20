package deob;

@ObfuscatedName("me")
public class class321 extends class469 {

    @ObfuscatedName("me.au")
    public final int field3532;

    @ObfuscatedName("me.ae")
    public final int field3531;

    @ObfuscatedName("me.ao")
    public final int[] field3533;

    @ObfuscatedName("me.at")
    public final int[] field3537;

    public class321(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3532 = arg0;
        this.field3531 = arg1;
        this.field3533 = arg2;
        this.field3537 = arg3;
    }

    @ObfuscatedName("me.au(III)Z")
    public boolean method5480(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3537.length) {
            int var3 = this.field3537[arg1];
            if (arg0 >= var3 && arg0 <= this.field3533[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
