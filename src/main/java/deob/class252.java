package deob;

@ObfuscatedName("jo")
public final class class252 {

    @ObfuscatedName("jo.ap")
    public final int[] field2634;

    public class252() {
        this.field2634 = new int[4096];
    }

    public class252(int[] arg0) {
        this.field2634 = arg0;
    }

    @ObfuscatedName("aw.am([BI)Ljo;")
    public static class252 method177(byte[] arg0) {
        return arg0 == null ? new class252() : new class252(class31.method3375(arg0).field5281);
    }

    @ObfuscatedName("jo.ap(III)I")
    public final int method4571(int arg0, int arg1) {
        return this.field2634[arg1 * 64 + arg0];
    }
}
