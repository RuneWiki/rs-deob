package deob;

@ObfuscatedName("fx")
public class class176 extends class205 {

    @ObfuscatedName("fx.j")
    public final int field2891;

    @ObfuscatedName("fx.h")
    public final int field2892;

    @ObfuscatedName("fx.m")
    public final int[] field2896;

    @ObfuscatedName("fx.z")
    public final int[] field2893;

    public class176(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2891 = arg0;
        this.field2892 = arg1;
        this.field2896 = arg2;
        this.field2893 = arg3;
    }

    @ObfuscatedName("fx.j(III)Z")
    public boolean method3197(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2893.length) {
            int var3 = this.field2893[arg1];
            if (arg0 >= var3 && arg0 <= this.field2896[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
