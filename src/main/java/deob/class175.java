package deob;

@ObfuscatedName("ft")
public class class175 extends class204 {

    @ObfuscatedName("ft.m")
    public final int field2876;

    @ObfuscatedName("ft.l")
    public final int field2871;

    @ObfuscatedName("ft.y")
    public final int[] field2872;

    @ObfuscatedName("ft.u")
    public final int[] field2873;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2876 = arg0;
        this.field2871 = arg1;
        this.field2872 = arg2;
        this.field2873 = arg3;
    }

    @ObfuscatedName("ft.m(IIB)Z")
    public boolean method3276(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2873.length) {
            int var3 = this.field2873[arg1];
            if (arg0 >= var3 && arg0 <= this.field2872[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
