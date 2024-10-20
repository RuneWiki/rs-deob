package deob;

@ObfuscatedName("hy")
public class class212 extends class183 {

    @ObfuscatedName("hy.f")
    public final int field2507;

    @ObfuscatedName("hy.i")
    public final int field2504;

    @ObfuscatedName("hy.y")
    public final int[] field2505;

    @ObfuscatedName("hy.w")
    public final int[] field2506;

    public class212(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2507 = arg0;
        this.field2504 = arg1;
        this.field2505 = arg2;
        this.field2506 = arg3;
    }

    @ObfuscatedName("hy.f(IIB)Z")
    public boolean method3591(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2506.length) {
            int var3 = this.field2506[arg1];
            if (arg0 >= var3 && arg0 <= this.field2505[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
