package deob;

@ObfuscatedName("fr")
public class class179 extends class208 {

    @ObfuscatedName("fr.f")
    public final int field2931;

    @ObfuscatedName("fr.e")
    public final int field2932;

    @ObfuscatedName("fr.n")
    public final int[] field2933;

    @ObfuscatedName("fr.t")
    public final int[] field2934;

    public class179(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2931 = arg0;
        this.field2932 = arg1;
        this.field2933 = arg2;
        this.field2934 = arg3;
    }

    @ObfuscatedName("fr.f(III)Z")
    public boolean method3292(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2934.length) {
            int var3 = this.field2934[arg1];
            if (arg0 >= var3 && arg0 <= this.field2933[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
