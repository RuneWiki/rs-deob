package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cr")
public class class90 {

    @ObfuscatedName("cr.t")
    public static final BigInteger field1148 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cr.j")
    public static final BigInteger field1143 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class90() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gy.h(JLjava/lang/String;S)I")
    public static final int method3417(long arg0, String arg1) {
        Random var3 = new Random();
        class311 var4 = new class311(128);
        class311 var5 = new class311(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method5095(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method5123(var3.nextInt());
        }
        var4.method5123(var6[0]);
        var4.method5123(var6[1]);
        var4.method5103(arg0);
        var4.method5103(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method5123(var3.nextInt());
        }
        var4.method5113(field1148, field1143);
        var5.method5095(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method5123(var3.nextInt());
        }
        var5.method5103(var3.nextLong());
        var5.method5204(var3.nextLong());
        client.method3285(var5);
        var5.method5103(var3.nextLong());
        var5.method5113(field1148, field1143);
        int var10 = class311.method2704(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class311 var11 = new class311(var10);
        var11.method5105(arg1);
        var11.field3752 = var10;
        var11.method5338(var6);
        class311 var12 = new class311(var11.field3752 + var5.field3752 + var4.field3752 + 5);
        var12.method5095(2);
        var12.method5095(var4.field3752);
        var12.method5237(var4.field3753, 0, var4.field3752);
        var12.method5095(var5.field3752);
        var12.method5237(var5.field3753, 0, var5.field3752);
        var12.method5099(var11.field3752);
        var12.method5237(var11.field3753, 0, var11.field3752);
        byte[] var13 = var12.field3753;
        String var14 = Statics.method1108(var13, 0, var13.length);
        String var15 = var14;
        try {
            URL var16 = new URL(client.method558("services", false) + "m=accountappeal/login.ws");
            URLConnection var17 = var16.openConnection();
            var17.setDoInput(true);
            var17.setDoOutput(true);
            var17.setConnectTimeout(5000);
            OutputStreamWriter var18 = new OutputStreamWriter(var17.getOutputStream());
            var18.write("data2=" + class351.method3105(var15) + "&dest=" + class351.method3105("passwordchoice.ws"));
            var18.flush();
            InputStream var19 = var17.getInputStream();
            class311 var20 = new class311(new byte[1000]);
            do {
                int var21 = var19.read(var20.field3753, var20.field3752, 1000 - var20.field3752);
                if (var21 == -1) {
                    var18.close();
                    var19.close();
                    String var22 = new String(var20.field3753);
                    if (var22.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var22.startsWith("WRONG")) {
                        return 7;
                    } else if (var22.startsWith("RELOAD")) {
                        return 3;
                    } else if (var22.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var20.method5188(var6);
                        while (var20.field3752 > 0 && var20.field3753[var20.field3752 - 1] == 0) {
                            var20.field3752--;
                        }
                        String var23 = new String(var20.field3753, 0, var20.field3752);
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
                            class61.method1978(var23, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var20.field3752 += var21;
            } while (var20.field3752 < 1000);
            return 5;
        } catch (Throwable var28) {
            var28.printStackTrace();
            return 5;
        }
    }
}
