package deob;

@ObfuscatedName("q")
public class class4 implements class195 {

    @ObfuscatedName("q.a")
    public static final class4 field19 = new class4(0, 0, Integer.class, new class2());

    @ObfuscatedName("q.t")
    public static final class4 field18 = new class4(1, 1, Long.class, new class3());

    @ObfuscatedName("q.n")
    public static final class4 field14 = new class4(2, 2, String.class, new class5());

    @ObfuscatedName("q.q")
    public final int field13;

    @ObfuscatedName("q.v")
    public final int field15;

    @ObfuscatedName("q.l")
    public final Class field17;

    @ObfuscatedName("q.c")
    public final class1 field12;

    public class4(int arg0, int arg1, Class arg2, class1 arg3) {
        this.field13 = arg0;
        this.field15 = arg1;
        this.field17 = arg2;
        this.field12 = arg3;
    }

    @ObfuscatedName("q.a(Ljava/lang/Class;I)Lq;")
    public static class4 method30(Class arg0) {
        class4[] var1 = new class4[] { field14, field19, field18 };
        class4[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class4 var4 = var2[var3];
            if (var4.field17 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("q.t(Ljava/lang/Object;Lkc;I)V")
    public static void method31(Object arg0, class300 arg1) {
        class1 var2 = method38(arg0.getClass());
        var2.method11(arg0, arg1);
    }

    @ObfuscatedName("q.n(Ljava/lang/Class;I)La;")
    public static class1 method38(Class arg0) {
        class4 var1 = method30(arg0);
        if (var1 == null) {
            throw new IllegalArgumentException();
        }
        return var1.field12;
    }

    @ObfuscatedName("q.q(I)I")
    public int method33() {
        return this.field15;
    }

    @ObfuscatedName("q.v(Lkc;I)Ljava/lang/Object;")
    public Object method34(class300 arg0) {
        return this.field12.method2(arg0);
    }
}
