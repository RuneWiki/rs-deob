package deob;

@ObfuscatedName("ir")
public final class class250 {

    @ObfuscatedName("ir.e")
    public final int[] field2969;

    public class250() {
        this.field2969 = new int[4096];
    }

    public class250(int[] arg0) {
        this.field2969 = arg0;
    }

    @ObfuscatedName("ir.h(III)I")
    public final int method4790(int arg0, int arg1) {
        return this.field2969[arg1 * 64 + arg0];
    }
}
