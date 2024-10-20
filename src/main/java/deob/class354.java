package deob;

@ObfuscatedName("me")
public abstract class class354 extends class230 implements class407 {

    public class354(class279 arg0, class305 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("me.c(B)I")
    public int method5679() {
        return this.field2626;
    }

    @ObfuscatedName("me.m(II)Ljava/lang/Object;")
    public Object method5688(int arg0) {
        class356 var2 = this.method5689(arg0);
        return var2 != null && var2.method5703() ? var2.method5702() : null;
    }

    @ObfuscatedName("me.k(Lot;I)Log;")
    public class408 method5694(class400 arg0) {
        int var2 = arg0.method6219();
        class356 var3 = this.method5689(var2);
        class408 var4 = new class408(var2);
        Class var5 = var3.field4026.field4247;
        if (var5 == Integer.class) {
            var4.field4341 = arg0.method6222();
        } else if (var5 == Long.class) {
            var4.field4341 = arg0.method6223();
        } else if (var5 == String.class) {
            var4.field4341 = arg0.method6390();
        } else if (class403.class.isAssignableFrom(var5)) {
            try {
                class403 var6 = (class403) var5.getDeclaredConstructor().newInstance();
                var6.method6480(arg0, -2084274366);
                var4.field4341 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("me.n(IB)Lmi;")
    public abstract class356 method5689(int arg0);
}
