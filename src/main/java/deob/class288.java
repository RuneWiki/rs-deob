package deob;

@ObfuscatedName("ki")
public class class288 extends class404 {

    @ObfuscatedName("ki.v")
    public final int field3280;

    @ObfuscatedName("ki.c")
    public final int field3277;

    @ObfuscatedName("ki.i")
    public final int[] field3279;

    @ObfuscatedName("ki.f")
    public final int[] field3278;

    public class288(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3280 = arg0;
        this.field3277 = arg1;
        this.field3279 = arg2;
        this.field3278 = arg3;
    }

    @ObfuscatedName("ki.v(IIB)Z")
    public boolean method4968(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3278.length) {
            int var3 = this.field3278[arg1];
            if (arg0 >= var3 && arg0 <= this.field3279[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
