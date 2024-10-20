package deob;

@ObfuscatedName("fm")
public class class175 extends class204 {

    @ObfuscatedName("fm.l")
    public final int field2883;

    @ObfuscatedName("fm.e")
    public final int field2882;

    @ObfuscatedName("fm.q")
    public final int[] field2881;

    @ObfuscatedName("fm.o")
    public final int[] field2884;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2883 = arg0;
        this.field2882 = arg1;
        this.field2881 = arg2;
        this.field2884 = arg3;
    }

    @ObfuscatedName("fm.l(IIB)Z")
    public boolean method3219(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2884.length) {
            int var3 = this.field2884[arg1];
            if (arg0 >= var3 && arg0 <= this.field2881[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
