package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cm")
public class class88 {

    @ObfuscatedName("cm.s")
    public static final BigInteger field1405 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cm.r")
    public static final BigInteger field1406 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class88() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("im.i(I)J")
    public static long method3908() {
        try {
            URL var0 = new URL(client.method226("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class174 var4 = new class174(new byte[1000]);
            do {
                int var5 = var3.read(var4.field2405, var4.field2399, 1000 - var4.field2399);
                if (var5 == -1) {
                    var4.field2399 = 0;
                    return var4.method2910();
                }
                var4.field2399 += var5;
            } while (var4.field2399 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("ex.w(JLjava/lang/String;I)I")
    public static final int method2352(long arg0, String arg1) {
        Random var3 = new Random();
        class174 var4 = new class174(128);
        class174 var5 = new class174(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2865(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2868(var3.nextInt());
        }
        var4.method2868(var6[0]);
        var4.method2868(var6[1]);
        var4.method2870(arg0);
        var4.method2870(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2868(var3.nextInt());
        }
        var4.method2900(field1405, field1406);
        var5.method2865(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2868(var3.nextInt());
        }
        var5.method2870(var3.nextLong());
        var5.method2869(var3.nextLong());
        client.method1043(var5);
        var5.method2870(var3.nextLong());
        var5.method2900(field1405, field1406);
        int var10 = class174.method4370(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class174 var11 = new class174(var10);
        var11.method2871(arg1);
        var11.field2399 = var10;
        var11.method2897(var6);
        class174 var12 = new class174(var11.field2399 + var5.field2399 + var4.field2399 + 5);
        var12.method2865(2);
        var12.method2865(var4.field2399);
        var12.method2874(var4.field2405, 0, var4.field2399);
        var12.method2865(var5.field2399);
        var12.method2874(var5.field2405, 0, var5.field2399);
        var12.method2990(var11.field2399);
        var12.method2874(var11.field2405, 0, var11.field2399);
        byte[] var13 = var12.field2405;
        int var14 = var13.length;
        StringBuilder var15 = new StringBuilder();
        for (int var16 = 0; var16 < var14; var16 += 3) {
            int var17 = var13[var16] & 0xFF;
            var15.append(class270.field3685[var17 >>> 2]);
            if (var16 < var14 - 1) {
                int var18 = var13[var16 + 1] & 0xFF;
                var15.append(class270.field3685[(var17 & 0x3) << 4 | var18 >>> 4]);
                if (var16 < var14 - 2) {
                    int var19 = var13[var16 + 2] & 0xFF;
                    var15.append(class270.field3685[(var18 & 0xF) << 2 | var19 >>> 6]).append(class270.field3685[var19 & 0x3F]);
                } else {
                    var15.append(class270.field3685[(var18 & 0xF) << 2]).append("=");
                }
            } else {
                var15.append(class270.field3685[(var17 & 0x3) << 4]).append("==");
            }
        }
        String var20 = var15.toString();
        String var22 = var20;
        try {
            URL var23 = new URL(client.method226("services", false) + "m=accountappeal/login.ws");
            URLConnection var24 = var23.openConnection();
            var24.setDoInput(true);
            var24.setDoOutput(true);
            var24.setConnectTimeout(5000);
            OutputStreamWriter var25 = new OutputStreamWriter(var24.getOutputStream());
            var25.write("data2=" + class294.method1557(var22) + "&dest=" + class294.method1557("passwordchoice.ws"));
            var25.flush();
            InputStream var26 = var24.getInputStream();
            class174 var27 = new class174(new byte[1000]);
            do {
                int var28 = var26.read(var27.field2405, var27.field2399, 1000 - var27.field2399);
                if (var28 == -1) {
                    var25.close();
                    var26.close();
                    String var29 = new String(var27.field2405);
                    if (var29.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var29.startsWith("WRONG")) {
                        return 7;
                    } else if (var29.startsWith("RELOAD")) {
                        return 3;
                    } else if (var29.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var27.method2944(var6);
                        while (var27.field2399 > 0 && var27.field2405[var27.field2399 - 1] == 0) {
                            var27.field2399--;
                        }
                        String var30 = new String(var27.field2405, 0, var27.field2399);
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
                            class57.method1066(var30, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var27.field2399 += var28;
            } while (var27.field2399 < 1000);
            return 5;
        } catch (Throwable var35) {
            var35.printStackTrace();
            return 5;
        }
    }
}
