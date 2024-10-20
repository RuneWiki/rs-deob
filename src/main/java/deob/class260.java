package deob;

@ObfuscatedName("jg")
public final class class260 {

    @ObfuscatedName("jg.ad")
    public final int[] field2695;

    public class260() {
        this.field2695 = new int[4096];
    }

    public class260(int[] arg0) {
        this.field2695 = arg0;
    }

    @ObfuscatedName("fv.aq([BI)Ljg;")
    public static class260 method2963(byte[] arg0) {
        return arg0 == null ? new class260() : new class260(class31.method3511(arg0).field5466);
    }

    @ObfuscatedName("jg.ad(III)I")
    public final int method4571(int arg0, int arg1) {
        return this.field2695[arg1 * 64 + arg0];
    }
}
