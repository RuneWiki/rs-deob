package deob;

@ObfuscatedName("nl")
public class class350 extends class504 {

    @ObfuscatedName("nl.ac")
    public final int field3745;

    @ObfuscatedName("nl.ae")
    public final int field3747;

    @ObfuscatedName("nl.ag")
    public final int[] field3746;

    @ObfuscatedName("nl.am")
    public final int[] field3748;

    public class350(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3745 = arg0;
        this.field3747 = arg1;
        this.field3746 = arg2;
        this.field3748 = arg3;
    }

    @ObfuscatedName("nl.ac(III)Z")
    public boolean method6065(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3748.length) {
            int var3 = this.field3748[arg1];
            if (arg0 >= var3 && arg0 <= this.field3746[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
