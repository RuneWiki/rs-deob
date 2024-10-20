package deob;

@ObfuscatedName("hf")
public class class211 extends class195 {

    @ObfuscatedName("hf.i")
    public final int field2608;

    @ObfuscatedName("hf.w")
    public final int field2603;

    @ObfuscatedName("hf.a")
    public final int[] field2609;

    @ObfuscatedName("hf.t")
    public final int[] field2605;

    public class211(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2608 = arg0;
        this.field2603 = arg1;
        this.field2609 = arg2;
        this.field2605 = arg3;
    }

    @ObfuscatedName("hf.i(IIB)Z")
    public boolean method3577(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2605.length) {
            int var3 = this.field2605[arg1];
            if (arg0 >= var3 && arg0 <= this.field2609[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
