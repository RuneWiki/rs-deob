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

@ObfuscatedName("gu")
public class class184 {

    @ObfuscatedName("gu.e")
    public static class179 field2855 = new class179();

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eq.e(Ldr;II)V")
    public static void method2725(class117 arg0, int arg1) {
        while (true) {
            class183 var2 = (class183) field2855.method3331();
            if (var2 == null) {
                return;
            }
            arg0.method2333(arg1);
            arg0.method2634(0);
            int var3 = arg0.field2045;
            arg0.method2454(var2.field2848);
            for (int var4 = 0; var4 < var2.field2846; var4++) {
                if (var2.field2851[var4] == 0) {
                    try {
                        int var5 = var2.field2845[var4];
                        if (var5 == 0) {
                            Field var6 = var2.field2849[var4];
                            int var7 = var6.getInt((Object) null);
                            arg0.method2634(0);
                            arg0.method2454(var7);
                        } else if (var5 == 1) {
                            Field var8 = var2.field2849[var4];
                            var8.setInt((Object) null, var2.field2850[var4]);
                            arg0.method2634(0);
                        } else if (var5 == 2) {
                            Field var9 = var2.field2849[var4];
                            int var10 = var9.getModifiers();
                            arg0.method2634(0);
                            arg0.method2454(var10);
                        }
                        if (var5 == 3) {
                            Method var11 = var2.field2854[var4];
                            byte[][] var12 = var2.field2852[var4];
                            Object[] var13 = new Object[var12.length];
                            for (int var14 = 0; var14 < var12.length; var14++) {
                                ObjectInputStream var15 = new ObjectInputStream(new ByteArrayInputStream(var12[var14]));
                                var13[var14] = var15.readObject();
                            }
                            Object var16 = var11.invoke((Object) null, var13);
                            if (var16 == null) {
                                arg0.method2634(0);
                            } else if (var16 instanceof Number) {
                                arg0.method2634(1);
                                arg0.method2444(((Number) var16).longValue());
                            } else if (var16 instanceof String) {
                                arg0.method2634(2);
                                arg0.method2445((String) var16);
                            } else {
                                arg0.method2634(4);
                            }
                        } else if (var5 == 4) {
                            Method var17 = var2.field2854[var4];
                            int var18 = var17.getModifiers();
                            arg0.method2634(0);
                            arg0.method2454(var18);
                        }
                    } catch (ClassNotFoundException var31) {
                        arg0.method2634(-10);
                    } catch (InvalidClassException var32) {
                        arg0.method2634(-11);
                    } catch (StreamCorruptedException var33) {
                        arg0.method2634(-12);
                    } catch (OptionalDataException var34) {
                        arg0.method2634(-13);
                    } catch (IllegalAccessException var35) {
                        arg0.method2634(-14);
                    } catch (IllegalArgumentException var36) {
                        arg0.method2634(-15);
                    } catch (InvocationTargetException var37) {
                        arg0.method2634(-16);
                    } catch (SecurityException var38) {
                        arg0.method2634(-17);
                    } catch (IOException var39) {
                        arg0.method2634(-18);
                    } catch (NullPointerException var40) {
                        arg0.method2634(-19);
                    } catch (Exception var41) {
                        arg0.method2634(-20);
                    } catch (Throwable var42) {
                        arg0.method2634(-21);
                    }
                } else {
                    arg0.method2634(var2.field2851[var4]);
                }
            }
            arg0.method2473(var3);
            arg0.method2451(arg0.field2045 - var3);
            var2.method3366();
        }
    }

    @ObfuscatedName("r.i(Ldl;IB)V")
    public static void method233(class128 arg0, int arg1) {
        class183 var2 = new class183();
        var2.field2846 = arg0.method2548();
        var2.field2848 = arg0.method2592();
        var2.field2845 = new int[var2.field2846];
        var2.field2851 = new int[var2.field2846];
        var2.field2849 = new Field[var2.field2846];
        var2.field2850 = new int[var2.field2846];
        var2.field2854 = new Method[var2.field2846];
        var2.field2852 = new byte[var2.field2846][][];
        for (int var3 = 0; var3 < var2.field2846; var3++) {
            try {
                int var4 = arg0.method2548();
                if (var4 == 0 || var4 == 1 || var4 == 2) {
                    String var5 = new String(arg0.method2559());
                    String var6 = new String(arg0.method2559());
                    int var7 = 0;
                    if (var4 == 1) {
                        var7 = arg0.method2592();
                    }
                    var2.field2845[var3] = var4;
                    var2.field2850[var3] = var7;
                    var2.field2849[var3] = Statics.method1679(var5).getDeclaredField(var6);
                } else if (var4 == 3 || var4 == 4) {
                    String var8 = new String(arg0.method2559());
                    String var9 = new String(arg0.method2559());
                    int var10 = arg0.method2548();
                    String[] var11 = new String[var10];
                    for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = new String(arg0.method2559());
                    }
                    byte[][] var13 = new byte[var10][];
                    if (var4 == 3) {
                        for (int var14 = 0; var14 < var10; var14++) {
                            int var15 = arg0.method2592();
                            var13[var14] = new byte[var15];
                            arg0.method2465(var13[var14], 0, var15);
                        }
                    }
                    var2.field2845[var3] = var4;
                    Class[] var16 = new Class[var10];
                    for (int var17 = 0; var17 < var10; var17++) {
                        var16[var17] = Statics.method1679(var11[var17]);
                    }
                    var2.field2854[var3] = Statics.method1679(var8).getDeclaredMethod(var9, var16);
                    var2.field2852[var3] = var13;
                }
            } catch (ClassNotFoundException var23) {
                var2.field2851[var3] = -1;
            } catch (SecurityException var24) {
                var2.field2851[var3] = -2;
            } catch (NullPointerException var25) {
                var2.field2851[var3] = -3;
            } catch (Exception var26) {
                var2.field2851[var3] = -4;
            } catch (Throwable var27) {
                var2.field2851[var3] = -5;
            }
        }
        field2855.method3328(var2);
    }
}
