package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("bn")
public class class75 {

    @ObfuscatedName("bn.c")
    public static final BigInteger field1105 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("bn.l")
    public static final BigInteger field1110 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class75() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jj.g(I)J")
    public static long method4814() {
        try {
            URL var0 = new URL(Statics.method1030("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2405, var4.field2406, 1000 - var4.field2406);
                if (var5 == -1) {
                    var4.field2406 = 0;
                    return var4.method3471();
                }
                var4.field2406 += var5;
            } while (var4.field2406 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("dt.r(JLjava/lang/String;I)I")
    public static final int method2566(long arg0, String arg1) {
        Random var3 = new Random();
        class185 var4 = new class185(128);
        class185 var5 = new class185(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method3501(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method3617(var3.nextInt());
        }
        var4.method3617(var6[0]);
        var4.method3617(var6[1]);
        var4.method3454(arg0);
        var4.method3454(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method3617(var3.nextInt());
        }
        var4.method3557(field1105, field1110);
        var5.method3501(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method3617(var3.nextInt());
        }
        var5.method3454(var3.nextLong());
        var5.method3453(var3.nextLong());
        client.method4615(var5);
        var5.method3454(var3.nextLong());
        var5.method3557(field1105, field1110);
        int var10 = class185.method2245(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class185 var11 = new class185(var10);
        var11.method3585(arg1);
        var11.field2406 = var10;
        var11.method3484(var6);
        class185 var12 = new class185(var11.field2406 + var5.field2406 + var4.field2406 + 5);
        var12.method3501(2);
        var12.method3501(var4.field2406);
        var12.method3459(var4.field2405, 0, var4.field2406);
        var12.method3501(var5.field2406);
        var12.method3459(var5.field2405, 0, var5.field2406);
        var12.method3450(var11.field2406);
        var12.method3459(var11.field2405, 0, var11.field2406);
        byte[] var13 = var12.field2405;
        String var14 = class307.method2040(var13, 0, var13.length);
        String var15 = var14;
        try {
            URL var16 = new URL(Statics.method1030("services", false) + "m=accountappeal/login.ws");
            URLConnection var17 = var16.openConnection();
            var17.setDoInput(true);
            var17.setDoOutput(true);
            var17.setConnectTimeout(5000);
            OutputStreamWriter var18 = new OutputStreamWriter(var17.getOutputStream());
            var18.write("data2=" + Statics.method1878(var15) + "&dest=" + Statics.method1878("passwordchoice.ws"));
            var18.flush();
            InputStream var19 = var17.getInputStream();
            class185 var20 = new class185(new byte[1000]);
            do {
                int var21 = var19.read(var20.field2405, var20.field2406, 1000 - var20.field2406);
                if (var21 == -1) {
                    var18.close();
                    var19.close();
                    String var22 = new String(var20.field2405);
                    if (var22.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var22.startsWith("WRONG")) {
                        return 7;
                    } else if (var22.startsWith("RELOAD")) {
                        return 3;
                    } else if (var22.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var20.method3614(var6);
                        while (var20.field2406 > 0 && var20.field2405[var20.field2406 - 1] == 0) {
                            var20.field2406--;
                        }
                        String var23 = new String(var20.field2405, 0, var20.field2406);
                        if (method1139(var23)) {
                            class46.method3067(var23, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var20.field2406 += var21;
            } while (var20.field2406 < 1000);
            return 5;
        } catch (Throwable var25) {
            var25.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("bk.e(Ljava/lang/String;I)Z")
    public static boolean method1139(String arg0) {
        if (arg0 == null) {
            return false;
        }
        try {
            new URL(arg0);
            return true;
        } catch (MalformedURLException var2) {
            return false;
        }
    }
}
