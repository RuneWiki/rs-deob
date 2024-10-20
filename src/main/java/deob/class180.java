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

@ObfuscatedName("fc")
public class class180 {

    @ObfuscatedName("fc.z")
    public static class175 field2773 = new class175();

    public class180() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("v.h(Ldg;II)V")
    public static void method42(class115 arg0, int arg1) {
        while (true) {
            class179 var2 = (class179) field2773.method3317();
            if (var2 == null) {
                return;
            }
            arg0.method2307(arg1);
            arg0.method2462(0);
            int var3 = arg0.field2003;
            arg0.method2456(var2.field2763);
            for (int var4 = 0; var4 < var2.field2762; var4++) {
                if (var2.field2766[var4] == 0) {
                    try {
                        int var5 = var2.field2764[var4];
                        if (var5 == 0) {
                            Field var6 = var2.field2768[var4];
                            int var7 = var6.getInt((Object) null);
                            arg0.method2462(0);
                            arg0.method2456(var7);
                        } else if (var5 == 1) {
                            Field var8 = var2.field2768[var4];
                            var8.setInt((Object) null, var2.field2761[var4]);
                            arg0.method2462(0);
                        } else if (var5 == 2) {
                            Field var9 = var2.field2768[var4];
                            int var10 = var9.getModifiers();
                            arg0.method2462(0);
                            arg0.method2456(var10);
                        }
                        if (var5 == 3) {
                            Method var11 = var2.field2767[var4];
                            byte[][] var12 = var2.field2765[var4];
                            Object[] var13 = new Object[var12.length];
                            for (int var14 = 0; var14 < var12.length; var14++) {
                                ObjectInputStream var15 = new ObjectInputStream(new ByteArrayInputStream(var12[var14]));
                                var13[var14] = var15.readObject();
                            }
                            Object var16 = var11.invoke((Object) null, var13);
                            if (var16 == null) {
                                arg0.method2462(0);
                            } else if (var16 instanceof Number) {
                                arg0.method2462(1);
                                arg0.method2441(((Number) var16).longValue());
                            } else if (var16 instanceof String) {
                                arg0.method2462(2);
                                arg0.method2442((String) var16);
                            } else {
                                arg0.method2462(4);
                            }
                        } else if (var5 == 4) {
                            Method var17 = var2.field2767[var4];
                            int var18 = var17.getModifiers();
                            arg0.method2462(0);
                            arg0.method2456(var18);
                        }
                    } catch (ClassNotFoundException var31) {
                        arg0.method2462(-10);
                    } catch (InvalidClassException var32) {
                        arg0.method2462(-11);
                    } catch (StreamCorruptedException var33) {
                        arg0.method2462(-12);
                    } catch (OptionalDataException var34) {
                        arg0.method2462(-13);
                    } catch (IllegalAccessException var35) {
                        arg0.method2462(-14);
                    } catch (IllegalArgumentException var36) {
                        arg0.method2462(-15);
                    } catch (InvocationTargetException var37) {
                        arg0.method2462(-16);
                    } catch (SecurityException var38) {
                        arg0.method2462(-17);
                    } catch (IOException var39) {
                        arg0.method2462(-18);
                    } catch (NullPointerException var40) {
                        arg0.method2462(-19);
                    } catch (Exception var41) {
                        arg0.method2462(-20);
                    } catch (Throwable var42) {
                        arg0.method2462(-21);
                    }
                } else {
                    arg0.method2462(var2.field2766[var4]);
                }
            }
            arg0.method2468(var3);
            arg0.method2447(arg0.field2003 - var3);
            var2.method3346();
        }
    }

    @ObfuscatedName("fe.c(Ljava/lang/String;B)Ljava/lang/Class;")
    public static Class method3225(String arg0) throws ClassNotFoundException {
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
