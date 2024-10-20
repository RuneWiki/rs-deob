package deob;

@ObfuscatedName("hk")
public class class233 extends class214 {

    @ObfuscatedName("hk.a")
    public final int field2642;

    @ObfuscatedName("hk.s")
    public final int field2641;

    @ObfuscatedName("hk.g")
    public final int[] field2643;

    @ObfuscatedName("hk.x")
    public final int[] field2644;

    public class233(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2642 = arg0;
        this.field2641 = arg1;
        this.field2643 = arg2;
        this.field2644 = arg3;
    }

    @ObfuscatedName("hk.a(III)Z")
    public boolean method4256(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2644.length) {
            int var3 = this.field2644[arg1];
            if (arg0 >= var3 && arg0 <= this.field2643[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
