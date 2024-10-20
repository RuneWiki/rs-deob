package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ct")
public class class75 {

    @ObfuscatedName("ct.ao")
    public static final BigInteger field907 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("ct.ah")
    public static final BigInteger field908 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class75() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.ac(I)J")
    public static long method40() {
        try {
            URL var0 = new URL(client.method2216("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class530 var4 = new class530(new byte[1000]);
            do {
                int var5 = var3.read(var4.field5139, var4.field5140, 1000 - var4.field5140);
                if (var5 == -1) {
                    var4.field5140 = 0;
                    return var4.method8573();
                }
                var4.field5140 += var5;
            } while (var4.field5140 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("gh.al(JLjava/lang/String;I)I")
    public static final int method3269(long arg0, String arg1) {
        Random var3 = new Random();
        class530 var4 = new class530(128);
        class530 var5 = new class530(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method8348(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method8351(var3.nextInt());
        }
        var4.method8351(var6[0]);
        var4.method8351(var6[1]);
        var4.method8367(arg0);
        var4.method8367(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method8351(var3.nextInt());
        }
        var4.method8430(field907, field908);
        var5.method8348(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method8351(var3.nextInt());
        }
        var5.method8367(var3.nextLong());
        var5.method8408(var3.nextLong());
        if (client.field821 == null) {
            byte[] var10 = class176.method2874();
            var5.method8412(var10, 0, var10.length);
        } else {
            var5.method8412(client.field821, 0, client.field821.length);
        }
        var5.method8367(var3.nextLong());
        var5.method8430(field907, field908);
        int var11 = class530.method7740(arg1);
        if (var11 % 8 != 0) {
            var11 += 8 - var11 % 8;
        }
        class530 var12 = new class530(var11);
        var12.method8374(arg1);
        var12.field5140 = var11;
        var12.method8388(var6);
        class530 var13 = new class530(var12.field5140 + var5.field5140 + var4.field5140 + 5);
        var13.method8348(2);
        var13.method8348(var4.field5140);
        var13.method8412(var4.field5139, 0, var4.field5140);
        var13.method8348(var5.field5140);
        var13.method8412(var5.field5139, 0, var5.field5140);
        var13.method8349(var12.field5140);
        var13.method8412(var12.field5139, 0, var12.field5140);
        String var14 = class401.method4056(var13.field5139);
        try {
            URL var15 = new URL(client.method2216("services", false) + "m=accountappeal/login.ws");
            URLConnection var16 = var15.openConnection();
            var16.setDoInput(true);
            var16.setDoOutput(true);
            var16.setConnectTimeout(5000);
            OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
            var17.write("data2=" + class555.method7150(var14) + "&dest=" + class555.method7150("passwordchoice.ws"));
            var17.flush();
            InputStream var18 = var16.getInputStream();
            class530 var19 = new class530(new byte[1000]);
            do {
                int var20 = var18.read(var19.field5139, var19.field5140, 1000 - var19.field5140);
                if (var20 == -1) {
                    var17.close();
                    var18.close();
                    String var21 = new String(var19.field5139);
                    if (var21.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var21.startsWith("WRONG")) {
                        return 7;
                    } else if (var21.startsWith("RELOAD")) {
                        return 3;
                    } else if (var21.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var19.method8389(var6);
                        while (var19.field5140 > 0 && var19.field5139[var19.field5140 - 1] == 0) {
                            var19.field5140--;
                        }
                        String var22 = new String(var19.field5139, 0, var19.field5140);
                        if (method3820(var22)) {
                            class32.method4708(var22, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var19.field5140 += var20;
            } while (var19.field5140 < 1000);
            return 5;
        } catch (Throwable var24) {
            var24.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("iy.ak(Ljava/lang/String;S)Z")
    public static boolean method3820(String arg0) {
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
