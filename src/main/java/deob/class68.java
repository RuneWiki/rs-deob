package deob;

@ObfuscatedName("bg")
public class class68 extends class70 {

    @ObfuscatedName("bg.m")
    public int field1327;

    @ObfuscatedName("bg.e")
    public int field1323;

    @ObfuscatedName("bg.o")
    public int field1331;

    @ObfuscatedName("bg.g")
    public int field1325;

    @ObfuscatedName("bg.l")
    public int field1326;

    @ObfuscatedName("bg.j")
    public int field1334;

    @ObfuscatedName("bg.r")
    public int field1329;

    @ObfuscatedName("bg.x")
    public int field1332;

    @ObfuscatedName("bg.k")
    public int field1330;

    @ObfuscatedName("bg.v")
    public int field1322;

    @ObfuscatedName("bg.h")
    public boolean field1328;

    @ObfuscatedName("bg.u")
    public int field1333;

    @ObfuscatedName("bg.y")
    public int field1324;

    @ObfuscatedName("bg.p")
    public int field1335;

    @ObfuscatedName("bg.s")
    public int field1336;

    @ObfuscatedName("bg.m(II)I")
    public static int method1398(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bg.w(II)I")
    public static int method1352(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bg.ao()I")
    public int method1354() {
        int var1 = this.field1326 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1332 == 0) {
            var2 -= this.field1327 * var2 / (((class66) this.field1339).field1306.length << 8);
        } else if (this.field1332 >= 0) {
            var2 -= this.field1330 * var2 / ((class66) this.field1339).field1306.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class68(class66 arg0, int arg1, int arg2) {
        this.field1339 = arg0;
        this.field1330 = arg0.field1309;
        this.field1322 = arg0.field1308;
        this.field1328 = arg0.field1305;
        this.field1323 = arg1;
        this.field1331 = arg2;
        this.field1325 = 8192;
        this.field1327 = 0;
        this.method1357();
    }

    public class68(class66 arg0, int arg1, int arg2, int arg3) {
        this.field1339 = arg0;
        this.field1330 = arg0.field1309;
        this.field1322 = arg0.field1308;
        this.field1328 = arg0.field1305;
        this.field1323 = arg1;
        this.field1331 = arg2;
        this.field1325 = arg3;
        this.field1327 = 0;
        this.method1357();
    }

    @ObfuscatedName("bg.e(Lbn;II)Lbg;")
    public static class68 method1381(class66 arg0, int arg1, int arg2) {
        return arg0.field1306 == null || arg0.field1306.length == 0 ? null : new class68(arg0, (int) ((long) arg0.field1307 * 256L * (long) arg1 / (long) (Statics.field1269 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bg.o(Lbn;III)Lbg;")
    public static class68 method1356(class66 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1306 == null || arg0.field1306.length == 0 ? null : new class68(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bg.g()V")
    public void method1357() {
        this.field1326 = this.field1331;
        this.field1334 = method1398(this.field1331, this.field1325);
        this.field1329 = method1352(this.field1331, this.field1325);
    }

    @ObfuscatedName("bg.k(I)V")
    public synchronized void method1358(int arg0) {
        this.field1332 = arg0;
    }

    @ObfuscatedName("bg.h(I)V")
    public synchronized void method1387(int arg0) {
        this.method1361(arg0 << 6, this.method1382());
    }

    @ObfuscatedName("bg.u(I)V")
    public synchronized void method1360(int arg0) {
        this.method1361(arg0, this.method1382());
    }

    @ObfuscatedName("bg.y(II)V")
    public synchronized void method1361(int arg0, int arg1) {
        this.field1331 = arg0;
        this.field1325 = arg1;
        this.field1333 = 0;
        this.method1357();
    }

    @ObfuscatedName("bg.p()I")
    public synchronized int method1362() {
        return this.field1331 == Integer.MIN_VALUE ? 0 : this.field1331;
    }

    @ObfuscatedName("bg.s()I")
    public synchronized int method1382() {
        return this.field1325 < 0 ? -1 : this.field1325;
    }

    @ObfuscatedName("bg.f(I)V")
    public synchronized void method1447(int arg0) {
        int var2 = ((class66) this.field1339).field1306.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1327 = arg0;
    }

    @ObfuscatedName("bg.i(Z)V")
    public synchronized void method1365(boolean arg0) {
        this.field1323 = (this.field1323 >>> 31) + (this.field1323 ^ this.field1323 >> 31);
        if (arg0) {
            this.field1323 = -this.field1323;
        }
    }

    @ObfuscatedName("bg.d()V")
    public void method1359() {
        if (this.field1333 == 0) {
            return;
        }
        if (this.field1331 == Integer.MIN_VALUE) {
            this.field1331 = 0;
        }
        this.field1333 = 0;
        this.method1357();
    }

    @ObfuscatedName("bg.t(II)V")
    public synchronized void method1367(int arg0, int arg1) {
        this.method1368(arg0, arg1, this.method1382());
    }

    @ObfuscatedName("bg.c(III)V")
    public synchronized void method1368(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1361(arg1, arg2);
            return;
        }
        int var4 = method1398(arg1, arg2);
        int var5 = method1352(arg1, arg2);
        if (this.field1334 == var4 && this.field1329 == var5) {
            this.field1333 = 0;
            return;
        }
        int var6 = arg1 - this.field1326;
        if (this.field1326 - arg1 > var6) {
            var6 = this.field1326 - arg1;
        }
        if (var4 - this.field1334 > var6) {
            var6 = var4 - this.field1334;
        }
        if (this.field1334 - var4 > var6) {
            var6 = this.field1334 - var4;
        }
        if (var5 - this.field1329 > var6) {
            var6 = var5 - this.field1329;
        }
        if (this.field1329 - var5 > var6) {
            var6 = this.field1329 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1333 = arg0;
        this.field1331 = arg1;
        this.field1325 = arg2;
        this.field1324 = (arg1 - this.field1326) / arg0;
        this.field1335 = (var4 - this.field1334) / arg0;
        this.field1336 = (var5 - this.field1329) / arg0;
    }

    @ObfuscatedName("bg.z(I)V")
    public synchronized void method1369(int arg0) {
        if (arg0 == 0) {
            this.method1360(0);
            this.method3729();
        } else if (this.field1334 == 0 && this.field1329 == 0) {
            this.field1333 = 0;
            this.field1331 = 0;
            this.field1326 = 0;
            this.method3729();
        } else {
            int var2 = -this.field1326;
            if (this.field1326 > var2) {
                var2 = this.field1326;
            }
            if (-this.field1334 > var2) {
                var2 = -this.field1334;
            }
            if (this.field1334 > var2) {
                var2 = this.field1334;
            }
            if (-this.field1329 > var2) {
                var2 = -this.field1329;
            }
            if (this.field1329 > var2) {
                var2 = this.field1329;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1333 = arg0;
            this.field1331 = Integer.MIN_VALUE;
            this.field1324 = -this.field1326 / arg0;
            this.field1335 = -this.field1334 / arg0;
            this.field1336 = -this.field1329 / arg0;
        }
    }

    @ObfuscatedName("bg.n(I)V")
    public synchronized void method1370(int arg0) {
        if (this.field1323 < 0) {
            this.field1323 = -arg0;
        } else {
            this.field1323 = arg0;
        }
    }

    @ObfuscatedName("bg.q()I")
    public synchronized int method1371() {
        return this.field1323 < 0 ? -this.field1323 : this.field1323;
    }

    @ObfuscatedName("bg.a()Z")
    public boolean method1372() {
        return this.field1327 < 0 || this.field1327 >= ((class66) this.field1339).field1306.length << 8;
    }

    @ObfuscatedName("bg.at()Z")
    public boolean method1373() {
        return this.field1333 != 0;
    }

    @ObfuscatedName("bg.l()Lbp;")
    public class70 method1175() {
        return null;
    }

    @ObfuscatedName("bg.j()Lbp;")
    public class70 method1176() {
        return null;
    }

    @ObfuscatedName("bg.r()I")
    public int method1177() {
        return this.field1331 == 0 && this.field1333 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bg.x([III)V")
    public synchronized void method1169(int[] arg0, int arg1, int arg2) {
        if (this.field1331 == 0 && this.field1333 == 0) {
            this.method1180(arg2);
            return;
        }
        class66 var4 = (class66) this.field1339;
        int var5 = this.field1330 << 8;
        int var6 = this.field1322 << 8;
        int var7 = var4.field1306.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1332 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1327 < 0) {
            if (this.field1323 <= 0) {
                this.method1359();
                this.method3729();
                return;
            }
            this.field1327 = 0;
        }
        if (this.field1327 >= var7) {
            if (this.field1323 >= 0) {
                this.method1359();
                this.method3729();
                return;
            }
            this.field1327 = var7 - 1;
        }
        if (this.field1332 >= 0) {
            if (this.field1332 > 0) {
                if (this.field1328) {
                    label131: {
                        if (this.field1323 < 0) {
                            var9 = this.method1477(arg0, arg1, var5, var10, var4.field1306[this.field1330]);
                            if (this.field1327 >= var5) {
                                return;
                            }
                            this.field1327 = var5 + var5 - 1 - this.field1327;
                            this.field1323 = -this.field1323;
                            if (--this.field1332 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1378(arg0, var9, var6, var10, var4.field1306[this.field1322 - 1]);
                            if (this.field1327 < var6) {
                                return;
                            }
                            this.field1327 = var6 + var6 - 1 - this.field1327;
                            this.field1323 = -this.field1323;
                            if (--this.field1332 == 0) {
                                break;
                            }
                            var9 = this.method1477(arg0, var9, var5, var10, var4.field1306[this.field1330]);
                            if (this.field1327 >= var5) {
                                return;
                            }
                            this.field1327 = var5 + var5 - 1 - this.field1327;
                            this.field1323 = -this.field1323;
                        } while (--this.field1332 != 0);
                    }
                } else if (this.field1323 < 0) {
                    while (true) {
                        var9 = this.method1477(arg0, var9, var5, var10, var4.field1306[this.field1322 - 1]);
                        if (this.field1327 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1327) / var8;
                        if (var12 >= this.field1332) {
                            this.field1327 += this.field1332 * var8;
                            this.field1332 = 0;
                            break;
                        }
                        this.field1327 += var8 * var12;
                        this.field1332 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1378(arg0, var9, var6, var10, var4.field1306[this.field1330]);
                        if (this.field1327 < var6) {
                            return;
                        }
                        int var13 = (this.field1327 - var5) / var8;
                        if (var13 >= this.field1332) {
                            this.field1327 -= this.field1332 * var8;
                            this.field1332 = 0;
                            break;
                        }
                        this.field1327 -= var8 * var13;
                        this.field1332 -= var13;
                    }
                }
            }
            if (this.field1323 < 0) {
                this.method1477(arg0, var9, 0, var10, 0);
                if (this.field1327 < 0) {
                    this.field1327 = -1;
                    this.method1359();
                    this.method3729();
                }
            } else {
                this.method1378(arg0, var9, var7, var10, 0);
                if (this.field1327 >= var7) {
                    this.field1327 = var7;
                    this.method1359();
                    this.method3729();
                }
            }
        } else if (this.field1328) {
            if (this.field1323 < 0) {
                var9 = this.method1477(arg0, arg1, var5, var10, var4.field1306[this.field1330]);
                if (this.field1327 >= var5) {
                    return;
                }
                this.field1327 = var5 + var5 - 1 - this.field1327;
                this.field1323 = -this.field1323;
            }
            while (true) {
                int var11 = this.method1378(arg0, var9, var6, var10, var4.field1306[this.field1322 - 1]);
                if (this.field1327 < var6) {
                    return;
                }
                this.field1327 = var6 + var6 - 1 - this.field1327;
                this.field1323 = -this.field1323;
                var9 = this.method1477(arg0, var11, var5, var10, var4.field1306[this.field1330]);
                if (this.field1327 >= var5) {
                    return;
                }
                this.field1327 = var5 + var5 - 1 - this.field1327;
                this.field1323 = -this.field1323;
            }
        } else if (this.field1323 < 0) {
            while (true) {
                var9 = this.method1477(arg0, var9, var5, var10, var4.field1306[this.field1322 - 1]);
                if (this.field1327 >= var5) {
                    return;
                }
                this.field1327 = var6 - 1 - (var6 - 1 - this.field1327) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1378(arg0, var9, var6, var10, var4.field1306[this.field1330]);
                if (this.field1327 < var6) {
                    return;
                }
                this.field1327 = (this.field1327 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bg.v(I)V")
    public synchronized void method1180(int arg0) {
        if (this.field1333 > 0) {
            if (arg0 >= this.field1333) {
                if (this.field1331 == Integer.MIN_VALUE) {
                    this.field1331 = 0;
                    this.field1329 = 0;
                    this.field1334 = 0;
                    this.field1326 = 0;
                    this.method3729();
                    arg0 = this.field1333;
                }
                this.field1333 = 0;
                this.method1357();
            } else {
                this.field1326 += this.field1324 * arg0;
                this.field1334 += this.field1335 * arg0;
                this.field1329 += this.field1336 * arg0;
                this.field1333 -= arg0;
            }
        }
        class66 var2 = (class66) this.field1339;
        int var3 = this.field1330 << 8;
        int var4 = this.field1322 << 8;
        int var5 = var2.field1306.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1332 = 0;
        }
        if (this.field1327 < 0) {
            if (this.field1323 <= 0) {
                this.method1359();
                this.method3729();
                return;
            }
            this.field1327 = 0;
        }
        if (this.field1327 >= var5) {
            if (this.field1323 >= 0) {
                this.method1359();
                this.method3729();
                return;
            }
            this.field1327 = var5 - 1;
        }
        this.field1327 += this.field1323 * arg0;
        if (this.field1332 >= 0) {
            if (this.field1332 > 0) {
                if (this.field1328) {
                    label121: {
                        if (this.field1323 < 0) {
                            if (this.field1327 >= var3) {
                                return;
                            }
                            this.field1327 = var3 + var3 - 1 - this.field1327;
                            this.field1323 = -this.field1323;
                            if (--this.field1332 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1327 < var4) {
                                return;
                            }
                            this.field1327 = var4 + var4 - 1 - this.field1327;
                            this.field1323 = -this.field1323;
                            if (--this.field1332 == 0) {
                                break;
                            }
                            if (this.field1327 >= var3) {
                                return;
                            }
                            this.field1327 = var3 + var3 - 1 - this.field1327;
                            this.field1323 = -this.field1323;
                        } while (--this.field1332 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1323 < 0) {
                            if (this.field1327 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1327) / var6;
                            if (var7 >= this.field1332) {
                                this.field1327 += this.field1332 * var6;
                                this.field1332 = 0;
                                break label153;
                            }
                            this.field1327 += var6 * var7;
                            this.field1332 -= var7;
                        } else if (this.field1327 >= var4) {
                            int var8 = (this.field1327 - var3) / var6;
                            if (var8 >= this.field1332) {
                                this.field1327 -= this.field1332 * var6;
                                this.field1332 = 0;
                                break label153;
                            }
                            this.field1327 -= var6 * var8;
                            this.field1332 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1323 < 0) {
                if (this.field1327 < 0) {
                    this.field1327 = -1;
                    this.method1359();
                    this.method3729();
                }
            } else if (this.field1327 >= var5) {
                this.field1327 = var5;
                this.method1359();
                this.method3729();
            }
        } else if (this.field1328) {
            if (this.field1323 < 0) {
                if (this.field1327 >= var3) {
                    return;
                }
                this.field1327 = var3 + var3 - 1 - this.field1327;
                this.field1323 = -this.field1323;
            }
            while (this.field1327 >= var4) {
                this.field1327 = var4 + var4 - 1 - this.field1327;
                this.field1323 = -this.field1323;
                if (this.field1327 >= var3) {
                    return;
                }
                this.field1327 = var3 + var3 - 1 - this.field1327;
                this.field1323 = -this.field1323;
            }
        } else if (this.field1323 < 0) {
            if (this.field1327 >= var3) {
                return;
            }
            this.field1327 = var4 - 1 - (var4 - 1 - this.field1327) % var6;
        } else if (this.field1327 >= var4) {
            this.field1327 = (this.field1327 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bg.aw([IIIII)I")
    public int method1378(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1333 > 0) {
                int var6 = this.field1333 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1333 += arg1;
                if (this.field1323 == 256 && (this.field1327 & 0xFF) == 0) {
                    if (Statics.field1248) {
                        arg1 = method1390(0, ((class66) this.field1339).field1306, arg0, this.field1327, arg1, this.field1334, this.field1329, this.field1335, this.field1336, 0, var6, arg2, this);
                    } else {
                        arg1 = method1389(((class66) this.field1339).field1306, arg0, this.field1327, arg1, this.field1326, this.field1324, 0, var6, arg2, this);
                    }
                } else if (Statics.field1248) {
                    arg1 = method1394(0, 0, ((class66) this.field1339).field1306, arg0, this.field1327, arg1, this.field1334, this.field1329, this.field1335, this.field1336, 0, var6, arg2, this, this.field1323, arg4);
                } else {
                    arg1 = method1393(0, 0, ((class66) this.field1339).field1306, arg0, this.field1327, arg1, this.field1326, this.field1324, 0, var6, arg2, this, this.field1323, arg4);
                }
                this.field1333 -= arg1;
                if (this.field1333 != 0) {
                    return arg1;
                }
                if (!this.method1380()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1323 == 256 && (this.field1327 & 0xFF) == 0) {
                if (Statics.field1248) {
                    return method1463(0, ((class66) this.field1339).field1306, arg0, this.field1327, arg1, this.field1334, this.field1329, 0, arg3, arg2, this);
                }
                return method1470(((class66) this.field1339).field1306, arg0, this.field1327, arg1, this.field1326, 0, arg3, arg2, this);
            }
            if (Statics.field1248) {
                return method1386(0, 0, ((class66) this.field1339).field1306, arg0, this.field1327, arg1, this.field1334, this.field1329, 0, arg3, arg2, this, this.field1323, arg4);
            }
            return method1385(0, 0, ((class66) this.field1339).field1306, arg0, this.field1327, arg1, this.field1326, 0, arg3, arg2, this, this.field1323, arg4);
        }
    }

    @ObfuscatedName("bg.ay([IIIII)I")
    public int method1477(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1333 > 0) {
                int var6 = this.field1333 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1333 += arg1;
                if (this.field1323 == -256 && (this.field1327 & 0xFF) == 0) {
                    if (Statics.field1248) {
                        arg1 = method1392(0, ((class66) this.field1339).field1306, arg0, this.field1327, arg1, this.field1334, this.field1329, this.field1335, this.field1336, 0, var6, arg2, this);
                    } else {
                        arg1 = method1391(((class66) this.field1339).field1306, arg0, this.field1327, arg1, this.field1326, this.field1324, 0, var6, arg2, this);
                    }
                } else if (Statics.field1248) {
                    arg1 = method1396(0, 0, ((class66) this.field1339).field1306, arg0, this.field1327, arg1, this.field1334, this.field1329, this.field1335, this.field1336, 0, var6, arg2, this, this.field1323, arg4);
                } else {
                    arg1 = method1395(0, 0, ((class66) this.field1339).field1306, arg0, this.field1327, arg1, this.field1326, this.field1324, 0, var6, arg2, this, this.field1323, arg4);
                }
                this.field1333 -= arg1;
                if (this.field1333 != 0) {
                    return arg1;
                }
                if (!this.method1380()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1323 == -256 && (this.field1327 & 0xFF) == 0) {
                if (Statics.field1248) {
                    return method1384(0, ((class66) this.field1339).field1306, arg0, this.field1327, arg1, this.field1334, this.field1329, 0, arg3, arg2, this);
                }
                return method1383(((class66) this.field1339).field1306, arg0, this.field1327, arg1, this.field1326, 0, arg3, arg2, this);
            }
            if (Statics.field1248) {
                return method1377(0, 0, ((class66) this.field1339).field1306, arg0, this.field1327, arg1, this.field1334, this.field1329, 0, arg3, arg2, this, this.field1323, arg4);
            }
            return method1375(0, 0, ((class66) this.field1339).field1306, arg0, this.field1327, arg1, this.field1326, 0, arg3, arg2, this, this.field1323, arg4);
        }
    }

    @ObfuscatedName("bg.al()Z")
    public boolean method1380() {
        int var1 = this.field1331;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1398(var1, this.field1325);
            var2 = method1352(var1, this.field1325);
        }
        if (this.field1326 != var1 || this.field1334 != var3 || this.field1329 != var2) {
            if (this.field1326 < var1) {
                this.field1324 = 1;
                this.field1333 = var1 - this.field1326;
            } else if (this.field1326 > var1) {
                this.field1324 = -1;
                this.field1333 = this.field1326 - var1;
            } else {
                this.field1324 = 0;
            }
            if (this.field1334 < var3) {
                this.field1335 = 1;
                if (this.field1333 == 0 || this.field1333 > var3 - this.field1334) {
                    this.field1333 = var3 - this.field1334;
                }
            } else if (this.field1334 > var3) {
                this.field1335 = -1;
                if (this.field1333 == 0 || this.field1333 > this.field1334 - var3) {
                    this.field1333 = this.field1334 - var3;
                }
            } else {
                this.field1335 = 0;
            }
            if (this.field1329 < var2) {
                this.field1336 = 1;
                if (this.field1333 == 0 || this.field1333 > var2 - this.field1329) {
                    this.field1333 = var2 - this.field1329;
                }
            } else if (this.field1329 > var2) {
                this.field1336 = -1;
                if (this.field1333 == 0 || this.field1333 > this.field1329 - var2) {
                    this.field1333 = this.field1329 - var2;
                }
            } else {
                this.field1336 = 0;
            }
            return false;
        } else if (this.field1331 == Integer.MIN_VALUE) {
            this.field1331 = 0;
            this.field1329 = 0;
            this.field1334 = 0;
            this.field1326 = 0;
            this.method3729();
            return true;
        } else {
            this.method1357();
            return false;
        }
    }

    @ObfuscatedName("bg.as([B[IIIIIIILbg;)I")
    public static int method1470(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class68 arg8) {
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
        arg8.field1327 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.ac(I[B[IIIIIIIILbg;)I")
    public static int method1463(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10) {
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
        arg10.field1327 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bg.au([B[IIIIIIILbg;)I")
    public static int method1383(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class68 arg8) {
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
        arg8.field1327 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.am(I[B[IIIIIIIILbg;)I")
    public static int method1384(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10) {
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
        arg10.field1327 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bg.ag(II[B[IIIIIIILbg;II)I")
    public static int method1385(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10, int arg11, int arg12) {
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
        arg10.field1327 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.az(II[B[IIIIIIIILbg;II)I")
    public static int method1386(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
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
        arg11.field1327 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bg.ak(II[B[IIIIIIILbg;II)I")
    public static int method1375(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10, int arg11, int arg12) {
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
        arg10.field1327 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.ae(II[B[IIIIIIIILbg;II)I")
    public static int method1377(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
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
        arg11.field1327 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bg.br([B[IIIIIIIILbg;)I")
    public static int method1389(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class68 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1334 += (var14 - arg3) * arg9.field1335;
        arg9.field1329 += (var14 - arg3) * arg9.field1336;
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
        arg9.field1326 = var12 >> 2;
        arg9.field1327 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.bi(I[B[IIIIIIIIIILbg;)I")
    public static int method1390(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class68 arg12) {
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
        arg12.field1326 += (var19 - arg4) * arg12.field1324;
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
        arg12.field1334 = var15 >> 2;
        arg12.field1329 = var16 >> 2;
        arg12.field1327 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bg.bx([B[IIIIIIIILbg;)I")
    public static int method1391(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class68 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1334 += (var14 - arg3) * arg9.field1335;
        arg9.field1329 += (var14 - arg3) * arg9.field1336;
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
        arg9.field1326 = var12 >> 2;
        arg9.field1327 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.bs(I[B[IIIIIIIIIILbg;)I")
    public static int method1392(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class68 arg12) {
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
        arg12.field1326 += (var19 - arg4) * arg12.field1324;
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
        arg12.field1334 = var15 >> 2;
        arg12.field1329 = var16 >> 2;
        arg12.field1327 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bg.bt(II[B[IIIIIIIILbg;II)I")
    public static int method1393(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
        arg11.field1334 -= arg11.field1335 * arg5;
        arg11.field1329 -= arg11.field1336 * arg5;
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
        arg11.field1334 += arg11.field1335 * arg5;
        arg11.field1329 += arg11.field1336 * arg5;
        arg11.field1326 = arg6;
        arg11.field1327 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.bh(II[B[IIIIIIIIIILbg;II)I")
    public static int method1394(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class68 arg13, int arg14, int arg15) {
        arg13.field1326 -= arg13.field1324 * arg5;
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
        arg13.field1326 += arg13.field1324 * var27;
        arg13.field1334 = arg6;
        arg13.field1329 = arg7;
        arg13.field1327 = arg4;
        return var27;
    }

    @ObfuscatedName("bg.be(II[B[IIIIIIIILbg;II)I")
    public static int method1395(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
        arg11.field1334 -= arg11.field1335 * arg5;
        arg11.field1329 -= arg11.field1336 * arg5;
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
        arg11.field1334 += arg11.field1335 * arg5;
        arg11.field1329 += arg11.field1336 * arg5;
        arg11.field1326 = arg6;
        arg11.field1327 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.bq(II[B[IIIIIIIIIILbg;II)I")
    public static int method1396(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class68 arg13, int arg14, int arg15) {
        arg13.field1326 -= arg13.field1324 * arg5;
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
        arg13.field1326 += arg13.field1324 * var26;
        arg13.field1334 = arg6;
        arg13.field1329 = arg7;
        arg13.field1327 = arg4;
        return var26;
    }
}
