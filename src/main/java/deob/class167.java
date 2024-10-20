package deob;

@ObfuscatedName("fu")
public class class167 extends class151 {

    @ObfuscatedName("fu.d")
    public final int field2168;

    @ObfuscatedName("fu.c")
    public final int field2166;

    @ObfuscatedName("fu.n")
    public final int[] field2165;

    @ObfuscatedName("fu.q")
    public final int[] field2167;

    public class167(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2168 = arg0;
        this.field2166 = arg1;
        this.field2165 = arg2;
        this.field2167 = arg3;
    }

    @ObfuscatedName("fu.d(III)Z")
    public boolean method2933(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2167.length) {
            int var3 = this.field2167[arg1];
            if (arg0 >= var3 && arg0 <= this.field2165[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
