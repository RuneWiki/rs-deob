package deob;

@ObfuscatedName("po")
public abstract class class423 extends class267 implements class482 {

    public class423(class326 arg0, class352 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("po.w(I)I")
    public int method7371() {
        return this.field3036;
    }

    @ObfuscatedName("po.v(II)Ljava/lang/Object;")
    public Object method7372(int arg0) {
        class425 var2 = this.method7379(arg0);
        return var2 != null && var2.method7391() ? var2.method7387() : null;
    }

    @ObfuscatedName("po.s(Lrd;I)Lrm;")
    public class483 method7373(class474 arg0) {
        int var2 = arg0.method8032();
        class425 var3 = this.method7379(var2);
        class483 var4 = new class483(var2);
        Class var5 = var3.field4675.field4902;
        if (var5 == Integer.class) {
            var4.field5005 = arg0.method7979();
        } else if (var5 == Long.class) {
            var4.field5005 = arg0.method8151();
        } else if (var5 == String.class) {
            var4.field5005 = arg0.method7975();
        } else if (class478.class.isAssignableFrom(var5)) {
            try {
                class478 var6 = (class478) var5.getDeclaredConstructor().newInstance();
                var6.method8255(arg0, -1809642577);
                var4.field5005 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("po.f(II)Lpj;")
    public abstract class425 method7379(int arg0);
}
