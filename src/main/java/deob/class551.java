package deob;

@ObfuscatedName("vz")
public class class551 {

    @ObfuscatedName("vz.at")
    public static final int[] field5295 = new int[] { 16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472 };

    public class551() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ut.at(ILjava/lang/String;Lof;II)Lld;")
    public static class308 method9051(int arg0, String arg1, class386 arg2, int arg3) {
        class308 var4 = class308.method2768(class306.field3167, client.field590.field1405);
        var4.field3243.method8393(0);
        int var5 = var4.field3243.field5137;
        var4.field3243.method8393(arg0);
        String var6 = arg1.toLowerCase();
        int var7 = 0;
        byte[] var8 = null;
        if (var6.startsWith(class364.field3963)) {
            var7 = 0;
            arg1 = arg1.substring(class364.field3963.length());
        } else if (var6.startsWith(class364.field4117)) {
            var7 = 1;
            arg1 = arg1.substring(class364.field4117.length());
        } else if (var6.startsWith(class364.field4118)) {
            var7 = 2;
            arg1 = arg1.substring(class364.field4118.length());
        } else if (var6.startsWith(class364.field4074)) {
            var7 = 3;
            arg1 = arg1.substring(class364.field4074.length());
        } else if (var6.startsWith(class364.field4120)) {
            var7 = 4;
            arg1 = arg1.substring(class364.field4120.length());
        } else if (var6.startsWith(class364.field4121)) {
            var7 = 5;
            arg1 = arg1.substring(class364.field4121.length());
        } else if (var6.startsWith(class364.field4115)) {
            var7 = 6;
            arg1 = arg1.substring(class364.field4115.length());
        } else if (var6.startsWith(class364.field4123)) {
            var7 = 7;
            arg1 = arg1.substring(class364.field4123.length());
        } else if (var6.startsWith(class364.field4004)) {
            var7 = 8;
            arg1 = arg1.substring(class364.field4004.length());
        } else if (var6.startsWith(class364.field4125)) {
            var7 = 9;
            arg1 = arg1.substring(class364.field4125.length());
        } else if (var6.startsWith(class364.field4126)) {
            var7 = 10;
            arg1 = arg1.substring(class364.field4126.length());
        } else if (var6.startsWith(class364.field4127)) {
            var7 = 11;
            arg1 = arg1.substring(class364.field4127.length());
        } else if (var6.startsWith(class364.field4128)) {
            var7 = 12;
            arg1 = arg1.substring(class364.field4128.length());
        } else if (var6.startsWith(class364.field4101)) {
            boolean var9 = true;
            boolean var10 = true;
            int var11 = class364.field4101.length();
            int var12 = 0;
            byte[] var13 = new byte[8];
            byte[] var15;
            while (true) {
                int var14 = var11 + var12;
                if (var14 >= var6.length()) {
                    var15 = null;
                    break;
                }
                char var16 = var6.charAt(var14);
                if (var16 == ':') {
                    if (var12 == 0) {
                        var15 = null;
                    } else {
                        byte[] var17 = new byte[var12];
                        System.arraycopy(var13, 0, var17, 0, var12);
                        var15 = var17;
                    }
                    break;
                }
                if (var13.length == var12) {
                    var15 = null;
                    break;
                }
                char var18;
                if (var16 >= '0' && var16 <= '9') {
                    var18 = (char) (var16 - '0');
                } else {
                    if (var16 < 'a' || var16 > 'z') {
                        var15 = null;
                        break;
                    }
                    var18 = (char) (var16 - 'W');
                }
                var13[var12++] = (byte) var18;
            }
            var8 = var15;
            if (var15 != null) {
                var7 = var15.length + 12;
                arg1 = arg1.substring(class364.field4101.length() + var15.length + 1);
            }
        }
        String var19 = arg1.toLowerCase();
        byte var20 = 0;
        if (var19.startsWith(class364.field4130)) {
            var20 = 1;
            arg1 = arg1.substring(class364.field4130.length());
        } else if (var19.startsWith(class364.field4131)) {
            var20 = 2;
            arg1 = arg1.substring(class364.field4131.length());
        } else if (var19.startsWith(class364.field3941)) {
            var20 = 3;
            arg1 = arg1.substring(class364.field3941.length());
        } else if (var19.startsWith(class364.field3986)) {
            var20 = 4;
            arg1 = arg1.substring(class364.field3986.length());
        } else if (var19.startsWith(class364.field4134)) {
            var20 = 5;
            arg1 = arg1.substring(class364.field4134.length());
        }
        var4.field3243.method8393(var7);
        var4.field3243.method8393(var20);
        if (var8 != null && client.field493 >= 214) {
            for (int var21 = 0; var21 < var8.length; var21++) {
                var4.field3243.method8393(var8[var21]);
            }
        }
        class351.method818(var4.field3243, arg1);
        if (arg0 == class352.field3836.method41()) {
            var4.field3243.method8393(arg3);
        }
        var4.field3243.method8407(var4.field3243.field5137 - var5);
        return var4;
    }
}
