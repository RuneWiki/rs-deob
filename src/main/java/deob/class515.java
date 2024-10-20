package deob;

@ObfuscatedName("tu")
public class class515 implements class384 {

    @ObfuscatedName("tu.at")
    public static final class515 field5066 = new class515(0, 0, Integer.class, new class512());

    @ObfuscatedName("tu.ah")
    public static final class515 field5067 = new class515(1, 1, Long.class, new class514());

    @ObfuscatedName("tu.ar")
    public static final class515 field5062 = new class515(2, 2, String.class, new class516());

    @ObfuscatedName("tu.ao")
    public final int field5061;

    @ObfuscatedName("tu.ab")
    public final int field5064;

    @ObfuscatedName("tu.au")
    public final Class field5065;

    @ObfuscatedName("tu.aa")
    public final class511 field5063;

    @ObfuscatedName("tu.at(I)[Ltu;")
    public static class515[] method8280() {
        return new class515[] { field5066, field5067, field5062 };
    }

    public class515(int arg0, int arg1, Class arg2, class511 arg3) {
        this.field5061 = arg0;
        this.field5064 = arg1;
        this.field5065 = arg2;
        this.field5063 = arg3;
    }

    @ObfuscatedName("tu.ar(Ljava/lang/Class;B)Ltu;")
    public static class515 method8282(Class arg0) {
        class515[] var1 = method8280();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class515 var3 = var1[var2];
            if (var3.field5065 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("tu.ah(B)I")
    public int method41() {
        return this.field5064;
    }

    @ObfuscatedName("tu.ao(Luj;I)Ljava/lang/Object;")
    public Object method8278(class527 arg0) {
        return this.field5063.method8257(arg0);
    }
}
