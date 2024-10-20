package deob;

@ObfuscatedName("iq")
public class class242 extends class348 {

    @ObfuscatedName("iq.f")
    public final int field2920;

    @ObfuscatedName("iq.e")
    public final int field2919;

    @ObfuscatedName("iq.v")
    public final int[] field2917;

    @ObfuscatedName("iq.y")
    public final int[] field2918;

    public class242(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2920 = arg0;
        this.field2919 = arg1;
        this.field2917 = arg2;
        this.field2918 = arg3;
    }

    @ObfuscatedName("iq.f(III)Z")
    public boolean method4247(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2918.length) {
            int var3 = this.field2918[arg1];
            if (arg0 >= var3 && arg0 <= this.field2917[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
