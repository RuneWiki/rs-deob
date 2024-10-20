package deob;

@ObfuscatedName("ii")
public class class256 extends class364 {

    @ObfuscatedName("ii.n")
    public final int field2997;

    @ObfuscatedName("ii.c")
    public final int field2998;

    @ObfuscatedName("ii.m")
    public final int[] field2993;

    @ObfuscatedName("ii.k")
    public final int[] field2996;

    public class256(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2997 = arg0;
        this.field2998 = arg1;
        this.field2993 = arg2;
        this.field2996 = arg3;
    }

    @ObfuscatedName("ii.n(III)Z")
    public boolean method4437(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2996.length) {
            int var3 = this.field2996[arg1];
            if (arg0 >= var3 && arg0 <= this.field2993[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
