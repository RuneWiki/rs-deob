package deob;

@ObfuscatedName("al")
public final class class37 {

    @ObfuscatedName("al.v")
    public final int[] field263;

    public class37() {
        this.field263 = new int[4096];
    }

    public class37(int[] arg0) {
        this.field263 = arg0;
    }

    @ObfuscatedName("al.n(III)I")
    public final int method428(int arg0, int arg1) {
        return this.field263[arg1 * 64 + arg0];
    }
}
