package deob;

@ObfuscatedName("ps")
public class class435 implements class330 {

    @ObfuscatedName("ps.c")
    public static final class435 field4692 = new class435(1, 0, Integer.class, new class432());

    @ObfuscatedName("ps.p")
    public static final class435 field4689 = new class435(0, 1, Long.class, new class434());

    @ObfuscatedName("ps.f")
    public static final class435 field4690 = new class435(2, 2, String.class, new class436());

    @ObfuscatedName("ps.n")
    public final int field4695;

    @ObfuscatedName("ps.k")
    public final int field4693;

    @ObfuscatedName("ps.w")
    public final Class field4698;

    @ObfuscatedName("ps.s")
    public final class431 field4694;

    @ObfuscatedName("ps.c(B)[Lps;")
    public static class435[] method7062() {
        return new class435[] { field4689, field4692, field4690 };
    }

    public class435(int arg0, int arg1, Class arg2, class431 arg3) {
        this.field4695 = arg0;
        this.field4693 = arg1;
        this.field4698 = arg2;
        this.field4694 = arg3;
    }

    @ObfuscatedName("ps.f(Ljava/lang/Class;I)Lps;")
    public static class435 method7068(Class arg0) {
        class435[] var1 = method7062();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class435 var3 = var1[var2];
            if (var3.field4698 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("ps.n(Ljava/lang/Object;Lqq;B)V")
    public static void method7058(Object arg0, class445 arg1) {
        Class var2 = arg0.getClass();
        class435 var3 = method7068(var2);
        if (var3 == null) {
            throw new IllegalArgumentException();
        }
        class431 var4 = var3.field4694;
        var4.method7044(arg0, arg1);
    }

    @ObfuscatedName("ps.p(B)I")
    public int method42() {
        return this.field4693;
    }

    @ObfuscatedName("ps.k(Lqq;B)Ljava/lang/Object;")
    public Object method7060(class445 arg0) {
        return this.field4694.method7038(arg0);
    }
}
