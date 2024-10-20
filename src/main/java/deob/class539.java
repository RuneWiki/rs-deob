package deob;

@ObfuscatedName("up")
public class class539 {

    @ObfuscatedName("up.aw")
    public static final int[] field5230 = new int[] { 16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472 };

    public class539() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ph.aw(ILjava/lang/String;Lot;II)Llv;")
    public static class298 method6799(int arg0, String arg1, class375 arg2, int arg3) {
        class298 var4 = class298.method8119(class296.field3114, client.field521.field1414);
        var4.field3205.method8227(0);
        int var5 = var4.field3205.field5072;
        var4.field3205.method8227(arg0);
        String var6 = arg1.toLowerCase();
        int var7 = 0;
        byte[] var8 = null;
        if (var6.startsWith(class353.field4088)) {
            var7 = 0;
            arg1 = arg1.substring(class353.field4088.length());
        } else if (var6.startsWith(class353.field4089)) {
            var7 = 1;
            arg1 = arg1.substring(class353.field4089.length());
        } else if (var6.startsWith(class353.field4090)) {
            var7 = 2;
            arg1 = arg1.substring(class353.field4090.length());
        } else if (var6.startsWith(class353.field4091)) {
            var7 = 3;
            arg1 = arg1.substring(class353.field4091.length());
        } else if (var6.startsWith(class353.field4187)) {
            var7 = 4;
            arg1 = arg1.substring(class353.field4187.length());
        } else if (var6.startsWith(class353.field4093)) {
            var7 = 5;
            arg1 = arg1.substring(class353.field4093.length());
        } else if (var6.startsWith(class353.field4094)) {
            var7 = 6;
            arg1 = arg1.substring(class353.field4094.length());
        } else if (var6.startsWith(class353.field3907)) {
            var7 = 7;
            arg1 = arg1.substring(class353.field3907.length());
        } else if (var6.startsWith(class353.field4142)) {
            var7 = 8;
            arg1 = arg1.substring(class353.field4142.length());
        } else if (var6.startsWith(class353.field4149)) {
            var7 = 9;
            arg1 = arg1.substring(class353.field4149.length());
        } else if (var6.startsWith(class353.field3954)) {
            var7 = 10;
            arg1 = arg1.substring(class353.field3954.length());
        } else if (var6.startsWith(class353.field4099)) {
            var7 = 11;
            arg1 = arg1.substring(class353.field4099.length());
        } else if (var6.startsWith(class353.field4100)) {
            var7 = 12;
            arg1 = arg1.substring(class353.field4100.length());
        } else if (var6.startsWith(class353.field4101)) {
            boolean var9 = true;
            boolean var10 = true;
            int var11 = class353.field4101.length();
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
                arg1 = arg1.substring(class353.field4101.length() + var15.length + 1);
            }
        }
        String var19 = arg1.toLowerCase();
        byte var20 = 0;
        if (var19.startsWith(class353.field3988)) {
            var20 = 1;
            arg1 = arg1.substring(class353.field3988.length());
        } else if (var19.startsWith(class353.field3974)) {
            var20 = 2;
            arg1 = arg1.substring(class353.field3974.length());
        } else if (var19.startsWith(class353.field4084)) {
            var20 = 3;
            arg1 = arg1.substring(class353.field4084.length());
        } else if (var19.startsWith(class353.field4115)) {
            var20 = 4;
            arg1 = arg1.substring(class353.field4115.length());
        } else if (var19.startsWith(class353.field3996)) {
            var20 = 5;
            arg1 = arg1.substring(class353.field3996.length());
        }
        var4.field3205.method8227(var7);
        var4.field3205.method8227(var20);
        if (var8 != null && client.field526 >= 214) {
            for (int var21 = 0; var21 < var8.length; var21++) {
                var4.field3205.method8227(var8[var21]);
            }
        }
        class336.method268(var4.field3205, arg1);
        if (arg0 == class341.field3802.method36()) {
            var4.field3205.method8227(arg3);
        }
        var4.field3205.method8241(var4.field3205.field5072 - var5);
        return var4;
    }

    @ObfuscatedName("qn.ay([BI)[I")
    public static int[] method7328(byte[] arg0) {
        if (arg0 == null || arg0.length == 0 || arg0.length > 8) {
            return null;
        }
        int[] var1 = new int[arg0.length];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            if (arg0[var2] < 0 || arg0[var2] > field5230.length) {
                return null;
            }
            var1[var2] = field5230[arg0[var2]];
        }
        return var1;
    }
}
