package deob;

@ObfuscatedName("bu")
public class class65 extends class67 {

    @ObfuscatedName("bu.h")
    public int field1270;

    @ObfuscatedName("bu.m")
    public int field1259;

    @ObfuscatedName("bu.i")
    public int field1260;

    @ObfuscatedName("bu.q")
    public int field1261;

    @ObfuscatedName("bu.p")
    public int field1262;

    @ObfuscatedName("bu.c")
    public int field1263;

    @ObfuscatedName("bu.f")
    public int field1265;

    @ObfuscatedName("bu.y")
    public int field1264;

    @ObfuscatedName("bu.l")
    public int field1266;

    @ObfuscatedName("bu.v")
    public int field1258;

    @ObfuscatedName("bu.k")
    public boolean field1268;

    @ObfuscatedName("bu.o")
    public int field1269;

    @ObfuscatedName("bu.u")
    public int field1267;

    @ObfuscatedName("bu.s")
    public int field1271;

    @ObfuscatedName("bu.g")
    public int field1272;

    @ObfuscatedName("bu.h(II)I")
    public static int method1292(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bu.m(II)I")
    public static int method1257(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bu.aw()I")
    public int method1254() {
        int var1 = this.field1262 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1264 == 0) {
            var2 -= this.field1270 * var2 / (((class63) this.field1276).field1241.length << 8);
        } else if (this.field1264 >= 0) {
            var2 -= this.field1266 * var2 / ((class63) this.field1276).field1241.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class65(class63 arg0, int arg1, int arg2) {
        this.field1276 = arg0;
        this.field1266 = arg0.field1244;
        this.field1258 = arg0.field1242;
        this.field1268 = arg0.field1245;
        this.field1259 = arg1;
        this.field1260 = arg2;
        this.field1261 = 8192;
        this.field1270 = 0;
        this.method1298();
    }

    public class65(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1276 = arg0;
        this.field1266 = arg0.field1244;
        this.field1258 = arg0.field1242;
        this.field1268 = arg0.field1245;
        this.field1259 = arg1;
        this.field1260 = arg2;
        this.field1261 = arg3;
        this.field1270 = 0;
        this.method1298();
    }

    @ObfuscatedName("bu.i(Lby;II)Lbu;")
    public static class65 method1256(class63 arg0, int arg1, int arg2) {
        return arg0.field1241 == null || arg0.field1241.length == 0 ? null : new class65(arg0, (int) ((long) arg0.field1243 * 256L * (long) arg1 / (long) (Statics.field1199 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bu.q(Lby;III)Lbu;")
    public static class65 method1301(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1241 == null || arg0.field1241.length == 0 ? null : new class65(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bu.p()V")
    public void method1298() {
        this.field1262 = this.field1260;
        this.field1263 = method1292(this.field1260, this.field1261);
        this.field1265 = method1257(this.field1260, this.field1261);
    }

    @ObfuscatedName("bu.l(I)V")
    public synchronized void method1294(int arg0) {
        this.field1264 = arg0;
    }

    @ObfuscatedName("bu.k(I)V")
    public synchronized void method1259(int arg0) {
        this.method1261(arg0 << 6, this.method1262());
    }

    @ObfuscatedName("bu.o(I)V")
    public synchronized void method1366(int arg0) {
        this.method1261(arg0, this.method1262());
    }

    @ObfuscatedName("bu.u(II)V")
    public synchronized void method1261(int arg0, int arg1) {
        this.field1260 = arg0;
        this.field1261 = arg1;
        this.field1269 = 0;
        this.method1298();
    }

    @ObfuscatedName("bu.s()I")
    public synchronized int method1293() {
        return this.field1260 == Integer.MIN_VALUE ? 0 : this.field1260;
    }

    @ObfuscatedName("bu.g()I")
    public synchronized int method1262() {
        return this.field1261 < 0 ? -1 : this.field1261;
    }

    @ObfuscatedName("bu.x(I)V")
    public synchronized void method1263(int arg0) {
        int var2 = ((class63) this.field1276).field1241.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1270 = arg0;
    }

    @ObfuscatedName("bu.a(Z)V")
    public synchronized void method1368(boolean arg0) {
        this.field1259 = (this.field1259 >>> 31) + (this.field1259 ^ this.field1259 >> 31);
        if (arg0) {
            this.field1259 = -this.field1259;
        }
    }

    @ObfuscatedName("bu.t()V")
    public void method1265() {
        if (this.field1269 == 0) {
            return;
        }
        if (this.field1260 == Integer.MIN_VALUE) {
            this.field1260 = 0;
        }
        this.field1269 = 0;
        this.method1298();
    }

    @ObfuscatedName("bu.z(II)V")
    public synchronized void method1266(int arg0, int arg1) {
        this.method1267(arg0, arg1, this.method1262());
    }

    @ObfuscatedName("bu.r(III)V")
    public synchronized void method1267(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1261(arg1, arg2);
            return;
        }
        int var4 = method1292(arg1, arg2);
        int var5 = method1257(arg1, arg2);
        if (this.field1263 == var4 && this.field1265 == var5) {
            this.field1269 = 0;
            return;
        }
        int var6 = arg1 - this.field1262;
        if (this.field1262 - arg1 > var6) {
            var6 = this.field1262 - arg1;
        }
        if (var4 - this.field1263 > var6) {
            var6 = var4 - this.field1263;
        }
        if (this.field1263 - var4 > var6) {
            var6 = this.field1263 - var4;
        }
        if (var5 - this.field1265 > var6) {
            var6 = var5 - this.field1265;
        }
        if (this.field1265 - var5 > var6) {
            var6 = this.field1265 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1269 = arg0;
        this.field1260 = arg1;
        this.field1261 = arg2;
        this.field1267 = (arg1 - this.field1262) / arg0;
        this.field1271 = (var4 - this.field1263) / arg0;
        this.field1272 = (var5 - this.field1265) / arg0;
    }

    @ObfuscatedName("bu.d(I)V")
    public synchronized void method1307(int arg0) {
        if (arg0 == 0) {
            this.method1366(0);
            this.method3625();
        } else if (this.field1263 == 0 && this.field1265 == 0) {
            this.field1269 = 0;
            this.field1260 = 0;
            this.field1262 = 0;
            this.method3625();
        } else {
            int var2 = -this.field1262;
            if (this.field1262 > var2) {
                var2 = this.field1262;
            }
            if (-this.field1263 > var2) {
                var2 = -this.field1263;
            }
            if (this.field1263 > var2) {
                var2 = this.field1263;
            }
            if (-this.field1265 > var2) {
                var2 = -this.field1265;
            }
            if (this.field1265 > var2) {
                var2 = this.field1265;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1269 = arg0;
            this.field1260 = Integer.MIN_VALUE;
            this.field1267 = -this.field1262 / arg0;
            this.field1271 = -this.field1263 / arg0;
            this.field1272 = -this.field1265 / arg0;
        }
    }

    @ObfuscatedName("bu.n(I)V")
    public synchronized void method1269(int arg0) {
        if (this.field1259 < 0) {
            this.field1259 = -arg0;
        } else {
            this.field1259 = arg0;
        }
    }

    @ObfuscatedName("bu.j()I")
    public synchronized int method1270() {
        return this.field1259 < 0 ? -this.field1259 : this.field1259;
    }

    @ObfuscatedName("bu.b()Z")
    public boolean method1314() {
        return this.field1270 < 0 || this.field1270 >= ((class63) this.field1276).field1241.length << 8;
    }

    @ObfuscatedName("bu.e()Z")
    public boolean method1272() {
        return this.field1269 != 0;
    }

    @ObfuscatedName("bu.c()Lbc;")
    public class67 method1108() {
        return null;
    }

    @ObfuscatedName("bu.f()Lbc;")
    public class67 method1097() {
        return null;
    }

    @ObfuscatedName("bu.y()I")
    public int method1098() {
        return this.field1260 == 0 && this.field1269 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bu.w([III)V")
    public synchronized void method1109(int[] arg0, int arg1, int arg2) {
        if (this.field1260 == 0 && this.field1269 == 0) {
            this.method1101(arg2);
            return;
        }
        class63 var4 = (class63) this.field1276;
        int var5 = this.field1266 << 8;
        int var6 = this.field1258 << 8;
        int var7 = var4.field1241.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1264 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1270 < 0) {
            if (this.field1259 <= 0) {
                this.method1265();
                this.method3625();
                return;
            }
            this.field1270 = 0;
        }
        if (this.field1270 >= var7) {
            if (this.field1259 >= 0) {
                this.method1265();
                this.method3625();
                return;
            }
            this.field1270 = var7 - 1;
        }
        if (this.field1264 >= 0) {
            if (this.field1264 > 0) {
                if (this.field1268) {
                    label131: {
                        if (this.field1259 < 0) {
                            var9 = this.method1275(arg0, arg1, var5, var10, var4.field1241[this.field1266]);
                            if (this.field1270 >= var5) {
                                return;
                            }
                            this.field1270 = var5 + var5 - 1 - this.field1270;
                            this.field1259 = -this.field1259;
                            if (--this.field1264 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1331(arg0, var9, var6, var10, var4.field1241[this.field1258 - 1]);
                            if (this.field1270 < var6) {
                                return;
                            }
                            this.field1270 = var6 + var6 - 1 - this.field1270;
                            this.field1259 = -this.field1259;
                            if (--this.field1264 == 0) {
                                break;
                            }
                            var9 = this.method1275(arg0, var9, var5, var10, var4.field1241[this.field1266]);
                            if (this.field1270 >= var5) {
                                return;
                            }
                            this.field1270 = var5 + var5 - 1 - this.field1270;
                            this.field1259 = -this.field1259;
                        } while (--this.field1264 != 0);
                    }
                } else if (this.field1259 < 0) {
                    while (true) {
                        var9 = this.method1275(arg0, var9, var5, var10, var4.field1241[this.field1258 - 1]);
                        if (this.field1270 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1270) / var8;
                        if (var12 >= this.field1264) {
                            this.field1270 += this.field1264 * var8;
                            this.field1264 = 0;
                            break;
                        }
                        this.field1270 += var8 * var12;
                        this.field1264 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1331(arg0, var9, var6, var10, var4.field1241[this.field1266]);
                        if (this.field1270 < var6) {
                            return;
                        }
                        int var13 = (this.field1270 - var5) / var8;
                        if (var13 >= this.field1264) {
                            this.field1270 -= this.field1264 * var8;
                            this.field1264 = 0;
                            break;
                        }
                        this.field1270 -= var8 * var13;
                        this.field1264 -= var13;
                    }
                }
            }
            if (this.field1259 < 0) {
                this.method1275(arg0, var9, 0, var10, 0);
                if (this.field1270 < 0) {
                    this.field1270 = -1;
                    this.method1265();
                    this.method3625();
                }
            } else {
                this.method1331(arg0, var9, var7, var10, 0);
                if (this.field1270 >= var7) {
                    this.field1270 = var7;
                    this.method1265();
                    this.method3625();
                }
            }
        } else if (this.field1268) {
            if (this.field1259 < 0) {
                var9 = this.method1275(arg0, arg1, var5, var10, var4.field1241[this.field1266]);
                if (this.field1270 >= var5) {
                    return;
                }
                this.field1270 = var5 + var5 - 1 - this.field1270;
                this.field1259 = -this.field1259;
            }
            while (true) {
                int var11 = this.method1331(arg0, var9, var6, var10, var4.field1241[this.field1258 - 1]);
                if (this.field1270 < var6) {
                    return;
                }
                this.field1270 = var6 + var6 - 1 - this.field1270;
                this.field1259 = -this.field1259;
                var9 = this.method1275(arg0, var11, var5, var10, var4.field1241[this.field1266]);
                if (this.field1270 >= var5) {
                    return;
                }
                this.field1270 = var5 + var5 - 1 - this.field1270;
                this.field1259 = -this.field1259;
            }
        } else if (this.field1259 < 0) {
            while (true) {
                var9 = this.method1275(arg0, var9, var5, var10, var4.field1241[this.field1258 - 1]);
                if (this.field1270 >= var5) {
                    return;
                }
                this.field1270 = var6 - 1 - (var6 - 1 - this.field1270) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1331(arg0, var9, var6, var10, var4.field1241[this.field1266]);
                if (this.field1270 < var6) {
                    return;
                }
                this.field1270 = (this.field1270 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bu.v(I)V")
    public synchronized void method1101(int arg0) {
        if (this.field1269 > 0) {
            if (arg0 >= this.field1269) {
                if (this.field1260 == Integer.MIN_VALUE) {
                    this.field1260 = 0;
                    this.field1265 = 0;
                    this.field1263 = 0;
                    this.field1262 = 0;
                    this.method3625();
                    arg0 = this.field1269;
                }
                this.field1269 = 0;
                this.method1298();
            } else {
                this.field1262 += this.field1267 * arg0;
                this.field1263 += this.field1271 * arg0;
                this.field1265 += this.field1272 * arg0;
                this.field1269 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1276;
        int var3 = this.field1266 << 8;
        int var4 = this.field1258 << 8;
        int var5 = var2.field1241.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1264 = 0;
        }
        if (this.field1270 < 0) {
            if (this.field1259 <= 0) {
                this.method1265();
                this.method3625();
                return;
            }
            this.field1270 = 0;
        }
        if (this.field1270 >= var5) {
            if (this.field1259 >= 0) {
                this.method1265();
                this.method3625();
                return;
            }
            this.field1270 = var5 - 1;
        }
        this.field1270 += this.field1259 * arg0;
        if (this.field1264 >= 0) {
            if (this.field1264 > 0) {
                if (this.field1268) {
                    label121: {
                        if (this.field1259 < 0) {
                            if (this.field1270 >= var3) {
                                return;
                            }
                            this.field1270 = var3 + var3 - 1 - this.field1270;
                            this.field1259 = -this.field1259;
                            if (--this.field1264 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1270 < var4) {
                                return;
                            }
                            this.field1270 = var4 + var4 - 1 - this.field1270;
                            this.field1259 = -this.field1259;
                            if (--this.field1264 == 0) {
                                break;
                            }
                            if (this.field1270 >= var3) {
                                return;
                            }
                            this.field1270 = var3 + var3 - 1 - this.field1270;
                            this.field1259 = -this.field1259;
                        } while (--this.field1264 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1259 < 0) {
                            if (this.field1270 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1270) / var6;
                            if (var7 >= this.field1264) {
                                this.field1270 += this.field1264 * var6;
                                this.field1264 = 0;
                                break label153;
                            }
                            this.field1270 += var6 * var7;
                            this.field1264 -= var7;
                        } else if (this.field1270 >= var4) {
                            int var8 = (this.field1270 - var3) / var6;
                            if (var8 >= this.field1264) {
                                this.field1270 -= this.field1264 * var6;
                                this.field1264 = 0;
                                break label153;
                            }
                            this.field1270 -= var6 * var8;
                            this.field1264 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1259 < 0) {
                if (this.field1270 < 0) {
                    this.field1270 = -1;
                    this.method1265();
                    this.method3625();
                }
            } else if (this.field1270 >= var5) {
                this.field1270 = var5;
                this.method1265();
                this.method3625();
            }
        } else if (this.field1268) {
            if (this.field1259 < 0) {
                if (this.field1270 >= var3) {
                    return;
                }
                this.field1270 = var3 + var3 - 1 - this.field1270;
                this.field1259 = -this.field1259;
            }
            while (this.field1270 >= var4) {
                this.field1270 = var4 + var4 - 1 - this.field1270;
                this.field1259 = -this.field1259;
                if (this.field1270 >= var3) {
                    return;
                }
                this.field1270 = var3 + var3 - 1 - this.field1270;
                this.field1259 = -this.field1259;
            }
        } else if (this.field1259 < 0) {
            if (this.field1270 >= var3) {
                return;
            }
            this.field1270 = var4 - 1 - (var4 - 1 - this.field1270) % var6;
        } else if (this.field1270 >= var4) {
            this.field1270 = (this.field1270 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bu.aa([IIIII)I")
    public int method1331(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1269 > 0) {
                int var6 = this.field1269 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1269 += arg1;
                if (this.field1259 == 256 && (this.field1270 & 0xFF) == 0) {
                    if (Statics.field1185) {
                        arg1 = method1351(0, ((class63) this.field1276).field1241, arg0, this.field1270, arg1, this.field1263, this.field1265, this.field1271, this.field1272, 0, var6, arg2, this);
                    } else {
                        arg1 = method1271(((class63) this.field1276).field1241, arg0, this.field1270, arg1, this.field1262, this.field1267, 0, var6, arg2, this);
                    }
                } else if (Statics.field1185) {
                    arg1 = method1289(0, 0, ((class63) this.field1276).field1241, arg0, this.field1270, arg1, this.field1263, this.field1265, this.field1271, this.field1272, 0, var6, arg2, this, this.field1259, arg4);
                } else {
                    arg1 = method1288(0, 0, ((class63) this.field1276).field1241, arg0, this.field1270, arg1, this.field1262, this.field1267, 0, var6, arg2, this, this.field1259, arg4);
                }
                this.field1269 -= arg1;
                if (this.field1269 != 0) {
                    return arg1;
                }
                if (!this.method1276()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1259 == 256 && (this.field1270 & 0xFF) == 0) {
                if (Statics.field1185) {
                    return method1278(0, ((class63) this.field1276).field1241, arg0, this.field1270, arg1, this.field1263, this.field1265, 0, arg3, arg2, this);
                }
                return method1311(((class63) this.field1276).field1241, arg0, this.field1270, arg1, this.field1262, 0, arg3, arg2, this);
            }
            if (Statics.field1185) {
                return method1282(0, 0, ((class63) this.field1276).field1241, arg0, this.field1270, arg1, this.field1263, this.field1265, 0, arg3, arg2, this, this.field1259, arg4);
            }
            return method1264(0, 0, ((class63) this.field1276).field1241, arg0, this.field1270, arg1, this.field1262, 0, arg3, arg2, this, this.field1259, arg4);
        }
    }

    @ObfuscatedName("bu.aq([IIIII)I")
    public int method1275(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1269 > 0) {
                int var6 = this.field1269 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1269 += arg1;
                if (this.field1259 == -256 && (this.field1270 & 0xFF) == 0) {
                    if (Statics.field1185) {
                        arg1 = method1287(0, ((class63) this.field1276).field1241, arg0, this.field1270, arg1, this.field1263, this.field1265, this.field1271, this.field1272, 0, var6, arg2, this);
                    } else {
                        arg1 = method1286(((class63) this.field1276).field1241, arg0, this.field1270, arg1, this.field1262, this.field1267, 0, var6, arg2, this);
                    }
                } else if (Statics.field1185) {
                    arg1 = method1291(0, 0, ((class63) this.field1276).field1241, arg0, this.field1270, arg1, this.field1263, this.field1265, this.field1271, this.field1272, 0, var6, arg2, this, this.field1259, arg4);
                } else {
                    arg1 = method1290(0, 0, ((class63) this.field1276).field1241, arg0, this.field1270, arg1, this.field1262, this.field1267, 0, var6, arg2, this, this.field1259, arg4);
                }
                this.field1269 -= arg1;
                if (this.field1269 != 0) {
                    return arg1;
                }
                if (!this.method1276()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1259 == -256 && (this.field1270 & 0xFF) == 0) {
                if (Statics.field1185) {
                    return method1280(0, ((class63) this.field1276).field1241, arg0, this.field1270, arg1, this.field1263, this.field1265, 0, arg3, arg2, this);
                }
                return method1279(((class63) this.field1276).field1241, arg0, this.field1270, arg1, this.field1262, 0, arg3, arg2, this);
            }
            if (Statics.field1185) {
                return method1260(0, 0, ((class63) this.field1276).field1241, arg0, this.field1270, arg1, this.field1263, this.field1265, 0, arg3, arg2, this, this.field1259, arg4);
            }
            return method1283(0, 0, ((class63) this.field1276).field1241, arg0, this.field1270, arg1, this.field1262, 0, arg3, arg2, this, this.field1259, arg4);
        }
    }

    @ObfuscatedName("bu.ad()Z")
    public boolean method1276() {
        int var1 = this.field1260;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1292(var1, this.field1261);
            var2 = method1257(var1, this.field1261);
        }
        if (this.field1262 != var1 || this.field1263 != var3 || this.field1265 != var2) {
            if (this.field1262 < var1) {
                this.field1267 = 1;
                this.field1269 = var1 - this.field1262;
            } else if (this.field1262 > var1) {
                this.field1267 = -1;
                this.field1269 = this.field1262 - var1;
            } else {
                this.field1267 = 0;
            }
            if (this.field1263 < var3) {
                this.field1271 = 1;
                if (this.field1269 == 0 || this.field1269 > var3 - this.field1263) {
                    this.field1269 = var3 - this.field1263;
                }
            } else if (this.field1263 > var3) {
                this.field1271 = -1;
                if (this.field1269 == 0 || this.field1269 > this.field1263 - var3) {
                    this.field1269 = this.field1263 - var3;
                }
            } else {
                this.field1271 = 0;
            }
            if (this.field1265 < var2) {
                this.field1272 = 1;
                if (this.field1269 == 0 || this.field1269 > var2 - this.field1265) {
                    this.field1269 = var2 - this.field1265;
                }
            } else if (this.field1265 > var2) {
                this.field1272 = -1;
                if (this.field1269 == 0 || this.field1269 > this.field1265 - var2) {
                    this.field1269 = this.field1265 - var2;
                }
            } else {
                this.field1272 = 0;
            }
            return false;
        } else if (this.field1260 == Integer.MIN_VALUE) {
            this.field1260 = 0;
            this.field1265 = 0;
            this.field1263 = 0;
            this.field1262 = 0;
            this.method3625();
            return true;
        } else {
            this.method1298();
            return false;
        }
    }

    @ObfuscatedName("bu.ak([B[IIIIIIILbu;)I")
    public static int method1311(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1270 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bu.az(I[B[IIIIIIIILbu;)I")
    public static int method1278(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1270 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bu.ac([B[IIIIIIILbu;)I")
    public static int method1279(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1270 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bu.au(I[B[IIIIIIIILbu;)I")
    public static int method1280(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1270 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bu.ah(II[B[IIIIIIILbu;II)I")
    public static int method1264(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1270 = arg4;
        return arg5;
    }

    @ObfuscatedName("bu.an(II[B[IIIIIIIILbu;II)I")
    public static int method1282(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1270 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bu.bm(II[B[IIIIIIILbu;II)I")
    public static int method1283(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1270 = arg4;
        return arg5;
    }

    @ObfuscatedName("bu.bo(II[B[IIIIIIIILbu;II)I")
    public static int method1260(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1270 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bu.bl([B[IIIIIIIILbu;)I")
    public static int method1271(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1263 += (var14 - arg3) * arg9.field1271;
        arg9.field1265 += (var14 - arg3) * arg9.field1272;
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
        arg9.field1262 = var12 >> 2;
        arg9.field1270 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bu.ba(I[B[IIIIIIIIIILbu;)I")
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
        arg12.field1262 += (var19 - arg4) * arg12.field1267;
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
        arg12.field1263 = var15 >> 2;
        arg12.field1265 = var16 >> 2;
        arg12.field1270 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bu.bj([B[IIIIIIIILbu;)I")
    public static int method1286(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1263 += (var14 - arg3) * arg9.field1271;
        arg9.field1265 += (var14 - arg3) * arg9.field1272;
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
        arg9.field1262 = var12 >> 2;
        arg9.field1270 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bu.bx(I[B[IIIIIIIIIILbu;)I")
    public static int method1287(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1262 += (var19 - arg4) * arg12.field1267;
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
        arg12.field1263 = var15 >> 2;
        arg12.field1265 = var16 >> 2;
        arg12.field1270 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bu.bi(II[B[IIIIIIIILbu;II)I")
    public static int method1288(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1263 -= arg11.field1271 * arg5;
        arg11.field1265 -= arg11.field1272 * arg5;
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
        arg11.field1263 += arg11.field1271 * arg5;
        arg11.field1265 += arg11.field1272 * arg5;
        arg11.field1262 = arg6;
        arg11.field1270 = arg4;
        return arg5;
    }

    @ObfuscatedName("bu.be(II[B[IIIIIIIIIILbu;II)I")
    public static int method1289(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1262 -= arg13.field1267 * arg5;
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
        arg13.field1262 += arg13.field1267 * var27;
        arg13.field1263 = arg6;
        arg13.field1265 = arg7;
        arg13.field1270 = arg4;
        return var27;
    }

    @ObfuscatedName("bu.bp(II[B[IIIIIIIILbu;II)I")
    public static int method1290(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1263 -= arg11.field1271 * arg5;
        arg11.field1265 -= arg11.field1272 * arg5;
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
        arg11.field1263 += arg11.field1271 * arg5;
        arg11.field1265 += arg11.field1272 * arg5;
        arg11.field1262 = arg6;
        arg11.field1270 = arg4;
        return arg5;
    }

    @ObfuscatedName("bu.br(II[B[IIIIIIIIIILbu;II)I")
    public static int method1291(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1262 -= arg13.field1267 * arg5;
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
        arg13.field1262 += arg13.field1267 * var26;
        arg13.field1263 = arg6;
        arg13.field1265 = arg7;
        arg13.field1270 = arg4;
        return var26;
    }
}
