package deob;

@ObfuscatedName("ld")
public final class class297 {

    @ObfuscatedName("ld.aw")
    public final int[] field3232;

    public class297() {
        this.field3232 = new int[4096];
    }

    public class297(int[] arg0) {
        this.field3232 = arg0;
    }

    @ObfuscatedName("ld.ap(III)I")
    public final int method5800(int arg0, int arg1) {
        return this.field3232[arg1 * 64 + arg0];
    }
}
