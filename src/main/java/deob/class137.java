package deob;

@ObfuscatedName("ee")
public class class137 {

    @ObfuscatedName("ee.x")
    public static final class137 field2308 = new class137(0);

    @ObfuscatedName("ee.p")
    public static final class137 field2304 = new class137(1);

    @ObfuscatedName("ee.k")
    public static final class137 field2305 = new class137(2);

    @ObfuscatedName("ee.a")
    public final int field2303;

    @ObfuscatedName("cw.x(B)[Lee;")
    public static class137[] method2002() {
        return new class137[] { field2308, field2304, field2305 };
    }

    public class137(int arg0) {
        this.field2303 = arg0;
    }

    @ObfuscatedName("cv.p(IB)Lee;")
    public static class137 method1997(int arg0) {
        class137[] var1 = method2002();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class137 var3 = var1[var2];
            if (var3.field2303 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
