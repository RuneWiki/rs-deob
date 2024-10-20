package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cz")
public class class88 {

    @ObfuscatedName("cz.f")
    public static final BigInteger field1394 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cz.i")
    public static final BigInteger field1395 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class88() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.w(I)J")
    public static long method471() {
        try {
            URL var0 = new URL(client.method1881("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class177 var4 = new class177(new byte[1000]);
            do {
                int var5 = var3.read(var4.field2419, var4.field2412, 1000 - var4.field2412);
                if (var5 == -1) {
                    var4.field2412 = 0;
                    return var4.method2890();
                }
                var4.field2412 += var5;
            } while (var4.field2412 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("ax.o(JLjava/lang/String;I)I")
    public static final int method549(long arg0, String arg1) {
        Random var3 = new Random();
        class177 var4 = new class177(128);
        class177 var5 = new class177(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method3075(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2872(var3.nextInt());
        }
        var4.method2872(var6[0]);
        var4.method2872(var6[1]);
        var4.method2874(arg0);
        var4.method2874(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2872(var3.nextInt());
        }
        var4.method2905(field1394, field1395);
        var5.method3075(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2872(var3.nextInt());
        }
        var5.method2874(var3.nextLong());
        var5.method2873(var3.nextLong());
        client.method3866(var5);
        var5.method2874(var3.nextLong());
        var5.method2905(field1394, field1395);
        int var10 = class177.method117(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class177 var11 = new class177(var10);
        var11.method2875(arg1);
        var11.field2412 = var10;
        var11.method2901(var6);
        class177 var12 = new class177(var11.field2412 + var5.field2412 + var4.field2412 + 5);
        var12.method3075(2);
        var12.method3075(var4.field2412);
        var12.method3002(var4.field2419, 0, var4.field2412);
        var12.method3075(var5.field2412);
        var12.method3002(var5.field2419, 0, var5.field2412);
        var12.method2903(var11.field2412);
        var12.method3002(var11.field2419, 0, var11.field2412);
        String var13 = class273.method1379(var12.field2419);
        try {
            URL var14 = new URL(client.method1881("services", false) + "m=accountappeal/login.ws");
            URLConnection var15 = var14.openConnection();
            var15.setDoInput(true);
            var15.setDoOutput(true);
            var15.setConnectTimeout(5000);
            OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
            var16.write("data2=" + class297.method4138(var13) + "&dest=" + class297.method4138("passwordchoice.ws"));
            var16.flush();
            InputStream var17 = var15.getInputStream();
            class177 var18 = new class177(new byte[1000]);
            do {
                int var19 = var17.read(var18.field2419, var18.field2412, 1000 - var18.field2412);
                if (var19 == -1) {
                    var16.close();
                    var17.close();
                    String var20 = new String(var18.field2419);
                    if (var20.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var20.startsWith("WRONG")) {
                        return 7;
                    } else if (var20.startsWith("RELOAD")) {
                        return 3;
                    } else if (var20.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var18.method2987(var6);
                        while (var18.field2412 > 0 && var18.field2419[var18.field2412 - 1] == 0) {
                            var18.field2412--;
                        }
                        String var21 = new String(var18.field2419, 0, var18.field2412);
                        if (method141(var21)) {
                            class57.method627(var21, true, "openjs", false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var18.field2412 += var19;
            } while (var18.field2412 < 1000);
            return 5;
        } catch (Throwable var23) {
            var23.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("e.x(Ljava/lang/String;I)Z")
    public static boolean method141(String arg0) {
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
