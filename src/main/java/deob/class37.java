package deob;

@ObfuscatedName("as")
public final class class37 {

    @ObfuscatedName("as.o")
    public final int[] field256;

    public class37() {
        this.field256 = new int[4096];
    }

    public class37(int[] arg0) {
        this.field256 = arg0;
    }

    @ObfuscatedName("as.m(III)I")
    public final int method397(int arg0, int arg1) {
        return this.field256[arg1 * 64 + arg0];
    }
}
