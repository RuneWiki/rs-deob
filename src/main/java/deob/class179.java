package deob;

@ObfuscatedName("fk")
public final class class179 {

    @ObfuscatedName("fk.e")
    public final int[] field2089;

    public class179() {
        this.field2089 = new int[4096];
    }

    public class179(int[] arg0) {
        this.field2089 = arg0;
    }

    @ObfuscatedName("fk.f(III)I")
    public final int method3319(int arg0, int arg1) {
        return this.field2089[arg1 * 64 + arg0];
    }
}
