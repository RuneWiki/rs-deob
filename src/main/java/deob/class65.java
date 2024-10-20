package deob;

@ObfuscatedName("bg")
public class class65 extends class67 {

    @ObfuscatedName("bg.s")
    public int field1260;

    @ObfuscatedName("bg.j")
    public int field1255;

    @ObfuscatedName("bg.p")
    public int field1256;

    @ObfuscatedName("bg.x")
    public int field1257;

    @ObfuscatedName("bg.d")
    public int field1254;

    @ObfuscatedName("bg.u")
    public int field1259;

    @ObfuscatedName("bg.o")
    public int field1261;

    @ObfuscatedName("bg.b")
    public int field1258;

    @ObfuscatedName("bg.k")
    public int field1262;

    @ObfuscatedName("bg.c")
    public int field1263;

    @ObfuscatedName("bg.l")
    public boolean field1264;

    @ObfuscatedName("bg.t")
    public int field1265;

    @ObfuscatedName("bg.i")
    public int field1266;

    @ObfuscatedName("bg.r")
    public int field1267;

    @ObfuscatedName("bg.m")
    public int field1268;

    @ObfuscatedName("bg.s(II)I")
    public static int method1381(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bg.j(II)I")
    public static int method1236(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bg.ao()I")
    public int method1237() {
        int var1 = this.field1254 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1258 == 0) {
            var2 -= this.field1260 * var2 / (((class63) this.field1272).field1238.length << 8);
        } else if (this.field1258 >= 0) {
            var2 -= this.field1262 * var2 / ((class63) this.field1272).field1238.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class65(class63 arg0, int arg1, int arg2) {
        this.field1272 = arg0;
        this.field1262 = arg0.field1237;
        this.field1263 = arg0.field1240;
        this.field1264 = arg0.field1239;
        this.field1255 = arg1;
        this.field1256 = arg2;
        this.field1257 = 8192;
        this.field1260 = 0;
        this.method1356();
    }

    public class65(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1272 = arg0;
        this.field1262 = arg0.field1237;
        this.field1263 = arg0.field1240;
        this.field1264 = arg0.field1239;
        this.field1255 = arg1;
        this.field1256 = arg2;
        this.field1257 = arg3;
        this.field1260 = 0;
        this.method1356();
    }

    @ObfuscatedName("bg.p(Lba;II)Lbg;")
    public static class65 method1239(class63 arg0, int arg1, int arg2) {
        return arg0.field1238 == null || arg0.field1238.length == 0 ? null : new class65(arg0, (int) ((long) arg0.field1241 * 256L * (long) arg1 / (long) (Statics.field1187 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bg.x(Lba;III)Lbg;")
    public static class65 method1240(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1238 == null || arg0.field1238.length == 0 ? null : new class65(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bg.d()V")
    public void method1356() {
        this.field1254 = this.field1256;
        this.field1259 = method1381(this.field1256, this.field1257);
        this.field1261 = method1236(this.field1256, this.field1257);
    }

    @ObfuscatedName("bg.c(I)V")
    public synchronized void method1372(int arg0) {
        this.field1258 = arg0;
    }

    @ObfuscatedName("bg.t(I)V")
    public synchronized void method1243(int arg0) {
        this.method1245(arg0 << 6, this.method1296());
    }

    @ObfuscatedName("bg.i(I)V")
    public synchronized void method1244(int arg0) {
        this.method1245(arg0, this.method1296());
    }

    @ObfuscatedName("bg.r(II)V")
    public synchronized void method1245(int arg0, int arg1) {
        this.field1256 = arg0;
        this.field1257 = arg1;
        this.field1265 = 0;
        this.method1356();
    }

    @ObfuscatedName("bg.m()I")
    public synchronized int method1303() {
        return this.field1256 == Integer.MIN_VALUE ? 0 : this.field1256;
    }

    @ObfuscatedName("bg.e()I")
    public synchronized int method1296() {
        return this.field1257 < 0 ? -1 : this.field1257;
    }

    @ObfuscatedName("bg.h(I)V")
    public synchronized void method1248(int arg0) {
        int var2 = ((class63) this.field1272).field1238.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1260 = arg0;
    }

    @ObfuscatedName("bg.z(Z)V")
    public synchronized void method1249(boolean arg0) {
        this.field1255 = (this.field1255 >>> 31) + (this.field1255 ^ this.field1255 >> 31);
        if (arg0) {
            this.field1255 = -this.field1255;
        }
    }

    @ObfuscatedName("bg.a()V")
    public void method1364() {
        if (this.field1265 == 0) {
            return;
        }
        if (this.field1256 == Integer.MIN_VALUE) {
            this.field1256 = 0;
        }
        this.field1265 = 0;
        this.method1356();
    }

    @ObfuscatedName("bg.ad(II)V")
    public synchronized void method1374(int arg0, int arg1) {
        this.method1341(arg0, arg1, this.method1296());
    }

    @ObfuscatedName("bg.ap(III)V")
    public synchronized void method1341(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1245(arg1, arg2);
            return;
        }
        int var4 = method1381(arg1, arg2);
        int var5 = method1236(arg1, arg2);
        if (this.field1259 == var4 && this.field1261 == var5) {
            this.field1265 = 0;
            return;
        }
        int var6 = arg1 - this.field1254;
        if (this.field1254 - arg1 > var6) {
            var6 = this.field1254 - arg1;
        }
        if (var4 - this.field1259 > var6) {
            var6 = var4 - this.field1259;
        }
        if (this.field1259 - var4 > var6) {
            var6 = this.field1259 - var4;
        }
        if (var5 - this.field1261 > var6) {
            var6 = var5 - this.field1261;
        }
        if (this.field1261 - var5 > var6) {
            var6 = this.field1261 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1265 = arg0;
        this.field1256 = arg1;
        this.field1257 = arg2;
        this.field1266 = (arg1 - this.field1254) / arg0;
        this.field1267 = (var4 - this.field1259) / arg0;
        this.field1268 = (var5 - this.field1261) / arg0;
    }

    @ObfuscatedName("bg.am(I)V")
    public synchronized void method1383(int arg0) {
        if (arg0 == 0) {
            this.method1244(0);
            this.method3639();
        } else if (this.field1259 == 0 && this.field1261 == 0) {
            this.field1265 = 0;
            this.field1256 = 0;
            this.field1254 = 0;
            this.method3639();
        } else {
            int var2 = -this.field1254;
            if (this.field1254 > var2) {
                var2 = this.field1254;
            }
            if (-this.field1259 > var2) {
                var2 = -this.field1259;
            }
            if (this.field1259 > var2) {
                var2 = this.field1259;
            }
            if (-this.field1261 > var2) {
                var2 = -this.field1261;
            }
            if (this.field1261 > var2) {
                var2 = this.field1261;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1265 = arg0;
            this.field1256 = Integer.MIN_VALUE;
            this.field1266 = -this.field1254 / arg0;
            this.field1267 = -this.field1259 / arg0;
            this.field1268 = -this.field1261 / arg0;
        }
    }

    @ObfuscatedName("bg.ae(I)V")
    public synchronized void method1253(int arg0) {
        if (this.field1255 < 0) {
            this.field1255 = -arg0;
        } else {
            this.field1255 = arg0;
        }
    }

    @ObfuscatedName("bg.as()I")
    public synchronized int method1254() {
        return this.field1255 < 0 ? -this.field1255 : this.field1255;
    }

    @ObfuscatedName("bg.ai()Z")
    public boolean method1246() {
        return this.field1260 < 0 || this.field1260 >= ((class63) this.field1272).field1238.length << 8;
    }

    @ObfuscatedName("bg.ah()Z")
    public boolean method1280() {
        return this.field1265 != 0;
    }

    @ObfuscatedName("bg.u()Lbe;")
    public class67 method1100() {
        return null;
    }

    @ObfuscatedName("bg.o()Lbe;")
    public class67 method1113() {
        return null;
    }

    @ObfuscatedName("bg.b()I")
    public int method1102() {
        return this.field1256 == 0 && this.field1265 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bg.k([III)V")
    public synchronized void method1103(int[] arg0, int arg1, int arg2) {
        if (this.field1256 == 0 && this.field1265 == 0) {
            this.method1105(arg2);
            return;
        }
        class63 var4 = (class63) this.field1272;
        int var5 = this.field1262 << 8;
        int var6 = this.field1263 << 8;
        int var7 = var4.field1238.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1258 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1260 < 0) {
            if (this.field1255 <= 0) {
                this.method1364();
                this.method3639();
                return;
            }
            this.field1260 = 0;
        }
        if (this.field1260 >= var7) {
            if (this.field1255 >= 0) {
                this.method1364();
                this.method3639();
                return;
            }
            this.field1260 = var7 - 1;
        }
        if (this.field1258 >= 0) {
            if (this.field1258 > 0) {
                if (this.field1264) {
                    label131: {
                        if (this.field1255 < 0) {
                            var9 = this.method1242(arg0, arg1, var5, var10, var4.field1238[this.field1262]);
                            if (this.field1260 >= var5) {
                                return;
                            }
                            this.field1260 = var5 + var5 - 1 - this.field1260;
                            this.field1255 = -this.field1255;
                            if (--this.field1258 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1310(arg0, var9, var6, var10, var4.field1238[this.field1263 - 1]);
                            if (this.field1260 < var6) {
                                return;
                            }
                            this.field1260 = var6 + var6 - 1 - this.field1260;
                            this.field1255 = -this.field1255;
                            if (--this.field1258 == 0) {
                                break;
                            }
                            var9 = this.method1242(arg0, var9, var5, var10, var4.field1238[this.field1262]);
                            if (this.field1260 >= var5) {
                                return;
                            }
                            this.field1260 = var5 + var5 - 1 - this.field1260;
                            this.field1255 = -this.field1255;
                        } while (--this.field1258 != 0);
                    }
                } else if (this.field1255 < 0) {
                    while (true) {
                        var9 = this.method1242(arg0, var9, var5, var10, var4.field1238[this.field1263 - 1]);
                        if (this.field1260 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1260) / var8;
                        if (var12 >= this.field1258) {
                            this.field1260 += this.field1258 * var8;
                            this.field1258 = 0;
                            break;
                        }
                        this.field1260 += var8 * var12;
                        this.field1258 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1310(arg0, var9, var6, var10, var4.field1238[this.field1262]);
                        if (this.field1260 < var6) {
                            return;
                        }
                        int var13 = (this.field1260 - var5) / var8;
                        if (var13 >= this.field1258) {
                            this.field1260 -= this.field1258 * var8;
                            this.field1258 = 0;
                            break;
                        }
                        this.field1260 -= var8 * var13;
                        this.field1258 -= var13;
                    }
                }
            }
            if (this.field1255 < 0) {
                this.method1242(arg0, var9, 0, var10, 0);
                if (this.field1260 < 0) {
                    this.field1260 = -1;
                    this.method1364();
                    this.method3639();
                }
            } else {
                this.method1310(arg0, var9, var7, var10, 0);
                if (this.field1260 >= var7) {
                    this.field1260 = var7;
                    this.method1364();
                    this.method3639();
                }
            }
        } else if (this.field1264) {
            if (this.field1255 < 0) {
                var9 = this.method1242(arg0, arg1, var5, var10, var4.field1238[this.field1262]);
                if (this.field1260 >= var5) {
                    return;
                }
                this.field1260 = var5 + var5 - 1 - this.field1260;
                this.field1255 = -this.field1255;
            }
            while (true) {
                int var11 = this.method1310(arg0, var9, var6, var10, var4.field1238[this.field1263 - 1]);
                if (this.field1260 < var6) {
                    return;
                }
                this.field1260 = var6 + var6 - 1 - this.field1260;
                this.field1255 = -this.field1255;
                var9 = this.method1242(arg0, var11, var5, var10, var4.field1238[this.field1262]);
                if (this.field1260 >= var5) {
                    return;
                }
                this.field1260 = var5 + var5 - 1 - this.field1260;
                this.field1255 = -this.field1255;
            }
        } else if (this.field1255 < 0) {
            while (true) {
                var9 = this.method1242(arg0, var9, var5, var10, var4.field1238[this.field1263 - 1]);
                if (this.field1260 >= var5) {
                    return;
                }
                this.field1260 = var6 - 1 - (var6 - 1 - this.field1260) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1310(arg0, var9, var6, var10, var4.field1238[this.field1262]);
                if (this.field1260 < var6) {
                    return;
                }
                this.field1260 = (this.field1260 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bg.l(I)V")
    public synchronized void method1105(int arg0) {
        if (this.field1265 > 0) {
            if (arg0 >= this.field1265) {
                if (this.field1256 == Integer.MIN_VALUE) {
                    this.field1256 = 0;
                    this.field1261 = 0;
                    this.field1259 = 0;
                    this.field1254 = 0;
                    this.method3639();
                    arg0 = this.field1265;
                }
                this.field1265 = 0;
                this.method1356();
            } else {
                this.field1254 += this.field1266 * arg0;
                this.field1259 += this.field1267 * arg0;
                this.field1261 += this.field1268 * arg0;
                this.field1265 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1272;
        int var3 = this.field1262 << 8;
        int var4 = this.field1263 << 8;
        int var5 = var2.field1238.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1258 = 0;
        }
        if (this.field1260 < 0) {
            if (this.field1255 <= 0) {
                this.method1364();
                this.method3639();
                return;
            }
            this.field1260 = 0;
        }
        if (this.field1260 >= var5) {
            if (this.field1255 >= 0) {
                this.method1364();
                this.method3639();
                return;
            }
            this.field1260 = var5 - 1;
        }
        this.field1260 += this.field1255 * arg0;
        if (this.field1258 >= 0) {
            if (this.field1258 > 0) {
                if (this.field1264) {
                    label121: {
                        if (this.field1255 < 0) {
                            if (this.field1260 >= var3) {
                                return;
                            }
                            this.field1260 = var3 + var3 - 1 - this.field1260;
                            this.field1255 = -this.field1255;
                            if (--this.field1258 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1260 < var4) {
                                return;
                            }
                            this.field1260 = var4 + var4 - 1 - this.field1260;
                            this.field1255 = -this.field1255;
                            if (--this.field1258 == 0) {
                                break;
                            }
                            if (this.field1260 >= var3) {
                                return;
                            }
                            this.field1260 = var3 + var3 - 1 - this.field1260;
                            this.field1255 = -this.field1255;
                        } while (--this.field1258 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1255 < 0) {
                            if (this.field1260 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1260) / var6;
                            if (var7 >= this.field1258) {
                                this.field1260 += this.field1258 * var6;
                                this.field1258 = 0;
                                break label153;
                            }
                            this.field1260 += var6 * var7;
                            this.field1258 -= var7;
                        } else if (this.field1260 >= var4) {
                            int var8 = (this.field1260 - var3) / var6;
                            if (var8 >= this.field1258) {
                                this.field1260 -= this.field1258 * var6;
                                this.field1258 = 0;
                                break label153;
                            }
                            this.field1260 -= var6 * var8;
                            this.field1258 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1255 < 0) {
                if (this.field1260 < 0) {
                    this.field1260 = -1;
                    this.method1364();
                    this.method3639();
                }
            } else if (this.field1260 >= var5) {
                this.field1260 = var5;
                this.method1364();
                this.method3639();
            }
        } else if (this.field1264) {
            if (this.field1255 < 0) {
                if (this.field1260 >= var3) {
                    return;
                }
                this.field1260 = var3 + var3 - 1 - this.field1260;
                this.field1255 = -this.field1255;
            }
            while (this.field1260 >= var4) {
                this.field1260 = var4 + var4 - 1 - this.field1260;
                this.field1255 = -this.field1255;
                if (this.field1260 >= var3) {
                    return;
                }
                this.field1260 = var3 + var3 - 1 - this.field1260;
                this.field1255 = -this.field1255;
            }
        } else if (this.field1255 < 0) {
            if (this.field1260 >= var3) {
                return;
            }
            this.field1260 = var4 - 1 - (var4 - 1 - this.field1260) % var6;
        } else if (this.field1260 >= var4) {
            this.field1260 = (this.field1260 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bg.ax([IIIII)I")
    public int method1310(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1265 > 0) {
                int var6 = this.field1265 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1265 += arg1;
                if (this.field1255 == 256 && (this.field1260 & 0xFF) == 0) {
                    if (Statics.field1181) {
                        arg1 = method1271(0, ((class63) this.field1272).field1238, arg0, this.field1260, arg1, this.field1259, this.field1261, this.field1267, this.field1268, 0, var6, arg2, this);
                    } else {
                        arg1 = method1270(((class63) this.field1272).field1238, arg0, this.field1260, arg1, this.field1254, this.field1266, 0, var6, arg2, this);
                    }
                } else if (Statics.field1181) {
                    arg1 = method1268(0, 0, ((class63) this.field1272).field1238, arg0, this.field1260, arg1, this.field1259, this.field1261, this.field1267, this.field1268, 0, var6, arg2, this, this.field1255, arg4);
                } else {
                    arg1 = method1274(0, 0, ((class63) this.field1272).field1238, arg0, this.field1260, arg1, this.field1254, this.field1266, 0, var6, arg2, this, this.field1255, arg4);
                }
                this.field1265 -= arg1;
                if (this.field1265 != 0) {
                    return arg1;
                }
                if (!this.method1261()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1255 == 256 && (this.field1260 & 0xFF) == 0) {
                if (Statics.field1181) {
                    return method1263(0, ((class63) this.field1272).field1238, arg0, this.field1260, arg1, this.field1259, this.field1261, 0, arg3, arg2, this);
                }
                return method1262(((class63) this.field1272).field1238, arg0, this.field1260, arg1, this.field1254, 0, arg3, arg2, this);
            }
            if (Statics.field1181) {
                return method1334(0, 0, ((class63) this.field1272).field1238, arg0, this.field1260, arg1, this.field1259, this.field1261, 0, arg3, arg2, this, this.field1255, arg4);
            }
            return method1255(0, 0, ((class63) this.field1272).field1238, arg0, this.field1260, arg1, this.field1254, 0, arg3, arg2, this, this.field1255, arg4);
        }
    }

    @ObfuscatedName("bg.aa([IIIII)I")
    public int method1242(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1265 > 0) {
                int var6 = this.field1265 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1265 += arg1;
                if (this.field1255 == -256 && (this.field1260 & 0xFF) == 0) {
                    if (Statics.field1181) {
                        arg1 = method1256(0, ((class63) this.field1272).field1238, arg0, this.field1260, arg1, this.field1259, this.field1261, this.field1267, this.field1268, 0, var6, arg2, this);
                    } else {
                        arg1 = method1272(((class63) this.field1272).field1238, arg0, this.field1260, arg1, this.field1254, this.field1266, 0, var6, arg2, this);
                    }
                } else if (Statics.field1181) {
                    arg1 = method1277(0, 0, ((class63) this.field1272).field1238, arg0, this.field1260, arg1, this.field1259, this.field1261, this.field1267, this.field1268, 0, var6, arg2, this, this.field1255, arg4);
                } else {
                    arg1 = method1276(0, 0, ((class63) this.field1272).field1238, arg0, this.field1260, arg1, this.field1254, this.field1266, 0, var6, arg2, this, this.field1255, arg4);
                }
                this.field1265 -= arg1;
                if (this.field1265 != 0) {
                    return arg1;
                }
                if (!this.method1261()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1255 == -256 && (this.field1260 & 0xFF) == 0) {
                if (Statics.field1181) {
                    return method1265(0, ((class63) this.field1272).field1238, arg0, this.field1260, arg1, this.field1259, this.field1261, 0, arg3, arg2, this);
                }
                return method1264(((class63) this.field1272).field1238, arg0, this.field1260, arg1, this.field1254, 0, arg3, arg2, this);
            }
            if (Statics.field1181) {
                return method1281(0, 0, ((class63) this.field1272).field1238, arg0, this.field1260, arg1, this.field1259, this.field1261, 0, arg3, arg2, this, this.field1255, arg4);
            }
            return method1316(0, 0, ((class63) this.field1272).field1238, arg0, this.field1260, arg1, this.field1254, 0, arg3, arg2, this, this.field1255, arg4);
        }
    }

    @ObfuscatedName("bg.aq()Z")
    public boolean method1261() {
        int var1 = this.field1256;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1381(var1, this.field1257);
            var2 = method1236(var1, this.field1257);
        }
        if (this.field1254 != var1 || this.field1259 != var3 || this.field1261 != var2) {
            if (this.field1254 < var1) {
                this.field1266 = 1;
                this.field1265 = var1 - this.field1254;
            } else if (this.field1254 > var1) {
                this.field1266 = -1;
                this.field1265 = this.field1254 - var1;
            } else {
                this.field1266 = 0;
            }
            if (this.field1259 < var3) {
                this.field1267 = 1;
                if (this.field1265 == 0 || this.field1265 > var3 - this.field1259) {
                    this.field1265 = var3 - this.field1259;
                }
            } else if (this.field1259 > var3) {
                this.field1267 = -1;
                if (this.field1265 == 0 || this.field1265 > this.field1259 - var3) {
                    this.field1265 = this.field1259 - var3;
                }
            } else {
                this.field1267 = 0;
            }
            if (this.field1261 < var2) {
                this.field1268 = 1;
                if (this.field1265 == 0 || this.field1265 > var2 - this.field1261) {
                    this.field1265 = var2 - this.field1261;
                }
            } else if (this.field1261 > var2) {
                this.field1268 = -1;
                if (this.field1265 == 0 || this.field1265 > this.field1261 - var2) {
                    this.field1265 = this.field1261 - var2;
                }
            } else {
                this.field1268 = 0;
            }
            return false;
        } else if (this.field1256 == Integer.MIN_VALUE) {
            this.field1256 = 0;
            this.field1261 = 0;
            this.field1259 = 0;
            this.field1254 = 0;
            this.method3639();
            return true;
        } else {
            this.method1356();
            return false;
        }
    }

    @ObfuscatedName("bg.ay([B[IIIIIIILbg;)I")
    public static int method1262(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1260 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.aj(I[B[IIIIIIIILbg;)I")
    public static int method1263(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1260 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bg.ar([B[IIIIIIILbg;)I")
    public static int method1264(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1260 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.aw(I[B[IIIIIIIILbg;)I")
    public static int method1265(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1260 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bg.at(II[B[IIIIIIILbg;II)I")
    public static int method1255(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1260 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.af(II[B[IIIIIIIILbg;II)I")
    public static int method1334(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1260 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bg.al(II[B[IIIIIIILbg;II)I")
    public static int method1316(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1260 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.ag(II[B[IIIIIIIILbg;II)I")
    public static int method1281(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1260 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bg.ac([B[IIIIIIIILbg;)I")
    public static int method1270(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1259 += (var14 - arg3) * arg9.field1267;
        arg9.field1261 += (var14 - arg3) * arg9.field1268;
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
        arg9.field1254 = var12 >> 2;
        arg9.field1260 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.ak(I[B[IIIIIIIIIILbg;)I")
    public static int method1271(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1254 += (var19 - arg4) * arg12.field1266;
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
        arg12.field1259 = var15 >> 2;
        arg12.field1261 = var16 >> 2;
        arg12.field1260 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bg.av([B[IIIIIIIILbg;)I")
    public static int method1272(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1259 += (var14 - arg3) * arg9.field1267;
        arg9.field1261 += (var14 - arg3) * arg9.field1268;
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
        arg9.field1254 = var12 >> 2;
        arg9.field1260 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.az(I[B[IIIIIIIIIILbg;)I")
    public static int method1256(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1254 += (var19 - arg4) * arg12.field1266;
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
        arg12.field1259 = var15 >> 2;
        arg12.field1261 = var16 >> 2;
        arg12.field1260 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bg.bd(II[B[IIIIIIIILbg;II)I")
    public static int method1274(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1259 -= arg11.field1267 * arg5;
        arg11.field1261 -= arg11.field1268 * arg5;
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
        arg11.field1259 += arg11.field1267 * arg5;
        arg11.field1261 += arg11.field1268 * arg5;
        arg11.field1254 = arg6;
        arg11.field1260 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.bt(II[B[IIIIIIIIIILbg;II)I")
    public static int method1268(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1254 -= arg13.field1266 * arg5;
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
        arg13.field1254 += arg13.field1266 * var27;
        arg13.field1259 = arg6;
        arg13.field1261 = arg7;
        arg13.field1260 = arg4;
        return var27;
    }

    @ObfuscatedName("bg.bq(II[B[IIIIIIIILbg;II)I")
    public static int method1276(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1259 -= arg11.field1267 * arg5;
        arg11.field1261 -= arg11.field1268 * arg5;
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
        arg11.field1259 += arg11.field1267 * arg5;
        arg11.field1261 += arg11.field1268 * arg5;
        arg11.field1254 = arg6;
        arg11.field1260 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.bj(II[B[IIIIIIIIIILbg;II)I")
    public static int method1277(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1254 -= arg13.field1266 * arg5;
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
        arg13.field1254 += arg13.field1266 * var26;
        arg13.field1259 = arg6;
        arg13.field1261 = arg7;
        arg13.field1260 = arg4;
        return var26;
    }
}
