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
public class class189 {

    @ObfuscatedName("gd.g")
    public static class180 field2888 = new class180();

    public class189() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gr.g(B)V")
    public static void method3335() {
        field2888 = new class180();
    }

    @ObfuscatedName("eq.v(Ldj;I)V")
    public static void method2828(class110 arg0) {
        class188 var1 = (class188) field2888.method3270();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field1839;
        arg0.method2236(var1.field2881);
        for (int var3 = 0; var3 < var1.field2879; var3++) {
            if (var1.field2882[var3] == 0) {
                try {
                    int var4 = var1.field2883[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field2880[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method2126(0);
                        arg0.method2236(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field2880[var3];
                        var7.setInt((Object) null, var1.field2884[var3]);
                        arg0.method2126(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field2880[var3];
                        int var9 = var8.getModifiers();
                        arg0.method2126(0);
                        arg0.method2236(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field2885[var3];
                        byte[][] var11 = var1.field2886[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method2126(0);
                        } else if (var15 instanceof Number) {
                            arg0.method2126(1);
                            arg0.method2131(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method2126(2);
                            arg0.method2257((String) var15);
                        } else {
                            arg0.method2126(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field2885[var3];
                        int var17 = var16.getModifiers();
                        arg0.method2126(0);
                        arg0.method2236(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method2126(-10);
                } catch (InvalidClassException var31) {
                    arg0.method2126(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method2126(-12);
                } catch (OptionalDataException var33) {
                    arg0.method2126(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method2126(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method2126(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method2126(-16);
                } catch (SecurityException var37) {
                    arg0.method2126(-17);
                } catch (IOException var38) {
                    arg0.method2126(-18);
                } catch (NullPointerException var39) {
                    arg0.method2126(-19);
                } catch (Exception var40) {
                    arg0.method2126(-20);
                } catch (Throwable var41) {
                    arg0.method2126(-21);
                }
            } else {
                arg0.method2126(var1.field2882[var3]);
            }
        }
        arg0.method2158(var2);
        var1.method3322();
    }

    @ObfuscatedName("eo.z(Ljava/lang/String;B)Ljava/lang/Class;")
    public static Class method2804(String arg0) throws ClassNotFoundException {
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
