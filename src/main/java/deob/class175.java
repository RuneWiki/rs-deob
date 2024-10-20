package deob;

@ObfuscatedName("fb")
public class class175 extends class204 {

    @ObfuscatedName("fb.n")
    public final int field2891;

    @ObfuscatedName("fb.q")
    public final int field2889;

    @ObfuscatedName("fb.c")
    public final int[] field2887;

    @ObfuscatedName("fb.l")
    public final int[] field2890;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2891 = arg0;
        this.field2889 = arg1;
        this.field2887 = arg2;
        this.field2890 = arg3;
    }

    @ObfuscatedName("fb.n(III)Z")
    public boolean method3205(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2890.length) {
            int var3 = this.field2890[arg1];
            if (arg0 >= var3 && arg0 <= this.field2887[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
