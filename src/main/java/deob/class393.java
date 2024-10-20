package deob;

@ObfuscatedName("om")
public abstract class class393 extends class251 implements class445 {

    public class393(class305 arg0, class331 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("om.c(I)I")
    public int method6449() {
        return this.field2873;
    }

    @ObfuscatedName("om.i(IB)Ljava/lang/Object;")
    public Object method6459(int arg0) {
        class395 var2 = this.method6457(arg0);
        return var2 != null && var2.method6463() ? var2.method6466() : null;
    }

    @ObfuscatedName("om.f(Lpi;B)Lqd;")
    public class446 method6451(class438 arg0) {
        int var2 = arg0.method7148();
        class395 var3 = this.method6457(var2);
        class446 var4 = new class446(var2);
        Class var5 = var3.field4379.field4594;
        if (var5 == Integer.class) {
            var4.field4682 = arg0.method6976();
        } else if (var5 == Long.class) {
            var4.field4682 = arg0.method7003();
        } else if (var5 == String.class) {
            var4.field4682 = arg0.method7023();
        } else if (class441.class.isAssignableFrom(var5)) {
            try {
                class441 var6 = (class441) var5.getDeclaredConstructor().newInstance();
                var6.method7221(arg0, (short) 128);
                var4.field4682 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("om.v(IB)Lox;")
    public abstract class395 method6457(int arg0);
}
