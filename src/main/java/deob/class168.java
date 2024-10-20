package deob;

@ObfuscatedName("fk")
public class class168 {

    @ObfuscatedName("fk.c")
    public static final char[] field2693 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("fk.h")
    public static final char[] field2696 = new char[] { '[', ']', '#' };

    public class168() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fd.e(Lhd;I)I")
    public static final int method3048(class216 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field3189) {
                case 7:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("z.l(CB)Z")
    public static final boolean method167(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("t.c(Ljava/lang/CharSequence;Lhd;I)Ljava/lang/String;")
    public static String method158(CharSequence arg0, class216 arg1) {
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
        while (var3 > var2 && method167(arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var6 = var3 - var2;
        if (var6 < 1 || var6 > method3048(arg1)) {
            return null;
        }
        StringBuilder var7 = new StringBuilder(var6);
        for (int var8 = var2; var8 < var3; var8++) {
            char var9 = arg0.charAt(var8);
            boolean var10;
            if (Character.isISOControl(var9)) {
                var10 = false;
            } else if (class167.method504(var9)) {
                var10 = true;
            } else {
                char[] var11 = field2693;
                int var12 = 0;
                label69: while (true) {
                    if (var12 >= var11.length) {
                        char[] var14 = field2696;
                        for (int var15 = 0; var15 < var14.length; var15++) {
                            char var16 = var14[var15];
                            if (var9 == var16) {
                                var10 = true;
                                break label69;
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
                char var17 = method3055(var9);
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

    @ObfuscatedName("ft.h(CI)C")
    public static char method3055(char arg0) {
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
