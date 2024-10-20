package deob;

@ObfuscatedName("ml")
public abstract class class355 extends class230 implements class408 {

    public class355(class279 arg0, class305 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("ml.w(I)I")
    public int method5701() {
        return this.field2648;
    }

    @ObfuscatedName("ml.s(II)Ljava/lang/Object;")
    public Object method5702(int arg0) {
        class357 var2 = this.method5709(arg0);
        return var2 != null && var2.method5723() ? var2.method5724() : null;
    }

    @ObfuscatedName("ml.a(Lop;B)Lov;")
    public class409 method5708(class401 arg0) {
        int var2 = arg0.method6242();
        class357 var3 = this.method5709(var2);
        class409 var4 = new class409(var2);
        Class var5 = var3.field4041.field4275;
        if (var5 == Integer.class) {
            var4.field4362 = arg0.method6245();
        } else if (var5 == Long.class) {
            var4.field4362 = arg0.method6249();
        } else if (var5 == String.class) {
            var4.field4362 = arg0.method6250();
        } else if (class404.class.isAssignableFrom(var5)) {
            try {
                class404 var6 = (class404) var5.getDeclaredConstructor().newInstance();
                var6.method6490(arg0, 1000063391);
                var4.field4362 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("ml.i(IB)Lmn;")
    public abstract class357 method5709(int arg0);
}
