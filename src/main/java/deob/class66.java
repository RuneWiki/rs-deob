package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("bs")
public class class66 {

    @ObfuscatedName("bs.j")
    public static final BigInteger field866 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("bs.e")
    public static final BigInteger field869 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class66() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iu.c(JLjava/lang/String;I)I")
    public static final int method4615(long arg0, String arg1) {
        Random var3 = new Random();
        class443 var4 = new class443(128);
        class443 var5 = new class443(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method7031(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method7087(var3.nextInt());
        }
        var4.method7087(var6[0]);
        var4.method7087(var6[1]);
        var4.method7197(arg0);
        var4.method7197(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method7087(var3.nextInt());
        }
        var4.method7073(field866, field869);
        var5.method7031(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method7087(var3.nextInt());
        }
        var5.method7197(var3.nextLong());
        var5.method7034(var3.nextLong());
        if (client.field535 == null) {
            byte[] var10 = class158.method5517();
            var5.method7053(var10, 0, var10.length);
        } else {
            var5.method7053(client.field535, 0, client.field535.length);
        }
        var5.method7197(var3.nextLong());
        var5.method7073(field866, field869);
        int var11 = class443.method2008(arg1);
        if (var11 % 8 != 0) {
            var11 += 8 - var11 % 8;
        }
        class443 var12 = new class443(var11);
        var12.method7037(arg1);
        var12.field4700 = var11;
        var12.method7069(var6);
        class443 var13 = new class443(var12.field4700 + var5.field4700 + var4.field4700 + 5);
        var13.method7031(2);
        var13.method7031(var4.field4700);
        var13.method7053(var4.field4701, 0, var4.field4700);
        var13.method7031(var5.field4700);
        var13.method7053(var5.field4701, 0, var5.field4700);
        var13.method7244(var12.field4700);
        var13.method7053(var12.field4701, 0, var12.field4700);
        byte[] var14 = var13.field4701;
        int var15 = var14.length;
        StringBuilder var16 = new StringBuilder();
        for (int var17 = 0; var17 < var15; var17 += 3) {
            int var18 = var14[var17] & 0xFF;
            var16.append(class342.field4147[var18 >>> 2]);
            if (var17 < var15 - 1) {
                int var19 = var14[var17 + 1] & 0xFF;
                var16.append(class342.field4147[(var18 & 0x3) << 4 | var19 >>> 4]);
                if (var17 < var15 - 2) {
                    int var20 = var14[var17 + 2] & 0xFF;
                    var16.append(class342.field4147[(var19 & 0xF) << 2 | var20 >>> 6]).append(class342.field4147[var20 & 0x3F]);
                } else {
                    var16.append(class342.field4147[(var19 & 0xF) << 2]).append("=");
                }
            } else {
                var16.append(class342.field4147[(var18 & 0x3) << 4]).append("==");
            }
        }
        String var21 = var16.toString();
        String var23 = var21;
        try {
            URL var24 = new URL(client.method5515("services", false) + "m=accountappeal/login.ws");
            URLConnection var25 = var24.openConnection();
            var25.setDoInput(true);
            var25.setDoOutput(true);
            var25.setConnectTimeout(5000);
            OutputStreamWriter var26 = new OutputStreamWriter(var25.getOutputStream());
            var26.write("data2=" + class466.method1027(var23) + "&dest=" + class466.method1027("passwordchoice.ws"));
            var26.flush();
            InputStream var27 = var25.getInputStream();
            class443 var28 = new class443(new byte[1000]);
            do {
                int var29 = var27.read(var28.field4701, var28.field4700, 1000 - var28.field4700);
                if (var29 == -1) {
                    var26.close();
                    var27.close();
                    String var30 = new String(var28.field4701);
                    if (var30.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var30.startsWith("WRONG")) {
                        return 7;
                    } else if (var30.startsWith("RELOAD")) {
                        return 3;
                    } else if (var30.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var28.method7070(var6);
                        while (var28.field4700 > 0 && var28.field4701[var28.field4700 - 1] == 0) {
                            var28.field4700--;
                        }
                        String var31 = new String(var28.field4701, 0, var28.field4700);
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
                            class30.method4702(var31, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var28.field4700 += var29;
            } while (var28.field4700 < 1000);
            return 5;
        } catch (Throwable var36) {
            var36.printStackTrace();
            return 5;
        }
    }
}
