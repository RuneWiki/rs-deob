package deob;

@ObfuscatedName("af")
public final class class28 {

    @ObfuscatedName("af.t")
    public final int[] field246;

    public class28() {
        this.field246 = new int[4096];
    }

    public class28(int[] arg0) {
        this.field246 = arg0;
    }

    @ObfuscatedName("hu.c([BI)Laf;")
    public static class28 method3822(byte[] arg0) {
        return arg0 == null ? new class28() : new class28(class50.method151(arg0).field3875);
    }

    @ObfuscatedName("af.t(IIB)I")
    public final int method373(int arg0, int arg1) {
        return this.field246[arg1 * 64 + arg0];
    }
}
