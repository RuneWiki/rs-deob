package deob;

@ObfuscatedName("mj")
public class class339 {

    @ObfuscatedName("mj.i")
    public static final char[] field4039 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("mj.k")
    public static final char[] field4036 = new char[] { '[', ']', '#' };

    public class339() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ei.s(CB)Z")
    public static final boolean method3034(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("er.j(Ljava/lang/CharSequence;Llu;I)Ljava/lang/String;")
    public static String method3062(CharSequence arg0, class338 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && method3034(arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && method3034(arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 >= 1) {
            byte var6;
            if (arg1 == null) {
                var6 = 12;
            } else {
                switch(arg1.field4034) {
                    case 1:
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
                    } else if (class291.method3293(var9)) {
                        var10 = true;
                    } else {
                        char[] var11 = field4039;
                        int var12 = 0;
                        label68: while (true) {
                            if (var12 >= var11.length) {
                                char[] var14 = field4036;
                                for (int var15 = 0; var15 < var14.length; var15++) {
                                    char var16 = var14[var15];
                                    if (var9 == var16) {
                                        var10 = true;
                                        break label68;
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
                        char var17 = method4136(var9);
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

    @ObfuscatedName("ix.i(CI)C")
    public static char method4136(char arg0) {
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
