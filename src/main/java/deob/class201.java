package deob;

@ObfuscatedName("gg")
public class class201 {

    @ObfuscatedName("gg.v")
    public static final char[] field2971 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("gg.o")
    public static final char[] field2967 = new char[] { '[', ']', '#' };

    public class201() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.g(CI)Z")
    public static final boolean method2026(char arg0) {
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class200.method512(arg0)) {
            return true;
        } else {
            char[] var1 = field2971;
            for (int var2 = 0; var2 < var1.length; var2++) {
                char var3 = var1[var2];
                if (arg0 == var3) {
                    return true;
                }
            }
            char[] var4 = field2967;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @ObfuscatedName("ej.s(CI)Z")
    public static final boolean method2777(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("cz.v(Ljava/lang/CharSequence;Lga;B)Ljava/lang/String;")
    public static String method2039(CharSequence arg0, class191 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3) {
            char var4 = arg0.charAt(var2);
            boolean var5 = var4 == 160 || var4 == ' ' || var4 == '_' || var4 == '-';
            if (!var5) {
                break;
            }
            var2++;
        }
        while (var3 > var2 && method2777(arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var6 = var3 - var2;
        if (var6 >= 1) {
            byte var8;
            if (arg1 == null) {
                var8 = 12;
            } else {
                switch(arg1.field2906) {
                    case 1:
                        var8 = 20;
                        break;
                    default:
                        var8 = 12;
                }
            }
            if (var6 <= var8) {
                StringBuilder var9 = new StringBuilder(var6);
                for (int var10 = var2; var10 < var3; var10++) {
                    char var11 = arg0.charAt(var10);
                    if (method2026(var11)) {
                        char var12 = method477(var11);
                        if (var12 != 0) {
                            var9.append(var12);
                        }
                    }
                }
                if (var9.length() == 0) {
                    return null;
                }
                return var9.toString();
            }
        }
        return null;
    }

    @ObfuscatedName("z.o(CI)C")
    public static char method477(char arg0) {
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
}
