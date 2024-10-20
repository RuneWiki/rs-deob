package deob;

@ObfuscatedName("fm")
public class class165 extends class130 {

    @ObfuscatedName("fm.x")
    public final int field2161;

    @ObfuscatedName("fm.n")
    public final int field2156;

    @ObfuscatedName("fm.g")
    public final int[] field2157;

    @ObfuscatedName("fm.v")
    public final int[] field2158;

    public class165(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2161 = arg0;
        this.field2156 = arg1;
        this.field2157 = arg2;
        this.field2158 = arg3;
    }

    @ObfuscatedName("fm.x(IIB)Z")
    public boolean method3029(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2158.length) {
            int var3 = this.field2158[arg1];
            if (arg0 >= var3 && arg0 <= this.field2157[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
