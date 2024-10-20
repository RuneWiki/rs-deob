package deob;

@ObfuscatedName("ka")
public class class288 extends class406 {

    @ObfuscatedName("ka.o")
    public final int field3341;

    @ObfuscatedName("ka.q")
    public final int field3340;

    @ObfuscatedName("ka.l")
    public final int[] field3342;

    @ObfuscatedName("ka.k")
    public final int[] field3343;

    public class288(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field3341 = arg0;
        this.field3340 = arg1;
        this.field3342 = arg2;
        this.field3343 = arg3;
    }

    @ObfuscatedName("ka.o(III)Z")
    public boolean method4898(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field3343.length) {
            int var3 = this.field3343[arg1];
            if (arg0 >= var3 && arg0 <= this.field3342[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
