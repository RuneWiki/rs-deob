package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cr")
public class class86 {

    @ObfuscatedName("cr.g")
    public static final BigInteger field1369 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cr.v")
    public static final BigInteger field1373 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("af.w(I)J")
    public static long method206() {
        try {
            URL var0 = new URL(client.method60("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2389, var4.field2390, 1000 - var4.field2390);
                if (var5 == -1) {
                    var4.field2390 = 0;
                    return var4.method2977();
                }
                var4.field2390 += var5;
            } while (var4.field2390 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("iz.s(JLjava/lang/String;I)I")
    public static final int method4084(long arg0, String arg1) {
        Random var3 = new Random();
        class174 var4 = new class174(128);
        class174 var5 = new class174(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2955(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method3072(var3.nextInt());
        }
        var4.method3072(var6[0]);
        var4.method3072(var6[1]);
        var4.method2960(arg0);
        var4.method2960(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method3072(var3.nextInt());
        }
        var4.method3191(field1369, field1373);
        var5.method2955(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method3072(var3.nextInt());
        }
        var5.method2960(var3.nextLong());
        var5.method2959(var3.nextLong());
        if (client.field943 == null) {
            byte[] var10 = class156.method4200();
            var5.method2965(var10, 0, var10.length);
        } else {
            var5.method2965(client.field943, 0, client.field943.length);
        }
        var5.method2960(var3.nextLong());
        var5.method3191(field1369, field1373);
        int var11 = class174.method1591(arg1);
        if (var11 % 8 != 0) {
            var11 += 8 - var11 % 8;
        }
        class174 var12 = new class174(var11);
        var12.method3117(arg1);
        var12.field2390 = var11;
        var12.method2989(var6);
        class174 var13 = new class174(var12.field2390 + var5.field2390 + var4.field2390 + 5);
        var13.method2955(2);
        var13.method2955(var4.field2390);
        var13.method2965(var4.field2389, 0, var4.field2390);
        var13.method2955(var5.field2390);
        var13.method2965(var5.field2389, 0, var5.field2390);
        var13.method2956(var12.field2390);
        var13.method2965(var12.field2389, 0, var12.field2390);
        String var14 = class270.method1744(var13.field2389);
        try {
            URL var15 = new URL(client.method60("services", false) + "m=accountappeal/login.ws");
            URLConnection var16 = var15.openConnection();
            var16.setDoInput(true);
            var16.setDoOutput(true);
            var16.setConnectTimeout(5000);
            OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
            var17.write("data2=" + class295.method2875(var14) + "&dest=" + class295.method2875("passwordchoice.ws"));
            var17.flush();
            InputStream var18 = var16.getInputStream();
            class174 var19 = new class174(new byte[1000]);
            do {
                int var20 = var18.read(var19.field2389, var19.field2390, 1000 - var19.field2390);
                if (var20 == -1) {
                    var17.close();
                    var18.close();
                    String var21 = new String(var19.field2389);
                    if (var21.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var21.startsWith("WRONG")) {
                        return 7;
                    } else if (var21.startsWith("RELOAD")) {
                        return 3;
                    } else if (var21.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var19.method2990(var6);
                        while (var19.field2390 > 0 && var19.field2389[var19.field2390 - 1] == 0) {
                            var19.field2390--;
                        }
                        String var22 = new String(var19.field2389, 0, var19.field2390);
                        boolean var23;
                        if (var22 == null) {
                            var23 = false;
                        } else {
                            label77: {
                                try {
                                    new URL(var22);
                                } catch (MalformedURLException var26) {
                                    var23 = false;
                                    break label77;
                                }
                                var23 = true;
                            }
                        }
                        if (var23) {
                            class57.method2765(var22, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var19.field2390 += var20;
            } while (var19.field2390 < 1000);
            return 5;
        } catch (Throwable var27) {
            var27.printStackTrace();
            return 5;
        }
    }
}
