package deob;

@ObfuscatedName("vl")
public class class555 {

    @ObfuscatedName("vl.am")
    public static final int[] field5331 = new int[] { 16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472 };

    public class555() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cn.am(ILjava/lang/String;Lol;IB)Llr;")
    public static class311 method1190(int arg0, String arg1, class390 arg2, int arg3) {
        class311 var4 = class311.method7979(class309.field3165, client.field561.field1404);
        var4.field3279.method8699(0);
        int var5 = var4.field3279.field5181;
        var4.field3279.method8699(arg0);
        String var6 = arg1.toLowerCase();
        int var7 = 0;
        byte[] var8 = null;
        if (var6.startsWith(class367.field4166)) {
            var7 = 0;
            arg1 = arg1.substring(class367.field4166.length());
        } else if (var6.startsWith(class367.field4167)) {
            var7 = 1;
            arg1 = arg1.substring(class367.field4167.length());
        } else if (var6.startsWith(class367.field4168)) {
            var7 = 2;
            arg1 = arg1.substring(class367.field4168.length());
        } else if (var6.startsWith(class367.field4075)) {
            var7 = 3;
            arg1 = arg1.substring(class367.field4075.length());
        } else if (var6.startsWith(class367.field4195)) {
            var7 = 4;
            arg1 = arg1.substring(class367.field4195.length());
        } else if (var6.startsWith(class367.field4042)) {
            var7 = 5;
            arg1 = arg1.substring(class367.field4042.length());
        } else if (var6.startsWith(class367.field4172)) {
            var7 = 6;
            arg1 = arg1.substring(class367.field4172.length());
        } else if (var6.startsWith(class367.field4173)) {
            var7 = 7;
            arg1 = arg1.substring(class367.field4173.length());
        } else if (var6.startsWith(class367.field3976)) {
            var7 = 8;
            arg1 = arg1.substring(class367.field3976.length());
        } else if (var6.startsWith(class367.field3994)) {
            var7 = 9;
            arg1 = arg1.substring(class367.field3994.length());
        } else if (var6.startsWith(class367.field4176)) {
            var7 = 10;
            arg1 = arg1.substring(class367.field4176.length());
        } else if (var6.startsWith(class367.field4177)) {
            var7 = 11;
            arg1 = arg1.substring(class367.field4177.length());
        } else if (var6.startsWith(class367.field3978)) {
            var7 = 12;
            arg1 = arg1.substring(class367.field3978.length());
        } else if (var6.startsWith(class367.field4179)) {
            var8 = method4093(var6);
            if (var8 != null) {
                var7 = var8.length + 12;
                arg1 = arg1.substring(class367.field4179.length() + var8.length + 1);
            }
        }
        String var9 = arg1.toLowerCase();
        byte var10 = 0;
        if (var9.startsWith(class367.field4180)) {
            var10 = 1;
            arg1 = arg1.substring(class367.field4180.length());
        } else if (var9.startsWith(class367.field4181)) {
            var10 = 2;
            arg1 = arg1.substring(class367.field4181.length());
        } else if (var9.startsWith(class367.field4182)) {
            var10 = 3;
            arg1 = arg1.substring(class367.field4182.length());
        } else if (var9.startsWith(class367.field4104)) {
            var10 = 4;
            arg1 = arg1.substring(class367.field4104.length());
        } else if (var9.startsWith(class367.field4164)) {
            var10 = 5;
            arg1 = arg1.substring(class367.field4164.length());
        }
        var4.field3279.method8699(var7);
        var4.field3279.method8699(var10);
        if (var8 != null) {
            for (int var11 = 0; var11 < var8.length; var11++) {
                var4.field3279.method8699(var8[var11]);
            }
        }
        class354.method4120(var4.field3279, arg1);
        if (arg0 == class355.field3880.method34()) {
            var4.field3279.method8699(arg3);
        }
        var4.field3279.method8558(var4.field3279.field5181 - var5);
        return var4;
    }

    @ObfuscatedName("ii.ap(Ljava/lang/String;I)[B")
    public static byte[] method4093(String arg0) {
        boolean var1 = true;
        boolean var2 = true;
        int var3 = class367.field4179.length();
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

    @ObfuscatedName("qw.af([BI)[I")
    public static int[] method7368(byte[] arg0) {
        if (arg0 == null || arg0.length == 0 || arg0.length > 8) {
            return null;
        }
        int[] var1 = new int[arg0.length];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            if (arg0[var2] < 0 || arg0[var2] > field5331.length) {
                return null;
            }
            var1[var2] = field5331[arg0[var2]];
        }
        return var1;
    }
}
