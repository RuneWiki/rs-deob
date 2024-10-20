package deob;

@ObfuscatedName("vz")
public class class570 {

    @ObfuscatedName("vz.aq")
    public static final int[] field5516 = new int[] { 16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472 };

    public class570() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("so.aq(ILjava/lang/String;Lpe;IS)Lmb;")
    public static class322 method7946(int arg0, String arg1, class403 arg2, int arg3) {
        class322 var4 = class322.method3236(class320.field3303, client.field653.field1456);
        var4.field3394.method8711(0);
        int var5 = var4.field3394.field5363;
        var4.field3394.method8711(arg0);
        String var6 = arg1.toLowerCase();
        int var7 = 0;
        byte[] var8 = null;
        if (var6.startsWith(class379.field4121)) {
            var7 = 0;
            arg1 = arg1.substring(class379.field4121.length());
        } else if (var6.startsWith(class379.field4310)) {
            var7 = 1;
            arg1 = arg1.substring(class379.field4310.length());
        } else if (var6.startsWith(class379.field4296)) {
            var7 = 2;
            arg1 = arg1.substring(class379.field4296.length());
        } else if (var6.startsWith(class379.field4412)) {
            var7 = 3;
            arg1 = arg1.substring(class379.field4412.length());
        } else if (var6.startsWith(class379.field4313)) {
            var7 = 4;
            arg1 = arg1.substring(class379.field4313.length());
        } else if (var6.startsWith(class379.field4314)) {
            var7 = 5;
            arg1 = arg1.substring(class379.field4314.length());
        } else if (var6.startsWith(class379.field4315)) {
            var7 = 6;
            arg1 = arg1.substring(class379.field4315.length());
        } else if (var6.startsWith(class379.field4316)) {
            var7 = 7;
            arg1 = arg1.substring(class379.field4316.length());
        } else if (var6.startsWith(class379.field4317)) {
            var7 = 8;
            arg1 = arg1.substring(class379.field4317.length());
        } else if (var6.startsWith(class379.field4170)) {
            var7 = 9;
            arg1 = arg1.substring(class379.field4170.length());
        } else if (var6.startsWith(class379.field4352)) {
            var7 = 10;
            arg1 = arg1.substring(class379.field4352.length());
        } else if (var6.startsWith(class379.field4190)) {
            var7 = 11;
            arg1 = arg1.substring(class379.field4190.length());
        } else if (var6.startsWith(class379.field4321)) {
            var7 = 12;
            arg1 = arg1.substring(class379.field4321.length());
        } else if (var6.startsWith(class379.field4339)) {
            boolean var9 = true;
            boolean var10 = true;
            int var11 = class379.field4339.length();
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
                arg1 = arg1.substring(class379.field4339.length() + var15.length + 1);
            }
        }
        String var19 = arg1.toLowerCase();
        byte var20 = 0;
        if (var19.startsWith(class379.field4323)) {
            var20 = 1;
            arg1 = arg1.substring(class379.field4323.length());
        } else if (var19.startsWith(class379.field4324)) {
            var20 = 2;
            arg1 = arg1.substring(class379.field4324.length());
        } else if (var19.startsWith(class379.field4325)) {
            var20 = 3;
            arg1 = arg1.substring(class379.field4325.length());
        } else if (var19.startsWith(class379.field4326)) {
            var20 = 4;
            arg1 = arg1.substring(class379.field4326.length());
        } else if (var19.startsWith(class379.field4327)) {
            var20 = 5;
            arg1 = arg1.substring(class379.field4327.length());
        }
        var4.field3394.method8711(var7);
        var4.field3394.method8711(var20);
        if (var8 != null) {
            for (int var21 = 0; var21 < var8.length; var21++) {
                var4.field3394.method8711(var8[var21]);
            }
        }
        class366.method3990(var4.field3394, arg1);
        if (arg0 == class367.field4001.method32()) {
            var4.field3394.method8711(arg3);
        }
        var4.field3394.method8776(var4.field3394.field5363 - var5);
        return var4;
    }
}
