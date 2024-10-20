package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ai")
public class class37 {

    @ObfuscatedName("ai.r")
    public static final BigInteger field797 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("ai.o")
    public static final BigInteger field785 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fk.f(JLjava/lang/String;I)I")
    public static final int method3037(long arg0, String arg1) {
        Random var3 = new Random();
        class154 var4 = new class154(128);
        class154 var5 = new class154(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2651(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2654(var3.nextInt());
        }
        var4.method2654(var6[0]);
        var4.method2654(var6[1]);
        var4.method2657(arg0);
        var4.method2657(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2654(var3.nextInt());
        }
        var4.method2687(field797, field785);
        var5.method2651(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2654(var3.nextInt());
        }
        var5.method2657(var3.nextLong());
        var5.method2655(var3.nextLong());
        client.method571(var5);
        var5.method2657(var3.nextLong());
        var5.method2687(field797, field785);
        int var10 = class154.method1352(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class154 var11 = new class154(var10);
        var11.method2730(arg1);
        var11.field2111 = var10;
        var11.method2683(var6);
        class154 var12 = new class154(var11.field2111 + var5.field2111 + var4.field2111 + 5);
        var12.method2651(2);
        var12.method2651(var4.field2111);
        var12.method2660(var4.field2114, 0, var4.field2111);
        var12.method2651(var5.field2111);
        var12.method2660(var5.field2114, 0, var5.field2111);
        var12.method2793(var11.field2111);
        var12.method2660(var11.field2114, 0, var11.field2111);
        String var13 = class207.method652(var12.field2114);
        try {
            URL var14 = new URL(client.method3099("services", false) + "m=accountappeal/login.ws");
            URLConnection var15 = var14.openConnection();
            var15.setDoInput(true);
            var15.setDoOutput(true);
            var15.setConnectTimeout(5000);
            OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
            var16.write("data2=" + class232.method2581(var13) + "&dest=" + class232.method2581("passwordchoice.ws"));
            var16.flush();
            InputStream var17 = var15.getInputStream();
            class154 var18 = new class154(new byte[1000]);
            do {
                int var19 = var17.read(var18.field2114, var18.field2111, 1000 - var18.field2111);
                if (var19 == -1) {
                    var16.close();
                    var17.close();
                    String var20 = new String(var18.field2114);
                    if (var20.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var20.startsWith("WRONG")) {
                        return 7;
                    } else if (var20.startsWith("RELOAD")) {
                        return 3;
                    } else if (var20.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var18.method2664(var6);
                        while (var18.field2111 > 0 && var18.field2114[var18.field2111 - 1] == 0) {
                            var18.field2111--;
                        }
                        String var21 = new String(var18.field2114, 0, var18.field2111);
                        if (method59(var21)) {
                            class115.method609(var21, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var18.field2111 += var19;
            } while (var18.field2111 < 1000);
            return 5;
        } catch (Throwable var23) {
            var23.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("o.i(Ljava/lang/String;I)Z")
    public static boolean method59(String arg0) {
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
