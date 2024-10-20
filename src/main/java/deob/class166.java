package deob;

@ObfuscatedName("fi")
public class class166 extends class195 {

    @ObfuscatedName("fi.y")
    public final int field2814;

    @ObfuscatedName("fi.k")
    public final int field2809;

    @ObfuscatedName("fi.g")
    public final int[] field2810;

    @ObfuscatedName("fi.n")
    public final int[] field2813;

    @ObfuscatedName("fi.t")
    public final int field2812;

    public class166(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2814 = arg0;
        this.field2809 = arg1;
        this.field2810 = arg2;
        this.field2813 = arg3;
        this.field2812 = arg4;
    }

    @ObfuscatedName("fi.y(III)Z")
    public boolean method3069(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2813.length) {
            int var3 = this.field2813[arg1];
            if (arg0 >= var3 && arg0 <= this.field2810[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
