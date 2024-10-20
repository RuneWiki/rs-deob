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

@ObfuscatedName("gh")
public class class190 {

    @ObfuscatedName("gh.g")
    public static class181 field2896 = new class181();

    public class190() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.g(I)V")
    public static void method131() {
        field2896 = new class181();
    }

    @ObfuscatedName("aq.i(Ldb;I)V")
    public static void method823(class110 arg0) {
        class189 var1 = (class189) field2896.method3243();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field1844;
        arg0.method2247(var1.field2893);
        for (int var3 = 0; var3 < var1.field2891; var3++) {
            if (var1.field2890[var3] == 0) {
                try {
                    int var4 = var1.field2888[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field2892[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method2079(0);
                        arg0.method2247(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field2892[var3];
                        var7.setInt((Object) null, var1.field2894[var3]);
                        arg0.method2079(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field2892[var3];
                        int var9 = var8.getModifiers();
                        arg0.method2079(0);
                        arg0.method2247(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field2889[var3];
                        byte[][] var11 = var1.field2895[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method2079(0);
                        } else if (var15 instanceof Number) {
                            arg0.method2079(1);
                            arg0.method2082(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method2079(2);
                            arg0.method2193((String) var15);
                        } else {
                            arg0.method2079(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field2889[var3];
                        int var17 = var16.getModifiers();
                        arg0.method2079(0);
                        arg0.method2247(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method2079(-10);
                } catch (InvalidClassException var31) {
                    arg0.method2079(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method2079(-12);
                } catch (OptionalDataException var33) {
                    arg0.method2079(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method2079(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method2079(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method2079(-16);
                } catch (SecurityException var37) {
                    arg0.method2079(-17);
                } catch (IOException var38) {
                    arg0.method2079(-18);
                } catch (NullPointerException var39) {
                    arg0.method2079(-19);
                } catch (Exception var40) {
                    arg0.method2079(-20);
                } catch (Throwable var41) {
                    arg0.method2079(-21);
                }
            } else {
                arg0.method2079(var1.field2890[var3]);
            }
        }
        arg0.method2111(var2);
        var1.method3304();
    }
}
