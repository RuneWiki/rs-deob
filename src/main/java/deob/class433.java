package deob;

@ObfuscatedName("pv")
public class class433 implements class328 {

    @ObfuscatedName("pv.c")
    public static final class433 field4659 = new class433(2, 0, Integer.class, new class430());

    @ObfuscatedName("pv.v")
    public static final class433 field4657 = new class433(1, 1, Long.class, new class432());

    @ObfuscatedName("pv.q")
    public static final class433 field4658 = new class433(0, 2, String.class, new class434());

    @ObfuscatedName("pv.f")
    public final int field4661;

    @ObfuscatedName("pv.j")
    public final int field4656;

    @ObfuscatedName("pv.e")
    public final Class field4660;

    @ObfuscatedName("pv.g")
    public final class429 field4662;

    @ObfuscatedName("pv.f(I)[Lpv;")
    public static class433[] method6888() {
        return new class433[] { field4658, field4659, field4657 };
    }

    public class433(int arg0, int arg1, Class arg2, class429 arg3) {
        this.field4661 = arg0;
        this.field4656 = arg1;
        this.field4660 = arg2;
        this.field4662 = arg3;
    }

    @ObfuscatedName("pv.e(Ljava/lang/Class;I)Lpf;")
    public static class429 method6899(Class arg0) {
        class433 var1 = Statics.method6884(arg0);
        if (var1 == null) {
            throw new IllegalArgumentException();
        }
        return var1.field4662;
    }

    @ObfuscatedName("pv.c(B)I")
    public int method33() {
        return this.field4656;
    }

    @ObfuscatedName("pv.g(Lqt;B)Ljava/lang/Object;")
    public Object method6887(class443 arg0) {
        return this.field4662.method6867(arg0);
    }
}
