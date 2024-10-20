package deob;

@ObfuscatedName("vo")
public class class559 {

    @ObfuscatedName("vo.az")
    public static final int[] field5386 = new int[] { 16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472 };

    public class559() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jm.az(ILjava/lang/String;Lpv;II)Lmh;")
    public static class313 method4519(int arg0, String arg1, class394 arg2, int arg3) {
        class313 var4 = class313.method7156(class311.field3240, client.field574.field1438);
        var4.field3318.method8445(0);
        int var5 = var4.field3318.field5233;
        var4.field3318.method8445(arg0);
        String var6 = arg1.toLowerCase();
        int var7 = 0;
        byte[] var8 = null;
        if (var6.startsWith(class370.field4165)) {
            var7 = 0;
            arg1 = arg1.substring(class370.field4165.length());
        } else if (var6.startsWith(class370.field4200)) {
            var7 = 1;
            arg1 = arg1.substring(class370.field4200.length());
        } else if (var6.startsWith(class370.field4201)) {
            var7 = 2;
            arg1 = arg1.substring(class370.field4201.length());
        } else if (var6.startsWith(class370.field4202)) {
            var7 = 3;
            arg1 = arg1.substring(class370.field4202.length());
        } else if (var6.startsWith(class370.field4014)) {
            var7 = 4;
            arg1 = arg1.substring(class370.field4014.length());
        } else if (var6.startsWith(class370.field4204)) {
            var7 = 5;
            arg1 = arg1.substring(class370.field4204.length());
        } else if (var6.startsWith(class370.field4205)) {
            var7 = 6;
            arg1 = arg1.substring(class370.field4205.length());
        } else if (var6.startsWith(class370.field4032)) {
            var7 = 7;
            arg1 = arg1.substring(class370.field4032.length());
        } else if (var6.startsWith(class370.field4207)) {
            var7 = 8;
            arg1 = arg1.substring(class370.field4207.length());
        } else if (var6.startsWith(class370.field4208)) {
            var7 = 9;
            arg1 = arg1.substring(class370.field4208.length());
        } else if (var6.startsWith(class370.field4209)) {
            var7 = 10;
            arg1 = arg1.substring(class370.field4209.length());
        } else if (var6.startsWith(class370.field4210)) {
            var7 = 11;
            arg1 = arg1.substring(class370.field4210.length());
        } else if (var6.startsWith(class370.field4310)) {
            var7 = 12;
            arg1 = arg1.substring(class370.field4310.length());
        } else if (var6.startsWith(class370.field4212)) {
            var8 = method3127(var6);
            if (var8 != null) {
                var7 = var8.length + 12;
                arg1 = arg1.substring(class370.field4212.length() + var8.length + 1);
            }
        }
        String var9 = arg1.toLowerCase();
        byte var10 = 0;
        if (var9.startsWith(class370.field4213)) {
            var10 = 1;
            arg1 = arg1.substring(class370.field4213.length());
        } else if (var9.startsWith(class370.field4214)) {
            var10 = 2;
            arg1 = arg1.substring(class370.field4214.length());
        } else if (var9.startsWith(class370.field4215)) {
            var10 = 3;
            arg1 = arg1.substring(class370.field4215.length());
        } else if (var9.startsWith(class370.field4227)) {
            var10 = 4;
            arg1 = arg1.substring(class370.field4227.length());
        } else if (var9.startsWith(class370.field4083)) {
            var10 = 5;
            arg1 = arg1.substring(class370.field4083.length());
        }
        var4.field3318.method8445(var7);
        var4.field3318.method8445(var10);
        if (var8 != null) {
            for (int var11 = 0; var11 < var8.length; var11++) {
                var4.field3318.method8445(var8[var11]);
            }
        }
        class353.method1996(var4.field3318, arg1);
        if (arg0 == class358.field3920.method38()) {
            var4.field3318.method8445(arg3);
        }
        var4.field3318.method8459(var4.field3318.field5233 - var5);
        return var4;
    }

    @ObfuscatedName("gi.ah(Ljava/lang/String;I)[B")
    public static byte[] method3127(String arg0) {
        boolean var1 = true;
        boolean var2 = true;
        int var3 = class370.field4212.length();
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
