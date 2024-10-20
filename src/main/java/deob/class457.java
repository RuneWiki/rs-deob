package deob;

@ObfuscatedName("qr")
public class class457 implements class346 {

    @ObfuscatedName("qr.h")
    public static final class457 field4875 = new class457(0, 0, Integer.class, new class454());

    @ObfuscatedName("qr.e")
    public static final class457 field4871 = new class457(2, 1, Long.class, new class456());

    @ObfuscatedName("qr.v")
    public static final class457 field4872 = new class457(1, 2, String.class, new class458());

    @ObfuscatedName("qr.x")
    public final int field4873;

    @ObfuscatedName("qr.m")
    public final int field4877;

    @ObfuscatedName("qr.q")
    public final Class field4876;

    @ObfuscatedName("qr.f")
    public final class453 field4870;

    @ObfuscatedName("qr.h(S)[Lqr;")
    public static class457[] method7658() {
        return new class457[] { field4875, field4871, field4872 };
    }

    public class457(int arg0, int arg1, Class arg2, class453 arg3) {
        this.field4873 = arg0;
        this.field4877 = arg1;
        this.field4876 = arg2;
        this.field4870 = arg3;
    }

    @ObfuscatedName("qr.v(Ljava/lang/Class;B)Lqr;")
    public static class457 method7648(Class arg0) {
        class457[] var1 = method7658();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class457 var3 = var1[var2];
            if (var3.field4876 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("qr.x(Ljava/lang/Object;Lqy;I)V")
    public static void method7649(Object arg0, class467 arg1) {
        class453 var2 = method7659(arg0.getClass());
        var2.method7630(arg0, arg1);
    }

    @ObfuscatedName("qr.m(Ljava/lang/Class;B)Lqu;")
    public static class453 method7659(Class arg0) {
        class457 var1 = method7648(arg0);
        if (var1 == null) {
            throw new IllegalArgumentException();
        }
        return var1.field4870;
    }

    @ObfuscatedName("qr.e(B)I")
    public int method32() {
        return this.field4877;
    }

    @ObfuscatedName("qr.u(Lqy;I)Ljava/lang/Object;")
    public Object method7650(class467 arg0) {
        return this.field4870.method7631(arg0);
    }
}
