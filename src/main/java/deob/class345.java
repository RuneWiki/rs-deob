package deob;

@ObfuscatedName("nw")
public class class345 extends class500 {

    @ObfuscatedName("nw.ak")
    public final int field3705;

    @ObfuscatedName("nw.al")
    public final int field3703;

    @ObfuscatedName("nw.aj")
    public final int[] field3704;

    @ObfuscatedName("nw.az")
    public final int[] field3702;

    public class345(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3705 = arg0;
        this.field3703 = arg1;
        this.field3704 = arg2;
        this.field3702 = arg3;
    }

    @ObfuscatedName("nw.ak(IIB)Z")
    public boolean method5869(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3702.length) {
            int var3 = this.field3702[arg1];
            if (arg0 >= var3 && arg0 <= this.field3704[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
