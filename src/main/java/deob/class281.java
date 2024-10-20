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

@ObfuscatedName("ja")
public class class281 {

    @ObfuscatedName("ja.e")
    public static class192 field3746 = new class192();

    public class281() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ib.e(B)V")
    public static void method3947() {
        field3746 = new class192();
    }

    @ObfuscatedName("ic.o(Lfk;I)V")
    public static void method3971(class180 arg0) {
        class280 var1 = (class280) field3746.method3280();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field2370;
        arg0.method3055(var1.field3735);
        for (int var3 = 0; var3 < var1.field3739; var3++) {
            if (var1.field3738[var3] == 0) {
                try {
                    int var4 = var1.field3737[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field3740[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method2876(0);
                        arg0.method3055(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field3740[var3];
                        var7.setInt((Object) null, var1.field3736[var3]);
                        arg0.method2876(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field3740[var3];
                        int var9 = var8.getModifiers();
                        arg0.method2876(0);
                        arg0.method3055(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field3741[var3];
                        byte[][] var11 = var1.field3742[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method2876(0);
                        } else if (var15 instanceof Number) {
                            arg0.method2876(1);
                            arg0.method2881(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method2876(2);
                            arg0.method2936((String) var15);
                        } else {
                            arg0.method2876(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field3741[var3];
                        int var17 = var16.getModifiers();
                        arg0.method2876(0);
                        arg0.method3055(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method2876(-10);
                } catch (InvalidClassException var31) {
                    arg0.method2876(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method2876(-12);
                } catch (OptionalDataException var33) {
                    arg0.method2876(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method2876(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method2876(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method2876(-16);
                } catch (SecurityException var37) {
                    arg0.method2876(-17);
                } catch (IOException var38) {
                    arg0.method2876(-18);
                } catch (NullPointerException var39) {
                    arg0.method2876(-19);
                } catch (Exception var40) {
                    arg0.method2876(-20);
                } catch (Throwable var41) {
                    arg0.method2876(-21);
                }
            } else {
                arg0.method2876(var1.field3738[var3]);
            }
        }
        arg0.method2912(var2);
        var1.method3304();
    }
}
