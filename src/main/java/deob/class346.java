package deob;

@ObfuscatedName("nw")
public class class346 extends class501 {

    @ObfuscatedName("nw.aq")
    public final int field3725;

    @ObfuscatedName("nw.ad")
    public final int field3726;

    @ObfuscatedName("nw.ag")
    public final int[] field3727;

    @ObfuscatedName("nw.ak")
    public final int[] field3724;

    public class346(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3725 = arg0;
        this.field3726 = arg1;
        this.field3727 = arg2;
        this.field3724 = arg3;
    }

    @ObfuscatedName("nw.aq(IIB)Z")
    public boolean method5823(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3724.length) {
            int var3 = this.field3724[arg1];
            if (arg0 >= var3 && arg0 <= this.field3727[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
