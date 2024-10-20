package deob;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

@ObfuscatedName("ed")
public class class135 extends RuntimeException {

    @ObfuscatedName("ed.g")
    public String field2081;

    @ObfuscatedName("ed.u")
    public Throwable field2080;

    public class135(Throwable arg0, String arg1) {
        this.field2081 = arg1;
        this.field2080 = arg0;
    }

    @ObfuscatedName("l.e(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static void method95(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                var2 = method918(arg1);
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
            if (Statics.field2083 == null) {
                return;
            }
            URL var7 = new URL(Statics.field2083.getCodeBase(), "clienterror.ws?c=" + Statics.field2079 + "&u=" + Statics.field2078 + "&v1=" + Statics.field1940 + "&v2=" + Statics.field1939 + "&e=" + var6);
            DataInputStream var8 = new DataInputStream(var7.openStream());
            var8.read();
            var8.close();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("bw.p(Ljava/lang/Throwable;Ljava/lang/String;)Led;")
    public static class135 method1346(Throwable arg0, String arg1) {
        class135 var2;
        if (arg0 instanceof class135) {
            var2 = (class135) arg0;
            var2.field2081 = var2.field2081 + ' ' + arg1;
        } else {
            var2 = new class135(arg0, arg1);
        }
        return var2;
    }

    @ObfuscatedName("al.a(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static String method918(Throwable arg0) throws IOException {
        String var2;
        if (arg0 instanceof class135) {
            class135 var1 = (class135) arg0;
            var2 = var1.field2081 + " | ";
            arg0 = var1.field2080;
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
