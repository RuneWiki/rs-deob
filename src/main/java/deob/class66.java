package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("bk")
public class class66 {

    @ObfuscatedName("bk.k")
    public static final BigInteger field871 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("bk.w")
    public static final BigInteger field863 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class66() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.c(I)J")
    public static long method624() {
        try {
            URL var0 = new URL(client.method2110("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class445 var4 = new class445(new byte[1000]);
            do {
                int var5 = var3.read(var4.field4733, var4.field4735, 1000 - var4.field4735);
                if (var5 == -1) {
                    var4.field4735 = 0;
                    return var4.method7319();
                }
                var4.field4735 += var5;
            } while (var4.field4735 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("t.p(JLjava/lang/String;I)I")
    public static final int method179(long arg0, String arg1) {
        Random var3 = new Random();
        class445 var4 = new class445(128);
        class445 var5 = new class445(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method7179(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method7364(var3.nextInt());
        }
        var4.method7364(var6[0]);
        var4.method7364(var6[1]);
        var4.method7184(arg0);
        var4.method7184(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method7364(var3.nextInt());
        }
        var4.method7190(field871, field863);
        var5.method7179(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method7364(var3.nextInt());
        }
        var5.method7184(var3.nextLong());
        var5.method7259(var3.nextLong());
        if (client.field546 == null) {
            byte[] var10 = new byte[24];
            try {
                class159.field1764.method6996(0L);
                class159.field1764.method6998(var10);
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
            var5.method7326(var10, 0, var10.length);
        } else {
            var5.method7326(client.field546, 0, client.field546.length);
        }
        var5.method7184(var3.nextLong());
        var5.method7190(field871, field863);
        int var16 = class445.method6110(arg1);
        if (var16 % 8 != 0) {
            var16 += 8 - var16 % 8;
        }
        class445 var17 = new class445(var16);
        var17.method7186(arg1);
        var17.field4735 = var16;
        var17.method7365(var6);
        class445 var18 = new class445(var17.field4735 + var5.field4735 + var4.field4735 + 5);
        var18.method7179(2);
        var18.method7179(var4.field4735);
        var18.method7326(var4.field4733, 0, var4.field4735);
        var18.method7179(var5.field4735);
        var18.method7326(var5.field4733, 0, var5.field4735);
        var18.method7286(var17.field4735);
        var18.method7326(var17.field4733, 0, var17.field4735);
        String var19 = class344.method3668(var18.field4733);
        try {
            URL var20 = new URL(client.method2110("services", false) + "m=accountappeal/login.ws");
            URLConnection var21 = var20.openConnection();
            var21.setDoInput(true);
            var21.setDoOutput(true);
            var21.setConnectTimeout(5000);
            OutputStreamWriter var22 = new OutputStreamWriter(var21.getOutputStream());
            var22.write("data2=" + class468.method7479(var19) + "&dest=" + class468.method7479("passwordchoice.ws"));
            var22.flush();
            InputStream var23 = var21.getInputStream();
            class445 var24 = new class445(new byte[1000]);
            do {
                int var25 = var23.read(var24.field4733, var24.field4735, 1000 - var24.field4735);
                if (var25 == -1) {
                    var22.close();
                    var23.close();
                    String var26 = new String(var24.field4733);
                    if (var26.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var26.startsWith("WRONG")) {
                        return 7;
                    } else if (var26.startsWith("RELOAD")) {
                        return 3;
                    } else if (var26.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var24.method7333(var6);
                        while (var24.field4735 > 0 && var24.field4733[var24.field4735 - 1] == 0) {
                            var24.field4735--;
                        }
                        String var27 = new String(var24.field4733, 0, var24.field4735);
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
                            class30.method3656(var27, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var24.field4735 += var25;
            } while (var24.field4735 < 1000);
            return 5;
        } catch (Throwable var32) {
            var32.printStackTrace();
            return 5;
        }
    }
}
