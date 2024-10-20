package deob;

@ObfuscatedName("mu")
public abstract class class355 extends class230 implements class408 {

    public class355(class279 arg0, class305 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("mu.q(B)I")
    public int method5717() {
        return this.field2646;
    }

    @ObfuscatedName("mu.f(II)Ljava/lang/Object;")
    public Object method5720(int arg0) {
        class357 var2 = this.method5722(arg0);
        return var2 != null && var2.method5741() ? var2.method5738() : null;
    }

    @ObfuscatedName("mu.j(Lot;B)Loj;")
    public class409 method5730(class401 arg0) {
        int var2 = arg0.method6284();
        class357 var3 = this.method5722(var2);
        class409 var4 = new class409(var2);
        Class var5 = var3.field4045.field4266;
        if (var5 == Integer.class) {
            var4.field4354 = arg0.method6277();
        } else if (var5 == Long.class) {
            var4.field4354 = arg0.method6275();
        } else if (var5 == String.class) {
            var4.field4354 = arg0.method6282();
        } else if (class404.class.isAssignableFrom(var5)) {
            try {
                class404 var6 = (class404) var5.getDeclaredConstructor().newInstance();
                var6.method6520(arg0, -1429050166);
                var4.field4354 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("mu.l(IB)Lmp;")
    public abstract class357 method5722(int arg0);
}
