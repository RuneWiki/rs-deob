package deob;

@ObfuscatedName("ee")
public class class85 {

    @ObfuscatedName("ee.b")
    public static final class85 field1185 = new class85(2);

    @ObfuscatedName("ee.c")
    public static final class85 field1186 = new class85(1);

    @ObfuscatedName("ee.i")
    public final int field1188;

    @ObfuscatedName("ee.v")
    public static final class85 field1194 = new class85(0);

    public class85(int arg0) {
        this.field1188 = arg0;
    }

    @ObfuscatedName("bj.v(II)Lee;")
    public static class85 method2158(int arg0) {
        class85[] var1 = new class85[] { field1194, field1185, field1186 };
        class85[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class85 var4 = var2[var3];
            if (var4.field1188 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
