package deob;

@ObfuscatedName("od")
public abstract class class394 extends class251 implements class447 {

    public class394(class305 arg0, class331 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("od.q(I)I")
    public int method6333() {
        return this.field2927;
    }

    @ObfuscatedName("od.l(II)Ljava/lang/Object;")
    public Object method6339(int arg0) {
        class396 var2 = this.method6335(arg0);
        return var2 != null && var2.method6352() ? var2.method6353() : null;
    }

    @ObfuscatedName("od.k(Lpx;I)Lqx;")
    public class448 method6344(class440 arg0) {
        int var2 = arg0.method7082();
        class396 var3 = this.method6335(var2);
        class448 var4 = new class448(var2);
        Class var5 = var3.field4431.field4668;
        if (var5 == Integer.class) {
            var4.field4743 = arg0.method6898();
        } else if (var5 == Long.class) {
            var4.field4743 = arg0.method7014();
        } else if (var5 == String.class) {
            var4.field4743 = arg0.method6904();
        } else if (class443.class.isAssignableFrom(var5)) {
            try {
                class443 var6 = (class443) var5.getDeclaredConstructor().newInstance();
                var6.method7161(arg0, 2110102412);
                var4.field4743 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("od.o(II)Lou;")
    public abstract class396 method6335(int arg0);
}
