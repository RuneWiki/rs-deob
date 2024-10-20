package deob;

@ObfuscatedName("am")
public final class class28 {

    @ObfuscatedName("am.j")
    public final int[] field218;

    public class28() {
        this.field218 = new int[4096];
    }

    public class28(int[] arg0) {
        this.field218 = arg0;
    }

    @ObfuscatedName("am.s(III)I")
    public final int method345(int arg0, int arg1) {
        return this.field218[arg1 * 64 + arg0];
    }
}
