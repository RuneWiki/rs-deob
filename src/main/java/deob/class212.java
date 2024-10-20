package deob;

@ObfuscatedName("hz")
public class class212 extends class176 {

    @ObfuscatedName("hz.z")
    public final int field2503;

    @ObfuscatedName("hz.n")
    public final int field2504;

    @ObfuscatedName("hz.v")
    public final int[] field2505;

    @ObfuscatedName("hz.u")
    public final int[] field2506;

    public class212(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2503 = arg0;
        this.field2504 = arg1;
        this.field2505 = arg2;
        this.field2506 = arg3;
    }

    @ObfuscatedName("hz.z(III)Z")
    public boolean method3572(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2506.length) {
            int var3 = this.field2506[arg1];
            if (arg0 >= var3 && arg0 <= this.field2505[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
