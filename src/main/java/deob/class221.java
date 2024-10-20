package deob;

@ObfuscatedName("ho")
public class class221 extends class185 {

    @ObfuscatedName("ho.h")
    public final int field2538;

    @ObfuscatedName("ho.v")
    public final int field2533;

    @ObfuscatedName("ho.x")
    public final int[] field2534;

    @ObfuscatedName("ho.w")
    public final int[] field2532;

    public class221(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2538 = arg0;
        this.field2533 = arg1;
        this.field2534 = arg2;
        this.field2532 = arg3;
    }

    @ObfuscatedName("ho.h(IIS)Z")
    public boolean method3662(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2532.length) {
            int var3 = this.field2532[arg1];
            if (arg0 >= var3 && arg0 <= this.field2534[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
