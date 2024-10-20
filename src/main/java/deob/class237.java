package deob;

@ObfuscatedName("ii")
public final class class237 {

    @ObfuscatedName("ii.h")
    public final int[] field2831;

    public class237() {
        this.field2831 = new int[4096];
    }

    public class237(int[] arg0) {
        this.field2831 = arg0;
    }

    @ObfuscatedName("co.s([BI)Lii;")
    public static class237 method1957(byte[] arg0) {
        return arg0 == null ? new class237() : new class237(class29.method2872(arg0).field4803);
    }

    @ObfuscatedName("ii.h(III)I")
    public final int method4476(int arg0, int arg1) {
        return this.field2831[arg1 * 64 + arg0];
    }
}
