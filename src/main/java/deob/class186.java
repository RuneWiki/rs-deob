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
public class class186 {

    @ObfuscatedName("gn.e")
    public static class176 field2857 = new class176();

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fg.e(Ldc;II)V")
    public static void method3133(class110 arg0, int arg1) {
        while (true) {
            class185 var2 = (class185) field2857.method3225();
            if (var2 == null) {
                return;
            }
            arg0.method2374(arg1);
            arg0.method2249(0);
            int var3 = arg0.field1841;
            arg0.method2130(var2.field2852);
            for (int var4 = 0; var4 < var2.field2848; var4++) {
                if (var2.field2853[var4] == 0) {
                    try {
                        int var5 = var2.field2849[var4];
                        if (var5 == 0) {
                            Field var6 = var2.field2851[var4];
                            int var7 = var6.getInt((Object) null);
                            arg0.method2249(0);
                            arg0.method2130(var7);
                        } else if (var5 == 1) {
                            Field var8 = var2.field2851[var4];
                            var8.setInt((Object) null, var2.field2850[var4]);
                            arg0.method2249(0);
                        } else if (var5 == 2) {
                            Field var9 = var2.field2851[var4];
                            int var10 = var9.getModifiers();
                            arg0.method2249(0);
                            arg0.method2130(var10);
                        }
                        if (var5 == 3) {
                            Method var11 = var2.field2847[var4];
                            byte[][] var12 = var2.field2854[var4];
                            Object[] var13 = new Object[var12.length];
                            for (int var14 = 0; var14 < var12.length; var14++) {
                                ObjectInputStream var15 = new ObjectInputStream(new ByteArrayInputStream(var12[var14]));
                                var13[var14] = var15.readObject();
                            }
                            Object var16 = var11.invoke((Object) null, var13);
                            if (var16 == null) {
                                arg0.method2249(0);
                            } else if (var16 instanceof Number) {
                                arg0.method2249(1);
                                arg0.method2131(((Number) var16).longValue());
                            } else if (var16 instanceof String) {
                                arg0.method2249(2);
                                arg0.method2132((String) var16);
                            } else {
                                arg0.method2249(4);
                            }
                        } else if (var5 == 4) {
                            Method var17 = var2.field2847[var4];
                            int var18 = var17.getModifiers();
                            arg0.method2249(0);
                            arg0.method2130(var18);
                        }
                    } catch (ClassNotFoundException var31) {
                        arg0.method2249(-10);
                    } catch (InvalidClassException var32) {
                        arg0.method2249(-11);
                    } catch (StreamCorruptedException var33) {
                        arg0.method2249(-12);
                    } catch (OptionalDataException var34) {
                        arg0.method2249(-13);
                    } catch (IllegalAccessException var35) {
                        arg0.method2249(-14);
                    } catch (IllegalArgumentException var36) {
                        arg0.method2249(-15);
                    } catch (InvocationTargetException var37) {
                        arg0.method2249(-16);
                    } catch (SecurityException var38) {
                        arg0.method2249(-17);
                    } catch (IOException var39) {
                        arg0.method2249(-18);
                    } catch (NullPointerException var40) {
                        arg0.method2249(-19);
                    } catch (Exception var41) {
                        arg0.method2249(-20);
                    } catch (Throwable var42) {
                        arg0.method2249(-21);
                    }
                } else {
                    arg0.method2249(var2.field2853[var4]);
                }
            }
            arg0.method2160(var3);
            arg0.method2225(arg0.field1841 - var3);
            var2.method3307();
        }
    }

    @ObfuscatedName("ee.p(Ljava/lang/String;I)Ljava/lang/Class;")
    public static Class method2712(String arg0) throws ClassNotFoundException {
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
