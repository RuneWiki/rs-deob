package deob;

@ObfuscatedName("ir")
public final class class238 {

    @ObfuscatedName("ir.p")
    public final int[] field2855;

    public class238() {
        this.field2855 = new int[4096];
    }

    public class238(int[] arg0) {
        this.field2855 = arg0;
    }

    @ObfuscatedName("ir.c(IIB)I")
    public final int method4652(int arg0, int arg1) {
        return this.field2855[arg1 * 64 + arg0];
    }
}
