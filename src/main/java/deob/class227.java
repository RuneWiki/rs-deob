package deob;

@ObfuscatedName("hz")
public class class227 extends class209 {

    @ObfuscatedName("hz.c")
    public final int field2593;

    @ObfuscatedName("hz.q")
    public final int field2590;

    @ObfuscatedName("hz.m")
    public final int[] field2591;

    @ObfuscatedName("hz.j")
    public final int[] field2592;

    public class227(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2593 = arg0;
        this.field2590 = arg1;
        this.field2591 = arg2;
        this.field2592 = arg3;
    }

    @ObfuscatedName("hz.c(III)Z")
    public boolean method4026(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2592.length) {
            int var3 = this.field2592[arg1];
            if (arg0 >= var3 && arg0 <= this.field2591[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
