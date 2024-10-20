package deob;

@ObfuscatedName("sn")
public abstract class class472 extends class296 implements class539 {

    public class472(class363 arg0, class390 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("sn.ap(B)I")
    public int method7905() {
        return this.field3141;
    }

    @ObfuscatedName("sn.af(II)Ljava/lang/Object;")
    public Object method7916(int arg0) {
        class474 var2 = this.method7912(arg0);
        return var2 != null && var2.method7924() ? var2.method7925() : null;
    }

    @ObfuscatedName("sn.aj(Luk;I)Lur;")
    public class540 method7913(class531 arg0) {
        int var2 = arg0.method8775();
        class474 var3 = this.method7912(var2);
        class540 var4 = new class540(var2);
        Class var5 = var3.field4841.field5107;
        if (var5 == Integer.class) {
            var4.field5245 = arg0.method8566();
        } else if (var5 == Long.class) {
            var4.field5245 = arg0.method8567();
        } else if (var5 == String.class) {
            var4.field5245 = arg0.method8635();
        } else if (class535.class.isAssignableFrom(var5)) {
            try {
                class535 var6 = (class535) var5.getDeclaredConstructor().newInstance();
                var6.method8841(arg0, 343167559);
                var4.field5245 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("sn.am(II)Lsf;")
    public abstract class474 method7912(int arg0);
}
