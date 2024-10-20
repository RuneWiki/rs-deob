package deob;

@ObfuscatedName("fa")
public class class175 extends class204 {

    @ObfuscatedName("fa.d")
    public final int field2881;

    @ObfuscatedName("fa.p")
    public final int field2883;

    @ObfuscatedName("fa.v")
    public final int[] field2877;

    @ObfuscatedName("fa.l")
    public final int[] field2878;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2881 = arg0;
        this.field2883 = arg1;
        this.field2877 = arg2;
        this.field2878 = arg3;
    }

    @ObfuscatedName("fa.d(III)Z")
    public boolean method3277(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2878.length) {
            int var3 = this.field2878[arg1];
            if (arg0 >= var3 && arg0 <= this.field2877[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
