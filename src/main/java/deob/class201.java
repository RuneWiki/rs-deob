package deob;

@ObfuscatedName("go")
public class class201 {

    @ObfuscatedName("go.x")
    public static final char[] field2970 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("go.c")
    public static final char[] field2968 = new char[] { '[', ']', '#' };

    public class201() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.p(Lgy;I)I")
    public static final int method2593(class191 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field2901) {
                case 5:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("bj.g(Ljava/lang/CharSequence;Lgy;I)Ljava/lang/String;")
    public static String method1115(CharSequence arg0, class191 arg1) {
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
        if (var8 < 1 || var8 > method2593(arg1)) {
            return null;
        }
        StringBuilder var9 = new StringBuilder(var8);
        for (int var10 = var2; var10 < var3; var10++) {
            char var11 = arg0.charAt(var10);
            boolean var12;
            if (Character.isISOControl(var11)) {
                var12 = false;
            } else if (class200.method3220(var11)) {
                var12 = true;
            } else {
                char[] var13 = field2970;
                int var14 = 0;
                label76: while (true) {
                    if (var14 >= var13.length) {
                        char[] var16 = field2968;
                        for (int var17 = 0; var17 < var16.length; var17++) {
                            char var18 = var16[var17];
                            if (var11 == var18) {
                                var12 = true;
                                break label76;
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
                char var19 = method2895(var11);
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

    @ObfuscatedName("ex.x(CI)C")
    public static char method2895(char arg0) {
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
