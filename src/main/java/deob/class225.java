package deob;

@ObfuscatedName("hr")
public class class225 extends class207 {

    @ObfuscatedName("hr.w")
    public final int field2571;

    @ObfuscatedName("hr.m")
    public final int field2576;

    @ObfuscatedName("hr.q")
    public final int[] field2573;

    @ObfuscatedName("hr.b")
    public final int[] field2574;

    public class225(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2571 = arg0;
        this.field2576 = arg1;
        this.field2573 = arg2;
        this.field2574 = arg3;
    }

    @ObfuscatedName("hr.w(III)Z")
    public boolean method4091(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2574.length) {
            int var3 = this.field2574[arg1];
            if (arg0 >= var3 && arg0 <= this.field2573[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
