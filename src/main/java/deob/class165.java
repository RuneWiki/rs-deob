package deob;

@ObfuscatedName("fg")
public class class165 extends class130 {

    @ObfuscatedName("fg.x")
    public final int field2147;

    @ObfuscatedName("fg.j")
    public final int field2151;

    @ObfuscatedName("fg.c")
    public final int[] field2143;

    @ObfuscatedName("fg.d")
    public final int[] field2142;

    public class165(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2147 = arg0;
        this.field2151 = arg1;
        this.field2143 = arg2;
        this.field2142 = arg3;
    }

    @ObfuscatedName("fg.x(IIB)Z")
    public boolean method2953(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2142.length) {
            int var3 = this.field2142[arg1];
            if (arg0 >= var3 && arg0 <= this.field2143[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
