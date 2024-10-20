package deob;

@ObfuscatedName("fk")
public class class175 extends class204 {

    @ObfuscatedName("fk.o")
    public final int field2896;

    @ObfuscatedName("fk.f")
    public final int field2895;

    @ObfuscatedName("fk.i")
    public final int[] field2897;

    @ObfuscatedName("fk.h")
    public final int[] field2898;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2896 = arg0;
        this.field2895 = arg1;
        this.field2897 = arg2;
        this.field2898 = arg3;
    }

    @ObfuscatedName("fk.o(III)Z")
    public boolean method3152(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2898.length) {
            int var3 = this.field2898[arg1];
            if (arg0 >= var3 && arg0 <= this.field2897[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
