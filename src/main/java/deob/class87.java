package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ce")
public class class87 {

    @ObfuscatedName("ce.u")
    public static final BigInteger field1276 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("ce.z")
    public static final BigInteger field1275 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class87() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("av.a(B)J")
    public static long method542() {
        try {
            URL var0 = new URL(client.method156("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class185 var4 = new class185(new byte[1000]);
            do {
                int var5 = var3.read(var4.field2512, var4.field2509, 1000 - var4.field2509);
                if (var5 == -1) {
                    var4.field2509 = 0;
                    return var4.method2974();
                }
                var4.field2509 += var5;
            } while (var4.field2509 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("jl.w(JLjava/lang/String;B)I")
    public static final int method4495(long arg0, String arg1) {
        Random var3 = new Random();
        class185 var4 = new class185(128);
        class185 var5 = new class185(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2946(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2949(var3.nextInt());
        }
        var4.method2949(var6[0]);
        var4.method2949(var6[1]);
        var4.method2951(arg0);
        var4.method2951(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2949(var3.nextInt());
        }
        var4.method2960(field1276, field1275);
        var5.method2946(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2949(var3.nextInt());
        }
        var5.method2951(var3.nextLong());
        var5.method2950(var3.nextLong());
        if (client.field1035 == null) {
            byte[] var10 = new byte[24];
            try {
                class158.field2141.method2114(0L);
                class158.field2141.method2113(var10);
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
            var5.method2964(var10, 0, var10.length);
        } else {
            var5.method2964(client.field1035, 0, client.field1035.length);
        }
        var5.method2951(var3.nextLong());
        var5.method2960(field1276, field1275);
        int var16 = class185.method960(arg1);
        if (var16 % 8 != 0) {
            var16 += 8 - var16 % 8;
        }
        class185 var17 = new class185(var16);
        var17.method3106(arg1);
        var17.field2509 = var16;
        var17.method2979(var6);
        class185 var18 = new class185(var17.field2509 + var5.field2509 + var4.field2509 + 5);
        var18.method2946(2);
        var18.method2946(var4.field2509);
        var18.method2964(var4.field2512, 0, var4.field2509);
        var18.method2946(var5.field2509);
        var18.method2964(var5.field2512, 0, var5.field2509);
        var18.method2944(var17.field2509);
        var18.method2964(var17.field2512, 0, var17.field2509);
        byte[] var19 = var18.field2512;
        String var20 = class281.method40(var19, 0, var19.length);
        String var21 = var20;
        try {
            URL var22 = new URL(client.method156("services", false) + "m=accountappeal/login.ws");
            URLConnection var23 = var22.openConnection();
            var23.setDoInput(true);
            var23.setDoOutput(true);
            var23.setConnectTimeout(5000);
            OutputStreamWriter var24 = new OutputStreamWriter(var23.getOutputStream());
            var24.write("data2=" + class307.method73(var21) + "&dest=" + class307.method73("passwordchoice.ws"));
            var24.flush();
            InputStream var25 = var23.getInputStream();
            class185 var26 = new class185(new byte[1000]);
            do {
                int var27 = var25.read(var26.field2512, var26.field2509, 1000 - var26.field2509);
                if (var27 == -1) {
                    var24.close();
                    var25.close();
                    String var28 = new String(var26.field2512);
                    if (var28.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var28.startsWith("WRONG")) {
                        return 7;
                    } else if (var28.startsWith("RELOAD")) {
                        return 3;
                    } else if (var28.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var26.method2980(var6);
                        while (var26.field2509 > 0 && var26.field2512[var26.field2509 - 1] == 0) {
                            var26.field2509--;
                        }
                        String var29 = new String(var26.field2512, 0, var26.field2509);
                        boolean var30;
                        if (var29 == null) {
                            var30 = false;
                        } else {
                            label110: {
                                try {
                                    new URL(var29);
                                } catch (MalformedURLException var35) {
                                    var30 = false;
                                    break label110;
                                }
                                var30 = true;
                            }
                        }
                        if (!var30) {
                            return 5;
                        }
                        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                            try {
                                Desktop.getDesktop().browse(new URI(var29));
                                return 2;
                            } catch (Exception var34) {
                            }
                        }
                        if (class57.field622.startsWith("win")) {
                            class57.method667(var29, 0);
                        } else if (class57.field622.startsWith("mac")) {
                            class57.method456(var29, 1, "openjs");
                        } else {
                            class57.method667(var29, 2);
                        }
                        return 2;
                    }
                }
                var26.field2509 += var27;
            } while (var26.field2509 < 1000);
            return 5;
        } catch (Throwable var36) {
            var36.printStackTrace();
            return 5;
        }
    }
}
