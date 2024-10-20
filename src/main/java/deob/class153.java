package deob;

import java.io.DataInputStream;
import java.net.URL;

@ObfuscatedName("ej")
public class class153 extends RuntimeException {

    @ObfuscatedName("ej.p")
    public String field2227;

    @ObfuscatedName("ej.q")
    public Throwable field2233;

    public class153(Throwable arg0, String arg1) {
        this.field2227 = arg1;
        this.field2233 = arg0;
    }

    @ObfuscatedName("cc.d(Ljava/lang/String;Ljava/lang/Throwable;B)V")
    public static void method1775(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                var2 = Statics.method1613(arg1);
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
            if (Statics.field2231 == null) {
                return;
            }
            URL var7 = new URL(Statics.field2231.getCodeBase(), "clienterror.ws?c=" + Statics.field2224 + "&u=" + Statics.field2225 + "&v1=" + Statics.field2248 + "&v2=" + Statics.field2244 + "&e=" + var6);
            DataInputStream var8 = new DataInputStream(var7.openStream());
            var8.read();
            var8.close();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("bu.k(Ljava/lang/Throwable;Ljava/lang/String;)Lej;")
    public static class153 method1035(Throwable arg0, String arg1) {
        class153 var2;
        if (arg0 instanceof class153) {
            var2 = (class153) arg0;
            var2.field2227 = var2.field2227 + ' ' + arg1;
        } else {
            var2 = new class153(arg0, arg1);
        }
        return var2;
    }
}
