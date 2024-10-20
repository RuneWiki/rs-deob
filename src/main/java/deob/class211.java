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

@ObfuscatedName("hq")
public class class211 {

    @ObfuscatedName("hq.l")
    public static class202 field3120 = new class202();

    public class211() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dw.l(I)V")
    public static void method2332() {
        field3120 = new class202();
    }

    @ObfuscatedName("he.e(I)Z")
    public static boolean method3631() {
        class210 var0 = (class210) field3120.method3577();
        return var0 != null;
    }

    @ObfuscatedName("cb.q(Ldx;I)V")
    public static void method1969(class122 arg0) {
        class210 var1 = (class210) field3120.method3577();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field1988;
        arg0.method2376(var1.field3112);
        for (int var3 = 0; var3 < var1.field3119; var3++) {
            if (var1.field3113[var3] == 0) {
                try {
                    int var4 = var1.field3118[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field3114[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method2503(0);
                        arg0.method2376(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field3114[var3];
                        var7.setInt((Object) null, var1.field3115[var3]);
                        arg0.method2503(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field3114[var3];
                        int var9 = var8.getModifiers();
                        arg0.method2503(0);
                        arg0.method2376(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field3116[var3];
                        byte[][] var11 = var1.field3117[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method2503(0);
                        } else if (var15 instanceof Number) {
                            arg0.method2503(1);
                            arg0.method2378(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method2503(2);
                            arg0.method2379((String) var15);
                        } else {
                            arg0.method2503(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field3116[var3];
                        int var17 = var16.getModifiers();
                        arg0.method2503(0);
                        arg0.method2376(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method2503(-10);
                } catch (InvalidClassException var31) {
                    arg0.method2503(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method2503(-12);
                } catch (OptionalDataException var33) {
                    arg0.method2503(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method2503(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method2503(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method2503(-16);
                } catch (SecurityException var37) {
                    arg0.method2503(-17);
                } catch (IOException var38) {
                    arg0.method2503(-18);
                } catch (NullPointerException var39) {
                    arg0.method2503(-19);
                } catch (Exception var40) {
                    arg0.method2503(-20);
                } catch (Throwable var41) {
                    arg0.method2503(-21);
                }
            } else {
                arg0.method2503(var1.field3113[var3]);
            }
        }
        arg0.method2428(var2);
        var1.method3620();
    }
}
