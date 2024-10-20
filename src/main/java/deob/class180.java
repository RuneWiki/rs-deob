package deob;

@ObfuscatedName("fn")
public final class class180 {

    @ObfuscatedName("fn.t")
    public final int[] field2078;

    public class180() {
        this.field2078 = new int[4096];
    }

    public class180(int[] arg0) {
        this.field2078 = arg0;
    }

    @ObfuscatedName("fn.s(III)I")
    public final int method3262(int arg0, int arg1) {
        return this.field2078[arg1 * 64 + arg0];
    }
}
