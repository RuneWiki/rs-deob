package deob;

@ObfuscatedName("fp")
public class class179 extends class208 {

    @ObfuscatedName("fp.e")
    public final int field2941;

    @ObfuscatedName("fp.l")
    public final int field2939;

    @ObfuscatedName("fp.c")
    public final int[] field2940;

    @ObfuscatedName("fp.h")
    public final int[] field2938;

    public class179(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2941 = arg0;
        this.field2939 = arg1;
        this.field2940 = arg2;
        this.field2938 = arg3;
    }

    @ObfuscatedName("fp.e(IIB)Z")
    public boolean method3324(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2938.length) {
            int var3 = this.field2938[arg1];
            if (arg0 >= var3 && arg0 <= this.field2940[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
