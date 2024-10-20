package deob;

@ObfuscatedName("hn")
public class class212 extends class176 {

    @ObfuscatedName("hn.u")
    public final int field2522;

    @ObfuscatedName("hn.f")
    public final int field2523;

    @ObfuscatedName("hn.b")
    public final int[] field2521;

    @ObfuscatedName("hn.g")
    public final int[] field2524;

    public class212(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2522 = arg0;
        this.field2523 = arg1;
        this.field2521 = arg2;
        this.field2524 = arg3;
    }

    @ObfuscatedName("hn.u(III)Z")
    public boolean method3660(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2524.length) {
            int var3 = this.field2524[arg1];
            if (arg0 >= var3 && arg0 <= this.field2521[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
