package deob;

@ObfuscatedName("ko")
public class class305 {

    @ObfuscatedName("ko.o")
    public static final char[] field3751 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("ko.k")
    public static final char[] field3749 = new char[] { '[', ']', '#' };

    public class305() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.v(CI)Z")
    public static final boolean method462(char arg0) {
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class308.method2874(arg0)) {
            return true;
        } else {
            char[] var1 = field3751;
            for (int var2 = 0; var2 < var1.length; var2++) {
                char var3 = var1[var2];
                if (arg0 == var3) {
                    return true;
                }
            }
            char[] var4 = field3749;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }
}
