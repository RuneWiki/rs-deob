package deob;

@ObfuscatedName("ms")
public abstract class class340 extends class193 implements class389 {

    public class340() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ms.o(I)I")
    public int method5323() {
        return this.field2199;
    }

    @ObfuscatedName("ms.u(IB)Ljava/lang/Object;")
    public Object method5324(int arg0) {
        class342 var2 = this.method5322(arg0);
        return var2 != null && var2.method5336() ? var2.method5338() : null;
    }

    @ObfuscatedName("ms.p(Lnu;I)Lnl;")
    public class390 method5325(class382 arg0) {
        int var2 = arg0.method5858();
        class342 var3 = this.method5322(var2);
        class390 var4 = new class390(var2);
        Class var5 = var3.field3929.field4132;
        if (var5 == Integer.class) {
            var4.field4217 = arg0.method5861();
        } else if (var5 == Long.class) {
            var4.field4217 = arg0.method6069();
        } else if (var5 == String.class) {
            var4.field4217 = arg0.method5896();
        } else if (class385.class.isAssignableFrom(var5)) {
            try {
                class385 var6 = (class385) var5.getDeclaredConstructor().newInstance();
                var6.method6097(arg0, -915539156);
                var4.field4217 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("ms.f(II)Lmd;")
    public abstract class342 method5322(int arg0);
}
