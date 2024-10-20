package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ay")
public class class37 {

    @ObfuscatedName("ay.h")
    public static final BigInteger field776 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("ay.v")
    public static final BigInteger field779 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.o(B)J")
    public static long method710() {
        try {
            URL var0 = new URL(client.method1116("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2108, var4.field2105, 1000 - var4.field2105);
                if (var5 == -1) {
                    var4.field2105 = 0;
                    return var4.method2558();
                }
                var4.field2105 += var5;
            } while (var4.field2105 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("am.m(JLjava/lang/String;I)I")
    public static final int method566(long arg0, String arg1) {
        Random var3 = new Random();
        class154 var4 = new class154(128);
        class154 var5 = new class154(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2641(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2540(var3.nextInt());
        }
        var4.method2540(var6[0]);
        var4.method2540(var6[1]);
        var4.method2542(arg0);
        var4.method2542(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2540(var3.nextInt());
        }
        var4.method2573(field776, field779);
        var5.method2641(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2540(var3.nextInt());
        }
        var5.method2542(var3.nextLong());
        var5.method2541(var3.nextLong());
        byte[] var10 = new byte[24];
        try {
            class105.field1688.method1277(0L);
            class105.field1688.method1305(var10);
            int var11;
            for (var11 = 0; var11 < 24 && var10[var11] == 0; var11++) {
            }
            if (var11 >= 24) {
                throw new IOException();
            }
        } catch (Exception var37) {
            for (int var13 = 0; var13 < 24; var13++) {
                var10[var13] = -1;
            }
        }
        var5.method2639(var10, 0, 24);
        var5.method2542(var3.nextLong());
        var5.method2573(field776, field779);
        int var14 = class154.method1925(arg1);
        if (var14 % 8 != 0) {
            var14 += 8 - var14 % 8;
        }
        class154 var15 = new class154(var14);
        var15.method2543(arg1);
        var15.field2105 = var14;
        var15.method2569(var6);
        class154 var16 = new class154(var15.field2105 + var5.field2105 + var4.field2105 + 5);
        var16.method2641(2);
        var16.method2641(var4.field2105);
        var16.method2639(var4.field2108, 0, var4.field2105);
        var16.method2641(var5.field2105);
        var16.method2639(var5.field2108, 0, var5.field2105);
        var16.method2538(var15.field2105);
        var16.method2639(var15.field2108, 0, var15.field2105);
        byte[] var17 = var16.field2108;
        int var18 = var17.length;
        StringBuilder var19 = new StringBuilder();
        for (int var20 = 0; var20 < var18; var20 += 3) {
            int var21 = var17[var20] & 0xFF;
            var19.append(class207.field3090[var21 >>> 2]);
            if (var20 < var18 - 1) {
                int var22 = var17[var20 + 1] & 0xFF;
                var19.append(class207.field3090[(var21 & 0x3) << 4 | var22 >>> 4]);
                if (var20 < var18 - 2) {
                    int var23 = var17[var20 + 2] & 0xFF;
                    var19.append(class207.field3090[(var22 & 0xF) << 2 | var23 >>> 6]).append(class207.field3090[var23 & 0x3F]);
                } else {
                    var19.append(class207.field3090[(var22 & 0xF) << 2]).append("=");
                }
            } else {
                var19.append(class207.field3090[(var21 & 0x3) << 4]).append("==");
            }
        }
        String var24 = var19.toString();
        String var26 = var24;
        try {
            URL var27 = new URL(client.method1116("services", false) + "m=accountappeal/login.ws");
            URLConnection var28 = var27.openConnection();
            var28.setDoInput(true);
            var28.setDoOutput(true);
            var28.setConnectTimeout(5000);
            OutputStreamWriter var29 = new OutputStreamWriter(var28.getOutputStream());
            var29.write("data2=" + class232.method588(var26) + "&dest=" + class232.method588("passwordchoice.ws"));
            var29.flush();
            InputStream var30 = var28.getInputStream();
            class154 var31 = new class154(new byte[1000]);
            do {
                int var32 = var30.read(var31.field2108, var31.field2105, 1000 - var31.field2105);
                if (var32 == -1) {
                    var29.close();
                    var30.close();
                    String var33 = new String(var31.field2108);
                    if (var33.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var33.startsWith("WRONG")) {
                        return 7;
                    } else if (var33.startsWith("RELOAD")) {
                        return 3;
                    } else if (var33.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var31.method2570(var6);
                        while (var31.field2105 > 0 && var31.field2108[var31.field2105 - 1] == 0) {
                            var31.field2105--;
                        }
                        String var34 = new String(var31.field2108, 0, var31.field2105);
                        if (method1890(var34)) {
                            class115.method1442(var34, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var31.field2105 += var32;
            } while (var31.field2105 < 1000);
            return 5;
        } catch (Throwable var36) {
            var36.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("dx.b(Ljava/lang/String;I)Z")
    public static boolean method1890(String arg0) {
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
