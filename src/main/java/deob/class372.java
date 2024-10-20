package deob;

@ObfuscatedName("nl")
public abstract class class372 extends class243 implements class426 {

    public class372(class291 arg0, class317 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("nl.b(B)I")
    public int method6111() {
        return this.field2788;
    }

    @ObfuscatedName("nl.p(IB)Ljava/lang/Object;")
    public Object method6112(int arg0) {
        class374 var2 = this.method6121(arg0);
        return var2 != null && var2.method6132() ? var2.method6133() : null;
    }

    @ObfuscatedName("nl.m(Lpi;I)Lpz;")
    public class427 method6113(class419 arg0) {
        int var2 = arg0.method6672();
        class374 var3 = this.method6121(var2);
        class427 var4 = new class427(var2);
        Class var5 = var3.field4227.field4447;
        if (var5 == Integer.class) {
            var4.field4538 = arg0.method6675();
        } else if (var5 == Long.class) {
            var4.field4538 = arg0.method6676();
        } else if (var5 == String.class) {
            var4.field4538 = arg0.method6681();
        } else if (class422.class.isAssignableFrom(var5)) {
            try {
                class422 var6 = (class422) var5.getDeclaredConstructor().newInstance();
                var6.method6904(arg0, 2020083365);
                var4.field4538 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("nl.c(II)Lnp;")
    public abstract class374 method6121(int arg0);
}
