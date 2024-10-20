package deob;

@ObfuscatedName("oi")
public abstract class class413 extends class260 implements class471 {

    public class413(class319 arg0, class345 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("oi.f(I)I")
    public int method7106() {
        return this.field2970;
    }

    @ObfuscatedName("oi.c(IB)Ljava/lang/Object;")
    public Object method7107(int arg0) {
        class415 var2 = this.method7113(arg0);
        return var2 != null && var2.method7127() ? var2.method7128() : null;
    }

    @ObfuscatedName("oi.x(Lqr;I)Lrj;")
    public class472 method7105(class464 arg0) {
        int var2 = arg0.method7716();
        class415 var3 = this.method7113(var2);
        class472 var4 = new class472(var2);
        Class var5 = var3.field4599.field4834;
        if (var5 == Integer.class) {
            var4.field4931 = arg0.method7720();
        } else if (var5 == Long.class) {
            var4.field4931 = arg0.method7721();
        } else if (var5 == String.class) {
            var4.field4931 = arg0.method7726();
        } else if (class467.class.isAssignableFrom(var5)) {
            try {
                class467 var6 = (class467) var5.getDeclaredConstructor().newInstance();
                var6.method7983(arg0, 1498159503);
                var4.field4931 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("oi.a(II)Loz;")
    public abstract class415 method7113(int arg0);
}
