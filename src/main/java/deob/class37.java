package deob;

@ObfuscatedName("aq")
public final class class37 {

    @ObfuscatedName("aq.v")
    public final int[] field248;

    public class37() {
        this.field248 = new int[4096];
    }

    public class37(int[] arg0) {
        this.field248 = arg0;
    }

    @ObfuscatedName("cn.h([BB)Laq;")
    public static class37 method2135(byte[] arg0) {
        return arg0 == null ? new class37() : new class37(class59.method263(arg0).field3918);
    }

    @ObfuscatedName("aq.v(III)I")
    public final int method404(int arg0, int arg1) {
        return this.field248[arg1 * 64 + arg0];
    }
}
