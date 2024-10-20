package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cx")
public class class87 {

    @ObfuscatedName("cx.h")
    public static final BigInteger field1304 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cx.d")
    public static final BigInteger field1308 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class87() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eb.n(B)J")
    public static long method2741() {
        try {
            URL var0 = new URL(client.method1445("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2528, var4.field2529, 1000 - var4.field2529);
                if (var5 == -1) {
                    var4.field2529 = 0;
                    return var4.method3027();
                }
                var4.field2529 += var5;
            } while (var4.field2529 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("bf.v(JLjava/lang/String;I)I")
    public static final int method1040(long arg0, String arg1) {
        Random var3 = new Random();
        class185 var4 = new class185(128);
        class185 var5 = new class185(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method3157(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method3005(var3.nextInt());
        }
        var4.method3005(var6[0]);
        var4.method3005(var6[1]);
        var4.method3010(arg0);
        var4.method3010(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method3005(var3.nextInt());
        }
        var4.method3192(field1304, field1308);
        var5.method3157(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method3005(var3.nextInt());
        }
        var5.method3010(var3.nextLong());
        var5.method3009(var3.nextLong());
        if (client.field1122 == null) {
            byte[] var10 = class158.method42();
            var5.method3147(var10, 0, var10.length);
        } else {
            var5.method3147(client.field1122, 0, client.field1122.length);
        }
        var5.method3010(var3.nextLong());
        var5.method3192(field1304, field1308);
        int var11 = class185.method166(arg1);
        if (var11 % 8 != 0) {
            var11 += 8 - var11 % 8;
        }
        class185 var12 = new class185(var11);
        var12.method3012(arg1);
        var12.field2529 = var11;
        var12.method3039(var6);
        class185 var13 = new class185(var12.field2529 + var5.field2529 + var4.field2529 + 5);
        var13.method3157(2);
        var13.method3157(var4.field2529);
        var13.method3147(var4.field2528, 0, var4.field2529);
        var13.method3157(var5.field2529);
        var13.method3147(var5.field2528, 0, var5.field2529);
        var13.method3006(var12.field2529);
        var13.method3147(var12.field2528, 0, var12.field2529);
        String var14 = class281.method3676(var13.field2528);
        try {
            URL var15 = new URL(client.method1445("services", false) + "m=accountappeal/login.ws");
            URLConnection var16 = var15.openConnection();
            var16.setDoInput(true);
            var16.setDoOutput(true);
            var16.setConnectTimeout(5000);
            OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
            var17.write("data2=" + class307.method4324(var14) + "&dest=" + class307.method4324("passwordchoice.ws"));
            var17.flush();
            InputStream var18 = var16.getInputStream();
            class185 var19 = new class185(new byte[1000]);
            do {
                int var20 = var18.read(var19.field2528, var19.field2529, 1000 - var19.field2529);
                if (var20 == -1) {
                    var17.close();
                    var18.close();
                    String var21 = new String(var19.field2528);
                    if (var21.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var21.startsWith("WRONG")) {
                        return 7;
                    } else if (var21.startsWith("RELOAD")) {
                        return 3;
                    } else if (var21.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var19.method3040(var6);
                        while (var19.field2529 > 0 && var19.field2528[var19.field2529 - 1] == 0) {
                            var19.field2529--;
                        }
                        String var22 = new String(var19.field2528, 0, var19.field2529);
                        if (method1489(var22)) {
                            class57.method2716(var22, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var19.field2529 += var20;
            } while (var19.field2529 < 1000);
            return 5;
        } catch (Throwable var24) {
            var24.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("ch.y(Ljava/lang/String;I)Z")
    public static boolean method1489(String arg0) {
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
