package deob;

@ObfuscatedName("ej")
public class class91 {

    @ObfuscatedName("ej.b")
    public static final class91 field1290 = new class91("RC", 1);

    @ObfuscatedName("ej.c")
    public static final class91 field1289 = new class91("BUILDLIVE", 3);

    @ObfuscatedName("ej.m")
    public final String field1288;

    @ObfuscatedName("ej.i")
    public static final class91 field1292 = new class91("WIP", 2);

    @ObfuscatedName("ej.v")
    public static final class91 field1291 = new class91("LIVE", 0);

    @ObfuscatedName("ej.z")
    public final int field1293;

    public class91(String arg0, int arg1) {
        this.field1288 = arg0;
        this.field1293 = arg1;
    }

    @ObfuscatedName("ce.v(IB)Lej;")
    public static class91 method2809(int arg0) {
        class91[] var1 = new class91[] { field1291, field1289, field1292, field1290 };
        class91[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class91 var4 = var2[var3];
            if (var4.field1293 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
