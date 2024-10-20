package deob;

@ObfuscatedName("g")
public class class4 implements class196 {

    @ObfuscatedName("g.n")
    public static final class4 field16 = new class4(1, 0, Integer.class, new class2());

    @ObfuscatedName("g.h")
    public static final class4 field15 = new class4(0, 1, Long.class, new class3());

    @ObfuscatedName("g.l")
    public static final class4 field22 = new class4(2, 2, String.class, new class5());

    @ObfuscatedName("g.g")
    public final int field17;

    @ObfuscatedName("g.b")
    public final int field18;

    @ObfuscatedName("g.a")
    public final Class field20;

    @ObfuscatedName("g.c")
    public final class1 field19;

    public class4(int arg0, int arg1, Class arg2, class1 arg3) {
        this.field17 = arg0;
        this.field18 = arg1;
        this.field20 = arg2;
        this.field19 = arg3;
    }

    @ObfuscatedName("g.n(Ljava/lang/Object;Lgc;I)V")
    public static void method19(Object arg0, class190 arg1) {
        class1 var2 = method20(arg0.getClass());
        var2.method4(arg0, arg1);
    }

    @ObfuscatedName("g.h(Ljava/lang/Class;I)Ln;")
    public static class1 method20(Class arg0) {
        class4[] var1 = new class4[] { field22, field15, field16 };
        class4[] var2 = var1;
        int var3 = 0;
        class4 var5;
        while (true) {
            if (var3 >= var2.length) {
                var5 = null;
                break;
            }
            class4 var4 = var2[var3];
            if (var4.field20 == arg0) {
                var5 = var4;
                break;
            }
            var3++;
        }
        if (var5 == null) {
            throw new IllegalArgumentException();
        }
        return var5.field19;
    }

    @ObfuscatedName("g.l(B)I")
    public int method29() {
        return this.field18;
    }

    @ObfuscatedName("g.g(Lgc;B)Ljava/lang/Object;")
    public Object method31(class190 arg0) {
        return this.field19.method1(arg0);
    }
}
