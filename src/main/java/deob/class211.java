package deob;

@ObfuscatedName("hx")
public class class211 extends class195 {

    @ObfuscatedName("hx.n")
    public final int field2611;

    @ObfuscatedName("hx.p")
    public final int field2606;

    @ObfuscatedName("hx.i")
    public final int[] field2607;

    @ObfuscatedName("hx.j")
    public final int[] field2608;

    public class211(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2611 = arg0;
        this.field2606 = arg1;
        this.field2607 = arg2;
        this.field2608 = arg3;
    }

    @ObfuscatedName("hx.n(III)Z")
    public boolean method3663(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2608.length) {
            int var3 = this.field2608[arg1];
            if (arg0 >= var3 && arg0 <= this.field2607[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
