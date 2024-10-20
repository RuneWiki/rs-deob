package deob;

@ObfuscatedName("me")
public abstract class class341 extends class215 implements class390 {

    public class341(class264 arg0, class290 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("me.n(I)I")
    public int method5457() {
        return this.field2559;
    }

    @ObfuscatedName("me.f(II)Ljava/lang/Object;")
    public Object method5458(int arg0) {
        class343 var2 = this.method5466(arg0);
        return var2 != null && var2.method5477() ? var2.method5476() : null;
    }

    @ObfuscatedName("me.y(Lnd;B)Loc;")
    public class391 method5460(class383 arg0) {
        int var2 = arg0.method5967();
        class343 var3 = this.method5466(var2);
        class391 var4 = new class391(var2);
        Class var5 = var3.field3928.field4128;
        if (var5 == Integer.class) {
            var4.field4219 = arg0.method5970();
        } else if (var5 == Long.class) {
            var4.field4219 = arg0.method5971();
        } else if (var5 == String.class) {
            var4.field4219 = arg0.method5975();
        } else if (class386.class.isAssignableFrom(var5)) {
            try {
                class386 var6 = (class386) var5.getDeclaredConstructor().newInstance();
                var6.method6214(arg0, 1837811366);
                var4.field4219 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("me.v(II)Lml;")
    public abstract class343 method5466(int arg0);
}
