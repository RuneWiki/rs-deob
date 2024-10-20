package deob;

@ObfuscatedName("hb")
public class class232 {

    @ObfuscatedName("hb.a")
    public static final class232 field2752 = new class232(0, 0, 4);

    @ObfuscatedName("hb.f")
    public static final class232 field2753 = new class232(2, 1, 2);

    @ObfuscatedName("hb.c")
    public static final class232 field2755 = new class232(1, 2, 0);

    @ObfuscatedName("hb.x")
    public final int field2754;

    @ObfuscatedName("hb.h")
    public final int field2756;

    @ObfuscatedName("hb.j")
    public final int field2757;

    @ObfuscatedName("hb.a(I)[Lhb;")
    public static class232[] method4325() {
        return new class232[] { field2755, field2753, field2752 };
    }

    public class232(int arg0, int arg1, int arg2) {
        this.field2754 = arg0;
        this.field2756 = arg1;
        this.field2757 = arg2;
    }

    @ObfuscatedName("hb.f(FI)Z")
    public boolean method4316(float arg0) {
        return arg0 >= (float) this.field2757;
    }

    @ObfuscatedName("hb.c(IS)Lhb;")
    public static class232 method4317(int arg0) {
        class232[] var1 = method4325();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class232 var3 = var1[var2];
            if (var3.field2756 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
