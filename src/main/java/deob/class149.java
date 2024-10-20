package deob;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

@ObfuscatedName("ef")
public class class149 extends RuntimeException {

    @ObfuscatedName("ef.c")
    public String field2226;

    @ObfuscatedName("ef.y")
    public Throwable field2220;

    public class149(Throwable arg0, String arg1) {
        this.field2226 = arg1;
        this.field2220 = arg0;
    }

    @ObfuscatedName("b.a(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static void method650(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                var2 = method829(arg1);
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
            if (Statics.field2042 == null) {
                return;
            }
            URL var7 = new URL(Statics.field2042.getCodeBase(), "clienterror.ws?c=" + Statics.field2218 + "&u=" + Statics.field2217 + "&v1=" + Statics.field2097 + "&v2=" + Statics.field2093 + "&e=" + var6);
            DataInputStream var8 = new DataInputStream(var7.openStream());
            var8.read();
            var8.close();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("at.d(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static String method829(Throwable arg0) throws IOException {
        String var2;
        if (arg0 instanceof class149) {
            class149 var1 = (class149) arg0;
            var2 = var1.field2226 + " | ";
            arg0 = var1.field2220;
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
