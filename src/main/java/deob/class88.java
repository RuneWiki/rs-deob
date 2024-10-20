package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cn")
public class class88 {

    @ObfuscatedName("cn.b")
    public static final BigInteger field1404 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cn.y")
    public static final BigInteger field1401 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class88() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ai.i(JLjava/lang/String;I)I")
    public static final int method293(long arg0, String arg1) {
        Random var3 = new Random();
        class174 var4 = new class174(128);
        class174 var5 = new class174(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2865(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2871(var3.nextInt());
        }
        var4.method2871(var6[0]);
        var4.method2871(var6[1]);
        var4.method2917(arg0);
        var4.method2917(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2871(var3.nextInt());
        }
        var4.method2973(field1404, field1401);
        var5.method2865(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2871(var3.nextInt());
        }
        var5.method2917(var3.nextLong());
        var5.method2859(var3.nextLong());
        client.method214(var5);
        var5.method2917(var3.nextLong());
        var5.method2973(field1404, field1401);
        int var10 = class174.method12(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class174 var11 = new class174(var10);
        var11.method2879(arg1);
        var11.field2407 = var10;
        var11.method2887(var6);
        class174 var12 = new class174(var11.field2407 + var5.field2407 + var4.field2407 + 5);
        var12.method2865(2);
        var12.method2865(var4.field2407);
        var12.method2864(var4.field2415, 0, var4.field2407);
        var12.method2865(var5.field2407);
        var12.method2864(var5.field2415, 0, var5.field2407);
        var12.method2856(var11.field2407);
        var12.method2864(var11.field2415, 0, var11.field2407);
        String var13 = class270.method642(var12.field2415);
        try {
            URL var14 = new URL(client.method898("services", false) + "m=accountappeal/login.ws");
            URLConnection var15 = var14.openConnection();
            var15.setDoInput(true);
            var15.setDoOutput(true);
            var15.setConnectTimeout(5000);
            OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
            var16.write("data2=" + class294.method125(var13) + "&dest=" + class294.method125("passwordchoice.ws"));
            var16.flush();
            InputStream var17 = var15.getInputStream();
            class174 var18 = new class174(new byte[1000]);
            do {
                int var19 = var17.read(var18.field2415, var18.field2407, 1000 - var18.field2407);
                if (var19 == -1) {
                    var16.close();
                    var17.close();
                    String var20 = new String(var18.field2415);
                    if (var20.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var20.startsWith("WRONG")) {
                        return 7;
                    } else if (var20.startsWith("RELOAD")) {
                        return 3;
                    } else if (var20.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var18.method2888(var6);
                        while (var18.field2407 > 0 && var18.field2415[var18.field2407 - 1] == 0) {
                            var18.field2407--;
                        }
                        String var21 = new String(var18.field2415, 0, var18.field2407);
                        boolean var22;
                        if (var21 == null) {
                            var22 = false;
                        } else {
                            label93: {
                                try {
                                    new URL(var21);
                                } catch (MalformedURLException var27) {
                                    var22 = false;
                                    break label93;
                                }
                                var22 = true;
                            }
                        }
                        if (!var22) {
                            return 5;
                        }
                        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                            try {
                                Desktop.getDesktop().browse(new URI(var21));
                                return 2;
                            } catch (Exception var26) {
                            }
                        }
                        if (class57.field691.startsWith("win")) {
                            class57.method475(var21, 0, "openjs");
                        } else if (class57.field691.startsWith("mac")) {
                            class57.method475(var21, 1, "openjs");
                        } else {
                            class57.method475(var21, 2, "openjs");
                        }
                        return 2;
                    }
                }
                var18.field2407 += var19;
            } while (var18.field2407 < 1000);
            return 5;
        } catch (Throwable var28) {
            var28.printStackTrace();
            return 5;
        }
    }
}
