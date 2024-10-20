package deob;

@ObfuscatedName("ee")
public class class149 {

    @ObfuscatedName("ee.y")
    public static final char[] field2486 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("ee.v")
    public static final char[] field2488 = new char[] { '[', ']', '#' };

    public class149() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.c(Lgl;I)I")
    public static final int method145(class186 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field2873) {
                case 4:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("dm.q(Ljava/lang/CharSequence;Lgl;I)Ljava/lang/String;")
    public static String method2225(CharSequence arg0, class186 arg1) {
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
        if (var8 < 1 || var8 > method145(arg1)) {
            return null;
        }
        StringBuilder var9 = new StringBuilder(var8);
        for (int var10 = var2; var10 < var3; var10++) {
            char var11 = arg0.charAt(var10);
            boolean var12;
            if (Character.isISOControl(var11)) {
                var12 = false;
            } else if (class148.method1317(var11)) {
                var12 = true;
            } else {
                char[] var13 = field2486;
                int var14 = 0;
                label91: while (true) {
                    if (var14 >= var13.length) {
                        char[] var16 = field2488;
                        for (int var17 = 0; var17 < var16.length; var17++) {
                            char var18 = var16[var17];
                            if (var11 == var18) {
                                var12 = true;
                                break label91;
                            }
                        }
                        var12 = false;
                        break;
                    }
                    char var15 = var13[var14];
                    if (var11 == var15) {
                        var12 = true;
                        break;
                    }
                    var14++;
                }
            }
            if (var12) {
                char var19;
                switch(var11) {
                    case ' ':
                    case '-':
                    case '_':
                    case ' ':
                        var19 = '_';
                        break;
                    case '#':
                    case '[':
                    case ']':
                        var19 = var11;
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
                        var19 = 'a';
                        break;
                    case 'Ç':
                    case 'ç':
                        var19 = 'c';
                        break;
                    case 'È':
                    case 'É':
                    case 'Ê':
                    case 'Ë':
                    case 'è':
                    case 'é':
                    case 'ê':
                    case 'ë':
                        var19 = 'e';
                        break;
                    case 'Í':
                    case 'Î':
                    case 'Ï':
                    case 'í':
                    case 'î':
                    case 'ï':
                        var19 = 'i';
                        break;
                    case 'Ñ':
                    case 'ñ':
                        var19 = 'n';
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
                        var19 = 'o';
                        break;
                    case 'Ù':
                    case 'Ú':
                    case 'Û':
                    case 'Ü':
                    case 'ù':
                    case 'ú':
                    case 'û':
                    case 'ü':
                        var19 = 'u';
                        break;
                    case 'ß':
                        var19 = 'b';
                        break;
                    case 'ÿ':
                    case 'Ÿ':
                        var19 = 'y';
                        break;
                    default:
                        var19 = Character.toLowerCase(var11);
                }
                if (var19 != 0) {
                    var9.append(var19);
                }
            }
        }
        if (var9.length() == 0) {
            return null;
        } else {
            return var9.toString();
        }
    }
}
