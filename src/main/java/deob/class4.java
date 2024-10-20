package deob;

@ObfuscatedName("p")
public class class4 implements class195 {

    @ObfuscatedName("p.q")
    public static final class4 field8 = new class4(2, 0, Integer.class, new class2());

    @ObfuscatedName("p.w")
    public static final class4 field10 = new class4(1, 1, Long.class, new class3());

    @ObfuscatedName("p.e")
    public static final class4 field15 = new class4(0, 2, String.class, new class5());

    @ObfuscatedName("p.p")
    public final int field11;

    @ObfuscatedName("p.k")
    public final int field12;

    @ObfuscatedName("p.l")
    public final Class field13;

    @ObfuscatedName("p.b")
    public final class1 field14;

    public class4(int arg0, int arg1, Class arg2, class1 arg3) {
        this.field11 = arg0;
        this.field12 = arg1;
        this.field13 = arg2;
        this.field14 = arg3;
    }

    @ObfuscatedName("p.q(Ljava/lang/Object;Lkf;B)V")
    public static void method21(Object arg0, class301 arg1) {
        class1 var2 = method22(arg0.getClass());
        var2.method2(arg0, arg1);
    }

    @ObfuscatedName("p.w(Ljava/lang/Class;I)Lq;")
    public static class1 method22(Class arg0) {
        class4[] var1 = new class4[] { field10, field15, field8 };
        class4[] var2 = var1;
        int var3 = 0;
        class4 var5;
        while (true) {
            if (var3 >= var2.length) {
                var5 = null;
                break;
            }
            class4 var4 = var2[var3];
            if (var4.field13 == arg0) {
                var5 = var4;
                break;
            }
            var3++;
        }
        if (var5 == null) {
            throw new IllegalArgumentException();
        }
        return var5.field14;
    }

    @ObfuscatedName("p.e(I)I")
    public int method30() {
        return this.field12;
    }

    @ObfuscatedName("p.p(Lkf;I)Ljava/lang/Object;")
    public Object method25(class301 arg0) {
        return this.field14.method3(arg0);
    }
}
