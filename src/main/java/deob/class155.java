package deob;

import java.io.DataInputStream;
import java.net.URL;

@ObfuscatedName("ey")
public class class155 extends RuntimeException {

    @ObfuscatedName("ey.r")
    public String field2137;

    @ObfuscatedName("ey.h")
    public Throwable field2140;

    public class155(Throwable arg0, String arg1) {
        this.field2137 = arg1;
        this.field2140 = arg0;
    }

    @ObfuscatedName("kk.n(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static void method4721(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                var2 = Statics.method1973(arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var2 = var2 + " | ";
                }
                var2 = var2 + arg0;
            }
            System.out.println("Error: " + var2);
            String var3 = var2.replace(':', '.');
            String var4 = var3.replace('@', '_');
            String var5 = var4.replace('&', '_');
            String var6 = var5.replace('#', '_');
            if (Statics.field2141 == null) {
                return;
            }
            URL var7 = new URL(Statics.field2141.getCodeBase(), "clienterror.ws?c=" + Statics.field301 + "&u=" + Statics.field2138 + "&v1=" + Statics.field2158 + "&v2=" + Statics.field2153 + "&e=" + var6);
            DataInputStream var8 = new DataInputStream(var7.openStream());
            var8.read();
            var8.close();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("f.v(Ljava/lang/Throwable;Ljava/lang/String;)Ley;")
    public static class155 method37(Throwable arg0, String arg1) {
        class155 var2;
        if (arg0 instanceof class155) {
            var2 = (class155) arg0;
            var2.field2137 = var2.field2137 + ' ' + arg1;
        } else {
            var2 = new class155(arg0, arg1);
        }
        return var2;
    }
}
