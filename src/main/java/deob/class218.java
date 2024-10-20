package deob;

@ObfuscatedName("hl")
public class class218 extends class202 {

    @ObfuscatedName("hl.d")
    public final int field2684;

    @ObfuscatedName("hl.x")
    public final int field2683;

    @ObfuscatedName("hl.k")
    public final int[] field2682;

    @ObfuscatedName("hl.z")
    public final int[] field2685;

    public class218(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2684 = arg0;
        this.field2683 = arg1;
        this.field2682 = arg2;
        this.field2685 = arg3;
    }

    @ObfuscatedName("hl.d(IIB)Z")
    public boolean method3785(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2685.length) {
            int var3 = this.field2685[arg1];
            if (arg0 >= var3 && arg0 <= this.field2682[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
