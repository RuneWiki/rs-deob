package deob;

@ObfuscatedName("kc")
public final class class261 {

    @ObfuscatedName("kc.an")
    public final int[] field3017;

    public class261() {
        this.field3017 = new int[4096];
    }

    public class261(int[] arg0) {
        this.field3017 = arg0;
    }

    @ObfuscatedName("kc.af(III)I")
    public final int method4992(int arg0, int arg1) {
        return this.field3017[arg1 * 64 + arg0];
    }
}
