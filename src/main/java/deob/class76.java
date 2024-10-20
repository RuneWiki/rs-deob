package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cs")
public class class76 {

    @ObfuscatedName("cs.ai")
    public static final BigInteger field900 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cs.ay")
    public static final BigInteger field899 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class76() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.ap(I)J")
    public static long method2708() {
        try {
            URL var0 = new URL(client.method3043("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class558 var4 = new class558(new byte[1000]);
            do {
                int var5 = var3.read(var4.field5463, var4.field5462, 1000 - var4.field5462);
                if (var5 == -1) {
                    var4.field5462 = 0;
                    return var4.method9265();
                }
                var4.field5462 += var5;
            } while (var4.field5462 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("na.aw(JLjava/lang/String;I)I")
    public static final int method6327(long arg0, String arg1) {
        Random var3 = new Random();
        class558 var4 = new class558(128);
        class558 var5 = new class558(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method9241(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method9244(var3.nextInt());
        }
        var4.method9244(var6[0]);
        var4.method9244(var6[1]);
        var4.method9381(arg0);
        var4.method9381(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method9244(var3.nextInt());
        }
        var4.method9336(field900, field899);
        var5.method9241(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method9244(var3.nextInt());
        }
        var5.method9381(var3.nextLong());
        var5.method9318(var3.nextLong());
        if (client.field635 == null) {
            byte[] var10 = class221.method5();
            var5.method9251(var10, 0, var10.length);
        } else {
            var5.method9251(client.field635, 0, client.field635.length);
        }
        var5.method9381(var3.nextLong());
        var5.method9336(field900, field899);
        int var11 = class558.method1876(arg1);
        if (var11 % 8 != 0) {
            var11 += 8 - var11 % 8;
        }
        class558 var12 = new class558(var11);
        var12.method9248(arg1);
        var12.field5462 = var11;
        var12.method9239(var6);
        class558 var13 = new class558(var12.field5462 + var5.field5462 + var4.field5462 + 5);
        var13.method9241(2);
        var13.method9241(var4.field5462);
        var13.method9251(var4.field5463, 0, var4.field5462);
        var13.method9241(var5.field5462);
        var13.method9251(var5.field5463, 0, var5.field5462);
        var13.method9257(var12.field5462);
        var13.method9251(var12.field5463, 0, var12.field5462);
        byte[] var14 = var13.field5463;
        int var15 = var14.length;
        StringBuilder var16 = new StringBuilder();
        for (int var17 = 0; var17 < var15; var17 += 3) {
            int var18 = var14[var17] & 0xFF;
            var16.append(class419.field4746[var18 >>> 2]);
            if (var17 < var15 - 1) {
                int var19 = var14[var17 + 1] & 0xFF;
                var16.append(class419.field4746[(var18 & 0x3) << 4 | var19 >>> 4]);
                if (var17 < var15 - 2) {
                    int var20 = var14[var17 + 2] & 0xFF;
                    var16.append(class419.field4746[(var19 & 0xF) << 2 | var20 >>> 6]).append(class419.field4746[var20 & 0x3F]);
                } else {
                    var16.append(class419.field4746[(var19 & 0xF) << 2]).append("=");
                }
            } else {
                var16.append(class419.field4746[(var18 & 0x3) << 4]).append("==");
            }
        }
        String var21 = var16.toString();
        String var23 = var21;
        try {
            URL var24 = new URL(client.method3043("services", false) + "m=accountappeal/login.ws");
            URLConnection var25 = var24.openConnection();
            var25.setDoInput(true);
            var25.setDoOutput(true);
            var25.setConnectTimeout(5000);
            OutputStreamWriter var26 = new OutputStreamWriter(var25.getOutputStream());
            var26.write("data2=" + class583.method7491(var23) + "&dest=" + class583.method7491("passwordchoice.ws"));
            var26.flush();
            InputStream var27 = var25.getInputStream();
            class558 var28 = new class558(new byte[1000]);
            do {
                int var29 = var27.read(var28.field5463, var28.field5462, 1000 - var28.field5462);
                if (var29 == -1) {
                    var26.close();
                    var27.close();
                    String var30 = new String(var28.field5463);
                    if (var30.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var30.startsWith("WRONG")) {
                        return 7;
                    } else if (var30.startsWith("RELOAD")) {
                        return 3;
                    } else if (var30.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var28.method9282(var6);
                        while (var28.field5462 > 0 && var28.field5463[var28.field5462 - 1] == 0) {
                            var28.field5462--;
                        }
                        String var31 = new String(var28.field5463, 0, var28.field5462);
                        if (method3107(var31)) {
                            class32.method7129(var31, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var28.field5462 += var29;
            } while (var28.field5462 < 1000);
            return 5;
        } catch (Throwable var33) {
            var33.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("ej.ak(Ljava/lang/String;I)Z")
    public static boolean method3107(String arg0) {
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
