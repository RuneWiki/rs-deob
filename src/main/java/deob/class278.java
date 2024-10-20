package deob;

@ObfuscatedName("jv")
public class class278 {

    @ObfuscatedName("jv.w")
    public static final class278 field3750 = new class278(0);

    @ObfuscatedName("jv.s")
    public static final class278 field3745 = new class278(1);

    @ObfuscatedName("jv.q")
    public static final class278 field3746 = new class278(2);

    @ObfuscatedName("jv.o")
    public final int field3744;

    @ObfuscatedName("cm.w(B)[Ljv;")
    public static class278[] method1577() {
        return new class278[] { field3750, field3746, field3745 };
    }

    public class278(int arg0) {
        this.field3744 = arg0;
    }

    @ObfuscatedName("da.s(II)Ljv;")
    public static class278 method2253(int arg0) {
        class278[] var1 = method1577();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class278 var3 = var1[var2];
            if (var3.field3744 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
