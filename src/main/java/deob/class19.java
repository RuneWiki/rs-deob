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

@ObfuscatedName("fo")
public class class19 {

    @ObfuscatedName("fo.v")
    public static class71 field230 = new class71();

    public class19() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ec.v(I)V")
    public static void method660() {
        field230 = new class71();
    }

    @ObfuscatedName("c.c(Ldi;II)V")
    public static void method959(class41 arg0, int arg1) {
        while (true) {
            class9 var2 = (class9) field230.method1104();
            if (var2 == null) {
                return;
            }
            arg0.method746(arg1);
            arg0.method443(0);
            int var3 = arg0.field303;
            arg0.method302(var2.field56);
            for (int var4 = 0; var4 < var2.field58; var4++) {
                if (var2.field62[var4] == 0) {
                    try {
                        int var5 = var2.field57[var4];
                        if (var5 == 0) {
                            Field var6 = var2.field59[var4];
                            int var7 = var6.getInt((Object) null);
                            arg0.method443(0);
                            arg0.method302(var7);
                        } else if (var5 == 1) {
                            Field var8 = var2.field59[var4];
                            var8.setInt((Object) null, var2.field60[var4]);
                            arg0.method443(0);
                        } else if (var5 == 2) {
                            Field var9 = var2.field59[var4];
                            int var10 = var9.getModifiers();
                            arg0.method443(0);
                            arg0.method302(var10);
                        }
                        if (var5 == 3) {
                            Method var11 = var2.field61[var4];
                            byte[][] var12 = var2.field55[var4];
                            Object[] var13 = new Object[var12.length];
                            for (int var14 = 0; var14 < var12.length; var14++) {
                                ObjectInputStream var15 = new ObjectInputStream(new ByteArrayInputStream(var12[var14]));
                                var13[var14] = var15.readObject();
                            }
                            Object var16 = var11.invoke((Object) null, var13);
                            if (var16 == null) {
                                arg0.method443(0);
                            } else if (var16 instanceof Number) {
                                arg0.method443(1);
                                arg0.method362(((Number) var16).longValue());
                            } else if (var16 instanceof String) {
                                arg0.method443(2);
                                arg0.method303((String) var16);
                            } else {
                                arg0.method443(4);
                            }
                        } else if (var5 == 4) {
                            Method var17 = var2.field61[var4];
                            int var18 = var17.getModifiers();
                            arg0.method443(0);
                            arg0.method302(var18);
                        }
                    } catch (ClassNotFoundException var31) {
                        arg0.method443(-10);
                    } catch (InvalidClassException var32) {
                        arg0.method443(-11);
                    } catch (StreamCorruptedException var33) {
                        arg0.method443(-12);
                    } catch (OptionalDataException var34) {
                        arg0.method443(-13);
                    } catch (IllegalAccessException var35) {
                        arg0.method443(-14);
                    } catch (IllegalArgumentException var36) {
                        arg0.method443(-15);
                    } catch (InvocationTargetException var37) {
                        arg0.method443(-16);
                    } catch (SecurityException var38) {
                        arg0.method443(-17);
                    } catch (IOException var39) {
                        arg0.method443(-18);
                    } catch (NullPointerException var40) {
                        arg0.method443(-19);
                    } catch (Exception var41) {
                        arg0.method443(-20);
                    } catch (Throwable var42) {
                        arg0.method443(-21);
                    }
                } else {
                    arg0.method443(var2.field62[var4]);
                }
            }
            arg0.method413(var3);
            arg0.method494(arg0.field303 - var3);
            var2.method76();
        }
    }

    @ObfuscatedName("eq.b(Ljava/lang/String;B)Ljava/lang/Class;")
    public static Class method1527(String arg0) throws ClassNotFoundException {
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
