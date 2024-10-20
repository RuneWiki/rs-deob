package deob;

@ObfuscatedName("az")
public final class class28 {

    @ObfuscatedName("az.n")
    public final int[] field221;

    public class28() {
        this.field221 = new int[4096];
    }

    public class28(int[] arg0) {
        this.field221 = arg0;
    }

    @ObfuscatedName("az.z(IIS)I")
    public final int method368(int arg0, int arg1) {
        return this.field221[arg1 * 64 + arg0];
    }
}
