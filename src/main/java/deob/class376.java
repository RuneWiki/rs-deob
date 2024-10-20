package deob;

@ObfuscatedName("ne")
public class class376 implements class289 {

    @ObfuscatedName("ne.f")
    public static final class376 field4135 = new class376(1, 0, Integer.class, new class373());

    @ObfuscatedName("ne.e")
    public static final class376 field4128 = new class376(0, 1, Long.class, new class375());

    @ObfuscatedName("ne.v")
    public static final class376 field4129 = new class376(2, 2, String.class, new class377());

    @ObfuscatedName("ne.y")
    public final int field4130;

    @ObfuscatedName("ne.j")
    public final int field4138;

    @ObfuscatedName("ne.o")
    public final Class field4133;

    @ObfuscatedName("ne.m")
    public final class372 field4134;

    public class376(int arg0, int arg1, Class arg2, class372 arg3) {
        this.field4130 = arg0;
        this.field4138 = arg1;
        this.field4133 = arg2;
        this.field4134 = arg3;
    }

    @ObfuscatedName("ne.o(Ljava/lang/Class;I)Lne;")
    public static class376 method5805(Class arg0) {
        class376[] var1 = new class376[] { field4129, field4135, field4128 };
        class376[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class376 var4 = var2[var3];
            if (var4.field4133 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("ne.m(Ljava/lang/Object;Lnt;I)V")
    public static void method5806(Object arg0, class384 arg1) {
        Class var2 = arg0.getClass();
        class376 var3 = method5805(var2);
        if (var3 == null) {
            throw new IllegalArgumentException();
        }
        class372 var4 = var3.field4134;
        var4.method5794(arg0, arg1);
    }

    @ObfuscatedName("ne.f(I)I")
    public int method238() {
        return this.field4138;
    }

    @ObfuscatedName("ne.r(Lnt;I)Ljava/lang/Object;")
    public Object method5804(class384 arg0) {
        return this.field4134.method5791(arg0);
    }
}
