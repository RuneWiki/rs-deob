package deob;

@ObfuscatedName("fg")
public class class166 extends class195 {

    @ObfuscatedName("fg.t")
    public final int field2784;

    @ObfuscatedName("fg.b")
    public final int field2780;

    @ObfuscatedName("fg.p")
    public final int[] field2783;

    @ObfuscatedName("fg.e")
    public final int[] field2779;

    public class166(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2784 = arg0;
        this.field2780 = arg1;
        this.field2783 = arg2;
        this.field2779 = arg3;
    }

    @ObfuscatedName("fg.t(IIB)Z")
    public boolean method3050(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2779.length) {
            int var3 = this.field2779[arg1];
            if (arg0 >= var3 && arg0 <= this.field2783[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
