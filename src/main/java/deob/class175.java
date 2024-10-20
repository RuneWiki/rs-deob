package deob;

@ObfuscatedName("fc")
public class class175 extends class204 {

    @ObfuscatedName("fc.y")
    public final int field2866;

    @ObfuscatedName("fc.d")
    public final int field2867;

    @ObfuscatedName("fc.g")
    public final int[] field2868;

    @ObfuscatedName("fc.w")
    public final int[] field2870;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2866 = arg0;
        this.field2867 = arg1;
        this.field2868 = arg2;
        this.field2870 = arg3;
    }

    @ObfuscatedName("fc.y(IIB)Z")
    public boolean method3153(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2870.length) {
            int var3 = this.field2870[arg1];
            if (arg0 >= var3 && arg0 <= this.field2868[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
