package deob;

@ObfuscatedName("e")
public class class4 implements class195 {

    @ObfuscatedName("e.c")
    public static final class4 field23 = new class4(0, 0, Integer.class, new class2());

    @ObfuscatedName("e.t")
    public static final class4 field16 = new class4(1, 1, Long.class, new class3());

    @ObfuscatedName("e.o")
    public static final class4 field17 = new class4(2, 2, String.class, new class5());

    @ObfuscatedName("e.e")
    public final int field18;

    @ObfuscatedName("e.i")
    public final int field19;

    @ObfuscatedName("e.g")
    public final Class field20;

    @ObfuscatedName("e.d")
    public final class1 field21;

    public class4(int arg0, int arg1, Class arg2, class1 arg3) {
        this.field18 = arg0;
        this.field19 = arg1;
        this.field20 = arg2;
        this.field21 = arg3;
    }

    @ObfuscatedName("e.c(Ljava/lang/Class;I)Le;")
    public static class4 method38(Class arg0) {
        class4[] var1 = new class4[] { field16, field23, field17 };
        class4[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class4 var4 = var2[var3];
            if (var4.field20 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("e.t(Ljava/lang/Object;Lkp;B)V")
    public static void method22(Object arg0, class301 arg1) {
        class1 var2 = method23(arg0.getClass());
        var2.method7(arg0, arg1);
    }

    @ObfuscatedName("e.o(Ljava/lang/Class;I)Lc;")
    public static class1 method23(Class arg0) {
        class4 var1 = method38(arg0);
        if (var1 == null) {
            throw new IllegalArgumentException();
        }
        return var1.field21;
    }

    @ObfuscatedName("e.e(B)I")
    public int method33() {
        return this.field19;
    }

    @ObfuscatedName("e.i(Lkp;I)Ljava/lang/Object;")
    public Object method25(class301 arg0) {
        return this.field21.method2(arg0);
    }
}
