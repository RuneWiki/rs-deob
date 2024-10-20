package deob;

@ObfuscatedName("kc")
public final class class283 {

    @ObfuscatedName("kc.al")
    public final int[] field3053;

    public class283() {
        this.field3053 = new int[4096];
    }

    public class283(int[] arg0) {
        this.field3053 = arg0;
    }

    @ObfuscatedName("rp.ac([BI)Lkc;")
    public static class283 method7344(byte[] arg0) {
        return arg0 == null ? new class283() : new class283(class31.method4487(arg0).field5235);
    }

    @ObfuscatedName("kc.al(IIS)I")
    public final int method5165(int arg0, int arg1) {
        return this.field3053[arg1 * 64 + arg0];
    }
}
