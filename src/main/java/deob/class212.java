package deob;

@ObfuscatedName("hg")
public class class212 extends class176 {

    @ObfuscatedName("hg.s")
    public final int field2498;

    @ObfuscatedName("hg.j")
    public final int field2501;

    @ObfuscatedName("hg.i")
    public final int[] field2499;

    @ObfuscatedName("hg.k")
    public final int[] field2497;

    public class212(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2498 = arg0;
        this.field2501 = arg1;
        this.field2499 = arg2;
        this.field2497 = arg3;
    }

    @ObfuscatedName("hg.s(III)Z")
    public boolean method3620(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2497.length) {
            int var3 = this.field2497[arg1];
            if (arg0 >= var3 && arg0 <= this.field2499[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
