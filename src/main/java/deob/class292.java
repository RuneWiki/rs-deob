package deob;

import java.util.Locale;

@ObfuscatedName("kq")
public class class292 implements class290 {

    @ObfuscatedName("kq.s")
    public static final class292 field3694 = new class292("EN", "en", "English", class293.field3716, 0, "GB");

    @ObfuscatedName("kq.t")
    public static final class292 field3682 = new class292("DE", "de", "German", class293.field3716, 1, "DE");

    @ObfuscatedName("kq.v")
    public static final class292 field3691 = new class292("FR", "fr", "French", class293.field3716, 2, "FR");

    @ObfuscatedName("kq.j")
    public static final class292 field3684 = new class292("PT", "pt", "Portuguese", class293.field3716, 3, "BR");

    @ObfuscatedName("kq.l")
    public static final class292 field3685 = new class292("NL", "nl", "Dutch", class293.field3701, 4, "NL");

    @ObfuscatedName("kq.n")
    public static final class292 field3686 = new class292("ES", "es", "Spanish", class293.field3701, 5, "ES");

    @ObfuscatedName("kq.w")
    public static final class292 field3687 = new class292("ES_MX", "es-mx", "Spanish (Latin American)", class293.field3716, 6, "MX");

    @ObfuscatedName("kq.f")
    public final String field3688;

    @ObfuscatedName("kq.o")
    public final String field3689;

    @ObfuscatedName("kq.x")
    public final int field3681;

    @ObfuscatedName("kq.r")
    public static final class292[] field3683;

    static {
        class292[] var0 = method4664();
        field3683 = new class292[var0.length];
        class292[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class292 var3 = var1[var2];
            if (field3683[var3.field3681] != null) {
                throw new IllegalStateException();
            }
            field3683[var3.field3681] = var3;
        }
    }

    @ObfuscatedName("kq.n(I)[Lkq;")
    public static class292[] method4664() {
        return new class292[] { field3684, field3691, field3682, field3686, field3694, field3687, field3685 };
    }

    public class292(String arg0, String arg1, String arg2, class293 arg3, int arg4, String arg5) {
        this.field3688 = arg0;
        this.field3689 = arg1;
        this.field3681 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("kq.w(I)Ljava/lang/String;")
    public String method4660() {
        return this.field3689;
    }

    @ObfuscatedName("kq.s(I)I")
    public int method35() {
        return this.field3681;
    }

    @ObfuscatedName("kq.f(II)Lkq;")
    public static class292 method4662(int arg0) {
        return arg0 >= 0 && arg0 < field3683.length ? field3683[arg0] : null;
    }

    public String toString() {
        return this.method4660().toLowerCase(Locale.ENGLISH);
    }
}
