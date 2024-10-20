package deob;

@ObfuscatedName("uu")
public class class524 {

    @ObfuscatedName("uu.ak")
    public static final int field5094 = (int) (Math.pow(2.0D, 4.0D) - 1.0D);

    @ObfuscatedName("uu.ax")
    public static final int field5093 = (int) (Math.pow(2.0D, 8.0D) - 1.0D);

    public class524() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("om.ac(II)I")
    public static int method6324(int arg0) {
        return arg0 >>> 12;
    }

    @ObfuscatedName("is.al(II)I")
    public static int method3579(int arg0) {
        return arg0 >>> 4 & field5093;
    }

    @ObfuscatedName("db.ak(IS)I")
    public static int method2503(int arg0) {
        return (arg0 & field5094) - 1;
    }

    @ObfuscatedName("ti.ax(Lul;[II)[Ljava/lang/Object;")
    public static Object[] method7831(class530 arg0, int[] arg1) {
        int var2 = arg0.method8526();
        Object[] var3 = new Object[arg1.length * var2];
        for (int var4 = 0; var4 < var2; var4++) {
            for (int var5 = 0; var5 < arg1.length; var5++) {
                int var6 = arg1.length * var4 + var5;
                class518 var7 = class516.method4151(arg1[var5]);
                var3[var6] = var7.method8209(arg0);
            }
        }
        return var3;
    }
}
