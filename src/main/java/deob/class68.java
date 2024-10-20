package deob;

@ObfuscatedName("bo")
public class class68 extends class70 {

    @ObfuscatedName("bo.x")
    public int field1299;

    @ObfuscatedName("bo.r")
    public int field1293;

    @ObfuscatedName("bo.j")
    public int field1294;

    @ObfuscatedName("bo.z")
    public int field1295;

    @ObfuscatedName("bo.i")
    public int field1296;

    @ObfuscatedName("bo.b")
    public int field1303;

    @ObfuscatedName("bo.l")
    public int field1298;

    @ObfuscatedName("bo.m")
    public int field1305;

    @ObfuscatedName("bo.p")
    public int field1300;

    @ObfuscatedName("bo.f")
    public int field1301;

    @ObfuscatedName("bo.d")
    public boolean field1302;

    @ObfuscatedName("bo.v")
    public int field1292;

    @ObfuscatedName("bo.q")
    public int field1304;

    @ObfuscatedName("bo.t")
    public int field1297;

    @ObfuscatedName("bo.g")
    public int field1306;

    @ObfuscatedName("bo.x(II)I")
    public static int method1352(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bo.r(II)I")
    public static int method1309(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bo.af()I")
    public int method1411() {
        int var1 = this.field1296 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1305 == 0) {
            var2 -= this.field1299 * var2 / (((class66) this.field1310).field1276.length << 8);
        } else if (this.field1305 >= 0) {
            var2 -= this.field1300 * var2 / ((class66) this.field1310).field1276.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class68(class66 arg0, int arg1, int arg2) {
        this.field1310 = arg0;
        this.field1300 = arg0.field1277;
        this.field1301 = arg0.field1279;
        this.field1302 = arg0.field1275;
        this.field1293 = arg1;
        this.field1294 = arg2;
        this.field1295 = 8192;
        this.field1299 = 0;
        this.method1310();
    }

    public class68(class66 arg0, int arg1, int arg2, int arg3) {
        this.field1310 = arg0;
        this.field1300 = arg0.field1277;
        this.field1301 = arg0.field1279;
        this.field1302 = arg0.field1275;
        this.field1293 = arg1;
        this.field1294 = arg2;
        this.field1295 = arg3;
        this.field1299 = 0;
        this.method1310();
    }

    @ObfuscatedName("bo.j(Lbn;II)Lbo;")
    public static class68 method1311(class66 arg0, int arg1, int arg2) {
        return arg0.field1276 == null || arg0.field1276.length == 0 ? null : new class68(arg0, (int) ((long) arg0.field1278 * 256L * (long) arg1 / (long) (Statics.field1229 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bo.z(Lbn;III)Lbo;")
    public static class68 method1312(class66 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1276 == null || arg0.field1276.length == 0 ? null : new class68(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bo.i()V")
    public void method1310() {
        this.field1296 = this.field1294;
        this.field1303 = method1352(this.field1294, this.field1295);
        this.field1298 = method1309(this.field1294, this.field1295);
    }

    @ObfuscatedName("bo.f(I)V")
    public synchronized void method1314(int arg0) {
        this.field1305 = arg0;
    }

    @ObfuscatedName("bo.v(I)V")
    public synchronized void method1315(int arg0) {
        this.method1344(arg0 << 6, this.method1425());
    }

    @ObfuscatedName("bo.q(I)V")
    public synchronized void method1318(int arg0) {
        this.method1344(arg0, this.method1425());
    }

    @ObfuscatedName("bo.t(II)V")
    public synchronized void method1344(int arg0, int arg1) {
        this.field1294 = arg0;
        this.field1295 = arg1;
        this.field1292 = 0;
        this.method1310();
    }

    @ObfuscatedName("bo.g()I")
    public synchronized int method1336() {
        return this.field1294 == Integer.MIN_VALUE ? 0 : this.field1294;
    }

    @ObfuscatedName("bo.s()I")
    public synchronized int method1425() {
        return this.field1295 < 0 ? -1 : this.field1295;
    }

    @ObfuscatedName("bo.h(I)V")
    public synchronized void method1349(int arg0) {
        int var2 = ((class66) this.field1310).field1276.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1299 = arg0;
    }

    @ObfuscatedName("bo.u(Z)V")
    public synchronized void method1320(boolean arg0) {
        this.field1293 = (this.field1293 >>> 31) + (this.field1293 ^ this.field1293 >> 31);
        if (arg0) {
            this.field1293 = -this.field1293;
        }
    }

    @ObfuscatedName("bo.a()V")
    public void method1419() {
        if (this.field1292 == 0) {
            return;
        }
        if (this.field1294 == Integer.MIN_VALUE) {
            this.field1294 = 0;
        }
        this.field1292 = 0;
        this.method1310();
    }

    @ObfuscatedName("bo.e(II)V")
    public synchronized void method1322(int arg0, int arg1) {
        this.method1323(arg0, arg1, this.method1425());
    }

    @ObfuscatedName("bo.c(III)V")
    public synchronized void method1323(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1344(arg1, arg2);
            return;
        }
        int var4 = method1352(arg1, arg2);
        int var5 = method1309(arg1, arg2);
        if (this.field1303 == var4 && this.field1298 == var5) {
            this.field1292 = 0;
            return;
        }
        int var6 = arg1 - this.field1296;
        if (this.field1296 - arg1 > var6) {
            var6 = this.field1296 - arg1;
        }
        if (var4 - this.field1303 > var6) {
            var6 = var4 - this.field1303;
        }
        if (this.field1303 - var4 > var6) {
            var6 = this.field1303 - var4;
        }
        if (var5 - this.field1298 > var6) {
            var6 = var5 - this.field1298;
        }
        if (this.field1298 - var5 > var6) {
            var6 = this.field1298 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1292 = arg0;
        this.field1294 = arg1;
        this.field1295 = arg2;
        this.field1304 = (arg1 - this.field1296) / arg0;
        this.field1297 = (var4 - this.field1303) / arg0;
        this.field1306 = (var5 - this.field1298) / arg0;
    }

    @ObfuscatedName("bo.aq(I)V")
    public synchronized void method1324(int arg0) {
        if (arg0 == 0) {
            this.method1318(0);
            this.method3695();
        } else if (this.field1303 == 0 && this.field1298 == 0) {
            this.field1292 = 0;
            this.field1294 = 0;
            this.field1296 = 0;
            this.method3695();
        } else {
            int var2 = -this.field1296;
            if (this.field1296 > var2) {
                var2 = this.field1296;
            }
            if (-this.field1303 > var2) {
                var2 = -this.field1303;
            }
            if (this.field1303 > var2) {
                var2 = this.field1303;
            }
            if (-this.field1298 > var2) {
                var2 = -this.field1298;
            }
            if (this.field1298 > var2) {
                var2 = this.field1298;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1292 = arg0;
            this.field1294 = Integer.MIN_VALUE;
            this.field1304 = -this.field1296 / arg0;
            this.field1297 = -this.field1303 / arg0;
            this.field1306 = -this.field1298 / arg0;
        }
    }

    @ObfuscatedName("bo.ax(I)V")
    public synchronized void method1325(int arg0) {
        if (this.field1293 < 0) {
            this.field1293 = -arg0;
        } else {
            this.field1293 = arg0;
        }
    }

    @ObfuscatedName("bo.az()I")
    public synchronized int method1354() {
        return this.field1293 < 0 ? -this.field1293 : this.field1293;
    }

    @ObfuscatedName("bo.au()Z")
    public boolean method1327() {
        return this.field1299 < 0 || this.field1299 >= ((class66) this.field1310).field1276.length << 8;
    }

    @ObfuscatedName("bo.ab()Z")
    public boolean method1328() {
        return this.field1292 != 0;
    }

    @ObfuscatedName("bo.b()Lbd;")
    public class70 method1153() {
        return null;
    }

    @ObfuscatedName("bo.l()Lbd;")
    public class70 method1155() {
        return null;
    }

    @ObfuscatedName("bo.m()I")
    public int method1147() {
        return this.field1294 == 0 && this.field1292 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bo.p([III)V")
    public synchronized void method1179(int[] arg0, int arg1, int arg2) {
        if (this.field1294 == 0 && this.field1292 == 0) {
            this.method1158(arg2);
            return;
        }
        class66 var4 = (class66) this.field1310;
        int var5 = this.field1300 << 8;
        int var6 = this.field1301 << 8;
        int var7 = var4.field1276.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1305 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1299 < 0) {
            if (this.field1293 <= 0) {
                this.method1419();
                this.method3695();
                return;
            }
            this.field1299 = 0;
        }
        if (this.field1299 >= var7) {
            if (this.field1293 >= 0) {
                this.method1419();
                this.method3695();
                return;
            }
            this.field1299 = var7 - 1;
        }
        if (this.field1305 >= 0) {
            if (this.field1305 > 0) {
                if (this.field1302) {
                    label131: {
                        if (this.field1293 < 0) {
                            var9 = this.method1393(arg0, arg1, var5, var10, var4.field1276[this.field1300]);
                            if (this.field1299 >= var5) {
                                return;
                            }
                            this.field1299 = var5 + var5 - 1 - this.field1299;
                            this.field1293 = -this.field1293;
                            if (--this.field1305 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1331(arg0, var9, var6, var10, var4.field1276[this.field1301 - 1]);
                            if (this.field1299 < var6) {
                                return;
                            }
                            this.field1299 = var6 + var6 - 1 - this.field1299;
                            this.field1293 = -this.field1293;
                            if (--this.field1305 == 0) {
                                break;
                            }
                            var9 = this.method1393(arg0, var9, var5, var10, var4.field1276[this.field1300]);
                            if (this.field1299 >= var5) {
                                return;
                            }
                            this.field1299 = var5 + var5 - 1 - this.field1299;
                            this.field1293 = -this.field1293;
                        } while (--this.field1305 != 0);
                    }
                } else if (this.field1293 < 0) {
                    while (true) {
                        var9 = this.method1393(arg0, var9, var5, var10, var4.field1276[this.field1301 - 1]);
                        if (this.field1299 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1299) / var8;
                        if (var12 >= this.field1305) {
                            this.field1299 += this.field1305 * var8;
                            this.field1305 = 0;
                            break;
                        }
                        this.field1299 += var8 * var12;
                        this.field1305 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1331(arg0, var9, var6, var10, var4.field1276[this.field1300]);
                        if (this.field1299 < var6) {
                            return;
                        }
                        int var13 = (this.field1299 - var5) / var8;
                        if (var13 >= this.field1305) {
                            this.field1299 -= this.field1305 * var8;
                            this.field1305 = 0;
                            break;
                        }
                        this.field1299 -= var8 * var13;
                        this.field1305 -= var13;
                    }
                }
            }
            if (this.field1293 < 0) {
                this.method1393(arg0, var9, 0, var10, 0);
                if (this.field1299 < 0) {
                    this.field1299 = -1;
                    this.method1419();
                    this.method3695();
                }
            } else {
                this.method1331(arg0, var9, var7, var10, 0);
                if (this.field1299 >= var7) {
                    this.field1299 = var7;
                    this.method1419();
                    this.method3695();
                }
            }
        } else if (this.field1302) {
            if (this.field1293 < 0) {
                var9 = this.method1393(arg0, arg1, var5, var10, var4.field1276[this.field1300]);
                if (this.field1299 >= var5) {
                    return;
                }
                this.field1299 = var5 + var5 - 1 - this.field1299;
                this.field1293 = -this.field1293;
            }
            while (true) {
                int var11 = this.method1331(arg0, var9, var6, var10, var4.field1276[this.field1301 - 1]);
                if (this.field1299 < var6) {
                    return;
                }
                this.field1299 = var6 + var6 - 1 - this.field1299;
                this.field1293 = -this.field1293;
                var9 = this.method1393(arg0, var11, var5, var10, var4.field1276[this.field1300]);
                if (this.field1299 >= var5) {
                    return;
                }
                this.field1299 = var5 + var5 - 1 - this.field1299;
                this.field1293 = -this.field1293;
            }
        } else if (this.field1293 < 0) {
            while (true) {
                var9 = this.method1393(arg0, var9, var5, var10, var4.field1276[this.field1301 - 1]);
                if (this.field1299 >= var5) {
                    return;
                }
                this.field1299 = var6 - 1 - (var6 - 1 - this.field1299) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1331(arg0, var9, var6, var10, var4.field1276[this.field1300]);
                if (this.field1299 < var6) {
                    return;
                }
                this.field1299 = (this.field1299 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bo.d(I)V")
    public synchronized void method1158(int arg0) {
        if (this.field1292 > 0) {
            if (arg0 >= this.field1292) {
                if (this.field1294 == Integer.MIN_VALUE) {
                    this.field1294 = 0;
                    this.field1298 = 0;
                    this.field1303 = 0;
                    this.field1296 = 0;
                    this.method3695();
                    arg0 = this.field1292;
                }
                this.field1292 = 0;
                this.method1310();
            } else {
                this.field1296 += this.field1304 * arg0;
                this.field1303 += this.field1297 * arg0;
                this.field1298 += this.field1306 * arg0;
                this.field1292 -= arg0;
            }
        }
        class66 var2 = (class66) this.field1310;
        int var3 = this.field1300 << 8;
        int var4 = this.field1301 << 8;
        int var5 = var2.field1276.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1305 = 0;
        }
        if (this.field1299 < 0) {
            if (this.field1293 <= 0) {
                this.method1419();
                this.method3695();
                return;
            }
            this.field1299 = 0;
        }
        if (this.field1299 >= var5) {
            if (this.field1293 >= 0) {
                this.method1419();
                this.method3695();
                return;
            }
            this.field1299 = var5 - 1;
        }
        this.field1299 += this.field1293 * arg0;
        if (this.field1305 >= 0) {
            if (this.field1305 > 0) {
                if (this.field1302) {
                    label121: {
                        if (this.field1293 < 0) {
                            if (this.field1299 >= var3) {
                                return;
                            }
                            this.field1299 = var3 + var3 - 1 - this.field1299;
                            this.field1293 = -this.field1293;
                            if (--this.field1305 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1299 < var4) {
                                return;
                            }
                            this.field1299 = var4 + var4 - 1 - this.field1299;
                            this.field1293 = -this.field1293;
                            if (--this.field1305 == 0) {
                                break;
                            }
                            if (this.field1299 >= var3) {
                                return;
                            }
                            this.field1299 = var3 + var3 - 1 - this.field1299;
                            this.field1293 = -this.field1293;
                        } while (--this.field1305 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1293 < 0) {
                            if (this.field1299 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1299) / var6;
                            if (var7 >= this.field1305) {
                                this.field1299 += this.field1305 * var6;
                                this.field1305 = 0;
                                break label153;
                            }
                            this.field1299 += var6 * var7;
                            this.field1305 -= var7;
                        } else if (this.field1299 >= var4) {
                            int var8 = (this.field1299 - var3) / var6;
                            if (var8 >= this.field1305) {
                                this.field1299 -= this.field1305 * var6;
                                this.field1305 = 0;
                                break label153;
                            }
                            this.field1299 -= var6 * var8;
                            this.field1305 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1293 < 0) {
                if (this.field1299 < 0) {
                    this.field1299 = -1;
                    this.method1419();
                    this.method3695();
                }
            } else if (this.field1299 >= var5) {
                this.field1299 = var5;
                this.method1419();
                this.method3695();
            }
        } else if (this.field1302) {
            if (this.field1293 < 0) {
                if (this.field1299 >= var3) {
                    return;
                }
                this.field1299 = var3 + var3 - 1 - this.field1299;
                this.field1293 = -this.field1293;
            }
            while (this.field1299 >= var4) {
                this.field1299 = var4 + var4 - 1 - this.field1299;
                this.field1293 = -this.field1293;
                if (this.field1299 >= var3) {
                    return;
                }
                this.field1299 = var3 + var3 - 1 - this.field1299;
                this.field1293 = -this.field1293;
            }
        } else if (this.field1293 < 0) {
            if (this.field1299 >= var3) {
                return;
            }
            this.field1299 = var4 - 1 - (var4 - 1 - this.field1299) % var6;
        } else if (this.field1299 >= var4) {
            this.field1299 = (this.field1299 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bo.at([IIIII)I")
    public int method1331(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1292 > 0) {
                int var6 = this.field1292 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1292 += arg1;
                if (this.field1293 == 256 && (this.field1299 & 0xFF) == 0) {
                    if (Statics.field1230) {
                        arg1 = method1383(0, ((class66) this.field1310).field1276, arg0, this.field1299, arg1, this.field1303, this.field1298, this.field1297, this.field1306, 0, var6, arg2, this);
                    } else {
                        arg1 = method1394(((class66) this.field1310).field1276, arg0, this.field1299, arg1, this.field1296, this.field1304, 0, var6, arg2, this);
                    }
                } else if (Statics.field1230) {
                    arg1 = method1405(0, 0, ((class66) this.field1310).field1276, arg0, this.field1299, arg1, this.field1303, this.field1298, this.field1297, this.field1306, 0, var6, arg2, this, this.field1293, arg4);
                } else {
                    arg1 = method1380(0, 0, ((class66) this.field1310).field1276, arg0, this.field1299, arg1, this.field1296, this.field1304, 0, var6, arg2, this, this.field1293, arg4);
                }
                this.field1292 -= arg1;
                if (this.field1292 != 0) {
                    return arg1;
                }
                if (!this.method1333()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1293 == 256 && (this.field1299 & 0xFF) == 0) {
                if (Statics.field1230) {
                    return method1335(0, ((class66) this.field1310).field1276, arg0, this.field1299, arg1, this.field1303, this.field1298, 0, arg3, arg2, this);
                }
                return method1334(((class66) this.field1310).field1276, arg0, this.field1299, arg1, this.field1296, 0, arg3, arg2, this);
            }
            if (Statics.field1230) {
                return method1339(0, 0, ((class66) this.field1310).field1276, arg0, this.field1299, arg1, this.field1303, this.field1298, 0, arg3, arg2, this, this.field1293, arg4);
            }
            return method1338(0, 0, ((class66) this.field1310).field1276, arg0, this.field1299, arg1, this.field1296, 0, arg3, arg2, this, this.field1293, arg4);
        }
    }

    @ObfuscatedName("bo.ay([IIIII)I")
    public int method1393(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1292 > 0) {
                int var6 = this.field1292 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1292 += arg1;
                if (this.field1293 == -256 && (this.field1299 & 0xFF) == 0) {
                    if (Statics.field1230) {
                        arg1 = method1365(0, ((class66) this.field1310).field1276, arg0, this.field1299, arg1, this.field1303, this.field1298, this.field1297, this.field1306, 0, var6, arg2, this);
                    } else {
                        arg1 = method1343(((class66) this.field1310).field1276, arg0, this.field1299, arg1, this.field1296, this.field1304, 0, var6, arg2, this);
                    }
                } else if (Statics.field1230) {
                    arg1 = method1347(0, 0, ((class66) this.field1310).field1276, arg0, this.field1299, arg1, this.field1303, this.field1298, this.field1297, this.field1306, 0, var6, arg2, this, this.field1293, arg4);
                } else {
                    arg1 = method1420(0, 0, ((class66) this.field1310).field1276, arg0, this.field1299, arg1, this.field1296, this.field1304, 0, var6, arg2, this, this.field1293, arg4);
                }
                this.field1292 -= arg1;
                if (this.field1292 != 0) {
                    return arg1;
                }
                if (!this.method1333()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1293 == -256 && (this.field1299 & 0xFF) == 0) {
                if (Statics.field1230) {
                    return method1337(0, ((class66) this.field1310).field1276, arg0, this.field1299, arg1, this.field1303, this.field1298, 0, arg3, arg2, this);
                }
                return method1326(((class66) this.field1310).field1276, arg0, this.field1299, arg1, this.field1296, 0, arg3, arg2, this);
            }
            if (Statics.field1230) {
                return method1341(0, 0, ((class66) this.field1310).field1276, arg0, this.field1299, arg1, this.field1303, this.field1298, 0, arg3, arg2, this, this.field1293, arg4);
            }
            return method1332(0, 0, ((class66) this.field1310).field1276, arg0, this.field1299, arg1, this.field1296, 0, arg3, arg2, this, this.field1293, arg4);
        }
    }

    @ObfuscatedName("bo.ad()Z")
    public boolean method1333() {
        int var1 = this.field1294;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1352(var1, this.field1295);
            var2 = method1309(var1, this.field1295);
        }
        if (this.field1296 != var1 || this.field1303 != var3 || this.field1298 != var2) {
            if (this.field1296 < var1) {
                this.field1304 = 1;
                this.field1292 = var1 - this.field1296;
            } else if (this.field1296 > var1) {
                this.field1304 = -1;
                this.field1292 = this.field1296 - var1;
            } else {
                this.field1304 = 0;
            }
            if (this.field1303 < var3) {
                this.field1297 = 1;
                if (this.field1292 == 0 || this.field1292 > var3 - this.field1303) {
                    this.field1292 = var3 - this.field1303;
                }
            } else if (this.field1303 > var3) {
                this.field1297 = -1;
                if (this.field1292 == 0 || this.field1292 > this.field1303 - var3) {
                    this.field1292 = this.field1303 - var3;
                }
            } else {
                this.field1297 = 0;
            }
            if (this.field1298 < var2) {
                this.field1306 = 1;
                if (this.field1292 == 0 || this.field1292 > var2 - this.field1298) {
                    this.field1292 = var2 - this.field1298;
                }
            } else if (this.field1298 > var2) {
                this.field1306 = -1;
                if (this.field1292 == 0 || this.field1292 > this.field1298 - var2) {
                    this.field1292 = this.field1298 - var2;
                }
            } else {
                this.field1306 = 0;
            }
            return false;
        } else if (this.field1294 == Integer.MIN_VALUE) {
            this.field1294 = 0;
            this.field1298 = 0;
            this.field1303 = 0;
            this.field1296 = 0;
            this.method3695();
            return true;
        } else {
            this.method1310();
            return false;
        }
    }

    @ObfuscatedName("bo.am([B[IIIIIIILbo;)I")
    public static int method1334(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class68 arg8) {
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
        arg8.field1299 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bo.ac(I[B[IIIIIIIILbo;)I")
    public static int method1335(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10) {
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
        arg10.field1299 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bo.aw([B[IIIIIIILbo;)I")
    public static int method1326(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class68 arg8) {
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
        arg8.field1299 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bo.ak(I[B[IIIIIIIILbo;)I")
    public static int method1337(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10) {
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
        arg10.field1299 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bo.ar(II[B[IIIIIIILbo;II)I")
    public static int method1338(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10, int arg11, int arg12) {
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
        arg10.field1299 = arg4;
        return arg5;
    }

    @ObfuscatedName("bo.aa(II[B[IIIIIIIILbo;II)I")
    public static int method1339(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
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
        arg11.field1299 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bo.av(II[B[IIIIIIILbo;II)I")
    public static int method1332(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class68 arg10, int arg11, int arg12) {
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
        arg10.field1299 = arg4;
        return arg5;
    }

    @ObfuscatedName("bo.aj(II[B[IIIIIIIILbo;II)I")
    public static int method1341(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
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
        arg11.field1299 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bo.al([B[IIIIIIIILbo;)I")
    public static int method1394(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class68 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1303 += (var14 - arg3) * arg9.field1297;
        arg9.field1298 += (var14 - arg3) * arg9.field1306;
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
        arg9.field1296 = var12 >> 2;
        arg9.field1299 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bo.ai(I[B[IIIIIIIIIILbo;)I")
    public static int method1383(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class68 arg12) {
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
        arg12.field1296 += (var19 - arg4) * arg12.field1304;
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
        arg12.field1303 = var15 >> 2;
        arg12.field1298 = var16 >> 2;
        arg12.field1299 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bo.ae([B[IIIIIIIILbo;)I")
    public static int method1343(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class68 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1303 += (var14 - arg3) * arg9.field1297;
        arg9.field1298 += (var14 - arg3) * arg9.field1306;
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
        arg9.field1296 = var12 >> 2;
        arg9.field1299 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bo.bf(I[B[IIIIIIIIIILbo;)I")
    public static int method1365(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class68 arg12) {
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
        arg12.field1296 += (var19 - arg4) * arg12.field1304;
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
        arg12.field1303 = var15 >> 2;
        arg12.field1298 = var16 >> 2;
        arg12.field1299 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bo.bx(II[B[IIIIIIIILbo;II)I")
    public static int method1380(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
        arg11.field1303 -= arg11.field1297 * arg5;
        arg11.field1298 -= arg11.field1306 * arg5;
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
        arg11.field1303 += arg11.field1297 * arg5;
        arg11.field1298 += arg11.field1306 * arg5;
        arg11.field1296 = arg6;
        arg11.field1299 = arg4;
        return arg5;
    }

    @ObfuscatedName("bo.bh(II[B[IIIIIIIIIILbo;II)I")
    public static int method1405(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class68 arg13, int arg14, int arg15) {
        arg13.field1296 -= arg13.field1304 * arg5;
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
        arg13.field1296 += arg13.field1304 * var27;
        arg13.field1303 = arg6;
        arg13.field1298 = arg7;
        arg13.field1299 = arg4;
        return var27;
    }

    @ObfuscatedName("bo.bw(II[B[IIIIIIIILbo;II)I")
    public static int method1420(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class68 arg11, int arg12, int arg13) {
        arg11.field1303 -= arg11.field1297 * arg5;
        arg11.field1298 -= arg11.field1306 * arg5;
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
        arg11.field1303 += arg11.field1297 * arg5;
        arg11.field1298 += arg11.field1306 * arg5;
        arg11.field1296 = arg6;
        arg11.field1299 = arg4;
        return arg5;
    }

    @ObfuscatedName("bo.bg(II[B[IIIIIIIIIILbo;II)I")
    public static int method1347(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class68 arg13, int arg14, int arg15) {
        arg13.field1296 -= arg13.field1304 * arg5;
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
        arg13.field1296 += arg13.field1304 * var26;
        arg13.field1303 = arg6;
        arg13.field1298 = arg7;
        arg13.field1299 = arg4;
        return var26;
    }
}
