package deob;

@ObfuscatedName("mc")
public class class319 extends class457 {

    @ObfuscatedName("mc.at")
    public final int field3504;

    @ObfuscatedName("mc.an")
    public final int field3506;

    @ObfuscatedName("mc.av")
    public final int[] field3507;

    @ObfuscatedName("mc.as")
    public final int[] field3510;

    public class319(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3504 = arg0;
        this.field3506 = arg1;
        this.field3507 = arg2;
        this.field3510 = arg3;
    }

    @ObfuscatedName("mc.at(IIB)Z")
    public boolean method5380(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3510.length) {
            int var3 = this.field3510[arg1];
            if (arg0 >= var3 && arg0 <= this.field3507[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
