package deob;

@ObfuscatedName("fb")
public class class165 extends class130 {

    @ObfuscatedName("fb.p")
    public final int field2157;

    @ObfuscatedName("fb.g")
    public final int field2154;

    @ObfuscatedName("fb.x")
    public final int[] field2151;

    @ObfuscatedName("fb.q")
    public final int[] field2153;

    public class165(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2157 = arg0;
        this.field2154 = arg1;
        this.field2151 = arg2;
        this.field2153 = arg3;
    }

    @ObfuscatedName("fb.p(IIB)Z")
    public boolean method2883(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2153.length) {
            int var3 = this.field2153[arg1];
            if (arg0 >= var3 && arg0 <= this.field2151[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
