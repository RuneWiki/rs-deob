package deob;

@ObfuscatedName("hg")
public class class221 extends class185 {

    @ObfuscatedName("hg.x")
    public final int field2519;

    @ObfuscatedName("hg.m")
    public final int field2518;

    @ObfuscatedName("hg.k")
    public final int[] field2520;

    @ObfuscatedName("hg.d")
    public final int[] field2517;

    public class221(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2519 = arg0;
        this.field2518 = arg1;
        this.field2520 = arg2;
        this.field2517 = arg3;
    }

    @ObfuscatedName("hg.x(III)Z")
    public boolean method3691(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2517.length) {
            int var3 = this.field2517[arg1];
            if (arg0 >= var3 && arg0 <= this.field2520[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
