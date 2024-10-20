package deob;

@ObfuscatedName("at")
public final class class37 {

    @ObfuscatedName("at.k")
    public final int[] field256;

    public class37() {
        this.field256 = new int[4096];
    }

    public class37(int[] arg0) {
        this.field256 = arg0;
    }

    @ObfuscatedName("ah.z([BB)Lat;")
    public static class37 method539(byte[] arg0) {
        return arg0 == null ? new class37() : new class37(class59.method982(arg0).field3906);
    }

    @ObfuscatedName("at.k(III)I")
    public final int method413(int arg0, int arg1) {
        return this.field256[arg1 * 64 + arg0];
    }
}
