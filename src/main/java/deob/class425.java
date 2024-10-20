package deob;

@ObfuscatedName("pt")
public class class425 {

    @ObfuscatedName("pt.w")
    public static final char[] field4622 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("pt.v")
    public static final char[] field4620 = new char[] { '[', ']', '#' };

    public class425() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("oz.s(CI)Z")
    public static final boolean method6388(char arg0) {
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class344.method2489(arg0)) {
            return true;
        } else {
            char[] var1 = field4622;
            for (int var2 = 0; var2 < var1.length; var2++) {
                char var3 = var1[var2];
                if (arg0 == var3) {
                    return true;
                }
            }
            char[] var4 = field4620;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @ObfuscatedName("ha.h(CI)Z")
    public static final boolean method4067(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }
}
