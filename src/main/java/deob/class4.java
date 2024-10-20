package deob;

@ObfuscatedName("x")
public class class4 implements class196 {

    @ObfuscatedName("x.a")
    public static final class4 field16 = new class4(0, 0, Integer.class, new class2());

    @ObfuscatedName("x.s")
    public static final class4 field18 = new class4(2, 1, Long.class, new class3());

    @ObfuscatedName("x.g")
    public static final class4 field17 = new class4(1, 2, String.class, new class5());

    @ObfuscatedName("x.x")
    public final int field14;

    @ObfuscatedName("x.h")
    public final int field15;

    @ObfuscatedName("x.f")
    public final Class field13;

    @ObfuscatedName("x.p")
    public final class1 field12;

    @ObfuscatedName("x.a(B)[Lx;")
    public static class4[] method41() {
        return new class4[] { field16, field17, field18 };
    }

    public class4(int arg0, int arg1, Class arg2, class1 arg3) {
        this.field14 = arg0;
        this.field15 = arg1;
        this.field13 = arg2;
        this.field12 = arg3;
    }

    @ObfuscatedName("x.s(Ljava/lang/Class;I)Lx;")
    public static class4 method30(Class arg0) {
        class4[] var1 = method41();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class4 var3 = var1[var2];
            if (var3.field13 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("x.g(Ljava/lang/Class;I)La;")
    public static class1 method38(Class arg0) {
        class4 var1 = method30(arg0);
        if (var1 == null) {
            throw new IllegalArgumentException();
        }
        return var1.field12;
    }

    @ObfuscatedName("x.x(I)I")
    public int method32() {
        return this.field15;
    }

    @ObfuscatedName("x.h(Lgx;I)Ljava/lang/Object;")
    public Object method33(class190 arg0) {
        return this.field12.method3(arg0);
    }
}
