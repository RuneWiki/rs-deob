package deob;

@ObfuscatedName("ix")
public final class class238 {

    @ObfuscatedName("ix.q")
    public final int[] field2865;

    public class238() {
        this.field2865 = new int[4096];
    }

    public class238(int[] arg0) {
        this.field2865 = arg0;
    }

    @ObfuscatedName("ix.o(IIB)I")
    public final int method4437(int arg0, int arg1) {
        return this.field2865[arg1 * 64 + arg0];
    }
}
