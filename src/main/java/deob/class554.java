package deob;

@ObfuscatedName("vj")
public class class554 {

    @ObfuscatedName("vj.ac")
    public static final int[] field5290 = new int[] { 16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472 };

    public class554() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gq.ac(ILjava/lang/String;Loa;II)Llx;")
    public static class311 method3096(int arg0, String arg1, class389 arg2, int arg3) {
        class311 var4 = class311.method2978(class309.field3225, client.field579.field1425);
        var4.field3250.method8348(0);
        int var5 = var4.field3250.field5140;
        var4.field3250.method8348(arg0);
        String var6 = arg1.toLowerCase();
        int var7 = 0;
        byte[] var8 = null;
        if (var6.startsWith(class367.field4003)) {
            var7 = 0;
            arg1 = arg1.substring(class367.field4003.length());
        } else if (var6.startsWith(class367.field4139)) {
            var7 = 1;
            arg1 = arg1.substring(class367.field4139.length());
        } else if (var6.startsWith(class367.field4140)) {
            var7 = 2;
            arg1 = arg1.substring(class367.field4140.length());
        } else if (var6.startsWith(class367.field4156)) {
            var7 = 3;
            arg1 = arg1.substring(class367.field4156.length());
        } else if (var6.startsWith(class367.field4142)) {
            var7 = 4;
            arg1 = arg1.substring(class367.field4142.length());
        } else if (var6.startsWith(class367.field4143)) {
            var7 = 5;
            arg1 = arg1.substring(class367.field4143.length());
        } else if (var6.startsWith(class367.field4144)) {
            var7 = 6;
            arg1 = arg1.substring(class367.field4144.length());
        } else if (var6.startsWith(class367.field3997)) {
            var7 = 7;
            arg1 = arg1.substring(class367.field3997.length());
        } else if (var6.startsWith(class367.field4146)) {
            var7 = 8;
            arg1 = arg1.substring(class367.field4146.length());
        } else if (var6.startsWith(class367.field4147)) {
            var7 = 9;
            arg1 = arg1.substring(class367.field4147.length());
        } else if (var6.startsWith(class367.field4148)) {
            var7 = 10;
            arg1 = arg1.substring(class367.field4148.length());
        } else if (var6.startsWith(class367.field4149)) {
            var7 = 11;
            arg1 = arg1.substring(class367.field4149.length());
        } else if (var6.startsWith(class367.field4160)) {
            var7 = 12;
            arg1 = arg1.substring(class367.field4160.length());
        } else if (var6.startsWith(class367.field4151)) {
            var8 = method3097(var6);
            if (var8 != null) {
                var7 = var8.length + 12;
                arg1 = arg1.substring(class367.field4151.length() + var8.length + 1);
            }
        }
        String var9 = arg1.toLowerCase();
        byte var10 = 0;
        if (var9.startsWith(class367.field4152)) {
            var10 = 1;
            arg1 = arg1.substring(class367.field4152.length());
        } else if (var9.startsWith(class367.field4153)) {
            var10 = 2;
            arg1 = arg1.substring(class367.field4153.length());
        } else if (var9.startsWith(class367.field4154)) {
            var10 = 3;
            arg1 = arg1.substring(class367.field4154.length());
        } else if (var9.startsWith(class367.field3957)) {
            var10 = 4;
            arg1 = arg1.substring(class367.field3957.length());
        } else if (var9.startsWith(class367.field4141)) {
            var10 = 5;
            arg1 = arg1.substring(class367.field4141.length());
        }
        var4.field3250.method8348(var7);
        var4.field3250.method8348(var10);
        if (var8 != null && client.field528 >= 214) {
            for (int var11 = 0; var11 < var8.length; var11++) {
                var4.field3250.method8348(var8[var11]);
            }
        }
        class350.method2998(var4.field3250, arg1);
        if (arg0 == class355.field3852.method38()) {
            var4.field3250.method8348(arg3);
        }
        var4.field3250.method8362(var4.field3250.field5140 - var5);
        return var4;
    }

    @ObfuscatedName("gt.al(Ljava/lang/String;I)[B")
    public static byte[] method3097(String arg0) {
        boolean var1 = true;
        boolean var2 = true;
        int var3 = class367.field4151.length();
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
