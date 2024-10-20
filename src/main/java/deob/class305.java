package deob;

@ObfuscatedName("ku")
public class class305 {

    @ObfuscatedName("ku.e")
    public static final char[] field3789 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("ku.q")
    public static final char[] field3790 = new char[] { '[', ']', '#' };

    public class305() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.g(Llq;B)I")
    public static final int method98(class331 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field4002) {
                case 3:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("ji.r(CI)Z")
    public static final boolean method4812(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("hn.e(Ljava/lang/CharSequence;Llq;B)Ljava/lang/String;")
    public static String method4374(CharSequence arg0, class331 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && method4812(arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && method4812(arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > method98(arg1)) {
            return null;
        }
        StringBuilder var5 = new StringBuilder(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            boolean var8;
            if (Character.isISOControl(var7)) {
                var8 = false;
            } else if (class308.method4594(var7)) {
                var8 = true;
            } else {
                char[] var9 = field3789;
                int var10 = 0;
                label62: while (true) {
                    if (var10 >= var9.length) {
                        char[] var12 = field3790;
                        for (int var13 = 0; var13 < var12.length; var13++) {
                            char var14 = var12[var13];
                            if (var7 == var14) {
                                var8 = true;
                                break label62;
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
                char var15 = method2267(var7);
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

    @ObfuscatedName("cu.q(CS)C")
    public static char method2267(char arg0) {
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
