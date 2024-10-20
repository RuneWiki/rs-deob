package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("bd")
public class class66 {

    @ObfuscatedName("bd.m")
    public static final BigInteger field857 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("bd.k")
    public static final BigInteger field853 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class66() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cb.l(JLjava/lang/String;B)I")
    public static final int method2306(long arg0, String arg1) {
        Random var3 = new Random();
        class401 var4 = new class401(128);
        class401 var5 = new class401(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method6269(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method6258(var3.nextInt());
        }
        var4.method6258(var6[0]);
        var4.method6258(var6[1]);
        var4.method6322(arg0);
        var4.method6322(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method6258(var3.nextInt());
        }
        var4.method6295(field857, field853);
        var5.method6269(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method6258(var3.nextInt());
        }
        var5.method6322(var3.nextLong());
        var5.method6259(var3.nextLong());
        if (client.field530 == null) {
            byte[] var10 = new byte[24];
            try {
                class144.field1564.method6115(0L);
                class144.field1564.method6117(var10);
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
            var5.method6265(var10, 0, var10.length);
        } else {
            var5.method6265(client.field530, 0, client.field530.length);
        }
        var5.method6322(var3.nextLong());
        var5.method6295(field857, field853);
        int var16 = class401.method2370(arg1);
        if (var16 % 8 != 0) {
            var16 += 8 - var16 % 8;
        }
        class401 var17 = new class401(var16);
        var17.method6489(arg1);
        var17.field4292 = var16;
        var17.method6293(var6);
        class401 var18 = new class401(var17.field4292 + var5.field4292 + var4.field4292 + 5);
        var18.method6269(2);
        var18.method6269(var4.field4292);
        var18.method6265(var4.field4294, 0, var4.field4292);
        var18.method6269(var5.field4292);
        var18.method6265(var5.field4294, 0, var5.field4292);
        var18.method6256(var17.field4292);
        var18.method6265(var17.field4294, 0, var17.field4292);
        byte[] var19 = var18.field4294;
        String var20 = class318.method4185(var19, 0, var19.length);
        String var21 = var20;
        try {
            URL var22 = new URL(client.method2913("services", false) + "m=accountappeal/login.ws");
            URLConnection var23 = var22.openConnection();
            var23.setDoInput(true);
            var23.setDoOutput(true);
            var23.setConnectTimeout(5000);
            OutputStreamWriter var24 = new OutputStreamWriter(var23.getOutputStream());
            var24.write("data2=" + class424.method4994(var21) + "&dest=" + class424.method4994("passwordchoice.ws"));
            var24.flush();
            InputStream var25 = var23.getInputStream();
            class401 var26 = new class401(new byte[1000]);
            do {
                int var27 = var25.read(var26.field4294, var26.field4292, 1000 - var26.field4292);
                if (var27 == -1) {
                    var24.close();
                    var25.close();
                    String var28 = new String(var26.field4294);
                    if (var28.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var28.startsWith("WRONG")) {
                        return 7;
                    } else if (var28.startsWith("RELOAD")) {
                        return 3;
                    } else if (var28.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var26.method6366(var6);
                        while (var26.field4292 > 0 && var26.field4294[var26.field4292 - 1] == 0) {
                            var26.field4292--;
                        }
                        String var29 = new String(var26.field4294, 0, var26.field4292);
                        if (method4932(var29)) {
                            class30.method2095(var29, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var26.field4292 += var27;
            } while (var26.field4292 < 1000);
            return 5;
        } catch (Throwable var31) {
            var31.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("kp.q(Ljava/lang/String;I)Z")
    public static boolean method4932(String arg0) {
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
