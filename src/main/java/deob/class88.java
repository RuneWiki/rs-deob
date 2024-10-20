package deob;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("ct")
public class class88 {

    @ObfuscatedName("ct.g")
    public static final BigInteger field1363 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("ct.m")
    public static final BigInteger field1364 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class88() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.c(Ljava/lang/String;B)Z")
    public static boolean method646(String arg0) {
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
