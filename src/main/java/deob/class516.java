package deob;

import java.io.DataInputStream;
import java.net.URL;

@ObfuscatedName("tr")
public class class516 extends RuntimeException {

    @ObfuscatedName("tr.ab")
    public String field5158;

    @ObfuscatedName("tr.aq")
    public Throwable field5156;

    public class516(Throwable arg0, String arg1) {
        this.field5158 = arg1;
        this.field5156 = arg0;
    }

    @ObfuscatedName("ob.af(Ljava/lang/String;Ljava/lang/Throwable;B)V")
    public static void method6950(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                var2 = Statics.method3941(arg1);
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
            if (Statics.field1322 == null) {
                return;
            }
            URL var7 = new URL(Statics.field1322.getCodeBase(), "clienterror.ws?cv=" + Statics.field5155 + "&cs=" + Statics.field4732 + "&u=" + Statics.field5159 + "&v1=" + Statics.field1817 + "&v2=" + Statics.field1818 + "&ct=" + Statics.field5157 + "&e=" + var6);
            DataInputStream var8 = new DataInputStream(var7.openStream());
            var8.read();
            var8.close();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("db.an(Ljava/lang/Throwable;Ljava/lang/String;)Ltr;")
    public static class516 method2434(Throwable arg0, String arg1) {
        class516 var2;
        if (arg0 instanceof class516) {
            var2 = (class516) arg0;
            var2.field5158 = var2.field5158 + ' ' + arg1;
        } else {
            var2 = new class516(arg0, arg1);
        }
        return var2;
    }
}
