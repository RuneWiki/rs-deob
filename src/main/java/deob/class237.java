package deob;

@ObfuscatedName("in")
public class class237 extends class219 {

    @ObfuscatedName("in.g")
    public final int field2781;

    @ObfuscatedName("in.e")
    public final int field2783;

    @ObfuscatedName("in.b")
    public final int[] field2782;

    @ObfuscatedName("in.z")
    public final int[] field2780;

    public class237(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2781 = arg0;
        this.field2783 = arg1;
        this.field2782 = arg2;
        this.field2780 = arg3;
    }

    @ObfuscatedName("in.g(IIB)Z")
    public boolean method4108(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2780.length) {
            int var3 = this.field2780[arg1];
            if (arg0 >= var3 && arg0 <= this.field2782[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
