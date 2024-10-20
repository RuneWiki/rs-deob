package deob;

@ObfuscatedName("qn")
public abstract class class431 extends class274 implements class497 {

    public class431(class333 arg0, class359 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("qn.an(I)I")
    public int method7562() {
        return this.field3072;
    }

    @ObfuscatedName("qn.aw(IS)Ljava/lang/Object;")
    public Object method7572(int arg0) {
        class433 var2 = this.method7570(arg0);
        return var2 != null && var2.method7583() ? var2.method7587() : null;
    }

    @ObfuscatedName("qn.ac(Lsg;I)Lte;")
    public class498 method7564(class489 arg0) {
        int var2 = arg0.method8250();
        class433 var3 = this.method7570(var2);
        class498 var4 = new class498(var2);
        Class var5 = var3.field4702.field4952;
        if (var5 == Integer.class) {
            var4.field5058 = arg0.method8254();
        } else if (var5 == Long.class) {
            var4.field5058 = arg0.method8271();
        } else if (var5 == String.class) {
            var4.field5058 = arg0.method8260();
        } else if (class493.class.isAssignableFrom(var5)) {
            try {
                class493 var6 = (class493) var5.getDeclaredConstructor().newInstance();
                var6.method8536(arg0, (byte) -32);
                var4.field5058 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("qn.af(IB)Lqg;")
    public abstract class433 method7570(int arg0);
}
