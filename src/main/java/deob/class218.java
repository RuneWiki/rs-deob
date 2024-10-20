package deob;

@ObfuscatedName("hy")
public class class218 extends class202 {

    @ObfuscatedName("hy.b")
    public final int field2674;

    @ObfuscatedName("hy.s")
    public final int field2673;

    @ObfuscatedName("hy.r")
    public final int[] field2675;

    @ObfuscatedName("hy.g")
    public final int[] field2676;

    public class218(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2674 = arg0;
        this.field2673 = arg1;
        this.field2675 = arg2;
        this.field2676 = arg3;
    }

    @ObfuscatedName("hy.b(III)Z")
    public boolean method3680(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2676.length) {
            int var3 = this.field2676[arg1];
            if (arg0 >= var3 && arg0 <= this.field2675[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
