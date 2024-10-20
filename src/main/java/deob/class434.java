package deob;

@ObfuscatedName("pm")
public class class434 implements class329 {

    @ObfuscatedName("pm.o")
    public static final class434 field4665 = new class434(0, 0, Integer.class, new class431());

    @ObfuscatedName("pm.q")
    public static final class434 field4656 = new class434(2, 1, Long.class, new class433());

    @ObfuscatedName("pm.l")
    public static final class434 field4657 = new class434(1, 2, String.class, new class435());

    @ObfuscatedName("pm.k")
    public final int field4655;

    @ObfuscatedName("pm.a")
    public final int field4659;

    @ObfuscatedName("pm.m")
    public final Class field4668;

    @ObfuscatedName("pm.p")
    public final class430 field4661;

    public class434(int arg0, int arg1, Class arg2, class430 arg3) {
        this.field4655 = arg0;
        this.field4659 = arg1;
        this.field4668 = arg2;
        this.field4661 = arg3;
    }

    @ObfuscatedName("pm.k(Ljava/lang/Object;Lpx;I)V")
    public static void method6807(Object arg0, class440 arg1) {
        class430 var2 = method6810(arg0.getClass());
        var2.method6796(arg0, arg1);
    }

    @ObfuscatedName("pm.a(Ljava/lang/Class;B)Lpb;")
    public static class430 method6810(Class arg0) {
        class434[] var1 = new class434[] { field4656, field4657, field4665 };
        class434[] var2 = var1;
        int var3 = 0;
        class434 var5;
        while (true) {
            if (var3 >= var2.length) {
                var5 = null;
                break;
            }
            class434 var4 = var2[var3];
            if (var4.field4668 == arg0) {
                var5 = var4;
                break;
            }
            var3++;
        }
        if (var5 == null) {
            throw new IllegalArgumentException();
        }
        return var5.field4661;
    }

    @ObfuscatedName("pm.o(B)I")
    public int method40() {
        return this.field4659;
    }

    @ObfuscatedName("pm.m(Lpx;B)Ljava/lang/Object;")
    public Object method6809(class440 arg0) {
        return this.field4661.method6797(arg0);
    }
}
