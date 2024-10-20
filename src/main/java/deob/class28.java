package deob;

@ObfuscatedName("av")
public final class class28 {

    @ObfuscatedName("av.i")
    public final int[] field216;

    public class28() {
        this.field216 = new int[4096];
    }

    public class28(int[] arg0) {
        this.field216 = arg0;
    }

    @ObfuscatedName("q.f([BI)Lav;")
    public static class28 method262(byte[] arg0) {
        return arg0 == null ? new class28() : new class28(class49.method74(arg0).field3873);
    }

    @ObfuscatedName("av.i(III)I")
    public final int method344(int arg0, int arg1) {
        return this.field216[arg1 * 64 + arg0];
    }
}
