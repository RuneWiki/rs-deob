package deob;

@ObfuscatedName("fb")
public class class166 extends class195 {

    @ObfuscatedName("fb.n")
    public final int field2792;

    @ObfuscatedName("fb.g")
    public final int field2788;

    @ObfuscatedName("fb.a")
    public final int[] field2789;

    @ObfuscatedName("fb.m")
    public final int[] field2793;

    @ObfuscatedName("fb.s")
    public final int field2791;

    public class166(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2792 = arg0;
        this.field2788 = arg1;
        this.field2789 = arg2;
        this.field2793 = arg3;
        this.field2791 = arg4;
    }

    @ObfuscatedName("fb.n(III)Z")
    public boolean method3091(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2793.length) {
            int var3 = this.field2793[arg1];
            if (arg0 >= var3 && arg0 <= this.field2789[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
