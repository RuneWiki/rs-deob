package deob;

@ObfuscatedName("w")
public class class4 implements class204 {

    @ObfuscatedName("w.h")
    public static final class4 field13 = new class4(0, 0, Integer.class, new class2());

    @ObfuscatedName("w.v")
    public static final class4 field14 = new class4(1, 1, Long.class, new class3());

    @ObfuscatedName("w.x")
    public static final class4 field9 = new class4(2, 2, String.class, new class5());

    @ObfuscatedName("w.w")
    public final int field10;

    @ObfuscatedName("w.t")
    public final int field11;

    @ObfuscatedName("w.j")
    public final Class field7;

    @ObfuscatedName("w.n")
    public final class1 field15;

    public class4(int arg0, int arg1, Class arg2, class1 arg3) {
        this.field10 = arg0;
        this.field11 = arg1;
        this.field7 = arg2;
        this.field15 = arg3;
    }

    @ObfuscatedName("w.h(Ljava/lang/Object;Lkj;I)V")
    public static void method16(Object arg0, class311 arg1) {
        class1 var2 = method28(arg0.getClass());
        var2.method3(arg0, arg1);
    }

    @ObfuscatedName("w.v(Ljava/lang/Class;I)Lh;")
    public static class1 method28(Class arg0) {
        class4[] var1 = new class4[] { field14, field13, field9 };
        class4[] var2 = var1;
        int var3 = 0;
        class4 var5;
        while (true) {
            if (var3 >= var2.length) {
                var5 = null;
                break;
            }
            class4 var4 = var2[var3];
            if (var4.field7 == arg0) {
                var5 = var4;
                break;
            }
            var3++;
        }
        if (var5 == null) {
            throw new IllegalArgumentException();
        }
        return var5.field15;
    }

    @ObfuscatedName("w.x(I)I")
    public int method18() {
        return this.field11;
    }

    @ObfuscatedName("w.w(Lkj;I)Ljava/lang/Object;")
    public Object method19(class311 arg0) {
        return this.field15.method2(arg0);
    }
}
