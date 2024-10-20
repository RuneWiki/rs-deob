package deob;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@ObfuscatedName("fl")
public class class182 {

    @ObfuscatedName("fl.b")
    public static class177 field2841 = new class177();

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ee.b(I)V")
    public static void method2725() {
        field2841 = new class177();
    }

    @ObfuscatedName("k.j(Ldv;II)V")
    public static void method39(class127 arg0, int arg1) {
        class181 var2 = new class181();
        var2.field2836 = arg0.method2416();
        var2.field2837 = arg0.method2455();
        var2.field2833 = new int[var2.field2836];
        var2.field2834 = new int[var2.field2836];
        var2.field2835 = new Field[var2.field2836];
        var2.field2831 = new int[var2.field2836];
        var2.field2832 = new Method[var2.field2836];
        var2.field2838 = new byte[var2.field2836][][];
        for (int var3 = 0; var3 < var2.field2836; var3++) {
            try {
                int var4 = arg0.method2416();
                if (var4 == 0 || var4 == 1 || var4 == 2) {
                    String var5 = new String(arg0.method2473());
                    String var6 = new String(arg0.method2473());
                    int var7 = 0;
                    if (var4 == 1) {
                        var7 = arg0.method2455();
                    }
                    var2.field2833[var3] = var4;
                    var2.field2831[var3] = var7;
                    var2.field2835[var3] = method225(var5).getDeclaredField(var6);
                } else if (var4 == 3 || var4 == 4) {
                    String var8 = new String(arg0.method2473());
                    String var9 = new String(arg0.method2473());
                    int var10 = arg0.method2416();
                    String[] var11 = new String[var10];
                    for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = new String(arg0.method2473());
                    }
                    byte[][] var13 = new byte[var10][];
                    if (var4 == 3) {
                        for (int var14 = 0; var14 < var10; var14++) {
                            int var15 = arg0.method2455();
                            var13[var14] = new byte[var15];
                            arg0.method2407(var13[var14], 0, var15);
                        }
                    }
                    var2.field2833[var3] = var4;
                    Class[] var16 = new Class[var10];
                    for (int var17 = 0; var17 < var10; var17++) {
                        var16[var17] = method225(var11[var17]);
                    }
                    var2.field2832[var3] = method225(var8).getDeclaredMethod(var9, var16);
                    var2.field2838[var3] = var13;
                }
            } catch (ClassNotFoundException var23) {
                var2.field2834[var3] = -1;
            } catch (SecurityException var24) {
                var2.field2834[var3] = -2;
            } catch (NullPointerException var25) {
                var2.field2834[var3] = -3;
            } catch (Exception var26) {
                var2.field2834[var3] = -4;
            } catch (Throwable var27) {
                var2.field2834[var3] = -5;
            }
        }
        field2841.method3261(var2);
    }

    @ObfuscatedName("h.i(Ljava/lang/String;I)Ljava/lang/Class;")
    public static Class method225(String arg0) throws ClassNotFoundException {
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }
}
