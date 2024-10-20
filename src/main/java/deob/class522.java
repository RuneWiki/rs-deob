package deob;

@ObfuscatedName("uh")
public class class522 implements class391 {

    @ObfuscatedName("uh.aq")
    public static final class522 field5126 = new class522(1, 0, Integer.class, new class519());

    @ObfuscatedName("uh.aw")
    public static final class522 field5129 = new class522(2, 1, Long.class, new class521());

    @ObfuscatedName("uh.al")
    public static final class522 field5127 = new class522(0, 2, String.class, new class523());

    @ObfuscatedName("uh.ai")
    public final int field5128;

    @ObfuscatedName("uh.ar")
    public final int field5125;

    @ObfuscatedName("uh.as")
    public final Class field5130;

    @ObfuscatedName("uh.aa")
    public final class518 field5131;

    @ObfuscatedName("uh.ar(I)[Luh;")
    public static class522[] method8464() {
        return new class522[] { field5127, field5126, field5129 };
    }

    public class522(int arg0, int arg1, Class arg2, class518 arg3) {
        this.field5128 = arg0;
        this.field5125 = arg1;
        this.field5130 = arg2;
        this.field5131 = arg3;
    }

    @ObfuscatedName("uh.as(Ljava/lang/Class;I)Luh;")
    public static class522 method8463(Class arg0) {
        class522[] var1 = method8464();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class522 var3 = var1[var2];
            if (var3.field5130 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("uh.aa(Ljava/lang/Class;I)Ltq;")
    public static class518 method8454(Class arg0) {
        class522 var1 = method8463(arg0);
        if (var1 == null) {
            throw new IllegalArgumentException();
        }
        return var1.field5131;
    }

    @ObfuscatedName("uh.aq(I)I")
    public int method35() {
        return this.field5125;
    }

    @ObfuscatedName("uh.az(Luq;I)Ljava/lang/Object;")
    public Object method8455(class534 arg0) {
        return this.field5131.method8434(arg0);
    }
}
