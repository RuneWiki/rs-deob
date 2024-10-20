package deob;

@ObfuscatedName("nm")
public class class348 extends class502 {

    @ObfuscatedName("nm.ab")
    public final int field3697;

    @ObfuscatedName("nm.ay")
    public final int field3695;

    @ObfuscatedName("nm.an")
    public final int[] field3696;

    @ObfuscatedName("nm.au")
    public final int[] field3694;

    public class348(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3697 = arg0;
        this.field3695 = arg1;
        this.field3696 = arg2;
        this.field3694 = arg3;
    }

    @ObfuscatedName("nm.ab(III)Z")
    public boolean method5912(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3694.length) {
            int var3 = this.field3694[arg1];
            if (arg0 >= var3 && arg0 <= this.field3696[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
