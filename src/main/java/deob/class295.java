package deob;

@ObfuscatedName("kv")
public class class295 extends class428 {

    @ObfuscatedName("kv.h")
    public final int field3438;

    @ObfuscatedName("kv.e")
    public final int field3439;

    @ObfuscatedName("kv.v")
    public final int[] field3437;

    @ObfuscatedName("kv.x")
    public final int[] field3440;

    public class295(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3438 = arg0;
        this.field3439 = arg1;
        this.field3437 = arg2;
        this.field3440 = arg3;
    }

    @ObfuscatedName("kv.h(III)Z")
    public boolean method5209(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3440.length) {
            int var3 = this.field3440[arg1];
            if (arg0 >= var3 && arg0 <= this.field3437[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
