package deob;

@ObfuscatedName("ab")
public class class27 {

    @ObfuscatedName("ab.z")
    public static final class27 field146 = new class27(0, 0, 4);

    @ObfuscatedName("ab.k")
    public static final class27 field139 = new class27(1, 1, 2);

    @ObfuscatedName("ab.s")
    public static final class27 field145 = new class27(2, 2, 0);

    @ObfuscatedName("ab.t")
    public final int field142;

    @ObfuscatedName("ab.i")
    public final int field143;

    @ObfuscatedName("ab.o")
    public final int field144;

    @ObfuscatedName("ab.z(I)[Lab;")
    public static class27[] method238() {
        return new class27[] { field145, field146, field139 };
    }

    public class27(int arg0, int arg1, int arg2) {
        this.field142 = arg0;
        this.field143 = arg1;
        this.field144 = arg2;
    }

    @ObfuscatedName("ab.k(FI)Z")
    public boolean method240(float arg0) {
        return arg0 >= (float) this.field144;
    }

    @ObfuscatedName("ab.s(II)Lab;")
    public static class27 method236(int arg0) {
        class27[] var1 = method238();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class27 var3 = var1[var2];
            if (var3.field143 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
