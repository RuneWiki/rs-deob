package deob;

@ObfuscatedName("rx")
public abstract class class444 extends class281 implements class509 {

    public class444(class346 arg0, class372 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("rx.an(I)I")
    public int method7491() {
        return this.field3066;
    }

    @ObfuscatedName("rx.av(IB)Ljava/lang/Object;")
    public Object method7492(int arg0) {
        class446 var2 = this.method7500(arg0);
        return var2 != null && var2.method7508() ? var2.method7509() : null;
    }

    @ObfuscatedName("rx.as(Ltz;B)Lts;")
    public class510 method7493(class501 arg0) {
        int var2 = arg0.method8195();
        class446 var3 = this.method7500(var2);
        class510 var4 = new class510(var2);
        Class var5 = var3.field4715.field4975;
        if (var5 == Integer.class) {
            var4.field5084 = arg0.method8134();
        } else if (var5 == Long.class) {
            var4.field5084 = arg0.method8135();
        } else if (var5 == String.class) {
            var4.field5084 = arg0.method8193();
        } else if (class505.class.isAssignableFrom(var5)) {
            try {
                class505 var6 = (class505) var5.getDeclaredConstructor().newInstance();
                var6.method8424(arg0, -1843234681);
                var4.field5084 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("rx.at(II)Lrg;")
    public abstract class446 method7500(int arg0);
}
