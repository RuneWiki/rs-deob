package deob;

@ObfuscatedName("hd")
public class class212 {

    @ObfuscatedName("hd.g")
    public static final char[] field3015 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("hd.j")
    public static final char[] field3016 = new char[] { '[', ']', '#' };

    public class212() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fk.l(CI)Z")
    public static final boolean method2943(char arg0) {
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class211.method1888(arg0)) {
            return true;
        } else {
            char[] var1 = field3015;
            for (int var2 = 0; var2 < var1.length; var2++) {
                char var3 = var1[var2];
                if (arg0 == var3) {
                    return true;
                }
            }
            char[] var4 = field3016;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @ObfuscatedName("ge.y(Ljava/lang/CharSequence;Lgb;I)Ljava/lang/String;")
    public static String method3386(CharSequence arg0, class193 arg1) {
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
        while (var3 > var2) {
            char var6 = arg0.charAt(var3 - 1);
            boolean var7 = var6 == 160 || var6 == ' ' || var6 == '_' || var6 == '-';
            if (!var7) {
                break;
            }
            var3--;
        }
        int var8 = var3 - var2;
        if (var8 >= 1) {
            byte var10;
            if (arg1 == null) {
                var10 = 12;
            } else {
                switch(arg1.field2911) {
                    case 6:
                        var10 = 20;
                        break;
                    default:
                        var10 = 12;
                }
            }
            if (var8 <= var10) {
                StringBuilder var11 = new StringBuilder(var8);
                for (int var12 = var2; var12 < var3; var12++) {
                    char var13 = arg0.charAt(var12);
                    if (method2943(var13)) {
                        char var14 = method2437(var13);
                        if (var14 != 0) {
                            var11.append(var14);
                        }
                    }
                }
                if (var11.length() == 0) {
                    return null;
                }
                return var11.toString();
            }
        }
        return null;
    }

    @ObfuscatedName("df.g(CS)C")
    public static char method2437(char arg0) {
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
