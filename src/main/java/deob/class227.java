package deob;

@ObfuscatedName("hk")
public class class227 extends class209 {

    @ObfuscatedName("hk.v")
    public final int field2590;

    @ObfuscatedName("hk.s")
    public final int field2588;

    @ObfuscatedName("hk.o")
    public final int[] field2587;

    @ObfuscatedName("hk.k")
    public final int[] field2589;

    public class227(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2590 = arg0;
        this.field2588 = arg1;
        this.field2587 = arg2;
        this.field2589 = arg3;
    }

    @ObfuscatedName("hk.v(IIB)Z")
    public boolean method4098(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2589.length) {
            int var3 = this.field2589[arg1];
            if (arg0 >= var3 && arg0 <= this.field2587[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
