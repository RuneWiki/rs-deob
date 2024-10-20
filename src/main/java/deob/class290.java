package deob;

import java.util.Locale;

@ObfuscatedName("kk")
public class class290 implements class288 {

    @ObfuscatedName("kk.v")
    public static final class290 field3677 = new class290("EN", "en", "English", class291.field3687, 0, "GB");

    @ObfuscatedName("kk.n")
    public static final class290 field3674 = new class290("DE", "de", "German", class291.field3687, 1, "DE");

    @ObfuscatedName("kk.f")
    public static final class290 field3676 = new class290("FR", "fr", "French", class291.field3687, 2, "FR");

    @ObfuscatedName("kk.y")
    public static final class290 field3686 = new class290("PT", "pt", "Portuguese", class291.field3687, 3, "BR");

    @ObfuscatedName("kk.p")
    public static final class290 field3680 = new class290("NL", "nl", "Dutch", class291.field3699, 4, "NL");

    @ObfuscatedName("kk.j")
    public static final class290 field3679 = new class290("ES", "es", "Spanish", class291.field3699, 5, "ES");

    @ObfuscatedName("kk.r")
    public static final class290 field3684 = new class290("ES_MX", "es-mx", "Spanish (Latin American)", class291.field3687, 6, "MX");

    @ObfuscatedName("kk.b")
    public final String field3681;

    @ObfuscatedName("kk.d")
    public final String field3682;

    @ObfuscatedName("kk.s")
    public final int field3675;

    @ObfuscatedName("kk.u")
    public static final class290[] field3683;

    static {
        class290[] var0 = method4685();
        field3683 = new class290[var0.length];
        class290[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class290 var3 = var1[var2];
            if (field3683[var3.field3675] != null) {
                throw new IllegalStateException();
            }
            field3683[var3.field3675] = var3;
        }
    }

    @ObfuscatedName("kk.y(B)[Lkk;")
    public static class290[] method4685() {
        return new class290[] { field3676, field3674, field3684, field3679, field3677, field3680, field3686 };
    }

    public class290(String arg0, String arg1, String arg2, class291 arg3, int arg4, String arg5) {
        this.field3681 = arg0;
        this.field3682 = arg1;
        this.field3675 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("kk.p(B)Ljava/lang/String;")
    public String method4679() {
        return this.field3682;
    }

    @ObfuscatedName("kk.v(I)I")
    public int method227() {
        return this.field3675;
    }

    @ObfuscatedName("kk.j(IB)Lkk;")
    public static class290 method4690(int arg0) {
        return arg0 >= 0 && arg0 < field3683.length ? field3683[arg0] : null;
    }

    public String toString() {
        return this.method4679().toLowerCase(Locale.ENGLISH);
    }
}
