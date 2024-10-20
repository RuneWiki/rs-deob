package deob;

@ObfuscatedName("fc")
public class class179 extends class208 {

    @ObfuscatedName("fc.a")
    public final int field2960;

    @ObfuscatedName("fc.d")
    public final int field2965;

    @ObfuscatedName("fc.v")
    public final int[] field2961;

    @ObfuscatedName("fc.r")
    public final int[] field2962;

    public class179(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2960 = arg0;
        this.field2965 = arg1;
        this.field2961 = arg2;
        this.field2962 = arg3;
    }

    @ObfuscatedName("fc.a(IIB)Z")
    public boolean method3302(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2962.length) {
            int var3 = this.field2962[arg1];
            if (arg0 >= var3 && arg0 <= this.field2961[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
