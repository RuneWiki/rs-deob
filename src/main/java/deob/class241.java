package deob;

@ObfuscatedName("it")
public class class241 extends class347 {

    @ObfuscatedName("it.v")
    public final int field2916;

    @ObfuscatedName("it.n")
    public final int field2914;

    @ObfuscatedName("it.f")
    public final int[] field2915;

    @ObfuscatedName("it.y")
    public final int[] field2913;

    public class241(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2916 = arg0;
        this.field2914 = arg1;
        this.field2915 = arg2;
        this.field2913 = arg3;
    }

    @ObfuscatedName("it.v(III)Z")
    public boolean method4213(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2913.length) {
            int var3 = this.field2913[arg1];
            if (arg0 >= var3 && arg0 <= this.field2915[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
