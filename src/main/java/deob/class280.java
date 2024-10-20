package deob;

@ObfuscatedName("jq")
public class class280 extends class387 {

    @ObfuscatedName("jq.c")
    public final int field3218;

    @ObfuscatedName("jq.l")
    public final int field3212;

    @ObfuscatedName("jq.s")
    public final int[] field3214;

    @ObfuscatedName("jq.e")
    public final int[] field3221;

    public class280(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3218 = arg0;
        this.field3212 = arg1;
        this.field3214 = arg2;
        this.field3221 = arg3;
    }

    @ObfuscatedName("jq.c(III)Z")
    public boolean method4790(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3221.length) {
            int var3 = this.field3221[arg1];
            if (arg0 >= var3 && arg0 <= this.field3214[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
