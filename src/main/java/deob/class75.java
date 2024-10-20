package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("bw")
public class class75 {

    @ObfuscatedName("bw.i")
    public static final BigInteger field1095 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("bw.r")
    public static final BigInteger field1094 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class75() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ej.y(I)J")
    public static long method2866() {
        try {
            URL var0 = new URL(Statics.method1005("services", false) + "m=accountappeal/login.ws");
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
                int var5 = var3.read(var4.field2373, var4.field2374, 1000 - var4.field2374);
                if (var5 == -1) {
                    var4.field2374 = 0;
                    return var4.method3488();
                }
                var4.field2374 += var5;
            } while (var4.field2374 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("fh.c(JLjava/lang/String;I)I")
    public static final int method3028(long arg0, String arg1) {
        Random var3 = new Random();
        class185 var4 = new class185(128);
        class185 var5 = new class185(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method3253(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method3256(var3.nextInt());
        }
        var4.method3256(var6[0]);
        var4.method3256(var6[1]);
        var4.method3258(arg0);
        var4.method3258(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method3256(var3.nextInt());
        }
        var4.method3290(field1095, field1094);
        var5.method3253(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method3256(var3.nextInt());
        }
        var5.method3258(var3.nextLong());
        var5.method3257(var3.nextLong());
        client.method439(var5);
        var5.method3258(var3.nextLong());
        var5.method3290(field1095, field1094);
        int var10 = class185.method637(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class185 var11 = new class185(var10);
        var11.method3260(arg1);
        var11.field2374 = var10;
        var11.method3286(var6);
        class185 var12 = new class185(var11.field2374 + var5.field2374 + var4.field2374 + 5);
        var12.method3253(2);
        var12.method3253(var4.field2374);
        var12.method3263(var4.field2373, 0, var4.field2374);
        var12.method3253(var5.field2374);
        var12.method3263(var5.field2373, 0, var5.field2374);
        var12.method3254(var11.field2374);
        var12.method3263(var11.field2373, 0, var11.field2374);
        byte[] var13 = var12.field2373;
        String var14 = class307.method11(var13, 0, var13.length);
        String var15 = var14;
        try {
            URL var16 = new URL(Statics.method1005("services", false) + "m=accountappeal/login.ws");
            URLConnection var17 = var16.openConnection();
            var17.setDoInput(true);
            var17.setDoOutput(true);
            var17.setConnectTimeout(5000);
            OutputStreamWriter var18 = new OutputStreamWriter(var17.getOutputStream());
            var18.write("data2=" + Statics.method3086(var15) + "&dest=" + Statics.method3086("passwordchoice.ws"));
            var18.flush();
            InputStream var19 = var17.getInputStream();
            class185 var20 = new class185(new byte[1000]);
            do {
                int var21 = var19.read(var20.field2373, var20.field2374, 1000 - var20.field2374);
                if (var21 == -1) {
                    var18.close();
                    var19.close();
                    String var22 = new String(var20.field2373);
                    if (var22.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var22.startsWith("WRONG")) {
                        return 7;
                    } else if (var22.startsWith("RELOAD")) {
                        return 3;
                    } else if (var22.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var20.method3449(var6);
                        while (var20.field2374 > 0 && var20.field2373[var20.field2374 - 1] == 0) {
                            var20.field2374--;
                        }
                        String var23 = new String(var20.field2373, 0, var20.field2374);
                        boolean var24;
                        if (var23 == null) {
                            var24 = false;
                        } else {
                            label73: {
                                try {
                                    new URL(var23);
                                } catch (MalformedURLException var27) {
                                    var24 = false;
                                    break label73;
                                }
                                var24 = true;
                            }
                        }
                        if (var24) {
                            class46.method4230(var23, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var20.field2374 += var21;
            } while (var20.field2374 < 1000);
            return 5;
        } catch (Throwable var28) {
            var28.printStackTrace();
            return 5;
        }
    }
}
