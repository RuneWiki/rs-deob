package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("bx")
public class class66 {

    @ObfuscatedName("bx.c")
    public static final BigInteger field850 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("bx.q")
    public static final BigInteger field851 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class66() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hd.s(JLjava/lang/String;I)I")
    public static final int method4436(long arg0, String arg1) {
        Random var3 = new Random();
        class444 var4 = new class444(128);
        class444 var5 = new class444(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method6912(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method6915(var3.nextInt());
        }
        var4.method6915(var6[0]);
        var4.method6915(var6[1]);
        var4.method7068(arg0);
        var4.method7068(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method6915(var3.nextInt());
        }
        var4.method6955(field850, field851);
        var5.method6912(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method6915(var3.nextInt());
        }
        var5.method7068(var3.nextLong());
        var5.method6916(var3.nextLong());
        if (client.field530 == null) {
            byte[] var10 = new byte[24];
            try {
                class158.field1732.method6732(0L);
                class158.field1732.method6736(var10);
                int var11;
                for (var11 = 0; var11 < 24 && var10[var11] == 0; var11++) {
                }
                if (var11 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var35) {
                for (int var13 = 0; var13 < 24; var13++) {
                    var10[var13] = -1;
                }
            }
            var5.method6922(var10, 0, var10.length);
        } else {
            var5.method6922(client.field530, 0, client.field530.length);
        }
        var5.method7068(var3.nextLong());
        var5.method6955(field850, field851);
        int var16 = class444.method5118(arg1);
        if (var16 % 8 != 0) {
            var16 += 8 - var16 % 8;
        }
        class444 var17 = new class444(var16);
        var17.method6950(arg1);
        var17.field4708 = var16;
        var17.method7125(var6);
        class444 var18 = new class444(var17.field4708 + var5.field4708 + var4.field4708 + 5);
        var18.method6912(2);
        var18.method6912(var4.field4708);
        var18.method6922(var4.field4707, 0, var4.field4708);
        var18.method6912(var5.field4708);
        var18.method6922(var5.field4707, 0, var5.field4708);
        var18.method6913(var17.field4708);
        var18.method6922(var17.field4707, 0, var17.field4708);
        byte[] var19 = var18.field4707;
        String var20 = class343.method5379(var19, 0, var19.length);
        String var21 = var20;
        try {
            URL var22 = new URL(Statics.method5412("services", false) + "m=accountappeal/login.ws");
            URLConnection var23 = var22.openConnection();
            var23.setDoInput(true);
            var23.setDoOutput(true);
            var23.setConnectTimeout(5000);
            OutputStreamWriter var24 = new OutputStreamWriter(var23.getOutputStream());
            var24.write("data2=" + class467.method103(var21) + "&dest=" + class467.method103("passwordchoice.ws"));
            var24.flush();
            InputStream var25 = var23.getInputStream();
            class444 var26 = new class444(new byte[1000]);
            do {
                int var27 = var25.read(var26.field4707, var26.field4708, 1000 - var26.field4708);
                if (var27 == -1) {
                    var24.close();
                    var25.close();
                    String var28 = new String(var26.field4707);
                    if (var28.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var28.startsWith("WRONG")) {
                        return 7;
                    } else if (var28.startsWith("RELOAD")) {
                        return 3;
                    } else if (var28.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var26.method6952(var6);
                        while (var26.field4708 > 0 && var26.field4707[var26.field4708 - 1] == 0) {
                            var26.field4708--;
                        }
                        String var29 = new String(var26.field4707, 0, var26.field4708);
                        boolean var30;
                        if (var29 == null) {
                            var30 = false;
                        } else {
                            label90: {
                                try {
                                    new URL(var29);
                                } catch (MalformedURLException var33) {
                                    var30 = false;
                                    break label90;
                                }
                                var30 = true;
                            }
                        }
                        if (var30) {
                            class30.method6381(var29, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var26.field4708 += var27;
            } while (var26.field4708 < 1000);
            return 5;
        } catch (Throwable var34) {
            var34.printStackTrace();
            return 5;
        }
    }
}
