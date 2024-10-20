package deob;

import java.util.Locale;

@ObfuscatedName("gs")
public class class191 implements class195 {

    @ObfuscatedName("gs.f")
    public static final class191 field2336 = new class191("EN", "en", "English", class193.field2370, 0, "GB");

    @ObfuscatedName("gs.i")
    public static final class191 field2348 = new class191("DE", "de", "German", class193.field2370, 1, "DE");

    @ObfuscatedName("gs.y")
    public static final class191 field2338 = new class191("FR", "fr", "French", class193.field2370, 2, "FR");

    @ObfuscatedName("gs.w")
    public static final class191 field2341 = new class191("PT", "pt", "Portuguese", class193.field2370, 3, "BR");

    @ObfuscatedName("gs.p")
    public static final class191 field2349 = new class191("NL", "nl", "Dutch", class193.field2361, 4, "NL");

    @ObfuscatedName("gs.b")
    public static final class191 field2337 = new class191("ES", "es", "Spanish", class193.field2361, 5, "ES");

    @ObfuscatedName("gs.e")
    public static final class191 field2342 = new class191("ES_MX", "es-mx", "Spanish (Latin American)", class193.field2370, 6, "MX");

    @ObfuscatedName("gs.x")
    public final String field2343;

    @ObfuscatedName("gs.a")
    public final String field2344;

    @ObfuscatedName("gs.d")
    public final int field2345;

    @ObfuscatedName("gs.c")
    public static final class191[] field2340;

    static {
        class191[] var0 = new class191[] { field2341, field2338, field2337, field2342, field2349, field2348, field2336 };
        field2340 = new class191[var0.length];
        class191[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class191 var4 = var2[var3];
            if (field2340[var4.field2345] != null) {
                throw new IllegalStateException();
            }
            field2340[var4.field2345] = var4;
        }
    }

    public class191(String arg0, String arg1, String arg2, class193 arg3, int arg4, String arg5) {
        this.field2343 = arg0;
        this.field2344 = arg1;
        this.field2345 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("gs.f(I)Ljava/lang/String;")
    public String method3321() {
        return this.field2344;
    }

    @ObfuscatedName("gs.i(B)I")
    public int method28() {
        return this.field2345;
    }

    public String toString() {
        return this.method3321().toLowerCase(Locale.ENGLISH);
    }
}
