package deob;

@ObfuscatedName("o")
public class class25 {

    @ObfuscatedName("o.d")
    public static final class25 field363 = new class25("SMALL", 2, 0, 4);

    @ObfuscatedName("o.z")
    public static final class25 field369 = new class25("MEDIUM", 1, 1, 2);

    @ObfuscatedName("o.n")
    public static final class25 field365 = new class25("LARGE", 0, 2, 0);

    @ObfuscatedName("o.r")
    public final String field364;

    @ObfuscatedName("o.e")
    public final int field374;

    @ObfuscatedName("o.y")
    public final int field368;

    @ObfuscatedName("o.k")
    public final int field367;

    @ObfuscatedName("o.d(I)[Lo;")
    public static class25[] method170() {
        return new class25[] { field369, field363, field365 };
    }

    public class25(String arg0, int arg1, int arg2, int arg3) {
        this.field364 = arg0;
        this.field374 = arg1;
        this.field368 = arg2;
        this.field367 = arg3;
    }

    @ObfuscatedName("o.z(FI)Z")
    public boolean method167(float arg0) {
        return arg0 >= (float) this.field367;
    }

    @ObfuscatedName("o.n(II)Lo;")
    public static class25 method168(int arg0) {
        class25[] var1 = method170();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class25 var3 = var1[var2];
            if (var3.field368 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
