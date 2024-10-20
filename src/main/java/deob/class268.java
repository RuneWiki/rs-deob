package deob;

@ObfuscatedName("jp")
public class class268 {

    @ObfuscatedName("jp.a")
    public static final char[] field3675 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("jp.t")
    public static final char[] field3678 = new char[] { '[', ']', '#' };

    public class268() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fr.i(CB)Z")
    public static final boolean method3121(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("bq.w(Ljava/lang/CharSequence;Lkq;S)Ljava/lang/String;")
    public static String method1070(CharSequence arg0, class290 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && method3121(arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && method3121(arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 >= 1) {
            byte var6;
            if (arg1 == null) {
                var6 = 12;
            } else {
                switch(arg1.field3860) {
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
                    } else {
                        boolean var11 = var9 >= '0' && var9 <= '9' || var9 >= 'A' && var9 <= 'Z' || var9 >= 'a' && var9 <= 'z';
                        if (var11) {
                            var10 = true;
                        } else {
                            char[] var12 = field3675;
                            int var13 = 0;
                            label91: while (true) {
                                if (var13 >= var12.length) {
                                    char[] var15 = field3678;
                                    for (int var16 = 0; var16 < var15.length; var16++) {
                                        char var17 = var15[var16];
                                        if (var9 == var17) {
                                            var10 = true;
                                            break label91;
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
                        char var18;
                        switch(var9) {
                            case ' ':
                            case '-':
                            case '_':
                            case ' ':
                                var18 = '_';
                                break;
                            case '#':
                            case '[':
                            case ']':
                                var18 = var9;
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
                                var18 = 'a';
                                break;
                            case 'Ç':
                            case 'ç':
                                var18 = 'c';
                                break;
                            case 'È':
                            case 'É':
                            case 'Ê':
                            case 'Ë':
                            case 'è':
                            case 'é':
                            case 'ê':
                            case 'ë':
                                var18 = 'e';
                                break;
                            case 'Í':
                            case 'Î':
                            case 'Ï':
                            case 'í':
                            case 'î':
                            case 'ï':
                                var18 = 'i';
                                break;
                            case 'Ñ':
                            case 'ñ':
                                var18 = 'n';
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
                                var18 = 'o';
                                break;
                            case 'Ù':
                            case 'Ú':
                            case 'Û':
                            case 'Ü':
                            case 'ù':
                            case 'ú':
                            case 'û':
                            case 'ü':
                                var18 = 'u';
                                break;
                            case 'ß':
                                var18 = 'b';
                                break;
                            case 'ÿ':
                            case 'Ÿ':
                                var18 = 'y';
                                break;
                            default:
                                var18 = Character.toLowerCase(var9);
                        }
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
}
