package deob;

@ObfuscatedName("vn")
public class class569 {

    @ObfuscatedName("vn.ak")
    public static final int[] field5493 = new int[] { 16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472 };

    public class569() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gj.ak(ILjava/lang/String;Lpl;II)Lmd;")
    public static class321 method3178(int arg0, String arg1, class402 arg2, int arg3) {
        class321 var4 = class321.method3542(class319.field3356, client.field591.field1467);
        var4.field3393.method8779(0);
        int var5 = var4.field3393.field5344;
        var4.field3393.method8779(arg0);
        String var6 = arg1.toLowerCase();
        int var7 = 0;
        byte[] var8 = null;
        if (var6.startsWith(class378.field4281)) {
            var7 = 0;
            arg1 = arg1.substring(class378.field4281.length());
        } else if (var6.startsWith(class378.field4282)) {
            var7 = 1;
            arg1 = arg1.substring(class378.field4282.length());
        } else if (var6.startsWith(class378.field4093)) {
            var7 = 2;
            arg1 = arg1.substring(class378.field4093.length());
        } else if (var6.startsWith(class378.field4284)) {
            var7 = 3;
            arg1 = arg1.substring(class378.field4284.length());
        } else if (var6.startsWith(class378.field4285)) {
            var7 = 4;
            arg1 = arg1.substring(class378.field4285.length());
        } else if (var6.startsWith(class378.field4239)) {
            var7 = 5;
            arg1 = arg1.substring(class378.field4239.length());
        } else if (var6.startsWith(class378.field4287)) {
            var7 = 6;
            arg1 = arg1.substring(class378.field4287.length());
        } else if (var6.startsWith(class378.field4288)) {
            var7 = 7;
            arg1 = arg1.substring(class378.field4288.length());
        } else if (var6.startsWith(class378.field4289)) {
            var7 = 8;
            arg1 = arg1.substring(class378.field4289.length());
        } else if (var6.startsWith(class378.field4290)) {
            var7 = 9;
            arg1 = arg1.substring(class378.field4290.length());
        } else if (var6.startsWith(class378.field4394)) {
            var7 = 10;
            arg1 = arg1.substring(class378.field4394.length());
        } else if (var6.startsWith(class378.field4202)) {
            var7 = 11;
            arg1 = arg1.substring(class378.field4202.length());
        } else if (var6.startsWith(class378.field4276)) {
            var7 = 12;
            arg1 = arg1.substring(class378.field4276.length());
        } else if (var6.startsWith(class378.field4294)) {
            boolean var9 = true;
            boolean var10 = true;
            int var11 = class378.field4294.length();
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
                arg1 = arg1.substring(class378.field4294.length() + var15.length + 1);
            }
        }
        String var19 = arg1.toLowerCase();
        byte var20 = 0;
        if (var19.startsWith(class378.field4190)) {
            var20 = 1;
            arg1 = arg1.substring(class378.field4190.length());
        } else if (var19.startsWith(class378.field4236)) {
            var20 = 2;
            arg1 = arg1.substring(class378.field4236.length());
        } else if (var19.startsWith(class378.field4115)) {
            var20 = 3;
            arg1 = arg1.substring(class378.field4115.length());
        } else if (var19.startsWith(class378.field4392)) {
            var20 = 4;
            arg1 = arg1.substring(class378.field4392.length());
        } else if (var19.startsWith(class378.field4299)) {
            var20 = 5;
            arg1 = arg1.substring(class378.field4299.length());
        }
        var4.field3393.method8779(var7);
        var4.field3393.method8779(var20);
        if (var8 != null) {
            for (int var21 = 0; var21 < var8.length; var21++) {
                var4.field3393.method8779(var8[var21]);
            }
        }
        class361.method3088(var4.field3393, arg1);
        if (arg0 == class366.field3989.method34()) {
            var4.field3393.method8779(arg3);
        }
        var4.field3393.method8777(var4.field3393.field5344 - var5);
        return var4;
    }
}
