package deob;

@ObfuscatedName("ny")
public abstract class class377 extends class243 implements class428 {

    public class377(class296 arg0, class322 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("ny.l(B)I")
    public int method6119() {
        return this.field2807;
    }

    @ObfuscatedName("ny.s(II)Ljava/lang/Object;")
    public Object method6120(int arg0) {
        class379 var2 = this.method6125(arg0);
        return var2 != null && var2.method6136() ? var2.method6137() : null;
    }

    @ObfuscatedName("ny.e(Lpi;I)Lpo;")
    public class429 method6121(class421 arg0) {
        int var2 = arg0.method6666();
        class379 var3 = this.method6125(var2);
        class429 var4 = new class429(var2);
        Class var5 = var3.field4271.field4493;
        if (var5 == Integer.class) {
            var4.field4576 = arg0.method6669();
        } else if (var5 == Long.class) {
            var4.field4576 = arg0.method6670();
        } else if (var5 == String.class) {
            var4.field4576 = arg0.method6675();
        } else if (class424.class.isAssignableFrom(var5)) {
            try {
                class424 var6 = (class424) var5.getDeclaredConstructor().newInstance();
                var6.method6922(arg0, -1825853104);
                var4.field4576 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("ny.c(II)Lnu;")
    public abstract class379 method6125(int arg0);
}
