package deob;

@ObfuscatedName("hj")
public class class211 extends class195 {

    @ObfuscatedName("hj.i")
    public final int field2592;

    @ObfuscatedName("hj.h")
    public final int field2591;

    @ObfuscatedName("hj.u")
    public final int[] field2590;

    @ObfuscatedName("hj.q")
    public final int[] field2588;

    public class211(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2592 = arg0;
        this.field2591 = arg1;
        this.field2590 = arg2;
        this.field2588 = arg3;
    }

    @ObfuscatedName("hj.i(IIB)Z")
    public boolean method3662(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2588.length) {
            int var3 = this.field2588[arg1];
            if (arg0 >= var3 && arg0 <= this.field2590[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
