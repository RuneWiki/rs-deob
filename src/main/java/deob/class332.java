package deob;

import java.util.Locale;

@class334
@class282
@ObfuscatedName("lj")
public class class332 implements class330 {

    @ObfuscatedName("lj.c")
    public static final class332 field4149 = new class332("EN", "en", "English", class333.field4159, 0, "GB");

    @ObfuscatedName("lj.p")
    public static final class332 field4135 = new class332("DE", "de", "German", class333.field4159, 1, "DE");

    @ObfuscatedName("lj.f")
    public static final class332 field4148 = new class332("FR", "fr", "French", class333.field4159, 2, "FR");

    @ObfuscatedName("lj.n")
    public static final class332 field4137 = new class332("PT", "pt", "Portuguese", class333.field4159, 3, "BR");

    @ObfuscatedName("lj.k")
    public static final class332 field4138 = new class332("NL", "nl", "Dutch", class333.field4153, 4, "NL");

    @ObfuscatedName("lj.w")
    public static final class332 field4140 = new class332("ES", "es", "Spanish", class333.field4153, 5, "ES");

    @ObfuscatedName("lj.s")
    public static final class332 field4136 = new class332("ES_MX", "es-mx", "Spanish (Latin American)", class333.field4159, 6, "MX");

    @ObfuscatedName("lj.q")
    public final String field4141;

    @ObfuscatedName("lj.m")
    public final String field4142;

    @ObfuscatedName("lj.x")
    public final int field4134;

    @ObfuscatedName("lj.j")
    public static final class332[] field4144;

    static {
        class332[] var0 = new class332[] { field4137, field4138, field4140, field4136, field4149, field4148, field4135 };
        field4144 = new class332[var0.length];
        class332[] var2 = var0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class332 var4 = var2[var3];
            if (field4144[var4.field4134] != null) {
                throw new IllegalStateException();
            }
            field4144[var4.field4134] = var4;
        }
    }

    public class332(String arg0, String arg1, String arg2, class333 arg3, int arg4, String arg5) {
        this.field4141 = arg0;
        this.field4142 = arg1;
        this.field4134 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("lj.c(I)Ljava/lang/String;")
    public String method5621() {
        return this.field4142;
    }

    @ObfuscatedName("lj.p(B)I")
    public int method42() {
        return this.field4134;
    }

    public String toString() {
        return this.method5621().toLowerCase(Locale.ENGLISH);
    }
}
