package deob;

@ObfuscatedName("iy")
public final class class254 {

    @ObfuscatedName("iy.w")
    public final int[] field2978;

    public class254() {
        this.field2978 = new int[4096];
    }

    public class254(int[] arg0) {
        this.field2978 = arg0;
    }

    @ObfuscatedName("cl.f([BB)Liy;")
    public static class254 method2247(byte[] arg0) {
        return arg0 == null ? new class254() : new class254(class31.method4990(arg0).field5041);
    }

    @ObfuscatedName("iy.w(III)I")
    public final int method4904(int arg0, int arg1) {
        return this.field2978[arg1 * 64 + arg0];
    }
}
