package deob;

@ObfuscatedName("ew")
public class class53 {

    @ObfuscatedName("ew.k")
    public static final char[] field550 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("ew.w")
    public static final char[] field553 = new char[] { '[', ']', '#' };

    public class53() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.b(Ljava/lang/CharSequence;Lgx;B)Ljava/lang/String;")
    public static String method1409(CharSequence arg0, class22 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3) {
            char var4 = arg0.charAt(var2);
            boolean var5 = var4 == 160 || var4 == ' ' || var4 == '_' || var4 == '-';
            if (!var5) {
                break;
            }
            var2++;
        }
        while (var3 > var2) {
            char var6 = arg0.charAt(var3 - 1);
            boolean var7 = var6 == 160 || var6 == ' ' || var6 == '_' || var6 == '-';
            if (!var7) {
                break;
            }
            var3--;
        }
        int var8 = var3 - var2;
        if (var8 >= 1) {
            byte var10;
            if (arg1 == null) {
                var10 = 12;
            } else {
                switch(arg1.field234) {
                    case 2:
                        var10 = 20;
                        break;
                    default:
                        var10 = 12;
                }
            }
            if (var8 <= var10) {
                StringBuilder var11 = new StringBuilder(var8);
                for (int var12 = var2; var12 < var3; var12++) {
                    char var13 = arg0.charAt(var12);
                    boolean var14;
                    if (Character.isISOControl(var13)) {
                        var14 = false;
                    } else {
                        boolean var15 = var13 >= '0' && var13 <= '9' || var13 >= 'A' && var13 <= 'Z' || var13 >= 'a' && var13 <= 'z';
                        if (var15) {
                            var14 = true;
                        } else {
                            char[] var16 = field550;
                            int var17 = 0;
                            label105: while (true) {
                                if (var17 >= var16.length) {
                                    char[] var19 = field553;
                                    for (int var20 = 0; var20 < var19.length; var20++) {
                                        char var21 = var19[var20];
                                        if (var13 == var21) {
                                            var14 = true;
                                            break label105;
                                        }
                                    }
                                    var14 = false;
                                    break;
                                }
                                char var18 = var16[var17];
                                if (var13 == var18) {
                                    var14 = true;
                                    break;
                                }
                                var17++;
                            }
                        }
                    }
                    if (var14) {
                        char var22;
                        switch(var13) {
                            case ' ':
                            case '-':
                            case '_':
                            case ' ':
                                var22 = '_';
                                break;
                            case '#':
                            case '[':
                            case ']':
                                var22 = var13;
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
                                var22 = 'a';
                                break;
                            case 'Ç':
                            case 'ç':
                                var22 = 'c';
                                break;
                            case 'È':
                            case 'É':
                            case 'Ê':
                            case 'Ë':
                            case 'è':
                            case 'é':
                            case 'ê':
                            case 'ë':
                                var22 = 'e';
                                break;
                            case 'Í':
                            case 'Î':
                            case 'Ï':
                            case 'í':
                            case 'î':
                            case 'ï':
                                var22 = 'i';
                                break;
                            case 'Ñ':
                            case 'ñ':
                                var22 = 'n';
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
                                var22 = 'o';
                                break;
                            case 'Ù':
                            case 'Ú':
                            case 'Û':
                            case 'Ü':
                            case 'ù':
                            case 'ú':
                            case 'û':
                            case 'ü':
                                var22 = 'u';
                                break;
                            case 'ß':
                                var22 = 'b';
                                break;
                            case 'ÿ':
                            case 'Ÿ':
                                var22 = 'y';
                                break;
                            default:
                                var22 = Character.toLowerCase(var13);
                        }
                        if (var22 != 0) {
                            var11.append(var22);
                        }
                    }
                }
                if (var11.length() == 0) {
                    return null;
                }
                return var11.toString();
            }
        }
        return null;
    }
}
