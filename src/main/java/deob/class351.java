package deob;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

@ObfuscatedName("mr")
public class class351 extends RuntimeException {

    @ObfuscatedName("mr.p")
    public String field4069;

    @ObfuscatedName("mr.g")
    public Throwable field4073;

    public class351(Throwable arg0, String arg1) {
        this.field4069 = arg1;
        this.field4073 = arg0;
    }

    @ObfuscatedName("gg.m(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static void method3425(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                var2 = method5767(arg1);
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
            if (Statics.field4074 == null) {
                return;
            }
            URL var7 = new URL(Statics.field4074.getCodeBase(), "clienterror.ws?c=" + Statics.field4071 + "&u=" + Statics.field4070 + "&v1=" + Statics.field2066 + "&v2=" + Statics.field2057 + "&ct=" + Statics.field4072 + "&e=" + var6);
            DataInputStream var8 = new DataInputStream(var7.openStream());
            var8.read();
            var8.close();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("o.o(Ljava/lang/Throwable;Ljava/lang/String;)Lmr;")
    public static class351 method15(Throwable arg0, String arg1) {
        class351 var2;
        if (arg0 instanceof class351) {
            var2 = (class351) arg0;
            var2.field4069 = var2.field4069 + ' ' + arg1;
        } else {
            var2 = new class351(arg0, arg1);
        }
        return var2;
    }

    @ObfuscatedName("lw.q(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static String method5767(Throwable arg0) throws IOException {
        String var2;
        if (arg0 instanceof class351) {
            class351 var1 = (class351) arg0;
            var2 = var1.field4069 + " | ";
            arg0 = var1.field4073;
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
