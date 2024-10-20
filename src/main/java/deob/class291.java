package deob;

import java.util.Locale;

@ObfuscatedName("kn")
public class class291 implements class289 {

    @ObfuscatedName("kn.f")
    public static final class291 field3685 = new class291("EN", "en", "English", class292.field3702, 0, "GB");

    @ObfuscatedName("kn.e")
    public static final class291 field3689 = new class291("DE", "de", "German", class292.field3702, 1, "DE");

    @ObfuscatedName("kn.v")
    public static final class291 field3679 = new class291("FR", "fr", "French", class292.field3702, 2, "FR");

    @ObfuscatedName("kn.y")
    public static final class291 field3681 = new class291("PT", "pt", "Portuguese", class292.field3702, 3, "BR");

    @ObfuscatedName("kn.j")
    public static final class291 field3688 = new class291("NL", "nl", "Dutch", class292.field3693, 4, "NL");

    @ObfuscatedName("kn.o")
    public static final class291 field3682 = new class291("ES", "es", "Spanish", class292.field3693, 5, "ES");

    @ObfuscatedName("kn.m")
    public static final class291 field3684 = new class291("ES_MX", "es-mx", "Spanish (Latin American)", class292.field3702, 6, "MX");

    @ObfuscatedName("kn.r")
    public final String field3680;

    @ObfuscatedName("kn.h")
    public final String field3686;

    @ObfuscatedName("kn.d")
    public final int field3687;

    @ObfuscatedName("kn.z")
    public static final class291[] field3678;

    static {
        class291[] var0 = new class291[] { field3685, field3682, field3684, field3681, field3679, field3689, field3688 };
        field3678 = new class291[var0.length];
        class291[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class291 var4 = var2[var3];
            if (field3678[var4.field3687] != null) {
                throw new IllegalStateException();
            }
            field3678[var4.field3687] = var4;
        }
    }

    public class291(String arg0, String arg1, String arg2, class292 arg3, int arg4, String arg5) {
        this.field3680 = arg0;
        this.field3686 = arg1;
        this.field3687 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("kn.o(I)Ljava/lang/String;")
    public String method4698() {
        return this.field3686;
    }

    @ObfuscatedName("kn.f(I)I")
    public int method238() {
        return this.field3687;
    }

    @ObfuscatedName("kn.m(II)Lkn;")
    public static class291 method4689(int arg0) {
        return arg0 >= 0 && arg0 < field3678.length ? field3678[arg0] : null;
    }

    public String toString() {
        return this.method4698().toLowerCase(Locale.ENGLISH);
    }
}
