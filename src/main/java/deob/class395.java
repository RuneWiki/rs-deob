package deob;

@ObfuscatedName("op")
public abstract class class395 extends class251 implements class452 {

    public class395(class306 arg0, class332 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("op.p(I)I")
    public int method6593() {
        return this.field2915;
    }

    @ObfuscatedName("op.f(IB)Ljava/lang/Object;")
    public Object method6595(int arg0) {
        class397 var2 = this.method6596(arg0);
        return var2 != null && var2.method6612() ? var2.method6617() : null;
    }

    @ObfuscatedName("op.n(Lqq;B)Lql;")
    public class453 method6597(class445 arg0) {
        int var2 = arg0.method7198();
        class397 var3 = this.method6596(var2);
        class453 var4 = new class453(var2);
        Class var5 = var3.field4466.field4698;
        if (var5 == Integer.class) {
            var4.field4798 = arg0.method7201();
        } else if (var5 == Long.class) {
            var4.field4798 = arg0.method7319();
        } else if (var5 == String.class) {
            var4.field4798 = arg0.method7207();
        } else if (class448.class.isAssignableFrom(var5)) {
            try {
                class448 var6 = (class448) var5.getDeclaredConstructor().newInstance();
                var6.method7452(arg0, (byte) 18);
                var4.field4798 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("op.c(IB)Lof;")
    public abstract class397 method6596(int arg0);
}
