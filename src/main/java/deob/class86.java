package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ce")
public class class86 {

    @ObfuscatedName("ce.e")
    public static final BigInteger field1294 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("ce.y")
    public static final BigInteger field1297 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ac.d(I)J")
    public static long method226() {
        try {
            URL var0 = new URL(client.method4701("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class195 var4 = new class195(new byte[1000]);
            do {
                int var5 = var3.read(var4.field2569, var4.field2568, 1000 - var4.field2568);
                if (var5 == -1) {
                    var4.field2568 = 0;
                    return var4.method3265();
                }
                var4.field2568 += var5;
            } while (var4.field2568 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("dj.z(JLjava/lang/String;I)I")
    public static final int method2425(long arg0, String arg1) {
        Random var3 = new Random();
        class195 var4 = new class195(128);
        class195 var5 = new class195(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method3243(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method3326(var3.nextInt());
        }
        var4.method3326(var6[0]);
        var4.method3326(var6[1]);
        var4.method3248(arg0);
        var4.method3248(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method3326(var3.nextInt());
        }
        var4.method3353(field1294, field1297);
        var5.method3243(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method3326(var3.nextInt());
        }
        var5.method3248(var3.nextLong());
        var5.method3247(var3.nextLong());
        client.method996(var5);
        var5.method3248(var3.nextLong());
        var5.method3353(field1294, field1297);
        int var10 = class195.method240(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class195 var11 = new class195(var10);
        var11.method3250(arg1);
        var11.field2568 = var10;
        var11.method3406(var6);
        class195 var12 = new class195(var11.field2568 + var5.field2568 + var4.field2568 + 5);
        var12.method3243(2);
        var12.method3243(var4.field2568);
        var12.method3253(var4.field2569, 0, var4.field2568);
        var12.method3243(var5.field2568);
        var12.method3253(var5.field2569, 0, var5.field2568);
        var12.method3360(var11.field2568);
        var12.method3253(var11.field2569, 0, var11.field2568);
        byte[] var13 = var12.field2569;
        int var14 = var13.length;
        StringBuilder var15 = new StringBuilder();
        for (int var16 = 0; var16 < var14; var16 += 3) {
            int var17 = var13[var16] & 0xFF;
            var15.append(class318.field3918[var17 >>> 2]);
            if (var16 < var14 - 1) {
                int var18 = var13[var16 + 1] & 0xFF;
                var15.append(class318.field3918[(var17 & 0x3) << 4 | var18 >>> 4]);
                if (var16 < var14 - 2) {
                    int var19 = var13[var16 + 2] & 0xFF;
                    var15.append(class318.field3918[(var18 & 0xF) << 2 | var19 >>> 6]).append(class318.field3918[var19 & 0x3F]);
                } else {
                    var15.append(class318.field3918[(var18 & 0xF) << 2]).append("=");
                }
            } else {
                var15.append(class318.field3918[(var17 & 0x3) << 4]).append("==");
            }
        }
        String var20 = var15.toString();
        String var22 = var20;
        try {
            URL var23 = new URL(client.method4701("services", false) + "m=accountappeal/login.ws");
            URLConnection var24 = var23.openConnection();
            var24.setDoInput(true);
            var24.setDoOutput(true);
            var24.setConnectTimeout(5000);
            OutputStreamWriter var25 = new OutputStreamWriter(var24.getOutputStream());
            var25.write("data2=" + class340.method473(var22) + "&dest=" + class340.method473("passwordchoice.ws"));
            var25.flush();
            InputStream var26 = var24.getInputStream();
            class195 var27 = new class195(new byte[1000]);
            do {
                int var28 = var26.read(var27.field2569, var27.field2568, 1000 - var27.field2568);
                if (var28 == -1) {
                    var25.close();
                    var26.close();
                    String var29 = new String(var27.field2569);
                    if (var29.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var29.startsWith("WRONG")) {
                        return 7;
                    } else if (var29.startsWith("RELOAD")) {
                        return 3;
                    } else if (var29.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var27.method3278(var6);
                        while (var27.field2568 > 0 && var27.field2569[var27.field2568 - 1] == 0) {
                            var27.field2568--;
                        }
                        String var30 = new String(var27.field2569, 0, var27.field2568);
                        if (method3240(var30)) {
                            class58.method89(var30, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var27.field2568 += var28;
            } while (var27.field2568 < 1000);
            return 5;
        } catch (Throwable var32) {
            var32.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("gn.n(Ljava/lang/String;I)Z")
    public static boolean method3240(String arg0) {
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
