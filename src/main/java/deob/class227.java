package deob;

@ObfuscatedName("hh")
public class class227 extends class209 {

    @ObfuscatedName("hh.y")
    public final int field2600;

    @ObfuscatedName("hh.c")
    public final int field2594;

    @ObfuscatedName("hh.n")
    public final int[] field2595;

    @ObfuscatedName("hh.u")
    public final int[] field2596;

    public class227(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2600 = arg0;
        this.field2594 = arg1;
        this.field2595 = arg2;
        this.field2596 = arg3;
    }

    @ObfuscatedName("hh.y(III)Z")
    public boolean method4062(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2596.length) {
            int var3 = this.field2596[arg1];
            if (arg0 >= var3 && arg0 <= this.field2595[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
