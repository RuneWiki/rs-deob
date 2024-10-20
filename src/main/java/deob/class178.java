package deob;

@ObfuscatedName("fd")
public final class class178 {

    @ObfuscatedName("fd.n")
    public final int[] field2089;

    public class178() {
        this.field2089 = new int[4096];
    }

    public class178(int[] arg0) {
        this.field2089 = arg0;
    }

    @ObfuscatedName("fd.n(III)I")
    public final int method3327(int arg0, int arg1) {
        return this.field2089[arg1 * 64 + arg0];
    }
}
