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

@ObfuscatedName("gq")
public class class189 {

    @ObfuscatedName("gq.e")
    public static class180 field2878 = new class180();

    public class189() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.e(B)Z")
    public static boolean method507() {
        class188 var0 = (class188) field2878.method3228();
        return var0 != null;
    }

    @ObfuscatedName("ao.v(Ldc;I)V")
    public static void method547(class110 arg0) {
        class188 var1 = (class188) field2878.method3228();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field1844;
        arg0.method2137(var1.field2875);
        for (int var3 = 0; var3 < var1.field2870; var3++) {
            if (var1.field2872[var3] == 0) {
                try {
                    int var4 = var1.field2869[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field2871[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method2102(0);
                        arg0.method2137(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field2871[var3];
                        var7.setInt((Object) null, var1.field2874[var3]);
                        arg0.method2102(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field2871[var3];
                        int var9 = var8.getModifiers();
                        arg0.method2102(0);
                        arg0.method2137(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field2873[var3];
                        byte[][] var11 = var1.field2876[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method2102(0);
                        } else if (var15 instanceof Number) {
                            arg0.method2102(1);
                            arg0.method2106(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method2102(2);
                            arg0.method2107((String) var15);
                        } else {
                            arg0.method2102(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field2873[var3];
                        int var17 = var16.getModifiers();
                        arg0.method2102(0);
                        arg0.method2137(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method2102(-10);
                } catch (InvalidClassException var31) {
                    arg0.method2102(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method2102(-12);
                } catch (OptionalDataException var33) {
                    arg0.method2102(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method2102(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method2102(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method2102(-16);
                } catch (SecurityException var37) {
                    arg0.method2102(-17);
                } catch (IOException var38) {
                    arg0.method2102(-18);
                } catch (NullPointerException var39) {
                    arg0.method2102(-19);
                } catch (Exception var40) {
                    arg0.method2102(-20);
                } catch (Throwable var41) {
                    arg0.method2102(-21);
                }
            } else {
                arg0.method2102(var1.field2872[var3]);
            }
        }
        arg0.method2123(var2);
        var1.method3273();
    }

    @ObfuscatedName("o.i(Ljava/lang/String;S)Ljava/lang/Class;")
    public static Class method482(String arg0) throws ClassNotFoundException {
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
