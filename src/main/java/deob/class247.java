package deob;

@ObfuscatedName("ig")
public final class class247 {

    @ObfuscatedName("ig.f")
    public final int[] field2905;

    public class247() {
        this.field2905 = new int[4096];
    }

    public class247(int[] arg0) {
        this.field2905 = arg0;
    }

    @ObfuscatedName("ig.a(III)I")
    public final int method4711(int arg0, int arg1) {
        return this.field2905[arg1 * 64 + arg0];
    }
}
