package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cc")
public class class74 {

    @ObfuscatedName("cc.ar")
    public static final BigInteger field913 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cc.as")
    public static final BigInteger field917 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class74() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ha.aq(JLjava/lang/String;I)I")
    public static final int method3484(long arg0, String arg1) {
        Random var3 = new Random();
        class534 var4 = new class534(128);
        class534 var5 = new class534(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method8574(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method8577(var3.nextInt());
        }
        var4.method8577(var6[0]);
        var4.method8577(var6[1]);
        var4.method8726(arg0);
        var4.method8726(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method8577(var3.nextInt());
        }
        var4.method8672(field913, field917);
        var5.method8574(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method8577(var3.nextInt());
        }
        var5.method8726(var3.nextLong());
        var5.method8578(var3.nextLong());
        client.method3311(var5);
        var5.method8726(var3.nextLong());
        var5.method8672(field913, field917);
        int var10 = class534.method3043(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class534 var11 = new class534(var10);
        var11.method8581(arg1);
        var11.field5200 = var10;
        var11.method8744(var6);
        class534 var12 = new class534(var11.field5200 + var5.field5200 + var4.field5200 + 5);
        var12.method8574(2);
        var12.method8574(var4.field5200);
        var12.method8584(var4.field5199, 0, var4.field5200);
        var12.method8574(var5.field5200);
        var12.method8584(var5.field5199, 0, var5.field5200);
        var12.method8575(var11.field5200);
        var12.method8584(var11.field5199, 0, var11.field5200);
        String var13 = class405.method6343(var12.field5199);
        try {
            URL var14 = new URL(client.method5467("services", false) + "m=accountappeal/login.ws");
            URLConnection var15 = var14.openConnection();
            var15.setDoInput(true);
            var15.setDoOutput(true);
            var15.setConnectTimeout(5000);
            OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
            var16.write("data2=" + class559.method3338(var13) + "&dest=" + class559.method3338("passwordchoice.ws"));
            var16.flush();
            InputStream var17 = var15.getInputStream();
            class534 var18 = new class534(new byte[1000]);
            do {
                int var19 = var17.read(var18.field5199, var18.field5200, 1000 - var18.field5200);
                if (var19 == -1) {
                    var16.close();
                    var17.close();
                    String var20 = new String(var18.field5199);
                    if (var20.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var20.startsWith("WRONG")) {
                        return 7;
                    } else if (var20.startsWith("RELOAD")) {
                        return 3;
                    } else if (var20.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var18.method8615(var6);
                        while (var18.field5200 > 0 && var18.field5199[var18.field5200 - 1] == 0) {
                            var18.field5200--;
                        }
                        String var21 = new String(var18.field5199, 0, var18.field5200);
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
                            class32.method2989(var21, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var18.field5200 += var19;
            } while (var18.field5200 < 1000);
            return 5;
        } catch (Throwable var26) {
            var26.printStackTrace();
            return 5;
        }
    }
}
