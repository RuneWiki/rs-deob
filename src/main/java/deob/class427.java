package deob;

@ObfuscatedName("ql")
public abstract class class427 extends class270 implements class486 {

    public class427(class329 arg0, class355 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("ql.al(B)I")
    public int method7274() {
        return this.field3036;
    }

    @ObfuscatedName("ql.ac(IB)Ljava/lang/Object;")
    public Object method7272(int arg0) {
        class429 var2 = this.method7273(arg0);
        return var2 != null && var2.method7288() ? var2.method7292() : null;
    }

    @ObfuscatedName("ql.ab(Lsy;I)Lsj;")
    public class487 method7275(class478 arg0) {
        int var2 = arg0.method7905();
        class429 var3 = this.method7273(var2);
        class487 var4 = new class487(var2);
        Class var5 = var3.field4638.field4859;
        if (var5 == Integer.class) {
            var4.field4967 = arg0.method7908();
        } else if (var5 == Long.class) {
            var4.field4967 = arg0.method7949();
        } else if (var5 == String.class) {
            var4.field4967 = arg0.method8144();
        } else if (class482.class.isAssignableFrom(var5)) {
            try {
                class482 var6 = (class482) var5.getDeclaredConstructor().newInstance();
                var6.method8204(arg0, (byte) -13);
                var4.field4967 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("ql.aj(II)Lqd;")
    public abstract class429 method7273(int arg0);
}
