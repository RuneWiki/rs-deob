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

@ObfuscatedName("ao")
public class class37 {

    @ObfuscatedName("ao.y")
    public static final BigInteger field771 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("ao.p")
    public static final BigInteger field772 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bn.x(I)J")
    public static long method1156() {
        try {
            URL var0 = new URL(client.method12("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2086, var4.field2087, 1000 - var4.field2087);
                if (var5 == -1) {
                    var4.field2087 = 0;
                    return var4.method2707();
                }
                var4.field2087 += var5;
            } while (var4.field2087 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("f.n(JLjava/lang/String;I)I")
    public static final int method181(long arg0, String arg1) {
        Random var3 = new Random();
        class154 var4 = new class154(128);
        class154 var5 = new class154(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2688(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2689(var3.nextInt());
        }
        var4.method2689(var6[0]);
        var4.method2689(var6[1]);
        var4.method2900(arg0);
        var4.method2900(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2689(var3.nextInt());
        }
        var4.method2722(field771, field772);
        var5.method2688(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2689(var3.nextInt());
        }
        var5.method2900(var3.nextLong());
        var5.method2690(var3.nextLong());
        client.method2054(var5);
        var5.method2900(var3.nextLong());
        var5.method2722(field771, field772);
        int var10 = class154.method3037(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class154 var11 = new class154(var10);
        var11.method2730(arg1);
        var11.field2087 = var10;
        var11.method2718(var6);
        class154 var12 = new class154(var11.field2087 + var5.field2087 + var4.field2087 + 5);
        var12.method2688(2);
        var12.method2688(var4.field2087);
        var12.method2695(var4.field2086, 0, var4.field2087);
        var12.method2688(var5.field2087);
        var12.method2695(var5.field2086, 0, var5.field2087);
        var12.method2687(var11.field2087);
        var12.method2695(var11.field2086, 0, var11.field2087);
        byte[] var13 = var12.field2086;
        int var14 = var13.length;
        StringBuilder var15 = new StringBuilder();
        for (int var16 = 0; var16 < var14; var16 += 3) {
            int var17 = var13[var16] & 0xFF;
            var15.append(class207.field3098[var17 >>> 2]);
            if (var16 < var14 - 1) {
                int var18 = var13[var16 + 1] & 0xFF;
                var15.append(class207.field3098[(var17 & 0x3) << 4 | var18 >>> 4]);
                if (var16 < var14 - 2) {
                    int var19 = var13[var16 + 2] & 0xFF;
                    var15.append(class207.field3098[(var18 & 0xF) << 2 | var19 >>> 6]).append(class207.field3098[var19 & 0x3F]);
                } else {
                    var15.append(class207.field3098[(var18 & 0xF) << 2]).append("=");
                }
            } else {
                var15.append(class207.field3098[(var17 & 0x3) << 4]).append("==");
            }
        }
        String var20 = var15.toString();
        String var22 = var20;
        try {
            URL var23 = new URL(client.method12("services", false) + "m=accountappeal/login.ws");
            URLConnection var24 = var23.openConnection();
            var24.setDoInput(true);
            var24.setDoOutput(true);
            var24.setConnectTimeout(5000);
            OutputStreamWriter var25 = new OutputStreamWriter(var24.getOutputStream());
            var25.write("data2=" + class232.method3313(var22) + "&dest=" + class232.method3313("passwordchoice.ws"));
            var25.flush();
            InputStream var26 = var24.getInputStream();
            class154 var27 = new class154(new byte[1000]);
            do {
                int var28 = var26.read(var27.field2086, var27.field2087, 1000 - var27.field2087);
                if (var28 == -1) {
                    var25.close();
                    var26.close();
                    String var29 = new String(var27.field2086);
                    if (var29.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var29.startsWith("WRONG")) {
                        return 7;
                    } else if (var29.startsWith("RELOAD")) {
                        return 3;
                    } else if (var29.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var27.method2861(var6);
                        while (var27.field2087 > 0 && var27.field2086[var27.field2087 - 1] == 0) {
                            var27.field2087--;
                        }
                        String var30 = new String(var27.field2086, 0, var27.field2087);
                        boolean var31;
                        if (var30 == null) {
                            var31 = false;
                        } else {
                            label107: {
                                try {
                                    new URL(var30);
                                } catch (MalformedURLException var36) {
                                    var31 = false;
                                    break label107;
                                }
                                var31 = true;
                            }
                        }
                        if (!var31) {
                            return 5;
                        }
                        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                            try {
                                Desktop.getDesktop().browse(new URI(var30));
                                return 2;
                            } catch (Exception var35) {
                            }
                        }
                        if (class115.field1787.startsWith("win")) {
                            class115.method956(var30, 0, "openjs");
                        } else if (class115.field1787.startsWith("mac")) {
                            class115.method956(var30, 1, "openjs");
                        } else {
                            class115.method956(var30, 2, "openjs");
                        }
                        return 2;
                    }
                }
                var27.field2087 += var28;
            } while (var27.field2087 < 1000);
            return 5;
        } catch (Throwable var37) {
            var37.printStackTrace();
            return 5;
        }
    }
}
