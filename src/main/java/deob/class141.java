package deob;

@ObfuscatedName("ey")
public class class141 {

    @ObfuscatedName("ey.f")
    public static final class141 field1567 = new class141(1, 0, 4);

    @ObfuscatedName("ey.o")
    public static final class141 field1564 = new class141(2, 1, 2);

    @ObfuscatedName("ey.u")
    public static final class141 field1566 = new class141(0, 2, 0);

    @ObfuscatedName("ey.p")
    public final int field1565;

    @ObfuscatedName("ey.b")
    public final int field1568;

    @ObfuscatedName("ey.e")
    public final int field1572;

    public class141(int arg0, int arg1, int arg2) {
        this.field1565 = arg0;
        this.field1568 = arg1;
        this.field1572 = arg2;
    }

    @ObfuscatedName("ey.f(FI)Z")
    public boolean method2357(float arg0) {
        return arg0 >= (float) this.field1572;
    }

    @ObfuscatedName("ey.o(II)Ley;")
    public static class141 method2356(int arg0) {
        class141[] var1 = new class141[] { field1566, field1567, field1564 };
        class141[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class141 var4 = var2[var3];
            if (var4.field1568 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
