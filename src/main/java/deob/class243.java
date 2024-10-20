package deob;

@ObfuscatedName("iy")
public class class243 extends class349 {

    @ObfuscatedName("iy.s")
    public final int field2910;

    @ObfuscatedName("iy.t")
    public final int field2906;

    @ObfuscatedName("iy.v")
    public final int[] field2905;

    @ObfuscatedName("iy.j")
    public final int[] field2908;

    public class243(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2910 = arg0;
        this.field2906 = arg1;
        this.field2905 = arg2;
        this.field2908 = arg3;
    }

    @ObfuscatedName("iy.s(III)Z")
    public boolean method4187(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2908.length) {
            int var3 = this.field2908[arg1];
            if (arg0 >= var3 && arg0 <= this.field2905[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
