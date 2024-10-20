package deob;

@ObfuscatedName("oc")
public abstract class class394 extends class250 implements class451 {

    public class394(class305 arg0, class331 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("oc.h(I)I")
    public int method6348() {
        return this.field2891;
    }

    @ObfuscatedName("oc.w(II)Ljava/lang/Object;")
    public Object method6347(int arg0) {
        class396 var2 = this.method6357(arg0);
        return var2 != null && var2.method6363() ? var2.method6365() : null;
    }

    @ObfuscatedName("oc.v(Lqr;S)Lqp;")
    public class452 method6349(class444 arg0) {
        int var2 = arg0.method7120();
        class396 var3 = this.method6357(var2);
        class452 var4 = new class452(var2);
        Class var5 = var3.field4435.field4657;
        if (var5 == Integer.class) {
            var4.field4769 = arg0.method6934();
        } else if (var5 == Long.class) {
            var4.field4769 = arg0.method6935();
        } else if (var5 == String.class) {
            var4.field4769 = arg0.method7022();
        } else if (class447.class.isAssignableFrom(var5)) {
            try {
                class447 var6 = (class447) var5.getDeclaredConstructor().newInstance();
                var6.method7204(arg0, (byte) -40);
                var4.field4769 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("oc.s(IB)Lod;")
    public abstract class396 method6357(int arg0);
}
