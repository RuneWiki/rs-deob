package deob;

@ObfuscatedName("fi")
public class class165 {

    @ObfuscatedName("fi.s")
    public static final class165 field1917 = new class165(0, 0, 4);

    @ObfuscatedName("fi.t")
    public static final class165 field1922 = new class165(1, 1, 2);

    @ObfuscatedName("fi.v")
    public static final class165 field1918 = new class165(2, 2, 0);

    @ObfuscatedName("fi.j")
    public final int field1919;

    @ObfuscatedName("fi.l")
    public final int field1920;

    @ObfuscatedName("fi.n")
    public final int field1921;

    @ObfuscatedName("fi.s(B)[Lfi;")
    public static class165[] method2916() {
        return new class165[] { field1918, field1922, field1917 };
    }

    public class165(int arg0, int arg1, int arg2) {
        this.field1919 = arg0;
        this.field1920 = arg1;
        this.field1921 = arg2;
    }

    @ObfuscatedName("fi.t(FI)Z")
    public boolean method2910(float arg0) {
        return arg0 >= (float) this.field1921;
    }

    @ObfuscatedName("fi.v(II)Lfi;")
    public static class165 method2911(int arg0) {
        class165[] var1 = method2916();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class165 var3 = var1[var2];
            if (var3.field1920 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
