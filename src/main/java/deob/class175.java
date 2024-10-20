package deob;

@ObfuscatedName("fh")
public class class175 extends class204 {

    @ObfuscatedName("fh.j")
    public final int field2883;

    @ObfuscatedName("fh.m")
    public final int field2878;

    @ObfuscatedName("fh.f")
    public final int[] field2879;

    @ObfuscatedName("fh.l")
    public final int[] field2880;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2883 = arg0;
        this.field2878 = arg1;
        this.field2879 = arg2;
        this.field2880 = arg3;
    }

    @ObfuscatedName("fh.j(IIB)Z")
    public boolean method3273(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2880.length) {
            int var3 = this.field2880[arg1];
            if (arg0 >= var3 && arg0 <= this.field2879[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
