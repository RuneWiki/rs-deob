package deob;

@ObfuscatedName("gw")
public class class200 {

    @ObfuscatedName("gw.y")
    public static final char[] field2960 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("gw.b")
    public static final char[] field2963 = new char[] { '[', ']', '#' };

    public class200() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.e(Lgo;I)I")
    public static final int method32(class190 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field2899) {
                case 6:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("gs.o(CB)Z")
    public static final boolean method3330(char arg0) {
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class199.method64(arg0)) {
            return true;
        } else {
            char[] var1 = field2960;
            for (int var2 = 0; var2 < var1.length; var2++) {
                char var3 = var1[var2];
                if (arg0 == var3) {
                    return true;
                }
            }
            char[] var4 = field2963;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @ObfuscatedName("ao.y(CB)Z")
    public static final boolean method581(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("cx.b(Ljava/lang/CharSequence;Lgo;I)Ljava/lang/String;")
    public static String method1827(CharSequence arg0, class190 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && method581(arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2) {
            char var4 = arg0.charAt(var3 - 1);
            boolean var5 = var4 == 160 || var4 == ' ' || var4 == '_' || var4 == '-';
            if (!var5) {
                break;
            }
            var3--;
        }
        int var6 = var3 - var2;
        if (var6 < 1 || var6 > method32(arg1)) {
            return null;
        }
        StringBuilder var7 = new StringBuilder(var6);
        for (int var8 = var2; var8 < var3; var8++) {
            char var9 = arg0.charAt(var8);
            if (method3330(var9)) {
                char var10;
                switch(var9) {
                    case ' ':
                    case '-':
                    case '_':
                    case ' ':
                        var10 = '_';
                        break;
                    case '#':
                    case '[':
                    case ']':
                        var10 = var9;
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
                        var10 = 'a';
                        break;
                    case 'Ç':
                    case 'ç':
                        var10 = 'c';
                        break;
                    case 'È':
                    case 'É':
                    case 'Ê':
                    case 'Ë':
                    case 'è':
                    case 'é':
                    case 'ê':
                    case 'ë':
                        var10 = 'e';
                        break;
                    case 'Í':
                    case 'Î':
                    case 'Ï':
                    case 'í':
                    case 'î':
                    case 'ï':
                        var10 = 'i';
                        break;
                    case 'Ñ':
                    case 'ñ':
                        var10 = 'n';
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
                        var10 = 'o';
                        break;
                    case 'Ù':
                    case 'Ú':
                    case 'Û':
                    case 'Ü':
                    case 'ù':
                    case 'ú':
                    case 'û':
                    case 'ü':
                        var10 = 'u';
                        break;
                    case 'ß':
                        var10 = 'b';
                        break;
                    case 'ÿ':
                    case 'Ÿ':
                        var10 = 'y';
                        break;
                    default:
                        var10 = Character.toLowerCase(var9);
                }
                if (var10 != 0) {
                    var7.append(var10);
                }
            }
        }
        if (var7.length() == 0) {
            return null;
        } else {
            return var7.toString();
        }
    }
}
