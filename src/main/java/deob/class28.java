package deob;

@ObfuscatedName("at")
public final class class28 {

    @ObfuscatedName("at.x")
    public final int[] field225;

    public class28() {
        this.field225 = new int[4096];
    }

    public class28(int[] arg0) {
        this.field225 = arg0;
    }

    @ObfuscatedName("at.c(IIB)I")
    public final int method320(int arg0, int arg1) {
        return this.field225[arg1 * 64 + arg0];
    }
}
