package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("bt")
public class class53 {

    @ObfuscatedName("bt.l")
    public static final BigInteger field776 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("bt.n")
    public static final BigInteger field773 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class53() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.s(JLjava/lang/String;B)I")
    public static final int method1292(long arg0, String arg1) {
        Random var3 = new Random();
        class385 var4 = new class385(128);
        class385 var5 = new class385(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method5941(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method5944(var3.nextInt());
        }
        var4.method5944(var6[0]);
        var4.method5944(var6[1]);
        var4.method5946(arg0);
        var4.method5946(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method5944(var3.nextInt());
        }
        var4.method5981(field776, field773);
        var5.method5941(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method5944(var3.nextInt());
        }
        var5.method5946(var3.nextLong());
        var5.method6033(var3.nextLong());
        client.method2494(var5);
        var5.method5946(var3.nextLong());
        var5.method5981(field776, field773);
        int var10 = class385.method4571(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class385 var11 = new class385(var10);
        var11.method5948(arg1);
        var11.field4182 = var10;
        var11.method5942(var6);
        class385 var12 = new class385(var11.field4182 + var5.field4182 + var4.field4182 + 5);
        var12.method5941(2);
        var12.method5941(var4.field4182);
        var12.method6013(var4.field4184, 0, var4.field4182);
        var12.method5941(var5.field4182);
        var12.method6013(var5.field4184, 0, var5.field4182);
        var12.method6132(var11.field4182);
        var12.method6013(var11.field4184, 0, var11.field4182);
        byte[] var13 = var12.field4184;
        int var14 = var13.length;
        StringBuilder var15 = new StringBuilder();
        for (int var16 = 0; var16 < var14; var16 += 3) {
            int var17 = var13[var16] & 0xFF;
            var15.append(class305.field3756[var17 >>> 2]);
            if (var16 < var14 - 1) {
                int var18 = var13[var16 + 1] & 0xFF;
                var15.append(class305.field3756[(var17 & 0x3) << 4 | var18 >>> 4]);
                if (var16 < var14 - 2) {
                    int var19 = var13[var16 + 2] & 0xFF;
                    var15.append(class305.field3756[(var18 & 0xF) << 2 | var19 >>> 6]).append(class305.field3756[var19 & 0x3F]);
                } else {
                    var15.append(class305.field3756[(var18 & 0xF) << 2]).append("=");
                }
            } else {
                var15.append(class305.field3756[(var17 & 0x3) << 4]).append("==");
            }
        }
        String var20 = var15.toString();
        String var22 = var20;
        try {
            URL var23 = new URL(client.method2055("services", false) + "m=accountappeal/login.ws");
            URLConnection var24 = var23.openConnection();
            var24.setDoInput(true);
            var24.setDoOutput(true);
            var24.setConnectTimeout(5000);
            OutputStreamWriter var25 = new OutputStreamWriter(var24.getOutputStream());
            var25.write("data2=" + class408.method2373(var22) + "&dest=" + class408.method2373("passwordchoice.ws"));
            var25.flush();
            InputStream var26 = var24.getInputStream();
            class385 var27 = new class385(new byte[1000]);
            do {
                int var28 = var26.read(var27.field4184, var27.field4182, 1000 - var27.field4182);
                if (var28 == -1) {
                    var25.close();
                    var26.close();
                    String var29 = new String(var27.field4184);
                    if (var29.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var29.startsWith("WRONG")) {
                        return 7;
                    } else if (var29.startsWith("RELOAD")) {
                        return 3;
                    } else if (var29.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var27.method5978(var6);
                        while (var27.field4182 > 0 && var27.field4184[var27.field4182 - 1] == 0) {
                            var27.field4182--;
                        }
                        String var30 = new String(var27.field4184, 0, var27.field4182);
                        boolean var31;
                        if (var30 == null) {
                            var31 = false;
                        } else {
                            label87: {
                                try {
                                    new URL(var30);
                                } catch (MalformedURLException var34) {
                                    var31 = false;
                                    break label87;
                                }
                                var31 = true;
                            }
                        }
                        if (var31) {
                            Statics.method2388(var30, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var27.field4182 += var28;
            } while (var27.field4182 < 1000);
            return 5;
        } catch (Throwable var35) {
            var35.printStackTrace();
            return 5;
        }
    }
}
