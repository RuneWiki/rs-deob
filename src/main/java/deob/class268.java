package deob;

@ObfuscatedName("jo")
public class class268 {

    @ObfuscatedName("jo.n")
    public static final char[] field3666 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("jo.r")
    public static final char[] field3669 = new char[] { '[', ']', '#' };

    public class268() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.a(Lko;I)I")
    public static final int method309(class290 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field3851) {
                case 6:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("cp.j(CI)Z")
    public static final boolean method1611(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("gv.n(Ljava/lang/CharSequence;Lko;I)Ljava/lang/String;")
    public static String method3406(CharSequence arg0, class290 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && method1611(arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && method1611(arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > method309(arg1)) {
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
                    char[] var10 = field3666;
                    int var11 = 0;
                    label70: while (true) {
                        if (var11 >= var10.length) {
                            char[] var13 = field3669;
                            for (int var14 = 0; var14 < var13.length; var14++) {
                                char var15 = var13[var14];
                                if (var7 == var15) {
                                    var8 = true;
                                    break label70;
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
                char var16 = method2705(var7);
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

    @ObfuscatedName("ey.r(CB)C")
    public static char method2705(char arg0) {
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
