package deob;

@ObfuscatedName("fs")
public class class175 extends class204 {

    @ObfuscatedName("fs.c")
    public final int field2881;

    @ObfuscatedName("fs.h")
    public final int field2884;

    @ObfuscatedName("fs.k")
    public final int[] field2882;

    @ObfuscatedName("fs.t")
    public final int[] field2883;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2881 = arg0;
        this.field2884 = arg1;
        this.field2882 = arg2;
        this.field2883 = arg3;
    }

    @ObfuscatedName("fs.c(III)Z")
    public boolean method3193(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2883.length) {
            int var3 = this.field2883[arg1];
            if (arg0 >= var3 && arg0 <= this.field2882[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
