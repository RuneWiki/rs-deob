package deob;

@ObfuscatedName("fi")
public class class164 {

    @ObfuscatedName("fi.v")
    public static final char[] field2628 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("fi.l")
    public static final char[] field2627 = new char[] { '[', ']', '#' };

    public class164() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.d(Lhs;I)I")
    public static final int method1001(class212 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field3129) {
                case 4:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("fj.p(CI)Z")
    public static final boolean method2999(char arg0) {
        if (Character.isISOControl(arg0)) {
            return false;
        }
        boolean var1 = arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        if (var1) {
            return true;
        }
        char[] var2 = field2628;
        for (int var3 = 0; var3 < var2.length; var3++) {
            char var4 = var2[var3];
            if (arg0 == var4) {
                return true;
            }
        }
        char[] var5 = field2627;
        for (int var6 = 0; var6 < var5.length; var6++) {
            char var7 = var5[var6];
            if (arg0 == var7) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ag.v(CI)Z")
    public static final boolean method985(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("bi.l(Ljava/lang/CharSequence;Lhs;I)Ljava/lang/String;")
    public static String method1080(CharSequence arg0, class212 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && method985(arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && method985(arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > method1001(arg1)) {
            return null;
        }
        StringBuilder var5 = new StringBuilder(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (method2999(var7)) {
                char var8 = method83(var7);
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

    @ObfuscatedName("w.y(CI)C")
    public static char method83(char arg0) {
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
