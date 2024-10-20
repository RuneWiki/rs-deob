package deob;

@ObfuscatedName("ej")
public class class137 {

    @ObfuscatedName("ej.a")
    public static final class137 field2322 = new class137(0);

    @ObfuscatedName("ej.x")
    public static final class137 field2317 = new class137(1);

    @ObfuscatedName("ej.e")
    public static final class137 field2318 = new class137(2);

    @ObfuscatedName("ej.r")
    public final int field2323;

    @ObfuscatedName("bx.a(I)[Lej;")
    public static class137[] method1354() {
        return new class137[] { field2318, field2322, field2317 };
    }

    public class137(int arg0) {
        this.field2323 = arg0;
    }

    @ObfuscatedName("da.x(IB)Lej;")
    public static class137 method2177(int arg0) {
        class137[] var1 = method1354();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class137 var3 = var1[var2];
            if (var3.field2323 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
