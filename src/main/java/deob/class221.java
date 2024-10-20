package deob;

@ObfuscatedName("hz")
public class class221 extends class185 {

    @ObfuscatedName("hz.z")
    public final int field2551;

    @ObfuscatedName("hz.k")
    public final int field2550;

    @ObfuscatedName("hz.s")
    public final int[] field2552;

    @ObfuscatedName("hz.t")
    public final int[] field2549;

    public class221(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2551 = arg0;
        this.field2550 = arg1;
        this.field2552 = arg2;
        this.field2549 = arg3;
    }

    @ObfuscatedName("hz.z(III)Z")
    public boolean method3710(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2549.length) {
            int var3 = this.field2549[arg1];
            if (arg0 >= var3 && arg0 <= this.field2552[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
