package deob;

@ObfuscatedName("fj")
public class class165 extends class130 {

    @ObfuscatedName("fj.b")
    public final int field2149;

    @ObfuscatedName("fj.l")
    public final int field2147;

    @ObfuscatedName("fj.i")
    public final int[] field2146;

    @ObfuscatedName("fj.t")
    public final int[] field2150;

    public class165(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2149 = arg0;
        this.field2147 = arg1;
        this.field2146 = arg2;
        this.field2150 = arg3;
    }

    @ObfuscatedName("fj.b(III)Z")
    public boolean method3023(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2150.length) {
            int var3 = this.field2150[arg1];
            if (arg0 >= var3 && arg0 <= this.field2146[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
