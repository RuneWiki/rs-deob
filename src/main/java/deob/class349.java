package deob;

@ObfuscatedName("nw")
public class class349 extends class511 {

    @ObfuscatedName("nw.ap")
    public final int field3766;

    @ObfuscatedName("nw.aw")
    public final int field3770;

    @ObfuscatedName("nw.ak")
    public final int[] field3768;

    @ObfuscatedName("nw.aj")
    public final int[] field3769;

    public class349(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3766 = arg0;
        this.field3770 = arg1;
        this.field3768 = arg2;
        this.field3769 = arg3;
    }

    @ObfuscatedName("nw.ap(III)Z")
    public boolean method6238(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3769.length) {
            int var3 = this.field3769[arg1];
            if (arg0 >= var3 && arg0 <= this.field3768[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
