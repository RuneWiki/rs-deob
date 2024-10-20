package deob;

@ObfuscatedName("jr")
public class class275 extends class382 {

    @ObfuscatedName("jr.c")
    public final int field3183;

    @ObfuscatedName("jr.b")
    public final int field3179;

    @ObfuscatedName("jr.p")
    public final int[] field3180;

    @ObfuscatedName("jr.m")
    public final int[] field3181;

    public class275(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3183 = arg0;
        this.field3179 = arg1;
        this.field3180 = arg2;
        this.field3181 = arg3;
    }

    @ObfuscatedName("jr.c(III)Z")
    public boolean method4822(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3181.length) {
            int var3 = this.field3181[arg1];
            if (arg0 >= var3 && arg0 <= this.field3180[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
