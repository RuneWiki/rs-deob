package deob;

@ObfuscatedName("or")
public abstract class class416 extends class263 implements class475 {

    public class416(class322 arg0, class348 arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @ObfuscatedName("or.e(B)I")
    public int method7164() {
        return this.field3023;
    }

    @ObfuscatedName("or.v(II)Ljava/lang/Object;")
    public Object method7165(int arg0) {
        class418 var2 = this.method7166(arg0);
        return var2 != null && var2.method7185() ? var2.method7186() : null;
    }

    @ObfuscatedName("or.x(Lqy;I)Lrz;")
    public class476 method7171(class467 arg0) {
        int var2 = arg0.method7794();
        class418 var3 = this.method7166(var2);
        class476 var4 = new class476(var2);
        Class var5 = var3.field4652.field4876;
        if (var5 == Integer.class) {
            var4.field4982 = arg0.method7946();
        } else if (var5 == Long.class) {
            var4.field4982 = arg0.method7958();
        } else if (var5 == String.class) {
            var4.field4982 = arg0.method7802();
        } else if (class471.class.isAssignableFrom(var5)) {
            try {
                class471 var6 = (class471) var5.getDeclaredConstructor().newInstance();
                var6.method8080(arg0, 456766279);
                var4.field4982 = var6;
            } catch (InstantiationException var9) {
            } catch (IllegalAccessException var10) {
            }
        } else {
            throw new IllegalStateException();
        }
        return var4;
    }

    @ObfuscatedName("or.h(II)Lpv;")
    public abstract class418 method7166(int arg0);
}
