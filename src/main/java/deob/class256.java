package deob;

@ObfuscatedName("iw")
public class class256 extends class365 {

    @ObfuscatedName("iw.i")
    public final int field3010;

    @ObfuscatedName("iw.w")
    public final int field3008;

    @ObfuscatedName("iw.s")
    public final int[] field3007;

    @ObfuscatedName("iw.a")
    public final int[] field3009;

    public class256(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3010 = arg0;
        this.field3008 = arg1;
        this.field3007 = arg2;
        this.field3009 = arg3;
    }

    @ObfuscatedName("iw.i(IIB)Z")
    public boolean method4464(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3009.length) {
            int var3 = this.field3009[arg1];
            if (arg0 >= var3 && arg0 <= this.field3007[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
