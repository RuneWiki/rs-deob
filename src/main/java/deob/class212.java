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

@ObfuscatedName("he")
public class class212 {

    @ObfuscatedName("he.s")
    public static class203 field3144 = new class203();

    public class212() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ei.s(Ldi;I)V")
    public static void method2661(class123 arg0) {
        class211 var1 = (class211) field3144.method3597();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field2006;
        arg0.method2326(var1.field3137);
        for (int var3 = 0; var3 < var1.field3141; var3++) {
            if (var1.field3136[var3] == 0) {
                try {
                    int var4 = var1.field3135[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field3134[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method2323(0);
                        arg0.method2326(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field3134[var3];
                        var7.setInt((Object) null, var1.field3138[var3]);
                        arg0.method2323(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field3134[var3];
                        int var9 = var8.getModifiers();
                        arg0.method2323(0);
                        arg0.method2326(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field3139[var3];
                        byte[][] var11 = var1.field3140[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method2323(0);
                        } else if (var15 instanceof Number) {
                            arg0.method2323(1);
                            arg0.method2328(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method2323(2);
                            arg0.method2329((String) var15);
                        } else {
                            arg0.method2323(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field3139[var3];
                        int var17 = var16.getModifiers();
                        arg0.method2323(0);
                        arg0.method2326(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method2323(-10);
                } catch (InvalidClassException var31) {
                    arg0.method2323(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method2323(-12);
                } catch (OptionalDataException var33) {
                    arg0.method2323(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method2323(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method2323(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method2323(-16);
                } catch (SecurityException var37) {
                    arg0.method2323(-17);
                } catch (IOException var38) {
                    arg0.method2323(-18);
                } catch (NullPointerException var39) {
                    arg0.method2323(-19);
                } catch (Exception var40) {
                    arg0.method2323(-20);
                } catch (Throwable var41) {
                    arg0.method2323(-21);
                }
            } else {
                arg0.method2323(var1.field3136[var3]);
            }
        }
        arg0.method2497(var2);
        var1.method3639();
    }

    @ObfuscatedName("fq.j(Ljava/lang/String;B)Ljava/lang/Class;")
    public static Class method3244(String arg0) throws ClassNotFoundException {
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
