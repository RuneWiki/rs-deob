package deob;

@ObfuscatedName("uw")
public class class526 {

    @ObfuscatedName("uw.ag")
    public static final char[] field5260 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("uw.ak")
    public static final char[] field5259 = new char[] { '[', ']', '#' };

    public class526() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("tj.aq(Ljava/lang/CharSequence;Luu;I)Ljava/lang/String;")
    public static String method8096(CharSequence arg0, class525 arg1) {
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
                switch(arg1.field5250) {
                    case 0:
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
                    } else if (class416.method3280(var13)) {
                        var14 = true;
                    } else {
                        char[] var15 = field5260;
                        int var16 = 0;
                        label97: while (true) {
                            if (var16 >= var15.length) {
                                char[] var18 = field5259;
                                for (int var19 = 0; var19 < var18.length; var19++) {
                                    char var20 = var18[var19];
                                    if (var13 == var20) {
                                        var14 = true;
                                        break label97;
                                    }
                                }
                                var14 = false;
                                break;
                            }
                            char var17 = var15[var16];
                            if (var13 == var17) {
                                var14 = true;
                                break;
                            }
                            var16++;
                        }
                    }
                    if (var14) {
                        char var21;
                        switch(var13) {
                            case ' ':
                            case '-':
                            case '_':
                            case ' ':
                                var21 = '_';
                                break;
                            case '#':
                            case '[':
                            case ']':
                                var21 = var13;
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
                                var21 = 'a';
                                break;
                            case 'Ç':
                            case 'ç':
                                var21 = 'c';
                                break;
                            case 'È':
                            case 'É':
                            case 'Ê':
                            case 'Ë':
                            case 'è':
                            case 'é':
                            case 'ê':
                            case 'ë':
                                var21 = 'e';
                                break;
                            case 'Í':
                            case 'Î':
                            case 'Ï':
                            case 'í':
                            case 'î':
                            case 'ï':
                                var21 = 'i';
                                break;
                            case 'Ñ':
                            case 'ñ':
                                var21 = 'n';
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
                                var21 = 'o';
                                break;
                            case 'Ù':
                            case 'Ú':
                            case 'Û':
                            case 'Ü':
                            case 'ù':
                            case 'ú':
                            case 'û':
                            case 'ü':
                                var21 = 'u';
                                break;
                            case 'ß':
                                var21 = 'b';
                                break;
                            case 'ÿ':
                            case 'Ÿ':
                                var21 = 'y';
                                break;
                            default:
                                var21 = Character.toLowerCase(var13);
                        }
                        if (var21 != 0) {
                            var11.append(var21);
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

    @ObfuscatedName("gd.ad(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method3264(String arg0) {
        return arg0 == null || arg0.isEmpty() || arg0.charAt(0) == '#' ? "" : arg0;
    }
}
