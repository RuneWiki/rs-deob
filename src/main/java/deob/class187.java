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

@ObfuscatedName("gm")
public class class187 {

    @ObfuscatedName("gm.j")
    public static class177 field2875 = new class177();

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cp.j(Ldn;IB)V")
    public static void method1887(class110 arg0, int arg1) {
        while (true) {
            class186 var2 = (class186) field2875.method3236();
            if (var2 == null) {
                return;
            }
            arg0.method2369(arg1);
            arg0.method2116(0);
            int var3 = arg0.field1847;
            arg0.method2119(var2.field2872);
            for (int var4 = 0; var4 < var2.field2868; var4++) {
                if (var2.field2867[var4] == 0) {
                    try {
                        int var5 = var2.field2866[var4];
                        if (var5 == 0) {
                            Field var6 = var2.field2864[var4];
                            int var7 = var6.getInt((Object) null);
                            arg0.method2116(0);
                            arg0.method2119(var7);
                        } else if (var5 == 1) {
                            Field var8 = var2.field2864[var4];
                            var8.setInt((Object) null, var2.field2865[var4]);
                            arg0.method2116(0);
                        } else if (var5 == 2) {
                            Field var9 = var2.field2864[var4];
                            int var10 = var9.getModifiers();
                            arg0.method2116(0);
                            arg0.method2119(var10);
                        }
                        if (var5 == 3) {
                            Method var11 = var2.field2870[var4];
                            byte[][] var12 = var2.field2871[var4];
                            Object[] var13 = new Object[var12.length];
                            for (int var14 = 0; var14 < var12.length; var14++) {
                                ObjectInputStream var15 = new ObjectInputStream(new ByteArrayInputStream(var12[var14]));
                                var13[var14] = var15.readObject();
                            }
                            Object var16 = var11.invoke((Object) null, var13);
                            if (var16 == null) {
                                arg0.method2116(0);
                            } else if (var16 instanceof Number) {
                                arg0.method2116(1);
                                arg0.method2173(((Number) var16).longValue());
                            } else if (var16 instanceof String) {
                                arg0.method2116(2);
                                arg0.method2121((String) var16);
                            } else {
                                arg0.method2116(4);
                            }
                        } else if (var5 == 4) {
                            Method var17 = var2.field2870[var4];
                            int var18 = var17.getModifiers();
                            arg0.method2116(0);
                            arg0.method2119(var18);
                        }
                    } catch (ClassNotFoundException var31) {
                        arg0.method2116(-10);
                    } catch (InvalidClassException var32) {
                        arg0.method2116(-11);
                    } catch (StreamCorruptedException var33) {
                        arg0.method2116(-12);
                    } catch (OptionalDataException var34) {
                        arg0.method2116(-13);
                    } catch (IllegalAccessException var35) {
                        arg0.method2116(-14);
                    } catch (IllegalArgumentException var36) {
                        arg0.method2116(-15);
                    } catch (InvocationTargetException var37) {
                        arg0.method2116(-16);
                    } catch (SecurityException var38) {
                        arg0.method2116(-17);
                    } catch (IOException var39) {
                        arg0.method2116(-18);
                    } catch (NullPointerException var40) {
                        arg0.method2116(-19);
                    } catch (Exception var41) {
                        arg0.method2116(-20);
                    } catch (Throwable var42) {
                        arg0.method2116(-21);
                    }
                } else {
                    arg0.method2116(var2.field2867[var4]);
                }
            }
            arg0.method2149(var3);
            arg0.method2276(arg0.field1847 - var3);
            var2.method3309();
        }
    }

    @ObfuscatedName("ep.y(Ljava/lang/String;B)Ljava/lang/Class;")
    public static Class method2710(String arg0) throws ClassNotFoundException {
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
