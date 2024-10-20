package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cr")
public class class81 {

    @ObfuscatedName("cr.i")
    public static final BigInteger field1124 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cr.g")
    public static final BigInteger field1121 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class81() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aj.c(B)J")
    public static long method505() {
        try {
            URL var0 = new URL(client.method663("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class301 var4 = new class301(new byte[1000]);
            do {
                int var5 = var3.read(var4.field3708, var4.field3707, 1000 - var4.field3707);
                if (var5 == -1) {
                    var4.field3707 = 0;
                    return var4.method5311();
                }
                var4.field3707 += var5;
            } while (var4.field3707 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("br.t(JLjava/lang/String;I)I")
    public static final int method1887(long arg0, String arg1) {
        Random var3 = new Random();
        class301 var4 = new class301(128);
        class301 var5 = new class301(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method5272(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method5306(var3.nextInt());
        }
        var4.method5306(var6[0]);
        var4.method5306(var6[1]);
        var4.method5118(arg0);
        var4.method5118(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method5306(var3.nextInt());
        }
        var4.method5152(field1124, field1121);
        var5.method5272(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method5306(var3.nextInt());
        }
        var5.method5118(var3.nextLong());
        var5.method5117(var3.nextLong());
        if (client.field894 == null) {
            byte[] var10 = new byte[24];
            try {
                class168.field2040.method6114(0L);
                class168.field2040.method6101(var10);
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
            var5.method5211(var10, 0, var10.length);
        } else {
            var5.method5211(client.field894, 0, client.field894.length);
        }
        var5.method5118(var3.nextLong());
        var5.method5152(field1124, field1121);
        int var16 = class301.method4819(arg1);
        if (var16 % 8 != 0) {
            var16 += 8 - var16 % 8;
        }
        class301 var17 = new class301(var16);
        var17.method5310(arg1);
        var17.field3707 = var16;
        var17.method5148(var6);
        class301 var18 = new class301(var17.field3707 + var5.field3707 + var4.field3707 + 5);
        var18.method5272(2);
        var18.method5272(var4.field3707);
        var18.method5211(var4.field3708, 0, var4.field3707);
        var18.method5272(var5.field3707);
        var18.method5211(var5.field3708, 0, var5.field3707);
        var18.method5114(var17.field3707);
        var18.method5211(var17.field3708, 0, var17.field3707);
        String var19 = Statics.method3068(var18.field3708);
        try {
            URL var20 = new URL(client.method663("services", false) + "m=accountappeal/login.ws");
            URLConnection var21 = var20.openConnection();
            var21.setDoInput(true);
            var21.setDoOutput(true);
            var21.setConnectTimeout(5000);
            OutputStreamWriter var22 = new OutputStreamWriter(var21.getOutputStream());
            var22.write("data2=" + class341.method3831(var19) + "&dest=" + class341.method3831("passwordchoice.ws"));
            var22.flush();
            InputStream var23 = var21.getInputStream();
            class301 var24 = new class301(new byte[1000]);
            do {
                int var25 = var23.read(var24.field3708, var24.field3707, 1000 - var24.field3707);
                if (var25 == -1) {
                    var22.close();
                    var23.close();
                    String var26 = new String(var24.field3708);
                    if (var26.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var26.startsWith("WRONG")) {
                        return 7;
                    } else if (var26.startsWith("RELOAD")) {
                        return 3;
                    } else if (var26.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var24.method5111(var6);
                        while (var24.field3707 > 0 && var24.field3708[var24.field3707 - 1] == 0) {
                            var24.field3707--;
                        }
                        String var27 = new String(var24.field3708, 0, var24.field3707);
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
                            class52.method3723(var27, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var24.field3707 += var25;
            } while (var24.field3707 < 1000);
            return 5;
        } catch (Throwable var32) {
            var32.printStackTrace();
            return 5;
        }
    }
}
