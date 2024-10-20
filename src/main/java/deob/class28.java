package deob;

@ObfuscatedName("ad")
public final class class28 {

    @ObfuscatedName("ad.f")
    public final int[] field225;

    public class28() {
        this.field225 = new int[4096];
    }

    public class28(int[] arg0) {
        this.field225 = arg0;
    }

    @ObfuscatedName("ad.u(III)I")
    public final int method365(int arg0, int arg1) {
        return this.field225[arg1 * 64 + arg0];
    }
}
