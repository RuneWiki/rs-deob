package deob;

@ObfuscatedName("lr")
public class class316 {

    @ObfuscatedName("lr.t")
    public static final char[] field3921 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("lr.d")
    public static final char[] field3923 = new char[] { '[', ']', '#' };

    public class316() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("al.o(CI)Z")
    public static final boolean method277(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("bs.k(Ljava/lang/CharSequence;Llh;I)Ljava/lang/String;")
    public static String method748(CharSequence arg0, class336 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && method277(arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && method277(arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 >= 1) {
            byte var6;
            if (arg1 == null) {
                var6 = 12;
            } else {
                switch(arg1.field4074) {
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
                    boolean var10;
                    if (Character.isISOControl(var9)) {
                        var10 = false;
                    } else {
                        boolean var11 = var9 >= '0' && var9 <= '9' || var9 >= 'A' && var9 <= 'Z' || var9 >= 'a' && var9 <= 'z';
                        if (var11) {
                            var10 = true;
                        } else {
                            char[] var12 = field3921;
                            int var13 = 0;
                            label76: while (true) {
                                if (var13 >= var12.length) {
                                    char[] var15 = field3923;
                                    for (int var16 = 0; var16 < var15.length; var16++) {
                                        char var17 = var15[var16];
                                        if (var9 == var17) {
                                            var10 = true;
                                            break label76;
                                        }
                                    }
                                    var10 = false;
                                    break;
                                }
                                char var14 = var12[var13];
                                if (var9 == var14) {
                                    var10 = true;
                                    break;
                                }
                                var13++;
                            }
                        }
                    }
                    if (var10) {
                        char var18 = method4871(var9);
                        if (var18 != 0) {
                            var7.append(var18);
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

    @ObfuscatedName("kg.t(CB)C")
    public static char method4871(char arg0) {
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
