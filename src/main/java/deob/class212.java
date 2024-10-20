package deob;

@ObfuscatedName("hf")
public class class212 extends class176 {

    @ObfuscatedName("hf.c")
    public final int field2529;

    @ObfuscatedName("hf.t")
    public final int field2526;

    @ObfuscatedName("hf.o")
    public final int[] field2528;

    @ObfuscatedName("hf.e")
    public final int[] field2531;

    public class212(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2529 = arg0;
        this.field2526 = arg1;
        this.field2528 = arg2;
        this.field2531 = arg3;
    }

    @ObfuscatedName("hf.c(III)Z")
    public boolean method3659(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2531.length) {
            int var3 = this.field2531[arg1];
            if (arg0 >= var3 && arg0 <= this.field2528[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
