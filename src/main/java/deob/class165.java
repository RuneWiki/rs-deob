package deob;

import java.io.DataInputStream;
import java.net.URL;

@ObfuscatedName("fn")
public class class165 extends RuntimeException {

    @ObfuscatedName("fn.h")
    public String field2198;

    @ObfuscatedName("fn.m")
    public Throwable field2196;

    public class165(Throwable arg0, String arg1) {
        this.field2198 = arg1;
        this.field2196 = arg0;
    }

    @ObfuscatedName("ci.o(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static void method1744(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                var2 = Statics.method4150(arg1);
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
            if (Statics.field2199 == null) {
                return;
            }
            URL var7 = new URL(Statics.field2199.getCodeBase(), "clienterror.ws?c=" + Statics.field2197 + "&u=" + Statics.field2195 + "&v1=" + Statics.field2215 + "&v2=" + Statics.field2210 + "&e=" + var6);
            DataInputStream var8 = new DataInputStream(var7.openStream());
            var8.read();
            var8.close();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("ar.k(Ljava/lang/Throwable;Ljava/lang/String;)Lfn;")
    public static class165 method576(Throwable arg0, String arg1) {
        class165 var2;
        if (arg0 instanceof class165) {
            var2 = (class165) arg0;
            var2.field2198 = var2.field2198 + ' ' + arg1;
        } else {
            var2 = new class165(arg0, arg1);
        }
        return var2;
    }
}
