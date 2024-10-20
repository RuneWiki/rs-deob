package deob;

@ObfuscatedName("mu")
public class class337 extends class489 {

    @ObfuscatedName("mu.az")
    public final int field3625;

    @ObfuscatedName("mu.ah")
    public final int field3630;

    @ObfuscatedName("mu.af")
    public final int[] field3626;

    @ObfuscatedName("mu.at")
    public final int[] field3627;

    public class337(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3625 = arg0;
        this.field3630 = arg1;
        this.field3626 = arg2;
        this.field3627 = arg3;
    }

    @ObfuscatedName("mu.az(IIB)Z")
    public boolean method5648(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3627.length) {
            int var3 = this.field3627[arg1];
            if (arg0 >= var3 && arg0 <= this.field3626[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
