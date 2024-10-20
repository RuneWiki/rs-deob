package deob;

@ObfuscatedName("kv")
public final class class268 {

    @ObfuscatedName("kv.an")
    public final int[] field3008;

    public class268() {
        this.field3008 = new int[4096];
    }

    public class268(int[] arg0) {
        this.field3008 = arg0;
    }

    @ObfuscatedName("kv.at(III)I")
    public final int method4992(int arg0, int arg1) {
        return this.field3008[arg1 * 64 + arg0];
    }
}
