package deob;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("bn")
public class class66 {

    @ObfuscatedName("bn.o")
    public static final BigInteger field850 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

    @ObfuscatedName("bn.g")
    public static final BigInteger field854 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    public class66() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gb.n(Ljava/lang/String;I)Z")
    public static boolean method3561(String arg0) {
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
