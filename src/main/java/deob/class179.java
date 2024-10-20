package deob;

@ObfuscatedName("fh")
public class class179 extends class208 {

    @ObfuscatedName("fh.m")
    public final int field2949;

    @ObfuscatedName("fh.w")
    public final int field2939;

    @ObfuscatedName("fh.e")
    public final int[] field2941;

    @ObfuscatedName("fh.o")
    public final int[] field2942;

    public class179(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2949 = arg0;
        this.field2939 = arg1;
        this.field2941 = arg2;
        this.field2942 = arg3;
    }

    @ObfuscatedName("fh.m(III)Z")
    public boolean method3276(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2942.length) {
            int var3 = this.field2942[arg1];
            if (arg0 >= var3 && arg0 <= this.field2941[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
