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

@ObfuscatedName("ga")
public class class192 {

    @ObfuscatedName("ga.c")
    public static class183 field2900 = new class183();

    public class192() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fs.c(B)V")
    public static void method3149() {
        field2900 = new class183();
    }

    @ObfuscatedName("dz.j(Ldd;B)V")
    public static void method2441(class111 arg0) {
        class191 var1 = (class191) field2900.method3285();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field1826;
        arg0.method2123(var1.field2893);
        for (int var3 = 0; var3 < var1.field2891; var3++) {
            if (var1.field2898[var3] == 0) {
                try {
                    int var4 = var1.field2892[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field2890[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method2120(0);
                        arg0.method2123(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field2890[var3];
                        var7.setInt((Object) null, var1.field2895[var3]);
                        arg0.method2120(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field2890[var3];
                        int var9 = var8.getModifiers();
                        arg0.method2120(0);
                        arg0.method2123(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field2896[var3];
                        byte[][] var11 = var1.field2897[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method2120(0);
                        } else if (var15 instanceof Number) {
                            arg0.method2120(1);
                            arg0.method2176(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method2120(2);
                            arg0.method2125((String) var15);
                        } else {
                            arg0.method2120(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field2896[var3];
                        int var17 = var16.getModifiers();
                        arg0.method2120(0);
                        arg0.method2123(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method2120(-10);
                } catch (InvalidClassException var31) {
                    arg0.method2120(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method2120(-12);
                } catch (OptionalDataException var33) {
                    arg0.method2120(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method2120(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method2120(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method2120(-16);
                } catch (SecurityException var37) {
                    arg0.method2120(-17);
                } catch (IOException var38) {
                    arg0.method2120(-18);
                } catch (NullPointerException var39) {
                    arg0.method2120(-19);
                } catch (Exception var40) {
                    arg0.method2120(-20);
                } catch (Throwable var41) {
                    arg0.method2120(-21);
                }
            } else {
                arg0.method2120(var1.field2898[var3]);
            }
        }
        arg0.method2153(var2);
        var1.method3334();
    }

    @ObfuscatedName("ez.y(Ljava/lang/String;B)Ljava/lang/Class;")
    public static Class method2721(String arg0) throws ClassNotFoundException {
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
