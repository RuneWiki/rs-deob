package deob;

@ObfuscatedName("fv")
public class class169 extends class198 {

    @ObfuscatedName("fv.j")
    public final int field2821;

    @ObfuscatedName("fv.y")
    public final int field2816;

    @ObfuscatedName("fv.z")
    public final int[] field2817;

    @ObfuscatedName("fv.l")
    public final int[] field2818;

    public class169(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2821 = arg0;
        this.field2816 = arg1;
        this.field2817 = arg2;
        this.field2818 = arg3;
    }

    @ObfuscatedName("fv.j(IIB)Z")
    public boolean method3152(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2818.length) {
            int var3 = this.field2818[arg1];
            if (arg0 >= var3 && arg0 <= this.field2817[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
