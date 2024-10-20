package deob;

@ObfuscatedName("ho")
public class class221 extends class185 {

    @ObfuscatedName("ho.f")
    public final int field2548;

    @ObfuscatedName("ho.b")
    public final int field2547;

    @ObfuscatedName("ho.l")
    public final int[] field2545;

    @ObfuscatedName("ho.m")
    public final int[] field2546;

    public class221(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2548 = arg0;
        this.field2547 = arg1;
        this.field2545 = arg2;
        this.field2546 = arg3;
    }

    @ObfuscatedName("ho.f(IIB)Z")
    public boolean method3737(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2546.length) {
            int var3 = this.field2546[arg1];
            if (arg0 >= var3 && arg0 <= this.field2545[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
