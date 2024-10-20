package deob;

import java.util.Locale;

@class388
@class331
@ObfuscatedName("of")
public class class386 implements class384 {

    @ObfuscatedName("of.at")
    public static final class386 field4406 = new class386("EN", "en", "English", class387.field4418, 0, "GB");

    @ObfuscatedName("of.ah")
    public static final class386 field4400 = new class386("DE", "de", "German", class387.field4418, 1, "DE");

    @ObfuscatedName("of.ar")
    public static final class386 field4399 = new class386("FR", "fr", "French", class387.field4418, 2, "FR");

    @ObfuscatedName("of.ao")
    public static final class386 field4402 = new class386("PT", "pt", "Portuguese", class387.field4418, 3, "BR");

    @ObfuscatedName("of.ab")
    public static final class386 field4401 = new class386("NL", "nl", "Dutch", class387.field4417, 4, "NL");

    @ObfuscatedName("of.au")
    public static final class386 field4404 = new class386("ES", "es", "Spanish", class387.field4417, 5, "ES");

    @ObfuscatedName("of.aa")
    public static final class386 field4405 = new class386("ES_MX", "es-mx", "Spanish (Latin American)", class387.field4418, 6, "MX");

    @ObfuscatedName("of.ac")
    public final String field4408;

    @ObfuscatedName("of.al")
    public final String field4407;

    @ObfuscatedName("of.az")
    public final int field4403;

    @ObfuscatedName("of.ap")
    public static final class386[] field4409;

    static {
        class386[] var0 = method6509();
        field4409 = new class386[var0.length];
        class386[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class386 var3 = var1[var2];
            if (field4409[var3.field4403] != null) {
                throw new IllegalStateException();
            }
            field4409[var3.field4403] = var3;
        }
    }

    @ObfuscatedName("of.at(B)[Lof;")
    public static class386[] method6509() {
        return new class386[] { field4402, field4405, field4399, field4406, field4401, field4400, field4404 };
    }

    public class386(String arg0, String arg1, String arg2, class387 arg3, int arg4, String arg5) {
        this.field4408 = arg0;
        this.field4407 = arg1;
        this.field4403 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("of.ar(I)Ljava/lang/String;")
    public String method6515() {
        return this.field4407;
    }

    @ObfuscatedName("of.ah(B)I")
    public int method41() {
        return this.field4403;
    }

    @ObfuscatedName("of.ao(IB)Lof;")
    public static class386 method6510(int arg0) {
        return arg0 >= 0 && arg0 < field4409.length ? field4409[arg0] : null;
    }

    public String toString() {
        return this.method6515().toLowerCase(Locale.ENGLISH);
    }
}
