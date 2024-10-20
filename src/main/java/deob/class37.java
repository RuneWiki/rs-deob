package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("aa")
public class class37 {

    @ObfuscatedName("aa.j")
    public static final BigInteger field803 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("aa.n")
    public static final BigInteger field795 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.q(JLjava/lang/String;I)I")
    public static final int method11(long arg0, String arg1) {
        Random var3 = new Random();
        class154 var4 = new class154(128);
        class154 var5 = new class154(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2751(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2654(var3.nextInt());
        }
        var4.method2654(var6[0]);
        var4.method2654(var6[1]);
        var4.method2826(arg0);
        var4.method2826(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2654(var3.nextInt());
        }
        var4.method2661(field803, field795);
        var5.method2751(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2654(var3.nextInt());
        }
        var5.method2826(var3.nextLong());
        var5.method2653(var3.nextLong());
        byte[] var10 = new byte[24];
        try {
            class105.field1693.method1388(0L);
            class105.field1693.method1381(var10);
            int var11;
            for (var11 = 0; var11 < 24 && var10[var11] == 0; var11++) {
            }
            if (var11 >= 24) {
                throw new IOException();
            }
        } catch (Exception var40) {
            for (int var13 = 0; var13 < 24; var13++) {
                var10[var13] = -1;
            }
        }
        var5.method2660(var10, 0, 24);
        var5.method2826(var3.nextLong());
        var5.method2661(field803, field795);
        int var14 = class154.method2202(arg1);
        if (var14 % 8 != 0) {
            var14 += 8 - var14 % 8;
        }
        class154 var15 = new class154(var14);
        var15.method2657(arg1);
        var15.field2091 = var14;
        var15.method2814(var6);
        class154 var16 = new class154(var15.field2091 + var5.field2091 + var4.field2091 + 5);
        var16.method2751(2);
        var16.method2751(var4.field2091);
        var16.method2660(var4.field2092, 0, var4.field2091);
        var16.method2751(var5.field2091);
        var16.method2660(var5.field2092, 0, var5.field2091);
        var16.method2664(var15.field2091);
        var16.method2660(var15.field2092, 0, var15.field2091);
        byte[] var17 = var16.field2092;
        int var18 = var17.length;
        StringBuilder var19 = new StringBuilder();
        for (int var20 = 0; var20 < var18; var20 += 3) {
            int var21 = var17[var20] & 0xFF;
            var19.append(class207.field3091[var21 >>> 2]);
            if (var20 < var18 - 1) {
                int var22 = var17[var20 + 1] & 0xFF;
                var19.append(class207.field3091[(var21 & 0x3) << 4 | var22 >>> 4]);
                if (var20 < var18 - 2) {
                    int var23 = var17[var20 + 2] & 0xFF;
                    var19.append(class207.field3091[(var22 & 0xF) << 2 | var23 >>> 6]).append(class207.field3091[var23 & 0x3F]);
                } else {
                    var19.append(class207.field3091[(var22 & 0xF) << 2]).append("=");
                }
            } else {
                var19.append(class207.field3091[(var21 & 0x3) << 4]).append("==");
            }
        }
        String var24 = var19.toString();
        String var26 = var24;
        try {
            URL var27 = new URL(client.method863("services", false) + "m=accountappeal/login.ws");
            URLConnection var28 = var27.openConnection();
            var28.setDoInput(true);
            var28.setDoOutput(true);
            var28.setConnectTimeout(5000);
            OutputStreamWriter var29 = new OutputStreamWriter(var28.getOutputStream());
            var29.write("data2=" + class232.method3094(var26) + "&dest=" + class232.method3094("passwordchoice.ws"));
            var29.flush();
            InputStream var30 = var28.getInputStream();
            class154 var31 = new class154(new byte[1000]);
            do {
                int var32 = var30.read(var31.field2092, var31.field2091, 1000 - var31.field2091);
                if (var32 == -1) {
                    var29.close();
                    var30.close();
                    String var33 = new String(var31.field2092);
                    if (var33.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var33.startsWith("WRONG")) {
                        return 7;
                    } else if (var33.startsWith("RELOAD")) {
                        return 3;
                    } else if (var33.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var31.method2684(var6);
                        while (var31.field2091 > 0 && var31.field2092[var31.field2091 - 1] == 0) {
                            var31.field2091--;
                        }
                        String var34 = new String(var31.field2092, 0, var31.field2091);
                        boolean var35;
                        if (var34 == null) {
                            var35 = false;
                        } else {
                            label101: {
                                try {
                                    new URL(var34);
                                } catch (MalformedURLException var38) {
                                    var35 = false;
                                    break label101;
                                }
                                var35 = true;
                            }
                        }
                        if (var35) {
                            class115.method1442(var34, true, "openjs", false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var31.field2091 += var32;
            } while (var31.field2091 < 1000);
            return 5;
        } catch (Throwable var39) {
            var39.printStackTrace();
            return 5;
        }
    }
}
