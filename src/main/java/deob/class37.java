package deob;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("ao")
public class class37 {

    @ObfuscatedName("ao.y")
    public static final BigInteger field765 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("ao.j")
    public static final BigInteger field764 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cm.b(Ljava/lang/String;I)Z")
    public static boolean method1853(String arg0) {
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
