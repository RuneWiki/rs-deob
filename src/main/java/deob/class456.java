package deob;

@ObfuscatedName("rp")
public abstract class class456 extends class282 implements class523 {

    public class456(class348 arg0, class374 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("rp.ae(I)I")
    public int method7626() {
        return this.field3083;
    }

    @ObfuscatedName("rp.ao(IB)Ljava/lang/Object;")
    public Object method7618(int arg0) {
        class458 var2 = this.method7627(arg0);
        return var2 != null && var2.method7638() ? var2.method7637() : null;
    }

    @ObfuscatedName("rp.at(Ltm;B)Lud;")
    public class524 method7619(class515 arg0) {
        int var2 = arg0.method8448();
        class458 var3 = this.method7627(var2);
        class524 var4 = new class524(var2);
        Class var5 = var3.field4772.field5034;
        if (var5 == Integer.class) {
            var4.field5178 = arg0.method8306();
        } else if (var5 == Long.class) {
            var4.field5178 = arg0.method8307();
        } else if (var5 == String.class) {
            var4.field5178 = arg0.method8452();
        } else if (class519.class.isAssignableFrom(var5)) {
            try {
                class519 var6 = (class519) var5.getDeclaredConstructor().newInstance();
                var6.method8577(arg0, (byte) -79);
                var4.field5178 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("rp.au(IB)Lrv;")
    public abstract class458 method7627(int arg0);
}
