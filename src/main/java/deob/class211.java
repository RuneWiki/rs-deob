package deob;

@ObfuscatedName("hm")
public class class211 extends class195 {

    @ObfuscatedName("hm.c")
    public final int field2570;

    @ObfuscatedName("hm.o")
    public final int field2567;

    @ObfuscatedName("hm.i")
    public final int[] field2568;

    @ObfuscatedName("hm.u")
    public final int[] field2569;

    public class211(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2570 = arg0;
        this.field2567 = arg1;
        this.field2568 = arg2;
        this.field2569 = arg3;
    }

    @ObfuscatedName("hm.c(III)Z")
    public boolean method3576(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2569.length) {
            int var3 = this.field2569[arg1];
            if (arg0 >= var3 && arg0 <= this.field2568[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
