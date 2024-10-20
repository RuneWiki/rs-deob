package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cd")
public class class76 {

    @ObfuscatedName("cd.ax")
    public static final BigInteger field922 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cd.aq")
    public static final BigInteger field918 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class76() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jl.ac(I)J")
    public static long method4985() {
        try {
            URL var0 = new URL(client.method6148("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class551 var4 = new class551(new byte[1000]);
            do {
                int var5 = var3.read(var4.field5413, var4.field5415, 1000 - var4.field5415);
                if (var5 == -1) {
                    var4.field5415 = 0;
                    return var4.method8980();
                }
                var4.field5415 += var5;
            } while (var4.field5415 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("pg.ae(JLjava/lang/String;B)I")
    public static final int method6990(long arg0, String arg1) {
        Random var3 = new Random();
        class551 var4 = new class551(128);
        class551 var5 = new class551(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method9022(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method8960(var3.nextInt());
        }
        var4.method8960(var6[0]);
        var4.method8960(var6[1]);
        var4.method8962(arg0);
        var4.method8962(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method8960(var3.nextInt());
        }
        var4.method9000(field922, field918);
        var5.method9022(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method8960(var3.nextInt());
        }
        var5.method8962(var3.nextLong());
        var5.method8961(var3.nextLong());
        client.method413(var5);
        var5.method8962(var3.nextLong());
        var5.method9000(field922, field918);
        int var10 = class551.method8819(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class551 var11 = new class551(var10);
        var11.method8964(arg1);
        var11.field5415 = var10;
        var11.method9174(var6);
        class551 var12 = new class551(var11.field5415 + var5.field5415 + var4.field5415 + 5);
        var12.method9022(2);
        var12.method9022(var4.field5415);
        var12.method8967(var4.field5413, 0, var4.field5415);
        var12.method9022(var5.field5415);
        var12.method8967(var5.field5413, 0, var5.field5415);
        var12.method8958(var11.field5415);
        var12.method8967(var11.field5413, 0, var11.field5415);
        String var13 = class418.method4130(var12.field5413);
        try {
            URL var14 = new URL(client.method6148("services", false) + "m=accountappeal/login.ws");
            URLConnection var15 = var14.openConnection();
            var15.setDoInput(true);
            var15.setDoOutput(true);
            var15.setConnectTimeout(5000);
            OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
            var16.write("data2=" + class576.method5192(var13) + "&dest=" + class576.method5192("passwordchoice.ws"));
            var16.flush();
            InputStream var17 = var15.getInputStream();
            class551 var18 = new class551(new byte[1000]);
            do {
                int var19 = var17.read(var18.field5413, var18.field5415, 1000 - var18.field5415);
                if (var19 == -1) {
                    var16.close();
                    var17.close();
                    String var20 = new String(var18.field5413);
                    if (var20.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var20.startsWith("WRONG")) {
                        return 7;
                    } else if (var20.startsWith("RELOAD")) {
                        return 3;
                    } else if (var20.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var18.method8997(var6);
                        while (var18.field5415 > 0 && var18.field5413[var18.field5415 - 1] == 0) {
                            var18.field5415--;
                        }
                        String var21 = new String(var18.field5413, 0, var18.field5415);
                        boolean var22;
                        if (var21 == null) {
                            var22 = false;
                        } else {
                            label73: {
                                try {
                                    new URL(var21);
                                } catch (MalformedURLException var25) {
                                    var22 = false;
                                    break label73;
                                }
                                var22 = true;
                            }
                        }
                        if (var22) {
                            class32.method3941(var21, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var18.field5415 += var19;
            } while (var18.field5415 < 1000);
            return 5;
        } catch (Throwable var26) {
            var26.printStackTrace();
            return 5;
        }
    }
}
