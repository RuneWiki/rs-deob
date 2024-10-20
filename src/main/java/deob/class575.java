package deob;

@ObfuscatedName("wm")
public class class575 {

    @ObfuscatedName("wm.ac")
    public static final int[] field5578 = new int[] { 16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472 };

    public class575() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("qh.ac(ILjava/lang/String;Lpx;IB)Lmq;")
    public static class326 method7261(int arg0, String arg1, class406 arg2, int arg3) {
        class326 var4 = class326.method3199(class324.field3316, client.field582.field1486);
        var4.field3426.method9022(0);
        int var5 = var4.field3426.field5415;
        var4.field3426.method9022(arg0);
        String var6 = arg1.toLowerCase();
        int var7 = 0;
        byte[] var8 = null;
        if (var6.startsWith(class382.field4329)) {
            var7 = 0;
            arg1 = arg1.substring(class382.field4329.length());
        } else if (var6.startsWith(class382.field4330)) {
            var7 = 1;
            arg1 = arg1.substring(class382.field4330.length());
        } else if (var6.startsWith(class382.field4331)) {
            var7 = 2;
            arg1 = arg1.substring(class382.field4331.length());
        } else if (var6.startsWith(class382.field4332)) {
            var7 = 3;
            arg1 = arg1.substring(class382.field4332.length());
        } else if (var6.startsWith(class382.field4333)) {
            var7 = 4;
            arg1 = arg1.substring(class382.field4333.length());
        } else if (var6.startsWith(class382.field4249)) {
            var7 = 5;
            arg1 = arg1.substring(class382.field4249.length());
        } else if (var6.startsWith(class382.field4135)) {
            var7 = 6;
            arg1 = arg1.substring(class382.field4135.length());
        } else if (var6.startsWith(class382.field4309)) {
            var7 = 7;
            arg1 = arg1.substring(class382.field4309.length());
        } else if (var6.startsWith(class382.field4337)) {
            var7 = 8;
            arg1 = arg1.substring(class382.field4337.length());
        } else if (var6.startsWith(class382.field4338)) {
            var7 = 9;
            arg1 = arg1.substring(class382.field4338.length());
        } else if (var6.startsWith(class382.field4171)) {
            var7 = 10;
            arg1 = arg1.substring(class382.field4171.length());
        } else if (var6.startsWith(class382.field4174)) {
            var7 = 11;
            arg1 = arg1.substring(class382.field4174.length());
        } else if (var6.startsWith(class382.field4386)) {
            var7 = 12;
            arg1 = arg1.substring(class382.field4386.length());
        } else if (var6.startsWith(class382.field4342)) {
            var8 = method2395(var6);
            if (var8 != null) {
                var7 = var8.length + 12;
                arg1 = arg1.substring(class382.field4342.length() + var8.length + 1);
            }
        }
        String var9 = arg1.toLowerCase();
        byte var10 = 0;
        if (var9.startsWith(class382.field4343)) {
            var10 = 1;
            arg1 = arg1.substring(class382.field4343.length());
        } else if (var9.startsWith(class382.field4350)) {
            var10 = 2;
            arg1 = arg1.substring(class382.field4350.length());
        } else if (var9.startsWith(class382.field4345)) {
            var10 = 3;
            arg1 = arg1.substring(class382.field4345.length());
        } else if (var9.startsWith(class382.field4432)) {
            var10 = 4;
            arg1 = arg1.substring(class382.field4432.length());
        } else if (var9.startsWith(class382.field4254)) {
            var10 = 5;
            arg1 = arg1.substring(class382.field4254.length());
        }
        var4.field3426.method9022(var7);
        var4.field3426.method9022(var10);
        if (var8 != null) {
            for (int var11 = 0; var11 < var8.length; var11++) {
                var4.field3426.method9022(var8[var11]);
            }
        }
        class366.method5607(var4.field3426, arg1);
        if (arg0 == class371.field4035.method32()) {
            var4.field3426.method9022(arg3);
        }
        var4.field3426.method8971(var4.field3426.field5415 - var5);
        return var4;
    }

    @ObfuscatedName("dx.ae(Ljava/lang/String;I)[B")
    public static byte[] method2395(String arg0) {
        boolean var1 = true;
        boolean var2 = true;
        int var3 = class382.field4342.length();
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
