package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cz")
public class class89 {

    @ObfuscatedName("cz.x")
    public static final BigInteger field1388 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cz.g")
    public static final BigInteger field1389 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class89() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cj.j(I)J")
    public static long method1716() {
        try {
            URL var0 = new URL(client.method1415("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class175 var4 = new class175(new byte[1000]);
            do {
                int var5 = var3.read(var4.field2390, var4.field2394, 1000 - var4.field2394);
                if (var5 == -1) {
                    var4.field2394 = 0;
                    return var4.method2973();
                }
                var4.field2394 += var5;
            } while (var4.field2394 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("q.h(JLjava/lang/String;I)I")
    public static final int method173(long arg0, String arg1) {
        Random var3 = new Random();
        class175 var4 = new class175(128);
        class175 var5 = new class175(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2888(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2891(var3.nextInt());
        }
        var4.method2891(var6[0]);
        var4.method2891(var6[1]);
        var4.method2893(arg0);
        var4.method2893(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2891(var3.nextInt());
        }
        var4.method2924(field1388, field1389);
        var5.method2888(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2891(var3.nextInt());
        }
        var5.method2893(var3.nextLong());
        var5.method2892(var3.nextLong());
        if (client.field972 == null) {
            byte[] var10 = class157.method2817();
            var5.method2897(var10, 0, var10.length);
        } else {
            var5.method2897(client.field972, 0, client.field972.length);
        }
        var5.method2893(var3.nextLong());
        var5.method2924(field1388, field1389);
        int var11 = class175.method2869(arg1);
        if (var11 % 8 != 0) {
            var11 += 8 - var11 % 8;
        }
        class175 var12 = new class175(var11);
        var12.method2894(arg1);
        var12.field2394 = var11;
        var12.method2916(var6);
        class175 var13 = new class175(var12.field2394 + var5.field2394 + var4.field2394 + 5);
        var13.method2888(2);
        var13.method2888(var4.field2394);
        var13.method2897(var4.field2390, 0, var4.field2394);
        var13.method2888(var5.field2394);
        var13.method2897(var5.field2390, 0, var5.field2394);
        var13.method3030(var12.field2394);
        var13.method2897(var12.field2390, 0, var12.field2394);
        byte[] var14 = var13.field2390;
        String var15 = class271.method4079(var14, 0, var14.length);
        String var16 = var15;
        try {
            URL var17 = new URL(client.method1415("services", false) + "m=accountappeal/login.ws");
            URLConnection var18 = var17.openConnection();
            var18.setDoInput(true);
            var18.setDoOutput(true);
            var18.setConnectTimeout(5000);
            OutputStreamWriter var19 = new OutputStreamWriter(var18.getOutputStream());
            var19.write("data2=" + class295.method3163(var16) + "&dest=" + class295.method3163("passwordchoice.ws"));
            var19.flush();
            InputStream var20 = var18.getInputStream();
            class175 var21 = new class175(new byte[1000]);
            do {
                int var22 = var20.read(var21.field2390, var21.field2394, 1000 - var21.field2394);
                if (var22 == -1) {
                    var19.close();
                    var20.close();
                    String var23 = new String(var21.field2390);
                    if (var23.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var23.startsWith("WRONG")) {
                        return 7;
                    } else if (var23.startsWith("RELOAD")) {
                        return 3;
                    } else if (var23.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var21.method2921(var6);
                        while (var21.field2394 > 0 && var21.field2390[var21.field2394 - 1] == 0) {
                            var21.field2394--;
                        }
                        String var24 = new String(var21.field2390, 0, var21.field2394);
                        boolean var25;
                        if (var24 == null) {
                            var25 = false;
                        } else {
                            label77: {
                                try {
                                    new URL(var24);
                                } catch (MalformedURLException var28) {
                                    var25 = false;
                                    break label77;
                                }
                                var25 = true;
                            }
                        }
                        if (var25) {
                            class57.method253(var24, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var21.field2394 += var22;
            } while (var21.field2394 < 1000);
            return 5;
        } catch (Throwable var29) {
            var29.printStackTrace();
            return 5;
        }
    }
}
