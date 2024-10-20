package deob;

@ObfuscatedName("ss")
public abstract class class488 extends class307 implements class555 {

    public class488(class375 arg0, class403 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("ss.ad(I)I")
    public int method8041() {
        return this.field3248;
    }

    @ObfuscatedName("ss.ag(II)Ljava/lang/Object;")
    public Object method8049(int arg0) {
        class490 var2 = this.method8052(arg0);
        return var2 != null && var2.method8062() ? var2.method8063() : null;
    }

    @ObfuscatedName("ss.ak(Lvp;I)Lvt;")
    public class556 method8044(class547 arg0) {
        int var2 = arg0.method8899();
        class490 var3 = this.method8052(var2);
        class556 var4 = new class556(var2);
        Class var5 = var3.field5038.field5292;
        if (var5 == Integer.class) {
            var4.field5430 = arg0.method8734();
        } else if (var5 == Long.class) {
            var4.field5430 = arg0.method8735();
        } else if (var5 == String.class) {
            var4.field5430 = arg0.method8882();
        } else if (class551.class.isAssignableFrom(var5)) {
            try {
                class551 var6 = (class551) var5.getDeclaredConstructor().newInstance();
                var6.method9021(arg0, 2130917793);
                var4.field5430 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("ss.aq(II)Lsm;")
    public abstract class490 method8052(int arg0);
}
