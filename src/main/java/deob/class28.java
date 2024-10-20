package deob;

@ObfuscatedName("aw")
public final class class28 {

    @ObfuscatedName("aw.t")
    public final int[] field216;

    public class28() {
        this.field216 = new int[4096];
    }

    public class28(int[] arg0) {
        this.field216 = arg0;
    }

    @ObfuscatedName("aw.a(III)I")
    public final int method391(int arg0, int arg1) {
        return this.field216[arg1 * 64 + arg0];
    }
}
