package deob;

@ObfuscatedName("fm")
public class class165 extends class130 {

    @ObfuscatedName("fm.i")
    public final int field2160;

    @ObfuscatedName("fm.e")
    public final int field2168;

    @ObfuscatedName("fm.f")
    public final int[] field2159;

    @ObfuscatedName("fm.k")
    public final int[] field2162;

    public class165(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2160 = arg0;
        this.field2168 = arg1;
        this.field2159 = arg2;
        this.field2162 = arg3;
    }

    @ObfuscatedName("fm.i(IIB)Z")
    public boolean method2860(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2162.length) {
            int var3 = this.field2162[arg1];
            if (arg0 >= var3 && arg0 <= this.field2159[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
