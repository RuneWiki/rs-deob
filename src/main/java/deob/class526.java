package deob;

@ObfuscatedName("uc")
public class class526 {

    @ObfuscatedName("uc.at")
    public static final int[] field5175 = new int[] { 16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472 };

    public class526() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ho.at(ILjava/lang/String;Loj;IB)Llm;")
    public static class296 method3451(int arg0, String arg1, class372 arg2, int arg3) {
        class296 var4 = class296.method3619(class294.field3139, client.field568.field1380);
        var4.field3211.method8113(0);
        int var5 = var4.field3211.field5017;
        var4.field3211.method8113(arg0);
        String var6 = arg1.toLowerCase();
        int var7 = 0;
        byte[] var8 = null;
        if (var6.startsWith(class350.field4069)) {
            var7 = 0;
            arg1 = arg1.substring(class350.field4069.length());
        } else if (var6.startsWith(class350.field4067)) {
            var7 = 1;
            arg1 = arg1.substring(class350.field4067.length());
        } else if (var6.startsWith(class350.field4071)) {
            var7 = 2;
            arg1 = arg1.substring(class350.field4071.length());
        } else if (var6.startsWith(class350.field4072)) {
            var7 = 3;
            arg1 = arg1.substring(class350.field4072.length());
        } else if (var6.startsWith(class350.field4073)) {
            var7 = 4;
            arg1 = arg1.substring(class350.field4073.length());
        } else if (var6.startsWith(class350.field4074)) {
            var7 = 5;
            arg1 = arg1.substring(class350.field4074.length());
        } else if (var6.startsWith(class350.field4075)) {
            var7 = 6;
            arg1 = arg1.substring(class350.field4075.length());
        } else if (var6.startsWith(class350.field4090)) {
            var7 = 7;
            arg1 = arg1.substring(class350.field4090.length());
        } else if (var6.startsWith(class350.field4077)) {
            var7 = 8;
            arg1 = arg1.substring(class350.field4077.length());
        } else if (var6.startsWith(class350.field3907)) {
            var7 = 9;
            arg1 = arg1.substring(class350.field3907.length());
        } else if (var6.startsWith(class350.field4079)) {
            var7 = 10;
            arg1 = arg1.substring(class350.field4079.length());
        } else if (var6.startsWith(class350.field4152)) {
            var7 = 11;
            arg1 = arg1.substring(class350.field4152.length());
        } else if (var6.startsWith(class350.field4081)) {
            var7 = 12;
            arg1 = arg1.substring(class350.field4081.length());
        } else if (var6.startsWith(class350.field4082)) {
            boolean var9 = true;
            boolean var10 = true;
            int var11 = class350.field4082.length();
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
                arg1 = arg1.substring(class350.field4082.length() + var15.length + 1);
            }
        }
        String var19 = arg1.toLowerCase();
        byte var20 = 0;
        if (var19.startsWith(class350.field4112)) {
            var20 = 1;
            arg1 = arg1.substring(class350.field4112.length());
        } else if (var19.startsWith(class350.field4084)) {
            var20 = 2;
            arg1 = arg1.substring(class350.field4084.length());
        } else if (var19.startsWith(class350.field4085)) {
            var20 = 3;
            arg1 = arg1.substring(class350.field4085.length());
        } else if (var19.startsWith(class350.field4086)) {
            var20 = 4;
            arg1 = arg1.substring(class350.field4086.length());
        } else if (var19.startsWith(class350.field3883)) {
            var20 = 5;
            arg1 = arg1.substring(class350.field3883.length());
        }
        var4.field3211.method8113(var7);
        var4.field3211.method8113(var20);
        if (var8 != null && client.field513 >= 214) {
            for (int var21 = 0; var21 < var8.length; var21++) {
                var4.field3211.method8113(var8[var21]);
            }
        }
        class333.method5429(var4.field3211, arg1);
        if (arg0 == class338.field3779.method33()) {
            var4.field3211.method8113(arg3);
        }
        var4.field3211.method8237(var4.field3211.field5017 - var5);
        return var4;
    }

    @ObfuscatedName("gi.an([BI)[I")
    public static int[] method3118(byte[] arg0) {
        if (arg0 == null || arg0.length == 0 || arg0.length > 8) {
            return null;
        }
        int[] var1 = new int[arg0.length];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            if (arg0[var2] < 0 || arg0[var2] > field5175.length) {
                return null;
            }
            var1[var2] = field5175[arg0[var2]];
        }
        return var1;
    }
}
