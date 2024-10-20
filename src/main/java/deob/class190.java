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

@ObfuscatedName("gn")
public class class190 {

    @ObfuscatedName("gn.n")
    public static class181 field2898 = new class181();

    public class190() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.n(B)Z")
    public static boolean method526() {
        class189 var0 = (class189) field2898.method3226();
        return var0 != null;
    }

    @ObfuscatedName("bj.x(Ldm;B)V")
    public static void method1428(class110 arg0) {
        class189 var1 = (class189) field2898.method3226();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field1826;
        arg0.method2127(var1.field2891);
        for (int var3 = 0; var3 < var1.field2890; var3++) {
            if (var1.field2892[var3] == 0) {
                try {
                    int var4 = var1.field2889[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field2893[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method2124(0);
                        arg0.method2127(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field2893[var3];
                        var7.setInt((Object) null, var1.field2894[var3]);
                        arg0.method2124(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field2893[var3];
                        int var9 = var8.getModifiers();
                        arg0.method2124(0);
                        arg0.method2127(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field2895[var3];
                        byte[][] var11 = var1.field2896[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method2124(0);
                        } else if (var15 instanceof Number) {
                            arg0.method2124(1);
                            arg0.method2128(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method2124(2);
                            arg0.method2176((String) var15);
                        } else {
                            arg0.method2124(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field2895[var3];
                        int var17 = var16.getModifiers();
                        arg0.method2124(0);
                        arg0.method2127(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method2124(-10);
                } catch (InvalidClassException var31) {
                    arg0.method2124(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method2124(-12);
                } catch (OptionalDataException var33) {
                    arg0.method2124(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method2124(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method2124(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method2124(-16);
                } catch (SecurityException var37) {
                    arg0.method2124(-17);
                } catch (IOException var38) {
                    arg0.method2124(-18);
                } catch (NullPointerException var39) {
                    arg0.method2124(-19);
                } catch (Exception var40) {
                    arg0.method2124(-20);
                } catch (Throwable var41) {
                    arg0.method2124(-21);
                }
            } else {
                arg0.method2124(var1.field2892[var3]);
            }
        }
        arg0.method2245(var2);
        var1.method3277();
    }

    @ObfuscatedName("n.k(Ljava/lang/String;I)Ljava/lang/Class;")
    public static Class method1(String arg0) throws ClassNotFoundException {
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
