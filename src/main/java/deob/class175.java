package deob;

@ObfuscatedName("fx")
public class class175 extends class204 {

    @ObfuscatedName("fx.n")
    public final int field2880;

    @ObfuscatedName("fx.d")
    public final int field2879;

    @ObfuscatedName("fx.s")
    public final int[] field2877;

    @ObfuscatedName("fx.q")
    public final int[] field2875;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2880 = arg0;
        this.field2879 = arg1;
        this.field2877 = arg2;
        this.field2875 = arg3;
    }

    @ObfuscatedName("fx.n(III)Z")
    public boolean method3199(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2875.length) {
            int var3 = this.field2875[arg1];
            if (arg0 >= var3 && arg0 <= this.field2877[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
