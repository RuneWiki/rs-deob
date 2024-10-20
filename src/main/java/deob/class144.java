package deob;

@ObfuscatedName("ex")
public class class144 {

    @ObfuscatedName("ex.n")
    public static final class144 field2170 = new class144("LIVE", 0);

    @ObfuscatedName("ex.d")
    public static final class144 field2171 = new class144("BUILDLIVE", 3);

    @ObfuscatedName("ex.z")
    public static final class144 field2174 = new class144("RC", 1);

    @ObfuscatedName("ex.y")
    public static final class144 field2173 = new class144("WIP", 2);

    @ObfuscatedName("ex.e")
    public final String field2175;

    @ObfuscatedName("ex.g")
    public final int field2172;

    @ObfuscatedName("q.n(B)[Lex;")
    public static class144[] method142() {
        return new class144[] { field2170, field2173, field2174, field2171 };
    }

    public class144(String arg0, int arg1) {
        this.field2175 = arg0;
        this.field2172 = arg1;
    }

    @ObfuscatedName("at.d(II)Lex;")
    public static class144 method756(int arg0) {
        class144[] var1 = method142();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class144 var3 = var1[var2];
            if (var3.field2172 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
