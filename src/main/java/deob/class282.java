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

@ObfuscatedName("jb")
public class class282 {

    @ObfuscatedName("jb.i")
    public static class193 field3758 = new class193();

    public class282() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.i(I)V")
    public static void method2718() {
        field3758 = new class193();
    }

    @ObfuscatedName("cf.j(B)Z")
    public static boolean method1543() {
        class281 var0 = (class281) field3758.method3379();
        return var0 != null;
    }

    @ObfuscatedName("hh.a(Lfn;B)V")
    public static void method3652(class181 arg0) {
        class281 var1 = (class281) field3758.method3379();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field2395;
        arg0.method3136(var1.field3750);
        for (int var3 = 0; var3 < var1.field3745; var3++) {
            if (var1.field3753[var3] == 0) {
                try {
                    int var4 = var1.field3746[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field3748[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method3102(0);
                        arg0.method3136(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field3748[var3];
                        var7.setInt((Object) null, var1.field3749[var3]);
                        arg0.method3102(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field3748[var3];
                        int var9 = var8.getModifiers();
                        arg0.method3102(0);
                        arg0.method3136(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field3747[var3];
                        byte[][] var11 = var1.field3744[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method3102(0);
                        } else if (var15 instanceof Number) {
                            arg0.method3102(1);
                            arg0.method2982(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method3102(2);
                            arg0.method2984((String) var15);
                        } else {
                            arg0.method3102(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field3747[var3];
                        int var17 = var16.getModifiers();
                        arg0.method3102(0);
                        arg0.method3136(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method3102(-10);
                } catch (InvalidClassException var31) {
                    arg0.method3102(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method3102(-12);
                } catch (OptionalDataException var33) {
                    arg0.method3102(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method3102(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method3102(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method3102(-16);
                } catch (SecurityException var37) {
                    arg0.method3102(-17);
                } catch (IOException var38) {
                    arg0.method3102(-18);
                } catch (NullPointerException var39) {
                    arg0.method3102(-19);
                } catch (Exception var40) {
                    arg0.method3102(-20);
                } catch (Throwable var41) {
                    arg0.method3102(-21);
                }
            } else {
                arg0.method3102(var1.field3753[var3]);
            }
        }
        arg0.method3016(var2);
        var1.method3397();
    }

    @ObfuscatedName("ay.r(Ljava/lang/String;I)Ljava/lang/Class;")
    public static Class method506(String arg0) throws ClassNotFoundException {
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
