package deob;

@ObfuscatedName("fp")
public class class179 extends class208 {

    @ObfuscatedName("fp.s")
    public final int field2944;

    @ObfuscatedName("fp.z")
    public final int field2945;

    @ObfuscatedName("fp.t")
    public final int[] field2946;

    @ObfuscatedName("fp.y")
    public final int[] field2949;

    public class179(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2944 = arg0;
        this.field2945 = arg1;
        this.field2946 = arg2;
        this.field2949 = arg3;
    }

    @ObfuscatedName("fp.s(III)Z")
    public boolean method3257(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2949.length) {
            int var3 = this.field2949[arg1];
            if (arg0 >= var3 && arg0 <= this.field2946[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
