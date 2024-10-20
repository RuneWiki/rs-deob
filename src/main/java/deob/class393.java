package deob;

@ObfuscatedName("od")
public class class393 implements class303 {

    @ObfuscatedName("od.l")
    public static final class393 field4267 = new class393(1, 0, Integer.class, new class390());

    @ObfuscatedName("od.q")
    public static final class393 field4274 = new class393(2, 1, Long.class, new class392());

    @ObfuscatedName("od.f")
    public static final class393 field4265 = new class393(0, 2, String.class, new class394());

    @ObfuscatedName("od.j")
    public final int field4264;

    @ObfuscatedName("od.m")
    public final int field4261;

    @ObfuscatedName("od.k")
    public final Class field4266;

    @ObfuscatedName("od.t")
    public final class389 field4262;

    public class393(int arg0, int arg1, Class arg2, class389 arg3) {
        this.field4264 = arg0;
        this.field4261 = arg1;
        this.field4266 = arg2;
        this.field4262 = arg3;
    }

    @ObfuscatedName("od.m(Ljava/lang/Object;Lot;I)V")
    public static void method6183(Object arg0, class401 arg1) {
        class389 var2 = method6184(arg0.getClass());
        var2.method6166(arg0, arg1);
    }

    @ObfuscatedName("od.k(Ljava/lang/Class;I)Lnb;")
    public static class389 method6184(Class arg0) {
        class393[] var1 = new class393[] { field4267, field4265, field4274 };
        class393[] var2 = var1;
        int var3 = 0;
        class393 var5;
        while (true) {
            if (var3 >= var2.length) {
                var5 = null;
                break;
            }
            class393 var4 = var2[var3];
            if (var4.field4266 == arg0) {
                var5 = var4;
                break;
            }
            var3++;
        }
        if (var5 == null) {
            throw new IllegalArgumentException();
        }
        return var5.field4262;
    }

    @ObfuscatedName("od.l(I)I")
    public int method36() {
        return this.field4261;
    }

    @ObfuscatedName("od.t(Lot;B)Ljava/lang/Object;")
    public Object method6185(class401 arg0) {
        return this.field4262.method6164(arg0);
    }
}
