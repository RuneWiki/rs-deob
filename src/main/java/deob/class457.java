package deob;

@ObfuscatedName("rn")
public abstract class class457 extends class283 implements class522 {

    public class457(class349 arg0, class375 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("rn.ay(I)I")
    public int method7592() {
        return this.field3066;
    }

    @ObfuscatedName("rn.ar(II)Ljava/lang/Object;")
    public Object method7591(int arg0) {
        class459 var2 = this.method7589(arg0);
        return var2 != null && var2.method7607() ? var2.method7608() : null;
    }

    @ObfuscatedName("rn.am(Lty;I)Luh;")
    public class523 method7590(class514 arg0) {
        int var2 = arg0.method8246();
        class459 var3 = this.method7589(var2);
        class523 var4 = new class523(var2);
        Class var5 = var3.field4773.field5027;
        if (var5 == Integer.class) {
            var4.field5135 = arg0.method8496();
        } else if (var5 == Long.class) {
            var4.field5135 = arg0.method8251();
        } else if (var5 == String.class) {
            var4.field5135 = arg0.method8256();
        } else if (class518.class.isAssignableFrom(var5)) {
            try {
                class518 var6 = (class518) var5.getDeclaredConstructor().newInstance();
                var6.method8546(arg0, (short) 7295);
                var4.field5135 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("rn.aw(II)Lrc;")
    public abstract class459 method7589(int arg0);
}
