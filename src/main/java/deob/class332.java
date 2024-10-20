package deob;

@ObfuscatedName("me")
public class class332 extends class481 {

    @ObfuscatedName("me.at")
    public final int field3545;

    @ObfuscatedName("me.ah")
    public final int field3547;

    @ObfuscatedName("me.ar")
    public final int[] field3549;

    @ObfuscatedName("me.ao")
    public final int[] field3546;

    public class332(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3545 = arg0;
        this.field3547 = arg1;
        this.field3549 = arg2;
        this.field3546 = arg3;
    }

    @ObfuscatedName("me.at(III)Z")
    public boolean method5609(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3546.length) {
            int var3 = this.field3546[arg1];
            if (arg0 >= var3 && arg0 <= this.field3549[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
