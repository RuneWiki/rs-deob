package deob;

@ObfuscatedName("gu")
public class class198 {

    @ObfuscatedName("gu.y")
    public static final char[] field2953 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("gu.h")
    public static final char[] field2954 = new char[] { '[', ']', '#' };

    public class198() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.j(CI)Z")
    public static final boolean method2694(char arg0) {
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class197.method3480(arg0)) {
            return true;
        } else {
            char[] var1 = field2953;
            for (int var2 = 0; var2 < var1.length; var2++) {
                char var3 = var1[var2];
                if (arg0 == var3) {
                    return true;
                }
            }
            char[] var4 = field2954;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @ObfuscatedName("w.z(CI)Z")
    public static final boolean method490(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("cv.y(Ljava/lang/CharSequence;Lgl;B)Ljava/lang/String;")
    public static String method2067(CharSequence arg0, class188 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && method490(arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && method490(arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 >= 1) {
            byte var6;
            if (arg1 == null) {
                var6 = 12;
            } else {
                switch(arg1.field2882) {
                    case 6:
                        var6 = 20;
                        break;
                    default:
                        var6 = 12;
                }
            }
            if (var4 <= var6) {
                StringBuilder var7 = new StringBuilder(var4);
                for (int var8 = var2; var8 < var3; var8++) {
                    char var9 = arg0.charAt(var8);
                    if (method2694(var9)) {
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
                }
                return var7.toString();
            }
        }
        return null;
    }
}
