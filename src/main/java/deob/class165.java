package deob;

@ObfuscatedName("fi")
public class class165 extends class130 {

    @ObfuscatedName("fi.q")
    public final int field2157;

    @ObfuscatedName("fi.d")
    public final int field2158;

    @ObfuscatedName("fi.h")
    public final int[] field2155;

    @ObfuscatedName("fi.p")
    public final int[] field2156;

    public class165(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2157 = arg0;
        this.field2158 = arg1;
        this.field2155 = arg2;
        this.field2156 = arg3;
    }

    @ObfuscatedName("fi.q(IIB)Z")
    public boolean method2979(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2156.length) {
            int var3 = this.field2156[arg1];
            if (arg0 >= var3 && arg0 <= this.field2155[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
