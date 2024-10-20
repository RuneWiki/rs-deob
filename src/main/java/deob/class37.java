package deob;

@ObfuscatedName("au")
public final class class37 {

    @ObfuscatedName("au.b")
    public final int[] field258;

    public class37() {
        this.field258 = new int[4096];
    }

    public class37(int[] arg0) {
        this.field258 = arg0;
    }

    @ObfuscatedName("cr.f([BI)Lau;")
    public static class37 method2168(byte[] arg0) {
        return arg0 == null ? new class37() : new class37(class59.method586(arg0).field3910);
    }

    @ObfuscatedName("au.b(III)I")
    public final int method438(int arg0, int arg1) {
        return this.field258[arg1 * 64 + arg0];
    }
}
