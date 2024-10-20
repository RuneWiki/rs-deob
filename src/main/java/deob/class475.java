package deob;

@ObfuscatedName("sq")
public abstract class class475 extends class298 implements class542 {

    public class475(class366 arg0, class393 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("sq.aw(B)I")
    public int method7912() {
        return this.field3148;
    }

    @ObfuscatedName("sq.al(II)Ljava/lang/Object;")
    public Object method7913(int arg0) {
        class477 var2 = this.method7918(arg0);
        return var2 != null && var2.method7926() ? var2.method7928() : null;
    }

    @ObfuscatedName("sq.ai(Luq;I)Luk;")
    public class543 method7914(class534 arg0) {
        int var2 = arg0.method8593();
        class477 var3 = this.method7918(var2);
        class543 var4 = new class543(var2);
        Class var5 = var3.field4876.field5130;
        if (var5 == Integer.class) {
            var4.field5269 = arg0.method8597();
        } else if (var5 == Long.class) {
            var4.field5269 = arg0.method8598();
        } else if (var5 == String.class) {
            var4.field5269 = arg0.method8603();
        } else if (class538.class.isAssignableFrom(var5)) {
            try {
                class538 var6 = (class538) var5.getDeclaredConstructor().newInstance();
                var6.method8862(arg0, 1926585850);
                var4.field5269 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("sq.aq(IB)Lsy;")
    public abstract class477 method7918(int arg0);
}
