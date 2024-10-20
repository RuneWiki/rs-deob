package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ck")
public class class88 {

    @ObfuscatedName("ck.g")
    public static final BigInteger field1359 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("ck.v")
    public static final BigInteger field1368 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class88() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cl.i(JLjava/lang/String;I)I")
    public static final int method1594(long arg0, String arg1) {
        Random var3 = new Random();
        class174 var4 = new class174(128);
        class174 var5 = new class174(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method3031(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2919(var3.nextInt());
        }
        var4.method2919(var6[0]);
        var4.method2919(var6[1]);
        var4.method2921(arg0);
        var4.method2921(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2919(var3.nextInt());
        }
        var4.method3084(field1359, field1368);
        var5.method3031(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2919(var3.nextInt());
        }
        var5.method2921(var3.nextLong());
        var5.method2950(var3.nextLong());
        if (client.field968 == null) {
            byte[] var10 = class156.method2402();
            var5.method2986(var10, 0, var10.length);
        } else {
            var5.method2986(client.field968, 0, client.field968.length);
        }
        var5.method2921(var3.nextLong());
        var5.method3084(field1359, field1368);
        int var11 = class174.method640(arg1);
        if (var11 % 8 != 0) {
            var11 += 8 - var11 % 8;
        }
        class174 var12 = new class174(var11);
        var12.method2922(arg1);
        var12.field2384 = var11;
        var12.method2947(var6);
        class174 var13 = new class174(var12.field2384 + var5.field2384 + var4.field2384 + 5);
        var13.method3031(2);
        var13.method3031(var4.field2384);
        var13.method2986(var4.field2387, 0, var4.field2384);
        var13.method3031(var5.field2384);
        var13.method2986(var5.field2387, 0, var5.field2384);
        var13.method2917(var12.field2384);
        var13.method2986(var12.field2387, 0, var12.field2384);
        byte[] var14 = var13.field2387;
        int var15 = var14.length;
        StringBuilder var16 = new StringBuilder();
        for (int var17 = 0; var17 < var15; var17 += 3) {
            int var18 = var14[var17] & 0xFF;
            var16.append(class270.field3680[var18 >>> 2]);
            if (var17 < var15 - 1) {
                int var19 = var14[var17 + 1] & 0xFF;
                var16.append(class270.field3680[(var18 & 0x3) << 4 | var19 >>> 4]);
                if (var17 < var15 - 2) {
                    int var20 = var14[var17 + 2] & 0xFF;
                    var16.append(class270.field3680[(var19 & 0xF) << 2 | var20 >>> 6]).append(class270.field3680[var20 & 0x3F]);
                } else {
                    var16.append(class270.field3680[(var19 & 0xF) << 2]).append("=");
                }
            } else {
                var16.append(class270.field3680[(var18 & 0x3) << 4]).append("==");
            }
        }
        String var21 = var16.toString();
        String var23 = var21;
        try {
            URL var24 = new URL(client.method172("services", false) + "m=accountappeal/login.ws");
            URLConnection var25 = var24.openConnection();
            var25.setDoInput(true);
            var25.setDoOutput(true);
            var25.setConnectTimeout(5000);
            OutputStreamWriter var26 = new OutputStreamWriter(var25.getOutputStream());
            var26.write("data2=" + class294.method3201(var23) + "&dest=" + class294.method3201("passwordchoice.ws"));
            var26.flush();
            InputStream var27 = var25.getInputStream();
            class174 var28 = new class174(new byte[1000]);
            do {
                int var29 = var27.read(var28.field2387, var28.field2384, 1000 - var28.field2384);
                if (var29 == -1) {
                    var26.close();
                    var27.close();
                    String var30 = new String(var28.field2387);
                    if (var30.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var30.startsWith("WRONG")) {
                        return 7;
                    } else if (var30.startsWith("RELOAD")) {
                        return 3;
                    } else if (var30.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var28.method2948(var6);
                        while (var28.field2384 > 0 && var28.field2387[var28.field2384 - 1] == 0) {
                            var28.field2384--;
                        }
                        String var31 = new String(var28.field2387, 0, var28.field2384);
                        if (method3949(var31)) {
                            class57.method40(var31, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var28.field2384 += var29;
            } while (var28.field2384 < 1000);
            return 5;
        } catch (Throwable var33) {
            var33.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("ig.h(Ljava/lang/String;B)Z")
    public static boolean method3949(String arg0) {
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
