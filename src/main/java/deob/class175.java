package deob;

@ObfuscatedName("fg")
public class class175 extends class204 {

    @ObfuscatedName("fg.k")
    public final int field2883;

    @ObfuscatedName("fg.h")
    public final int field2879;

    @ObfuscatedName("fg.o")
    public final int[] field2881;

    @ObfuscatedName("fg.z")
    public final int[] field2882;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2883 = arg0;
        this.field2879 = arg1;
        this.field2881 = arg2;
        this.field2882 = arg3;
    }

    @ObfuscatedName("fg.k(III)Z")
    public boolean method3243(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2882.length) {
            int var3 = this.field2882[arg1];
            if (arg0 >= var3 && arg0 <= this.field2881[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
