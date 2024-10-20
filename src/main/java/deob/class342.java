package deob;

@ObfuscatedName("mt")
public abstract class class342 extends class216 implements class391 {

    public class342(class265 arg0, class291 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("mt.e(B)I")
    public int method5372() {
        return this.field2560;
    }

    @ObfuscatedName("mt.v(II)Ljava/lang/Object;")
    public Object method5376(int arg0) {
        class344 var2 = this.method5382(arg0);
        return var2 != null && var2.method5393() ? var2.method5394() : null;
    }

    @ObfuscatedName("mt.y(Lnt;B)Loo;")
    public class392 method5374(class384 arg0) {
        int var2 = arg0.method5899();
        class344 var3 = this.method5382(var2);
        class392 var4 = new class392(var2);
        Class var5 = var3.field3925.field4133;
        if (var5 == Integer.class) {
            var4.field4228 = arg0.method5965();
        } else if (var5 == Long.class) {
            var4.field4228 = arg0.method5896();
        } else if (var5 == String.class) {
            var4.field4228 = arg0.method5907();
        } else if (class387.class.isAssignableFrom(var5)) {
            try {
                class387 var6 = (class387) var5.getDeclaredConstructor().newInstance();
                var6.method6153(arg0, 1763340179);
                var4.field4228 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("mt.f(II)Lmq;")
    public abstract class344 method5382(int arg0);
}
