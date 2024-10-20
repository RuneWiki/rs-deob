package deob;

@ObfuscatedName("fy")
public class class164 {

    @ObfuscatedName("fy.k")
    public static final char[] field2642 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("fy.f")
    public static final char[] field2641 = new char[] { '[', ']', '#' };

    public class164() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.z(CI)Z")
    public static final boolean method873(char arg0) {
        if (Character.isISOControl(arg0)) {
            return false;
        }
        boolean var1 = arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        if (var1) {
            return true;
        }
        char[] var2 = field2642;
        for (int var3 = 0; var3 < var2.length; var3++) {
            char var4 = var2[var3];
            if (arg0 == var4) {
                return true;
            }
        }
        char[] var5 = field2641;
        for (int var6 = 0; var6 < var5.length; var6++) {
            char var7 = var5[var6];
            if (arg0 == var7) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("cm.q(CI)Z")
    public static final boolean method1884(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("client.k(Ljava/lang/CharSequence;Lhz;I)Ljava/lang/String;")
    public static String method535(CharSequence arg0, class212 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && method1884(arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && method1884(arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 >= 1) {
            byte var6;
            if (arg1 == null) {
                var6 = 12;
            } else {
                switch(arg1.field3129) {
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
                    if (method873(var9)) {
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
