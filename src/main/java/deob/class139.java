package deob;

@ObfuscatedName("ez")
public class class139 {

    @ObfuscatedName("ez.l")
    public static final class139 field2345 = new class139(0);

    @ObfuscatedName("ez.b")
    public static final class139 field2346 = new class139(1);

    @ObfuscatedName("ez.o")
    public static final class139 field2344 = new class139(2);

    @ObfuscatedName("ez.w")
    public final int field2343;

    public class139(int arg0) {
        this.field2343 = arg0;
    }

    @ObfuscatedName("ax.l(IB)Lez;")
    public static class139 method820(int arg0) {
        class139[] var1 = new class139[] { field2346, field2345, field2344 };
        class139[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class139 var4 = var2[var3];
            if (var4.field2343 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
