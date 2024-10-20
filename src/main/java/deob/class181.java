package deob;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@ObfuscatedName("fr")
public class class181 {

    @ObfuscatedName("fr.p")
    public static class176 field2824 = new class176();

    public class181() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ac.p(I)V")
    public static void method650() {
        field2824 = new class176();
    }

    @ObfuscatedName("t.w(Ldv;IB)V")
    public static void method220(class126 arg0, int arg1) {
        class180 var2 = new class180();
        var2.field2816 = arg0.method2544();
        var2.field2815 = arg0.method2380();
        var2.field2817 = new int[var2.field2816];
        var2.field2818 = new int[var2.field2816];
        var2.field2819 = new Field[var2.field2816];
        var2.field2820 = new int[var2.field2816];
        var2.field2821 = new Method[var2.field2816];
        var2.field2822 = new byte[var2.field2816][][];
        for (int var3 = 0; var3 < var2.field2816; var3++) {
            try {
                int var4 = arg0.method2544();
                if (var4 == 0 || var4 == 1 || var4 == 2) {
                    String var5 = new String(arg0.method2383());
                    String var6 = new String(arg0.method2383());
                    int var7 = 0;
                    if (var4 == 1) {
                        var7 = arg0.method2380();
                    }
                    var2.field2817[var3] = var4;
                    var2.field2820[var3] = var7;
                    var2.field2819[var3] = method1994(var5).getDeclaredField(var6);
                } else if (var4 == 3 || var4 == 4) {
                    String var8 = new String(arg0.method2383());
                    String var9 = new String(arg0.method2383());
                    int var10 = arg0.method2544();
                    String[] var11 = new String[var10];
                    for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = new String(arg0.method2383());
                    }
                    byte[][] var13 = new byte[var10][];
                    if (var4 == 3) {
                        for (int var14 = 0; var14 < var10; var14++) {
                            int var15 = arg0.method2380();
                            var13[var14] = new byte[var15];
                            arg0.method2576(var13[var14], 0, var15);
                        }
                    }
                    var2.field2817[var3] = var4;
                    Class[] var16 = new Class[var10];
                    for (int var17 = 0; var17 < var10; var17++) {
                        var16[var17] = method1994(var11[var17]);
                    }
                    var2.field2821[var3] = method1994(var8).getDeclaredMethod(var9, var16);
                    var2.field2822[var3] = var13;
                }
            } catch (ClassNotFoundException var23) {
                var2.field2818[var3] = -1;
            } catch (SecurityException var24) {
                var2.field2818[var3] = -2;
            } catch (NullPointerException var25) {
                var2.field2818[var3] = -3;
            } catch (Exception var26) {
                var2.field2818[var3] = -4;
            } catch (Throwable var27) {
                var2.field2818[var3] = -5;
            }
        }
        field2824.method3305(var2);
    }

    @ObfuscatedName("ce.h(Ljava/lang/String;I)Ljava/lang/Class;")
    public static Class method1994(String arg0) throws ClassNotFoundException {
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
