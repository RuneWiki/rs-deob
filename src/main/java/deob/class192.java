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

@ObfuscatedName("gd")
public class class192 {

    @ObfuscatedName("gd.g")
    public static class183 field2900 = new class183();

    public class192() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.g(Lde;I)V")
    public static void method149(class111 arg0) {
        class191 var1 = (class191) field2900.method3213();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field1824;
        arg0.method2245(var1.field2892);
        for (int var3 = 0; var3 < var1.field2899; var3++) {
            if (var1.field2894[var3] == 0) {
                try {
                    int var4 = var1.field2893[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field2895[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method2069(0);
                        arg0.method2245(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field2895[var3];
                        var7.setInt((Object) null, var1.field2898[var3]);
                        arg0.method2069(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field2895[var3];
                        int var9 = var8.getModifiers();
                        arg0.method2069(0);
                        arg0.method2245(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field2891[var3];
                        byte[][] var11 = var1.field2897[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method2069(0);
                        } else if (var15 instanceof Number) {
                            arg0.method2069(1);
                            arg0.method2265(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method2069(2);
                            arg0.method2074((String) var15);
                        } else {
                            arg0.method2069(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field2891[var3];
                        int var17 = var16.getModifiers();
                        arg0.method2069(0);
                        arg0.method2245(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method2069(-10);
                } catch (InvalidClassException var31) {
                    arg0.method2069(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method2069(-12);
                } catch (OptionalDataException var33) {
                    arg0.method2069(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method2069(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method2069(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method2069(-16);
                } catch (SecurityException var37) {
                    arg0.method2069(-17);
                } catch (IOException var38) {
                    arg0.method2069(-18);
                } catch (NullPointerException var39) {
                    arg0.method2069(-19);
                } catch (Exception var40) {
                    arg0.method2069(-20);
                } catch (Throwable var41) {
                    arg0.method2069(-21);
                }
            } else {
                arg0.method2069(var1.field2894[var3]);
            }
        }
        arg0.method2102(var2);
        var1.method3259();
    }

    @ObfuscatedName("fk.j(Ljava/lang/String;I)Ljava/lang/Class;")
    public static Class method2846(String arg0) throws ClassNotFoundException {
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
