package deob;

@ObfuscatedName("oz")
public abstract class class393 extends class250 implements class450 {

    public class393(class304 arg0, class330 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("oz.v(I)I")
    public int method6427() {
        return this.field2885;
    }

    @ObfuscatedName("oz.q(II)Ljava/lang/Object;")
    public Object method6428(int arg0) {
        class395 var2 = this.method6432(arg0);
        return var2 != null && var2.method6443() ? var2.method6448() : null;
    }

    @ObfuscatedName("oz.f(Lqt;I)Lqr;")
    public class451 method6429(class443 arg0) {
        int var2 = arg0.method7049();
        class395 var3 = this.method6432(var2);
        class451 var4 = new class451(var2);
        Class var5 = var3.field4429.field4660;
        if (var5 == Integer.class) {
            var4.field4767 = arg0.method7052();
        } else if (var5 == Long.class) {
            var4.field4767 = arg0.method7106();
        } else if (var5 == String.class) {
            var4.field4767 = arg0.method7211();
        } else if (class446.class.isAssignableFrom(var5)) {
            try {
                class446 var6 = (class446) var5.getDeclaredConstructor().newInstance();
                var6.method7319(arg0, -636376244);
                var4.field4767 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("oz.c(II)Loj;")
    public abstract class395 method6432(int arg0);
}
