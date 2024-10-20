package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cc")
public class class88 {

    @ObfuscatedName("cc.h")
    public static final BigInteger field1380 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cc.t")
    public static final BigInteger field1379 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class88() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hz.s(I)J")
    public static long method3736() {
        try {
            URL var0 = new URL(client.method3235("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2403, var4.field2402, 1000 - var4.field2402);
                if (var5 == -1) {
                    var4.field2402 = 0;
                    return var4.method2971();
                }
                var4.field2402 += var5;
            } while (var4.field2402 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("b.c(JLjava/lang/String;I)I")
    public static final int method169(long arg0, String arg1) {
        Random var3 = new Random();
        class177 var4 = new class177(128);
        class177 var5 = new class177(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method3129(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2953(var3.nextInt());
        }
        var4.method2953(var6[0]);
        var4.method2953(var6[1]);
        var4.method2955(arg0);
        var4.method2955(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2953(var3.nextInt());
        }
        var4.method3019(field1380, field1379);
        var5.method3129(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2953(var3.nextInt());
        }
        var5.method2955(var3.nextLong());
        var5.method2976(var3.nextLong());
        client.method4466(var5);
        var5.method2955(var3.nextLong());
        var5.method3019(field1380, field1379);
        int var10 = class177.method2707(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class177 var11 = new class177(var10);
        var11.method2956(arg1);
        var11.field2402 = var10;
        var11.method2982(var6);
        class177 var12 = new class177(var11.field2402 + var5.field2402 + var4.field2402 + 5);
        var12.method3129(2);
        var12.method3129(var4.field2402);
        var12.method2959(var4.field2403, 0, var4.field2402);
        var12.method3129(var5.field2402);
        var12.method2959(var5.field2403, 0, var5.field2402);
        var12.method2951(var11.field2402);
        var12.method2959(var11.field2403, 0, var11.field2402);
        String var13 = Statics.method4144(var12.field2403);
        try {
            URL var14 = new URL(client.method3235("services", false) + "m=accountappeal/login.ws");
            URLConnection var15 = var14.openConnection();
            var15.setDoInput(true);
            var15.setDoOutput(true);
            var15.setConnectTimeout(5000);
            OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
            var16.write("data2=" + class297.method4460(var13) + "&dest=" + class297.method4460("passwordchoice.ws"));
            var16.flush();
            InputStream var17 = var15.getInputStream();
            class177 var18 = new class177(new byte[1000]);
            do {
                int var19 = var17.read(var18.field2403, var18.field2402, 1000 - var18.field2402);
                if (var19 == -1) {
                    var16.close();
                    var17.close();
                    String var20 = new String(var18.field2403);
                    if (var20.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var20.startsWith("WRONG")) {
                        return 7;
                    } else if (var20.startsWith("RELOAD")) {
                        return 3;
                    } else if (var20.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var18.method3116(var6);
                        while (var18.field2402 > 0 && var18.field2403[var18.field2402 - 1] == 0) {
                            var18.field2402--;
                        }
                        String var21 = new String(var18.field2403, 0, var18.field2402);
                        if (method1008(var21)) {
                            class57.method116(var21, true, "openjs", false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var18.field2402 += var19;
            } while (var18.field2402 < 1000);
            return 5;
        } catch (Throwable var23) {
            var23.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("bo.f(Ljava/lang/String;I)Z")
    public static boolean method1008(String arg0) {
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
