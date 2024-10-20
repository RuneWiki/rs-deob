package deob;

@ObfuscatedName("hg")
public class class212 extends class176 {

    @ObfuscatedName("hg.q")
    public final int field2520;

    @ObfuscatedName("hg.w")
    public final int field2523;

    @ObfuscatedName("hg.e")
    public final int[] field2521;

    @ObfuscatedName("hg.p")
    public final int[] field2522;

    public class212(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2520 = arg0;
        this.field2523 = arg1;
        this.field2521 = arg2;
        this.field2522 = arg3;
    }

    @ObfuscatedName("hg.q(IIS)Z")
    public boolean method3596(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2522.length) {
            int var3 = this.field2522[arg1];
            if (arg0 >= var3 && arg0 <= this.field2521[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
