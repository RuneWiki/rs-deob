package deob;

@ObfuscatedName("bm")
public class class68 extends class70 {

    @ObfuscatedName("bm.a")
    public int field1332;

    @ObfuscatedName("bm.d")
    public int field1321;

    @ObfuscatedName("bm.v")
    public int field1322;

    @ObfuscatedName("bm.r")
    public int field1324;

    @ObfuscatedName("bm.z")
    public int field1320;

    @ObfuscatedName("bm.t")
    public int field1325;

    @ObfuscatedName("bm.n")
    public int field1326;

    @ObfuscatedName("bm.i")
    public int field1327;

    @ObfuscatedName("bm.g")
    public int field1334;

    @ObfuscatedName("bm.m")
    public int field1329;

    @ObfuscatedName("bm.k")
    public boolean field1330;

    @ObfuscatedName("bm.x")
    public int field1331;

    @ObfuscatedName("bm.u")
    public int field1323;

    @ObfuscatedName("bm.j")
    public int field1333;

    @ObfuscatedName("bm.q")
    public int field1328;

    @ObfuscatedName("bm.a(II)I")
    public static int method1350(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bm.d(II)I")
    public static int method1456(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bm.ay()I")
    public int method1325() {
        int var1 = this.field1320 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1327 == 0) {
            var2 -= this.field1332 * var2 / (((class66) this.field1336).field1306.length << 8);
        } else if (this.field1327 >= 0) {
            var2 -= this.field1334 * var2 / ((class66) this.field1336).field1306.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class68(class66 arg0, int arg1, int arg2) {
        this.field1336 = arg0;
        this.field1334 = arg0.field1305;
        this.field1329 = arg0.field1307;
        this.field1330 = arg0.field1303;
        this.field1321 = arg1;
        this.field1322 = arg2;
        this.field1324 = 8192;
        this.field1332 = 0;
        this.method1329();
    }

    public class68(class66 arg0, int arg1, int arg2, int arg3) {
        this.field1336 = arg0;
        this.field1334 = arg0.field1305;
        this.field1329 = arg0.field1307;
        this.field1330 = arg0.field1303;
        this.field1321 = arg1;
        this.field1322 = arg2;
        this.field1324 = arg3;
        this.field1332 = 0;
        this.method1329();
    }

    @ObfuscatedName("bm.v(Lbx;II)Lbm;")
    public static class68 method1427(class66 arg0, int arg1, int arg2) {
        return arg0.field1306 == null || arg0.field1306.length == 0 ? null : new class68(arg0, (int) ((long) arg0.field1304 * 256L * (long) arg1 / (long) (Statics.field1266 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bm.r(Lbx;III)Lbm;")
    public static class68 method1328(class66 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1306 == null || arg0.field1306.length == 0 ? null : new class68(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bm.z()V")
    public void method1329() {
        this.field1320 = this.field1322;
        this.field1325 = method1350(this.field1322, this.field1324);
        this.field1326 = method1456(this.field1322, this.field1324);
    }

    @ObfuscatedName("bm.m(I)V")
    public synchronized void method1391(int arg0) {
        this.field1327 = arg0;
    }

    @ObfuscatedName("bm.x(I)V")
    public synchronized void method1331(int arg0) {
        this.method1340(arg0 << 6, this.method1335());
    }

    @ObfuscatedName("bm.u(I)V")
    public synchronized void method1332(int arg0) {
        this.method1340(arg0, this.method1335());
    }

    @ObfuscatedName("bm.j(II)V")
    public synchronized void method1340(int arg0, int arg1) {
        this.field1322 = arg0;
        this.field1324 = arg1;
        this.field1331 = 0;
        this.method1329();
    }

    @ObfuscatedName("bm.q()I")
    public synchronized int method1435() {
        return this.field1322 == Integer.MIN_VALUE ? 0 : this.field1322;
    }

    @ObfuscatedName("bm.w()I")
    public synchronized int method1335() {
        return this.field1324 < 0 ? -1 : this.field1324;
    }

    @ObfuscatedName("bm.b(I)V")
    public synchronized void method1387(int arg0) {
        int var2 = ((class66) this.field1336).field1306.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1332 = arg0;
    }

    @ObfuscatedName("bm.p(Z)V")
    public synchronized void method1337(boolean arg0) {
        this.field1321 = (this.field1321 >>> 31) + (this.field1321 ^ this.field1321 >> 31);
        if (arg0) {
            this.field1321 = -this.field1321;
        }
    }

    @ObfuscatedName("bm.o()V")
    public void method1338() {
        if (this.field1331 == 0) {
            return;
        }
        if (this.field1322 == Integer.MIN_VALUE) {
            this.field1322 = 0;
        }
        this.field1331 = 0;
        this.method1329();
    }

    @ObfuscatedName("bm.y(II)V")
    public synchronized void method1339(int arg0, int arg1) {
        this.method1368(arg0, arg1, this.method1335());
    }

    @ObfuscatedName("bm.s(III)V")
    public synchronized void method1368(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1340(arg1, arg2);
            return;
        }
        int var4 = method1350(arg1, arg2);
        int var5 = method1456(arg1, arg2);
        if (this.field1325 == var4 && this.field1326 == var5) {
            this.field1331 = 0;
            return;
        }
        int var6 = arg1 - this.field1320;
        if (this.field1320 - arg1 > var6) {
            var6 = this.field1320 - arg1;
        }
        if (var4 - this.field1325 > var6) {
            var6 = var4 - this.field1325;
        }
        if (this.field1325 - var4 > var6) {
            var6 = this.field1325 - var4;
        }
        if (var5 - this.field1326 > var6) {
            var6 = var5 - this.field1326;
        }
        if (this.field1326 - var5 > var6) {
            var6 = this.field1326 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1331 = arg0;
        this.field1322 = arg1;
        this.field1324 = arg2;
        this.field1323 = (arg1 - this.field1320) / arg0;
        this.field1333 = (var4 - this.field1325) / arg0;
        this.field1328 = (var5 - this.field1326) / arg0;
    }

    @ObfuscatedName("bm.e(I)V")
    public synchronized void method1414(int arg0) {
        if (arg0 == 0) {
            this.method1332(0);
            this.method3729();
        } else if (this.field1325 == 0 && this.field1326 == 0) {
            this.field1331 = 0;
            this.field1322 = 0;
            this.field1320 = 0;
            this.method3729();
        } else {
            int var2 = -this.field1320;
            if (this.field1320 > var2) {
                var2 = this.field1320;
            }
            if (-this.field1325 > var2) {
                var2 = -this.field1325;
            }
            if (this.field1325 > var2) {
                var2 = this.field1325;
            }
            if (-this.field1326 > var2) {
                var2 = -this.field1326;
            }
            if (this.field1326 > var2) {
                var2 = this.field1326;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1331 = arg0;
            this.field1322 = Integer.MIN_VALUE;
            this.field1323 = -this.field1320 / arg0;
            this.field1333 = -this.field1325 / arg0;
            this.field1328 = -this.field1326 / arg0;
        }
    }

    @ObfuscatedName("bm.h(I)V")
    public synchronized void method1330(int arg0) {
        if (this.field1321 < 0) {
            this.field1321 = -arg0;
        } else {
            this.field1321 = arg0;
        }
    }

    @ObfuscatedName("bm.l()I")
    public synchronized int method1343() {
        return this.field1321 < 0 ? -this.field1321 : this.field1321;
    }

    @ObfuscatedName("bm.c()Z")
    public boolean method1344() {
        return this.field1332 < 0 || this.field1332 >= ((class66) this.field1336).field1306.length << 8;
    }

    @ObfuscatedName("bm.f()Z")
    public boolean method1345() {
        return this.field1331 != 0;
    }

    @ObfuscatedName("bm.t()Lbu;")
    public class70 method1208() {
        return null;
    }

    @ObfuscatedName("bm.n()Lbu;")
    public class70 method1171() {
        return null;
    }

    @ObfuscatedName("bm.i()I")
    public int method1172() {
        return this.field1322 == 0 && this.field1331 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bm.g([III)V")
    public synchronized void method1173(int[] arg0, int arg1, int arg2) {
        if (this.field1322 == 0 && this.field1331 == 0) {
            this.method1175(arg2);
            return;
        }
        class66 var4 = (class66) this.field1336;
        int var5 = this.field1334 << 8;
        int var6 = this.field1329 << 8;
        int var7 = var4.field1306.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1327 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1332 < 0) {
            if (this.field1321 <= 0) {
                this.method1338();
                this.method3729();
                return;
            }
            this.field1332 = 0;
        }
        if (this.field1332 >= var7) {
            if (this.field1321 >= 0) {
                this.method1338();
                this.method3729();
                return;
            }
            this.field1332 = var7 - 1;
        }
        if (this.field1327 >= 0) {
            if (this.field1327 > 0) {
                if (this.field1330) {
                    label131: {
                        if (this.field1321 < 0) {
                            var9 = this.method1443(arg0, arg1, var5, var10, var4.field1306[this.field1334]);
                            if (this.field1332 >= var5) {
                                return;
                            }
                            this.field1332 = var5 + var5 - 1 - this.field1332;
                            this.field1321 = -this.field1321;
                            if (--this.field1327 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1347(arg0, var9, var6, var10, var4.field1306[this.field1329 - 1]);
                            if (this.field1332 < var6) {
                                return;
                            }
                            this.field1332 = var6 + var6 - 1 - this.field1332;
                            this.field1321 = -this.field1321;
                            if (--this.field1327 == 0) {
                                break;
                            }
                            var9 = this.method1443(arg0, var9, var5, var10, var4.field1306[this.field1334]);
                            if (this.field1332 >= var5) {
                                return;
                            }
                            this.field1332 = var5 + var5 - 1 - this.field1332;
                            this.field1321 = -this.field1321;
                        } while (--this.field1327 != 0);
                    }
                } else if (this.field1321 < 0) {
                    while (true) {
                        var9 = this.method1443(arg0, var9, var5, var10, var4.field1306[this.field1329 - 1]);
                        if (this.field1332 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1332) / var8;
                        if (var12 >= this.field1327) {
                            this.field1332 += this.field1327 * var8;
                            this.field1327 = 0;
                            break;
                        }
                        this.field1332 += var8 * var12;
                        this.field1327 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1347(arg0, var9, var6, var10, var4.field1306[this.field1334]);
                        if (this.field1332 < var6) {
                            return;
                        }
                        int var13 = (this.field1332 - var5) / var8;
                        if (var13 >= this.field1327) {
                            this.field1332 -= this.field1327 * var8;
                            this.field1327 = 0;
                            break;
                        }
                        this.field1332 -= var8 * var13;
                        this.field1327 -= var13;
                    }
                }
            }
            if (this.field1321 < 0) {
                this.method1443(arg0, var9, 0, var10, 0);
                if (this.field1332 < 0) {
                    this.field1332 = -1;
                    this.method1338();
                    this.method3729();
                }
            } else {
                this.method1347(arg0, var9, var7, var10, 0);
                if (this.field1332 >= var7) {
                    this.field1332 = var7;
                    this.method1338();
                    this.method3729();
                }
            }
        } else if (this.field1330) {
            if (this.field1321 < 0) {
                var9 = this.method1443(arg0, arg1, var5, var10, var4.field1306[this.field1334]);
                if (this.field1332 >= var5) {
                    return;
                }
                this.field1332 = var5 + var5 - 1 - this.field1332;
                this.field1321 = -this.field1321;
            }
            while (true) {
                int var11 = this.method1347(arg0, var9, var6, var10, var4.field1306[this.field1329 - 1]);
                if (this.field1332 < var6) {
                    return;
                }
                this.field1332 = var6 + var6 - 1 - this.field1332;
                this.field1321 = -this.field1321;
                var9 = this.method1443(arg0, var11, var5, var10, var4.field1306[this.field1334]);
                if (this.field1332 >= var5) {
                    return;
                }
                this.field1332 = var5 + var5 - 1 - this.field1332;
                this.field1321 = -this.field1321;
            }
        } else if (this.field1321 < 0) {
            while (true) {
                var9 = this.method1443(arg0, var9, var5, var10, var4.field1306[this.field1329 - 1]);
                if (this.field1332 >= var5) {
                    return;
                }
                this.field1332 = var6 - 1 - (var6 - 1 - this.field1332) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1347(arg0, var9, var6, var10, var4.field1306[this.field1334]);
                if (this.field1332 < var6) {
                    return;
                }
                this.field1332 = (this.field1332 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bm.k(I)V")
    public synchronized void method1175(int arg0) {
        if (this.field1331 > 0) {
            if (arg0 >= this.field1331) {
                if (this.field1322 == Integer.MIN_VALUE) {
                    this.field1322 = 0;
                    this.field1326 = 0;
                    this.field1325 = 0;
                    this.field1320 = 0;
                    this.method3729();
                    arg0 = this.field1331;
                }
                this.field1331 = 0;
                this.method1329();
            } else {
                this.field1320 += this.field1323 * arg0;
                this.field1325 += this.field1333 * arg0;
                this.field1326 += this.field1328 * arg0;
                this.field1331 -= arg0;
            }
        }
        class66 var2 = (class66) this.field1336;
        int var3 = this.field1334 << 8;
        int var4 = this.field1329 << 8;
        int var5 = var2.field1306.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1327 = 0;
        }
        if (this.field1332 < 0) {
            if (this.field1321 <= 0) {
                this.method1338();
                this.method3729();
                return;
            }
            this.field1332 = 0;
        }
        if (this.field1332 >= var5) {
            if (this.field1321 >= 0) {
                this.method1338();
                this.method3729();
                return;
            }
            this.field1332 = var5 - 1;
        }
        this.field1332 += this.field1321 * arg0;
        if (this.field1327 >= 0) {
            if (this.field1327 > 0) {
                if (this.field1330) {
                    label121: {
                        if (this.field1321 < 0) {
                            if (this.field1332 >= var3) {
                                return;
                            }
                            this.field1332 = var3 + var3 - 1 - this.field1332;
                            this.field1321 = -this.field1321;
                            if (--this.field1327 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1332 < var4) {
                                return;
                            }
                            this.field1332 = var4 + var4 - 1 - this.field1332;
                            this.field1321 = -this.field1321;
                            if (--this.field1327 == 0) {
                                break;
                            }
                            if (this.field1332 >= var3) {
                                return;
                            }
                            this.field1332 = var3 + var3 - 1 - this.field1332;
                            this.field1321 = -this.field1321;
                        } while (--this.field1327 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1321 < 0) {
                            if (this.field1332 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1332) / var6;
                            if (var7 >= this.field1327) {
                                this.field1332 += this.field1327 * var6;
                                this.field1327 = 0;
                                break label153;
                            }
                            this.field1332 += var6 * var7;
                            this.field1327 -= var7;
                        } else if (this.field1332 >= var4) {
                            int var8 = (this.field1332 - var3) / var6;
                            if (var8 >= this.field1327) {
                                this.field1332 -= this.field1327 * var6;
                                this.field1327 = 0;
                                break label153;
                            }
                            this.field1332 -= var6 * var8;
                            this.field1327 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1321 < 0) {
                if (this.field1332 < 0) {
                    this.field1332 = -1;
                    this.method1338();
                    this.method3729();
                }
            } else if (this.field1332 >= var5) {
                this.field1332 = var5;
                this.method1338();
                this.method3729();
            }
        } else if (this.field1330) {
            if (this.field1321 < 0) {
                if (this.field1332 >= var3) {
                    return;
                }
                this.field1332 = var3 + var3 - 1 - this.field1332;
                this.field1321 = -this.field1321;
            }
            while (this.field1332 >= var4) {
                this.field1332 = var4 + var4 - 1 - this.field1332;
                this.field1321 = -this.field1321;
                if (this.field1332 >= var3) {
                    return;
                }
                this.field1332 = var3 + var3 - 1 - this.field1332;
                this.field1321 = -this.field1321;
            }
        } else if (this.field1321 < 0) {
            if (this.field1332 >= var3) {
                return;
            }
            this.field1332 = var4 - 1 - (var4 - 1 - this.field1332) % var6;
        } else if (this.field1332 >= var4) {
            this.field1332 = (this.field1332 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bm.at([IIIII)I")
    public int method1347(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1331 > 0) {
                int var6 = this.field1331 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1331 += arg1;
                if (this.field1321 == 256 && (this.field1332 & 0xFF) == 0) {
                    if (Statics.field1263) {
                        arg1 = method1433(0, ((class66) this.field1336).field1306, arg0, this.field1332, arg1, this.field1325, this.field1326, this.field1333, this.field1328, 0, var6, arg2, this);
                    } else {
                        arg1 = method1358(((class66) this.field1336).field1306, arg0, this.field1332, arg1, this.field1320, this.field1323, 0, var6, arg2, this);
                    }
                } else if (Statics.field1263) {
                    arg1 = method1449(0, 0, ((class66) this.field1336).field1306, arg0, this.field1332, arg1, this.field1325, this.field1326, this.field1333, this.field1328, 0, var6, arg2, this, this.field1321, arg4);
                } else {
                    arg1 = method1362(0, 0, ((class66) this.field1336).field1306, arg0, this.field1332, arg1, this.field1320, this.field1323, 0, var6, arg2, this, this.field1321, arg4);
                }
                this.field1331 -= arg1;
                if (this.field1331 != 0) {
                    return arg1;
                }
                if (!this.method1349()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1321 == 256 && (this.field1332 & 0xFF) == 0) {
                if (Statics.field1263) {
                    return method1394(0, ((class66) this.field1336).field1306, arg0, this.field1332, arg1, this.field1325, this.field1326, 0, arg3, arg2, this);
                }
                return method1434(((class66) this.field1336).field1306, arg0, this.field1332, arg1, this.field1320, 0, arg3, arg2, this);
            }
            if (Statics.field1263) {
                return method1355(0, 0, ((class66) this.field1336).field1306, arg0, this.field1332, arg1, this.field1325, this.field1326, 0, arg3, arg2, this, this.field1321, arg4);
            }
            return method1381(0, 0, ((class66) this.field1336).field1306, arg0, this.field1332, arg1, this.field1320, 0, arg3, arg2, this, this.field1321, arg4);
        }
    }

    @ObfuscatedName("bm.aw([IIIII)I")
    public int method1443(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1331 > 0) {
                int var6 = this.field1331 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1331 += arg1;
                if (this.field1321 == -256 && (this.field1332 & 0xFF) == 0) {
                    if (Statics.field1263) {
                        arg1 = method1361(0, ((class66) this.field1336).field1306, arg0, this.field1332, arg1, this.field1325, this.field1326, this.field1333, this.field1328, 0, var6, arg2, this);
                    } else {
                        arg1 = method1360(((class66) this.field1336).field1306, arg0, this.field1332, arg1, this.field1320, this.field1323, 0, var6, arg2, this);
                    }
                } else if (Statics.field1263) {
                    arg1 = method1461(0, 0, ((class66) this.field1336).field1306, arg0, this.field1332, arg1, this.field1325, this.field1326, this.field1333, this.field1328, 0, var6, arg2, this, this.field1321, arg4);
                } else {
                    arg1 = method1385(0, 0, ((class66) this.field1336).field1306, arg0, this.field1332, arg1, this.field1320, this.field1323, 0, var6, arg2, this, this.field1321, arg4);
                }
                this.field1331 -= arg1;
                if (this.field1331 != 0) {
                    return arg1;
                }
                if (!this.method1349()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1321 == -256 && (this.field1332 & 0xFF) == 0) {
                if (Statics.field1263) {
                    return method1382(0, ((class66) this.field1336).field1306, arg0, this.field1332, arg1, this.field1325, this.field1326, 0, arg3, arg2, this);
                }
                return method1352(((class66) this.field1336).field1306, arg0, this.field1332, arg1, this.field1320, 0, arg3, arg2, this);
            }
            if (Statics.field1263) {
                return method1357(0, 0, ((class66) this.field1336).field1306, arg0, this.field1332, arg1, this.field1325, this.field1326, 0, arg3, arg2, this, this.field1321, arg4);
            }
            return method1324(0, 0, ((class66) this.field1336).field1306, arg0, this.field1332, arg1, this.field1320, 0, arg3, arg2, this, this.field1321, arg4);
        }
    }

    @ObfuscatedName("bm.ab()Z")
    public boolean method1349() {
        int var1 = this.field1322;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1350(var1, this.field1324);
            var2 = method1456(var1, this.field1324);
        }
        if (this.field1320 != var1 || this.field1325 != var3 || this.field1326 != var2) {
            if (this.field1320 < var1) {
                this.field1323 = 1;
                this.field1331 = var1 - this.field1320;
            } else if (this.field1320 > var1) {
                this.field1323 = -1;
                this.field1331 = this.field1320 - var1;
            } else {
                this.field1323 = 0;
            }
            if (this.field1325 < var3) {
                this.field1333 = 1;
                if (this.field1331 == 0 || this.field1331 > var3 - this.field1325) {
                    this.field1331 = var3 - this.field1325;
                }
            } else if (this.field1325 > var3) {
                this.field1333 = -1;
                if (this.field1331 == 0 || this.field1331 > this.field1325 - var3) {
                    this.field1331 = this.field1325 - var3;
                }
            } else {
                this.field1333 = 0;
            }
            if (this.field1326 < var2) {
                this.field1328 = 1;
                if (this.field1331 == 0 || this.field1331 > var2 - this.field1326) {
                    this.field1331 = var2 - this.field1326;
                }
            } else if (this.field1326 > var2) {
                this.field1328 = -1;
                if (this.field1331 == 0 || this.field1331 > this.field1326 - var2) {
                    this.field1331 = this.field1326 - var2;
                }
            } else {
                this.field1328 = 0;
            }
            return false;
        } else if (this.field1322 == Integer.MIN_VALUE) {
            this.field1322 = 0;
            this.field1326 = 0;
            this.field1325 = 0;
            this.field1320 = 0;
            this.method3729();
            return true;
        } else {
            this.method1329();
            return false;
        }
    }

    @ObfuscatedName("bm.ai([B[IIIIIIILbm;)I")
    public static int method1434(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class68 arg8) {
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
        arg8.field1332 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bm.az(I[B[IIIIIIIILbm;)I")
    public static int method1394(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10) {
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
        arg10.field1332 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bm.au([B[IIIIIIILbm;)I")
    public static int method1352(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class68 arg8) {
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
        arg8.field1332 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bm.ag(I[B[IIIIIIIILbm;)I")
    public static int method1382(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10) {
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
        arg10.field1332 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bm.ae(II[B[IIIIIIILbm;II)I")
    public static int method1381(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10, int arg11, int arg12) {
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
        arg10.field1332 = arg4;
        return arg5;
    }

    @ObfuscatedName("bm.an(II[B[IIIIIIIILbm;II)I")
    public static int method1355(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
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
        arg11.field1332 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bm.aj(II[B[IIIIIIILbm;II)I")
    public static int method1324(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10, int arg11, int arg12) {
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
        arg10.field1332 = arg4;
        return arg5;
    }

    @ObfuscatedName("bm.bg(II[B[IIIIIIIILbm;II)I")
    public static int method1357(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
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
        arg11.field1332 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bm.bf([B[IIIIIIIILbm;)I")
    public static int method1358(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class68 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1325 += (var14 - arg3) * arg9.field1333;
        arg9.field1326 += (var14 - arg3) * arg9.field1328;
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
        arg9.field1320 = var12 >> 2;
        arg9.field1332 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bm.bl(I[B[IIIIIIIIIILbm;)I")
    public static int method1433(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class68 arg12) {
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
        arg12.field1320 += (var19 - arg4) * arg12.field1323;
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
        arg12.field1325 = var15 >> 2;
        arg12.field1326 = var16 >> 2;
        arg12.field1332 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bm.bn([B[IIIIIIIILbm;)I")
    public static int method1360(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class68 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1325 += (var14 - arg3) * arg9.field1333;
        arg9.field1326 += (var14 - arg3) * arg9.field1328;
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
        arg9.field1320 = var12 >> 2;
        arg9.field1332 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bm.bs(I[B[IIIIIIIIIILbm;)I")
    public static int method1361(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class68 arg12) {
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
        arg12.field1320 += (var19 - arg4) * arg12.field1323;
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
        arg12.field1325 = var15 >> 2;
        arg12.field1326 = var16 >> 2;
        arg12.field1332 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bm.bc(II[B[IIIIIIIILbm;II)I")
    public static int method1362(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
        arg11.field1325 -= arg11.field1333 * arg5;
        arg11.field1326 -= arg11.field1328 * arg5;
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
        arg11.field1325 += arg11.field1333 * arg5;
        arg11.field1326 += arg11.field1328 * arg5;
        arg11.field1320 = arg6;
        arg11.field1332 = arg4;
        return arg5;
    }

    @ObfuscatedName("bm.bq(II[B[IIIIIIIIIILbm;II)I")
    public static int method1449(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class68 arg13, int arg14, int arg15) {
        arg13.field1320 -= arg13.field1323 * arg5;
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
        arg13.field1320 += arg13.field1323 * var27;
        arg13.field1325 = arg6;
        arg13.field1326 = arg7;
        arg13.field1332 = arg4;
        return var27;
    }

    @ObfuscatedName("bm.bp(II[B[IIIIIIIILbm;II)I")
    public static int method1385(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
        arg11.field1325 -= arg11.field1333 * arg5;
        arg11.field1326 -= arg11.field1328 * arg5;
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
        arg11.field1325 += arg11.field1333 * arg5;
        arg11.field1326 += arg11.field1328 * arg5;
        arg11.field1320 = arg6;
        arg11.field1332 = arg4;
        return arg5;
    }

    @ObfuscatedName("bm.bo(II[B[IIIIIIIIIILbm;II)I")
    public static int method1461(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class68 arg13, int arg14, int arg15) {
        arg13.field1320 -= arg13.field1323 * arg5;
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
        arg13.field1320 += arg13.field1323 * var26;
        arg13.field1325 = arg6;
        arg13.field1326 = arg7;
        arg13.field1332 = arg4;
        return var26;
    }
}
