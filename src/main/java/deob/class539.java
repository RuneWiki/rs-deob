package deob;

@ObfuscatedName("uv")
public class class539 {

    @ObfuscatedName("uv.au")
    public static final int[] field5262 = new int[] { 16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472 };

    public class539() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dr.au(ILjava/lang/String;Lon;IB)Lly;")
    public static class297 method2302(int arg0, String arg1, class374 arg2, int arg3) {
        class297 var4 = class297.method1166(class295.field3145, client.field592.field1429);
        var4.field3227.method8283(0);
        int var5 = var4.field3227.field5111;
        var4.field3227.method8283(arg0);
        String var6 = arg1.toLowerCase();
        int var7 = 0;
        byte[] var8 = null;
        if (var6.startsWith(class352.field4013)) {
            var7 = 0;
            arg1 = arg1.substring(class352.field4013.length());
        } else if (var6.startsWith(class352.field4104)) {
            var7 = 1;
            arg1 = arg1.substring(class352.field4104.length());
        } else if (var6.startsWith(class352.field4015)) {
            var7 = 2;
            arg1 = arg1.substring(class352.field4015.length());
        } else if (var6.startsWith(class352.field4106)) {
            var7 = 3;
            arg1 = arg1.substring(class352.field4106.length());
        } else if (var6.startsWith(class352.field3985)) {
            var7 = 4;
            arg1 = arg1.substring(class352.field3985.length());
        } else if (var6.startsWith(class352.field4108)) {
            var7 = 5;
            arg1 = arg1.substring(class352.field4108.length());
        } else if (var6.startsWith(class352.field4109)) {
            var7 = 6;
            arg1 = arg1.substring(class352.field4109.length());
        } else if (var6.startsWith(class352.field3920)) {
            var7 = 7;
            arg1 = arg1.substring(class352.field3920.length());
        } else if (var6.startsWith(class352.field3955)) {
            var7 = 8;
            arg1 = arg1.substring(class352.field3955.length());
        } else if (var6.startsWith(class352.field3977)) {
            var7 = 9;
            arg1 = arg1.substring(class352.field3977.length());
        } else if (var6.startsWith(class352.field4021)) {
            var7 = 10;
            arg1 = arg1.substring(class352.field4021.length());
        } else if (var6.startsWith(class352.field4114)) {
            var7 = 11;
            arg1 = arg1.substring(class352.field4114.length());
        } else if (var6.startsWith(class352.field4031)) {
            var7 = 12;
            arg1 = arg1.substring(class352.field4031.length());
        } else if (var6.startsWith(class352.field4116)) {
            var8 = method1964(var6);
            if (var8 != null) {
                var7 = var8.length + 12;
                arg1 = arg1.substring(class352.field4116.length() + var8.length + 1);
            }
        }
        String var9 = arg1.toLowerCase();
        byte var10 = 0;
        if (var9.startsWith(class352.field4117)) {
            var10 = 1;
            arg1 = arg1.substring(class352.field4117.length());
        } else if (var9.startsWith(class352.field4118)) {
            var10 = 2;
            arg1 = arg1.substring(class352.field4118.length());
        } else if (var9.startsWith(class352.field3967)) {
            var10 = 3;
            arg1 = arg1.substring(class352.field3967.length());
        } else if (var9.startsWith(class352.field4120)) {
            var10 = 4;
            arg1 = arg1.substring(class352.field4120.length());
        } else if (var9.startsWith(class352.field4004)) {
            var10 = 5;
            arg1 = arg1.substring(class352.field4004.length());
        }
        var4.field3227.method8283(var7);
        var4.field3227.method8283(var10);
        if (var8 != null && client.field709 >= 214) {
            for (int var11 = 0; var11 < var8.length; var11++) {
                var4.field3227.method8283(var8[var11]);
            }
        }
        class335.method3914(var4.field3227, arg1);
        if (arg0 == class340.field3822.method30()) {
            var4.field3227.method8283(arg3);
        }
        var4.field3227.method8297(var4.field3227.field5111 - var5);
        return var4;
    }

    @ObfuscatedName("cb.ae(Ljava/lang/String;I)[B")
    public static byte[] method1964(String arg0) {
        boolean var1 = true;
        boolean var2 = true;
        int var3 = class352.field4116.length();
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

    @ObfuscatedName("gl.ao([BI)[I")
    public static int[] method3097(byte[] arg0) {
        if (arg0 == null || arg0.length == 0 || arg0.length > 8) {
            return null;
        }
        int[] var1 = new int[arg0.length];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            if (arg0[var2] < 0 || arg0[var2] > field5262.length) {
                return null;
            }
            var1[var2] = field5262[arg0[var2]];
        }
        return var1;
    }
}
