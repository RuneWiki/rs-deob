package deob;

@ObfuscatedName("kb")
public class class299 extends class435 {

    @ObfuscatedName("kb.f")
    public final int field3454;

    @ObfuscatedName("kb.w")
    public final int field3452;

    @ObfuscatedName("kb.v")
    public final int[] field3453;

    @ObfuscatedName("kb.s")
    public final int[] field3451;

    public class299(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3454 = arg0;
        this.field3452 = arg1;
        this.field3453 = arg2;
        this.field3451 = arg3;
    }

    @ObfuscatedName("kb.f(III)Z")
    public boolean method5306(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3451.length) {
            int var3 = this.field3451[arg1];
            if (arg0 >= var3 && arg0 <= this.field3453[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
