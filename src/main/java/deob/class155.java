package deob;

@ObfuscatedName("ew")
public class class155 {

    @ObfuscatedName("ew.g")
    public static final char[] field2536 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("ew.u")
    public static final char[] field2539 = new char[] { '[', ']', '#' };

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ai.o(Lgi;I)I")
    public static final int method662(class203 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field3044) {
                case 3:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("ez.l(Ljava/lang/CharSequence;Lgi;I)Ljava/lang/String;")
    public static String method2880(CharSequence arg0, class203 arg1) {
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
        if (var8 < 1 || var8 > method662(arg1)) {
            return null;
        }
        StringBuilder var9 = new StringBuilder(var8);
        for (int var10 = var2; var10 < var3; var10++) {
            char var11 = arg0.charAt(var10);
            boolean var12;
            if (Character.isISOControl(var11)) {
                var12 = false;
            } else {
                boolean var13 = var11 >= '0' && var11 <= '9' || var11 >= 'A' && var11 <= 'Z' || var11 >= 'a' && var11 <= 'z';
                if (var13) {
                    var12 = true;
                } else {
                    char[] var14 = field2536;
                    int var15 = 0;
                    label84: while (true) {
                        if (var15 >= var14.length) {
                            char[] var17 = field2539;
                            for (int var18 = 0; var18 < var17.length; var18++) {
                                char var19 = var17[var18];
                                if (var11 == var19) {
                                    var12 = true;
                                    break label84;
                                }
                            }
                            var12 = false;
                            break;
                        }
                        char var16 = var14[var15];
                        if (var11 == var16) {
                            var12 = true;
                            break;
                        }
                        var15++;
                    }
                }
            }
            if (var12) {
                char var20 = method2839(var11);
                if (var20 != 0) {
                    var9.append(var20);
                }
            }
        }
        if (var9.length() == 0) {
            return null;
        } else {
            return var9.toString();
        }
    }

    @ObfuscatedName("ex.g(CB)C")
    public static char method2839(char arg0) {
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
