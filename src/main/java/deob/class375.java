package deob;

@ObfuscatedName("np")
public class class375 implements class288 {

    @ObfuscatedName("np.v")
    public static final class375 field4132 = new class375(2, 0, Integer.class, new class372());

    @ObfuscatedName("np.n")
    public static final class375 field4129 = new class375(0, 1, Long.class, new class374());

    @ObfuscatedName("np.f")
    public static final class375 field4130 = new class375(1, 2, String.class, new class376());

    @ObfuscatedName("np.y")
    public final int field4131;

    @ObfuscatedName("np.p")
    public final int field4136;

    @ObfuscatedName("np.j")
    public final Class field4128;

    @ObfuscatedName("np.r")
    public final class371 field4134;

    @ObfuscatedName("np.y(I)[Lnp;")
    public static class375[] method5885() {
        return new class375[] { field4132, field4129, field4130 };
    }

    public class375(int arg0, int arg1, Class arg2, class371 arg3) {
        this.field4131 = arg0;
        this.field4136 = arg1;
        this.field4128 = arg2;
        this.field4134 = arg3;
    }

    @ObfuscatedName("np.p(Ljava/lang/Class;B)Lnp;")
    public static class375 method5888(Class arg0) {
        class375[] var1 = method5885();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class375 var3 = var1[var2];
            if (var3.field4128 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("np.j(Ljava/lang/Object;Lnd;I)V")
    public static void method5884(Object arg0, class383 arg1) {
        class371 var2 = method5887(arg0.getClass());
        var2.method5871(arg0, arg1);
    }

    @ObfuscatedName("np.r(Ljava/lang/Class;S)Lnv;")
    public static class371 method5887(Class arg0) {
        class375 var1 = method5888(arg0);
        if (var1 == null) {
            throw new IllegalArgumentException();
        }
        return var1.field4134;
    }

    @ObfuscatedName("np.v(I)I")
    public int method227() {
        return this.field4136;
    }

    @ObfuscatedName("np.b(Lnd;I)Ljava/lang/Object;")
    public Object method5889(class383 arg0) {
        return this.field4134.method5873(arg0);
    }
}
