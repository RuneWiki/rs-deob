package deob;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@ObfuscatedName("gs")
public class class192 {

    @ObfuscatedName("gs.l")
    public static class183 field2901 = new class183();

    public class192() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.l(S)V")
    public static void method35() {
        field2901 = new class183();
    }

    @ObfuscatedName("v.y(I)Z")
    public static boolean method501() {
        class191 var0 = (class191) field2901.method3331();
        return var0 != null;
    }

    @ObfuscatedName("cs.j(Ldk;IB)V")
    public static void method1783(class108 arg0, int arg1) {
        class191 var2 = new class191();
        var2.field2891 = arg0.method2291();
        var2.field2892 = arg0.method2297();
        var2.field2893 = new int[var2.field2891];
        var2.field2894 = new int[var2.field2891];
        var2.field2896 = new Field[var2.field2891];
        var2.field2895 = new int[var2.field2891];
        var2.field2897 = new Method[var2.field2891];
        var2.field2898 = new byte[var2.field2891][][];
        for (int var3 = 0; var3 < var2.field2891; var3++) {
            try {
                int var4 = arg0.method2291();
                if (var4 == 0 || var4 == 1 || var4 == 2) {
                    String var5 = arg0.method2168();
                    String var6 = arg0.method2168();
                    int var7 = 0;
                    if (var4 == 1) {
                        var7 = arg0.method2297();
                    }
                    var2.field2893[var3] = var4;
                    var2.field2895[var3] = var7;
                    if (method2839(var5).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field2896[var3] = method2839(var5).getDeclaredField(var6);
                } else if (var4 == 3 || var4 == 4) {
                    String var8 = arg0.method2168();
                    String var9 = arg0.method2168();
                    int var10 = arg0.method2291();
                    String[] var11 = new String[var10];
                    for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = arg0.method2168();
                    }
                    String var13 = arg0.method2168();
                    byte[][] var14 = new byte[var10][];
                    if (var4 == 3) {
                        for (int var15 = 0; var15 < var10; var15++) {
                            int var16 = arg0.method2297();
                            var14[var15] = new byte[var16];
                            arg0.method2171(var14[var15], 0, var16);
                        }
                    }
                    var2.field2893[var3] = var4;
                    Class[] var17 = new Class[var10];
                    for (int var18 = 0; var18 < var10; var18++) {
                        var17[var18] = method2839(var11[var18]);
                    }
                    Class var19 = method2839(var13);
                    if (method2839(var8).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    Method[] var20 = method2839(var8).getDeclaredMethods();
                    Method[] var21 = var20;
                    for (int var22 = 0; var22 < var21.length; var22++) {
                        Method var23 = var21[var22];
                        if (var23.getName().equals(var9)) {
                            Class[] var24 = var23.getParameterTypes();
                            if (var17.length == var24.length) {
                                boolean var25 = true;
                                for (int var26 = 0; var26 < var17.length; var26++) {
                                    if (var17[var26] != var24[var26]) {
                                        var25 = false;
                                        break;
                                    }
                                }
                                if (var25 && var19 == var23.getReturnType()) {
                                    var2.field2897[var3] = var23;
                                }
                            }
                        }
                    }
                    var2.field2898[var3] = var14;
                }
            } catch (ClassNotFoundException var32) {
                var2.field2894[var3] = -1;
            } catch (SecurityException var33) {
                var2.field2894[var3] = -2;
            } catch (NullPointerException var34) {
                var2.field2894[var3] = -3;
            } catch (Exception var35) {
                var2.field2894[var3] = -4;
            } catch (Throwable var36) {
                var2.field2894[var3] = -5;
            }
        }
        field2901.method3322(var2);
    }

    @ObfuscatedName("ew.w(Ljava/lang/String;I)Ljava/lang/Class;")
    public static Class method2839(String arg0) throws ClassNotFoundException {
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
        } else if (arg0.equals("void")) {
            return Void.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }
}
