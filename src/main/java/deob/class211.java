package deob;

@ObfuscatedName("hm")
public class class211 extends class195 {

    @ObfuscatedName("hm.p")
    public final int field2608;

    @ObfuscatedName("hm.m")
    public final int field2612;

    @ObfuscatedName("hm.e")
    public final int[] field2609;

    @ObfuscatedName("hm.t")
    public final int[] field2610;

    public class211(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2608 = arg0;
        this.field2612 = arg1;
        this.field2609 = arg2;
        this.field2610 = arg3;
    }

    @ObfuscatedName("hm.p(III)Z")
    public boolean method3540(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2610.length) {
            int var3 = this.field2610[arg1];
            if (arg0 >= var3 && arg0 <= this.field2609[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
