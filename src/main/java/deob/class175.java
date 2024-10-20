package deob;

@ObfuscatedName("fy")
public class class175 extends class204 {

    @ObfuscatedName("fy.h")
    public final int field2883;

    @ObfuscatedName("fy.m")
    public final int field2881;

    @ObfuscatedName("fy.i")
    public final int[] field2882;

    @ObfuscatedName("fy.q")
    public final int[] field2892;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2883 = arg0;
        this.field2881 = arg1;
        this.field2882 = arg2;
        this.field2892 = arg3;
    }

    @ObfuscatedName("fy.h(III)Z")
    public boolean method3192(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2892.length) {
            int var3 = this.field2892[arg1];
            if (arg0 >= var3 && arg0 <= this.field2882[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
