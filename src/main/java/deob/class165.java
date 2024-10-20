package deob;

@ObfuscatedName("fl")
public class class165 extends class130 {

    @ObfuscatedName("fl.f")
    public final int field2175;

    @ObfuscatedName("fl.i")
    public final int field2173;

    @ObfuscatedName("fl.u")
    public final int[] field2172;

    @ObfuscatedName("fl.h")
    public final int[] field2174;

    public class165(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2175 = arg0;
        this.field2173 = arg1;
        this.field2172 = arg2;
        this.field2174 = arg3;
    }

    @ObfuscatedName("fl.f(III)Z")
    public boolean method2978(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2174.length) {
            int var3 = this.field2174[arg1];
            if (arg0 >= var3 && arg0 <= this.field2172[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
