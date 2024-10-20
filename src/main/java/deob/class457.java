package deob;

@ObfuscatedName("qb")
public class class457 {

    @ObfuscatedName("qb.o")
    public static final class457 field4796 = new class457(0);

    @ObfuscatedName("qb.q")
    public static final class457 field4795 = new class457(1);

    @ObfuscatedName("qb.l")
    public static final class457 field4794 = new class457(2);

    @ObfuscatedName("qb.k")
    public final int field4797;

    public class457(int arg0) {
        this.field4797 = arg0;
    }

    @ObfuscatedName("dn.o(II)Lqb;")
    public static class457 method2544(int arg0) {
        class457[] var1 = new class457[] { field4795, field4794, field4796 };
        class457[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class457 var4 = var2[var3];
            if (var4.field4797 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
