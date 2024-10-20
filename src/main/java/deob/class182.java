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

@ObfuscatedName("fs")
public class class182 {

    @ObfuscatedName("fs.a")
    public static class177 field2830 = new class177();

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eb.a(Ldn;II)V")
    public static void method2989(class116 arg0, int arg1) {
        while (true) {
            class181 var2 = (class181) field2830.method3252();
            if (var2 == null) {
                return;
            }
            arg0.method2272(arg1);
            arg0.method2455(0);
            int var3 = arg0.field2035;
            arg0.method2400(var2.field2825);
            for (int var4 = 0; var4 < var2.field2823; var4++) {
                if (var2.field2827[var4] == 0) {
                    try {
                        int var5 = var2.field2824[var4];
                        if (var5 == 0) {
                            Field var6 = var2.field2826[var4];
                            int var7 = var6.getInt((Object) null);
                            arg0.method2455(0);
                            arg0.method2400(var7);
                        } else if (var5 == 1) {
                            Field var8 = var2.field2826[var4];
                            var8.setInt((Object) null, var2.field2822[var4]);
                            arg0.method2455(0);
                        } else if (var5 == 2) {
                            Field var9 = var2.field2826[var4];
                            int var10 = var9.getModifiers();
                            arg0.method2455(0);
                            arg0.method2400(var10);
                        }
                        if (var5 == 3) {
                            Method var11 = var2.field2828[var4];
                            byte[][] var12 = var2.field2829[var4];
                            Object[] var13 = new Object[var12.length];
                            for (int var14 = 0; var14 < var12.length; var14++) {
                                ObjectInputStream var15 = new ObjectInputStream(new ByteArrayInputStream(var12[var14]));
                                var13[var14] = var15.readObject();
                            }
                            Object var16 = var11.invoke((Object) null, var13);
                            if (var16 == null) {
                                arg0.method2455(0);
                            } else if (var16 instanceof Number) {
                                arg0.method2455(1);
                                arg0.method2401(((Number) var16).longValue());
                            } else if (var16 instanceof String) {
                                arg0.method2455(2);
                                arg0.method2402((String) var16);
                            } else {
                                arg0.method2455(4);
                            }
                        } else if (var5 == 4) {
                            Method var17 = var2.field2828[var4];
                            int var18 = var17.getModifiers();
                            arg0.method2455(0);
                            arg0.method2400(var18);
                        }
                    } catch (ClassNotFoundException var31) {
                        arg0.method2455(-10);
                    } catch (InvalidClassException var32) {
                        arg0.method2455(-11);
                    } catch (StreamCorruptedException var33) {
                        arg0.method2455(-12);
                    } catch (OptionalDataException var34) {
                        arg0.method2455(-13);
                    } catch (IllegalAccessException var35) {
                        arg0.method2455(-14);
                    } catch (IllegalArgumentException var36) {
                        arg0.method2455(-15);
                    } catch (InvocationTargetException var37) {
                        arg0.method2455(-16);
                    } catch (SecurityException var38) {
                        arg0.method2455(-17);
                    } catch (IOException var39) {
                        arg0.method2455(-18);
                    } catch (NullPointerException var40) {
                        arg0.method2455(-19);
                    } catch (Exception var41) {
                        arg0.method2455(-20);
                    } catch (Throwable var42) {
                        arg0.method2455(-21);
                    }
                } else {
                    arg0.method2455(var2.field2827[var4]);
                }
            }
            arg0.method2430(var3);
            arg0.method2408(arg0.field2035 - var3);
            var2.method3288();
        }
    }

    @ObfuscatedName("dn.x(Ldy;II)V")
    public static void method2300(class127 arg0, int arg1) {
        class181 var2 = new class181();
        var2.field2823 = arg0.method2411();
        var2.field2825 = arg0.method2416();
        var2.field2824 = new int[var2.field2823];
        var2.field2827 = new int[var2.field2823];
        var2.field2826 = new Field[var2.field2823];
        var2.field2822 = new int[var2.field2823];
        var2.field2828 = new Method[var2.field2823];
        var2.field2829 = new byte[var2.field2823][][];
        for (int var3 = 0; var3 < var2.field2823; var3++) {
            try {
                int var4 = arg0.method2411();
                if (var4 == 0 || var4 == 1 || var4 == 2) {
                    String var5 = new String(arg0.method2564());
                    String var6 = new String(arg0.method2564());
                    int var7 = 0;
                    if (var4 == 1) {
                        var7 = arg0.method2416();
                    }
                    var2.field2824[var3] = var4;
                    var2.field2822[var3] = var7;
                    var2.field2826[var3] = method1480(var5).getDeclaredField(var6);
                } else if (var4 == 3 || var4 == 4) {
                    String var8 = new String(arg0.method2564());
                    String var9 = new String(arg0.method2564());
                    int var10 = arg0.method2411();
                    String[] var11 = new String[var10];
                    for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = new String(arg0.method2564());
                    }
                    byte[][] var13 = new byte[var10][];
                    if (var4 == 3) {
                        for (int var14 = 0; var14 < var10; var14++) {
                            int var15 = arg0.method2416();
                            var13[var14] = new byte[var15];
                            arg0.method2422(var13[var14], 0, var15);
                        }
                    }
                    var2.field2824[var3] = var4;
                    Class[] var16 = new Class[var10];
                    for (int var17 = 0; var17 < var10; var17++) {
                        var16[var17] = method1480(var11[var17]);
                    }
                    var2.field2828[var3] = method1480(var8).getDeclaredMethod(var9, var16);
                    var2.field2829[var3] = var13;
                }
            } catch (ClassNotFoundException var23) {
                var2.field2827[var3] = -1;
            } catch (SecurityException var24) {
                var2.field2827[var3] = -2;
            } catch (NullPointerException var25) {
                var2.field2827[var3] = -3;
            } catch (Exception var26) {
                var2.field2827[var3] = -4;
            } catch (Throwable var27) {
                var2.field2827[var3] = -5;
            }
        }
        field2830.method3247(var2);
    }

    @ObfuscatedName("bh.e(Ljava/lang/String;I)Ljava/lang/Class;")
    public static Class method1480(String arg0) throws ClassNotFoundException {
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
