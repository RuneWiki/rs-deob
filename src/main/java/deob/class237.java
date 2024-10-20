package deob;

@ObfuscatedName("iq")
public class class237 extends class219 {

    @ObfuscatedName("iq.t")
    public final int field2767;

    @ObfuscatedName("iq.q")
    public final int field2768;

    @ObfuscatedName("iq.i")
    public final int[] field2765;

    @ObfuscatedName("iq.a")
    public final int[] field2766;

    public class237(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2767 = arg0;
        this.field2768 = arg1;
        this.field2765 = arg2;
        this.field2766 = arg3;
    }

    @ObfuscatedName("iq.t(III)Z")
    public boolean method4029(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2766.length) {
            int var3 = this.field2766[arg1];
            if (arg0 >= var3 && arg0 <= this.field2765[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
