package deob;

@ObfuscatedName("lx")
public class class302 extends class439 {

    @ObfuscatedName("lx.aj")
    public final int field3422;

    @ObfuscatedName("lx.al")
    public final int field3420;

    @ObfuscatedName("lx.ac")
    public final int[] field3421;

    @ObfuscatedName("lx.ab")
    public final int[] field3423;

    public class302(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3422 = arg0;
        this.field3420 = arg1;
        this.field3421 = arg2;
        this.field3423 = arg3;
    }

    @ObfuscatedName("lx.aj(III)Z")
    public boolean method5193(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3423.length) {
            int var3 = this.field3423[arg1];
            if (arg0 >= var3 && arg0 <= this.field3421[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
