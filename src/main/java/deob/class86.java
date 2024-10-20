package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cu")
public class class86 {

    @ObfuscatedName("cu.n")
    public static final BigInteger field1301 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cu.l")
    public static final BigInteger field1302 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bp.g(JLjava/lang/String;B)I")
    public static final int method784(long arg0, String arg1) {
        Random var3 = new Random();
        class195 var4 = new class195(128);
        class195 var5 = new class195(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method3363(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method3319(var3.nextInt());
        }
        var4.method3319(var6[0]);
        var4.method3319(var6[1]);
        var4.method3298(arg0);
        var4.method3298(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method3319(var3.nextInt());
        }
        var4.method3330(field1301, field1302);
        var5.method3363(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method3319(var3.nextInt());
        }
        var5.method3298(var3.nextLong());
        var5.method3297(var3.nextLong());
        client.method2571(var5);
        var5.method3298(var3.nextLong());
        var5.method3330(field1301, field1302);
        int var10 = class195.method1963(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class195 var11 = new class195(var10);
        var11.method3300(arg1);
        var11.field2562 = var10;
        var11.method3501(var6);
        class195 var12 = new class195(var11.field2562 + var5.field2562 + var4.field2562 + 5);
        var12.method3363(2);
        var12.method3363(var4.field2562);
        var12.method3504(var4.field2563, 0, var4.field2562);
        var12.method3363(var5.field2562);
        var12.method3504(var5.field2563, 0, var5.field2562);
        var12.method3476(var11.field2562);
        var12.method3504(var11.field2563, 0, var11.field2562);
        byte[] var13 = var12.field2563;
        String var14 = class318.method1082(var13, 0, var13.length);
        String var15 = var14;
        try {
            URL var16 = new URL(client.method4403("services", false) + "m=accountappeal/login.ws");
            URLConnection var17 = var16.openConnection();
            var17.setDoInput(true);
            var17.setDoOutput(true);
            var17.setConnectTimeout(5000);
            OutputStreamWriter var18 = new OutputStreamWriter(var17.getOutputStream());
            var18.write("data2=" + class340.method3034(var15) + "&dest=" + class340.method3034("passwordchoice.ws"));
            var18.flush();
            InputStream var19 = var17.getInputStream();
            class195 var20 = new class195(new byte[1000]);
            do {
                int var21 = var19.read(var20.field2563, var20.field2562, 1000 - var20.field2562);
                if (var21 == -1) {
                    var18.close();
                    var19.close();
                    String var22 = new String(var20.field2563);
                    if (var22.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var22.startsWith("WRONG")) {
                        return 7;
                    } else if (var22.startsWith("RELOAD")) {
                        return 3;
                    } else if (var22.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var20.method3327(var6);
                        while (var20.field2562 > 0 && var20.field2563[var20.field2562 - 1] == 0) {
                            var20.field2562--;
                        }
                        String var23 = new String(var20.field2563, 0, var20.field2562);
                        if (method339(var23)) {
                            class58.method3072(var23, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var20.field2562 += var21;
            } while (var20.field2562 < 1000);
            return 5;
        } catch (Throwable var25) {
            var25.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("ao.e(Ljava/lang/String;B)Z")
    public static boolean method339(String arg0) {
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
