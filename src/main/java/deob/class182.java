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

@ObfuscatedName("fd")
public class class182 {

    @ObfuscatedName("fd.y")
    public static class177 field2831 = new class177();

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("av.y(Ldx;IB)V")
    public static void method631(class116 arg0, int arg1) {
        while (true) {
            class181 var2 = (class181) field2831.method3355();
            if (var2 == null) {
                return;
            }
            arg0.method2337(arg1);
            arg0.method2444(0);
            int var3 = arg0.field2036;
            arg0.method2563(var2.field2825);
            for (int var4 = 0; var4 < var2.field2829; var4++) {
                if (var2.field2820[var4] == 0) {
                    try {
                        int var5 = var2.field2822[var4];
                        if (var5 == 0) {
                            Field var6 = var2.field2823[var4];
                            int var7 = var6.getInt((Object) null);
                            arg0.method2444(0);
                            arg0.method2563(var7);
                        } else if (var5 == 1) {
                            Field var8 = var2.field2823[var4];
                            var8.setInt((Object) null, var2.field2821[var4]);
                            arg0.method2444(0);
                        } else if (var5 == 2) {
                            Field var9 = var2.field2823[var4];
                            int var10 = var9.getModifiers();
                            arg0.method2444(0);
                            arg0.method2563(var10);
                        }
                        if (var5 == 3) {
                            Method var11 = var2.field2826[var4];
                            byte[][] var12 = var2.field2827[var4];
                            Object[] var13 = new Object[var12.length];
                            for (int var14 = 0; var14 < var12.length; var14++) {
                                ObjectInputStream var15 = new ObjectInputStream(new ByteArrayInputStream(var12[var14]));
                                var13[var14] = var15.readObject();
                            }
                            Object var16 = var11.invoke((Object) null, var13);
                            if (var16 == null) {
                                arg0.method2444(0);
                            } else if (var16 instanceof Number) {
                                arg0.method2444(1);
                                arg0.method2599(((Number) var16).longValue());
                            } else if (var16 instanceof String) {
                                arg0.method2444(2);
                                arg0.method2484((String) var16);
                            } else {
                                arg0.method2444(4);
                            }
                        } else if (var5 == 4) {
                            Method var17 = var2.field2826[var4];
                            int var18 = var17.getModifiers();
                            arg0.method2444(0);
                            arg0.method2563(var18);
                        }
                    } catch (ClassNotFoundException var31) {
                        arg0.method2444(-10);
                    } catch (InvalidClassException var32) {
                        arg0.method2444(-11);
                    } catch (StreamCorruptedException var33) {
                        arg0.method2444(-12);
                    } catch (OptionalDataException var34) {
                        arg0.method2444(-13);
                    } catch (IllegalAccessException var35) {
                        arg0.method2444(-14);
                    } catch (IllegalArgumentException var36) {
                        arg0.method2444(-15);
                    } catch (InvocationTargetException var37) {
                        arg0.method2444(-16);
                    } catch (SecurityException var38) {
                        arg0.method2444(-17);
                    } catch (IOException var39) {
                        arg0.method2444(-18);
                    } catch (NullPointerException var40) {
                        arg0.method2444(-19);
                    } catch (Exception var41) {
                        arg0.method2444(-20);
                    } catch (Throwable var42) {
                        arg0.method2444(-21);
                    }
                } else {
                    arg0.method2444(var2.field2820[var4]);
                }
            }
            arg0.method2476(var3);
            arg0.method2455(arg0.field2036 - var3);
            var2.method3395();
        }
    }

    @ObfuscatedName("eu.m(Ljava/lang/String;B)Ljava/lang/Class;")
    public static Class method2975(String arg0) throws ClassNotFoundException {
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
