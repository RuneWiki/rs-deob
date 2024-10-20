package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cj")
public class class73 {

    @ObfuscatedName("cj.ac")
    public static final BigInteger field911 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cj.ai")
    public static final BigInteger field913 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class73() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mk.au(JLjava/lang/String;B)I")
    public static final int method5477(long arg0, String arg1) {
        Random var3 = new Random();
        class515 var4 = new class515(128);
        class515 var5 = new class515(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method8283(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method8464(var3.nextInt());
        }
        var4.method8464(var6[0]);
        var4.method8464(var6[1]);
        var4.method8341(arg0);
        var4.method8341(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method8464(var3.nextInt());
        }
        var4.method8348(field911, field913);
        var5.method8283(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method8464(var3.nextInt());
        }
        var5.method8341(var3.nextLong());
        var5.method8287(var3.nextLong());
        client.method3251(var5);
        var5.method8341(var3.nextLong());
        var5.method8348(field911, field913);
        int var10 = class515.method7389(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class515 var11 = new class515(var10);
        var11.method8290(arg1);
        var11.field5111 = var10;
        var11.method8323(var6);
        class515 var12 = new class515(var11.field5111 + var5.field5111 + var4.field5111 + 5);
        var12.method8283(2);
        var12.method8283(var4.field5111);
        var12.method8293(var4.field5108, 0, var4.field5111);
        var12.method8283(var5.field5111);
        var12.method8293(var5.field5108, 0, var5.field5111);
        var12.method8345(var11.field5111);
        var12.method8293(var11.field5108, 0, var11.field5111);
        byte[] var13 = var12.field5108;
        String var14 = class386.method91(var13, 0, var13.length);
        String var15 = var14;
        try {
            URL var16 = new URL(client.method3400("services", false) + "m=accountappeal/login.ws");
            URLConnection var17 = var16.openConnection();
            var17.setDoInput(true);
            var17.setDoOutput(true);
            var17.setConnectTimeout(5000);
            OutputStreamWriter var18 = new OutputStreamWriter(var17.getOutputStream());
            String var20 = "data2=" + class540.method2784(var15) + "&dest=";
            int var21 = "passwordchoice.ws".length();
            StringBuilder var22 = new StringBuilder(var21);
            for (int var23 = 0; var23 < var21; var23++) {
                char var24 = "passwordchoice.ws".charAt(var23);
                if (!(var24 < 'a' || var24 > 'z') || !(var24 < 'A' || var24 > 'Z') || !(var24 < '0' || var24 > '9') || var24 == '.' || var24 == '-' || var24 == '*' || var24 == '_') {
                    var22.append(var24);
                } else if (var24 == ' ') {
                    var22.append('+');
                } else {
                    byte var25 = class385.method6055(var24);
                    var22.append('%');
                    int var26 = var25 >> 4 & 0xF;
                    if (var26 >= 10) {
                        var22.append((char) (var26 + 55));
                    } else {
                        var22.append((char) (var26 + 48));
                    }
                    int var27 = var25 & 0xF;
                    if (var27 >= 10) {
                        var22.append((char) (var27 + 55));
                    } else {
                        var22.append((char) (var27 + 48));
                    }
                }
            }
            String var28 = var22.toString();
            var18.write(var20 + var28);
            var18.flush();
            InputStream var29 = var17.getInputStream();
            class515 var30 = new class515(new byte[1000]);
            do {
                int var31 = var29.read(var30.field5108, var30.field5111, 1000 - var30.field5111);
                if (var31 == -1) {
                    var18.close();
                    var29.close();
                    String var32 = new String(var30.field5108);
                    if (var32.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var32.startsWith("WRONG")) {
                        return 7;
                    } else if (var32.startsWith("RELOAD")) {
                        return 3;
                    } else if (var32.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var30.method8528(var6);
                        while (var30.field5111 > 0 && var30.field5108[var30.field5111 - 1] == 0) {
                            var30.field5111--;
                        }
                        String var33 = new String(var30.field5108, 0, var30.field5111);
                        if (method2269(var33)) {
                            class32.method446(var33, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var30.field5111 += var31;
            } while (var30.field5111 < 1000);
            return 5;
        } catch (Throwable var35) {
            var35.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("dv.ae(Ljava/lang/String;I)Z")
    public static boolean method2269(String arg0) {
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
