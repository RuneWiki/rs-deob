package deob;

@ObfuscatedName("jx")
public class class268 {

    @ObfuscatedName("jx.e")
    public static final char[] field3667 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("jx.v")
    public static final char[] field3666 = new char[] { '[', ']', '#' };

    public class268() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bu.i(Lko;B)I")
    public static final int method667(class290 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field3844) {
                case 8:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("dp.c(CB)Z")
    public static final boolean method2176(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("eb.e(Ljava/lang/CharSequence;Lko;I)Ljava/lang/String;")
    public static String method2702(CharSequence arg0, class290 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && method2176(arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && method2176(arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > method667(arg1)) {
            return null;
        }
        StringBuilder var5 = new StringBuilder(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            boolean var8;
            if (Character.isISOControl(var7)) {
                var8 = false;
            } else {
                boolean var9 = var7 >= '0' && var7 <= '9' || var7 >= 'A' && var7 <= 'Z' || var7 >= 'a' && var7 <= 'z';
                if (var9) {
                    var8 = true;
                } else {
                    char[] var10 = field3667;
                    int var11 = 0;
                    label85: while (true) {
                        if (var11 >= var10.length) {
                            char[] var13 = field3666;
                            for (int var14 = 0; var14 < var13.length; var14++) {
                                char var15 = var13[var14];
                                if (var7 == var15) {
                                    var8 = true;
                                    break label85;
                                }
                            }
                            var8 = false;
                            break;
                        }
                        char var12 = var10[var11];
                        if (var7 == var12) {
                            var8 = true;
                            break;
                        }
                        var11++;
                    }
                }
            }
            if (var8) {
                char var16;
                switch(var7) {
                    case ' ':
                    case '-':
                    case '_':
                    case ' ':
                        var16 = '_';
                        break;
                    case '#':
                    case '[':
                    case ']':
                        var16 = var7;
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
                        var16 = 'a';
                        break;
                    case 'Ç':
                    case 'ç':
                        var16 = 'c';
                        break;
                    case 'È':
                    case 'É':
                    case 'Ê':
                    case 'Ë':
                    case 'è':
                    case 'é':
                    case 'ê':
                    case 'ë':
                        var16 = 'e';
                        break;
                    case 'Í':
                    case 'Î':
                    case 'Ï':
                    case 'í':
                    case 'î':
                    case 'ï':
                        var16 = 'i';
                        break;
                    case 'Ñ':
                    case 'ñ':
                        var16 = 'n';
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
                        var16 = 'o';
                        break;
                    case 'Ù':
                    case 'Ú':
                    case 'Û':
                    case 'Ü':
                    case 'ù':
                    case 'ú':
                    case 'û':
                    case 'ü':
                        var16 = 'u';
                        break;
                    case 'ß':
                        var16 = 'b';
                        break;
                    case 'ÿ':
                    case 'Ÿ':
                        var16 = 'y';
                        break;
                    default:
                        var16 = Character.toLowerCase(var7);
                }
                if (var16 != 0) {
                    var5.append(var16);
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
