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

@ObfuscatedName("lt")
public class class318 {

    @ObfuscatedName("lt.b")
    public static class212 field3873 = new class212();

    public class318() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ew.b(I)V")
    public static void method2840() {
        field3873 = new class212();
    }

    @ObfuscatedName("bu.q(Lgu;I)V")
    public static void method1013(class200 arg0) {
        class317 var1 = (class317) field3873.method3696();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field2538;
        arg0.method3235(var1.field3866);
        for (int var3 = 0; var3 < var1.field3867; var3++) {
            if (var1.field3868[var3] == 0) {
                try {
                    int var4 = var1.field3870[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field3869[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method3232(0);
                        arg0.method3235(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field3869[var3];
                        var7.setInt((Object) null, var1.field3871[var3]);
                        arg0.method3232(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field3869[var3];
                        int var9 = var8.getModifiers();
                        arg0.method3232(0);
                        arg0.method3235(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field3865[var3];
                        byte[][] var11 = var1.field3872[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method3232(0);
                        } else if (var15 instanceof Number) {
                            arg0.method3232(1);
                            arg0.method3246(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method3232(2);
                            arg0.method3239((String) var15);
                        } else {
                            arg0.method3232(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field3865[var3];
                        int var17 = var16.getModifiers();
                        arg0.method3232(0);
                        arg0.method3235(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method3232(-10);
                } catch (InvalidClassException var31) {
                    arg0.method3232(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method3232(-12);
                } catch (OptionalDataException var33) {
                    arg0.method3232(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method3232(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method3232(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method3232(-16);
                } catch (SecurityException var37) {
                    arg0.method3232(-17);
                } catch (IOException var38) {
                    arg0.method3232(-18);
                } catch (NullPointerException var39) {
                    arg0.method3232(-19);
                } catch (Exception var40) {
                    arg0.method3232(-20);
                } catch (Throwable var41) {
                    arg0.method3232(-21);
                }
            } else {
                arg0.method3232(var1.field3868[var3]);
            }
        }
        arg0.method3270(var2);
        var1.method3726();
    }

    @ObfuscatedName("o.o(Ljava/lang/String;I)Ljava/lang/Class;")
    public static Class method3(String arg0) throws ClassNotFoundException {
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
