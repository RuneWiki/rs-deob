package deob;

@ObfuscatedName("fo")
public class class164 {

    @ObfuscatedName("fo.w")
    public static final char[] field2645 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("fo.d")
    public static final char[] field2646 = new char[] { '[', ']', '#' };

    public class164() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ht.g(Lhw;I)I")
    public static final int method3789(class212 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field3114) {
                case 2:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("dr.w(CI)Z")
    public static final boolean method2633(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("au.d(Ljava/lang/CharSequence;Lhw;I)Ljava/lang/String;")
    public static String method843(CharSequence arg0, class212 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && method2633(arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && method2633(arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > method3789(arg1)) {
            return null;
        }
        StringBuilder var5 = new StringBuilder(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (Statics.method3794(var7)) {
                char var8;
                switch(var7) {
                    case ' ':
                    case '-':
                    case '_':
                    case ' ':
                        var8 = '_';
                        break;
                    case '#':
                    case '[':
                    case ']':
                        var8 = var7;
                        break;
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
                        var8 = 'a';
                        break;
                    case 'Ç':
                    case 'ç':
                        var8 = 'c';
                        break;
                    case 'È':
                    case 'É':
                    case 'Ê':
                    case 'Ë':
                    case 'è':
                    case 'é':
                    case 'ê':
                    case 'ë':
                        var8 = 'e';
                        break;
                    case 'Í':
                    case 'Î':
                    case 'Ï':
                    case 'í':
                    case 'î':
                    case 'ï':
                        var8 = 'i';
                        break;
                    case 'Ñ':
                    case 'ñ':
                        var8 = 'n';
                        break;
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
                        var8 = 'o';
                        break;
                    case 'Ù':
                    case 'Ú':
                    case 'Û':
                    case 'Ü':
                    case 'ù':
                    case 'ú':
                    case 'û':
                    case 'ü':
                        var8 = 'u';
                        break;
                    case 'ß':
                        var8 = 'b';
                        break;
                    case 'ÿ':
                    case 'Ÿ':
                        var8 = 'y';
                        break;
                    default:
                        var8 = Character.toLowerCase(var7);
                }
                if (var8 != 0) {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }
}
