package deob;

@ObfuscatedName("hn")
public final class class213 {

    @ObfuscatedName("hn.c")
    public final int[] field2371;

    public class213() {
        this.field2371 = new int[4096];
    }

    public class213(int[] arg0) {
        this.field2371 = arg0;
    }

    @ObfuscatedName("bg.v([BI)Lhn;")
    public static class213 method1714(byte[] arg0) {
        return arg0 == null ? new class213() : new class213(class29.method1805(arg0).field4717);
    }

    @ObfuscatedName("hn.c(III)I")
    public final int method3931(int arg0, int arg1) {
        return this.field2371[arg1 * 64 + arg0];
    }
}
