package deob;

@ObfuscatedName("kd")
public final class class269 {

    @ObfuscatedName("kd.ae")
    public final int[] field3027;

    public class269() {
        this.field3027 = new int[4096];
    }

    public class269(int[] arg0) {
        this.field3027 = arg0;
    }

    @ObfuscatedName("kd.au(IIB)I")
    public final int method5044(int arg0, int arg1) {
        return this.field3027[arg1 * 64 + arg0];
    }
}
