package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ce")
public class class81 {

    @ObfuscatedName("ce.o")
    public static final BigInteger field1107 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("ce.u")
    public static final BigInteger field1104 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class81() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bp.m(JLjava/lang/String;S)I")
    public static final int method1613(long arg0, String arg1) {
        Random var3 = new Random();
        class202 var4 = new class202(128);
        class202 var5 = new class202(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method3565(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method3422(var3.nextInt());
        }
        var4.method3422(var6[0]);
        var4.method3422(var6[1]);
        var4.method3558(arg0);
        var4.method3558(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method3422(var3.nextInt());
        }
        var4.method3573(field1107, field1104);
        var5.method3565(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method3422(var3.nextInt());
        }
        var5.method3558(var3.nextLong());
        var5.method3405(var3.nextLong());
        client.method4006(var5);
        var5.method3558(var3.nextLong());
        var5.method3573(field1107, field1104);
        int var10 = class202.method493(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class202 var11 = new class202(var10);
        var11.method3591(arg1);
        var11.field2439 = var10;
        var11.method3436(var6);
        class202 var12 = new class202(var11.field2439 + var5.field2439 + var4.field2439 + 5);
        var12.method3565(2);
        var12.method3565(var4.field2439);
        var12.method3546(var4.field2440, 0, var4.field2439);
        var12.method3565(var5.field2439);
        var12.method3546(var5.field2440, 0, var5.field2439);
        var12.method3402(var11.field2439);
        var12.method3546(var11.field2440, 0, var11.field2439);
        byte[] var13 = var12.field2440;
        int var14 = var13.length;
        StringBuilder var15 = new StringBuilder();
        for (int var16 = 0; var16 < var14; var16 += 3) {
            int var17 = var13[var16] & 0xFF;
            var15.append(class308.field3793[var17 >>> 2]);
            if (var16 < var14 - 1) {
                int var18 = var13[var16 + 1] & 0xFF;
                var15.append(class308.field3793[(var17 & 0x3) << 4 | var18 >>> 4]);
                if (var16 < var14 - 2) {
                    int var19 = var13[var16 + 2] & 0xFF;
                    var15.append(class308.field3793[(var18 & 0xF) << 2 | var19 >>> 6]).append(class308.field3793[var19 & 0x3F]);
                } else {
                    var15.append(class308.field3793[(var18 & 0xF) << 2]).append("=");
                }
            } else {
                var15.append(class308.field3793[(var17 & 0x3) << 4]).append("==");
            }
        }
        String var20 = var15.toString();
        String var22 = var20;
        try {
            URL var23 = new URL(client.method1089("services", false) + "m=accountappeal/login.ws");
            URLConnection var24 = var23.openConnection();
            var24.setDoInput(true);
            var24.setDoOutput(true);
            var24.setConnectTimeout(5000);
            OutputStreamWriter var25 = new OutputStreamWriter(var24.getOutputStream());
            var25.write("data2=" + class338.method5316(var22) + "&dest=" + class338.method5316("passwordchoice.ws"));
            var25.flush();
            InputStream var26 = var24.getInputStream();
            class202 var27 = new class202(new byte[1000]);
            do {
                int var28 = var26.read(var27.field2440, var27.field2439, 1000 - var27.field2439);
                if (var28 == -1) {
                    var25.close();
                    var26.close();
                    String var29 = new String(var27.field2440);
                    if (var29.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var29.startsWith("WRONG")) {
                        return 7;
                    } else if (var29.startsWith("RELOAD")) {
                        return 3;
                    } else if (var29.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var27.method3500(var6);
                        while (var27.field2439 > 0 && var27.field2440[var27.field2439 - 1] == 0) {
                            var27.field2439--;
                        }
                        String var30 = new String(var27.field2440, 0, var27.field2439);
                        if (method1851(var30)) {
                            class51.method544(var30, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var27.field2439 += var28;
            } while (var27.field2439 < 1000);
            return 5;
        } catch (Throwable var32) {
            var32.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("cm.f(Ljava/lang/String;I)Z")
    public static boolean method1851(String arg0) {
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
