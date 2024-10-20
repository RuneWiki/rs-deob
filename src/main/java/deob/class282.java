package deob;

@ObfuscatedName("kv")
public class class282 {

    @ObfuscatedName("kv.ap")
    public static final class282 field3087 = new class282(1, 0, 4);

    @ObfuscatedName("kv.aw")
    public static final class282 field3086 = new class282(2, 1, 2);

    @ObfuscatedName("kv.ak")
    public static final class282 field3082 = new class282(0, 2, 0);

    @ObfuscatedName("kv.aj")
    public final int field3083;

    @ObfuscatedName("kv.ai")
    public final int field3084;

    @ObfuscatedName("kv.ay")
    public final int field3085;

    public class282(int arg0, int arg1, int arg2) {
        this.field3083 = arg0;
        this.field3084 = arg1;
        this.field3085 = arg2;
    }

    @ObfuscatedName("kv.ap(FI)Z")
    public boolean method5449(float arg0) {
        return arg0 >= (float) this.field3085;
    }

    @ObfuscatedName("kv.aw(II)Lkv;")
    public static class282 method5450(int arg0) {
        class282[] var1 = new class282[] { field3082, field3086, field3087 };
        class282[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class282 var4 = var2[var3];
            if (var4.field3084 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
