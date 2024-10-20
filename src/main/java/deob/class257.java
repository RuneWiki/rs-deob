package deob;

@ObfuscatedName("jn")
public final class class257 {

    @ObfuscatedName("jn.al")
    public final int[] field2970;

    public class257() {
        this.field2970 = new int[4096];
    }

    public class257(int[] arg0) {
        this.field2970 = arg0;
    }

    @ObfuscatedName("jd.aj([BI)Ljn;")
    public static class257 method4418(byte[] arg0) {
        return arg0 == null ? new class257() : new class257(class31.method2942(arg0).field4997);
    }

    @ObfuscatedName("jn.al(III)I")
    public final int method4782(int arg0, int arg1) {
        return this.field2970[arg1 * 64 + arg0];
    }
}
