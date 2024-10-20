package deob;

@ObfuscatedName("oa")
public class class392 implements class303 {

    @ObfuscatedName("oa.n")
    public static final class392 field4241 = new class392(2, 0, Integer.class, new class389());

    @ObfuscatedName("oa.c")
    public static final class392 field4242 = new class392(0, 1, Long.class, new class391());

    @ObfuscatedName("oa.m")
    public static final class392 field4239 = new class392(1, 2, String.class, new class393());

    @ObfuscatedName("oa.k")
    public final int field4240;

    @ObfuscatedName("oa.o")
    public final int field4238;

    @ObfuscatedName("oa.g")
    public final Class field4247;

    @ObfuscatedName("oa.z")
    public final class388 field4243;

    public class392(int arg0, int arg1, Class arg2, class388 arg3) {
        this.field4240 = arg0;
        this.field4238 = arg1;
        this.field4247 = arg2;
        this.field4243 = arg3;
    }

    @ObfuscatedName("oa.n(Ljava/lang/Class;B)Loa;")
    public static class392 method6122(Class arg0) {
        class392[] var1 = new class392[] { field4241, field4239, field4242 };
        class392[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class392 var4 = var2[var3];
            if (var4.field4247 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("oa.m(Ljava/lang/Object;Lot;I)V")
    public static void method6123(Object arg0, class400 arg1) {
        Class var2 = arg0.getClass();
        class392 var3 = method6122(var2);
        if (var3 == null) {
            throw new IllegalArgumentException();
        }
        class388 var4 = var3.field4243;
        var4.method6113(arg0, arg1);
    }

    @ObfuscatedName("oa.c(I)I")
    public int method42() {
        return this.field4238;
    }

    @ObfuscatedName("oa.k(Lot;I)Ljava/lang/Object;")
    public Object method6124(class400 arg0) {
        return this.field4243.method6111(arg0);
    }
}
