package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

@ObfuscatedName("cv")
public class class81 {

    @ObfuscatedName("cv.z")
    public static final BigInteger field1130 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("cv.p")
    public static final BigInteger field1131 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class81() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bd.u(B)J")
    public static long method1011() {
        try {
            URL var0 = new URL(client.method5119("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class300 var4 = new class300(new byte[1000]);
            do {
                int var5 = var3.read(var4.field3708, var4.field3707, 1000 - var4.field3707);
                if (var5 == -1) {
                    var4.field3707 = 0;
                    return var4.method5144();
                }
                var4.field3707 += var5;
            } while (var4.field3707 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("am.f(Ljava/lang/String;B)Z")
    public static boolean method368(String arg0) {
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
