package deob;

@ObfuscatedName("m")
public class class4 implements class204 {

    @ObfuscatedName("m.f")
    public static final class4 field12 = new class4(0, 0, Integer.class, new class2());

    @ObfuscatedName("m.b")
    public static final class4 field10 = new class4(1, 1, Long.class, new class3());

    @ObfuscatedName("m.l")
    public static final class4 field11 = new class4(2, 2, String.class, new class5());

    @ObfuscatedName("m.m")
    public final int field15;

    @ObfuscatedName("m.z")
    public final int field13;

    @ObfuscatedName("m.q")
    public final Class field14;

    @ObfuscatedName("m.k")
    public final class1 field17;

    @ObfuscatedName("m.f(B)[Lm;")
    public static class4[] method28() {
        return new class4[] { field11, field12, field10 };
    }

    public class4(int arg0, int arg1, Class arg2, class1 arg3) {
        this.field15 = arg0;
        this.field13 = arg1;
        this.field14 = arg2;
        this.field17 = arg3;
    }

    @ObfuscatedName("m.b(Ljava/lang/Object;Lkb;I)V")
    public static void method42(Object arg0, class311 arg1) {
        class1 var2 = method30(arg0.getClass());
        var2.method2(arg0, arg1);
    }

    @ObfuscatedName("m.l(Ljava/lang/Class;I)Lf;")
    public static class1 method30(Class arg0) {
        class4[] var1 = method28();
        int var2 = 0;
        class4 var4;
        while (true) {
            if (var2 >= var1.length) {
                var4 = null;
                break;
            }
            class4 var3 = var1[var2];
            if (var3.field14 == arg0) {
                var4 = var3;
                break;
            }
            var2++;
        }
        if (var4 == null) {
            throw new IllegalArgumentException();
        }
        return var4.field17;
    }

    @ObfuscatedName("m.m(B)I")
    public int method31() {
        return this.field13;
    }

    @ObfuscatedName("m.z(Lkb;I)Ljava/lang/Object;")
    public Object method32(class311 arg0) {
        return this.field17.method6(arg0);
    }
}
