package deob;

@ObfuscatedName("hp")
public class class223 extends class181 {

    @ObfuscatedName("hp.m")
    public final int field2594;

    @ObfuscatedName("hp.f")
    public final int field2595;

    @ObfuscatedName("hp.q")
    public final int[] field2596;

    @ObfuscatedName("hp.w")
    public final int[] field2598;

    public class223(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2594 = arg0;
        this.field2595 = arg1;
        this.field2596 = arg2;
        this.field2598 = arg3;
    }

    @ObfuscatedName("hp.m(III)Z")
    public boolean method3994(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2598.length) {
            int var3 = this.field2598[arg1];
            if (arg0 >= var3 && arg0 <= this.field2596[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
