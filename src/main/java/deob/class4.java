package deob;

@ObfuscatedName("c")
public class class4 implements class204 {

    @ObfuscatedName("c.n")
    public static final class4 field27 = new class4(1, 0, Integer.class, new class2());

    @ObfuscatedName("c.v")
    public static final class4 field18 = new class4(0, 1, Long.class, new class3());

    @ObfuscatedName("c.d")
    public static final class4 field19 = new class4(2, 2, String.class, new class5());

    @ObfuscatedName("c.c")
    public final int field20;

    @ObfuscatedName("c.y")
    public final int field23;

    @ObfuscatedName("c.h")
    public final Class field22;

    @ObfuscatedName("c.z")
    public final class1 field21;

    public class4(int arg0, int arg1, Class arg2, class1 arg3) {
        this.field20 = arg0;
        this.field23 = arg1;
        this.field22 = arg2;
        this.field21 = arg3;
    }

    @ObfuscatedName("c.n(Ljava/lang/Object;Lkx;I)V")
    public static void method21(Object arg0, class311 arg1) {
        Class var2 = arg0.getClass();
        class4[] var3 = new class4[] { field19, field27, field18 };
        class4[] var4 = var3;
        int var5 = 0;
        class4 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class4 var6 = var4[var5];
            if (var6.field22 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            throw new IllegalArgumentException();
        }
        class1 var9 = var7.field21;
        var9.method3(arg0, arg1);
    }

    @ObfuscatedName("c.v(B)I")
    public int method30() {
        return this.field23;
    }

    @ObfuscatedName("c.d(Lkx;S)Ljava/lang/Object;")
    public Object method23(class311 arg0) {
        return this.field21.method1(arg0);
    }
}
