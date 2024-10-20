package deob;

@ObfuscatedName("ga")
public final class class193 {

    @ObfuscatedName("ga.c")
    public final int[] field2162;

    public class193() {
        this.field2162 = new int[4096];
    }

    public class193(int[] arg0) {
        this.field2162 = arg0;
    }

    @ObfuscatedName("ie.n([BI)Lga;")
    public static class193 method4195(byte[] arg0) {
        return arg0 == null ? new class193() : new class193(class29.method259(arg0).field4369);
    }

    @ObfuscatedName("ga.c(III)I")
    public final int method3504(int arg0, int arg1) {
        return this.field2162[arg1 * 64 + arg0];
    }
}
