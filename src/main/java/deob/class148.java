package deob;

@ObfuscatedName("ei")
public class class148 {

    @ObfuscatedName("ei.o")
    public static final char[] field2459 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("ei.n")
    public static final char[] field2464 = new char[] { '[', ']', '#' };

    public class148() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.p(Lgg;I)I")
    public static final int method1219(class186 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field2865) {
                case 0:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("dk.i(CB)Z")
    public static final boolean method2244(char arg0) {
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class147.method3080(arg0)) {
            return true;
        } else {
            char[] var1 = field2459;
            for (int var2 = 0; var2 < var1.length; var2++) {
                char var3 = var1[var2];
                if (arg0 == var3) {
                    return true;
                }
            }
            char[] var4 = field2464;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @ObfuscatedName("et.o(Ljava/lang/CharSequence;Lgg;I)Ljava/lang/String;")
    public static String method2960(CharSequence arg0, class186 arg1) {
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
        if (var8 < 1 || var8 > method1219(arg1)) {
            return null;
        }
        StringBuilder var9 = new StringBuilder(var8);
        for (int var10 = var2; var10 < var3; var10++) {
            char var11 = arg0.charAt(var10);
            if (method2244(var11)) {
                char var12;
                switch(var11) {
                    case ' ':
                    case '-':
                    case '_':
                    case ' ':
                        var12 = '_';
                        break;
                    case '#':
                    case '[':
                    case ']':
                        var12 = var11;
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
                        var12 = 'a';
                        break;
                    case 'Ç':
                    case 'ç':
                        var12 = 'c';
                        break;
                    case 'È':
                    case 'É':
                    case 'Ê':
                    case 'Ë':
                    case 'è':
                    case 'é':
                    case 'ê':
                    case 'ë':
                        var12 = 'e';
                        break;
                    case 'Í':
                    case 'Î':
                    case 'Ï':
                    case 'í':
                    case 'î':
                    case 'ï':
                        var12 = 'i';
                        break;
                    case 'Ñ':
                    case 'ñ':
                        var12 = 'n';
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
                        var12 = 'o';
                        break;
                    case 'Ù':
                    case 'Ú':
                    case 'Û':
                    case 'Ü':
                    case 'ù':
                    case 'ú':
                    case 'û':
                    case 'ü':
                        var12 = 'u';
                        break;
                    case 'ß':
                        var12 = 'b';
                        break;
                    case 'ÿ':
                    case 'Ÿ':
                        var12 = 'y';
                        break;
                    default:
                        var12 = Character.toLowerCase(var11);
                }
                if (var12 != 0) {
                    var9.append(var12);
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
