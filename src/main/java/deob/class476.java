package deob;

@ObfuscatedName("sz")
public abstract class class476 extends class298 implements class543 {

    public class476(class366 arg0, class394 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("sz.ah(I)I")
    public int method7779() {
        return this.field3178;
    }

    @ObfuscatedName("sz.af(IB)Ljava/lang/Object;")
    public Object method7775(int arg0) {
        class478 var2 = this.method7774(arg0);
        return var2 != null && var2.method7796() ? var2.method7791() : null;
    }

    @ObfuscatedName("sz.at(Lur;S)Luz;")
    public class544 method7776(class535 arg0) {
        int var2 = arg0.method8670();
        class478 var3 = this.method7774(var2);
        class544 var4 = new class544(var2);
        Class var5 = var3.field4904.field5154;
        if (var5 == Integer.class) {
            var4.field5301 = arg0.method8682();
        } else if (var5 == Long.class) {
            var4.field5301 = arg0.method8469();
        } else if (var5 == String.class) {
            var4.field5301 = arg0.method8474();
        } else if (class539.class.isAssignableFrom(var5)) {
            try {
                class539 var6 = (class539) var5.getDeclaredConstructor().newInstance();
                var6.method8750(arg0, 1416221771);
                var4.field5301 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("sz.az(IB)Lsm;")
    public abstract class478 method7774(int arg0);
}
