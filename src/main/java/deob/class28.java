package deob;

@ObfuscatedName("av")
public final class class28 {

    @ObfuscatedName("av.w")
    public final int[] field231;

    public class28() {
        this.field231 = new int[4096];
    }

    public class28(int[] arg0) {
        this.field231 = arg0;
    }

    @ObfuscatedName("av.q(IIB)I")
    public final int method352(int arg0, int arg1) {
        return this.field231[arg1 * 64 + arg0];
    }
}
