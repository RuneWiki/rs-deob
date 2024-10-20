package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("bv")
public class class66 {

    @ObfuscatedName("bv.o")
    public static final BigInteger field823 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("bv.g")
    public static final BigInteger field824 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class66() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.i(I)J")
    public static long method780() {
        try {
            URL var0 = new URL(client.method2130("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class401 var4 = new class401(new byte[1000]);
            do {
                int var5 = var3.read(var4.field4302, var4.field4300, 1000 - var4.field4300);
                if (var5 == -1) {
                    var4.field4300 = 0;
                    return var4.method6249();
                }
                var4.field4300 += var5;
            } while (var4.field4300 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("w.w(JLjava/lang/String;I)I")
    public static final int method16(long arg0, String arg1) {
        Random var3 = new Random();
        class401 var4 = new class401(128);
        class401 var5 = new class401(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method6223(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method6292(var3.nextInt());
        }
        var4.method6292(var6[0]);
        var4.method6292(var6[1]);
        var4.method6401(arg0);
        var4.method6401(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method6292(var3.nextInt());
        }
        var4.method6263(field823, field824);
        var5.method6223(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method6292(var3.nextInt());
        }
        var5.method6401(var3.nextLong());
        var5.method6227(var3.nextLong());
        if (client.field509 == null) {
            byte[] var10 = class144.method1675();
            var5.method6233(var10, 0, var10.length);
        } else {
            var5.method6233(client.field509, 0, client.field509.length);
        }
        var5.method6401(var3.nextLong());
        var5.method6263(field823, field824);
        int var11 = Statics.method1282(arg1);
        if (var11 % 8 != 0) {
            var11 += 8 - var11 % 8;
        }
        class401 var12 = new class401(var11);
        var12.method6230(arg1);
        var12.field4300 = var11;
        var12.method6259(var6);
        class401 var13 = new class401(var12.field4300 + var5.field4300 + var4.field4300 + 5);
        var13.method6223(2);
        var13.method6223(var4.field4300);
        var13.method6233(var4.field4302, 0, var4.field4300);
        var13.method6223(var5.field4300);
        var13.method6233(var5.field4302, 0, var5.field4300);
        var13.method6224(var12.field4300);
        var13.method6233(var12.field4302, 0, var12.field4300);
        String var14 = class318.method2398(var13.field4302);
        try {
            URL var15 = new URL(client.method2130("services", false) + "m=accountappeal/login.ws");
            URLConnection var16 = var15.openConnection();
            var16.setDoInput(true);
            var16.setDoOutput(true);
            var16.setConnectTimeout(5000);
            OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
            String var19 = "data2=" + Statics.method5720(var14) + "&dest=";
            int var20 = "passwordchoice.ws".length();
            StringBuilder var21 = new StringBuilder(var20);
            for (int var22 = 0; var22 < var20; var22++) {
                char var23 = "passwordchoice.ws".charAt(var22);
                if (!(var23 < 'a' || var23 > 'z') || !(var23 < 'A' || var23 > 'Z') || !(var23 < '0' || var23 > '9') || var23 == '.' || var23 == '-' || var23 == '*' || var23 == '_') {
                    var21.append(var23);
                } else if (var23 == ' ') {
                    var21.append('+');
                } else {
                    byte var24 = Statics.method5595(var23);
                    var21.append('%');
                    int var25 = var24 >> 4 & 0xF;
                    if (var25 >= 10) {
                        var21.append((char) (var25 + 55));
                    } else {
                        var21.append((char) (var25 + 48));
                    }
                    int var26 = var24 & 0xF;
                    if (var26 >= 10) {
                        var21.append((char) (var26 + 55));
                    } else {
                        var21.append((char) (var26 + 48));
                    }
                }
            }
            String var27 = var21.toString();
            var17.write(var19 + var27);
            var17.flush();
            InputStream var28 = var16.getInputStream();
            class401 var29 = new class401(new byte[1000]);
            do {
                int var30 = var28.read(var29.field4302, var29.field4300, 1000 - var29.field4300);
                if (var30 == -1) {
                    var17.close();
                    var28.close();
                    String var31 = new String(var29.field4302);
                    if (var31.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var31.startsWith("WRONG")) {
                        return 7;
                    } else if (var31.startsWith("RELOAD")) {
                        return 3;
                    } else if (var31.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var29.method6260(var6);
                        while (var29.field4300 > 0 && var29.field4302[var29.field4300 - 1] == 0) {
                            var29.field4300--;
                        }
                        String var32 = new String(var29.field4302, 0, var29.field4300);
                        if (method4027(var32)) {
                            class30.method2146(var32, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var29.field4300 += var30;
            } while (var29.field4300 < 1000);
            return 5;
        } catch (Throwable var34) {
            var34.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("hw.s(Ljava/lang/String;I)Z")
    public static boolean method4027(String arg0) {
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
