package deob;

@ObfuscatedName("fs")
public class class175 extends class204 {

    @ObfuscatedName("fs.i")
    public final int field2884;

    @ObfuscatedName("fs.v")
    public final int field2886;

    @ObfuscatedName("fs.f")
    public final int[] field2885;

    @ObfuscatedName("fs.h")
    public final int[] field2890;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2884 = arg0;
        this.field2886 = arg1;
        this.field2885 = arg2;
        this.field2890 = arg3;
    }

    @ObfuscatedName("fs.i(III)Z")
    public boolean method3196(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2890.length) {
            int var3 = this.field2890[arg1];
            if (arg0 >= var3 && arg0 <= this.field2885[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
