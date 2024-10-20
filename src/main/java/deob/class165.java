package deob;

@ObfuscatedName("fi")
public class class165 extends class130 {

    @ObfuscatedName("fi.u")
    public final int field2144;

    @ObfuscatedName("fi.x")
    public final int field2140;

    @ObfuscatedName("fi.i")
    public final int[] field2142;

    @ObfuscatedName("fi.a")
    public final int[] field2139;

    public class165(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2144 = arg0;
        this.field2140 = arg1;
        this.field2142 = arg2;
        this.field2139 = arg3;
    }

    @ObfuscatedName("fi.u(III)Z")
    public boolean method2917(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2139.length) {
            int var3 = this.field2139[arg1];
            if (arg0 >= var3 && arg0 <= this.field2142[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
