package deob;

@ObfuscatedName("gw")
public final class class193 {

    @ObfuscatedName("gw.q")
    public final int[] field2175;

    public class193() {
        this.field2175 = new int[4096];
    }

    public class193(int[] arg0) {
        this.field2175 = arg0;
    }

    @ObfuscatedName("fx.l([BB)Lgw;")
    public static class193 method3372(byte[] arg0) {
        return arg0 == null ? new class193() : new class193(class29.method2511(arg0).field4385);
    }

    @ObfuscatedName("gw.q(III)I")
    public final int method3545(int arg0, int arg1) {
        return this.field2175[arg1 * 64 + arg0];
    }
}
