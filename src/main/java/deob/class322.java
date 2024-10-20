package deob;

@ObfuscatedName("mi")
public class class322 extends class470 {

    @ObfuscatedName("mi.aw")
    public final int field3523;

    @ObfuscatedName("mi.ay")
    public final int field3524;

    @ObfuscatedName("mi.ar")
    public final int[] field3525;

    @ObfuscatedName("mi.am")
    public final int[] field3526;

    public class322(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3523 = arg0;
        this.field3524 = arg1;
        this.field3525 = arg2;
        this.field3526 = arg3;
    }

    @ObfuscatedName("mi.aw(III)Z")
    public boolean method5474(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3526.length) {
            int var3 = this.field3526[arg1];
            if (arg0 >= var3 && arg0 <= this.field3525[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
