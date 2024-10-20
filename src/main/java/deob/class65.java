package deob;

@ObfuscatedName("by")
public class class65 extends class67 {

    @ObfuscatedName("by.j")
    public int field1245;

    @ObfuscatedName("by.h")
    public int field1232;

    @ObfuscatedName("by.m")
    public int field1233;

    @ObfuscatedName("by.z")
    public int field1234;

    @ObfuscatedName("by.x")
    public int field1235;

    @ObfuscatedName("by.e")
    public int field1241;

    @ObfuscatedName("by.i")
    public int field1237;

    @ObfuscatedName("by.c")
    public int field1238;

    @ObfuscatedName("by.n")
    public int field1239;

    @ObfuscatedName("by.l")
    public int field1240;

    @ObfuscatedName("by.u")
    public boolean field1244;

    @ObfuscatedName("by.r")
    public int field1242;

    @ObfuscatedName("by.a")
    public int field1236;

    @ObfuscatedName("by.d")
    public int field1243;

    @ObfuscatedName("by.p")
    public int field1231;

    @ObfuscatedName("by.j(II)I")
    public static int method1351(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("by.h(II)I")
    public static int method1262(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("by.ae()I")
    public int method1344() {
        int var1 = this.field1235 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1238 == 0) {
            var2 -= this.field1245 * var2 / (((class63) this.field1250).field1214.length << 8);
        } else if (this.field1238 >= 0) {
            var2 -= this.field1239 * var2 / ((class63) this.field1250).field1214.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class65(class63 arg0, int arg1, int arg2) {
        this.field1250 = arg0;
        this.field1239 = arg0.field1216;
        this.field1240 = arg0.field1217;
        this.field1244 = arg0.field1218;
        this.field1232 = arg1;
        this.field1233 = arg2;
        this.field1234 = 8192;
        this.field1245 = 0;
        this.method1266();
    }

    public class65(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1250 = arg0;
        this.field1239 = arg0.field1216;
        this.field1240 = arg0.field1217;
        this.field1244 = arg0.field1218;
        this.field1232 = arg1;
        this.field1233 = arg2;
        this.field1234 = arg3;
        this.field1245 = 0;
        this.method1266();
    }

    @ObfuscatedName("by.m(Lbc;II)Lby;")
    public static class65 method1277(class63 arg0, int arg1, int arg2) {
        return arg0.field1214 == null || arg0.field1214.length == 0 ? null : new class65(arg0, (int) ((long) arg0.field1215 * 256L * (long) arg1 / (long) (Statics.field1182 * 100)), arg2 << 6);
    }

    @ObfuscatedName("by.z(Lbc;III)Lby;")
    public static class65 method1396(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1214 == null || arg0.field1214.length == 0 ? null : new class65(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("by.x()V")
    public void method1266() {
        this.field1235 = this.field1233;
        this.field1241 = method1351(this.field1233, this.field1234);
        this.field1237 = method1262(this.field1233, this.field1234);
    }

    @ObfuscatedName("by.l(I)V")
    public synchronized void method1267(int arg0) {
        this.field1238 = arg0;
    }

    @ObfuscatedName("by.r(I)V")
    public synchronized void method1268(int arg0) {
        this.method1265(arg0 << 6, this.method1298());
    }

    @ObfuscatedName("by.a(I)V")
    public synchronized void method1269(int arg0) {
        this.method1265(arg0, this.method1298());
    }

    @ObfuscatedName("by.d(II)V")
    public synchronized void method1265(int arg0, int arg1) {
        this.field1233 = arg0;
        this.field1234 = arg1;
        this.field1242 = 0;
        this.method1266();
    }

    @ObfuscatedName("by.p()I")
    public synchronized int method1271() {
        return this.field1233 == Integer.MIN_VALUE ? 0 : this.field1233;
    }

    @ObfuscatedName("by.q()I")
    public synchronized int method1298() {
        return this.field1234 < 0 ? -1 : this.field1234;
    }

    @ObfuscatedName("by.b(I)V")
    public synchronized void method1273(int arg0) {
        int var2 = ((class63) this.field1250).field1214.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1245 = arg0;
    }

    @ObfuscatedName("by.t(Z)V")
    public synchronized void method1274(boolean arg0) {
        this.field1232 = (this.field1232 >>> 31) + (this.field1232 ^ this.field1232 >> 31);
        if (arg0) {
            this.field1232 = -this.field1232;
        }
    }

    @ObfuscatedName("by.y()V")
    public void method1281() {
        if (this.field1242 == 0) {
            return;
        }
        if (this.field1233 == Integer.MIN_VALUE) {
            this.field1233 = 0;
        }
        this.field1242 = 0;
        this.method1266();
    }

    @ObfuscatedName("by.w(II)V")
    public synchronized void method1276(int arg0, int arg1) {
        this.method1357(arg0, arg1, this.method1298());
    }

    @ObfuscatedName("by.g(III)V")
    public synchronized void method1357(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1265(arg1, arg2);
            return;
        }
        int var4 = method1351(arg1, arg2);
        int var5 = method1262(arg1, arg2);
        if (this.field1241 == var4 && this.field1237 == var5) {
            this.field1242 = 0;
            return;
        }
        int var6 = arg1 - this.field1235;
        if (this.field1235 - arg1 > var6) {
            var6 = this.field1235 - arg1;
        }
        if (var4 - this.field1241 > var6) {
            var6 = var4 - this.field1241;
        }
        if (this.field1241 - var4 > var6) {
            var6 = this.field1241 - var4;
        }
        if (var5 - this.field1237 > var6) {
            var6 = var5 - this.field1237;
        }
        if (this.field1237 - var5 > var6) {
            var6 = this.field1237 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1242 = arg0;
        this.field1233 = arg1;
        this.field1234 = arg2;
        this.field1236 = (arg1 - this.field1235) / arg0;
        this.field1243 = (var4 - this.field1241) / arg0;
        this.field1231 = (var5 - this.field1237) / arg0;
    }

    @ObfuscatedName("by.s(I)V")
    public synchronized void method1293(int arg0) {
        if (arg0 == 0) {
            this.method1269(0);
            this.method3639();
        } else if (this.field1241 == 0 && this.field1237 == 0) {
            this.field1242 = 0;
            this.field1233 = 0;
            this.field1235 = 0;
            this.method3639();
        } else {
            int var2 = -this.field1235;
            if (this.field1235 > var2) {
                var2 = this.field1235;
            }
            if (-this.field1241 > var2) {
                var2 = -this.field1241;
            }
            if (this.field1241 > var2) {
                var2 = this.field1241;
            }
            if (-this.field1237 > var2) {
                var2 = -this.field1237;
            }
            if (this.field1237 > var2) {
                var2 = this.field1237;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1242 = arg0;
            this.field1233 = Integer.MIN_VALUE;
            this.field1236 = -this.field1235 / arg0;
            this.field1243 = -this.field1241 / arg0;
            this.field1231 = -this.field1237 / arg0;
        }
    }

    @ObfuscatedName("by.k(I)V")
    public synchronized void method1279(int arg0) {
        if (this.field1232 < 0) {
            this.field1232 = -arg0;
        } else {
            this.field1232 = arg0;
        }
    }

    @ObfuscatedName("by.o()I")
    public synchronized int method1280() {
        return this.field1232 < 0 ? -this.field1232 : this.field1232;
    }

    @ObfuscatedName("by.an()Z")
    public boolean method1358() {
        return this.field1245 < 0 || this.field1245 >= ((class63) this.field1250).field1214.length << 8;
    }

    @ObfuscatedName("by.aj()Z")
    public boolean method1282() {
        return this.field1242 != 0;
    }

    @ObfuscatedName("by.e()Lbi;")
    public class67 method1124() {
        return null;
    }

    @ObfuscatedName("by.i()Lbi;")
    public class67 method1125() {
        return null;
    }

    @ObfuscatedName("by.c()I")
    public int method1122() {
        return this.field1233 == 0 && this.field1242 == 0 ? 0 : 1;
    }

    @ObfuscatedName("by.n([III)V")
    public synchronized void method1148(int[] arg0, int arg1, int arg2) {
        if (this.field1233 == 0 && this.field1242 == 0) {
            this.method1145(arg2);
            return;
        }
        class63 var4 = (class63) this.field1250;
        int var5 = this.field1239 << 8;
        int var6 = this.field1240 << 8;
        int var7 = var4.field1214.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1238 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1245 < 0) {
            if (this.field1232 <= 0) {
                this.method1281();
                this.method3639();
                return;
            }
            this.field1245 = 0;
        }
        if (this.field1245 >= var7) {
            if (this.field1232 >= 0) {
                this.method1281();
                this.method3639();
                return;
            }
            this.field1245 = var7 - 1;
        }
        if (this.field1238 >= 0) {
            if (this.field1238 > 0) {
                if (this.field1244) {
                    label131: {
                        if (this.field1232 < 0) {
                            var9 = this.method1285(arg0, arg1, var5, var10, var4.field1214[this.field1239]);
                            if (this.field1245 >= var5) {
                                return;
                            }
                            this.field1245 = var5 + var5 - 1 - this.field1245;
                            this.field1232 = -this.field1232;
                            if (--this.field1238 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1356(arg0, var9, var6, var10, var4.field1214[this.field1240 - 1]);
                            if (this.field1245 < var6) {
                                return;
                            }
                            this.field1245 = var6 + var6 - 1 - this.field1245;
                            this.field1232 = -this.field1232;
                            if (--this.field1238 == 0) {
                                break;
                            }
                            var9 = this.method1285(arg0, var9, var5, var10, var4.field1214[this.field1239]);
                            if (this.field1245 >= var5) {
                                return;
                            }
                            this.field1245 = var5 + var5 - 1 - this.field1245;
                            this.field1232 = -this.field1232;
                        } while (--this.field1238 != 0);
                    }
                } else if (this.field1232 < 0) {
                    while (true) {
                        var9 = this.method1285(arg0, var9, var5, var10, var4.field1214[this.field1240 - 1]);
                        if (this.field1245 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1245) / var8;
                        if (var12 >= this.field1238) {
                            this.field1245 += this.field1238 * var8;
                            this.field1238 = 0;
                            break;
                        }
                        this.field1245 += var8 * var12;
                        this.field1238 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1356(arg0, var9, var6, var10, var4.field1214[this.field1239]);
                        if (this.field1245 < var6) {
                            return;
                        }
                        int var13 = (this.field1245 - var5) / var8;
                        if (var13 >= this.field1238) {
                            this.field1245 -= this.field1238 * var8;
                            this.field1238 = 0;
                            break;
                        }
                        this.field1245 -= var8 * var13;
                        this.field1238 -= var13;
                    }
                }
            }
            if (this.field1232 < 0) {
                this.method1285(arg0, var9, 0, var10, 0);
                if (this.field1245 < 0) {
                    this.field1245 = -1;
                    this.method1281();
                    this.method3639();
                }
            } else {
                this.method1356(arg0, var9, var7, var10, 0);
                if (this.field1245 >= var7) {
                    this.field1245 = var7;
                    this.method1281();
                    this.method3639();
                }
            }
        } else if (this.field1244) {
            if (this.field1232 < 0) {
                var9 = this.method1285(arg0, arg1, var5, var10, var4.field1214[this.field1239]);
                if (this.field1245 >= var5) {
                    return;
                }
                this.field1245 = var5 + var5 - 1 - this.field1245;
                this.field1232 = -this.field1232;
            }
            while (true) {
                int var11 = this.method1356(arg0, var9, var6, var10, var4.field1214[this.field1240 - 1]);
                if (this.field1245 < var6) {
                    return;
                }
                this.field1245 = var6 + var6 - 1 - this.field1245;
                this.field1232 = -this.field1232;
                var9 = this.method1285(arg0, var11, var5, var10, var4.field1214[this.field1239]);
                if (this.field1245 >= var5) {
                    return;
                }
                this.field1245 = var5 + var5 - 1 - this.field1245;
                this.field1232 = -this.field1232;
            }
        } else if (this.field1232 < 0) {
            while (true) {
                var9 = this.method1285(arg0, var9, var5, var10, var4.field1214[this.field1240 - 1]);
                if (this.field1245 >= var5) {
                    return;
                }
                this.field1245 = var6 - 1 - (var6 - 1 - this.field1245) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1356(arg0, var9, var6, var10, var4.field1214[this.field1239]);
                if (this.field1245 < var6) {
                    return;
                }
                this.field1245 = (this.field1245 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("by.u(I)V")
    public synchronized void method1145(int arg0) {
        if (this.field1242 > 0) {
            if (arg0 >= this.field1242) {
                if (this.field1233 == Integer.MIN_VALUE) {
                    this.field1233 = 0;
                    this.field1237 = 0;
                    this.field1241 = 0;
                    this.field1235 = 0;
                    this.method3639();
                    arg0 = this.field1242;
                }
                this.field1242 = 0;
                this.method1266();
            } else {
                this.field1235 += this.field1236 * arg0;
                this.field1241 += this.field1243 * arg0;
                this.field1237 += this.field1231 * arg0;
                this.field1242 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1250;
        int var3 = this.field1239 << 8;
        int var4 = this.field1240 << 8;
        int var5 = var2.field1214.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1238 = 0;
        }
        if (this.field1245 < 0) {
            if (this.field1232 <= 0) {
                this.method1281();
                this.method3639();
                return;
            }
            this.field1245 = 0;
        }
        if (this.field1245 >= var5) {
            if (this.field1232 >= 0) {
                this.method1281();
                this.method3639();
                return;
            }
            this.field1245 = var5 - 1;
        }
        this.field1245 += this.field1232 * arg0;
        if (this.field1238 >= 0) {
            if (this.field1238 > 0) {
                if (this.field1244) {
                    label121: {
                        if (this.field1232 < 0) {
                            if (this.field1245 >= var3) {
                                return;
                            }
                            this.field1245 = var3 + var3 - 1 - this.field1245;
                            this.field1232 = -this.field1232;
                            if (--this.field1238 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1245 < var4) {
                                return;
                            }
                            this.field1245 = var4 + var4 - 1 - this.field1245;
                            this.field1232 = -this.field1232;
                            if (--this.field1238 == 0) {
                                break;
                            }
                            if (this.field1245 >= var3) {
                                return;
                            }
                            this.field1245 = var3 + var3 - 1 - this.field1245;
                            this.field1232 = -this.field1232;
                        } while (--this.field1238 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1232 < 0) {
                            if (this.field1245 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1245) / var6;
                            if (var7 >= this.field1238) {
                                this.field1245 += this.field1238 * var6;
                                this.field1238 = 0;
                                break label153;
                            }
                            this.field1245 += var6 * var7;
                            this.field1238 -= var7;
                        } else if (this.field1245 >= var4) {
                            int var8 = (this.field1245 - var3) / var6;
                            if (var8 >= this.field1238) {
                                this.field1245 -= this.field1238 * var6;
                                this.field1238 = 0;
                                break label153;
                            }
                            this.field1245 -= var6 * var8;
                            this.field1238 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1232 < 0) {
                if (this.field1245 < 0) {
                    this.field1245 = -1;
                    this.method1281();
                    this.method3639();
                }
            } else if (this.field1245 >= var5) {
                this.field1245 = var5;
                this.method1281();
                this.method3639();
            }
        } else if (this.field1244) {
            if (this.field1232 < 0) {
                if (this.field1245 >= var3) {
                    return;
                }
                this.field1245 = var3 + var3 - 1 - this.field1245;
                this.field1232 = -this.field1232;
            }
            while (this.field1245 >= var4) {
                this.field1245 = var4 + var4 - 1 - this.field1245;
                this.field1232 = -this.field1232;
                if (this.field1245 >= var3) {
                    return;
                }
                this.field1245 = var3 + var3 - 1 - this.field1245;
                this.field1232 = -this.field1232;
            }
        } else if (this.field1232 < 0) {
            if (this.field1245 >= var3) {
                return;
            }
            this.field1245 = var4 - 1 - (var4 - 1 - this.field1245) % var6;
        } else if (this.field1245 >= var4) {
            this.field1245 = (this.field1245 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("by.ay([IIIII)I")
    public int method1356(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1242 > 0) {
                int var6 = this.field1242 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1242 += arg1;
                if (this.field1232 == 256 && (this.field1245 & 0xFF) == 0) {
                    if (Statics.field1945) {
                        arg1 = method1370(0, ((class63) this.field1250).field1214, arg0, this.field1245, arg1, this.field1241, this.field1237, this.field1243, this.field1231, 0, var6, arg2, this);
                    } else {
                        arg1 = method1395(((class63) this.field1250).field1214, arg0, this.field1245, arg1, this.field1235, this.field1236, 0, var6, arg2, this);
                    }
                } else if (Statics.field1945) {
                    arg1 = method1391(0, 0, ((class63) this.field1250).field1214, arg0, this.field1245, arg1, this.field1241, this.field1237, this.field1243, this.field1231, 0, var6, arg2, this, this.field1232, arg4);
                } else {
                    arg1 = method1299(0, 0, ((class63) this.field1250).field1214, arg0, this.field1245, arg1, this.field1235, this.field1236, 0, var6, arg2, this, this.field1232, arg4);
                }
                this.field1242 -= arg1;
                if (this.field1242 != 0) {
                    return arg1;
                }
                if (!this.method1286()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1232 == 256 && (this.field1245 & 0xFF) == 0) {
                if (Statics.field1945) {
                    return method1288(0, ((class63) this.field1250).field1214, arg0, this.field1245, arg1, this.field1241, this.field1237, 0, arg3, arg2, this);
                }
                return method1287(((class63) this.field1250).field1214, arg0, this.field1245, arg1, this.field1235, 0, arg3, arg2, this);
            }
            if (Statics.field1945) {
                return method1292(0, 0, ((class63) this.field1250).field1214, arg0, this.field1245, arg1, this.field1241, this.field1237, 0, arg3, arg2, this, this.field1232, arg4);
            }
            return method1263(0, 0, ((class63) this.field1250).field1214, arg0, this.field1245, arg1, this.field1235, 0, arg3, arg2, this, this.field1232, arg4);
        }
    }

    @ObfuscatedName("by.ao([IIIII)I")
    public int method1285(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1242 > 0) {
                int var6 = this.field1242 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1242 += arg1;
                if (this.field1232 == -256 && (this.field1245 & 0xFF) == 0) {
                    if (Statics.field1945) {
                        arg1 = method1272(0, ((class63) this.field1250).field1214, arg0, this.field1245, arg1, this.field1241, this.field1237, this.field1243, this.field1231, 0, var6, arg2, this);
                    } else {
                        arg1 = method1297(((class63) this.field1250).field1214, arg0, this.field1245, arg1, this.field1235, this.field1236, 0, var6, arg2, this);
                    }
                } else if (Statics.field1945) {
                    arg1 = method1302(0, 0, ((class63) this.field1250).field1214, arg0, this.field1245, arg1, this.field1241, this.field1237, this.field1243, this.field1231, 0, var6, arg2, this, this.field1232, arg4);
                } else {
                    arg1 = method1301(0, 0, ((class63) this.field1250).field1214, arg0, this.field1245, arg1, this.field1235, this.field1236, 0, var6, arg2, this, this.field1232, arg4);
                }
                this.field1242 -= arg1;
                if (this.field1242 != 0) {
                    return arg1;
                }
                if (!this.method1286()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1232 == -256 && (this.field1245 & 0xFF) == 0) {
                if (Statics.field1945) {
                    return method1343(0, ((class63) this.field1250).field1214, arg0, this.field1245, arg1, this.field1241, this.field1237, 0, arg3, arg2, this);
                }
                return method1289(((class63) this.field1250).field1214, arg0, this.field1245, arg1, this.field1235, 0, arg3, arg2, this);
            }
            if (Statics.field1945) {
                return method1294(0, 0, ((class63) this.field1250).field1214, arg0, this.field1245, arg1, this.field1241, this.field1237, 0, arg3, arg2, this, this.field1232, arg4);
            }
            return method1355(0, 0, ((class63) this.field1250).field1214, arg0, this.field1245, arg1, this.field1235, 0, arg3, arg2, this, this.field1232, arg4);
        }
    }

    @ObfuscatedName("by.ag()Z")
    public boolean method1286() {
        int var1 = this.field1233;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1351(var1, this.field1234);
            var2 = method1262(var1, this.field1234);
        }
        if (this.field1235 != var1 || this.field1241 != var3 || this.field1237 != var2) {
            if (this.field1235 < var1) {
                this.field1236 = 1;
                this.field1242 = var1 - this.field1235;
            } else if (this.field1235 > var1) {
                this.field1236 = -1;
                this.field1242 = this.field1235 - var1;
            } else {
                this.field1236 = 0;
            }
            if (this.field1241 < var3) {
                this.field1243 = 1;
                if (this.field1242 == 0 || this.field1242 > var3 - this.field1241) {
                    this.field1242 = var3 - this.field1241;
                }
            } else if (this.field1241 > var3) {
                this.field1243 = -1;
                if (this.field1242 == 0 || this.field1242 > this.field1241 - var3) {
                    this.field1242 = this.field1241 - var3;
                }
            } else {
                this.field1243 = 0;
            }
            if (this.field1237 < var2) {
                this.field1231 = 1;
                if (this.field1242 == 0 || this.field1242 > var2 - this.field1237) {
                    this.field1242 = var2 - this.field1237;
                }
            } else if (this.field1237 > var2) {
                this.field1231 = -1;
                if (this.field1242 == 0 || this.field1242 > this.field1237 - var2) {
                    this.field1242 = this.field1237 - var2;
                }
            } else {
                this.field1231 = 0;
            }
            return false;
        } else if (this.field1233 == Integer.MIN_VALUE) {
            this.field1233 = 0;
            this.field1237 = 0;
            this.field1241 = 0;
            this.field1235 = 0;
            this.method3639();
            return true;
        } else {
            this.method1266();
            return false;
        }
    }

    @ObfuscatedName("by.as([B[IIIIIIILby;)I")
    public static int method1287(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12;
        if ((var12 = arg3 + var10 - var9) > arg6) {
            var12 = arg6;
        }
        var12 -= 3;
        int var10001;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9++] * var11;
            int var13 = arg3++;
            arg1[var13] += arg0[var9++] * var11;
            int var14 = arg3++;
            arg1[var14] += arg0[var9++] * var11;
            int var15 = arg3++;
            arg1[var15] += arg0[var9++] * var11;
        }
        var12 += 3;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9++] * var11;
        }
        arg8.field1245 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("by.az(I[B[IIIIIIIILby;)I")
    public static int method1288(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15;
        if ((var15 = arg4 + var12 - var11) > arg8) {
            var15 = arg8;
        }
        int var16 = arg4 << 1;
        int var17 = var15 << 1;
        int var23 = var17 - 6;
        while (var16 < var23) {
            byte var18 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field1245 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("by.av([B[IIIIIIILby;)I")
    public static int method1289(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12;
        if ((var12 = arg3 + var9 - (var10 - 1)) > arg6) {
            var12 = arg6;
        }
        var12 -= 3;
        int var10001;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9--] * var11;
            int var13 = arg3++;
            arg1[var13] += arg0[var9--] * var11;
            int var14 = arg3++;
            arg1[var14] += arg0[var9--] * var11;
            int var15 = arg3++;
            arg1[var15] += arg0[var9--] * var11;
        }
        var12 += 3;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9--] * var11;
        }
        arg8.field1245 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("by.at(I[B[IIIIIIIILby;)I")
    public static int method1343(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15;
        if ((var15 = arg4 + var11 - (var12 - 1)) > arg8) {
            var15 = arg8;
        }
        int var16 = arg4 << 1;
        int var17 = var15 << 1;
        int var23 = var17 - 6;
        while (var16 < var23) {
            byte var18 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field1245 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("by.ar(II[B[IIIIIIILby;II)I")
    public static int method1263(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14 + 1] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 - arg4 + arg11 - 1) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (var17 - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field1245 = arg4;
        return arg5;
    }

    @ObfuscatedName("by.aw(II[B[IIIIIIIILby;II)I")
    public static int method1292(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17 + 1] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 0xFF) * (var22 - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        arg11.field1245 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("by.ac(II[B[IIIIIIILby;II)I")
    public static int method1355(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        int var18 = arg11;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
            arg4 += var18;
        }
        arg10.field1245 = arg4;
        return arg5;
    }

    @ObfuscatedName("by.ap(II[B[IIIIIIIILby;II)I")
    public static int method1294(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            int var23 = (var22 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        arg11.field1245 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("by.af([B[IIIIIIIILby;)I")
    public static int method1395(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1241 += (var14 - arg3) * arg9.field1243;
        arg9.field1237 += (var14 - arg3) * arg9.field1231;
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10++] * var12;
            int var15 = var12 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var10++] * var15;
            int var16 = var13 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var10++] * var16;
            int var17 = var13 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var10++] * var17;
            var12 = var13 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10++] * var12;
            var12 += var13;
        }
        arg9.field1235 = var12 >> 2;
        arg9.field1245 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("by.al(I[B[IIIIIIIIIILby;)I")
    public static int method1370(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19;
        if ((var19 = arg4 + var14 - var13) > arg10) {
            var19 = arg10;
        }
        arg12.field1235 += (var19 - arg4) * arg12.field1236;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field1241 = var15 >> 2;
        arg12.field1237 = var16 >> 2;
        arg12.field1245 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("by.ad([B[IIIIIIIILby;)I")
    public static int method1297(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1241 += (var14 - arg3) * arg9.field1243;
        arg9.field1237 += (var14 - arg3) * arg9.field1231;
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10--] * var12;
            int var15 = var12 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var10--] * var15;
            int var16 = var13 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var10--] * var16;
            int var17 = var13 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var10--] * var17;
            var12 = var13 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10--] * var12;
            var12 += var13;
        }
        arg9.field1235 = var12 >> 2;
        arg9.field1245 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("by.ak(I[B[IIIIIIIIIILby;)I")
    public static int method1272(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19;
        if ((var19 = arg4 + var13 - (var14 - 1)) > arg10) {
            var19 = arg10;
        }
        arg12.field1235 += (var19 - arg4) * arg12.field1236;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field1241 = var15 >> 2;
        arg12.field1237 = var16 >> 2;
        arg12.field1245 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("by.bb(II[B[IIIIIIIILby;II)I")
    public static int method1299(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1241 -= arg11.field1243 * arg5;
        arg11.field1237 -= arg11.field1231 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15 + 1] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 - arg4 + arg12 - 1) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        while (arg5 < var17) {
            byte var19 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 0xFF) * (var18 - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field1241 += arg11.field1243 * arg5;
        arg11.field1237 += arg11.field1231 * arg5;
        arg11.field1235 = arg6;
        arg11.field1245 = arg4;
        return arg5;
    }

    @ObfuscatedName("by.bt(II[B[IIIIIIIIIILby;II)I")
    public static int method1391(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1235 -= arg13.field1236 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19 + 1] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            byte var25 = arg2[arg4 >> 8];
            int var26 = (var25 << 8) + (arg4 & 0xFF) * (var24 - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var27 = var17 >> 1;
        arg13.field1235 += arg13.field1236 * var27;
        arg13.field1241 = arg6;
        arg13.field1237 = arg7;
        arg13.field1245 = arg4;
        return var27;
    }

    @ObfuscatedName("by.bd(II[B[IIIIIIIILby;II)I")
    public static int method1301(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1241 -= arg11.field1243 * arg5;
        arg11.field1237 -= arg11.field1231 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        int var19 = arg12;
        while (arg5 < var17) {
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var18)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var19;
        }
        arg11.field1241 += arg11.field1243 * arg5;
        arg11.field1237 += arg11.field1231 * arg5;
        arg11.field1235 = arg6;
        arg11.field1245 = arg4;
        return arg5;
    }

    @ObfuscatedName("by.bx(II[B[IIIIIIIIIILby;II)I")
    public static int method1302(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1235 -= arg13.field1236 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            int var25 = (var24 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var25 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var26 = var17 >> 1;
        arg13.field1235 += arg13.field1236 * var26;
        arg13.field1241 = arg6;
        arg13.field1237 = arg7;
        arg13.field1245 = arg4;
        return var26;
    }
}
