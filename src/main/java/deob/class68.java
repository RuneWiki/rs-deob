package deob;

@ObfuscatedName("bs")
public class class68 extends class70 {

    @ObfuscatedName("bs.k")
    public int field1319;

    @ObfuscatedName("bs.q")
    public int field1317;

    @ObfuscatedName("bs.f")
    public int field1309;

    @ObfuscatedName("bs.c")
    public int field1314;

    @ObfuscatedName("bs.v")
    public int field1311;

    @ObfuscatedName("bs.j")
    public int field1308;

    @ObfuscatedName("bs.m")
    public int field1313;

    @ObfuscatedName("bs.y")
    public int field1318;

    @ObfuscatedName("bs.u")
    public int field1315;

    @ObfuscatedName("bs.h")
    public int field1316;

    @ObfuscatedName("bs.l")
    public boolean field1307;

    @ObfuscatedName("bs.b")
    public int field1310;

    @ObfuscatedName("bs.g")
    public int field1312;

    @ObfuscatedName("bs.e")
    public int field1320;

    @ObfuscatedName("bs.p")
    public int field1321;

    @ObfuscatedName("bs.k(II)I")
    public static int method1419(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bs.q(II)I")
    public static int method1307(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bs.ao()I")
    public int method1345() {
        int var1 = this.field1311 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1318 == 0) {
            var2 -= this.field1319 * var2 / (((class66) this.field1323).field1293.length << 8);
        } else if (this.field1318 >= 0) {
            var2 -= this.field1315 * var2 / ((class66) this.field1323).field1293.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class68(class66 arg0, int arg1, int arg2) {
        this.field1323 = arg0;
        this.field1315 = arg0.field1292;
        this.field1316 = arg0.field1290;
        this.field1307 = arg0.field1294;
        this.field1317 = arg1;
        this.field1309 = arg2;
        this.field1314 = 8192;
        this.field1319 = 0;
        this.method1328();
    }

    public class68(class66 arg0, int arg1, int arg2, int arg3) {
        this.field1323 = arg0;
        this.field1315 = arg0.field1292;
        this.field1316 = arg0.field1290;
        this.field1307 = arg0.field1294;
        this.field1317 = arg1;
        this.field1309 = arg2;
        this.field1314 = arg3;
        this.field1319 = 0;
        this.method1328();
    }

    @ObfuscatedName("bs.f(Lbe;II)Lbs;")
    public static class68 method1375(class66 arg0, int arg1, int arg2) {
        return arg0.field1293 == null || arg0.field1293.length == 0 ? null : new class68(arg0, (int) ((long) arg0.field1291 * 256L * (long) arg1 / (long) (Statics.field1250 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bs.c(Lbe;III)Lbs;")
    public static class68 method1412(class66 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1293 == null || arg0.field1293.length == 0 ? null : new class68(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bs.v()V")
    public void method1328() {
        this.field1311 = this.field1309;
        this.field1308 = method1419(this.field1309, this.field1314);
        this.field1313 = method1307(this.field1309, this.field1314);
    }

    @ObfuscatedName("bs.h(I)V")
    public synchronized void method1312(int arg0) {
        this.field1318 = arg0;
    }

    @ObfuscatedName("bs.b(I)V")
    public synchronized void method1313(int arg0) {
        this.method1342(arg0 << 6, this.method1311());
    }

    @ObfuscatedName("bs.g(I)V")
    public synchronized void method1314(int arg0) {
        this.method1342(arg0, this.method1311());
    }

    @ObfuscatedName("bs.e(II)V")
    public synchronized void method1342(int arg0, int arg1) {
        this.field1309 = arg0;
        this.field1314 = arg1;
        this.field1310 = 0;
        this.method1328();
    }

    @ObfuscatedName("bs.p()I")
    public synchronized int method1351() {
        return this.field1309 == Integer.MIN_VALUE ? 0 : this.field1309;
    }

    @ObfuscatedName("bs.s()I")
    public synchronized int method1311() {
        return this.field1314 < 0 ? -1 : this.field1314;
    }

    @ObfuscatedName("bs.w(I)V")
    public synchronized void method1318(int arg0) {
        int var2 = ((class66) this.field1323).field1293.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1319 = arg0;
    }

    @ObfuscatedName("bs.i(Z)V")
    public synchronized void method1319(boolean arg0) {
        this.field1317 = (this.field1317 >>> 31) + (this.field1317 ^ this.field1317 >> 31);
        if (arg0) {
            this.field1317 = -this.field1317;
        }
    }

    @ObfuscatedName("bs.r()V")
    public void method1320() {
        if (this.field1310 == 0) {
            return;
        }
        if (this.field1309 == Integer.MIN_VALUE) {
            this.field1309 = 0;
        }
        this.field1310 = 0;
        this.method1328();
    }

    @ObfuscatedName("bs.a(II)V")
    public synchronized void method1321(int arg0, int arg1) {
        this.method1322(arg0, arg1, this.method1311());
    }

    @ObfuscatedName("bs.n(III)V")
    public synchronized void method1322(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1342(arg1, arg2);
            return;
        }
        int var4 = method1419(arg1, arg2);
        int var5 = method1307(arg1, arg2);
        if (this.field1308 == var4 && this.field1313 == var5) {
            this.field1310 = 0;
            return;
        }
        int var6 = arg1 - this.field1311;
        if (this.field1311 - arg1 > var6) {
            var6 = this.field1311 - arg1;
        }
        if (var4 - this.field1308 > var6) {
            var6 = var4 - this.field1308;
        }
        if (this.field1308 - var4 > var6) {
            var6 = this.field1308 - var4;
        }
        if (var5 - this.field1313 > var6) {
            var6 = var5 - this.field1313;
        }
        if (this.field1313 - var5 > var6) {
            var6 = this.field1313 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1310 = arg0;
        this.field1309 = arg1;
        this.field1314 = arg2;
        this.field1312 = (arg1 - this.field1311) / arg0;
        this.field1320 = (var4 - this.field1308) / arg0;
        this.field1321 = (var5 - this.field1313) / arg0;
    }

    @ObfuscatedName("bs.z(I)V")
    public synchronized void method1323(int arg0) {
        if (arg0 == 0) {
            this.method1314(0);
            this.method3703();
        } else if (this.field1308 == 0 && this.field1313 == 0) {
            this.field1310 = 0;
            this.field1309 = 0;
            this.field1311 = 0;
            this.method3703();
        } else {
            int var2 = -this.field1311;
            if (this.field1311 > var2) {
                var2 = this.field1311;
            }
            if (-this.field1308 > var2) {
                var2 = -this.field1308;
            }
            if (this.field1308 > var2) {
                var2 = this.field1308;
            }
            if (-this.field1313 > var2) {
                var2 = -this.field1313;
            }
            if (this.field1313 > var2) {
                var2 = this.field1313;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1310 = arg0;
            this.field1309 = Integer.MIN_VALUE;
            this.field1312 = -this.field1311 / arg0;
            this.field1320 = -this.field1308 / arg0;
            this.field1321 = -this.field1313 / arg0;
        }
    }

    @ObfuscatedName("bs.x(I)V")
    public synchronized void method1324(int arg0) {
        if (this.field1317 < 0) {
            this.field1317 = -arg0;
        } else {
            this.field1317 = arg0;
        }
    }

    @ObfuscatedName("bs.d()I")
    public synchronized int method1325() {
        return this.field1317 < 0 ? -this.field1317 : this.field1317;
    }

    @ObfuscatedName("bs.t()Z")
    public boolean method1326() {
        return this.field1319 < 0 || this.field1319 >= ((class66) this.field1323).field1293.length << 8;
    }

    @ObfuscatedName("bs.aa()Z")
    public boolean method1347() {
        return this.field1310 != 0;
    }

    @ObfuscatedName("bs.j()Lbf;")
    public class70 method1151() {
        return null;
    }

    @ObfuscatedName("bs.m()Lbf;")
    public class70 method1148() {
        return null;
    }

    @ObfuscatedName("bs.y()I")
    public int method1149() {
        return this.field1309 == 0 && this.field1310 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bs.u([III)V")
    public synchronized void method1150(int[] arg0, int arg1, int arg2) {
        if (this.field1309 == 0 && this.field1310 == 0) {
            this.method1152(arg2);
            return;
        }
        class66 var4 = (class66) this.field1323;
        int var5 = this.field1315 << 8;
        int var6 = this.field1316 << 8;
        int var7 = var4.field1293.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1318 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1319 < 0) {
            if (this.field1317 <= 0) {
                this.method1320();
                this.method3703();
                return;
            }
            this.field1319 = 0;
        }
        if (this.field1319 >= var7) {
            if (this.field1317 >= 0) {
                this.method1320();
                this.method3703();
                return;
            }
            this.field1319 = var7 - 1;
        }
        if (this.field1318 >= 0) {
            if (this.field1318 > 0) {
                if (this.field1307) {
                    label131: {
                        if (this.field1317 < 0) {
                            var9 = this.method1402(arg0, arg1, var5, var10, var4.field1293[this.field1315]);
                            if (this.field1319 >= var5) {
                                return;
                            }
                            this.field1319 = var5 + var5 - 1 - this.field1319;
                            this.field1317 = -this.field1317;
                            if (--this.field1318 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1370(arg0, var9, var6, var10, var4.field1293[this.field1316 - 1]);
                            if (this.field1319 < var6) {
                                return;
                            }
                            this.field1319 = var6 + var6 - 1 - this.field1319;
                            this.field1317 = -this.field1317;
                            if (--this.field1318 == 0) {
                                break;
                            }
                            var9 = this.method1402(arg0, var9, var5, var10, var4.field1293[this.field1315]);
                            if (this.field1319 >= var5) {
                                return;
                            }
                            this.field1319 = var5 + var5 - 1 - this.field1319;
                            this.field1317 = -this.field1317;
                        } while (--this.field1318 != 0);
                    }
                } else if (this.field1317 < 0) {
                    while (true) {
                        var9 = this.method1402(arg0, var9, var5, var10, var4.field1293[this.field1316 - 1]);
                        if (this.field1319 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1319) / var8;
                        if (var12 >= this.field1318) {
                            this.field1319 += this.field1318 * var8;
                            this.field1318 = 0;
                            break;
                        }
                        this.field1319 += var8 * var12;
                        this.field1318 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1370(arg0, var9, var6, var10, var4.field1293[this.field1315]);
                        if (this.field1319 < var6) {
                            return;
                        }
                        int var13 = (this.field1319 - var5) / var8;
                        if (var13 >= this.field1318) {
                            this.field1319 -= this.field1318 * var8;
                            this.field1318 = 0;
                            break;
                        }
                        this.field1319 -= var8 * var13;
                        this.field1318 -= var13;
                    }
                }
            }
            if (this.field1317 < 0) {
                this.method1402(arg0, var9, 0, var10, 0);
                if (this.field1319 < 0) {
                    this.field1319 = -1;
                    this.method1320();
                    this.method3703();
                }
            } else {
                this.method1370(arg0, var9, var7, var10, 0);
                if (this.field1319 >= var7) {
                    this.field1319 = var7;
                    this.method1320();
                    this.method3703();
                }
            }
        } else if (this.field1307) {
            if (this.field1317 < 0) {
                var9 = this.method1402(arg0, arg1, var5, var10, var4.field1293[this.field1315]);
                if (this.field1319 >= var5) {
                    return;
                }
                this.field1319 = var5 + var5 - 1 - this.field1319;
                this.field1317 = -this.field1317;
            }
            while (true) {
                int var11 = this.method1370(arg0, var9, var6, var10, var4.field1293[this.field1316 - 1]);
                if (this.field1319 < var6) {
                    return;
                }
                this.field1319 = var6 + var6 - 1 - this.field1319;
                this.field1317 = -this.field1317;
                var9 = this.method1402(arg0, var11, var5, var10, var4.field1293[this.field1315]);
                if (this.field1319 >= var5) {
                    return;
                }
                this.field1319 = var5 + var5 - 1 - this.field1319;
                this.field1317 = -this.field1317;
            }
        } else if (this.field1317 < 0) {
            while (true) {
                var9 = this.method1402(arg0, var9, var5, var10, var4.field1293[this.field1316 - 1]);
                if (this.field1319 >= var5) {
                    return;
                }
                this.field1319 = var6 - 1 - (var6 - 1 - this.field1319) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1370(arg0, var9, var6, var10, var4.field1293[this.field1315]);
                if (this.field1319 < var6) {
                    return;
                }
                this.field1319 = (this.field1319 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bs.l(I)V")
    public synchronized void method1152(int arg0) {
        if (this.field1310 > 0) {
            if (arg0 >= this.field1310) {
                if (this.field1309 == Integer.MIN_VALUE) {
                    this.field1309 = 0;
                    this.field1313 = 0;
                    this.field1308 = 0;
                    this.field1311 = 0;
                    this.method3703();
                    arg0 = this.field1310;
                }
                this.field1310 = 0;
                this.method1328();
            } else {
                this.field1311 += this.field1312 * arg0;
                this.field1308 += this.field1320 * arg0;
                this.field1313 += this.field1321 * arg0;
                this.field1310 -= arg0;
            }
        }
        class66 var2 = (class66) this.field1323;
        int var3 = this.field1315 << 8;
        int var4 = this.field1316 << 8;
        int var5 = var2.field1293.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1318 = 0;
        }
        if (this.field1319 < 0) {
            if (this.field1317 <= 0) {
                this.method1320();
                this.method3703();
                return;
            }
            this.field1319 = 0;
        }
        if (this.field1319 >= var5) {
            if (this.field1317 >= 0) {
                this.method1320();
                this.method3703();
                return;
            }
            this.field1319 = var5 - 1;
        }
        this.field1319 += this.field1317 * arg0;
        if (this.field1318 >= 0) {
            if (this.field1318 > 0) {
                if (this.field1307) {
                    label121: {
                        if (this.field1317 < 0) {
                            if (this.field1319 >= var3) {
                                return;
                            }
                            this.field1319 = var3 + var3 - 1 - this.field1319;
                            this.field1317 = -this.field1317;
                            if (--this.field1318 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1319 < var4) {
                                return;
                            }
                            this.field1319 = var4 + var4 - 1 - this.field1319;
                            this.field1317 = -this.field1317;
                            if (--this.field1318 == 0) {
                                break;
                            }
                            if (this.field1319 >= var3) {
                                return;
                            }
                            this.field1319 = var3 + var3 - 1 - this.field1319;
                            this.field1317 = -this.field1317;
                        } while (--this.field1318 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1317 < 0) {
                            if (this.field1319 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1319) / var6;
                            if (var7 >= this.field1318) {
                                this.field1319 += this.field1318 * var6;
                                this.field1318 = 0;
                                break label153;
                            }
                            this.field1319 += var6 * var7;
                            this.field1318 -= var7;
                        } else if (this.field1319 >= var4) {
                            int var8 = (this.field1319 - var3) / var6;
                            if (var8 >= this.field1318) {
                                this.field1319 -= this.field1318 * var6;
                                this.field1318 = 0;
                                break label153;
                            }
                            this.field1319 -= var6 * var8;
                            this.field1318 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1317 < 0) {
                if (this.field1319 < 0) {
                    this.field1319 = -1;
                    this.method1320();
                    this.method3703();
                }
            } else if (this.field1319 >= var5) {
                this.field1319 = var5;
                this.method1320();
                this.method3703();
            }
        } else if (this.field1307) {
            if (this.field1317 < 0) {
                if (this.field1319 >= var3) {
                    return;
                }
                this.field1319 = var3 + var3 - 1 - this.field1319;
                this.field1317 = -this.field1317;
            }
            while (this.field1319 >= var4) {
                this.field1319 = var4 + var4 - 1 - this.field1319;
                this.field1317 = -this.field1317;
                if (this.field1319 >= var3) {
                    return;
                }
                this.field1319 = var3 + var3 - 1 - this.field1319;
                this.field1317 = -this.field1317;
            }
        } else if (this.field1317 < 0) {
            if (this.field1319 >= var3) {
                return;
            }
            this.field1319 = var4 - 1 - (var4 - 1 - this.field1319) % var6;
        } else if (this.field1319 >= var4) {
            this.field1319 = (this.field1319 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bs.ak([IIIII)I")
    public int method1370(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1310 > 0) {
                int var6 = this.field1310 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1310 += arg1;
                if (this.field1317 == 256 && (this.field1319 & 0xFF) == 0) {
                    if (Statics.field1239) {
                        arg1 = method1338(0, ((class66) this.field1323).field1293, arg0, this.field1319, arg1, this.field1308, this.field1313, this.field1320, this.field1321, 0, var6, arg2, this);
                    } else {
                        arg1 = method1420(((class66) this.field1323).field1293, arg0, this.field1319, arg1, this.field1311, this.field1312, 0, var6, arg2, this);
                    }
                } else if (Statics.field1239) {
                    arg1 = method1377(0, 0, ((class66) this.field1323).field1293, arg0, this.field1319, arg1, this.field1308, this.field1313, this.field1320, this.field1321, 0, var6, arg2, this, this.field1317, arg4);
                } else {
                    arg1 = method1365(0, 0, ((class66) this.field1323).field1293, arg0, this.field1319, arg1, this.field1311, this.field1312, 0, var6, arg2, this, this.field1317, arg4);
                }
                this.field1310 -= arg1;
                if (this.field1310 != 0) {
                    return arg1;
                }
                if (!this.method1348()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1317 == 256 && (this.field1319 & 0xFF) == 0) {
                if (Statics.field1239) {
                    return method1333(0, ((class66) this.field1323).field1293, arg0, this.field1319, arg1, this.field1308, this.field1313, 0, arg3, arg2, this);
                }
                return method1387(((class66) this.field1323).field1293, arg0, this.field1319, arg1, this.field1311, 0, arg3, arg2, this);
            }
            if (Statics.field1239) {
                return method1335(0, 0, ((class66) this.field1323).field1293, arg0, this.field1319, arg1, this.field1308, this.field1313, 0, arg3, arg2, this, this.field1317, arg4);
            }
            return method1308(0, 0, ((class66) this.field1323).field1293, arg0, this.field1319, arg1, this.field1311, 0, arg3, arg2, this, this.field1317, arg4);
        }
    }

    @ObfuscatedName("bs.ar([IIIII)I")
    public int method1402(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1310 > 0) {
                int var6 = this.field1310 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1310 += arg1;
                if (this.field1317 == -256 && (this.field1319 & 0xFF) == 0) {
                    if (Statics.field1239) {
                        arg1 = method1329(0, ((class66) this.field1323).field1293, arg0, this.field1319, arg1, this.field1308, this.field1313, this.field1320, this.field1321, 0, var6, arg2, this);
                    } else {
                        arg1 = method1339(((class66) this.field1323).field1293, arg0, this.field1319, arg1, this.field1311, this.field1312, 0, var6, arg2, this);
                    }
                } else if (Statics.field1239) {
                    arg1 = method1317(0, 0, ((class66) this.field1323).field1293, arg0, this.field1319, arg1, this.field1308, this.field1313, this.field1320, this.field1321, 0, var6, arg2, this, this.field1317, arg4);
                } else {
                    arg1 = method1343(0, 0, ((class66) this.field1323).field1293, arg0, this.field1319, arg1, this.field1311, this.field1312, 0, var6, arg2, this, this.field1317, arg4);
                }
                this.field1310 -= arg1;
                if (this.field1310 != 0) {
                    return arg1;
                }
                if (!this.method1348()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1317 == -256 && (this.field1319 & 0xFF) == 0) {
                if (Statics.field1239) {
                    return method1346(0, ((class66) this.field1323).field1293, arg0, this.field1319, arg1, this.field1308, this.field1313, 0, arg3, arg2, this);
                }
                return method1334(((class66) this.field1323).field1293, arg0, this.field1319, arg1, this.field1311, 0, arg3, arg2, this);
            }
            if (Statics.field1239) {
                return method1337(0, 0, ((class66) this.field1323).field1293, arg0, this.field1319, arg1, this.field1308, this.field1313, 0, arg3, arg2, this, this.field1317, arg4);
            }
            return method1414(0, 0, ((class66) this.field1323).field1293, arg0, this.field1319, arg1, this.field1311, 0, arg3, arg2, this, this.field1317, arg4);
        }
    }

    @ObfuscatedName("bs.aw()Z")
    public boolean method1348() {
        int var1 = this.field1309;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1419(var1, this.field1314);
            var2 = method1307(var1, this.field1314);
        }
        if (this.field1311 != var1 || this.field1308 != var3 || this.field1313 != var2) {
            if (this.field1311 < var1) {
                this.field1312 = 1;
                this.field1310 = var1 - this.field1311;
            } else if (this.field1311 > var1) {
                this.field1312 = -1;
                this.field1310 = this.field1311 - var1;
            } else {
                this.field1312 = 0;
            }
            if (this.field1308 < var3) {
                this.field1320 = 1;
                if (this.field1310 == 0 || this.field1310 > var3 - this.field1308) {
                    this.field1310 = var3 - this.field1308;
                }
            } else if (this.field1308 > var3) {
                this.field1320 = -1;
                if (this.field1310 == 0 || this.field1310 > this.field1308 - var3) {
                    this.field1310 = this.field1308 - var3;
                }
            } else {
                this.field1320 = 0;
            }
            if (this.field1313 < var2) {
                this.field1321 = 1;
                if (this.field1310 == 0 || this.field1310 > var2 - this.field1313) {
                    this.field1310 = var2 - this.field1313;
                }
            } else if (this.field1313 > var2) {
                this.field1321 = -1;
                if (this.field1310 == 0 || this.field1310 > this.field1313 - var2) {
                    this.field1310 = this.field1313 - var2;
                }
            } else {
                this.field1321 = 0;
            }
            return false;
        } else if (this.field1309 == Integer.MIN_VALUE) {
            this.field1309 = 0;
            this.field1313 = 0;
            this.field1308 = 0;
            this.field1311 = 0;
            this.method3703();
            return true;
        } else {
            this.method1328();
            return false;
        }
    }

    @ObfuscatedName("bs.ai([B[IIIIIIILbs;)I")
    public static int method1387(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class68 arg8) {
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
        arg8.field1319 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bs.af(I[B[IIIIIIIILbs;)I")
    public static int method1333(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10) {
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
        arg10.field1319 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bs.an([B[IIIIIIILbs;)I")
    public static int method1334(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class68 arg8) {
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
        arg8.field1319 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bs.au(I[B[IIIIIIIILbs;)I")
    public static int method1346(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10) {
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
        arg10.field1319 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bs.ac(II[B[IIIIIIILbs;II)I")
    public static int method1308(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10, int arg11, int arg12) {
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
        arg10.field1319 = arg4;
        return arg5;
    }

    @ObfuscatedName("bs.ae(II[B[IIIIIIIILbs;II)I")
    public static int method1335(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
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
        arg11.field1319 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bs.az(II[B[IIIIIIILbs;II)I")
    public static int method1414(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10, int arg11, int arg12) {
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
        arg10.field1319 = arg4;
        return arg5;
    }

    @ObfuscatedName("bs.ah(II[B[IIIIIIIILbs;II)I")
    public static int method1337(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
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
        arg11.field1319 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bs.as([B[IIIIIIIILbs;)I")
    public static int method1420(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class68 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1308 += (var14 - arg3) * arg9.field1320;
        arg9.field1313 += (var14 - arg3) * arg9.field1321;
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
        arg9.field1311 = var12 >> 2;
        arg9.field1319 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bs.ab(I[B[IIIIIIIIIILbs;)I")
    public static int method1338(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class68 arg12) {
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
        arg12.field1311 += (var19 - arg4) * arg12.field1312;
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
        arg12.field1308 = var15 >> 2;
        arg12.field1313 = var16 >> 2;
        arg12.field1319 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bs.bn([B[IIIIIIIILbs;)I")
    public static int method1339(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class68 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1308 += (var14 - arg3) * arg9.field1320;
        arg9.field1313 += (var14 - arg3) * arg9.field1321;
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
        arg9.field1311 = var12 >> 2;
        arg9.field1319 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bs.bl(I[B[IIIIIIIIIILbs;)I")
    public static int method1329(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class68 arg12) {
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
        arg12.field1311 += (var19 - arg4) * arg12.field1312;
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
        arg12.field1308 = var15 >> 2;
        arg12.field1313 = var16 >> 2;
        arg12.field1319 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bs.bq(II[B[IIIIIIIILbs;II)I")
    public static int method1365(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
        arg11.field1308 -= arg11.field1320 * arg5;
        arg11.field1313 -= arg11.field1321 * arg5;
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
        arg11.field1308 += arg11.field1320 * arg5;
        arg11.field1313 += arg11.field1321 * arg5;
        arg11.field1311 = arg6;
        arg11.field1319 = arg4;
        return arg5;
    }

    @ObfuscatedName("bs.bg(II[B[IIIIIIIIIILbs;II)I")
    public static int method1377(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class68 arg13, int arg14, int arg15) {
        arg13.field1311 -= arg13.field1312 * arg5;
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
        arg13.field1311 += arg13.field1312 * var27;
        arg13.field1308 = arg6;
        arg13.field1313 = arg7;
        arg13.field1319 = arg4;
        return var27;
    }

    @ObfuscatedName("bs.bk(II[B[IIIIIIIILbs;II)I")
    public static int method1343(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
        arg11.field1308 -= arg11.field1320 * arg5;
        arg11.field1313 -= arg11.field1321 * arg5;
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
        arg11.field1308 += arg11.field1320 * arg5;
        arg11.field1313 += arg11.field1321 * arg5;
        arg11.field1311 = arg6;
        arg11.field1319 = arg4;
        return arg5;
    }

    @ObfuscatedName("bs.bz(II[B[IIIIIIIIIILbs;II)I")
    public static int method1317(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class68 arg13, int arg14, int arg15) {
        arg13.field1311 -= arg13.field1312 * arg5;
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
        arg13.field1311 += arg13.field1312 * var26;
        arg13.field1308 = arg6;
        arg13.field1313 = arg7;
        arg13.field1319 = arg4;
        return var26;
    }
}
