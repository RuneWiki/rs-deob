package deob;

@ObfuscatedName("lc")
public class class316 {

    @ObfuscatedName("lc.b")
    public static final char[] field3924 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("lc.z")
    public static final char[] field3922 = new char[] { '[', ']', '#' };

    public class316() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fk.g(Lly;B)I")
    public static final int method3033(class336 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field4076) {
                case 8:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("cu.e(CI)Z")
    public static final boolean method1832(char arg0) {
        if (Character.isISOControl(arg0)) {
            return false;
        }
        boolean var1 = arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        if (var1) {
            return true;
        }
        char[] var2 = field3924;
        for (int var3 = 0; var3 < var2.length; var3++) {
            char var4 = var2[var3];
            if (arg0 == var4) {
                return true;
            }
        }
        char[] var5 = field3922;
        for (int var6 = 0; var6 < var5.length; var6++) {
            char var7 = var5[var6];
            if (arg0 == var7) {
                return true;
            }
        }
        return false;
    }
}
