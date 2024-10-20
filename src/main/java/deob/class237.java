package deob;

@ObfuscatedName("ik")
public class class237 extends class219 {

    @ObfuscatedName("ik.d")
    public final int field2778;

    @ObfuscatedName("ik.z")
    public final int field2776;

    @ObfuscatedName("ik.n")
    public final int[] field2780;

    @ObfuscatedName("ik.r")
    public final int[] field2779;

    public class237(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2778 = arg0;
        this.field2776 = arg1;
        this.field2780 = arg2;
        this.field2779 = arg3;
    }

    @ObfuscatedName("ik.d(III)Z")
    public boolean method4088(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2779.length) {
            int var3 = this.field2779[arg1];
            if (arg0 >= var3 && arg0 <= this.field2780[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
