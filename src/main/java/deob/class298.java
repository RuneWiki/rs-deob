package deob;

@ObfuscatedName("lc")
public final class class298 {

    @ObfuscatedName("lc.ae")
    public final int[] field3219;

    public class298() {
        this.field3219 = new int[4096];
    }

    public class298(int[] arg0) {
        this.field3219 = arg0;
    }

    @ObfuscatedName("ch.ac([BI)Llc;")
    public static class298 method1039(byte[] arg0) {
        return arg0 == null ? new class298() : new class298(class31.method2805(arg0).field5513);
    }

    @ObfuscatedName("lc.ae(IIB)I")
    public final int method5609(int arg0, int arg1) {
        return this.field3219[arg1 * 64 + arg0];
    }
}
