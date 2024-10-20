package deob;

@ObfuscatedName("sa")
public abstract class class491 extends class311 implements class559 {

    public class491(class378 arg0, class406 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("sa.ae(I)I")
    public int method8281() {
        return this.field3280;
    }

    @ObfuscatedName("sa.ag(II)Ljava/lang/Object;")
    public Object method8283(int arg0) {
        class493 var2 = this.method8291(arg0);
        return var2 != null && var2.method8303() ? var2.method8299() : null;
    }

    @ObfuscatedName("sa.am(Lvf;I)Lvu;")
    public class560 method8282(class551 arg0) {
        int var2 = arg0.method9119();
        class493 var3 = this.method8291(var2);
        class560 var4 = new class560(var2);
        Class var5 = var3.field5082.field5336;
        if (var5 == Integer.class) {
            var4.field5481 = arg0.method9110();
        } else if (var5 == Long.class) {
            var4.field5481 = arg0.method8980();
        } else if (var5 == String.class) {
            var4.field5481 = arg0.method8985();
        } else if (class555.class.isAssignableFrom(var5)) {
            try {
                class555 var6 = (class555) var5.getDeclaredConstructor().newInstance();
                var6.method9264(arg0, (byte) -85);
                var4.field5481 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("sa.ac(IB)Lsz;")
    public abstract class493 method8291(int arg0);
}
