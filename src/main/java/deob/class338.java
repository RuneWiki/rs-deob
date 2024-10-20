package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("lv")
public class class338 {

    @ObfuscatedName("lv.w")
    public static int field4238 = 0;

    @ObfuscatedName("lv.s")
    public static class451 field4241 = new class451(4096);

    @ObfuscatedName("lv.z")
    public static int field4242 = 0;

    @ObfuscatedName("lv.j")
    public static class451 field4243 = new class451(32);

    @ObfuscatedName("lv.i")
    public static int field4257 = 0;

    @ObfuscatedName("lv.n")
    public static class355 field4239 = new class355();

    @ObfuscatedName("lv.l")
    public static class451 field4250 = new class451(4096);

    @ObfuscatedName("lv.k")
    public static int field4247 = 0;

    @ObfuscatedName("lv.c")
    public static class451 field4248 = new class451(4096);

    @ObfuscatedName("lv.r")
    public static int field4256 = 0;

    @ObfuscatedName("lv.t")
    public static class474 field4258 = new class474(8);

    @ObfuscatedName("lv.p")
    public static int field4251 = 0;

    @ObfuscatedName("lv.u")
    public static CRC32 field4252 = new CRC32();

    @ObfuscatedName("lv.a")
    public static class335[] field4240 = new class335[256];

    @ObfuscatedName("lv.q")
    public static int field4254 = -1;

    @ObfuscatedName("lv.d")
    public static int field4255 = 255;

    @ObfuscatedName("lv.e")
    public static byte field4249 = 0;

    @ObfuscatedName("lv.g")
    public static int field4246 = 0;

    @ObfuscatedName("lv.y")
    public static int field4245 = 0;

    public class338() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cm.f(I)Z")
    public static boolean method2554() {
        long var0 = class287.method3099();
        int var2 = (int) (var0 - Statics.field4253);
        Statics.field4253 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field4238 += var2;
        if (field4256 == 0 && field4257 == 0 && field4247 == 0 && field4242 == 0) {
            return true;
        } else if (Statics.field4244 == null) {
            return false;
        } else {
            try {
                if (field4238 > 30000) {
                    throw new IOException();
                }
                while (field4257 < 200 && field4242 > 0) {
                    class336 var3 = (class336) field4241.method7708();
                    class474 var4 = new class474(4);
                    var4.method7947(1);
                    var4.method7949((int) var3.field4711);
                    Statics.field4244.method7152(var4.field4936, 0, 4);
                    field4243.method7716(var3, var3.field4711);
                    field4242--;
                    field4257++;
                }
                while (field4256 < 200 && field4247 > 0) {
                    class336 var5 = (class336) field4239.method6224();
                    class474 var6 = new class474(4);
                    var6.method7947(0);
                    var6.method7949((int) var5.field4711);
                    Statics.field4244.method7152(var6.field4936, 0, 4);
                    var5.method7429();
                    field4248.method7716(var5, var5.field4711);
                    field4247--;
                    field4256++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field4244.method7146();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field4238 = 0;
                    byte var9 = 0;
                    if (Statics.field2975 == null) {
                        var9 = 8;
                    } else if (field4251 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field4258.field4939;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field4244.method7149(field4258.field4936, field4258.field4939, var10);
                        if (field4249 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field4258.field4936[field4258.field4939 + var11] ^= field4249;
                            }
                        }
                        field4258.field4939 += var10;
                        if (field4258.field4939 < var9) {
                            break;
                        }
                        if (Statics.field2975 == null) {
                            field4258.field4939 = 0;
                            int var12 = field4258.method7964();
                            int var13 = field4258.method8032();
                            int var14 = field4258.method7964();
                            int var15 = field4258.method7979();
                            long var16 = (long) ((var12 << 16) + var13);
                            class336 var18 = (class336) field4243.method7706(var16);
                            Statics.field1382 = true;
                            if (var18 == null) {
                                var18 = (class336) field4248.method7706(var16);
                                Statics.field1382 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2975 = var18;
                            Statics.field82 = new class474(var15 + var19 + Statics.field2975.field4216);
                            Statics.field82.method7947(var14);
                            Statics.field82.method8048(var15);
                            field4251 = 8;
                            field4258.field4939 = 0;
                        } else if (field4251 == 0) {
                            if (field4258.field4936[0] == -1) {
                                field4251 = 1;
                                field4258.field4939 = 0;
                            } else {
                                Statics.field2975 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field82.field4936.length - Statics.field2975.field4216;
                        int var21 = 512 - field4251;
                        if (var21 > var20 - Statics.field82.field4939) {
                            var21 = var20 - Statics.field82.field4939;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field4244.method7149(Statics.field82.field4936, Statics.field82.field4939, var21);
                        if (field4249 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field82.field4936[Statics.field82.field4939 + var22] ^= field4249;
                            }
                        }
                        Statics.field82.field4939 += var21;
                        field4251 += var21;
                        if (Statics.field82.field4939 == var20) {
                            if (Statics.field2975.field4711 == 16711935L) {
                                Statics.field57 = Statics.field82;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class335 var24 = field4240[var23];
                                    if (var24 != null) {
                                        method10(var24, var23);
                                    }
                                }
                            } else {
                                field4252.reset();
                                field4252.update(Statics.field82.field4936, 0, var20);
                                int var25 = (int) field4252.getValue();
                                if (Statics.field2975.field4217 != var25) {
                                    try {
                                        Statics.field4244.method7150();
                                    } catch (Exception var30) {
                                    }
                                    field4246++;
                                    Statics.field4244 = null;
                                    field4249 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field4246 = 0;
                                field4245 = 0;
                                Statics.field2975.field4218.method5932((int) (Statics.field2975.field4711 & 0xFFFFL), Statics.field82.field4936, (Statics.field2975.field4711 & 0xFF0000L) == 16711680L, Statics.field1382);
                            }
                            Statics.field2975.method7431();
                            if (Statics.field1382) {
                                field4257--;
                            } else {
                                field4256--;
                            }
                            field4251 = 0;
                            Statics.field2975 = null;
                            Statics.field82 = null;
                        } else {
                            if (field4251 != 512) {
                                break;
                            }
                            field4251 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    Statics.field4244.method7150();
                } catch (Exception var29) {
                }
                field4245++;
                Statics.field4244 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("mq.w(Llm;IB)V")
    public static void method6210(class335 arg0, int arg1) {
        if (arg0.field4206) {
            if (arg1 <= field4254) {
                throw new RuntimeException("");
            }
            if (arg1 < field4255) {
                field4255 = arg1;
            }
        } else if (arg1 >= field4255) {
            throw new RuntimeException("");
        } else if (arg1 > field4254) {
            field4254 = arg1;
        }
        if (Statics.field57 == null) {
            method1742((class335) null, 255, 255, 0, (byte) 0, true);
            field4240[arg1] = arg0;
        } else {
            method10(arg0, arg1);
        }
    }

    @ObfuscatedName("w.v(Llm;II)V")
    public static void method10(class335 arg0, int arg1) {
        Statics.field57.field4939 = arg1 * 8 + 5;
        if (Statics.field57.field4939 < Statics.field57.field4936.length) {
            int var2 = Statics.field57.method7979();
            int var3 = Statics.field57.method7979();
            arg0.method5950(var2, var3);
        } else if (arg0.field4206) {
            arg0.method5933();
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("bw.s(Llm;IIIBZI)V")
    public static void method1742(class335 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class336 var8 = (class336) field4241.method7706(var6);
        if (var8 != null) {
            return;
        }
        class336 var9 = (class336) field4243.method7706(var6);
        if (var9 != null) {
            return;
        }
        class336 var10 = (class336) field4250.method7706(var6);
        if (var10 == null) {
            if (!arg5) {
                class336 var11 = (class336) field4248.method7706(var6);
                if (var11 != null) {
                    return;
                }
            }
            class336 var12 = new class336();
            var12.field4218 = arg0;
            var12.field4217 = arg3;
            var12.field4216 = arg4;
            if (arg5) {
                field4241.method7716(var12, var6);
                field4242++;
            } else {
                field4239.method6225(var12);
                field4250.method7716(var12, var6);
                field4247++;
            }
        } else if (arg5) {
            var10.method7429();
            field4241.method7716(var10, var6);
            field4247--;
            field4242++;
        }
    }

    @ObfuscatedName("dc.z(III)V")
    public static void method2890(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class336 var4 = (class336) field4250.method7706(var2);
        if (var4 != null) {
            field4239.method6226(var4);
        }
    }

    @ObfuscatedName("gv.j(I)V")
    public static void method3869() {
        if (Statics.field4244 != null) {
            Statics.field4244.method7150();
        }
    }
}
