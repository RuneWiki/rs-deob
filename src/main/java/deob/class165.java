package deob;

@ObfuscatedName("fq")
public class class165 {

    @ObfuscatedName("fq.x")
    public static final char[] field2655 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("fq.b")
    public static final char[] field2659 = new char[] { '[', ']', '#' };

    public class165() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.f(Lhx;I)I")
    public static final int method642(class213 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field3143) {
                case 3:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("et.u(Ljava/lang/CharSequence;Lhx;I)Ljava/lang/String;")
    public static String method2795(CharSequence arg0, class213 arg1) {
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
        if (var8 < 1 || var8 > method642(arg1)) {
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
                    char[] var14 = field2655;
                    int var15 = 0;
                    label84: while (true) {
                        if (var15 >= var14.length) {
                            char[] var17 = field2659;
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
                char var20 = Statics.method2262(var11);
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
