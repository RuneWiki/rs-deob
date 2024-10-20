package deob;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@ObfuscatedName("le")
public class class323 {

    @ObfuscatedName("le.m")
    public static class272 field3870 = new class272();

    public class323() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ez.q(Lgr;II)V")
    public static void method3078(class202 arg0, int arg1) {
        class322 var2 = new class322();
        var2.field3863 = arg0.method3551();
        var2.field3860 = arg0.method3620();
        var2.field3862 = new int[var2.field3863];
        var2.field3867 = new int[var2.field3863];
        var2.field3864 = new Field[var2.field3863];
        var2.field3865 = new int[var2.field3863];
        var2.field3866 = new Method[var2.field3863];
        var2.field3861 = new byte[var2.field3863][][];
        for (int var3 = 0; var3 < var2.field3863; var3++) {
            try {
                int var4 = arg0.method3551();
                if (var4 == 0 || var4 == 1 || var4 == 2) {
                    String var5 = arg0.method3426();
                    String var6 = arg0.method3426();
                    int var7 = 0;
                    if (var4 == 1) {
                        var7 = arg0.method3620();
                    }
                    var2.field3862[var3] = var4;
                    var2.field3865[var3] = var7;
                    if (method4392(var5).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3864[var3] = method4392(var5).getDeclaredField(var6);
                } else if (var4 == 3 || var4 == 4) {
                    String var8 = arg0.method3426();
                    String var9 = arg0.method3426();
                    int var10 = arg0.method3551();
                    String[] var11 = new String[var10];
                    for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = arg0.method3426();
                    }
                    String var13 = arg0.method3426();
                    byte[][] var14 = new byte[var10][];
                    if (var4 == 3) {
                        for (int var15 = 0; var15 < var10; var15++) {
                            int var16 = arg0.method3620();
                            var14[var15] = new byte[var16];
                            arg0.method3429(var14[var15], 0, var16);
                        }
                    }
                    var2.field3862[var3] = var4;
                    Class[] var17 = new Class[var10];
                    for (int var18 = 0; var18 < var10; var18++) {
                        var17[var18] = method4392(var11[var18]);
                    }
                    Class var19 = method4392(var13);
                    if (method4392(var8).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    Method[] var20 = method4392(var8).getDeclaredMethods();
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
                                    var2.field3866[var3] = var23;
                                }
                            }
                        }
                    }
                    var2.field3861[var3] = var14;
                }
            } catch (ClassNotFoundException var32) {
                var2.field3867[var3] = -1;
            } catch (SecurityException var33) {
                var2.field3867[var3] = -2;
            } catch (NullPointerException var34) {
                var2.field3867[var3] = -3;
            } catch (Exception var35) {
                var2.field3867[var3] = -4;
            } catch (Throwable var36) {
                var2.field3867[var3] = -5;
            }
        }
        field3870.method4842(var2);
    }

    @ObfuscatedName("iw.w(Ljava/lang/String;I)Ljava/lang/Class;")
    public static Class method4392(String arg0) throws ClassNotFoundException {
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
