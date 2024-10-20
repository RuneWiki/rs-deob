package deob;

@ObfuscatedName("hg")
public class class222 extends class206 {

    @ObfuscatedName("hg.s")
    public final int field2709;

    @ObfuscatedName("hg.g")
    public final int field2704;

    @ObfuscatedName("hg.m")
    public final int[] field2703;

    @ObfuscatedName("hg.h")
    public final int[] field2705;

    public class222(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2709 = arg0;
        this.field2704 = arg1;
        this.field2703 = arg2;
        this.field2705 = arg3;
    }

    @ObfuscatedName("hg.s(III)Z")
    public boolean method4038(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2705.length) {
            int var3 = this.field2705[arg1];
            if (arg0 >= var3 && arg0 <= this.field2703[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
