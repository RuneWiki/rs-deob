package deob;

@ObfuscatedName("ht")
public class class230 {

    @ObfuscatedName("ht.q")
    public static final class230 field3102 = new class230("LIVE", 0);

    @ObfuscatedName("ht.w")
    public static final class230 field3099 = new class230("BUILDLIVE", 3);

    @ObfuscatedName("ht.e")
    public static final class230 field3100 = new class230("RC", 1);

    @ObfuscatedName("ht.p")
    public static final class230 field3103 = new class230("WIP", 2);

    @ObfuscatedName("ht.k")
    public final String field3101;

    @ObfuscatedName("ht.l")
    public final int field3098;

    @ObfuscatedName("lv.q(I)[Lht;")
    public static class230[] method5776() {
        return new class230[] { field3100, field3102, field3103, field3099 };
    }

    public class230(String arg0, int arg1) {
        this.field3101 = arg0;
        this.field3098 = arg1;
    }

    @ObfuscatedName("ht.w(II)Lht;")
    public static class230 method3766(int arg0) {
        class230[] var1 = method5776();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class230 var3 = var1[var2];
            if (var3.field3098 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
