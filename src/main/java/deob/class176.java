package deob;

@ObfuscatedName("fn")
public class class176 extends class205 {

    @ObfuscatedName("fn.e")
    public final int field2900;

    @ObfuscatedName("fn.w")
    public final int field2898;

    @ObfuscatedName("fn.f")
    public final int[] field2897;

    @ObfuscatedName("fn.s")
    public final int[] field2899;

    public class176(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2900 = arg0;
        this.field2898 = arg1;
        this.field2897 = arg2;
        this.field2899 = arg3;
    }

    @ObfuscatedName("fn.e(IIS)Z")
    public boolean method3185(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2899.length) {
            int var3 = this.field2899[arg1];
            if (arg0 >= var3 && arg0 <= this.field2897[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
