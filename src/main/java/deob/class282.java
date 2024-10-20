package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@ObfuscatedName("jv")
public class class282 {

    @ObfuscatedName("jv.j")
    public static class193 field3741 = new class193();

    public class282() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gm.j(B)Z")
    public static boolean method3517() {
        class281 var0 = (class281) field3741.method3290();
        return var0 != null;
    }

    @ObfuscatedName("ad.h(Lfo;I)V")
    public static void method576(class181 arg0) {
        class281 var1 = (class281) field3741.method3290();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field2394;
        arg0.method2891(var1.field3738);
        for (int var3 = 0; var3 < var1.field3731; var3++) {
            if (var1.field3733[var3] == 0) {
                try {
                    int var4 = var1.field3732[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field3734[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method2888(0);
                        arg0.method2891(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field3734[var3];
                        var7.setInt((Object) null, var1.field3735[var3]);
                        arg0.method2888(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field3734[var3];
                        int var9 = var8.getModifiers();
                        arg0.method2888(0);
                        arg0.method2891(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field3736[var3];
                        byte[][] var11 = var1.field3737[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method2888(0);
                        } else if (var15 instanceof Number) {
                            arg0.method2888(1);
                            arg0.method2893(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method2888(2);
                            arg0.method2894((String) var15);
                        } else {
                            arg0.method2888(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field3736[var3];
                        int var17 = var16.getModifiers();
                        arg0.method2888(0);
                        arg0.method2891(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method2888(-10);
                } catch (InvalidClassException var31) {
                    arg0.method2888(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method2888(-12);
                } catch (OptionalDataException var33) {
                    arg0.method2888(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method2888(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method2888(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method2888(-16);
                } catch (SecurityException var37) {
                    arg0.method2888(-17);
                } catch (IOException var38) {
                    arg0.method2888(-18);
                } catch (NullPointerException var39) {
                    arg0.method2888(-19);
                } catch (Exception var40) {
                    arg0.method2888(-20);
                } catch (Throwable var41) {
                    arg0.method2888(-21);
                }
            } else {
                arg0.method2888(var1.field3733[var3]);
            }
        }
        arg0.method3015(var2);
        var1.method3314();
    }

    @ObfuscatedName("f.f(Lfb;IB)V")
    public static void method6(class175 arg0, int arg1) {
        class281 var2 = new class281();
        var2.field3731 = arg0.method2903();
        var2.field3738 = arg0.method2908();
        var2.field3732 = new int[var2.field3731];
        var2.field3733 = new int[var2.field3731];
        var2.field3734 = new Field[var2.field3731];
        var2.field3735 = new int[var2.field3731];
        var2.field3736 = new Method[var2.field3731];
        var2.field3737 = new byte[var2.field3731][][];
        for (int var3 = 0; var3 < var2.field3731; var3++) {
            try {
                int var4 = arg0.method2903();
                if (var4 == 0 || var4 == 1 || var4 == 2) {
                    String var5 = arg0.method2911();
                    String var6 = arg0.method2911();
                    int var7 = 0;
                    if (var4 == 1) {
                        var7 = arg0.method2908();
                    }
                    var2.field3732[var3] = var4;
                    var2.field3735[var3] = var7;
                    if (method1007(var5).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3734[var3] = method1007(var5).getDeclaredField(var6);
                } else if (var4 == 3 || var4 == 4) {
                    String var8 = arg0.method2911();
                    String var9 = arg0.method2911();
                    int var10 = arg0.method2903();
                    String[] var11 = new String[var10];
                    for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = arg0.method2911();
                    }
                    String var13 = arg0.method2911();
                    byte[][] var14 = new byte[var10][];
                    if (var4 == 3) {
                        for (int var15 = 0; var15 < var10; var15++) {
                            int var16 = arg0.method2908();
                            var14[var15] = new byte[var16];
                            arg0.method3052(var14[var15], 0, var16);
                        }
                    }
                    var2.field3732[var3] = var4;
                    Class[] var17 = new Class[var10];
                    for (int var18 = 0; var18 < var10; var18++) {
                        var17[var18] = method1007(var11[var18]);
                    }
                    Class var19 = method1007(var13);
                    if (method1007(var8).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    Method[] var20 = method1007(var8).getDeclaredMethods();
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
                                    var2.field3736[var3] = var23;
                                }
                            }
                        }
                    }
                    var2.field3737[var3] = var14;
                }
            } catch (ClassNotFoundException var32) {
                var2.field3733[var3] = -1;
            } catch (SecurityException var33) {
                var2.field3733[var3] = -2;
            } catch (NullPointerException var34) {
                var2.field3733[var3] = -3;
            } catch (Exception var35) {
                var2.field3733[var3] = -4;
            } catch (Throwable var36) {
                var2.field3733[var3] = -5;
            }
        }
        field3741.method3286(var2);
    }

    @ObfuscatedName("bp.p(Ljava/lang/String;I)Ljava/lang/Class;")
    public static Class method1007(String arg0) throws ClassNotFoundException {
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
