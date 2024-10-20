package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cm")
public class class73 {

    @ObfuscatedName("cm.aq")
    public static final BigInteger field880 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cm.ar")
    public static final BigInteger field881 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class73() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hr.am(I)J")
    public static long method3394() {
        try {
            URL var0 = new URL(client.method2283("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class531 var4 = new class531(new byte[1000]);
            do {
                int var5 = var3.read(var4.field5178, var4.field5181, 1000 - var4.field5181);
                if (var5 == -1) {
                    var4.field5181 = 0;
                    return var4.method8567();
                }
                var4.field5181 += var5;
            } while (var4.field5181 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("an.ap(JLjava/lang/String;I)I")
    public static final int method96(long arg0, String arg1) {
        Random var3 = new Random();
        class531 var4 = new class531(128);
        class531 var5 = new class531(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method8699(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method8547(var3.nextInt());
        }
        var4.method8547(var6[0]);
        var4.method8547(var6[1]);
        var4.method8651(arg0);
        var4.method8651(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method8547(var3.nextInt());
        }
        var4.method8587(field880, field881);
        var5.method8699(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method8547(var3.nextInt());
        }
        var5.method8651(var3.nextLong());
        var5.method8548(var3.nextLong());
        client.method165(var5);
        var5.method8651(var3.nextLong());
        var5.method8587(field880, field881);
        int var10 = class531.method4114(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class531 var11 = new class531(var10);
        var11.method8551(arg1);
        var11.field5181 = var10;
        var11.method8614(var6);
        class531 var12 = new class531(var11.field5181 + var5.field5181 + var4.field5181 + 5);
        var12.method8699(2);
        var12.method8699(var4.field5181);
        var12.method8554(var4.field5178, 0, var4.field5181);
        var12.method8699(var5.field5181);
        var12.method8554(var5.field5178, 0, var5.field5181);
        var12.method8737(var11.field5181);
        var12.method8554(var11.field5178, 0, var11.field5181);
        byte[] var13 = var12.field5178;
        String var14 = class402.method3731(var13, 0, var13.length);
        String var15 = var14;
        try {
            URL var16 = new URL(client.method2283("services", false) + "m=accountappeal/login.ws");
            URLConnection var17 = var16.openConnection();
            var17.setDoInput(true);
            var17.setDoOutput(true);
            var17.setConnectTimeout(5000);
            OutputStreamWriter var18 = new OutputStreamWriter(var17.getOutputStream());
            int var20 = var15.length();
            StringBuilder var21 = new StringBuilder(var20);
            for (int var22 = 0; var22 < var20; var22++) {
                char var23 = var15.charAt(var22);
                if (!(var23 < 'a' || var23 > 'z') || !(var23 < 'A' || var23 > 'Z') || !(var23 < '0' || var23 > '9') || var23 == '.' || var23 == '-' || var23 == '*' || var23 == '_') {
                    var21.append(var23);
                } else if (var23 == ' ') {
                    var21.append('+');
                } else {
                    byte var24 = class401.method3088(var23);
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
            String var28 = "data2=" + var27 + "&dest=";
            int var29 = "passwordchoice.ws".length();
            StringBuilder var30 = new StringBuilder(var29);
            for (int var31 = 0; var31 < var29; var31++) {
                char var32 = "passwordchoice.ws".charAt(var31);
                if (!(var32 < 'a' || var32 > 'z') || !(var32 < 'A' || var32 > 'Z') || !(var32 < '0' || var32 > '9') || var32 == '.' || var32 == '-' || var32 == '*' || var32 == '_') {
                    var30.append(var32);
                } else if (var32 == ' ') {
                    var30.append('+');
                } else {
                    byte var33 = class401.method3088(var32);
                    var30.append('%');
                    int var34 = var33 >> 4 & 0xF;
                    if (var34 >= 10) {
                        var30.append((char) (var34 + 55));
                    } else {
                        var30.append((char) (var34 + 48));
                    }
                    int var35 = var33 & 0xF;
                    if (var35 >= 10) {
                        var30.append((char) (var35 + 55));
                    } else {
                        var30.append((char) (var35 + 48));
                    }
                }
            }
            String var36 = var30.toString();
            var18.write(var28 + var36);
            var18.flush();
            InputStream var37 = var17.getInputStream();
            class531 var38 = new class531(new byte[1000]);
            do {
                int var39 = var37.read(var38.field5178, var38.field5181, 1000 - var38.field5181);
                if (var39 == -1) {
                    var18.close();
                    var37.close();
                    String var40 = new String(var38.field5178);
                    if (var40.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var40.startsWith("WRONG")) {
                        return 7;
                    } else if (var40.startsWith("RELOAD")) {
                        return 3;
                    } else if (var40.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var38.method8542(var6);
                        while (var38.field5181 > 0 && var38.field5178[var38.field5181 - 1] == 0) {
                            var38.field5181--;
                        }
                        String var41 = new String(var38.field5178, 0, var38.field5181);
                        if (method2060(var41)) {
                            class32.method3975(var41, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var38.field5181 += var39;
            } while (var38.field5181 < 1000);
            return 5;
        } catch (Throwable var43) {
            var43.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("ck.af(Ljava/lang/String;B)Z")
    public static boolean method2060(String arg0) {
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
