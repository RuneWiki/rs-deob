package deob;

@ObfuscatedName("ux")
public class class538 implements class404 {

    @ObfuscatedName("ux.ac")
    public static final class538 field5333 = new class538(2, 0, Integer.class, new class535());

    @ObfuscatedName("ux.ae")
    public static final class538 field5334 = new class538(0, 1, Long.class, new class537());

    @ObfuscatedName("ux.ag")
    public static final class538 field5332 = new class538(1, 2, String.class, new class539());

    @ObfuscatedName("ux.am")
    public final int field5331;

    @ObfuscatedName("ux.ax")
    public final int field5335;

    @ObfuscatedName("ux.aq")
    public final Class field5336;

    @ObfuscatedName("ux.af")
    public final class534 field5337;

    @ObfuscatedName("ux.ax(I)[Lux;")
    public static class538[] method8833() {
        return new class538[] { field5334, field5333, field5332 };
    }

    public class538(int arg0, int arg1, Class arg2, class534 arg3) {
        this.field5331 = arg0;
        this.field5335 = arg1;
        this.field5336 = arg2;
        this.field5337 = arg3;
    }

    @ObfuscatedName("ux.aq(Ljava/lang/Class;I)Lux;")
    public static class538 method8821(Class arg0) {
        class538[] var1 = method8833();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class538 var3 = var1[var2];
            if (var3.field5336 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("ux.af(Ljava/lang/Object;Lvf;I)V")
    public static void method8822(Object arg0, class551 arg1) {
        Class var2 = arg0.getClass();
        class538 var3 = method8821(var2);
        if (var3 == null) {
            throw new IllegalArgumentException();
        }
        class534 var4 = var3.field5337;
        var4.method8803(arg0, arg1);
    }

    @ObfuscatedName("ux.ac(I)I")
    public int method32() {
        return this.field5335;
    }

    @ObfuscatedName("ux.at(Lvf;I)Ljava/lang/Object;")
    public Object method8823(class551 arg0) {
        return this.field5337.method8798(arg0);
    }
}
