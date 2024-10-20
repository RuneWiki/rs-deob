package deob;

@ObfuscatedName("n")
public class class25 {

    @ObfuscatedName("n.j")
    public static final class25 field370 = new class25("SMALL", 2, 0, 4);

    @ObfuscatedName("n.h")
    public static final class25 field367 = new class25("MEDIUM", 0, 1, 2);

    @ObfuscatedName("n.f")
    public static final class25 field368 = new class25("LARGE", 1, 2, 0);

    @ObfuscatedName("n.p")
    public final String field369;

    @ObfuscatedName("n.x")
    public final int field366;

    @ObfuscatedName("n.g")
    public final int field371;

    @ObfuscatedName("n.c")
    public final int field372;

    @ObfuscatedName("n.j(B)[Ln;")
    public static class25[] method176() {
        return new class25[] { field370, field368, field367 };
    }

    public class25(String arg0, int arg1, int arg2, int arg3) {
        this.field369 = arg0;
        this.field366 = arg1;
        this.field371 = arg2;
        this.field372 = arg3;
    }

    @ObfuscatedName("n.h(FI)Z")
    public boolean method175(float arg0) {
        return arg0 >= (float) this.field372;
    }

    @ObfuscatedName("n.f(II)Ln;")
    public static class25 method179(int arg0) {
        class25[] var1 = method176();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class25 var3 = var1[var2];
            if (var3.field371 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
