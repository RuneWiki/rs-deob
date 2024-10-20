package deob;

@ObfuscatedName("fg")
public class class179 extends class208 {

    @ObfuscatedName("fg.i")
    public final int field2949;

    @ObfuscatedName("fg.h")
    public final int field2948;

    @ObfuscatedName("fg.e")
    public final int[] field2947;

    @ObfuscatedName("fg.g")
    public final int[] field2952;

    public class179(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2949 = arg0;
        this.field2948 = arg1;
        this.field2947 = arg2;
        this.field2952 = arg3;
    }

    @ObfuscatedName("fg.i(III)Z")
    public boolean method3261(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2952.length) {
            int var3 = this.field2952[arg1];
            if (arg0 >= var3 && arg0 <= this.field2947[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
