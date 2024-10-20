package deob;

@ObfuscatedName("bc")
public class class68 extends class70 {

    @ObfuscatedName("bc.s")
    public int field1304;

    @ObfuscatedName("bc.z")
    public int field1291;

    @ObfuscatedName("bc.t")
    public int field1298;

    @ObfuscatedName("bc.y")
    public int field1296;

    @ObfuscatedName("bc.p")
    public int field1294;

    @ObfuscatedName("bc.g")
    public int field1295;

    @ObfuscatedName("bc.m")
    public int field1292;

    @ObfuscatedName("bc.f")
    public int field1297;

    @ObfuscatedName("bc.k")
    public int field1303;

    @ObfuscatedName("bc.h")
    public int field1299;

    @ObfuscatedName("bc.r")
    public boolean field1293;

    @ObfuscatedName("bc.u")
    public int field1301;

    @ObfuscatedName("bc.n")
    public int field1302;

    @ObfuscatedName("bc.d")
    public int field1300;

    @ObfuscatedName("bc.a")
    public int field1290;

    @ObfuscatedName("bc.s(II)I")
    public static int method1321(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bc.z(II)I")
    public static int method1291(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bc.an()I")
    public int method1292() {
        int var1 = this.field1294 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1297 == 0) {
            var2 -= this.field1304 * var2 / (((class66) this.field1306).field1274.length << 8);
        } else if (this.field1297 >= 0) {
            var2 -= this.field1303 * var2 / ((class66) this.field1306).field1274.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class68(class66 arg0, int arg1, int arg2) {
        this.field1306 = arg0;
        this.field1303 = arg0.field1275;
        this.field1299 = arg0.field1276;
        this.field1293 = arg0.field1273;
        this.field1291 = arg1;
        this.field1298 = arg2;
        this.field1296 = 8192;
        this.field1304 = 0;
        this.method1295();
    }

    public class68(class66 arg0, int arg1, int arg2, int arg3) {
        this.field1306 = arg0;
        this.field1303 = arg0.field1275;
        this.field1299 = arg0.field1276;
        this.field1293 = arg0.field1273;
        this.field1291 = arg1;
        this.field1298 = arg2;
        this.field1296 = arg3;
        this.field1304 = 0;
        this.method1295();
    }

    @ObfuscatedName("bc.t(Lbs;II)Lbc;")
    public static class68 method1293(class66 arg0, int arg1, int arg2) {
        return arg0.field1274 == null || arg0.field1274.length == 0 ? null : new class68(arg0, (int) ((long) arg0.field1277 * 256L * (long) arg1 / (long) (Statics.field1220 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bc.y(Lbs;III)Lbc;")
    public static class68 method1294(class66 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1274 == null || arg0.field1274.length == 0 ? null : new class68(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bc.p()V")
    public void method1295() {
        this.field1294 = this.field1298;
        this.field1295 = method1321(this.field1298, this.field1296);
        this.field1292 = method1291(this.field1298, this.field1296);
    }

    @ObfuscatedName("bc.h(I)V")
    public synchronized void method1296(int arg0) {
        this.field1297 = arg0;
    }

    @ObfuscatedName("bc.w(I)V")
    public synchronized void method1297(int arg0) {
        this.method1299(arg0 << 6, this.method1410());
    }

    @ObfuscatedName("bc.u(I)V")
    public synchronized void method1298(int arg0) {
        this.method1299(arg0, this.method1410());
    }

    @ObfuscatedName("bc.n(II)V")
    public synchronized void method1299(int arg0, int arg1) {
        this.field1298 = arg0;
        this.field1296 = arg1;
        this.field1301 = 0;
        this.method1295();
    }

    @ObfuscatedName("bc.d()I")
    public synchronized int method1300() {
        return this.field1298 == Integer.MIN_VALUE ? 0 : this.field1298;
    }

    @ObfuscatedName("bc.a()I")
    public synchronized int method1410() {
        return this.field1296 < 0 ? -1 : this.field1296;
    }

    @ObfuscatedName("bc.b(I)V")
    public synchronized void method1301(int arg0) {
        int var2 = ((class66) this.field1306).field1274.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1304 = arg0;
    }

    @ObfuscatedName("bc.q(Z)V")
    public synchronized void method1359(boolean arg0) {
        this.field1291 = (this.field1291 >>> 31) + (this.field1291 ^ this.field1291 >> 31);
        if (arg0) {
            this.field1291 = -this.field1291;
        }
    }

    @ObfuscatedName("bc.o()V")
    public void method1304() {
        if (this.field1301 == 0) {
            return;
        }
        if (this.field1298 == Integer.MIN_VALUE) {
            this.field1298 = 0;
        }
        this.field1301 = 0;
        this.method1295();
    }

    @ObfuscatedName("bc.c(II)V")
    public synchronized void method1419(int arg0, int arg1) {
        this.method1306(arg0, arg1, this.method1410());
    }

    @ObfuscatedName("bc.i(III)V")
    public synchronized void method1306(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1299(arg1, arg2);
            return;
        }
        int var4 = method1321(arg1, arg2);
        int var5 = method1291(arg1, arg2);
        if (this.field1295 == var4 && this.field1292 == var5) {
            this.field1301 = 0;
            return;
        }
        int var6 = arg1 - this.field1294;
        if (this.field1294 - arg1 > var6) {
            var6 = this.field1294 - arg1;
        }
        if (var4 - this.field1295 > var6) {
            var6 = var4 - this.field1295;
        }
        if (this.field1295 - var4 > var6) {
            var6 = this.field1295 - var4;
        }
        if (var5 - this.field1292 > var6) {
            var6 = var5 - this.field1292;
        }
        if (this.field1292 - var5 > var6) {
            var6 = this.field1292 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1301 = arg0;
        this.field1298 = arg1;
        this.field1296 = arg2;
        this.field1302 = (arg1 - this.field1294) / arg0;
        this.field1300 = (var4 - this.field1295) / arg0;
        this.field1290 = (var5 - this.field1292) / arg0;
    }

    @ObfuscatedName("bc.x(I)V")
    public synchronized void method1307(int arg0) {
        if (arg0 == 0) {
            this.method1298(0);
            this.method3699();
        } else if (this.field1295 == 0 && this.field1292 == 0) {
            this.field1301 = 0;
            this.field1298 = 0;
            this.field1294 = 0;
            this.method3699();
        } else {
            int var2 = -this.field1294;
            if (this.field1294 > var2) {
                var2 = this.field1294;
            }
            if (-this.field1295 > var2) {
                var2 = -this.field1295;
            }
            if (this.field1295 > var2) {
                var2 = this.field1295;
            }
            if (-this.field1292 > var2) {
                var2 = -this.field1292;
            }
            if (this.field1292 > var2) {
                var2 = this.field1292;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1301 = arg0;
            this.field1298 = Integer.MIN_VALUE;
            this.field1302 = -this.field1294 / arg0;
            this.field1300 = -this.field1295 / arg0;
            this.field1290 = -this.field1292 / arg0;
        }
    }

    @ObfuscatedName("bc.aa(I)V")
    public synchronized void method1308(int arg0) {
        if (this.field1291 < 0) {
            this.field1291 = -arg0;
        } else {
            this.field1291 = arg0;
        }
    }

    @ObfuscatedName("bc.ag()I")
    public synchronized int method1310() {
        return this.field1291 < 0 ? -this.field1291 : this.field1291;
    }

    @ObfuscatedName("bc.ab()Z")
    public boolean method1404() {
        return this.field1304 < 0 || this.field1304 >= ((class66) this.field1306).field1274.length << 8;
    }

    @ObfuscatedName("bc.ao()Z")
    public boolean method1311() {
        return this.field1301 != 0;
    }

    @ObfuscatedName("bc.g()Lbi;")
    public class70 method1133() {
        return null;
    }

    @ObfuscatedName("bc.m()Lbi;")
    public class70 method1134() {
        return null;
    }

    @ObfuscatedName("bc.f()I")
    public int method1151() {
        return this.field1298 == 0 && this.field1301 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bc.k([III)V")
    public synchronized void method1135(int[] arg0, int arg1, int arg2) {
        if (this.field1298 == 0 && this.field1301 == 0) {
            this.method1137(arg2);
            return;
        }
        class66 var4 = (class66) this.field1306;
        int var5 = this.field1303 << 8;
        int var6 = this.field1299 << 8;
        int var7 = var4.field1274.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1297 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1304 < 0) {
            if (this.field1291 <= 0) {
                this.method1304();
                this.method3699();
                return;
            }
            this.field1304 = 0;
        }
        if (this.field1304 >= var7) {
            if (this.field1291 >= 0) {
                this.method1304();
                this.method3699();
                return;
            }
            this.field1304 = var7 - 1;
        }
        if (this.field1297 >= 0) {
            if (this.field1297 > 0) {
                if (this.field1293) {
                    label131: {
                        if (this.field1291 < 0) {
                            var9 = this.method1315(arg0, arg1, var5, var10, var4.field1274[this.field1303]);
                            if (this.field1304 >= var5) {
                                return;
                            }
                            this.field1304 = var5 + var5 - 1 - this.field1304;
                            this.field1291 = -this.field1291;
                            if (--this.field1297 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1420(arg0, var9, var6, var10, var4.field1274[this.field1299 - 1]);
                            if (this.field1304 < var6) {
                                return;
                            }
                            this.field1304 = var6 + var6 - 1 - this.field1304;
                            this.field1291 = -this.field1291;
                            if (--this.field1297 == 0) {
                                break;
                            }
                            var9 = this.method1315(arg0, var9, var5, var10, var4.field1274[this.field1303]);
                            if (this.field1304 >= var5) {
                                return;
                            }
                            this.field1304 = var5 + var5 - 1 - this.field1304;
                            this.field1291 = -this.field1291;
                        } while (--this.field1297 != 0);
                    }
                } else if (this.field1291 < 0) {
                    while (true) {
                        var9 = this.method1315(arg0, var9, var5, var10, var4.field1274[this.field1299 - 1]);
                        if (this.field1304 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1304) / var8;
                        if (var12 >= this.field1297) {
                            this.field1304 += this.field1297 * var8;
                            this.field1297 = 0;
                            break;
                        }
                        this.field1304 += var8 * var12;
                        this.field1297 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1420(arg0, var9, var6, var10, var4.field1274[this.field1303]);
                        if (this.field1304 < var6) {
                            return;
                        }
                        int var13 = (this.field1304 - var5) / var8;
                        if (var13 >= this.field1297) {
                            this.field1304 -= this.field1297 * var8;
                            this.field1297 = 0;
                            break;
                        }
                        this.field1304 -= var8 * var13;
                        this.field1297 -= var13;
                    }
                }
            }
            if (this.field1291 < 0) {
                this.method1315(arg0, var9, 0, var10, 0);
                if (this.field1304 < 0) {
                    this.field1304 = -1;
                    this.method1304();
                    this.method3699();
                }
            } else {
                this.method1420(arg0, var9, var7, var10, 0);
                if (this.field1304 >= var7) {
                    this.field1304 = var7;
                    this.method1304();
                    this.method3699();
                }
            }
        } else if (this.field1293) {
            if (this.field1291 < 0) {
                var9 = this.method1315(arg0, arg1, var5, var10, var4.field1274[this.field1303]);
                if (this.field1304 >= var5) {
                    return;
                }
                this.field1304 = var5 + var5 - 1 - this.field1304;
                this.field1291 = -this.field1291;
            }
            while (true) {
                int var11 = this.method1420(arg0, var9, var6, var10, var4.field1274[this.field1299 - 1]);
                if (this.field1304 < var6) {
                    return;
                }
                this.field1304 = var6 + var6 - 1 - this.field1304;
                this.field1291 = -this.field1291;
                var9 = this.method1315(arg0, var11, var5, var10, var4.field1274[this.field1303]);
                if (this.field1304 >= var5) {
                    return;
                }
                this.field1304 = var5 + var5 - 1 - this.field1304;
                this.field1291 = -this.field1291;
            }
        } else if (this.field1291 < 0) {
            while (true) {
                var9 = this.method1315(arg0, var9, var5, var10, var4.field1274[this.field1299 - 1]);
                if (this.field1304 >= var5) {
                    return;
                }
                this.field1304 = var6 - 1 - (var6 - 1 - this.field1304) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1420(arg0, var9, var6, var10, var4.field1274[this.field1303]);
                if (this.field1304 < var6) {
                    return;
                }
                this.field1304 = (this.field1304 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bc.r(I)V")
    public synchronized void method1137(int arg0) {
        if (this.field1301 > 0) {
            if (arg0 >= this.field1301) {
                if (this.field1298 == Integer.MIN_VALUE) {
                    this.field1298 = 0;
                    this.field1292 = 0;
                    this.field1295 = 0;
                    this.field1294 = 0;
                    this.method3699();
                    arg0 = this.field1301;
                }
                this.field1301 = 0;
                this.method1295();
            } else {
                this.field1294 += this.field1302 * arg0;
                this.field1295 += this.field1300 * arg0;
                this.field1292 += this.field1290 * arg0;
                this.field1301 -= arg0;
            }
        }
        class66 var2 = (class66) this.field1306;
        int var3 = this.field1303 << 8;
        int var4 = this.field1299 << 8;
        int var5 = var2.field1274.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1297 = 0;
        }
        if (this.field1304 < 0) {
            if (this.field1291 <= 0) {
                this.method1304();
                this.method3699();
                return;
            }
            this.field1304 = 0;
        }
        if (this.field1304 >= var5) {
            if (this.field1291 >= 0) {
                this.method1304();
                this.method3699();
                return;
            }
            this.field1304 = var5 - 1;
        }
        this.field1304 += this.field1291 * arg0;
        if (this.field1297 >= 0) {
            if (this.field1297 > 0) {
                if (this.field1293) {
                    label121: {
                        if (this.field1291 < 0) {
                            if (this.field1304 >= var3) {
                                return;
                            }
                            this.field1304 = var3 + var3 - 1 - this.field1304;
                            this.field1291 = -this.field1291;
                            if (--this.field1297 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1304 < var4) {
                                return;
                            }
                            this.field1304 = var4 + var4 - 1 - this.field1304;
                            this.field1291 = -this.field1291;
                            if (--this.field1297 == 0) {
                                break;
                            }
                            if (this.field1304 >= var3) {
                                return;
                            }
                            this.field1304 = var3 + var3 - 1 - this.field1304;
                            this.field1291 = -this.field1291;
                        } while (--this.field1297 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1291 < 0) {
                            if (this.field1304 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1304) / var6;
                            if (var7 >= this.field1297) {
                                this.field1304 += this.field1297 * var6;
                                this.field1297 = 0;
                                break label153;
                            }
                            this.field1304 += var6 * var7;
                            this.field1297 -= var7;
                        } else if (this.field1304 >= var4) {
                            int var8 = (this.field1304 - var3) / var6;
                            if (var8 >= this.field1297) {
                                this.field1304 -= this.field1297 * var6;
                                this.field1297 = 0;
                                break label153;
                            }
                            this.field1304 -= var6 * var8;
                            this.field1297 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1291 < 0) {
                if (this.field1304 < 0) {
                    this.field1304 = -1;
                    this.method1304();
                    this.method3699();
                }
            } else if (this.field1304 >= var5) {
                this.field1304 = var5;
                this.method1304();
                this.method3699();
            }
        } else if (this.field1293) {
            if (this.field1291 < 0) {
                if (this.field1304 >= var3) {
                    return;
                }
                this.field1304 = var3 + var3 - 1 - this.field1304;
                this.field1291 = -this.field1291;
            }
            while (this.field1304 >= var4) {
                this.field1304 = var4 + var4 - 1 - this.field1304;
                this.field1291 = -this.field1291;
                if (this.field1304 >= var3) {
                    return;
                }
                this.field1304 = var3 + var3 - 1 - this.field1304;
                this.field1291 = -this.field1291;
            }
        } else if (this.field1291 < 0) {
            if (this.field1304 >= var3) {
                return;
            }
            this.field1304 = var4 - 1 - (var4 - 1 - this.field1304) % var6;
        } else if (this.field1304 >= var4) {
            this.field1304 = (this.field1304 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bc.av([IIIII)I")
    public int method1420(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1301 > 0) {
                int var6 = this.field1301 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1301 += arg1;
                if (this.field1291 == 256 && (this.field1304 & 0xFF) == 0) {
                    if (Statics.field1223) {
                        arg1 = method1345(0, ((class66) this.field1306).field1274, arg0, this.field1304, arg1, this.field1295, this.field1292, this.field1300, this.field1290, 0, var6, arg2, this);
                    } else {
                        arg1 = method1324(((class66) this.field1306).field1274, arg0, this.field1304, arg1, this.field1294, this.field1302, 0, var6, arg2, this);
                    }
                } else if (Statics.field1223) {
                    arg1 = method1328(0, 0, ((class66) this.field1306).field1274, arg0, this.field1304, arg1, this.field1295, this.field1292, this.field1300, this.field1290, 0, var6, arg2, this, this.field1291, arg4);
                } else {
                    arg1 = method1317(0, 0, ((class66) this.field1306).field1274, arg0, this.field1304, arg1, this.field1294, this.field1302, 0, var6, arg2, this, this.field1291, arg4);
                }
                this.field1301 -= arg1;
                if (this.field1301 != 0) {
                    return arg1;
                }
                if (!this.method1327()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1291 == 256 && (this.field1304 & 0xFF) == 0) {
                if (Statics.field1223) {
                    return method1439(0, ((class66) this.field1306).field1274, arg0, this.field1304, arg1, this.field1295, this.field1292, 0, arg3, arg2, this);
                }
                return method1302(((class66) this.field1306).field1274, arg0, this.field1304, arg1, this.field1294, 0, arg3, arg2, this);
            }
            if (Statics.field1223) {
                return method1369(0, 0, ((class66) this.field1306).field1274, arg0, this.field1304, arg1, this.field1295, this.field1292, 0, arg3, arg2, this, this.field1291, arg4);
            }
            return method1370(0, 0, ((class66) this.field1306).field1274, arg0, this.field1304, arg1, this.field1294, 0, arg3, arg2, this, this.field1291, arg4);
        }
    }

    @ObfuscatedName("bc.ap([IIIII)I")
    public int method1315(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1301 > 0) {
                int var6 = this.field1301 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1301 += arg1;
                if (this.field1291 == -256 && (this.field1304 & 0xFF) == 0) {
                    if (Statics.field1223) {
                        arg1 = method1413(0, ((class66) this.field1306).field1274, arg0, this.field1304, arg1, this.field1295, this.field1292, this.field1300, this.field1290, 0, var6, arg2, this);
                    } else {
                        arg1 = method1326(((class66) this.field1306).field1274, arg0, this.field1304, arg1, this.field1294, this.field1302, 0, var6, arg2, this);
                    }
                } else if (Statics.field1223) {
                    arg1 = method1330(0, 0, ((class66) this.field1306).field1274, arg0, this.field1304, arg1, this.field1295, this.field1292, this.field1300, this.field1290, 0, var6, arg2, this, this.field1291, arg4);
                } else {
                    arg1 = method1329(0, 0, ((class66) this.field1306).field1274, arg0, this.field1304, arg1, this.field1294, this.field1302, 0, var6, arg2, this, this.field1291, arg4);
                }
                this.field1301 -= arg1;
                if (this.field1301 != 0) {
                    return arg1;
                }
                if (!this.method1327()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1291 == -256 && (this.field1304 & 0xFF) == 0) {
                if (Statics.field1223) {
                    return method1319(0, ((class66) this.field1306).field1274, arg0, this.field1304, arg1, this.field1295, this.field1292, 0, arg3, arg2, this);
                }
                return method1318(((class66) this.field1306).field1274, arg0, this.field1304, arg1, this.field1294, 0, arg3, arg2, this);
            }
            if (Statics.field1223) {
                return method1323(0, 0, ((class66) this.field1306).field1274, arg0, this.field1304, arg1, this.field1295, this.field1292, 0, arg3, arg2, this, this.field1291, arg4);
            }
            return method1426(0, 0, ((class66) this.field1306).field1274, arg0, this.field1304, arg1, this.field1294, 0, arg3, arg2, this, this.field1291, arg4);
        }
    }

    @ObfuscatedName("bc.au()Z")
    public boolean method1327() {
        int var1 = this.field1298;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1321(var1, this.field1296);
            var2 = method1291(var1, this.field1296);
        }
        if (this.field1294 != var1 || this.field1295 != var3 || this.field1292 != var2) {
            if (this.field1294 < var1) {
                this.field1302 = 1;
                this.field1301 = var1 - this.field1294;
            } else if (this.field1294 > var1) {
                this.field1302 = -1;
                this.field1301 = this.field1294 - var1;
            } else {
                this.field1302 = 0;
            }
            if (this.field1295 < var3) {
                this.field1300 = 1;
                if (this.field1301 == 0 || this.field1301 > var3 - this.field1295) {
                    this.field1301 = var3 - this.field1295;
                }
            } else if (this.field1295 > var3) {
                this.field1300 = -1;
                if (this.field1301 == 0 || this.field1301 > this.field1295 - var3) {
                    this.field1301 = this.field1295 - var3;
                }
            } else {
                this.field1300 = 0;
            }
            if (this.field1292 < var2) {
                this.field1290 = 1;
                if (this.field1301 == 0 || this.field1301 > var2 - this.field1292) {
                    this.field1301 = var2 - this.field1292;
                }
            } else if (this.field1292 > var2) {
                this.field1290 = -1;
                if (this.field1301 == 0 || this.field1301 > this.field1292 - var2) {
                    this.field1301 = this.field1292 - var2;
                }
            } else {
                this.field1290 = 0;
            }
            return false;
        } else if (this.field1298 == Integer.MIN_VALUE) {
            this.field1298 = 0;
            this.field1292 = 0;
            this.field1295 = 0;
            this.field1294 = 0;
            this.method3699();
            return true;
        } else {
            this.method1295();
            return false;
        }
    }

    @ObfuscatedName("bc.ad([B[IIIIIIILbc;)I")
    public static int method1302(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class68 arg8) {
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
        arg8.field1304 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bc.aj(I[B[IIIIIIIILbc;)I")
    public static int method1439(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10) {
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
        arg10.field1304 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bc.ai([B[IIIIIIILbc;)I")
    public static int method1318(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class68 arg8) {
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
        arg8.field1304 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bc.az(I[B[IIIIIIIILbc;)I")
    public static int method1319(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10) {
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
        arg10.field1304 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bc.ay(II[B[IIIIIIILbc;II)I")
    public static int method1370(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10, int arg11, int arg12) {
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
        arg10.field1304 = arg4;
        return arg5;
    }

    @ObfuscatedName("bc.at(II[B[IIIIIIIILbc;II)I")
    public static int method1369(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
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
        arg11.field1304 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bc.al(II[B[IIIIIIILbc;II)I")
    public static int method1426(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10, int arg11, int arg12) {
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
        arg10.field1304 = arg4;
        return arg5;
    }

    @ObfuscatedName("bc.aw(II[B[IIIIIIIILbc;II)I")
    public static int method1323(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
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
        arg11.field1304 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bc.ak([B[IIIIIIIILbc;)I")
    public static int method1324(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class68 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1295 += (var14 - arg3) * arg9.field1300;
        arg9.field1292 += (var14 - arg3) * arg9.field1290;
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
        arg9.field1294 = var12 >> 2;
        arg9.field1304 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bc.as(I[B[IIIIIIIIIILbc;)I")
    public static int method1345(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class68 arg12) {
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
        arg12.field1294 += (var19 - arg4) * arg12.field1302;
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
        arg12.field1295 = var15 >> 2;
        arg12.field1292 = var16 >> 2;
        arg12.field1304 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bc.aq([B[IIIIIIIILbc;)I")
    public static int method1326(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class68 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1295 += (var14 - arg3) * arg9.field1300;
        arg9.field1292 += (var14 - arg3) * arg9.field1290;
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
        arg9.field1294 = var12 >> 2;
        arg9.field1304 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bc.af(I[B[IIIIIIIIIILbc;)I")
    public static int method1413(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class68 arg12) {
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
        arg12.field1294 += (var19 - arg4) * arg12.field1302;
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
        arg12.field1295 = var15 >> 2;
        arg12.field1292 = var16 >> 2;
        arg12.field1304 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bc.bp(II[B[IIIIIIIILbc;II)I")
    public static int method1317(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
        arg11.field1295 -= arg11.field1300 * arg5;
        arg11.field1292 -= arg11.field1290 * arg5;
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
        arg11.field1295 += arg11.field1300 * arg5;
        arg11.field1292 += arg11.field1290 * arg5;
        arg11.field1294 = arg6;
        arg11.field1304 = arg4;
        return arg5;
    }

    @ObfuscatedName("bc.bh(II[B[IIIIIIIIIILbc;II)I")
    public static int method1328(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class68 arg13, int arg14, int arg15) {
        arg13.field1294 -= arg13.field1302 * arg5;
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
        arg13.field1294 += arg13.field1302 * var27;
        arg13.field1295 = arg6;
        arg13.field1292 = arg7;
        arg13.field1304 = arg4;
        return var27;
    }

    @ObfuscatedName("bc.bo(II[B[IIIIIIIILbc;II)I")
    public static int method1329(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
        arg11.field1295 -= arg11.field1300 * arg5;
        arg11.field1292 -= arg11.field1290 * arg5;
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
        arg11.field1295 += arg11.field1300 * arg5;
        arg11.field1292 += arg11.field1290 * arg5;
        arg11.field1294 = arg6;
        arg11.field1304 = arg4;
        return arg5;
    }

    @ObfuscatedName("bc.bg(II[B[IIIIIIIIIILbc;II)I")
    public static int method1330(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class68 arg13, int arg14, int arg15) {
        arg13.field1294 -= arg13.field1302 * arg5;
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
        arg13.field1294 += arg13.field1302 * var26;
        arg13.field1295 = arg6;
        arg13.field1292 = arg7;
        arg13.field1304 = arg4;
        return var26;
    }
}
