package deob;

@ObfuscatedName("ha")
public class class212 extends class196 {

    @ObfuscatedName("ha.e")
    public final int field2578;

    @ObfuscatedName("ha.n")
    public final int field2579;

    @ObfuscatedName("ha.g")
    public final int[] field2580;

    @ObfuscatedName("ha.y")
    public final int[] field2582;

    public class212(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2578 = arg0;
        this.field2579 = arg1;
        this.field2580 = arg2;
        this.field2582 = arg3;
    }

    @ObfuscatedName("ha.e(III)Z")
    public boolean method3637(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2582.length) {
            int var3 = this.field2582[arg1];
            if (arg0 >= var3 && arg0 <= this.field2580[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
