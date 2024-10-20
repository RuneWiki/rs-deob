package deob;

@ObfuscatedName("hh")
public class class214 extends class198 {

    @ObfuscatedName("hh.w")
    public final int field2610;

    @ObfuscatedName("hh.o")
    public final int field2611;

    @ObfuscatedName("hh.x")
    public final int[] field2612;

    @ObfuscatedName("hh.k")
    public final int[] field2613;

    public class214(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2610 = arg0;
        this.field2611 = arg1;
        this.field2612 = arg2;
        this.field2613 = arg3;
    }

    @ObfuscatedName("hh.w(III)Z")
    public boolean method3584(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2613.length) {
            int var3 = this.field2613[arg1];
            if (arg0 >= var3 && arg0 <= this.field2612[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
