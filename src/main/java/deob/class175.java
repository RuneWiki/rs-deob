package deob;

@ObfuscatedName("fy")
public class class175 extends class204 {

    @ObfuscatedName("fy.f")
    public final int field2890;

    @ObfuscatedName("fy.s")
    public final int field2894;

    @ObfuscatedName("fy.q")
    public final int[] field2891;

    @ObfuscatedName("fy.g")
    public final int[] field2892;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2890 = arg0;
        this.field2894 = arg1;
        this.field2891 = arg2;
        this.field2892 = arg3;
    }

    @ObfuscatedName("fy.f(III)Z")
    public boolean method3229(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2892.length) {
            int var3 = this.field2892[arg1];
            if (arg0 >= var3 && arg0 <= this.field2891[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
