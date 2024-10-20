package deob;

@ObfuscatedName("d")
public class class4 implements class204 {

    @ObfuscatedName("d.x")
    public static final class4 field12 = new class4(2, 0, Integer.class, new class2());

    @ObfuscatedName("d.m")
    public static final class4 field14 = new class4(0, 1, Long.class, new class3());

    @ObfuscatedName("d.k")
    public static final class4 field8 = new class4(1, 2, String.class, new class5());

    @ObfuscatedName("d.d")
    public final int field9;

    @ObfuscatedName("d.w")
    public final int field10;

    @ObfuscatedName("d.v")
    public final Class field11;

    @ObfuscatedName("d.q")
    public final class1 field6;

    @ObfuscatedName("d.x(I)[Ld;")
    public static class4[] method31() {
        return new class4[] { field8, field12, field14 };
    }

    public class4(int arg0, int arg1, Class arg2, class1 arg3) {
        this.field9 = arg0;
        this.field10 = arg1;
        this.field11 = arg2;
        this.field6 = arg3;
    }

    @ObfuscatedName("d.m(Ljava/lang/Class;I)Ld;")
    public static class4 method23(Class arg0) {
        class4[] var1 = method31();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class4 var3 = var1[var2];
            if (var3.field11 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("d.k(Ljava/lang/Class;I)Lx;")
    public static class1 method25(Class arg0) {
        class4 var1 = method23(arg0);
        if (var1 == null) {
            throw new IllegalArgumentException();
        }
        return var1.field6;
    }

    @ObfuscatedName("d.d(B)I")
    public int method26() {
        return this.field10;
    }

    @ObfuscatedName("d.w(Lkb;B)Ljava/lang/Object;")
    public Object method27(class310 arg0) {
        return this.field6.method2(arg0);
    }
}
