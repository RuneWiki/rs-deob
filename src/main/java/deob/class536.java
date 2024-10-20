package deob;

@ObfuscatedName("uh")
public class class536 {

    @ObfuscatedName("uh.ak")
    public static final char[] field5349 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("uh.aj")
    public static final char[] field5347 = new char[] { '[', ']', '#' };

    public class536() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ke.ap(Lur;B)I")
    public static final int method5309(class535 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field5338) {
                case 7:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("nt.aw(CI)Z")
    public static final boolean method6213(char arg0) {
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class420.method7155(arg0)) {
            return true;
        } else {
            char[] var1 = field5349;
            for (int var2 = 0; var2 < var1.length; var2++) {
                char var3 = var1[var2];
                if (arg0 == var3) {
                    return true;
                }
            }
            char[] var4 = field5347;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @ObfuscatedName("je.ak(CI)Z")
    public static final boolean method5149(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("dx.aj(Ljava/lang/CharSequence;Lur;B)Ljava/lang/String;")
    public static String method2489(CharSequence arg0, class535 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && method5149(arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && method5149(arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > method5309(arg1)) {
            return null;
        }
        StringBuilder var5 = new StringBuilder(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (method6213(var7)) {
                char var8;
                switch(var7) {
                    case ' ':
                    case '-':
                    case '_':
                    case ' ':
                        var8 = '_';
                        break;
                    case '#':
                    case '[':
                    case ']':
                        var8 = var7;
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
                        var8 = 'a';
                        break;
                    case 'Ç':
                    case 'ç':
                        var8 = 'c';
                        break;
                    case 'È':
                    case 'É':
                    case 'Ê':
                    case 'Ë':
                    case 'è':
                    case 'é':
                    case 'ê':
                    case 'ë':
                        var8 = 'e';
                        break;
                    case 'Í':
                    case 'Î':
                    case 'Ï':
                    case 'í':
                    case 'î':
                    case 'ï':
                        var8 = 'i';
                        break;
                    case 'Ñ':
                    case 'ñ':
                        var8 = 'n';
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
                        var8 = 'o';
                        break;
                    case 'Ù':
                    case 'Ú':
                    case 'Û':
                    case 'Ü':
                    case 'ù':
                    case 'ú':
                    case 'û':
                    case 'ü':
                        var8 = 'u';
                        break;
                    case 'ß':
                        var8 = 'b';
                        break;
                    case 'ÿ':
                    case 'Ÿ':
                        var8 = 'y';
                        break;
                    default:
                        var8 = Character.toLowerCase(var7);
                }
                if (var8 != 0) {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @ObfuscatedName("rn.ai(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method8148(String arg0) {
        return arg0 == null || arg0.isEmpty() || arg0.charAt(0) == '#' ? "" : arg0;
    }
}
