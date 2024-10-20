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

    @ObfuscatedName("cm.e")
    public static final BigInteger field1348 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cm.f")
    public static final BigInteger field1349 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class88() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.d(I)J")
    public static long method4() {
        try {
            URL var0 = new URL(client.method1016("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2367, var4.field2364, 1000 - var4.field2364);
                if (var5 == -1) {
                    var4.field2364 = 0;
                    return var4.method2920();
                }
                var4.field2364 += var5;
            } while (var4.field2364 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("jm.q(JLjava/lang/String;I)I")
    public static final int method4519(long arg0, String arg1) {
        Random var3 = new Random();
        class174 var4 = new class174(128);
        class174 var5 = new class174(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2899(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2902(var3.nextInt());
        }
        var4.method2902(var6[0]);
        var4.method2902(var6[1]);
        var4.method2946(arg0);
        var4.method2946(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2902(var3.nextInt());
        }
        var4.method2961(field1348, field1349);
        var5.method2899(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2902(var3.nextInt());
        }
        var5.method2946(var3.nextLong());
        var5.method2979(var3.nextLong());
        client.method996(var5);
        var5.method2946(var3.nextLong());
        var5.method2961(field1348, field1349);
        int var10 = Statics.method2363(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class174 var11 = new class174(var10);
        var11.method2905(arg1);
        var11.field2364 = var10;
        var11.method2931(var6);
        class174 var12 = new class174(var11.field2364 + var5.field2364 + var4.field2364 + 5);
        var12.method2899(2);
        var12.method2899(var4.field2364);
        var12.method3036(var4.field2367, 0, var4.field2364);
        var12.method2899(var5.field2364);
        var12.method3036(var5.field2367, 0, var5.field2364);
        var12.method2900(var11.field2364);
        var12.method3036(var11.field2367, 0, var11.field2364);
        String var13 = class270.method3845(var12.field2367);
        try {
            URL var14 = new URL(client.method1016("services", false) + "m=accountappeal/login.ws");
            URLConnection var15 = var14.openConnection();
            var15.setDoInput(true);
            var15.setDoOutput(true);
            var15.setConnectTimeout(5000);
            OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
            var16.write("data2=" + class294.method1029(var13) + "&dest=" + class294.method1029("passwordchoice.ws"));
            var16.flush();
            InputStream var17 = var15.getInputStream();
            class174 var18 = new class174(new byte[1000]);
            do {
                int var19 = var17.read(var18.field2367, var18.field2364, 1000 - var18.field2364);
                if (var19 == -1) {
                    var16.close();
                    var17.close();
                    String var20 = new String(var18.field2367);
                    if (var20.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var20.startsWith("WRONG")) {
                        return 7;
                    } else if (var20.startsWith("RELOAD")) {
                        return 3;
                    } else if (var20.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var18.method2932(var6);
                        while (var18.field2364 > 0 && var18.field2367[var18.field2364 - 1] == 0) {
                            var18.field2364--;
                        }
                        String var21 = new String(var18.field2367, 0, var18.field2364);
                        boolean var22;
                        if (var21 == null) {
                            var22 = false;
                        } else {
                            label73: {
                                try {
                                    new URL(var21);
                                } catch (MalformedURLException var25) {
                                    var22 = false;
                                    break label73;
                                }
                                var22 = true;
                            }
                        }
                        if (var22) {
                            class57.method1708(var21, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var18.field2364 += var19;
            } while (var18.field2364 < 1000);
            return 5;
        } catch (Throwable var26) {
            var26.printStackTrace();
            return 5;
        }
    }
}
