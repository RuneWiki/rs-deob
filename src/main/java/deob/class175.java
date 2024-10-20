package deob;

@ObfuscatedName("fp")
public class class175 extends class204 {

    @ObfuscatedName("fp.i")
    public final int field2881;

    @ObfuscatedName("fp.v")
    public final int field2882;

    @ObfuscatedName("fp.r")
    public final int[] field2880;

    @ObfuscatedName("fp.n")
    public final int[] field2883;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2881 = arg0;
        this.field2882 = arg1;
        this.field2880 = arg2;
        this.field2883 = arg3;
    }

    @ObfuscatedName("fp.i(III)Z")
    public boolean method3223(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2883.length) {
            int var3 = this.field2883[arg1];
            if (arg0 >= var3 && arg0 <= this.field2880[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
