package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

@ObfuscatedName("fp")
public class class170 extends RuntimeException {

    @ObfuscatedName("fp.o")
    public String field2499;

    @ObfuscatedName("fp.c")
    public Throwable field2500;

    public class170(Throwable arg0, String arg1) {
        this.field2499 = arg1;
        this.field2500 = arg0;
    }

    @ObfuscatedName("fw.l(Ljava/lang/Throwable;Ljava/lang/String;)Lfp;")
    public static class170 method2572(Throwable arg0, String arg1) {
        class170 var2;
        if (arg0 instanceof class170) {
            var2 = (class170) arg0;
            var2.field2499 = var2.field2499 + ' ' + arg1;
        } else {
            var2 = new class170(arg0, arg1);
        }
        return var2;
    }

    @ObfuscatedName("eu.a(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static String method2450(Throwable arg0) throws IOException {
        String var2;
        if (arg0 instanceof class170) {
            class170 var1 = (class170) arg0;
            var2 = var1.field2499 + " | ";
            arg0 = var1.field2500;
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
