package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("bz")
public class class66 {

    @ObfuscatedName("bz.a")
    public static final BigInteger field855 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("bz.m")
    public static final BigInteger field863 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class66() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("el.o(JLjava/lang/String;I)I")
    public static final int method2748(long arg0, String arg1) {
        Random var3 = new Random();
        class440 var4 = new class440(128);
        class440 var5 = new class440(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method6876(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method6879(var3.nextInt());
        }
        var4.method6879(var6[0]);
        var4.method6879(var6[1]);
        var4.method7015(arg0);
        var4.method7015(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method6879(var3.nextInt());
        }
        var4.method6916(field855, field863);
        var5.method6876(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method6879(var3.nextInt());
        }
        var5.method7015(var3.nextLong());
        var5.method6880(var3.nextLong());
        client.method7486(var5);
        var5.method7015(var3.nextLong());
        var5.method6916(field855, field863);
        int var10 = class440.method6331(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class440 var11 = new class440(var10);
        var11.method6883(arg1);
        var11.field4678 = var10;
        var11.method6912(var6);
        class440 var12 = new class440(var11.field4678 + var5.field4678 + var4.field4678 + 5);
        var12.method6876(2);
        var12.method6876(var4.field4678);
        var12.method6886(var4.field4679, 0, var4.field4678);
        var12.method6876(var5.field4678);
        var12.method6886(var5.field4679, 0, var5.field4678);
        var12.method6877(var11.field4678);
        var12.method6886(var11.field4679, 0, var11.field4678);
        String var13 = class343.method2597(var12.field4679);
        try {
            URL var14 = new URL(client.method4382("services", false) + "m=accountappeal/login.ws");
            URLConnection var15 = var14.openConnection();
            var15.setDoInput(true);
            var15.setDoOutput(true);
            var15.setConnectTimeout(5000);
            OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
            var16.write("data2=" + class463.method2480(var13) + "&dest=" + class463.method2480("passwordchoice.ws"));
            var16.flush();
            InputStream var17 = var15.getInputStream();
            class440 var18 = new class440(new byte[1000]);
            do {
                int var19 = var17.read(var18.field4679, var18.field4678, 1000 - var18.field4678);
                if (var19 == -1) {
                    var16.close();
                    var17.close();
                    String var20 = new String(var18.field4679);
                    if (var20.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var20.startsWith("WRONG")) {
                        return 7;
                    } else if (var20.startsWith("RELOAD")) {
                        return 3;
                    } else if (var20.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var18.method6913(var6);
                        while (var18.field4678 > 0 && var18.field4679[var18.field4678 - 1] == 0) {
                            var18.field4678--;
                        }
                        String var21 = new String(var18.field4679, 0, var18.field4678);
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
                            class30.method1979(var21, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var18.field4678 += var19;
            } while (var18.field4678 < 1000);
            return 5;
        } catch (Throwable var26) {
            var26.printStackTrace();
            return 5;
        }
    }
}
