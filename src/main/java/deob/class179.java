package deob;

@ObfuscatedName("fs")
public class class179 extends class208 {

    @ObfuscatedName("fs.k")
    public final int field2948;

    @ObfuscatedName("fs.q")
    public final int field2943;

    @ObfuscatedName("fs.f")
    public final int[] field2942;

    @ObfuscatedName("fs.c")
    public final int[] field2945;

    public class179(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2948 = arg0;
        this.field2943 = arg1;
        this.field2942 = arg2;
        this.field2945 = arg3;
    }

    @ObfuscatedName("fs.k(IIB)Z")
    public boolean method3258(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2945.length) {
            int var3 = this.field2945[arg1];
            if (arg0 >= var3 && arg0 <= this.field2942[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
