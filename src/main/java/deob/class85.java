package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ca")
public class class85 {

    @ObfuscatedName("ca.j")
    public static final BigInteger field1263 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("ca.a")
    public static final BigInteger field1264 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class85() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bh.p(I)J")
    public static long method1542() {
        try {
            URL var0 = new URL(client.method3408("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2491, var4.field2488, 1000 - var4.field2488);
                if (var5 == -1) {
                    var4.field2488 = 0;
                    return var4.method3128();
                }
                var4.field2488 += var5;
            } while (var4.field2488 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("dg.i(JLjava/lang/String;B)I")
    public static final int method2367(long arg0, String arg1) {
        Random var3 = new Random();
        class185 var4 = new class185(128);
        class185 var5 = new class185(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method3107(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method3110(var3.nextInt());
        }
        var4.method3110(var6[0]);
        var4.method3110(var6[1]);
        var4.method3290(arg0);
        var4.method3290(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method3110(var3.nextInt());
        }
        var4.method3108(field1263, field1264);
        var5.method3107(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method3110(var3.nextInt());
        }
        var5.method3290(var3.nextLong());
        var5.method3219(var3.nextLong());
        if (client.field1016 == null) {
            byte[] var10 = new byte[24];
            try {
                class158.field2124.method2276(0L);
                class158.field2124.method2280(var10);
                int var11;
                for (var11 = 0; var11 < 24 && var10[var11] == 0; var11++) {
                }
                if (var11 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var33) {
                for (int var13 = 0; var13 < 24; var13++) {
                    var10[var13] = -1;
                }
            }
            var5.method3117(var10, 0, var10.length);
        } else {
            var5.method3117(client.field1016, 0, client.field1016.length);
        }
        var5.method3290(var3.nextLong());
        var5.method3108(field1263, field1264);
        int var16 = class185.method1722(arg1);
        if (var16 % 8 != 0) {
            var16 += 8 - var16 % 8;
        }
        class185 var17 = new class185(var16);
        var17.method3189(arg1);
        var17.field2488 = var16;
        var17.method3140(var6);
        class185 var18 = new class185(var17.field2488 + var5.field2488 + var4.field2488 + 5);
        var18.method3107(2);
        var18.method3107(var4.field2488);
        var18.method3117(var4.field2491, 0, var4.field2488);
        var18.method3107(var5.field2488);
        var18.method3117(var5.field2491, 0, var5.field2488);
        var18.method3250(var17.field2488);
        var18.method3117(var17.field2491, 0, var17.field2488);
        String var19 = class293.method1875(var18.field2491);
        try {
            URL var20 = new URL(client.method3408("services", false) + "m=accountappeal/login.ws");
            URLConnection var21 = var20.openConnection();
            var21.setDoInput(true);
            var21.setDoOutput(true);
            var21.setConnectTimeout(5000);
            OutputStreamWriter var22 = new OutputStreamWriter(var21.getOutputStream());
            var22.write("data2=" + class318.method958(var19) + "&dest=" + class318.method958("passwordchoice.ws"));
            var22.flush();
            InputStream var23 = var21.getInputStream();
            class185 var24 = new class185(new byte[1000]);
            do {
                int var25 = var23.read(var24.field2491, var24.field2488, 1000 - var24.field2488);
                if (var25 == -1) {
                    var22.close();
                    var23.close();
                    String var26 = new String(var24.field2491);
                    if (var26.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var26.startsWith("WRONG")) {
                        return 7;
                    } else if (var26.startsWith("RELOAD")) {
                        return 3;
                    } else if (var26.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var24.method3141(var6);
                        while (var24.field2488 > 0 && var24.field2491[var24.field2488 - 1] == 0) {
                            var24.field2488--;
                        }
                        String var27 = new String(var24.field2491, 0, var24.field2488);
                        boolean var28;
                        if (var27 == null) {
                            var28 = false;
                        } else {
                            label90: {
                                try {
                                    new URL(var27);
                                } catch (MalformedURLException var31) {
                                    var28 = false;
                                    break label90;
                                }
                                var28 = true;
                            }
                        }
                        if (var28) {
                            class57.method145(var27, true, "openjs", false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var24.field2488 += var25;
            } while (var24.field2488 < 1000);
            return 5;
        } catch (Throwable var32) {
            var32.printStackTrace();
            return 5;
        }
    }
}
