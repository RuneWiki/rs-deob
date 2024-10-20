package deob;

@ObfuscatedName("mp")
public class class335 extends class484 {

    @ObfuscatedName("mp.ac")
    public final int field3564;

    @ObfuscatedName("mp.al")
    public final int field3559;

    @ObfuscatedName("mp.ak")
    public final int[] field3561;

    @ObfuscatedName("mp.ax")
    public final int[] field3562;

    public class335(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3564 = arg0;
        this.field3559 = arg1;
        this.field3561 = arg2;
        this.field3562 = arg3;
    }

    @ObfuscatedName("mp.ac(III)Z")
    public boolean method5613(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3562.length) {
            int var3 = this.field3562[arg1];
            if (arg0 >= var3 && arg0 <= this.field3561[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
