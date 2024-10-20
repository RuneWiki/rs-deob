package deob;

@ObfuscatedName("hv")
public class class225 extends class207 {

    @ObfuscatedName("hv.z")
    public final int field2554;

    @ObfuscatedName("hv.w")
    public final int field2550;

    @ObfuscatedName("hv.s")
    public final int[] field2551;

    @ObfuscatedName("hv.l")
    public final int[] field2552;

    public class225(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2554 = arg0;
        this.field2550 = arg1;
        this.field2551 = arg2;
        this.field2552 = arg3;
    }

    @ObfuscatedName("hv.z(IIB)Z")
    public boolean method4057(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2552.length) {
            int var3 = this.field2552[arg1];
            if (arg0 >= var3 && arg0 <= this.field2551[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
