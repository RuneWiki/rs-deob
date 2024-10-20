package deob;

@ObfuscatedName("sa")
public abstract class class487 extends class306 implements class554 {

    public class487(class374 arg0, class402 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("sa.al(I)I")
    public int method8111() {
        return this.field3252;
    }

    @ObfuscatedName("sa.aj(IB)Ljava/lang/Object;")
    public Object method8112(int arg0) {
        class489 var2 = this.method8110(arg0);
        return var2 != null && var2.method8127() ? var2.method8132() : null;
    }

    @ObfuscatedName("sa.az(Lua;I)Lvf;")
    public class555 method8113(class546 arg0) {
        int var2 = arg0.method8798();
        class489 var3 = this.method8110(var2);
        class555 var4 = new class555(var2);
        Class var5 = var3.field5011.field5269;
        if (var5 == Integer.class) {
            var4.field5411 = arg0.method8801();
        } else if (var5 == Long.class) {
            var4.field5411 = arg0.method8802();
        } else if (var5 == String.class) {
            var4.field5411 = arg0.method8968();
        } else if (class550.class.isAssignableFrom(var5)) {
            try {
                class550 var6 = (class550) var5.getDeclaredConstructor().newInstance();
                var6.method9075(arg0, 855741563);
                var4.field5411 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("sa.ak(IB)Lsp;")
    public abstract class489 method8110(int arg0);
}
