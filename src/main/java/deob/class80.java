package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cf")
public class class80 {

    @ObfuscatedName("cf.b")
    public static final BigInteger field1098 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cf.a")
    public static final BigInteger field1093 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class80() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jg.n(I)J")
    public static long method4717() {
        try {
            URL var0 = new URL(client.method257("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class190 var4 = new class190(new byte[1000]);
            do {
                int var5 = var3.read(var4.field2424, var4.field2423, 1000 - var4.field2423);
                if (var5 == -1) {
                    var4.field2423 = 0;
                    return var4.method3517();
                }
                var4.field2423 += var5;
            } while (var4.field2423 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("gy.h(JLjava/lang/String;I)I")
    public static final int method3797(long arg0, String arg1) {
        Random var3 = new Random();
        class190 var4 = new class190(128);
        class190 var5 = new class190(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method3646(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method3576(var3.nextInt());
        }
        var4.method3576(var6[0]);
        var4.method3576(var6[1]);
        var4.method3530(arg0);
        var4.method3530(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method3576(var3.nextInt());
        }
        var4.method3578(field1098, field1093);
        var5.method3646(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method3576(var3.nextInt());
        }
        var5.method3530(var3.nextLong());
        var5.method3707(var3.nextLong());
        client.method1035(var5);
        var5.method3530(var3.nextLong());
        var5.method3578(field1098, field1093);
        int var10 = class190.method3098(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class190 var11 = new class190(var10);
        var11.method3669(arg1);
        var11.field2423 = var10;
        var11.method3537(var6);
        class190 var12 = new class190(var11.field2423 + var5.field2423 + var4.field2423 + 5);
        var12.method3646(2);
        var12.method3646(var4.field2423);
        var12.method3519(var4.field2424, 0, var4.field2423);
        var12.method3646(var5.field2423);
        var12.method3519(var5.field2424, 0, var5.field2423);
        var12.method3508(var11.field2423);
        var12.method3519(var11.field2424, 0, var11.field2423);
        byte[] var13 = var12.field2424;
        String var14 = class310.method2544(var13, 0, var13.length);
        String var15 = var14;
        try {
            URL var16 = new URL(client.method257("services", false) + "m=accountappeal/login.ws");
            URLConnection var17 = var16.openConnection();
            var17.setDoInput(true);
            var17.setDoOutput(true);
            var17.setConnectTimeout(5000);
            OutputStreamWriter var18 = new OutputStreamWriter(var17.getOutputStream());
            var18.write("data2=" + class336.method3204(var15) + "&dest=" + class336.method3204("passwordchoice.ws"));
            var18.flush();
            InputStream var19 = var17.getInputStream();
            class190 var20 = new class190(new byte[1000]);
            do {
                int var21 = var19.read(var20.field2424, var20.field2423, 1000 - var20.field2423);
                if (var21 == -1) {
                    var18.close();
                    var19.close();
                    String var22 = new String(var20.field2424);
                    if (var22.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var22.startsWith("WRONG")) {
                        return 7;
                    } else if (var22.startsWith("RELOAD")) {
                        return 3;
                    } else if (var22.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var20.method3536(var6);
                        while (var20.field2423 > 0 && var20.field2424[var20.field2423 - 1] == 0) {
                            var20.field2423--;
                        }
                        String var23 = new String(var20.field2424, 0, var20.field2423);
                        if (method271(var23)) {
                            class51.method119(var23, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var20.field2423 += var21;
            } while (var20.field2423 < 1000);
            return 5;
        } catch (Throwable var25) {
            var25.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("e.l(Ljava/lang/String;I)Z")
    public static boolean method271(String arg0) {
        if (arg0 == null) {
            return false;
        }
        try {
            new URL(arg0);
            return true;
        } catch (MalformedURLException var2) {
            return false;
        }
    }
}
