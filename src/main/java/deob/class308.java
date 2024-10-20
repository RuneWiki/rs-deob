package deob;

@ObfuscatedName("kb")
public class class308 {

    @ObfuscatedName("kb.z")
    public static final class308 field3734 = new class308(0);

    @ObfuscatedName("kb.w")
    public static final class308 field3735 = new class308(1);

    @ObfuscatedName("kb.s")
    public static final class308 field3733 = new class308(2);

    @ObfuscatedName("kb.l")
    public final int field3736;

    public class308(int arg0) {
        this.field3736 = arg0;
    }

    @ObfuscatedName("gi.z(IS)Lkb;")
    public static class308 method3539(int arg0) {
        class308[] var1 = new class308[] { field3734, field3733, field3735 };
        class308[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class308 var4 = var2[var3];
            if (var4.field3736 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
