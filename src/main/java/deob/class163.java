package deob;

@ObfuscatedName("fp")
public class class163 {

    @ObfuscatedName("fp.v")
    public static final class163 field1928 = new class163(0, 0, 4);

    @ObfuscatedName("fp.n")
    public static final class163 field1929 = new class163(1, 1, 2);

    @ObfuscatedName("fp.f")
    public static final class163 field1930 = new class163(2, 2, 0);

    @ObfuscatedName("fp.y")
    public final int field1936;

    @ObfuscatedName("fp.p")
    public final int field1934;

    @ObfuscatedName("fp.j")
    public final int field1933;

    @ObfuscatedName("fp.v(I)[Lfp;")
    public static class163[] method2976() {
        return new class163[] { field1929, field1930, field1928 };
    }

    public class163(int arg0, int arg1, int arg2) {
        this.field1936 = arg0;
        this.field1934 = arg1;
        this.field1933 = arg2;
    }

    @ObfuscatedName("fp.n(FI)Z")
    public boolean method2970(float arg0) {
        return arg0 >= (float) this.field1933;
    }

    @ObfuscatedName("fp.f(II)Lfp;")
    public static class163 method2963(int arg0) {
        class163[] var1 = method2976();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class163 var3 = var1[var2];
            if (var3.field1934 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
