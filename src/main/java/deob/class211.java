package deob;

@ObfuscatedName("hr")
public class class211 extends class195 {

    @ObfuscatedName("hr.d")
    public final int field2581;

    @ObfuscatedName("hr.q")
    public final int field2582;

    @ObfuscatedName("hr.x")
    public final int[] field2580;

    @ObfuscatedName("hr.y")
    public final int[] field2579;

    public class211(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2581 = arg0;
        this.field2582 = arg1;
        this.field2580 = arg2;
        this.field2579 = arg3;
    }

    @ObfuscatedName("hr.d(IIB)Z")
    public boolean method3590(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2579.length) {
            int var3 = this.field2579[arg1];
            if (arg0 >= var3 && arg0 <= this.field2580[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
