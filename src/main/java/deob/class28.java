package deob;

@ObfuscatedName("af")
public final class class28 {

    @ObfuscatedName("af.s")
    public final int[] field241;

    public class28() {
        this.field241 = new int[4096];
    }

    public class28(int[] arg0) {
        this.field241 = arg0;
    }

    @ObfuscatedName("ba.a([BB)Laf;")
    public static class28 method1890(byte[] arg0) {
        return arg0 == null ? new class28() : new class28(class49.method3425(arg0).field3895);
    }

    @ObfuscatedName("af.s(IIB)I")
    public final int method370(int arg0, int arg1) {
        return this.field241[arg1 * 64 + arg0];
    }
}
