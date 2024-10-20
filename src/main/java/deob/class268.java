package deob;

@ObfuscatedName("ka")
public class class268 {

    @ObfuscatedName("ka.ac")
    public static final class268 field2908 = new class268(1, 0, 4);

    @ObfuscatedName("ka.al")
    public static final class268 field2901 = new class268(0, 1, 2);

    @ObfuscatedName("ka.ak")
    public static final class268 field2902 = new class268(2, 2, 0);

    @ObfuscatedName("ka.ax")
    public final int field2903;

    @ObfuscatedName("ka.ao")
    public final int field2904;

    @ObfuscatedName("ka.ah")
    public final int field2905;

    public class268(int arg0, int arg1, int arg2) {
        this.field2903 = arg0;
        this.field2904 = arg1;
        this.field2905 = arg2;
    }

    @ObfuscatedName("ka.ac(FI)Z")
    public boolean method4803(float arg0) {
        return arg0 >= (float) this.field2905;
    }

    @ObfuscatedName("ka.al(IB)Lka;")
    public static class268 method4797(int arg0) {
        class268[] var1 = new class268[] { field2901, field2902, field2908 };
        class268[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class268 var4 = var2[var3];
            if (var4.field2904 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
