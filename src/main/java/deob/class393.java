package deob;

@ObfuscatedName("og")
public class class393 implements class303 {

    @ObfuscatedName("og.i")
    public static final class393 field4277 = new class393(2, 0, Integer.class, new class390());

    @ObfuscatedName("og.w")
    public static final class393 field4271 = new class393(1, 1, Long.class, new class392());

    @ObfuscatedName("og.s")
    public static final class393 field4272 = new class393(0, 2, String.class, new class394());

    @ObfuscatedName("og.a")
    public final int field4270;

    @ObfuscatedName("og.o")
    public final int field4274;

    @ObfuscatedName("og.g")
    public final Class field4275;

    @ObfuscatedName("og.e")
    public final class389 field4276;

    @ObfuscatedName("og.i(S)[Log;")
    public static class393[] method6140() {
        return new class393[] { field4277, field4271, field4272 };
    }

    public class393(int arg0, int arg1, Class arg2, class389 arg3) {
        this.field4270 = arg0;
        this.field4274 = arg1;
        this.field4275 = arg2;
        this.field4276 = arg3;
    }

    @ObfuscatedName("og.s(Ljava/lang/Class;I)Log;")
    public static class393 method6141(Class arg0) {
        class393[] var1 = method6140();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class393 var3 = var1[var2];
            if (var3.field4275 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("og.w(I)I")
    public int method38() {
        return this.field4274;
    }

    @ObfuscatedName("og.a(Lop;I)Ljava/lang/Object;")
    public Object method6143(class401 arg0) {
        return this.field4276.method6123(arg0);
    }
}
