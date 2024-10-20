package deob;

@ObfuscatedName("wo")
public class class582 {

    @ObfuscatedName("wo.ap")
    public static final int[] field5631 = new int[] { 16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472 };

    public class582() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("av.ap(ILjava/lang/String;Lpn;II)Lme;")
    public static class325 method302(int arg0, String arg1, class407 arg2, int arg3) {
        class325 var4 = class325.method2983(class323.field3393, client.field784.field1485);
        var4.field3433.method9241(0);
        int var5 = var4.field3433.field5462;
        var4.field3433.method9241(arg0);
        String var6 = arg1.toLowerCase();
        int var7 = 0;
        byte[] var8 = null;
        if (var6.startsWith(class383.field4226)) {
            var7 = 0;
            arg1 = arg1.substring(class383.field4226.length());
        } else if (var6.startsWith(class383.field4374)) {
            var7 = 1;
            arg1 = arg1.substring(class383.field4374.length());
        } else if (var6.startsWith(class383.field4363)) {
            var7 = 2;
            arg1 = arg1.substring(class383.field4363.length());
        } else if (var6.startsWith(class383.field4376)) {
            var7 = 3;
            arg1 = arg1.substring(class383.field4376.length());
        } else if (var6.startsWith(class383.field4373)) {
            var7 = 4;
            arg1 = arg1.substring(class383.field4373.length());
        } else if (var6.startsWith(class383.field4378)) {
            var7 = 5;
            arg1 = arg1.substring(class383.field4378.length());
        } else if (var6.startsWith(class383.field4200)) {
            var7 = 6;
            arg1 = arg1.substring(class383.field4200.length());
        } else if (var6.startsWith(class383.field4370)) {
            var7 = 7;
            arg1 = arg1.substring(class383.field4370.length());
        } else if (var6.startsWith(class383.field4381)) {
            var7 = 8;
            arg1 = arg1.substring(class383.field4381.length());
        } else if (var6.startsWith(class383.field4355)) {
            var7 = 9;
            arg1 = arg1.substring(class383.field4355.length());
        } else if (var6.startsWith(class383.field4383)) {
            var7 = 10;
            arg1 = arg1.substring(class383.field4383.length());
        } else if (var6.startsWith(class383.field4460)) {
            var7 = 11;
            arg1 = arg1.substring(class383.field4460.length());
        } else if (var6.startsWith(class383.field4324)) {
            var7 = 12;
            arg1 = arg1.substring(class383.field4324.length());
        } else if (var6.startsWith(class383.field4353)) {
            var8 = method8270(var6);
            if (var8 != null) {
                var7 = var8.length + 12;
                arg1 = arg1.substring(class383.field4353.length() + var8.length + 1);
            }
        }
        String var9 = arg1.toLowerCase();
        byte var10 = 0;
        if (var9.startsWith(class383.field4387)) {
            var10 = 1;
            arg1 = arg1.substring(class383.field4387.length());
        } else if (var9.startsWith(class383.field4380)) {
            var10 = 2;
            arg1 = arg1.substring(class383.field4380.length());
        } else if (var9.startsWith(class383.field4389)) {
            var10 = 3;
            arg1 = arg1.substring(class383.field4389.length());
        } else if (var9.startsWith(class383.field4390)) {
            var10 = 4;
            arg1 = arg1.substring(class383.field4390.length());
        } else if (var9.startsWith(class383.field4391)) {
            var10 = 5;
            arg1 = arg1.substring(class383.field4391.length());
        }
        var4.field3433.method9241(var7);
        var4.field3433.method9241(var10);
        if (var8 != null) {
            for (int var11 = 0; var11 < var8.length; var11++) {
                var4.field3433.method9241(var8[var11]);
            }
        }
        class365.method4218(var4.field3433, arg1);
        if (arg0 == class370.field4060.method37()) {
            var4.field3433.method9241(arg3);
        }
        var4.field3433.method9283(var4.field3433.field5462 - var5);
        return var4;
    }

    @ObfuscatedName("rr.aw(Ljava/lang/String;B)[B")
    public static byte[] method8270(String arg0) {
        boolean var1 = true;
        boolean var2 = true;
        int var3 = class383.field4353.length();
        int var4 = 0;
        byte[] var5 = new byte[8];
        while (true) {
            int var6 = var3 + var4;
            if (var6 >= arg0.length()) {
                return null;
            }
            char var7 = arg0.charAt(var6);
            if (var7 == ':') {
                if (var4 == 0) {
                    return null;
                }
                byte[] var8 = new byte[var4];
                System.arraycopy(var5, 0, var8, 0, var4);
                return var8;
            }
            if (var5.length == var4) {
                return null;
            }
            char var9;
            if (var7 >= '0' && var7 <= '9') {
                var9 = (char) (var7 - '0');
            } else if (var7 >= 'a' && var7 <= 'z') {
                var9 = (char) (var7 - 'W');
            } else {
                return null;
            }
            var5[var4++] = (byte) var9;
        }
    }

    @ObfuscatedName("sp.ak([BB)[I")
    public static int[] method8332(byte[] arg0) {
        if (arg0 == null || arg0.length == 0 || arg0.length > 8) {
            return null;
        }
        int[] var1 = new int[arg0.length];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            if (arg0[var2] < 0 || arg0[var2] >= field5631.length) {
                return null;
            }
            var1[var2] = field5631[arg0[var2]];
        }
        return var1;
    }
}
