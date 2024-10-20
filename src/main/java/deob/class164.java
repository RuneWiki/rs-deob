package deob;

@ObfuscatedName("fg")
public class class164 {

    @ObfuscatedName("fg.f")
    public static final class164 field1942 = new class164(2, 0, 4);

    @ObfuscatedName("fg.e")
    public static final class164 field1948 = new class164(0, 1, 2);

    @ObfuscatedName("fg.v")
    public static final class164 field1943 = new class164(1, 2, 0);

    @ObfuscatedName("fg.y")
    public final int field1944;

    @ObfuscatedName("fg.j")
    public final int field1949;

    @ObfuscatedName("fg.o")
    public final int field1946;

    @ObfuscatedName("fg.f(I)[Lfg;")
    public static class164[] method2963() {
        return new class164[] { field1942, field1948, field1943 };
    }

    public class164(int arg0, int arg1, int arg2) {
        this.field1944 = arg0;
        this.field1949 = arg1;
        this.field1946 = arg2;
    }

    @ObfuscatedName("fg.e(FI)Z")
    public boolean method2961(float arg0) {
        return arg0 >= (float) this.field1946;
    }

    @ObfuscatedName("fg.v(IB)Lfg;")
    public static class164 method2964(int arg0) {
        class164[] var1 = method2963();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3.field1949 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
