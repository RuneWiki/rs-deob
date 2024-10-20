package deob;

@ObfuscatedName("hf")
public class class212 extends class196 {

    @ObfuscatedName("hf.j")
    public final int field2600;

    @ObfuscatedName("hf.h")
    public final int field2598;

    @ObfuscatedName("hf.f")
    public final int[] field2597;

    @ObfuscatedName("hf.p")
    public final int[] field2596;

    public class212(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2600 = arg0;
        this.field2598 = arg1;
        this.field2597 = arg2;
        this.field2596 = arg3;
    }

    @ObfuscatedName("hf.j(III)Z")
    public boolean method3607(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2596.length) {
            int var3 = this.field2596[arg1];
            if (arg0 >= var3 && arg0 <= this.field2597[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
