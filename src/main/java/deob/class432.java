package deob;

@ObfuscatedName("pk")
public class class432 implements class329 {

    @ObfuscatedName("pk.v")
    public static final class432 field4596 = new class432(1, 0, Integer.class, new class429());

    @ObfuscatedName("pk.c")
    public static final class432 field4593 = new class432(0, 1, Long.class, new class431());

    @ObfuscatedName("pk.i")
    public static final class432 field4599 = new class432(2, 2, String.class, new class433());

    @ObfuscatedName("pk.f")
    public final int field4595;

    @ObfuscatedName("pk.b")
    public final int field4597;

    @ObfuscatedName("pk.n")
    public final Class field4594;

    @ObfuscatedName("pk.s")
    public final class428 field4598;

    @ObfuscatedName("pk.f(B)[Lpk;")
    public static class432[] method6887() {
        return new class432[] { field4593, field4596, field4599 };
    }

    public class432(int arg0, int arg1, Class arg2, class428 arg3) {
        this.field4595 = arg0;
        this.field4597 = arg1;
        this.field4594 = arg2;
        this.field4598 = arg3;
    }

    @ObfuscatedName("pk.b(Ljava/lang/Object;Lpi;B)V")
    public static void method6884(Object arg0, class438 arg1) {
        Class var2 = arg0.getClass();
        class432[] var3 = method6887();
        int var4 = 0;
        class432 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class432 var5 = var3[var4];
            if (var5.field4594 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            throw new IllegalArgumentException();
        }
        class428 var8 = var6.field4598;
        var8.method6870(arg0, arg1);
    }

    @ObfuscatedName("pk.v(B)I")
    public int method38() {
        return this.field4597;
    }

    @ObfuscatedName("pk.n(Lpi;I)Ljava/lang/Object;")
    public Object method6886(class438 arg0) {
        return this.field4598.method6871(arg0);
    }
}
