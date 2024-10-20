package deob;

import java.util.Locale;

@class376
@class320
@ObfuscatedName("on")
public class class374 implements class372 {

    @ObfuscatedName("on.au")
    public static final class374 field4384 = new class374("EN", "en", "English", class375.field4394, 0, "GB");

    @ObfuscatedName("on.ae")
    public static final class374 field4389 = new class374("DE", "de", "German", class375.field4394, 1, "DE");

    @ObfuscatedName("on.ao")
    public static final class374 field4378 = new class374("FR", "fr", "French", class375.field4394, 2, "FR");

    @ObfuscatedName("on.at")
    public static final class374 field4387 = new class374("PT", "pt", "Portuguese", class375.field4394, 3, "BR");

    @ObfuscatedName("on.ac")
    public static final class374 field4377 = new class374("NL", "nl", "Dutch", class375.field4407, 4, "NL");

    @ObfuscatedName("on.ai")
    public static final class374 field4381 = new class374("ES", "es", "Spanish", class375.field4407, 5, "ES");

    @ObfuscatedName("on.az")
    public static final class374 field4382 = new class374("ES_MX", "es-mx", "Spanish (Latin American)", class375.field4394, 6, "MX");

    @ObfuscatedName("on.ap")
    public final String field4383;

    @ObfuscatedName("on.aa")
    public final String field4380;

    @ObfuscatedName("on.af")
    public final int field4385;

    @ObfuscatedName("on.ad")
    public static final class374[] field4386;

    static {
        class374[] var0 = method6358();
        field4386 = new class374[var0.length];
        class374[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class374 var3 = var1[var2];
            if (field4386[var3.field4385] != null) {
                throw new IllegalStateException();
            }
            field4386[var3.field4385] = var3;
        }
    }

    @ObfuscatedName("on.au(I)[Lon;")
    public static class374[] method6358() {
        return new class374[] { field4381, field4389, field4378, field4382, field4377, field4384, field4387 };
    }

    public class374(String arg0, String arg1, String arg2, class375 arg3, int arg4, String arg5) {
        this.field4383 = arg0;
        this.field4380 = arg1;
        this.field4385 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("on.ao(B)Ljava/lang/String;")
    public String method6366() {
        return this.field4380;
    }

    @ObfuscatedName("on.ae(B)I")
    public int method30() {
        return this.field4385;
    }

    @ObfuscatedName("on.at(II)Lon;")
    public static class374 method6357(int arg0) {
        return arg0 >= 0 && arg0 < field4386.length ? field4386[arg0] : null;
    }

    public String toString() {
        return this.method6366().toLowerCase(Locale.ENGLISH);
    }
}
