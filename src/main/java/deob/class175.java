package deob;

@ObfuscatedName("ff")
public class class175 extends class204 {

    @ObfuscatedName("ff.o")
    public final int field2900;

    @ObfuscatedName("ff.e")
    public final int field2898;

    @ObfuscatedName("ff.u")
    public final int[] field2903;

    @ObfuscatedName("ff.b")
    public final int[] field2901;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2900 = arg0;
        this.field2898 = arg1;
        this.field2903 = arg2;
        this.field2901 = arg3;
    }

    @ObfuscatedName("ff.o(III)Z")
    public boolean method3235(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2901.length) {
            int var3 = this.field2901[arg1];
            if (arg0 >= var3 && arg0 <= this.field2903[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
