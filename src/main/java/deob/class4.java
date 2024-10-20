package deob;

@ObfuscatedName("w")
public class class4 implements class195 {

    @ObfuscatedName("w.f")
    public static final class4 field20 = new class4(1, 0, Integer.class, new class2());

    @ObfuscatedName("w.i")
    public static final class4 field11 = new class4(2, 1, Long.class, new class3());

    @ObfuscatedName("w.y")
    public static final class4 field10 = new class4(0, 2, String.class, new class5());

    @ObfuscatedName("w.w")
    public final int field16;

    @ObfuscatedName("w.p")
    public final int field12;

    @ObfuscatedName("w.b")
    public final Class field13;

    @ObfuscatedName("w.e")
    public final class1 field14;

    public class4(int arg0, int arg1, Class arg2, class1 arg3) {
        this.field16 = arg0;
        this.field12 = arg1;
        this.field13 = arg2;
        this.field14 = arg3;
    }

    @ObfuscatedName("w.f(Ljava/lang/Object;Lkq;I)V")
    public static void method23(Object arg0, class300 arg1) {
        Class var2 = arg0.getClass();
        class4[] var3 = new class4[] { field20, field10, field11 };
        class4[] var4 = var3;
        int var5 = 0;
        class4 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class4 var6 = var4[var5];
            if (var6.field13 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            throw new IllegalArgumentException();
        }
        class1 var9 = var7.field14;
        var9.method7(arg0, arg1);
    }

    @ObfuscatedName("w.i(B)I")
    public int method28() {
        return this.field12;
    }

    @ObfuscatedName("w.y(Lkq;I)Ljava/lang/Object;")
    public Object method25(class300 arg0) {
        return this.field14.method2(arg0);
    }
}
