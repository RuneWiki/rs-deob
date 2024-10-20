package deob;

import java.io.DataInputStream;
import java.net.URL;

@ObfuscatedName("cj")
public class class79 extends RuntimeException {

    @ObfuscatedName("cj.j")
    public String field1406;

    @ObfuscatedName("cj.i")
    public Throwable field1407;

    public class79(Throwable arg0, String arg1) {
        this.field1406 = arg1;
        this.field1407 = arg0;
    }

    @ObfuscatedName("s.g(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static void method126(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                var2 = Statics.method896(arg1);
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
            if (Statics.field1411 == null) {
                return;
            }
            URL var7 = new URL(Statics.field1411.getCodeBase(), "clienterror.ws?c=" + Statics.field1405 + "&u=" + Statics.field1404 + "&v1=" + Statics.field1335 + "&v2=" + Statics.field1321 + "&e=" + var6);
            DataInputStream var8 = new DataInputStream(var7.openStream());
            var8.read();
            var8.close();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("cr.e(Ljava/lang/Throwable;Ljava/lang/String;)Lcj;")
    public static class79 method2062(Throwable arg0, String arg1) {
        class79 var2;
        if (arg0 instanceof class79) {
            var2 = (class79) arg0;
            var2.field1406 = var2.field1406 + ' ' + arg1;
        } else {
            var2 = new class79(arg0, arg1);
        }
        return var2;
    }
}
