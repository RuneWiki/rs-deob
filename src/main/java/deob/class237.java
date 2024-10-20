package deob;

@ObfuscatedName("is")
public final class class237 {

    @ObfuscatedName("is.v")
    public final int[] field2828;

    public class237() {
        this.field2828 = new int[4096];
    }

    public class237(int[] arg0) {
        this.field2828 = arg0;
    }

    @ObfuscatedName("is.c(IIB)I")
    public final int method4581(int arg0, int arg1) {
        return this.field2828[arg1 * 64 + arg0];
    }
}
