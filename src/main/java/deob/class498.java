package deob;

@ObfuscatedName("tl")
public abstract class class498 extends class310 implements class566 {

    public class498(class378 arg0, class407 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("tl.aw(B)I")
    public int method8582() {
        return this.field3287;
    }

    @ObfuscatedName("tl.ak(IB)Ljava/lang/Object;")
    public Object method8578(int arg0) {
        class500 var2 = this.method8575(arg0);
        return var2 != null && var2.method8600() ? var2.method8597() : null;
    }

    @ObfuscatedName("tl.aj(Lvl;I)Lva;")
    public class567 method8576(class558 arg0) {
        int var2 = arg0.method9260();
        class500 var3 = this.method8575(var2);
        class567 var4 = new class567(var2);
        Class var5 = var3.field5127.field5387;
        if (var5 == Integer.class) {
            var4.field5530 = arg0.method9264();
        } else if (var5 == Long.class) {
            var4.field5530 = arg0.method9265();
        } else if (var5 == String.class) {
            var4.field5530 = arg0.method9270();
        } else if (class562.class.isAssignableFrom(var5)) {
            try {
                class562 var6 = (class562) var5.getDeclaredConstructor().newInstance();
                var6.method9578(arg0, -1921657632);
                var4.field5530 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("tl.ap(IB)Ltv;")
    public abstract class500 method8575(int arg0);
}
