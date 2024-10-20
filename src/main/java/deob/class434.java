package deob;

@ObfuscatedName("pk")
public class class434 implements class329 {

    @ObfuscatedName("pk.s")
    public static final class434 field4660 = new class434(0, 0, Integer.class, new class431());

    @ObfuscatedName("pk.h")
    public static final class434 field4654 = new class434(2, 1, Long.class, new class433());

    @ObfuscatedName("pk.w")
    public static final class434 field4656 = new class434(1, 2, String.class, new class435());

    @ObfuscatedName("pk.v")
    public final int field4658;

    @ObfuscatedName("pk.c")
    public final int field4659;

    @ObfuscatedName("pk.q")
    public final Class field4657;

    @ObfuscatedName("pk.i")
    public final class430 field4655;

    public class434(int arg0, int arg1, Class arg2, class430 arg3) {
        this.field4658 = arg0;
        this.field4659 = arg1;
        this.field4657 = arg2;
        this.field4655 = arg3;
    }

    @ObfuscatedName("pk.v(Ljava/lang/Class;I)Lpo;")
    public static class430 method6805(Class arg0) {
        class434 var1 = Statics.method6793(arg0);
        if (var1 == null) {
            throw new IllegalArgumentException();
        }
        return var1.field4655;
    }

    @ObfuscatedName("pk.h(B)I")
    public int method39() {
        return this.field4659;
    }

    @ObfuscatedName("pk.i(Lqr;I)Ljava/lang/Object;")
    public Object method6796(class444 arg0) {
        return this.field4655.method6777(arg0);
    }
}
