package deob;

@ObfuscatedName("ej")
public class class137 {

    @ObfuscatedName("ej.j")
    public static final class137 field2316 = new class137(0);

    @ObfuscatedName("ej.r")
    public static final class137 field2317 = new class137(1);

    @ObfuscatedName("ej.v")
    public static final class137 field2315 = new class137(2);

    @ObfuscatedName("ej.p")
    public final int field2319;

    @ObfuscatedName("do.j(I)[Lej;")
    public static class137[] method2380() {
        return new class137[] { field2316, field2317, field2315 };
    }

    public class137(int arg0) {
        this.field2319 = arg0;
    }

    @ObfuscatedName("h.r(II)Lej;")
    public static class137 method229(int arg0) {
        class137[] var1 = method2380();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class137 var3 = var1[var2];
            if (var3.field2319 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
