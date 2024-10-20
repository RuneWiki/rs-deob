package deob;

@ObfuscatedName("hl")
public final class class230 {

    @ObfuscatedName("hl.l")
    public final int[] field2755;

    public class230() {
        this.field2755 = new int[4096];
    }

    public class230(int[] arg0) {
        this.field2755 = arg0;
    }

    @ObfuscatedName("hl.c(III)I")
    public final int method4344(int arg0, int arg1) {
        return this.field2755[arg1 * 64 + arg0];
    }
}
