package deob;

@ObfuscatedName("jd")
public class class246 {

    @ObfuscatedName("jd.af")
    public static final class246 field2860 = new class246(0, 0, 4);

    @ObfuscatedName("jd.an")
    public static final class246 field2865 = new class246(2, 1, 2);

    @ObfuscatedName("jd.aw")
    public static final class246 field2861 = new class246(1, 2, 0);

    @ObfuscatedName("jd.ac")
    public final int field2862;

    @ObfuscatedName("jd.au")
    public final int field2859;

    @ObfuscatedName("jd.ab")
    public final int field2864;

    public class246(int arg0, int arg1, int arg2) {
        this.field2862 = arg0;
        this.field2859 = arg1;
        this.field2864 = arg2;
    }

    @ObfuscatedName("jd.af(FB)Z")
    public boolean method4640(float arg0) {
        return arg0 >= (float) this.field2864;
    }

    @ObfuscatedName("jd.an(II)Ljd;")
    public static class246 method4641(int arg0) {
        class246[] var1 = new class246[] { field2860, field2865, field2861 };
        class246[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class246 var4 = var2[var3];
            if (var4.field2859 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
