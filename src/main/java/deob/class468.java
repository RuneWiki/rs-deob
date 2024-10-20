package deob;

@ObfuscatedName("rt")
public abstract class class468 extends class293 implements class535 {

    public class468(class360 arg0, class386 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("rt.ah(I)I")
    public int method7758() {
        return this.field3103;
    }

    @ObfuscatedName("rt.ar(II)Ljava/lang/Object;")
    public Object method7760(int arg0) {
        class470 var2 = this.method7762(arg0);
        return var2 != null && var2.method7779() ? var2.method7780() : null;
    }

    @ObfuscatedName("rt.ao(Luj;I)Lux;")
    public class536 method7761(class527 arg0) {
        int var2 = arg0.method8412();
        class470 var3 = this.method7762(var2);
        class536 var4 = new class536(var2);
        Class var5 = var3.field4809.field5065;
        if (var5 == Integer.class) {
            var4.field5206 = arg0.method8416();
        } else if (var5 == Long.class) {
            var4.field5206 = arg0.method8417();
        } else if (var5 == String.class) {
            var4.field5206 = arg0.method8422();
        } else if (class531.class.isAssignableFrom(var5)) {
            try {
                class531 var6 = (class531) var5.getDeclaredConstructor().newInstance();
                var6.method8724(arg0, (byte) 66);
                var4.field5206 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("rt.at(IB)Lsj;")
    public abstract class470 method7762(int arg0);
}
