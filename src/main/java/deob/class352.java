package deob;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

@ObfuscatedName("mr")
public class class352 extends RuntimeException {

    @ObfuscatedName("mr.y")
    public String field4083;

    @ObfuscatedName("mr.h")
    public Throwable field4085;

    public class352(Throwable arg0, String arg1) {
        this.field4083 = arg1;
        this.field4085 = arg0;
    }

    @ObfuscatedName("js.n(Ljava/lang/String;Ljava/lang/Throwable;B)V")
    public static void method4617(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                var2 = method3964(arg1);
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
            if (Statics.field4086 == null) {
                return;
            }
            URL var7 = new URL(Statics.field4086.getCodeBase(), "clienterror.ws?c=" + Statics.field4084 + "&u=" + Statics.field8 + "&v1=" + Statics.field2048 + "&v2=" + Statics.field2050 + "&ct=" + Statics.field2534 + "&e=" + var6);
            DataInputStream var8 = new DataInputStream(var7.openStream());
            var8.read();
            var8.close();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("kb.v(Ljava/lang/Throwable;Ljava/lang/String;)Lmr;")
    public static class352 method5029(Throwable arg0, String arg1) {
        class352 var2;
        if (arg0 instanceof class352) {
            var2 = (class352) arg0;
            var2.field4083 = var2.field4083 + ' ' + arg1;
        } else {
            var2 = new class352(arg0, arg1);
        }
        return var2;
    }

    @ObfuscatedName("ib.d(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static String method3964(Throwable arg0) throws IOException {
        String var2;
        if (arg0 instanceof class352) {
            class352 var1 = (class352) arg0;
            var2 = var1.field4083 + " | ";
            arg0 = var1.field4085;
        } else {
            var2 = "";
        }
        StringWriter var3 = new StringWriter();
        PrintWriter var4 = new PrintWriter(var3);
        arg0.printStackTrace(var4);
        var4.close();
        String var5 = var3.toString();
        BufferedReader var6 = new BufferedReader(new StringReader(var5));
        String var7 = var6.readLine();
        while (true) {
            while (true) {
                String var8 = var6.readLine();
                if (var8 == null) {
                    return var2 + "| " + var7;
                }
                int var10 = var8.indexOf(40);
                int var11 = var8.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var8.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var8 = var8.substring(0, var10);
                }
                String var15 = var8.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }
}
