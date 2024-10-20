package deob;

@ObfuscatedName("aq")
public final class class28 {

    @ObfuscatedName("aq.f")
    public final int[] field226;

    public class28() {
        this.field226 = new int[4096];
    }

    public class28(int[] arg0) {
        this.field226 = arg0;
    }

    @ObfuscatedName("bk.m([BB)Laq;")
    public static class28 method1007(byte[] arg0) {
        return arg0 == null ? new class28() : new class28(class49.method381(arg0).field3900);
    }

    @ObfuscatedName("aq.f(III)I")
    public final int method373(int arg0, int arg1) {
        return this.field226[arg1 * 64 + arg0];
    }
}
