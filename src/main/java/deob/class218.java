package deob;

@ObfuscatedName("hm")
public class class218 extends class202 {

    @ObfuscatedName("hm.m")
    public final int field2684;

    @ObfuscatedName("hm.p")
    public final int field2681;

    @ObfuscatedName("hm.i")
    public final int[] field2683;

    @ObfuscatedName("hm.j")
    public final int[] field2682;

    public class218(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2684 = arg0;
        this.field2681 = arg1;
        this.field2683 = arg2;
        this.field2682 = arg3;
    }

    @ObfuscatedName("hm.m(III)Z")
    public boolean method3757(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2682.length) {
            int var3 = this.field2682[arg1];
            if (arg0 >= var3 && arg0 <= this.field2683[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
