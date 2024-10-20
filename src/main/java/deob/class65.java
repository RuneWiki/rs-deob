package deob;

@ObfuscatedName("bw")
public class class65 extends class67 {

    @ObfuscatedName("bw.f")
    public int field1268;

    @ObfuscatedName("bw.u")
    public int field1265;

    @ObfuscatedName("bw.x")
    public int field1264;

    @ObfuscatedName("bw.b")
    public int field1267;

    @ObfuscatedName("bw.l")
    public int field1273;

    @ObfuscatedName("bw.d")
    public int field1269;

    @ObfuscatedName("bw.n")
    public int field1270;

    @ObfuscatedName("bw.m")
    public int field1271;

    @ObfuscatedName("bw.g")
    public int field1272;

    @ObfuscatedName("bw.s")
    public int field1266;

    @ObfuscatedName("bw.r")
    public boolean field1274;

    @ObfuscatedName("bw.k")
    public int field1275;

    @ObfuscatedName("bw.o")
    public int field1276;

    @ObfuscatedName("bw.q")
    public int field1277;

    @ObfuscatedName("bw.p")
    public int field1278;

    @ObfuscatedName("bw.f(II)I")
    public static int method1436(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bw.u(II)I")
    public static int method1307(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bw.ah()I")
    public int method1308() {
        int var1 = this.field1273 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1271 == 0) {
            var2 -= this.field1268 * var2 / (((class63) this.field1282).field1248.length << 8);
        } else if (this.field1271 >= 0) {
            var2 -= this.field1272 * var2 / ((class63) this.field1282).field1248.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class65(class63 arg0, int arg1, int arg2) {
        this.field1282 = arg0;
        this.field1272 = arg0.field1247;
        this.field1266 = arg0.field1250;
        this.field1274 = arg0.field1251;
        this.field1265 = arg1;
        this.field1264 = arg2;
        this.field1267 = 8192;
        this.field1268 = 0;
        this.method1350();
    }

    public class65(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1282 = arg0;
        this.field1272 = arg0.field1247;
        this.field1266 = arg0.field1250;
        this.field1274 = arg0.field1251;
        this.field1265 = arg1;
        this.field1264 = arg2;
        this.field1267 = arg3;
        this.field1268 = 0;
        this.method1350();
    }

    @ObfuscatedName("bw.x(Lbe;II)Lbw;")
    public static class65 method1310(class63 arg0, int arg1, int arg2) {
        return arg0.field1248 == null || arg0.field1248.length == 0 ? null : new class65(arg0, (int) ((long) arg0.field1249 * 256L * (long) arg1 / (long) (Statics.field1197 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bw.b(Lbe;III)Lbw;")
    public static class65 method1311(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1248 == null || arg0.field1248.length == 0 ? null : new class65(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bw.l()V")
    public void method1350() {
        this.field1273 = this.field1264;
        this.field1269 = method1436(this.field1264, this.field1267);
        this.field1270 = method1307(this.field1264, this.field1267);
    }

    @ObfuscatedName("bw.s(I)V")
    public synchronized void method1328(int arg0) {
        this.field1271 = arg0;
    }

    @ObfuscatedName("bw.k(I)V")
    public synchronized void method1313(int arg0) {
        this.method1387(arg0 << 6, this.method1317());
    }

    @ObfuscatedName("bw.o(I)V")
    public synchronized void method1341(int arg0) {
        this.method1387(arg0, this.method1317());
    }

    @ObfuscatedName("bw.q(II)V")
    public synchronized void method1387(int arg0, int arg1) {
        this.field1264 = arg0;
        this.field1267 = arg1;
        this.field1275 = 0;
        this.method1350();
    }

    @ObfuscatedName("bw.p()I")
    public synchronized int method1395() {
        return this.field1264 == Integer.MIN_VALUE ? 0 : this.field1264;
    }

    @ObfuscatedName("bw.h()I")
    public synchronized int method1317() {
        return this.field1267 < 0 ? -1 : this.field1267;
    }

    @ObfuscatedName("bw.e(I)V")
    public synchronized void method1318(int arg0) {
        int var2 = ((class63) this.field1282).field1248.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1268 = arg0;
    }

    @ObfuscatedName("bw.t(Z)V")
    public synchronized void method1319(boolean arg0) {
        this.field1265 = (this.field1265 >>> 31) + (this.field1265 ^ this.field1265 >> 31);
        if (arg0) {
            this.field1265 = -this.field1265;
        }
    }

    @ObfuscatedName("bw.w()V")
    public void method1320() {
        if (this.field1275 == 0) {
            return;
        }
        if (this.field1264 == Integer.MIN_VALUE) {
            this.field1264 = 0;
        }
        this.field1275 = 0;
        this.method1350();
    }

    @ObfuscatedName("bw.v(II)V")
    public synchronized void method1396(int arg0, int arg1) {
        this.method1348(arg0, arg1, this.method1317());
    }

    @ObfuscatedName("bw.y(III)V")
    public synchronized void method1348(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1387(arg1, arg2);
            return;
        }
        int var4 = method1436(arg1, arg2);
        int var5 = method1307(arg1, arg2);
        if (this.field1269 == var4 && this.field1270 == var5) {
            this.field1275 = 0;
            return;
        }
        int var6 = arg1 - this.field1273;
        if (this.field1273 - arg1 > var6) {
            var6 = this.field1273 - arg1;
        }
        if (var4 - this.field1269 > var6) {
            var6 = var4 - this.field1269;
        }
        if (this.field1269 - var4 > var6) {
            var6 = this.field1269 - var4;
        }
        if (var5 - this.field1270 > var6) {
            var6 = var5 - this.field1270;
        }
        if (this.field1270 - var5 > var6) {
            var6 = this.field1270 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1275 = arg0;
        this.field1264 = arg1;
        this.field1267 = arg2;
        this.field1276 = (arg1 - this.field1273) / arg0;
        this.field1277 = (var4 - this.field1269) / arg0;
        this.field1278 = (var5 - this.field1270) / arg0;
    }

    @ObfuscatedName("bw.ac(I)V")
    public synchronized void method1323(int arg0) {
        if (arg0 == 0) {
            this.method1341(0);
            this.method3679();
        } else if (this.field1269 == 0 && this.field1270 == 0) {
            this.field1275 = 0;
            this.field1264 = 0;
            this.field1273 = 0;
            this.method3679();
        } else {
            int var2 = -this.field1273;
            if (this.field1273 > var2) {
                var2 = this.field1273;
            }
            if (-this.field1269 > var2) {
                var2 = -this.field1269;
            }
            if (this.field1269 > var2) {
                var2 = this.field1269;
            }
            if (-this.field1270 > var2) {
                var2 = -this.field1270;
            }
            if (this.field1270 > var2) {
                var2 = this.field1270;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1275 = arg0;
            this.field1264 = Integer.MIN_VALUE;
            this.field1276 = -this.field1273 / arg0;
            this.field1277 = -this.field1269 / arg0;
            this.field1278 = -this.field1270 / arg0;
        }
    }

    @ObfuscatedName("bw.aj(I)V")
    public synchronized void method1432(int arg0) {
        if (this.field1265 < 0) {
            this.field1265 = -arg0;
        } else {
            this.field1265 = arg0;
        }
    }

    @ObfuscatedName("bw.an()I")
    public synchronized int method1346() {
        return this.field1265 < 0 ? -this.field1265 : this.field1265;
    }

    @ObfuscatedName("bw.am()Z")
    public boolean method1347() {
        return this.field1268 < 0 || this.field1268 >= ((class63) this.field1282).field1248.length << 8;
    }

    @ObfuscatedName("bw.az()Z")
    public boolean method1437() {
        return this.field1275 != 0;
    }

    @ObfuscatedName("bw.d()Lbt;")
    public class67 method1177() {
        return null;
    }

    @ObfuscatedName("bw.n()Lbt;")
    public class67 method1178() {
        return null;
    }

    @ObfuscatedName("bw.m()I")
    public int method1189() {
        return this.field1264 == 0 && this.field1275 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bw.g([III)V")
    public synchronized void method1185(int[] arg0, int arg1, int arg2) {
        if (this.field1264 == 0 && this.field1275 == 0) {
            this.method1181(arg2);
            return;
        }
        class63 var4 = (class63) this.field1282;
        int var5 = this.field1272 << 8;
        int var6 = this.field1266 << 8;
        int var7 = var4.field1248.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1271 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1268 < 0) {
            if (this.field1265 <= 0) {
                this.method1320();
                this.method3679();
                return;
            }
            this.field1268 = 0;
        }
        if (this.field1268 >= var7) {
            if (this.field1265 >= 0) {
                this.method1320();
                this.method3679();
                return;
            }
            this.field1268 = var7 - 1;
        }
        if (this.field1271 >= 0) {
            if (this.field1271 > 0) {
                if (this.field1274) {
                    label131: {
                        if (this.field1265 < 0) {
                            var9 = this.method1330(arg0, arg1, var5, var10, var4.field1248[this.field1272]);
                            if (this.field1268 >= var5) {
                                return;
                            }
                            this.field1268 = var5 + var5 - 1 - this.field1268;
                            this.field1265 = -this.field1265;
                            if (--this.field1271 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1329(arg0, var9, var6, var10, var4.field1248[this.field1266 - 1]);
                            if (this.field1268 < var6) {
                                return;
                            }
                            this.field1268 = var6 + var6 - 1 - this.field1268;
                            this.field1265 = -this.field1265;
                            if (--this.field1271 == 0) {
                                break;
                            }
                            var9 = this.method1330(arg0, var9, var5, var10, var4.field1248[this.field1272]);
                            if (this.field1268 >= var5) {
                                return;
                            }
                            this.field1268 = var5 + var5 - 1 - this.field1268;
                            this.field1265 = -this.field1265;
                        } while (--this.field1271 != 0);
                    }
                } else if (this.field1265 < 0) {
                    while (true) {
                        var9 = this.method1330(arg0, var9, var5, var10, var4.field1248[this.field1266 - 1]);
                        if (this.field1268 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1268) / var8;
                        if (var12 >= this.field1271) {
                            this.field1268 += this.field1271 * var8;
                            this.field1271 = 0;
                            break;
                        }
                        this.field1268 += var8 * var12;
                        this.field1271 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1329(arg0, var9, var6, var10, var4.field1248[this.field1272]);
                        if (this.field1268 < var6) {
                            return;
                        }
                        int var13 = (this.field1268 - var5) / var8;
                        if (var13 >= this.field1271) {
                            this.field1268 -= this.field1271 * var8;
                            this.field1271 = 0;
                            break;
                        }
                        this.field1268 -= var8 * var13;
                        this.field1271 -= var13;
                    }
                }
            }
            if (this.field1265 < 0) {
                this.method1330(arg0, var9, 0, var10, 0);
                if (this.field1268 < 0) {
                    this.field1268 = -1;
                    this.method1320();
                    this.method3679();
                }
            } else {
                this.method1329(arg0, var9, var7, var10, 0);
                if (this.field1268 >= var7) {
                    this.field1268 = var7;
                    this.method1320();
                    this.method3679();
                }
            }
        } else if (this.field1274) {
            if (this.field1265 < 0) {
                var9 = this.method1330(arg0, arg1, var5, var10, var4.field1248[this.field1272]);
                if (this.field1268 >= var5) {
                    return;
                }
                this.field1268 = var5 + var5 - 1 - this.field1268;
                this.field1265 = -this.field1265;
            }
            while (true) {
                int var11 = this.method1329(arg0, var9, var6, var10, var4.field1248[this.field1266 - 1]);
                if (this.field1268 < var6) {
                    return;
                }
                this.field1268 = var6 + var6 - 1 - this.field1268;
                this.field1265 = -this.field1265;
                var9 = this.method1330(arg0, var11, var5, var10, var4.field1248[this.field1272]);
                if (this.field1268 >= var5) {
                    return;
                }
                this.field1268 = var5 + var5 - 1 - this.field1268;
                this.field1265 = -this.field1265;
            }
        } else if (this.field1265 < 0) {
            while (true) {
                var9 = this.method1330(arg0, var9, var5, var10, var4.field1248[this.field1266 - 1]);
                if (this.field1268 >= var5) {
                    return;
                }
                this.field1268 = var6 - 1 - (var6 - 1 - this.field1268) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1329(arg0, var9, var6, var10, var4.field1248[this.field1272]);
                if (this.field1268 < var6) {
                    return;
                }
                this.field1268 = (this.field1268 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bw.r(I)V")
    public synchronized void method1181(int arg0) {
        if (this.field1275 > 0) {
            if (arg0 >= this.field1275) {
                if (this.field1264 == Integer.MIN_VALUE) {
                    this.field1264 = 0;
                    this.field1270 = 0;
                    this.field1269 = 0;
                    this.field1273 = 0;
                    this.method3679();
                    arg0 = this.field1275;
                }
                this.field1275 = 0;
                this.method1350();
            } else {
                this.field1273 += this.field1276 * arg0;
                this.field1269 += this.field1277 * arg0;
                this.field1270 += this.field1278 * arg0;
                this.field1275 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1282;
        int var3 = this.field1272 << 8;
        int var4 = this.field1266 << 8;
        int var5 = var2.field1248.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1271 = 0;
        }
        if (this.field1268 < 0) {
            if (this.field1265 <= 0) {
                this.method1320();
                this.method3679();
                return;
            }
            this.field1268 = 0;
        }
        if (this.field1268 >= var5) {
            if (this.field1265 >= 0) {
                this.method1320();
                this.method3679();
                return;
            }
            this.field1268 = var5 - 1;
        }
        this.field1268 += this.field1265 * arg0;
        if (this.field1271 >= 0) {
            if (this.field1271 > 0) {
                if (this.field1274) {
                    label121: {
                        if (this.field1265 < 0) {
                            if (this.field1268 >= var3) {
                                return;
                            }
                            this.field1268 = var3 + var3 - 1 - this.field1268;
                            this.field1265 = -this.field1265;
                            if (--this.field1271 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1268 < var4) {
                                return;
                            }
                            this.field1268 = var4 + var4 - 1 - this.field1268;
                            this.field1265 = -this.field1265;
                            if (--this.field1271 == 0) {
                                break;
                            }
                            if (this.field1268 >= var3) {
                                return;
                            }
                            this.field1268 = var3 + var3 - 1 - this.field1268;
                            this.field1265 = -this.field1265;
                        } while (--this.field1271 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1265 < 0) {
                            if (this.field1268 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1268) / var6;
                            if (var7 >= this.field1271) {
                                this.field1268 += this.field1271 * var6;
                                this.field1271 = 0;
                                break label153;
                            }
                            this.field1268 += var6 * var7;
                            this.field1271 -= var7;
                        } else if (this.field1268 >= var4) {
                            int var8 = (this.field1268 - var3) / var6;
                            if (var8 >= this.field1271) {
                                this.field1268 -= this.field1271 * var6;
                                this.field1271 = 0;
                                break label153;
                            }
                            this.field1268 -= var6 * var8;
                            this.field1271 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1265 < 0) {
                if (this.field1268 < 0) {
                    this.field1268 = -1;
                    this.method1320();
                    this.method3679();
                }
            } else if (this.field1268 >= var5) {
                this.field1268 = var5;
                this.method1320();
                this.method3679();
            }
        } else if (this.field1274) {
            if (this.field1265 < 0) {
                if (this.field1268 >= var3) {
                    return;
                }
                this.field1268 = var3 + var3 - 1 - this.field1268;
                this.field1265 = -this.field1265;
            }
            while (this.field1268 >= var4) {
                this.field1268 = var4 + var4 - 1 - this.field1268;
                this.field1265 = -this.field1265;
                if (this.field1268 >= var3) {
                    return;
                }
                this.field1268 = var3 + var3 - 1 - this.field1268;
                this.field1265 = -this.field1265;
            }
        } else if (this.field1265 < 0) {
            if (this.field1268 >= var3) {
                return;
            }
            this.field1268 = var4 - 1 - (var4 - 1 - this.field1268) % var6;
        } else if (this.field1268 >= var4) {
            this.field1268 = (this.field1268 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bw.ap([IIIII)I")
    public int method1329(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1275 > 0) {
                int var6 = this.field1275 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1275 += arg1;
                if (this.field1265 == 256 && (this.field1268 & 0xFF) == 0) {
                    if (Statics.field1201) {
                        arg1 = method1351(0, ((class63) this.field1282).field1248, arg0, this.field1268, arg1, this.field1269, this.field1270, this.field1277, this.field1278, 0, var6, arg2, this);
                    } else {
                        arg1 = method1340(((class63) this.field1282).field1248, arg0, this.field1268, arg1, this.field1273, this.field1276, 0, var6, arg2, this);
                    }
                } else if (Statics.field1201) {
                    arg1 = method1413(0, 0, ((class63) this.field1282).field1248, arg0, this.field1268, arg1, this.field1269, this.field1270, this.field1277, this.field1278, 0, var6, arg2, this, this.field1265, arg4);
                } else {
                    arg1 = method1343(0, 0, ((class63) this.field1282).field1248, arg0, this.field1268, arg1, this.field1273, this.field1276, 0, var6, arg2, this, this.field1265, arg4);
                }
                this.field1275 -= arg1;
                if (this.field1275 != 0) {
                    return arg1;
                }
                if (!this.method1331()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1265 == 256 && (this.field1268 & 0xFF) == 0) {
                if (Statics.field1201) {
                    return method1333(0, ((class63) this.field1282).field1248, arg0, this.field1268, arg1, this.field1269, this.field1270, 0, arg3, arg2, this);
                }
                return method1405(((class63) this.field1282).field1248, arg0, this.field1268, arg1, this.field1273, 0, arg3, arg2, this);
            }
            if (Statics.field1201) {
                return method1337(0, 0, ((class63) this.field1282).field1248, arg0, this.field1268, arg1, this.field1269, this.field1270, 0, arg3, arg2, this, this.field1265, arg4);
            }
            return method1336(0, 0, ((class63) this.field1282).field1248, arg0, this.field1268, arg1, this.field1273, 0, arg3, arg2, this, this.field1265, arg4);
        }
    }

    @ObfuscatedName("bw.af([IIIII)I")
    public int method1330(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1275 > 0) {
                int var6 = this.field1275 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1275 += arg1;
                if (this.field1265 == -256 && (this.field1268 & 0xFF) == 0) {
                    if (Statics.field1201) {
                        arg1 = method1374(0, ((class63) this.field1282).field1248, arg0, this.field1268, arg1, this.field1269, this.field1270, this.field1277, this.field1278, 0, var6, arg2, this);
                    } else {
                        arg1 = method1435(((class63) this.field1282).field1248, arg0, this.field1268, arg1, this.field1273, this.field1276, 0, var6, arg2, this);
                    }
                } else if (Statics.field1201) {
                    arg1 = method1345(0, 0, ((class63) this.field1282).field1248, arg0, this.field1268, arg1, this.field1269, this.field1270, this.field1277, this.field1278, 0, var6, arg2, this, this.field1265, arg4);
                } else {
                    arg1 = method1344(0, 0, ((class63) this.field1282).field1248, arg0, this.field1268, arg1, this.field1273, this.field1276, 0, var6, arg2, this, this.field1265, arg4);
                }
                this.field1275 -= arg1;
                if (this.field1275 != 0) {
                    return arg1;
                }
                if (!this.method1331()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1265 == -256 && (this.field1268 & 0xFF) == 0) {
                if (Statics.field1201) {
                    return method1335(0, ((class63) this.field1282).field1248, arg0, this.field1268, arg1, this.field1269, this.field1270, 0, arg3, arg2, this);
                }
                return method1334(((class63) this.field1282).field1248, arg0, this.field1268, arg1, this.field1273, 0, arg3, arg2, this);
            }
            if (Statics.field1201) {
                return method1339(0, 0, ((class63) this.field1282).field1248, arg0, this.field1268, arg1, this.field1269, this.field1270, 0, arg3, arg2, this, this.field1265, arg4);
            }
            return method1338(0, 0, ((class63) this.field1282).field1248, arg0, this.field1268, arg1, this.field1273, 0, arg3, arg2, this, this.field1265, arg4);
        }
    }

    @ObfuscatedName("bw.aa()Z")
    public boolean method1331() {
        int var1 = this.field1264;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1436(var1, this.field1267);
            var2 = method1307(var1, this.field1267);
        }
        if (this.field1273 != var1 || this.field1269 != var3 || this.field1270 != var2) {
            if (this.field1273 < var1) {
                this.field1276 = 1;
                this.field1275 = var1 - this.field1273;
            } else if (this.field1273 > var1) {
                this.field1276 = -1;
                this.field1275 = this.field1273 - var1;
            } else {
                this.field1276 = 0;
            }
            if (this.field1269 < var3) {
                this.field1277 = 1;
                if (this.field1275 == 0 || this.field1275 > var3 - this.field1269) {
                    this.field1275 = var3 - this.field1269;
                }
            } else if (this.field1269 > var3) {
                this.field1277 = -1;
                if (this.field1275 == 0 || this.field1275 > this.field1269 - var3) {
                    this.field1275 = this.field1269 - var3;
                }
            } else {
                this.field1277 = 0;
            }
            if (this.field1270 < var2) {
                this.field1278 = 1;
                if (this.field1275 == 0 || this.field1275 > var2 - this.field1270) {
                    this.field1275 = var2 - this.field1270;
                }
            } else if (this.field1270 > var2) {
                this.field1278 = -1;
                if (this.field1275 == 0 || this.field1275 > this.field1270 - var2) {
                    this.field1275 = this.field1270 - var2;
                }
            } else {
                this.field1278 = 0;
            }
            return false;
        } else if (this.field1264 == Integer.MIN_VALUE) {
            this.field1264 = 0;
            this.field1270 = 0;
            this.field1269 = 0;
            this.field1273 = 0;
            this.method3679();
            return true;
        } else {
            this.method1350();
            return false;
        }
    }

    @ObfuscatedName("bw.ay([B[IIIIIIILbw;)I")
    public static int method1405(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1268 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bw.aw(I[B[IIIIIIIILbw;)I")
    public static int method1333(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1268 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bw.ak([B[IIIIIIILbw;)I")
    public static int method1334(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1268 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bw.ae(I[B[IIIIIIIILbw;)I")
    public static int method1335(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1268 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bw.ad(II[B[IIIIIIILbw;II)I")
    public static int method1336(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1268 = arg4;
        return arg5;
    }

    @ObfuscatedName("bw.au(II[B[IIIIIIIILbw;II)I")
    public static int method1337(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1268 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bw.ar(II[B[IIIIIIILbw;II)I")
    public static int method1338(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1268 = arg4;
        return arg5;
    }

    @ObfuscatedName("bw.at(II[B[IIIIIIIILbw;II)I")
    public static int method1339(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1268 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bw.ab([B[IIIIIIIILbw;)I")
    public static int method1340(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1269 += (var14 - arg3) * arg9.field1277;
        arg9.field1270 += (var14 - arg3) * arg9.field1278;
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
        arg9.field1273 = var12 >> 2;
        arg9.field1268 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bw.bp(I[B[IIIIIIIIIILbw;)I")
    public static int method1351(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1273 += (var19 - arg4) * arg12.field1276;
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
        arg12.field1269 = var15 >> 2;
        arg12.field1270 = var16 >> 2;
        arg12.field1268 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bw.bo([B[IIIIIIIILbw;)I")
    public static int method1435(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1269 += (var14 - arg3) * arg9.field1277;
        arg9.field1270 += (var14 - arg3) * arg9.field1278;
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
        arg9.field1273 = var12 >> 2;
        arg9.field1268 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bw.bf(I[B[IIIIIIIIIILbw;)I")
    public static int method1374(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1273 += (var19 - arg4) * arg12.field1276;
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
        arg12.field1269 = var15 >> 2;
        arg12.field1270 = var16 >> 2;
        arg12.field1268 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bw.bx(II[B[IIIIIIIILbw;II)I")
    public static int method1343(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1269 -= arg11.field1277 * arg5;
        arg11.field1270 -= arg11.field1278 * arg5;
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
        arg11.field1269 += arg11.field1277 * arg5;
        arg11.field1270 += arg11.field1278 * arg5;
        arg11.field1273 = arg6;
        arg11.field1268 = arg4;
        return arg5;
    }

    @ObfuscatedName("bw.bq(II[B[IIIIIIIIIILbw;II)I")
    public static int method1413(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1273 -= arg13.field1276 * arg5;
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
        arg13.field1273 += arg13.field1276 * var27;
        arg13.field1269 = arg6;
        arg13.field1270 = arg7;
        arg13.field1268 = arg4;
        return var27;
    }

    @ObfuscatedName("bw.bc(II[B[IIIIIIIILbw;II)I")
    public static int method1344(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1269 -= arg11.field1277 * arg5;
        arg11.field1270 -= arg11.field1278 * arg5;
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
        arg11.field1269 += arg11.field1277 * arg5;
        arg11.field1270 += arg11.field1278 * arg5;
        arg11.field1273 = arg6;
        arg11.field1268 = arg4;
        return arg5;
    }

    @ObfuscatedName("bw.ba(II[B[IIIIIIIIIILbw;II)I")
    public static int method1345(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1273 -= arg13.field1276 * arg5;
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
        arg13.field1273 += arg13.field1276 * var26;
        arg13.field1269 = arg6;
        arg13.field1270 = arg7;
        arg13.field1268 = arg4;
        return var26;
    }
}
