package deob;

@ObfuscatedName("js")
public class class264 {

    @ObfuscatedName("js.f")
    public static final class264 field3204 = new class264("LIVE", 0);

    @ObfuscatedName("js.e")
    public static final class264 field3199 = new class264("BUILDLIVE", 3);

    @ObfuscatedName("js.v")
    public static final class264 field3200 = new class264("RC", 1);

    @ObfuscatedName("js.y")
    public static final class264 field3201 = new class264("WIP", 2);

    @ObfuscatedName("js.j")
    public final String field3198;

    @ObfuscatedName("js.o")
    public final int field3203;

    @ObfuscatedName("dp.f(I)[Ljs;")
    public static class264[] method2260() {
        return new class264[] { field3201, field3199, field3200, field3204 };
    }

    public class264(String arg0, int arg1) {
        this.field3198 = arg0;
        this.field3203 = arg1;
    }

    @ObfuscatedName("bn.e(II)Ljs;")
    public static class264 method999(int arg0) {
        class264[] var1 = method2260();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class264 var3 = var1[var2];
            if (var3.field3203 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
