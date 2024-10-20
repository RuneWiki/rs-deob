package deob;

@ObfuscatedName("hc")
public class class212 extends class196 {

    @ObfuscatedName("hc.i")
    public final int field2601;

    @ObfuscatedName("hc.j")
    public final int field2600;

    @ObfuscatedName("hc.a")
    public final int[] field2602;

    @ObfuscatedName("hc.r")
    public final int[] field2603;

    public class212(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2601 = arg0;
        this.field2600 = arg1;
        this.field2602 = arg2;
        this.field2603 = arg3;
    }

    @ObfuscatedName("hc.i(III)Z")
    public boolean method3672(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2603.length) {
            int var3 = this.field2603[arg1];
            if (arg0 >= var3 && arg0 <= this.field2602[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
