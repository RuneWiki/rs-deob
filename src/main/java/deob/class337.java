package deob;

@ObfuscatedName("mc")
public class class337 extends class488 {

    @ObfuscatedName("mc.aq")
    public final int field3615;

    @ObfuscatedName("mc.aw")
    public final int field3612;

    @ObfuscatedName("mc.al")
    public final int[] field3613;

    @ObfuscatedName("mc.ai")
    public final int[] field3611;

    public class337(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3615 = arg0;
        this.field3612 = arg1;
        this.field3613 = arg2;
        this.field3611 = arg3;
    }

    @ObfuscatedName("mc.aq(IIB)Z")
    public boolean method5749(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3611.length) {
            int var3 = this.field3611[arg1];
            if (arg0 >= var3 && arg0 <= this.field3613[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
