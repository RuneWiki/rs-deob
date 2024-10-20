package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cv")
public class class75 {

    @ObfuscatedName("cv.af")
    public static final BigInteger field921 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cv.aa")
    public static final BigInteger field919 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class75() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("od.ak(I)J")
    public static long method6507() {
        try {
            URL var0 = new URL(client.method7671("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class546 var4 = new class546(new byte[1000]);
            do {
                int var5 = var3.read(var4.field5346, var4.field5344, 1000 - var4.field5344);
                if (var5 == -1) {
                    var4.field5344 = 0;
                    return var4.method8802();
                }
                var4.field5344 += var5;
            } while (var4.field5344 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("af.al(JLjava/lang/String;B)I")
    public static final int method11(long arg0, String arg1) {
        Random var3 = new Random();
        class546 var4 = new class546(128);
        class546 var5 = new class546(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method8779(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method8981(var3.nextInt());
        }
        var4.method8981(var6[0]);
        var4.method8981(var6[1]);
        var4.method8784(arg0);
        var4.method8784(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method8981(var3.nextInt());
        }
        var4.method8821(field921, field919);
        var5.method8779(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method8981(var3.nextInt());
        }
        var5.method8784(var3.nextLong());
        var5.method8783(var3.nextLong());
        client.method2237(var5);
        var5.method8784(var3.nextLong());
        var5.method8821(field921, field919);
        int var10 = class546.method7454(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class546 var11 = new class546(var10);
        var11.method8864(arg1);
        var11.field5344 = var10;
        var11.method8972(var6);
        class546 var12 = new class546(var11.field5344 + var5.field5344 + var4.field5344 + 5);
        var12.method8779(2);
        var12.method8779(var4.field5344);
        var12.method8939(var4.field5346, 0, var4.field5344);
        var12.method8779(var5.field5344);
        var12.method8939(var5.field5346, 0, var5.field5344);
        var12.method8780(var11.field5344);
        var12.method8939(var11.field5346, 0, var11.field5344);
        String var13 = class414.method3233(var12.field5346);
        try {
            URL var14 = new URL(client.method7671("services", false) + "m=accountappeal/login.ws");
            URLConnection var15 = var14.openConnection();
            var15.setDoInput(true);
            var15.setDoOutput(true);
            var15.setConnectTimeout(5000);
            OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
            var16.write("data2=" + class570.method2249(var13) + "&dest=" + class570.method2249("passwordchoice.ws"));
            var16.flush();
            InputStream var17 = var15.getInputStream();
            class546 var18 = new class546(new byte[1000]);
            do {
                int var19 = var17.read(var18.field5346, var18.field5344, 1000 - var18.field5344);
                if (var19 == -1) {
                    var16.close();
                    var17.close();
                    String var20 = new String(var18.field5346);
                    if (var20.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var20.startsWith("WRONG")) {
                        return 7;
                    } else if (var20.startsWith("RELOAD")) {
                        return 3;
                    } else if (var20.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var18.method8818(var6);
                        while (var18.field5344 > 0 && var18.field5346[var18.field5344 - 1] == 0) {
                            var18.field5344--;
                        }
                        String var21 = new String(var18.field5346, 0, var18.field5344);
                        if (method5872(var21)) {
                            class32.method6508(var21, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var18.field5344 += var19;
            } while (var18.field5344 < 1000);
            return 5;
        } catch (Throwable var23) {
            var23.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("nw.aj(Ljava/lang/String;I)Z")
    public static boolean method5872(String arg0) {
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
