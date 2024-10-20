package deob;

@ObfuscatedName("g")
public class class4 implements class195 {

    @ObfuscatedName("g.u")
    public static final class4 field12 = new class4(0, 0, Integer.class, new class2());

    @ObfuscatedName("g.f")
    public static final class4 field16 = new class4(2, 1, Long.class, new class3());

    @ObfuscatedName("g.b")
    public static final class4 field14 = new class4(1, 2, String.class, new class5());

    @ObfuscatedName("g.g")
    public final int field15;

    @ObfuscatedName("g.z")
    public final int field20;

    @ObfuscatedName("g.p")
    public final Class field17;

    @ObfuscatedName("g.h")
    public final class1 field18;

    @ObfuscatedName("g.u(I)[Lg;")
    public static class4[] method32() {
        return new class4[] { field16, field12, field14 };
    }

    public class4(int arg0, int arg1, Class arg2, class1 arg3) {
        this.field15 = arg0;
        this.field20 = arg1;
        this.field17 = arg2;
        this.field18 = arg3;
    }

    @ObfuscatedName("g.f(Ljava/lang/Object;Lkg;B)V")
    public static void method24(Object arg0, class300 arg1) {
        class1 var2 = method25(arg0.getClass());
        var2.method6(arg0, arg1);
    }

    @ObfuscatedName("g.b(Ljava/lang/Class;I)Lu;")
    public static class1 method25(Class arg0) {
        class4[] var1 = method32();
        int var2 = 0;
        class4 var4;
        while (true) {
            if (var2 >= var1.length) {
                var4 = null;
                break;
            }
            class4 var3 = var1[var2];
            if (var3.field17 == arg0) {
                var4 = var3;
                break;
            }
            var2++;
        }
        if (var4 == null) {
            throw new IllegalArgumentException();
        }
        return var4.field18;
    }

    @ObfuscatedName("g.g(B)I")
    public int method26() {
        return this.field20;
    }

    @ObfuscatedName("g.z(Lkg;I)Ljava/lang/Object;")
    public Object method27(class300 arg0) {
        return this.field18.method1(arg0);
    }
}
