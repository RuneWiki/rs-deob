package deob;

@ObfuscatedName("od")
public class class410 implements class315 {

    @ObfuscatedName("od.c")
    public static final class410 field4446 = new class410(1, 0, Integer.class, new class407());

    @ObfuscatedName("od.b")
    public static final class410 field4443 = new class410(0, 1, Long.class, new class409());

    @ObfuscatedName("od.p")
    public static final class410 field4450 = new class410(2, 2, String.class, new class411());

    @ObfuscatedName("od.m")
    public final int field4445;

    @ObfuscatedName("od.t")
    public final int field4453;

    @ObfuscatedName("od.s")
    public final Class field4447;

    @ObfuscatedName("od.j")
    public final class406 field4448;

    public class410(int arg0, int arg1, Class arg2, class406 arg3) {
        this.field4445 = arg0;
        this.field4453 = arg1;
        this.field4447 = arg2;
        this.field4448 = arg3;
    }

    @ObfuscatedName("od.c(Ljava/lang/Class;I)Lod;")
    public static class410 method6566(Class arg0) {
        class410[] var1 = new class410[] { field4443, field4450, field4446 };
        class410[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class410 var4 = var2[var3];
            if (var4.field4447 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("od.p(Ljava/lang/Object;Lpi;I)V")
    public static void method6571(Object arg0, class419 arg1) {
        class406 var2 = method6567(arg0.getClass());
        var2.method6558(arg0, arg1);
    }

    @ObfuscatedName("od.w(Ljava/lang/Class;I)Loq;")
    public static class406 method6567(Class arg0) {
        class410 var1 = method6566(arg0);
        if (var1 == null) {
            throw new IllegalArgumentException();
        }
        return var1.field4448;
    }

    @ObfuscatedName("od.b(B)I")
    public int method46() {
        return this.field4453;
    }

    @ObfuscatedName("od.n(Lpi;I)Ljava/lang/Object;")
    public Object method6568(class419 arg0) {
        return this.field4448.method6556(arg0);
    }
}
