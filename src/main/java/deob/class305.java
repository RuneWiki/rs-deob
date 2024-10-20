package deob;

import java.util.Locale;

@ObfuscatedName("kz")
public class class305 implements class303 {

    @ObfuscatedName("kz.i")
    public static final class305 field3788 = new class305("EN", "en", "English", class306.field3804, 0, "GB");

    @ObfuscatedName("kz.w")
    public static final class305 field3774 = new class305("DE", "de", "German", class306.field3804, 1, "DE");

    @ObfuscatedName("kz.s")
    public static final class305 field3776 = new class305("FR", "fr", "French", class306.field3804, 2, "FR");

    @ObfuscatedName("kz.a")
    public static final class305 field3777 = new class305("PT", "pt", "Portuguese", class306.field3804, 3, "BR");

    @ObfuscatedName("kz.o")
    public static final class305 field3778 = new class305("NL", "nl", "Dutch", class306.field3794, 4, "NL");

    @ObfuscatedName("kz.g")
    public static final class305 field3779 = new class305("ES", "es", "Spanish", class306.field3794, 5, "ES");

    @ObfuscatedName("kz.e")
    public static final class305 field3780 = new class305("ES_MX", "es-mx", "Spanish (Latin American)", class306.field3804, 6, "MX");

    @ObfuscatedName("kz.p")
    public final String field3781;

    @ObfuscatedName("kz.j")
    public final String field3789;

    @ObfuscatedName("kz.b")
    public final int field3783;

    @ObfuscatedName("kz.x")
    public static final class305[] field3784;

    static {
        class305[] var0 = new class305[] { field3774, field3778, field3788, field3779, field3777, field3776, field3780 };
        field3784 = new class305[var0.length];
        class305[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class305 var4 = var2[var3];
            if (field3784[var4.field3783] != null) {
                throw new IllegalStateException();
            }
            field3784[var4.field3783] = var4;
        }
    }

    public class305(String arg0, String arg1, String arg2, class306 arg3, int arg4, String arg5) {
        this.field3781 = arg0;
        this.field3789 = arg1;
        this.field3783 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("kz.i(I)Ljava/lang/String;")
    public String method4955() {
        return this.field3789;
    }

    @ObfuscatedName("kz.w(I)I")
    public int method38() {
        return this.field3783;
    }

    @ObfuscatedName("kz.s(IB)Lkz;")
    public static class305 method4945(int arg0) {
        return arg0 >= 0 && arg0 < field3784.length ? field3784[arg0] : null;
    }

    public String toString() {
        return this.method4955().toLowerCase(Locale.ENGLISH);
    }
}
