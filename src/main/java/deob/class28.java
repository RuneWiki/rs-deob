package deob;

@ObfuscatedName("ai")
public final class class28 {

    @ObfuscatedName("ai.h")
    public final int[] field221;

    public class28() {
        this.field221 = new int[4096];
    }

    public class28(int[] arg0) {
        this.field221 = arg0;
    }

    @ObfuscatedName("ff.n([BI)Lai;")
    public static class28 method3399(byte[] arg0) {
        return arg0 == null ? new class28() : new class28(class49.method1931(arg0).field3883);
    }

    @ObfuscatedName("ai.h(III)I")
    public final int method357(int arg0, int arg1) {
        return this.field221[arg1 * 64 + arg0];
    }
}
