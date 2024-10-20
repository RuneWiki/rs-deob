package deob;

@ObfuscatedName("fl")
public class class175 extends class204 {

    @ObfuscatedName("fl.h")
    public final int field2874;

    @ObfuscatedName("fl.q")
    public final int field2872;

    @ObfuscatedName("fl.v")
    public final int[] field2873;

    @ObfuscatedName("fl.n")
    public final int[] field2875;

    public class175(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        this.field2874 = arg0;
        this.field2872 = arg1;
        this.field2873 = arg2;
        this.field2875 = arg3;
    }

    @ObfuscatedName("fl.h(III)Z")
    public boolean method3273(int arg0, int arg1) {
        if (arg1 >= 0 && arg1 < this.field2875.length) {
            int var3 = this.field2875[arg1];
            if (arg0 >= var3 && arg0 <= this.field2873[arg1] + var3) {
                return true;
            }
        }
        return false;
    }
}
