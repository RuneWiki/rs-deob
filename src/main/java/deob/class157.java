package deob;

@ObfuscatedName("fm")
public class class157 {

    @ObfuscatedName("fm.k")
    public static final class157 field2323 = new class157("LIVE", 0);

    @ObfuscatedName("fm.q")
    public static final class157 field2314 = new class157("BUILDLIVE", 3);

    @ObfuscatedName("fm.f")
    public static final class157 field2322 = new class157("RC", 1);

    @ObfuscatedName("fm.c")
    public static final class157 field2317 = new class157("WIP", 2);

    @ObfuscatedName("fm.v")
    public final String field2325;

    @ObfuscatedName("fm.j")
    public final int field2319;

    @ObfuscatedName("as.k(B)[Lfm;")
    public static class157[] method1007() {
        return new class157[] { field2317, field2314, field2322, field2323 };
    }

    public class157(String arg0, int arg1) {
        this.field2325 = arg0;
        this.field2319 = arg1;
    }

    @ObfuscatedName("cj.q(IB)Lfm;")
    public static class157 method2034(int arg0) {
        class157[] var1 = method1007();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class157 var3 = var1[var2];
            if (var3.field2319 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
