package deob;

import java.util.Locale;

@class391
@class334
@ObfuscatedName("oa")
public class class389 implements class387 {

    @ObfuscatedName("oa.ac")
    public static final class389 field4438 = new class389("EN", "en", "English", class390.field4447, 0, "GB");

    @ObfuscatedName("oa.al")
    public static final class389 field4430 = new class389("DE", "de", "German", class390.field4447, 1, "DE");

    @ObfuscatedName("oa.ak")
    public static final class389 field4427 = new class389("FR", "fr", "French", class390.field4447, 2, "FR");

    @ObfuscatedName("oa.ax")
    public static final class389 field4428 = new class389("PT", "pt", "Portuguese", class390.field4447, 3, "BR");

    @ObfuscatedName("oa.ao")
    public static final class389 field4429 = new class389("NL", "nl", "Dutch", class390.field4442, 4, "NL");

    @ObfuscatedName("oa.ah")
    public static final class389 field4435 = new class389("ES", "es", "Spanish", class390.field4442, 5, "ES");

    @ObfuscatedName("oa.ar")
    public static final class389 field4431 = new class389("ES_MX", "es-mx", "Spanish (Latin American)", class390.field4447, 6, "MX");

    @ObfuscatedName("oa.ab")
    public final String field4432;

    @ObfuscatedName("oa.am")
    public final String field4433;

    @ObfuscatedName("oa.av")
    public final int field4434;

    @ObfuscatedName("oa.ag")
    public static final class389[] field4437;

    static {
        class389[] var0 = method6498();
        field4437 = new class389[var0.length];
        class389[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class389 var3 = var1[var2];
            if (field4437[var3.field4434] != null) {
                throw new IllegalStateException();
            }
            field4437[var3.field4434] = var3;
        }
    }

    @ObfuscatedName("oa.ar(S)[Loa;")
    public static class389[] method6498() {
        return new class389[] { field4435, field4428, field4427, field4429, field4438, field4430, field4431 };
    }

    public class389(String arg0, String arg1, String arg2, class390 arg3, int arg4, String arg5) {
        this.field4432 = arg0;
        this.field4433 = arg1;
        this.field4434 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("oa.ab(I)Ljava/lang/String;")
    public String method6495() {
        return this.field4433;
    }

    @ObfuscatedName("oa.ac(I)I")
    public int method38() {
        return this.field4434;
    }

    @ObfuscatedName("oa.am(II)Loa;")
    public static class389 method6502(int arg0) {
        return arg0 >= 0 && arg0 < field4437.length ? field4437[arg0] : null;
    }

    public String toString() {
        return this.method6495().toLowerCase(Locale.ENGLISH);
    }
}
