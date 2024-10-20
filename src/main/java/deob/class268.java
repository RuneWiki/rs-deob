package deob;

@ObfuscatedName("ji")
public class class268 {

    @ObfuscatedName("ji.u")
    public static final char[] field3664 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("ji.q")
    public static final char[] field3662 = new char[] { '[', ']', '#' };

    public class268() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fn.i(Lke;B)I")
    public static final int method3214(class290 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field3850) {
                case 7:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("hy.h(CI)Z")
    public static final boolean method3728(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("ah.u(Ljava/lang/CharSequence;Lke;B)Ljava/lang/String;")
    public static String method203(CharSequence arg0, class290 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && method3728(arg0.charAt(var2))) {
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
        if (var6 < 1 || var6 > method3214(arg1)) {
            return null;
        }
        StringBuilder var7 = new StringBuilder(var6);
        for (int var8 = var2; var8 < var3; var8++) {
            char var9 = arg0.charAt(var8);
            boolean var10;
            if (Character.isISOControl(var9)) {
                var10 = false;
            } else if (class271.method642(var9)) {
                var10 = true;
            } else {
                char[] var11 = field3664;
                int var12 = 0;
                label84: while (true) {
                    if (var12 >= var11.length) {
                        char[] var14 = field3662;
                        for (int var15 = 0; var15 < var14.length; var15++) {
                            char var16 = var14[var15];
                            if (var9 == var16) {
                                var10 = true;
                                break label84;
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
        } else {
            return var7.toString();
        }
    }
}
