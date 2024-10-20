package deob;

@ObfuscatedName("hh")
public class class211 extends class195 {

    @ObfuscatedName("hh.w")
    public final int field2590;

    @ObfuscatedName("hh.s")
    public final int field2593;

    @ObfuscatedName("hh.q")
    public final int[] field2592;

    @ObfuscatedName("hh.o")
    public final int[] field2595;

    public class211(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2590 = arg0;
        this.field2593 = arg1;
        this.field2592 = arg2;
        this.field2595 = arg3;
    }

    @ObfuscatedName("hh.w(III)Z")
    public boolean method3707(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2595.length) {
            int var3 = this.field2595[arg1];
            if (arg0 >= var3 && arg0 <= this.field2592[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
