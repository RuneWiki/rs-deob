package deob;

@ObfuscatedName("em")
public class class148 {

    @ObfuscatedName("em.m")
    public static final char[] field2449 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("em.j")
    public static final char[] field2447 = new char[] { '[', ']', '#' };

    public class148() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cg.i(Lgh;I)I")
    public static final int method2079(class186 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field2862) {
                case 1:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("df.v(CI)Z")
    public static final boolean method2475(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("bf.m(Ljava/lang/CharSequence;Lgh;I)Ljava/lang/String;")
    public static String method1395(CharSequence arg0, class186 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && method2475(arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && method2475(arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > method2079(arg1)) {
            return null;
        }
        StringBuilder var5 = new StringBuilder(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            boolean var8;
            if (Character.isISOControl(var7)) {
                var8 = false;
            } else if (class147.method31(var7)) {
                var8 = true;
            } else {
                char[] var9 = field2449;
                int var10 = 0;
                label77: while (true) {
                    if (var10 >= var9.length) {
                        char[] var12 = field2447;
                        for (int var13 = 0; var13 < var12.length; var13++) {
                            char var14 = var12[var13];
                            if (var7 == var14) {
                                var8 = true;
                                break label77;
                            }
                        }
                        var8 = false;
                        break;
                    }
                    char var11 = var9[var10];
                    if (var7 == var11) {
                        var8 = true;
                        break;
                    }
                    var10++;
                }
            }
            if (var8) {
                char var15;
                switch(var7) {
                    case ' ':
                    case '-':
                    case '_':
                    case ' ':
                        var15 = '_';
                        break;
                    case '#':
                    case '[':
                    case ']':
                        var15 = var7;
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
                        var15 = 'a';
                        break;
                    case 'Ç':
                    case 'ç':
                        var15 = 'c';
                        break;
                    case 'È':
                    case 'É':
                    case 'Ê':
                    case 'Ë':
                    case 'è':
                    case 'é':
                    case 'ê':
                    case 'ë':
                        var15 = 'e';
                        break;
                    case 'Í':
                    case 'Î':
                    case 'Ï':
                    case 'í':
                    case 'î':
                    case 'ï':
                        var15 = 'i';
                        break;
                    case 'Ñ':
                    case 'ñ':
                        var15 = 'n';
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
                        var15 = 'o';
                        break;
                    case 'Ù':
                    case 'Ú':
                    case 'Û':
                    case 'Ü':
                    case 'ù':
                    case 'ú':
                    case 'û':
                    case 'ü':
                        var15 = 'u';
                        break;
                    case 'ß':
                        var15 = 'b';
                        break;
                    case 'ÿ':
                    case 'Ÿ':
                        var15 = 'y';
                        break;
                    default:
                        var15 = Character.toLowerCase(var7);
                }
                if (var15 != 0) {
                    var5.append(var15);
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
