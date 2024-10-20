package deob;

@ObfuscatedName("he")
public class class211 extends class195 {

    @ObfuscatedName("he.a")
    public final int field2601;

    @ObfuscatedName("he.j")
    public final int field2600;

    @ObfuscatedName("he.n")
    public final int[] field2602;

    @ObfuscatedName("he.r")
    public final int[] field2603;

    public class211(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2601 = arg0;
        this.field2600 = arg1;
        this.field2602 = arg2;
        this.field2603 = arg3;
    }

    @ObfuscatedName("he.a(IIB)Z")
    public boolean method3598(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2603.length) {
            int var3 = this.field2603[arg1];
            if (arg0 >= var3 && arg0 <= this.field2602[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
