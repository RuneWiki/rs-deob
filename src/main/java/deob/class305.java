package deob;

@ObfuscatedName("ke")
public class class305 {

    @ObfuscatedName("ke.w")
    public static final char[] field3784 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("ke.s")
    public static final char[] field3786 = new char[] { '[', ']', '#' };

    public class305() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ko.f(CB)Z")
    public static final boolean method5192(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("i.l(Ljava/lang/CharSequence;Lly;I)Ljava/lang/String;")
    public static String method283(CharSequence arg0, class331 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && method5192(arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && method5192(arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 >= 1) {
            byte var6;
            if (arg1 == null) {
                var6 = 12;
            } else {
                switch(arg1.field3998) {
                    case 4:
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
                    boolean var10;
                    if (Character.isISOControl(var9)) {
                        var10 = false;
                    } else if (class308.method4519(var9)) {
                        var10 = true;
                    } else {
                        char[] var11 = field3784;
                        int var12 = 0;
                        label83: while (true) {
                            if (var12 >= var11.length) {
                                char[] var14 = field3786;
                                for (int var15 = 0; var15 < var14.length; var15++) {
                                    char var16 = var14[var15];
                                    if (var9 == var16) {
                                        var10 = true;
                                        break label83;
                                    }
                                }
                                var10 = false;
                                break;
                            }
                            char var13 = var11[var12];
                            if (var9 == var13) {
                                var10 = true;
                                break;
                            }
                            var12++;
                        }
                    }
                    if (var10) {
                        char var17;
                        switch(var9) {
                            case ' ':
                            case '-':
                            case '_':
                            case ' ':
                                var17 = '_';
                                break;
                            case '#':
                            case '[':
                            case ']':
                                var17 = var9;
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
                                var17 = 'a';
                                break;
                            case 'Ç':
                            case 'ç':
                                var17 = 'c';
                                break;
                            case 'È':
                            case 'É':
                            case 'Ê':
                            case 'Ë':
                            case 'è':
                            case 'é':
                            case 'ê':
                            case 'ë':
                                var17 = 'e';
                                break;
                            case 'Í':
                            case 'Î':
                            case 'Ï':
                            case 'í':
                            case 'î':
                            case 'ï':
                                var17 = 'i';
                                break;
                            case 'Ñ':
                            case 'ñ':
                                var17 = 'n';
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
                                var17 = 'o';
                                break;
                            case 'Ù':
                            case 'Ú':
                            case 'Û':
                            case 'Ü':
                            case 'ù':
                            case 'ú':
                            case 'û':
                            case 'ü':
                                var17 = 'u';
                                break;
                            case 'ß':
                                var17 = 'b';
                                break;
                            case 'ÿ':
                            case 'Ÿ':
                                var17 = 'y';
                                break;
                            default:
                                var17 = Character.toLowerCase(var9);
                        }
                        if (var17 != 0) {
                            var7.append(var17);
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
