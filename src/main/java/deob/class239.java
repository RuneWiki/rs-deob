package deob;

@ObfuscatedName("id")
public class class239 {

    @ObfuscatedName("id.m")
    public static final class239 field3252 = new class239("LIVE", 0);

    @ObfuscatedName("id.p")
    public static final class239 field3245 = new class239("BUILDLIVE", 3);

    @ObfuscatedName("id.i")
    public static final class239 field3247 = new class239("RC", 1);

    @ObfuscatedName("id.j")
    public static final class239 field3248 = new class239("WIP", 2);

    @ObfuscatedName("id.v")
    public final String field3249;

    @ObfuscatedName("id.x")
    public final int field3250;

    @ObfuscatedName("ck.m(I)[Lid;")
    public static class239[] method1638() {
        return new class239[] { field3252, field3245, field3248, field3247 };
    }

    public class239(String arg0, int arg1) {
        this.field3249 = arg0;
        this.field3250 = arg1;
    }

    @ObfuscatedName("hw.p(II)Lid;")
    public static class239 method3820(int arg0) {
        class239[] var1 = method1638();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class239 var3 = var1[var2];
            if (var3.field3250 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
