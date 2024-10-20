package deob;

@ObfuscatedName("hu")
public class class222 extends class206 {

    @ObfuscatedName("hu.p")
    public final int field2687;

    @ObfuscatedName("hu.i")
    public final int field2685;

    @ObfuscatedName("hu.w")
    public final int[] field2684;

    @ObfuscatedName("hu.s")
    public final int[] field2686;

    public class222(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2687 = arg0;
        this.field2685 = arg1;
        this.field2684 = arg2;
        this.field2686 = arg3;
    }

    @ObfuscatedName("hu.p(III)Z")
    public boolean method3856(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2686.length) {
            int var3 = this.field2686[arg1];
            if (arg0 >= var3 && arg0 <= this.field2684[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
