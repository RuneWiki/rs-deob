package deob;

@ObfuscatedName("fp")
public class class166 extends class195 {

    @ObfuscatedName("fp.n")
    public final int field2794;

    @ObfuscatedName("fp.d")
    public final int field2791;

    @ObfuscatedName("fp.z")
    public final int[] field2793;

    @ObfuscatedName("fp.y")
    public final int[] field2797;

    @ObfuscatedName("fp.e")
    public final int field2795;

    public class166(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2794 = arg0;
        this.field2791 = arg1;
        this.field2793 = arg2;
        this.field2797 = arg3;
        this.field2795 = arg4;
    }

    @ObfuscatedName("fp.n(III)Z")
    public boolean method3151(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2797.length) {
            int var3 = this.field2797[arg1];
            if (arg0 >= var3 && arg0 <= this.field2793[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
