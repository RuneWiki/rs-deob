package deob;

@ObfuscatedName("fb")
public class class166 extends class195 {

    @ObfuscatedName("fb.p")
    public final int field2797;

    @ObfuscatedName("fb.k")
    public final int field2795;

    @ObfuscatedName("fb.e")
    public final int[] field2796;

    @ObfuscatedName("fb.f")
    public final int[] field2794;

    @ObfuscatedName("fb.w")
    public final int field2800;

    public class166(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2797 = arg0;
        this.field2795 = arg1;
        this.field2796 = arg2;
        this.field2794 = arg3;
        this.field2800 = arg4;
    }

    @ObfuscatedName("fb.p(III)Z")
    public boolean method3090(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2794.length) {
            int var3 = this.field2794[arg1];
            if (arg0 >= var3 && arg0 <= this.field2796[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
