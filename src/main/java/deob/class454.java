package deob;

@ObfuscatedName("qi")
public class class454 implements class343 {

    @ObfuscatedName("qi.a")
    public static final class454 field4835 = new class454(0, 0, Integer.class, new class451());

    @ObfuscatedName("qi.f")
    public static final class454 field4829 = new class454(2, 1, Long.class, new class453());

    @ObfuscatedName("qi.c")
    public static final class454 field4837 = new class454(1, 2, String.class, new class455());

    @ObfuscatedName("qi.x")
    public final int field4832;

    @ObfuscatedName("qi.h")
    public final int field4833;

    @ObfuscatedName("qi.j")
    public final Class field4834;

    @ObfuscatedName("qi.y")
    public final class450 field4830;

    @ObfuscatedName("qi.c(I)[Lqi;")
    public static class454[] method7587() {
        return new class454[] { field4837, field4829, field4835 };
    }

    public class454(int arg0, int arg1, Class arg2, class450 arg3) {
        this.field4832 = arg0;
        this.field4833 = arg1;
        this.field4834 = arg2;
        this.field4830 = arg3;
    }

    @ObfuscatedName("qi.x(Ljava/lang/Class;I)Lqi;")
    public static class454 method7576(Class arg0) {
        class454[] var1 = method7587();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class454 var3 = var1[var2];
            if (var3.field4834 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("qi.h(Ljava/lang/Object;Lqr;I)V")
    public static void method7584(Object arg0, class464 arg1) {
        Class var2 = arg0.getClass();
        class454 var3 = method7576(var2);
        if (var3 == null) {
            throw new IllegalArgumentException();
        }
        class450 var4 = var3.field4830;
        var4.method7559(arg0, arg1);
    }

    @ObfuscatedName("qi.a(B)I")
    public int method24() {
        return this.field4833;
    }

    @ObfuscatedName("qi.j(Lqr;I)Ljava/lang/Object;")
    public Object method7577(class464 arg0) {
        return this.field4830.method7560(arg0);
    }
}
