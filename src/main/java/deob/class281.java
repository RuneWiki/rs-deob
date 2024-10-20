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

@ObfuscatedName("jd")
public class class281 {

    @ObfuscatedName("jd.p")
    public static class192 field3750 = new class192();

    public class281() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.p(B)Z")
    public static boolean method140() {
        class280 var0 = (class280) field3750.method3222();
        return var0 != null;
    }

    @ObfuscatedName("iu.m(Lff;I)V")
    public static void method3865(class180 arg0) {
        class280 var1 = (class280) field3750.method3222();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field2408;
        arg0.method2798(var1.field3742);
        for (int var3 = 0; var3 < var1.field3744; var3++) {
            if (var1.field3745[var3] == 0) {
                try {
                    int var4 = var1.field3749[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field3746[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method2961(0);
                        arg0.method2798(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field3746[var3];
                        var7.setInt((Object) null, var1.field3747[var3]);
                        arg0.method2961(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field3746[var3];
                        int var9 = var8.getModifiers();
                        arg0.method2961(0);
                        arg0.method2798(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field3743[var3];
                        byte[][] var11 = var1.field3748[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method2961(0);
                        } else if (var15 instanceof Number) {
                            arg0.method2961(1);
                            arg0.method2801(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method2961(2);
                            arg0.method2902((String) var15);
                        } else {
                            arg0.method2961(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field3743[var3];
                        int var17 = var16.getModifiers();
                        arg0.method2961(0);
                        arg0.method2798(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method2961(-10);
                } catch (InvalidClassException var31) {
                    arg0.method2961(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method2961(-12);
                } catch (OptionalDataException var33) {
                    arg0.method2961(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method2961(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method2961(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method2961(-16);
                } catch (SecurityException var37) {
                    arg0.method2961(-17);
                } catch (IOException var38) {
                    arg0.method2961(-18);
                } catch (NullPointerException var39) {
                    arg0.method2961(-19);
                } catch (Exception var40) {
                    arg0.method2961(-20);
                } catch (Throwable var41) {
                    arg0.method2961(-21);
                }
            } else {
                arg0.method2961(var1.field3745[var3]);
            }
        }
        arg0.method2889(var2);
        var1.method3234();
    }

    @ObfuscatedName("co.e(Ljava/lang/String;B)Ljava/lang/Class;")
    public static Class method1466(String arg0) throws ClassNotFoundException {
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
