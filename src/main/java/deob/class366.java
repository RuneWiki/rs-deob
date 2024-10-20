package deob;

@ObfuscatedName("nk")
public class class366 {

    @ObfuscatedName("nk.f")
    public static final char[] field4097 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @ObfuscatedName("nk.y")
    public static final char[] field4098 = new char[] { '[', ']', '#' };

    public class366() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.v(CB)Z")
    public static final boolean method146(char arg0) {
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class304.method1770(arg0)) {
            return true;
        } else {
            char[] var1 = field4097;
            for (int var2 = 0; var2 < var1.length; var2++) {
                char var3 = var1[var2];
                if (arg0 == var3) {
                    return true;
                }
            }
            char[] var4 = field4098;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }
}
