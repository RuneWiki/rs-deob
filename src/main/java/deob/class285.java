package deob;

@ObfuscatedName("kw")
public final class class285 {

    @ObfuscatedName("kw.ah")
    public final int[] field3121;

    public class285() {
        this.field3121 = new int[4096];
    }

    public class285(int[] arg0) {
        this.field3121 = arg0;
    }

    @ObfuscatedName("kw.az(IIB)I")
    public final int method5206(int arg0, int arg1) {
        return this.field3121[arg1 * 64 + arg0];
    }
}
