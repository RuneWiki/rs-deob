package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ao")
public class class37 {

    @ObfuscatedName("ao.w")
    public static final BigInteger field796 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("ao.h")
    public static final BigInteger field801 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.x(I)J")
    public static long method108() {
        try {
            URL var0 = new URL(client.method1511("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class154 var4 = new class154(new byte[1000]);
            do {
                int var5 = var3.read(var4.field2091, var4.field2086, 1000 - var4.field2086);
                if (var5 == -1) {
                    var4.field2086 = 0;
                    return var4.method2645();
                }
                var4.field2086 += var5;
            } while (var4.field2086 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("q.j(JLjava/lang/String;I)I")
    public static final int method171(long arg0, String arg1) {
        Random var3 = new Random();
        class154 var4 = new class154(128);
        class154 var5 = new class154(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2651(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2627(var3.nextInt());
        }
        var4.method2627(var6[0]);
        var4.method2627(var6[1]);
        var4.method2664(arg0);
        var4.method2664(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2627(var3.nextInt());
        }
        var4.method2660(field796, field801);
        var5.method2651(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2627(var3.nextInt());
        }
        var5.method2664(var3.nextLong());
        var5.method2628(var3.nextLong());
        if (client.field350 == null) {
            byte[] var10 = new byte[24];
            try {
                class105.field1696.method1361(0L);
                class105.field1696.method1363(var10);
                int var11;
                for (var11 = 0; var11 < 24 && var10[var11] == 0; var11++) {
                }
                if (var11 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var32) {
                for (int var13 = 0; var13 < 24; var13++) {
                    var10[var13] = -1;
                }
            }
            var5.method2633(var10, 0, var10.length);
        } else {
            var5.method2633(client.field350, 0, client.field350.length);
        }
        var5.method2664(var3.nextLong());
        var5.method2660(field796, field801);
        int var16 = class154.method2955(arg1);
        if (var16 % 8 != 0) {
            var16 += 8 - var16 % 8;
        }
        class154 var17 = new class154(var16);
        var17.method2630(arg1);
        var17.field2086 = var16;
        var17.method2667(var6);
        class154 var18 = new class154(var17.field2086 + var5.field2086 + var4.field2086 + 5);
        var18.method2651(2);
        var18.method2651(var4.field2086);
        var18.method2633(var4.field2091, 0, var4.field2086);
        var18.method2651(var5.field2086);
        var18.method2633(var5.field2091, 0, var5.field2086);
        var18.method2625(var17.field2086);
        var18.method2633(var17.field2091, 0, var17.field2086);
        byte[] var19 = var18.field2091;
        String var20 = class207.method3361(var19, 0, var19.length);
        String var21 = var20;
        try {
            URL var22 = new URL(client.method1511("services", false) + "m=accountappeal/login.ws");
            URLConnection var23 = var22.openConnection();
            var23.setDoInput(true);
            var23.setDoOutput(true);
            var23.setConnectTimeout(5000);
            OutputStreamWriter var24 = new OutputStreamWriter(var23.getOutputStream());
            var24.write("data2=" + class232.method939(var21) + "&dest=" + class232.method939("passwordchoice.ws"));
            var24.flush();
            InputStream var25 = var23.getInputStream();
            class154 var26 = new class154(new byte[1000]);
            do {
                int var27 = var25.read(var26.field2091, var26.field2086, 1000 - var26.field2086);
                if (var27 == -1) {
                    var24.close();
                    var25.close();
                    String var28 = new String(var26.field2091);
                    if (var28.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var28.startsWith("WRONG")) {
                        return 7;
                    } else if (var28.startsWith("RELOAD")) {
                        return 3;
                    } else if (var28.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var26.method2629(var6);
                        while (var26.field2086 > 0 && var26.field2091[var26.field2086 - 1] == 0) {
                            var26.field2086--;
                        }
                        String var29 = new String(var26.field2091, 0, var26.field2086);
                        if (method599(var29)) {
                            class115.method2013(var29, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var26.field2086 += var27;
            } while (var26.field2086 < 1000);
            return 5;
        } catch (Throwable var31) {
            var31.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("o.c(Ljava/lang/String;I)Z")
    public static boolean method599(String arg0) {
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
