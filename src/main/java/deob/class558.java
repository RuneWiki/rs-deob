package deob;

@ObfuscatedName("va")
public class class558 {

    @ObfuscatedName("va.aq")
    public static final int[] field5360 = new int[] { 16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472 };

    public class558() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("te.aq(ILjava/lang/String;Lpe;II)Lmn;")
    public static class313 method8349(int arg0, String arg1, class393 arg2, int arg3) {
        class313 var4 = class313.method5301(class311.field3268, client.field590.field1435);
        var4.field3291.method8574(0);
        int var5 = var4.field3291.field5200;
        var4.field3291.method8574(arg0);
        String var6 = arg1.toLowerCase();
        int var7 = 0;
        byte[] var8 = null;
        if (var6.startsWith(class370.field4199)) {
            var7 = 0;
            arg1 = arg1.substring(class370.field4199.length());
        } else if (var6.startsWith(class370.field4200)) {
            var7 = 1;
            arg1 = arg1.substring(class370.field4200.length());
        } else if (var6.startsWith(class370.field4201)) {
            var7 = 2;
            arg1 = arg1.substring(class370.field4201.length());
        } else if (var6.startsWith(class370.field4105)) {
            var7 = 3;
            arg1 = arg1.substring(class370.field4105.length());
        } else if (var6.startsWith(class370.field4203)) {
            var7 = 4;
            arg1 = arg1.substring(class370.field4203.length());
        } else if (var6.startsWith(class370.field4204)) {
            var7 = 5;
            arg1 = arg1.substring(class370.field4204.length());
        } else if (var6.startsWith(class370.field4205)) {
            var7 = 6;
            arg1 = arg1.substring(class370.field4205.length());
        } else if (var6.startsWith(class370.field4206)) {
            var7 = 7;
            arg1 = arg1.substring(class370.field4206.length());
        } else if (var6.startsWith(class370.field4117)) {
            var7 = 8;
            arg1 = arg1.substring(class370.field4117.length());
        } else if (var6.startsWith(class370.field4185)) {
            var7 = 9;
            arg1 = arg1.substring(class370.field4185.length());
        } else if (var6.startsWith(class370.field4209)) {
            var7 = 10;
            arg1 = arg1.substring(class370.field4209.length());
        } else if (var6.startsWith(class370.field4210)) {
            var7 = 11;
            arg1 = arg1.substring(class370.field4210.length());
        } else if (var6.startsWith(class370.field4211)) {
            var7 = 12;
            arg1 = arg1.substring(class370.field4211.length());
        } else if (var6.startsWith(class370.field4212)) {
            boolean var9 = true;
            boolean var10 = true;
            int var11 = class370.field4212.length();
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
                arg1 = arg1.substring(class370.field4212.length() + var15.length + 1);
            }
        }
        String var19 = arg1.toLowerCase();
        byte var20 = 0;
        if (var19.startsWith(class370.field4213)) {
            var20 = 1;
            arg1 = arg1.substring(class370.field4213.length());
        } else if (var19.startsWith(class370.field4153)) {
            var20 = 2;
            arg1 = arg1.substring(class370.field4153.length());
        } else if (var19.startsWith(class370.field4215)) {
            var20 = 3;
            arg1 = arg1.substring(class370.field4215.length());
        } else if (var19.startsWith(class370.field4037)) {
            var20 = 4;
            arg1 = arg1.substring(class370.field4037.length());
        } else if (var19.startsWith(class370.field4217)) {
            var20 = 5;
            arg1 = arg1.substring(class370.field4217.length());
        }
        var4.field3291.method8574(var7);
        var4.field3291.method8574(var20);
        if (var8 != null) {
            for (int var21 = 0; var21 < var8.length; var21++) {
                var4.field3291.method8574(var8[var21]);
            }
        }
        class357.method3870(var4.field3291, arg1);
        if (arg0 == class358.field3908.method35()) {
            var4.field3291.method8574(arg3);
        }
        var4.field3291.method8588(var4.field3291.field5200 - var5);
        return var4;
    }

    @ObfuscatedName("mt.aw([BB)[I")
    public static int[] method5541(byte[] arg0) {
        if (arg0 == null || arg0.length == 0 || arg0.length > 8) {
            return null;
        }
        int[] var1 = new int[arg0.length];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            if (arg0[var2] < 0 || arg0[var2] > field5360.length) {
                return null;
            }
            var1[var2] = field5360[arg0[var2]];
        }
        return var1;
    }
}
