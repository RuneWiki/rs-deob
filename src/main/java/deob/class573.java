package deob;

@ObfuscatedName("wv")
public class class573 {

    @ObfuscatedName("wv.ab")
    public static final int[] field5549 = new int[] { 16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472 };

    public class573() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ow.ab(ILjava/lang/String;Lpg;IS)Lmf;")
    public static class324 method6558(int arg0, String arg1, class404 arg2, int arg3) {
        class324 var4 = class324.method4244(class322.field3284, client.field569.field1458);
        var4.field3379.method8781(0);
        int var5 = var4.field3379.field5378;
        var4.field3379.method8781(arg0);
        String var6 = arg1.toLowerCase();
        int var7 = 0;
        byte[] var8 = null;
        if (var6.startsWith(class380.field4281)) {
            var7 = 0;
            arg1 = arg1.substring(class380.field4281.length());
        } else if (var6.startsWith(class380.field4107)) {
            var7 = 1;
            arg1 = arg1.substring(class380.field4107.length());
        } else if (var6.startsWith(class380.field4327)) {
            var7 = 2;
            arg1 = arg1.substring(class380.field4327.length());
        } else if (var6.startsWith(class380.field4284)) {
            var7 = 3;
            arg1 = arg1.substring(class380.field4284.length());
        } else if (var6.startsWith(class380.field4285)) {
            var7 = 4;
            arg1 = arg1.substring(class380.field4285.length());
        } else if (var6.startsWith(class380.field4286)) {
            var7 = 5;
            arg1 = arg1.substring(class380.field4286.length());
        } else if (var6.startsWith(class380.field4287)) {
            var7 = 6;
            arg1 = arg1.substring(class380.field4287.length());
        } else if (var6.startsWith(class380.field4231)) {
            var7 = 7;
            arg1 = arg1.substring(class380.field4231.length());
        } else if (var6.startsWith(class380.field4289)) {
            var7 = 8;
            arg1 = arg1.substring(class380.field4289.length());
        } else if (var6.startsWith(class380.field4392)) {
            var7 = 9;
            arg1 = arg1.substring(class380.field4392.length());
        } else if (var6.startsWith(class380.field4291)) {
            var7 = 10;
            arg1 = arg1.substring(class380.field4291.length());
        } else if (var6.startsWith(class380.field4173)) {
            var7 = 11;
            arg1 = arg1.substring(class380.field4173.length());
        } else if (var6.startsWith(class380.field4293)) {
            var7 = 12;
            arg1 = arg1.substring(class380.field4293.length());
        } else if (var6.startsWith(class380.field4294)) {
            var8 = method352(var6);
            if (var8 != null) {
                var7 = var8.length + 12;
                arg1 = arg1.substring(class380.field4294.length() + var8.length + 1);
            }
        }
        String var9 = arg1.toLowerCase();
        byte var10 = 0;
        if (var9.startsWith(class380.field4295)) {
            var10 = 1;
            arg1 = arg1.substring(class380.field4295.length());
        } else if (var9.startsWith(class380.field4096)) {
            var10 = 2;
            arg1 = arg1.substring(class380.field4096.length());
        } else if (var9.startsWith(class380.field4147)) {
            var10 = 3;
            arg1 = arg1.substring(class380.field4147.length());
        } else if (var9.startsWith(class380.field4251)) {
            var10 = 4;
            arg1 = arg1.substring(class380.field4251.length());
        } else if (var9.startsWith(class380.field4296)) {
            var10 = 5;
            arg1 = arg1.substring(class380.field4296.length());
        }
        var4.field3379.method8781(var7);
        var4.field3379.method8781(var10);
        if (var8 != null) {
            for (int var11 = 0; var11 < var8.length; var11++) {
                var4.field3379.method8781(var8[var11]);
            }
        }
        class364.method2339(var4.field3379, arg1);
        if (arg0 == class369.field3990.method33()) {
            var4.field3379.method8781(arg3);
        }
        var4.field3379.method9048(var4.field3379.field5378 - var5);
        return var4;
    }

    @ObfuscatedName("az.ay(Ljava/lang/String;I)[B")
    public static byte[] method352(String arg0) {
        boolean var1 = true;
        boolean var2 = true;
        int var3 = class380.field4294.length();
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
}
