package deob;

import java.io.DataInputStream;
import java.net.URL;

@ObfuscatedName("ec")
public class class139 extends RuntimeException {

    @ObfuscatedName("ec.c")
    public String field2083;

    @ObfuscatedName("ec.r")
    public Throwable field2080;

    public class139(Throwable arg0, String arg1) {
        this.field2083 = arg1;
        this.field2080 = arg0;
    }

    @ObfuscatedName("da.p(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static void method2074(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                var2 = Statics.method2476(arg1);
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
            if (Statics.field2089 == null) {
                return;
            }
            URL var7 = new URL(Statics.field2089.getCodeBase(), "clienterror.ws?c=" + Statics.field2082 + "&u=" + Statics.field2081 + "&v1=" + Statics.field1756 + "&v2=" + Statics.field3045 + "&e=" + var6);
            DataInputStream var8 = new DataInputStream(var7.openStream());
            var8.read();
            var8.close();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("dv.y(Ljava/lang/Throwable;Ljava/lang/String;)Lec;")
    public static class139 method2478(Throwable arg0, String arg1) {
        class139 var2;
        if (arg0 instanceof class139) {
            var2 = (class139) arg0;
            var2.field2083 = var2.field2083 + ' ' + arg1;
        } else {
            var2 = new class139(arg0, arg1);
        }
        return var2;
    }
}
