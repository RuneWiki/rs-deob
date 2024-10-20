package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("br")
public class class75 {

    @ObfuscatedName("br.l")
    public static final BigInteger field1084 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("br.w")
    public static final BigInteger field1077 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class75() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jd.f(I)J")
    public static long method4784() {
        try {
            URL var0 = new URL(client.method639("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2399, var4.field2397, 1000 - var4.field2397);
                if (var5 == -1) {
                    var4.field2397 = 0;
                    return var4.method3505();
                }
                var4.field2397 += var5;
            } while (var4.field2397 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("fs.h(JLjava/lang/String;B)I")
    public static final int method3221(long arg0, String arg1) {
        Random var3 = new Random();
        class185 var4 = new class185(128);
        class185 var5 = new class185(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method3531(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method3528(var3.nextInt());
        }
        var4.method3528(var6[0]);
        var4.method3528(var6[1]);
        var4.method3312(arg0);
        var4.method3312(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method3528(var3.nextInt());
        }
        var4.method3447(field1084, field1077);
        var5.method3531(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method3528(var3.nextInt());
        }
        var5.method3312(var3.nextLong());
        var5.method3472(var3.nextLong());
        if (client.field650 == null) {
            byte[] var10 = class158.method133();
            var5.method3396(var10, 0, var10.length);
        } else {
            var5.method3396(client.field650, 0, client.field650.length);
        }
        var5.method3312(var3.nextLong());
        var5.method3447(field1084, field1077);
        int var11 = class185.method459(arg1);
        if (var11 % 8 != 0) {
            var11 += 8 - var11 % 8;
        }
        class185 var12 = new class185(var11);
        var12.method3314(arg1);
        var12.field2397 = var11;
        var12.method3342(var6);
        class185 var13 = new class185(var12.field2397 + var5.field2397 + var4.field2397 + 5);
        var13.method3531(2);
        var13.method3531(var4.field2397);
        var13.method3396(var4.field2399, 0, var4.field2397);
        var13.method3531(var5.field2397);
        var13.method3396(var5.field2399, 0, var5.field2397);
        var13.method3449(var12.field2397);
        var13.method3396(var12.field2399, 0, var12.field2397);
        byte[] var14 = var13.field2399;
        int var15 = var14.length;
        StringBuilder var16 = new StringBuilder();
        for (int var17 = 0; var17 < var15; var17 += 3) {
            int var18 = var14[var17] & 0xFF;
            var16.append(class307.field3791[var18 >>> 2]);
            if (var17 < var15 - 1) {
                int var19 = var14[var17 + 1] & 0xFF;
                var16.append(class307.field3791[(var18 & 0x3) << 4 | var19 >>> 4]);
                if (var17 < var15 - 2) {
                    int var20 = var14[var17 + 2] & 0xFF;
                    var16.append(class307.field3791[(var19 & 0xF) << 2 | var20 >>> 6]).append(class307.field3791[var20 & 0x3F]);
                } else {
                    var16.append(class307.field3791[(var19 & 0xF) << 2]).append("=");
                }
            } else {
                var16.append(class307.field3791[(var18 & 0x3) << 4]).append("==");
            }
        }
        String var21 = var16.toString();
        String var23 = var21;
        try {
            URL var24 = new URL(client.method639("services", false) + "m=accountappeal/login.ws");
            URLConnection var25 = var24.openConnection();
            var25.setDoInput(true);
            var25.setDoOutput(true);
            var25.setConnectTimeout(5000);
            OutputStreamWriter var26 = new OutputStreamWriter(var25.getOutputStream());
            var26.write("data2=" + Statics.method2927(var23) + "&dest=" + Statics.method2927("passwordchoice.ws"));
            var26.flush();
            InputStream var27 = var25.getInputStream();
            class185 var28 = new class185(new byte[1000]);
            do {
                int var29 = var27.read(var28.field2399, var28.field2397, 1000 - var28.field2397);
                if (var29 == -1) {
                    var26.close();
                    var27.close();
                    String var30 = new String(var28.field2399);
                    if (var30.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var30.startsWith("WRONG")) {
                        return 7;
                    } else if (var30.startsWith("RELOAD")) {
                        return 3;
                    } else if (var30.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var28.method3343(var6);
                        while (var28.field2397 > 0 && var28.field2399[var28.field2397 - 1] == 0) {
                            var28.field2397--;
                        }
                        String var31 = new String(var28.field2399, 0, var28.field2397);
                        boolean var32;
                        if (var31 == null) {
                            var32 = false;
                        } else {
                            label92: {
                                try {
                                    new URL(var31);
                                } catch (MalformedURLException var35) {
                                    var32 = false;
                                    break label92;
                                }
                                var32 = true;
                            }
                        }
                        if (var32) {
                            class46.method4235(var31, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var28.field2397 += var29;
            } while (var28.field2397 < 1000);
            return 5;
        } catch (Throwable var36) {
            var36.printStackTrace();
            return 5;
        }
    }
}
