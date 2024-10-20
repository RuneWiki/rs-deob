package deob;

@ObfuscatedName("fg")
public class class175 extends class204 {

    @ObfuscatedName("fg.j")
    public final int field2904;

    @ObfuscatedName("fg.l")
    public final int field2901;

    @ObfuscatedName("fg.a")
    public final int[] field2900;

    @ObfuscatedName("fg.i")
    public final int[] field2903;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2904 = arg0;
        this.field2901 = arg1;
        this.field2900 = arg2;
        this.field2903 = arg3;
    }

    @ObfuscatedName("fg.j(IIB)Z")
    public boolean method3187(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2903.length) {
            int var3 = this.field2903[arg1];
            if (arg0 >= var3 && arg0 <= this.field2900[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
