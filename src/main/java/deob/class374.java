package deob;

@ObfuscatedName("ne")
public class class374 implements class266 {

    @ObfuscatedName("ne.f")
    public static final class374 field4127 = new class374(2, 0, Integer.class, new class371());

    @ObfuscatedName("ne.o")
    public static final class374 field4135 = new class374(1, 1, Long.class, new class373());

    @ObfuscatedName("ne.u")
    public static final class374 field4129 = new class374(0, 2, String.class, new class375());

    @ObfuscatedName("ne.p")
    public final int field4130;

    @ObfuscatedName("ne.b")
    public final int field4131;

    @ObfuscatedName("ne.e")
    public final Class field4132;

    @ObfuscatedName("ne.k")
    public final class370 field4133;

    public class374(int arg0, int arg1, Class arg2, class370 arg3) {
        this.field4130 = arg0;
        this.field4131 = arg1;
        this.field4132 = arg2;
        this.field4133 = arg3;
    }

    @ObfuscatedName("ne.b(Ljava/lang/Class;I)Lne;")
    public static class374 method5767(Class arg0) {
        class374[] var1 = new class374[] { field4129, field4135, field4127 };
        class374[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class374 var4 = var2[var3];
            if (var4.field4132 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("ne.f(I)I")
    public int method240() {
        return this.field4131;
    }

    @ObfuscatedName("ne.k(Lnu;I)Ljava/lang/Object;")
    public Object method5771(class382 arg0) {
        return this.field4133.method5755(arg0);
    }
}
