package deob;

@ObfuscatedName("fn")
public class class165 extends class130 {

    @ObfuscatedName("fn.s")
    public final int field2165;

    @ObfuscatedName("fn.c")
    public final int field2166;

    @ObfuscatedName("fn.f")
    public final int[] field2167;

    @ObfuscatedName("fn.h")
    public final int[] field2173;

    public class165(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2165 = arg0;
        this.field2166 = arg1;
        this.field2167 = arg2;
        this.field2173 = arg3;
    }

    @ObfuscatedName("fn.s(III)Z")
    public boolean method2842(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2173.length) {
            int var3 = this.field2173[arg1];
            if (arg0 >= var3 && arg0 <= this.field2167[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
