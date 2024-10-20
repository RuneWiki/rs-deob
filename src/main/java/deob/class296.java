package deob;

@ObfuscatedName("ly")
public final class class296 {

    @ObfuscatedName("ly.ay")
    public final int[] field3180;

    public class296() {
        this.field3180 = new int[4096];
    }

    public class296(int[] arg0) {
        this.field3180 = arg0;
    }

    @ObfuscatedName("se.ab([BI)Lly;")
    public static class296 method7931(byte[] arg0) {
        return arg0 == null ? new class296() : new class296(class31.method4354(arg0).field5481);
    }

    @ObfuscatedName("ly.ay(III)I")
    public final int method5459(int arg0, int arg1) {
        return this.field3180[arg1 * 64 + arg0];
    }
}
