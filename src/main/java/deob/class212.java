package deob;

@ObfuscatedName("hn")
public class class212 extends class176 {

    @ObfuscatedName("hn.a")
    public final int field2498;

    @ObfuscatedName("hn.t")
    public final int field2501;

    @ObfuscatedName("hn.n")
    public final int[] field2499;

    @ObfuscatedName("hn.q")
    public final int[] field2497;

    public class212(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2498 = arg0;
        this.field2501 = arg1;
        this.field2499 = arg2;
        this.field2497 = arg3;
    }

    @ObfuscatedName("hn.a(III)Z")
    public boolean method3708(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2497.length) {
            int var3 = this.field2497[arg1];
            if (arg0 >= var3 && arg0 <= this.field2499[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
