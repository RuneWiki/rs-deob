package deob;

@ObfuscatedName("uq")
public class class529 {

    @ObfuscatedName("uq.ag")
    public static final char[] field5300 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("uq.am")
    public static final char[] field5301 = new char[] { '[', ']', '#' };

    public class529() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.ac(Lub;I)I")
    public static final int method2489(class528 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field5296) {
                case 2:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("hj.ae(CB)Z")
    public static final boolean method3587(char arg0) {
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class419.method3257(arg0)) {
            return true;
        } else {
            char[] var1 = field5300;
            for (int var2 = 0; var2 < var1.length; var2++) {
                char var3 = var1[var2];
                if (arg0 == var3) {
                    return true;
                }
            }
            char[] var4 = field5301;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @ObfuscatedName("me.ag(CI)Z")
    public static final boolean method5759(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("kj.am(CI)C")
    public static char method5052(char arg0) {
        switch(arg0) {
            case ' ':
            case '-':
            case '_':
            case ' ':
                return '_';
            case '#':
            case '[':
            case ']':
                return arg0;
            case 'À':
            case 'Á':
            case 'Â':
            case 'Ã':
            case 'Ä':
            case 'à':
            case 'á':
            case 'â':
            case 'ã':
            case 'ä':
                return 'a';
            case 'Ç':
            case 'ç':
                return 'c';
            case 'È':
            case 'É':
            case 'Ê':
            case 'Ë':
            case 'è':
            case 'é':
            case 'ê':
            case 'ë':
                return 'e';
            case 'Í':
            case 'Î':
            case 'Ï':
            case 'í':
            case 'î':
            case 'ï':
                return 'i';
            case 'Ñ':
            case 'ñ':
                return 'n';
            case 'Ò':
            case 'Ó':
            case 'Ô':
            case 'Õ':
            case 'Ö':
            case 'ò':
            case 'ó':
            case 'ô':
            case 'õ':
            case 'ö':
                return 'o';
            case 'Ù':
            case 'Ú':
            case 'Û':
            case 'Ü':
            case 'ù':
            case 'ú':
            case 'û':
            case 'ü':
                return 'u';
            case 'ß':
                return 'b';
            case 'ÿ':
            case 'Ÿ':
                return 'y';
            default:
                return Character.toLowerCase(arg0);
        }
    }

    @ObfuscatedName("sm.ax(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method8257(String arg0) {
        return arg0 == null || arg0.isEmpty() || arg0.charAt(0) == '#' ? "" : arg0;
    }
}
