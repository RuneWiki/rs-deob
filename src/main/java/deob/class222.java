package deob;

@ObfuscatedName("hy")
public class class222 extends class206 {

    @ObfuscatedName("hy.a")
    public final int field2716;

    @ObfuscatedName("hy.w")
    public final int field2717;

    @ObfuscatedName("hy.e")
    public final int[] field2715;

    @ObfuscatedName("hy.k")
    public final int[] field2718;

    public class222(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2716 = arg0;
        this.field2717 = arg1;
        this.field2715 = arg2;
        this.field2718 = arg3;
    }

    @ObfuscatedName("hy.a(III)Z")
    public boolean method3734(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2718.length) {
            int var3 = this.field2718[arg1];
            if (arg0 >= var3 && arg0 <= this.field2715[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
