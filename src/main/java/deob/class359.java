package deob;

import java.util.Locale;

@class361
@class305
@ObfuscatedName("nx")
public class class359 implements class357 {

    @ObfuscatedName("nx.af")
    public static final class359 field4317 = new class359("EN", "en", "English", class360.field4352, 0, "GB");

    @ObfuscatedName("nx.an")
    public static final class359 field4328 = new class359("DE", "de", "German", class360.field4352, 1, "DE");

    @ObfuscatedName("nx.aw")
    public static final class359 field4319 = new class359("FR", "fr", "French", class360.field4352, 2, "FR");

    @ObfuscatedName("nx.ac")
    public static final class359 field4320 = new class359("PT", "pt", "Portuguese", class360.field4352, 3, "BR");

    @ObfuscatedName("nx.au")
    public static final class359 field4321 = new class359("NL", "nl", "Dutch", class360.field4344, 4, "NL");

    @ObfuscatedName("nx.ab")
    public static final class359 field4322 = new class359("ES", "es", "Spanish", class360.field4344, 5, "ES");

    @ObfuscatedName("nx.aq")
    public static final class359 field4323 = new class359("ES_MX", "es-mx", "Spanish (Latin American)", class360.field4352, 6, "MX");

    @ObfuscatedName("nx.al")
    public final String field4330;

    @ObfuscatedName("nx.at")
    public final String field4325;

    @ObfuscatedName("nx.aa")
    public final int field4326;

    @ObfuscatedName("nx.ay")
    public static final class359[] field4331;

    static {
        class359[] var0 = method6301();
        field4331 = new class359[var0.length];
        class359[] var1 = var0;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class359 var3 = var1[var2];
            if (field4331[var3.field4326] != null) {
                throw new IllegalStateException();
            }
            field4331[var3.field4326] = var3;
        }
    }

    @ObfuscatedName("nx.au(B)[Lnx;")
    public static class359[] method6301() {
        return new class359[] { field4319, field4321, field4328, field4323, field4320, field4317, field4322 };
    }

    public class359(String arg0, String arg1, String arg2, class360 arg3, int arg4, String arg5) {
        this.field4330 = arg0;
        this.field4325 = arg1;
        this.field4326 = arg4;
        if (arg5 == null) {
            new Locale(arg1.substring(0, 2));
        } else {
            new Locale(arg1.substring(0, 2), arg5);
        }
    }

    @ObfuscatedName("nx.ab(B)Ljava/lang/String;")
    public String method6289() {
        return this.field4325;
    }

    @ObfuscatedName("nx.af(I)I")
    public int method39() {
        return this.field4326;
    }

    @ObfuscatedName("nx.aq(IB)Lnx;")
    public static class359 method6287(int arg0) {
        return arg0 >= 0 && arg0 < field4331.length ? field4331[arg0] : null;
    }

    public String toString() {
        return this.method6289().toLowerCase(Locale.ENGLISH);
    }
}
