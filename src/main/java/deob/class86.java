package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cj")
public class class86 {

    @ObfuscatedName("cj.k")
    public static final BigInteger field1303 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cj.x")
    public static final BigInteger field1306 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ah.c(B)J")
    public static long method351() {
        try {
            URL var0 = new URL(Statics.method3127("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2567, var4.field2566, 1000 - var4.field2566);
                if (var5 == -1) {
                    var4.field2566 = 0;
                    return var4.method3231();
                }
                var4.field2566 += var5;
            } while (var4.field2566 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("ik.i(JLjava/lang/String;B)I")
    public static final int method4014(long arg0, String arg1) {
        Random var3 = new Random();
        class195 var4 = new class195(128);
        class195 var5 = new class195(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method3209(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method3212(var3.nextInt());
        }
        var4.method3212(var6[0]);
        var4.method3212(var6[1]);
        var4.method3214(arg0);
        var4.method3214(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method3212(var3.nextInt());
        }
        var4.method3247(field1303, field1306);
        var5.method3209(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method3212(var3.nextInt());
        }
        var5.method3214(var3.nextLong());
        var5.method3213(var3.nextLong());
        client.method3433(var5);
        var5.method3214(var3.nextLong());
        var5.method3247(field1303, field1306);
        int var10 = class195.method1769(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class195 var11 = new class195(var10);
        var11.method3216(arg1);
        var11.field2566 = var10;
        var11.method3243(var6);
        class195 var12 = new class195(var11.field2566 + var5.field2566 + var4.field2566 + 5);
        var12.method3209(2);
        var12.method3209(var4.field2566);
        var12.method3267(var4.field2567, 0, var4.field2566);
        var12.method3209(var5.field2566);
        var12.method3267(var5.field2567, 0, var5.field2566);
        var12.method3210(var11.field2566);
        var12.method3267(var11.field2567, 0, var11.field2566);
        byte[] var13 = var12.field2567;
        int var14 = var13.length;
        StringBuilder var15 = new StringBuilder();
        for (int var16 = 0; var16 < var14; var16 += 3) {
            int var17 = var13[var16] & 0xFF;
            var15.append(class318.field3925[var17 >>> 2]);
            if (var16 < var14 - 1) {
                int var18 = var13[var16 + 1] & 0xFF;
                var15.append(class318.field3925[(var17 & 0x3) << 4 | var18 >>> 4]);
                if (var16 < var14 - 2) {
                    int var19 = var13[var16 + 2] & 0xFF;
                    var15.append(class318.field3925[(var18 & 0xF) << 2 | var19 >>> 6]).append(class318.field3925[var19 & 0x3F]);
                } else {
                    var15.append(class318.field3925[(var18 & 0xF) << 2]).append("=");
                }
            } else {
                var15.append(class318.field3925[(var17 & 0x3) << 4]).append("==");
            }
        }
        String var20 = var15.toString();
        String var22 = var20;
        try {
            URL var23 = new URL(Statics.method3127("services", false) + "m=accountappeal/login.ws");
            URLConnection var24 = var23.openConnection();
            var24.setDoInput(true);
            var24.setDoOutput(true);
            var24.setConnectTimeout(5000);
            OutputStreamWriter var25 = new OutputStreamWriter(var24.getOutputStream());
            var25.write("data2=" + class340.method4882(var22) + "&dest=" + class340.method4882("passwordchoice.ws"));
            var25.flush();
            InputStream var26 = var24.getInputStream();
            class195 var27 = new class195(new byte[1000]);
            do {
                int var28 = var26.read(var27.field2567, var27.field2566, 1000 - var27.field2566);
                if (var28 == -1) {
                    var25.close();
                    var26.close();
                    String var29 = new String(var27.field2567);
                    if (var29.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var29.startsWith("WRONG")) {
                        return 7;
                    } else if (var29.startsWith("RELOAD")) {
                        return 3;
                    } else if (var29.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var27.method3439(var6);
                        while (var27.field2566 > 0 && var27.field2567[var27.field2566 - 1] == 0) {
                            var27.field2566--;
                        }
                        String var30 = new String(var27.field2567, 0, var27.field2566);
                        if (!method22(var30)) {
                            return 5;
                        }
                        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                            try {
                                Desktop.getDesktop().browse(new URI(var30));
                                return 2;
                            } catch (Exception var33) {
                            }
                        }
                        if (class58.field647.startsWith("win")) {
                            class58.method2368(var30, 0);
                        } else if (class58.field647.startsWith("mac")) {
                            class58.method498(var30, 1, "openjs");
                        } else {
                            class58.method2368(var30, 2);
                        }
                        return 2;
                    }
                }
                var27.field2566 += var28;
            } while (var27.field2566 < 1000);
            return 5;
        } catch (Throwable var34) {
            var34.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("z.o(Ljava/lang/String;I)Z")
    public static boolean method22(String arg0) {
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
