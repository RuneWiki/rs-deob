package deob;

@ObfuscatedName("he")
public class class232 extends class214 {

    @ObfuscatedName("he.n")
    public final int field2628;

    @ObfuscatedName("he.h")
    public final int field2627;

    @ObfuscatedName("he.l")
    public final int[] field2626;

    @ObfuscatedName("he.g")
    public final int[] field2625;

    public class232(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2628 = arg0;
        this.field2627 = arg1;
        this.field2626 = arg2;
        this.field2625 = arg3;
    }

    @ObfuscatedName("he.n(III)Z")
    public boolean method4303(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2625.length) {
            int var3 = this.field2625[arg1];
            if (arg0 >= var3 && arg0 <= this.field2626[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
