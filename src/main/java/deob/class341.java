package deob;

@ObfuscatedName("mh")
public abstract class class341 extends class217 implements class392 {

    public class341(class266 arg0, class292 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("mh.t(I)I")
    public int method5404() {
        return this.field2548;
    }

    @ObfuscatedName("mh.v(IB)Ljava/lang/Object;")
    public Object method5415(int arg0) {
        class343 var2 = this.method5409(arg0);
        return var2 != null && var2.method5422() ? var2.method5427() : null;
    }

    @ObfuscatedName("mh.j(Lnv;I)Lok;")
    public class393 method5417(class385 arg0) {
        int var2 = arg0.method6053();
        class343 var3 = this.method5409(var2);
        class393 var4 = new class393(var2);
        Class var5 = var3.field3941.field4161;
        if (var5 == Integer.class) {
            var4.field4242 = arg0.method6182();
        } else if (var5 == Long.class) {
            var4.field4242 = arg0.method5964();
        } else if (var5 == String.class) {
            var4.field4242 = arg0.method6104();
        } else if (class388.class.isAssignableFrom(var5)) {
            try {
                class388 var6 = (class388) var5.getDeclaredConstructor().newInstance();
                var6.method6236(arg0, -1263973673);
                var4.field4242 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("mh.s(II)Lmd;")
    public abstract class343 method5409(int arg0);
}
