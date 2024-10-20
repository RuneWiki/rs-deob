package deob;

@ObfuscatedName("gx")
public class class200 {

    @ObfuscatedName("gx.f")
    public static final char[] field2961 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("gx.e")
    public static final char[] field2964 = new char[] { '[', ']', '#' };

    public class200() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fv.t(Lgc;I)I")
    public static final int method3163(class190 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field2889) {
                case 7:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("df.s(Ljava/lang/CharSequence;Lgc;I)Ljava/lang/String;")
    public static String method2604(CharSequence arg0, class190 arg1) {
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
        if (var8 < 1 || var8 > method3163(arg1)) {
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
                    char[] var14 = field2961;
                    int var15 = 0;
                    label99: while (true) {
                        if (var15 >= var14.length) {
                            char[] var17 = field2964;
                            for (int var18 = 0; var18 < var17.length; var18++) {
                                char var19 = var17[var18];
                                if (var11 == var19) {
                                    var12 = true;
                                    break label99;
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
                char var20;
                switch(var11) {
                    case ' ':
                    case '-':
                    case '_':
                    case ' ':
                        var20 = '_';
                        break;
                    case '#':
                    case '[':
                    case ']':
                        var20 = var11;
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
                        var20 = 'a';
                        break;
                    case 'Ç':
                    case 'ç':
                        var20 = 'c';
                        break;
                    case 'È':
                    case 'É':
                    case 'Ê':
                    case 'Ë':
                    case 'è':
                    case 'é':
                    case 'ê':
                    case 'ë':
                        var20 = 'e';
                        break;
                    case 'Í':
                    case 'Î':
                    case 'Ï':
                    case 'í':
                    case 'î':
                    case 'ï':
                        var20 = 'i';
                        break;
                    case 'Ñ':
                    case 'ñ':
                        var20 = 'n';
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
                        var20 = 'o';
                        break;
                    case 'Ù':
                    case 'Ú':
                    case 'Û':
                    case 'Ü':
                    case 'ù':
                    case 'ú':
                    case 'û':
                    case 'ü':
                        var20 = 'u';
                        break;
                    case 'ß':
                        var20 = 'b';
                        break;
                    case 'ÿ':
                    case 'Ÿ':
                        var20 = 'y';
                        break;
                    default:
                        var20 = Character.toLowerCase(var11);
                }
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
}
