package deob;

@ObfuscatedName("ht")
public class class221 extends class185 {

    @ObfuscatedName("ht.n")
    public final int field2546;

    @ObfuscatedName("ht.v")
    public final int field2547;

    @ObfuscatedName("ht.d")
    public final int[] field2548;

    @ObfuscatedName("ht.c")
    public final int[] field2552;

    public class221(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2546 = arg0;
        this.field2547 = arg1;
        this.field2548 = arg2;
        this.field2552 = arg3;
    }

    @ObfuscatedName("ht.n(III)Z")
    public boolean method3812(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2552.length) {
            int var3 = this.field2552[arg1];
            if (arg0 >= var3 && arg0 <= this.field2548[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
