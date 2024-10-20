package deob;

@ObfuscatedName("bi")
public class class65 extends class67 {

    @ObfuscatedName("bi.e")
    public int field1231;

    @ObfuscatedName("bi.f")
    public int field1221;

    @ObfuscatedName("bi.s")
    public int field1222;

    @ObfuscatedName("bi.p")
    public int field1223;

    @ObfuscatedName("bi.h")
    public int field1224;

    @ObfuscatedName("bi.g")
    public int field1233;

    @ObfuscatedName("bi.a")
    public int field1226;

    @ObfuscatedName("bi.r")
    public int field1227;

    @ObfuscatedName("bi.k")
    public int field1228;

    @ObfuscatedName("bi.m")
    public int field1225;

    @ObfuscatedName("bi.n")
    public boolean field1230;

    @ObfuscatedName("bi.y")
    public int field1229;

    @ObfuscatedName("bi.i")
    public int field1232;

    @ObfuscatedName("bi.j")
    public int field1220;

    @ObfuscatedName("bi.l")
    public int field1234;

    @ObfuscatedName("bi.e(II)I")
    public static int method1362(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bi.w(II)I")
    public static int method1249(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bi.au()I")
    public int method1322() {
        int var1 = this.field1224 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1227 == 0) {
            var2 -= this.field1231 * var2 / (((class63) this.field1238).field1204.length << 8);
        } else if (this.field1227 >= 0) {
            var2 -= this.field1228 * var2 / ((class63) this.field1238).field1204.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class65(class63 arg0, int arg1, int arg2) {
        this.field1238 = arg0;
        this.field1228 = arg0.field1206;
        this.field1225 = arg0.field1203;
        this.field1230 = arg0.field1207;
        this.field1221 = arg1;
        this.field1222 = arg2;
        this.field1223 = 8192;
        this.field1231 = 0;
        this.method1253();
    }

    public class65(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1238 = arg0;
        this.field1228 = arg0.field1206;
        this.field1225 = arg0.field1203;
        this.field1230 = arg0.field1207;
        this.field1221 = arg1;
        this.field1222 = arg2;
        this.field1223 = arg3;
        this.field1231 = 0;
        this.method1253();
    }

    @ObfuscatedName("bi.f(Lbu;II)Lbi;")
    public static class65 method1270(class63 arg0, int arg1, int arg2) {
        return arg0.field1204 == null || arg0.field1204.length == 0 ? null : new class65(arg0, (int) ((long) arg0.field1205 * 256L * (long) arg1 / (long) (Statics.field1154 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bi.s(Lbu;III)Lbi;")
    public static class65 method1252(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1204 == null || arg0.field1204.length == 0 ? null : new class65(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bi.p()V")
    public void method1253() {
        this.field1224 = this.field1222;
        this.field1233 = method1362(this.field1222, this.field1223);
        this.field1226 = method1249(this.field1222, this.field1223);
    }

    @ObfuscatedName("bi.k(I)V")
    public synchronized void method1374(int arg0) {
        this.field1227 = arg0;
    }

    @ObfuscatedName("bi.n(I)V")
    public synchronized void method1255(int arg0) {
        this.method1257(arg0 << 6, this.method1259());
    }

    @ObfuscatedName("bi.y(I)V")
    public synchronized void method1256(int arg0) {
        this.method1257(arg0, this.method1259());
    }

    @ObfuscatedName("bi.i(II)V")
    public synchronized void method1257(int arg0, int arg1) {
        this.field1222 = arg0;
        this.field1223 = arg1;
        this.field1229 = 0;
        this.method1253();
    }

    @ObfuscatedName("bi.j()I")
    public synchronized int method1300() {
        return this.field1222 == Integer.MIN_VALUE ? 0 : this.field1222;
    }

    @ObfuscatedName("bi.l()I")
    public synchronized int method1259() {
        return this.field1223 < 0 ? -1 : this.field1223;
    }

    @ObfuscatedName("bi.o(I)V")
    public synchronized void method1289(int arg0) {
        int var2 = ((class63) this.field1238).field1204.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1231 = arg0;
    }

    @ObfuscatedName("bi.c(Z)V")
    public synchronized void method1261(boolean arg0) {
        this.field1221 = (this.field1221 >>> 31) + (this.field1221 ^ this.field1221 >> 31);
        if (arg0) {
            this.field1221 = -this.field1221;
        }
    }

    @ObfuscatedName("bi.x()V")
    public void method1262() {
        if (this.field1229 == 0) {
            return;
        }
        if (this.field1222 == Integer.MIN_VALUE) {
            this.field1222 = 0;
        }
        this.field1229 = 0;
        this.method1253();
    }

    @ObfuscatedName("bi.b(II)V")
    public synchronized void method1263(int arg0, int arg1) {
        this.method1294(arg0, arg1, this.method1259());
    }

    @ObfuscatedName("bi.q(III)V")
    public synchronized void method1294(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1257(arg1, arg2);
            return;
        }
        int var4 = method1362(arg1, arg2);
        int var5 = method1249(arg1, arg2);
        if (this.field1233 == var4 && this.field1226 == var5) {
            this.field1229 = 0;
            return;
        }
        int var6 = arg1 - this.field1224;
        if (this.field1224 - arg1 > var6) {
            var6 = this.field1224 - arg1;
        }
        if (var4 - this.field1233 > var6) {
            var6 = var4 - this.field1233;
        }
        if (this.field1233 - var4 > var6) {
            var6 = this.field1233 - var4;
        }
        if (var5 - this.field1226 > var6) {
            var6 = var5 - this.field1226;
        }
        if (this.field1226 - var5 > var6) {
            var6 = this.field1226 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1229 = arg0;
        this.field1222 = arg1;
        this.field1223 = arg2;
        this.field1232 = (arg1 - this.field1224) / arg0;
        this.field1220 = (var4 - this.field1233) / arg0;
        this.field1234 = (var5 - this.field1226) / arg0;
    }

    @ObfuscatedName("bi.u(I)V")
    public synchronized void method1377(int arg0) {
        if (arg0 == 0) {
            this.method1256(0);
            this.method3632();
        } else if (this.field1233 == 0 && this.field1226 == 0) {
            this.field1229 = 0;
            this.field1222 = 0;
            this.field1224 = 0;
            this.method3632();
        } else {
            int var2 = -this.field1224;
            if (this.field1224 > var2) {
                var2 = this.field1224;
            }
            if (-this.field1233 > var2) {
                var2 = -this.field1233;
            }
            if (this.field1233 > var2) {
                var2 = this.field1233;
            }
            if (-this.field1226 > var2) {
                var2 = -this.field1226;
            }
            if (this.field1226 > var2) {
                var2 = this.field1226;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1229 = arg0;
            this.field1222 = Integer.MIN_VALUE;
            this.field1232 = -this.field1224 / arg0;
            this.field1220 = -this.field1233 / arg0;
            this.field1234 = -this.field1226 / arg0;
        }
    }

    @ObfuscatedName("bi.t(I)V")
    public synchronized void method1266(int arg0) {
        if (this.field1221 < 0) {
            this.field1221 = -arg0;
        } else {
            this.field1221 = arg0;
        }
    }

    @ObfuscatedName("bi.d()I")
    public synchronized int method1330() {
        return this.field1221 < 0 ? -this.field1221 : this.field1221;
    }

    @ObfuscatedName("bi.z()Z")
    public boolean method1268() {
        return this.field1231 < 0 || this.field1231 >= ((class63) this.field1238).field1204.length << 8;
    }

    @ObfuscatedName("bi.v()Z")
    public boolean method1269() {
        return this.field1229 != 0;
    }

    @ObfuscatedName("bi.h()Lbf;")
    public class67 method1104() {
        return null;
    }

    @ObfuscatedName("bi.g()Lbf;")
    public class67 method1109() {
        return null;
    }

    @ObfuscatedName("bi.a()I")
    public int method1110() {
        return this.field1222 == 0 && this.field1229 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bi.r([III)V")
    public synchronized void method1135(int[] arg0, int arg1, int arg2) {
        if (this.field1222 == 0 && this.field1229 == 0) {
            this.method1113(arg2);
            return;
        }
        class63 var4 = (class63) this.field1238;
        int var5 = this.field1228 << 8;
        int var6 = this.field1225 << 8;
        int var7 = var4.field1204.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1227 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1231 < 0) {
            if (this.field1221 <= 0) {
                this.method1262();
                this.method3632();
                return;
            }
            this.field1231 = 0;
        }
        if (this.field1231 >= var7) {
            if (this.field1221 >= 0) {
                this.method1262();
                this.method3632();
                return;
            }
            this.field1231 = var7 - 1;
        }
        if (this.field1227 >= 0) {
            if (this.field1227 > 0) {
                if (this.field1230) {
                    label131: {
                        if (this.field1221 < 0) {
                            var9 = this.method1272(arg0, arg1, var5, var10, var4.field1204[this.field1228]);
                            if (this.field1231 >= var5) {
                                return;
                            }
                            this.field1231 = var5 + var5 - 1 - this.field1231;
                            this.field1221 = -this.field1221;
                            if (--this.field1227 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1271(arg0, var9, var6, var10, var4.field1204[this.field1225 - 1]);
                            if (this.field1231 < var6) {
                                return;
                            }
                            this.field1231 = var6 + var6 - 1 - this.field1231;
                            this.field1221 = -this.field1221;
                            if (--this.field1227 == 0) {
                                break;
                            }
                            var9 = this.method1272(arg0, var9, var5, var10, var4.field1204[this.field1228]);
                            if (this.field1231 >= var5) {
                                return;
                            }
                            this.field1231 = var5 + var5 - 1 - this.field1231;
                            this.field1221 = -this.field1221;
                        } while (--this.field1227 != 0);
                    }
                } else if (this.field1221 < 0) {
                    while (true) {
                        var9 = this.method1272(arg0, var9, var5, var10, var4.field1204[this.field1225 - 1]);
                        if (this.field1231 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1231) / var8;
                        if (var12 >= this.field1227) {
                            this.field1231 += this.field1227 * var8;
                            this.field1227 = 0;
                            break;
                        }
                        this.field1231 += var8 * var12;
                        this.field1227 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1271(arg0, var9, var6, var10, var4.field1204[this.field1228]);
                        if (this.field1231 < var6) {
                            return;
                        }
                        int var13 = (this.field1231 - var5) / var8;
                        if (var13 >= this.field1227) {
                            this.field1231 -= this.field1227 * var8;
                            this.field1227 = 0;
                            break;
                        }
                        this.field1231 -= var8 * var13;
                        this.field1227 -= var13;
                    }
                }
            }
            if (this.field1221 < 0) {
                this.method1272(arg0, var9, 0, var10, 0);
                if (this.field1231 < 0) {
                    this.field1231 = -1;
                    this.method1262();
                    this.method3632();
                }
            } else {
                this.method1271(arg0, var9, var7, var10, 0);
                if (this.field1231 >= var7) {
                    this.field1231 = var7;
                    this.method1262();
                    this.method3632();
                }
            }
        } else if (this.field1230) {
            if (this.field1221 < 0) {
                var9 = this.method1272(arg0, arg1, var5, var10, var4.field1204[this.field1228]);
                if (this.field1231 >= var5) {
                    return;
                }
                this.field1231 = var5 + var5 - 1 - this.field1231;
                this.field1221 = -this.field1221;
            }
            while (true) {
                int var11 = this.method1271(arg0, var9, var6, var10, var4.field1204[this.field1225 - 1]);
                if (this.field1231 < var6) {
                    return;
                }
                this.field1231 = var6 + var6 - 1 - this.field1231;
                this.field1221 = -this.field1221;
                var9 = this.method1272(arg0, var11, var5, var10, var4.field1204[this.field1228]);
                if (this.field1231 >= var5) {
                    return;
                }
                this.field1231 = var5 + var5 - 1 - this.field1231;
                this.field1221 = -this.field1221;
            }
        } else if (this.field1221 < 0) {
            while (true) {
                var9 = this.method1272(arg0, var9, var5, var10, var4.field1204[this.field1225 - 1]);
                if (this.field1231 >= var5) {
                    return;
                }
                this.field1231 = var6 - 1 - (var6 - 1 - this.field1231) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1271(arg0, var9, var6, var10, var4.field1204[this.field1228]);
                if (this.field1231 < var6) {
                    return;
                }
                this.field1231 = (this.field1231 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bi.m(I)V")
    public synchronized void method1113(int arg0) {
        if (this.field1229 > 0) {
            if (arg0 >= this.field1229) {
                if (this.field1222 == Integer.MIN_VALUE) {
                    this.field1222 = 0;
                    this.field1226 = 0;
                    this.field1233 = 0;
                    this.field1224 = 0;
                    this.method3632();
                    arg0 = this.field1229;
                }
                this.field1229 = 0;
                this.method1253();
            } else {
                this.field1224 += this.field1232 * arg0;
                this.field1233 += this.field1220 * arg0;
                this.field1226 += this.field1234 * arg0;
                this.field1229 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1238;
        int var3 = this.field1228 << 8;
        int var4 = this.field1225 << 8;
        int var5 = var2.field1204.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1227 = 0;
        }
        if (this.field1231 < 0) {
            if (this.field1221 <= 0) {
                this.method1262();
                this.method3632();
                return;
            }
            this.field1231 = 0;
        }
        if (this.field1231 >= var5) {
            if (this.field1221 >= 0) {
                this.method1262();
                this.method3632();
                return;
            }
            this.field1231 = var5 - 1;
        }
        this.field1231 += this.field1221 * arg0;
        if (this.field1227 >= 0) {
            if (this.field1227 > 0) {
                if (this.field1230) {
                    label121: {
                        if (this.field1221 < 0) {
                            if (this.field1231 >= var3) {
                                return;
                            }
                            this.field1231 = var3 + var3 - 1 - this.field1231;
                            this.field1221 = -this.field1221;
                            if (--this.field1227 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1231 < var4) {
                                return;
                            }
                            this.field1231 = var4 + var4 - 1 - this.field1231;
                            this.field1221 = -this.field1221;
                            if (--this.field1227 == 0) {
                                break;
                            }
                            if (this.field1231 >= var3) {
                                return;
                            }
                            this.field1231 = var3 + var3 - 1 - this.field1231;
                            this.field1221 = -this.field1221;
                        } while (--this.field1227 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1221 < 0) {
                            if (this.field1231 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1231) / var6;
                            if (var7 >= this.field1227) {
                                this.field1231 += this.field1227 * var6;
                                this.field1227 = 0;
                                break label153;
                            }
                            this.field1231 += var6 * var7;
                            this.field1227 -= var7;
                        } else if (this.field1231 >= var4) {
                            int var8 = (this.field1231 - var3) / var6;
                            if (var8 >= this.field1227) {
                                this.field1231 -= this.field1227 * var6;
                                this.field1227 = 0;
                                break label153;
                            }
                            this.field1231 -= var6 * var8;
                            this.field1227 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1221 < 0) {
                if (this.field1231 < 0) {
                    this.field1231 = -1;
                    this.method1262();
                    this.method3632();
                }
            } else if (this.field1231 >= var5) {
                this.field1231 = var5;
                this.method1262();
                this.method3632();
            }
        } else if (this.field1230) {
            if (this.field1221 < 0) {
                if (this.field1231 >= var3) {
                    return;
                }
                this.field1231 = var3 + var3 - 1 - this.field1231;
                this.field1221 = -this.field1221;
            }
            while (this.field1231 >= var4) {
                this.field1231 = var4 + var4 - 1 - this.field1231;
                this.field1221 = -this.field1221;
                if (this.field1231 >= var3) {
                    return;
                }
                this.field1231 = var3 + var3 - 1 - this.field1231;
                this.field1221 = -this.field1221;
            }
        } else if (this.field1221 < 0) {
            if (this.field1231 >= var3) {
                return;
            }
            this.field1231 = var4 - 1 - (var4 - 1 - this.field1231) % var6;
        } else if (this.field1231 >= var4) {
            this.field1231 = (this.field1231 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bi.ag([IIIII)I")
    public int method1271(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1229 > 0) {
                int var6 = this.field1229 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1229 += arg1;
                if (this.field1221 == 256 && (this.field1231 & 0xFF) == 0) {
                    if (Statics.field1161) {
                        arg1 = method1283(0, ((class63) this.field1238).field1204, arg0, this.field1231, arg1, this.field1233, this.field1226, this.field1220, this.field1234, 0, var6, arg2, this);
                    } else {
                        arg1 = method1282(((class63) this.field1238).field1204, arg0, this.field1231, arg1, this.field1224, this.field1232, 0, var6, arg2, this);
                    }
                } else if (Statics.field1161) {
                    arg1 = method1286(0, 0, ((class63) this.field1238).field1204, arg0, this.field1231, arg1, this.field1233, this.field1226, this.field1220, this.field1234, 0, var6, arg2, this, this.field1221, arg4);
                } else {
                    arg1 = method1285(0, 0, ((class63) this.field1238).field1204, arg0, this.field1231, arg1, this.field1224, this.field1232, 0, var6, arg2, this, this.field1221, arg4);
                }
                this.field1229 -= arg1;
                if (this.field1229 != 0) {
                    return arg1;
                }
                if (!this.method1373()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1221 == 256 && (this.field1231 & 0xFF) == 0) {
                if (Statics.field1161) {
                    return method1275(0, ((class63) this.field1238).field1204, arg0, this.field1231, arg1, this.field1233, this.field1226, 0, arg3, arg2, this);
                }
                return method1274(((class63) this.field1238).field1204, arg0, this.field1231, arg1, this.field1224, 0, arg3, arg2, this);
            }
            if (Statics.field1161) {
                return method1279(0, 0, ((class63) this.field1238).field1204, arg0, this.field1231, arg1, this.field1233, this.field1226, 0, arg3, arg2, this, this.field1221, arg4);
            }
            return method1364(0, 0, ((class63) this.field1238).field1204, arg0, this.field1231, arg1, this.field1224, 0, arg3, arg2, this, this.field1221, arg4);
        }
    }

    @ObfuscatedName("bi.av([IIIII)I")
    public int method1272(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1229 > 0) {
                int var6 = this.field1229 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1229 += arg1;
                if (this.field1221 == -256 && (this.field1231 & 0xFF) == 0) {
                    if (Statics.field1161) {
                        arg1 = method1273(0, ((class63) this.field1238).field1204, arg0, this.field1231, arg1, this.field1233, this.field1226, this.field1220, this.field1234, 0, var6, arg2, this);
                    } else {
                        arg1 = method1375(((class63) this.field1238).field1204, arg0, this.field1231, arg1, this.field1224, this.field1232, 0, var6, arg2, this);
                    }
                } else if (Statics.field1161) {
                    arg1 = method1288(0, 0, ((class63) this.field1238).field1204, arg0, this.field1231, arg1, this.field1233, this.field1226, this.field1220, this.field1234, 0, var6, arg2, this, this.field1221, arg4);
                } else {
                    arg1 = method1287(0, 0, ((class63) this.field1238).field1204, arg0, this.field1231, arg1, this.field1224, this.field1232, 0, var6, arg2, this, this.field1221, arg4);
                }
                this.field1229 -= arg1;
                if (this.field1229 != 0) {
                    return arg1;
                }
                if (!this.method1373()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1221 == -256 && (this.field1231 & 0xFF) == 0) {
                if (Statics.field1161) {
                    return method1277(0, ((class63) this.field1238).field1204, arg0, this.field1231, arg1, this.field1233, this.field1226, 0, arg3, arg2, this);
                }
                return method1276(((class63) this.field1238).field1204, arg0, this.field1231, arg1, this.field1224, 0, arg3, arg2, this);
            }
            if (Statics.field1161) {
                return method1281(0, 0, ((class63) this.field1238).field1204, arg0, this.field1231, arg1, this.field1233, this.field1226, 0, arg3, arg2, this, this.field1221, arg4);
            }
            return method1280(0, 0, ((class63) this.field1238).field1204, arg0, this.field1231, arg1, this.field1224, 0, arg3, arg2, this, this.field1221, arg4);
        }
    }

    @ObfuscatedName("bi.ac()Z")
    public boolean method1373() {
        int var1 = this.field1222;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1362(var1, this.field1223);
            var2 = method1249(var1, this.field1223);
        }
        if (this.field1224 != var1 || this.field1233 != var3 || this.field1226 != var2) {
            if (this.field1224 < var1) {
                this.field1232 = 1;
                this.field1229 = var1 - this.field1224;
            } else if (this.field1224 > var1) {
                this.field1232 = -1;
                this.field1229 = this.field1224 - var1;
            } else {
                this.field1232 = 0;
            }
            if (this.field1233 < var3) {
                this.field1220 = 1;
                if (this.field1229 == 0 || this.field1229 > var3 - this.field1233) {
                    this.field1229 = var3 - this.field1233;
                }
            } else if (this.field1233 > var3) {
                this.field1220 = -1;
                if (this.field1229 == 0 || this.field1229 > this.field1233 - var3) {
                    this.field1229 = this.field1233 - var3;
                }
            } else {
                this.field1220 = 0;
            }
            if (this.field1226 < var2) {
                this.field1234 = 1;
                if (this.field1229 == 0 || this.field1229 > var2 - this.field1226) {
                    this.field1229 = var2 - this.field1226;
                }
            } else if (this.field1226 > var2) {
                this.field1234 = -1;
                if (this.field1229 == 0 || this.field1229 > this.field1226 - var2) {
                    this.field1229 = this.field1226 - var2;
                }
            } else {
                this.field1234 = 0;
            }
            return false;
        } else if (this.field1222 == Integer.MIN_VALUE) {
            this.field1222 = 0;
            this.field1226 = 0;
            this.field1233 = 0;
            this.field1224 = 0;
            this.method3632();
            return true;
        } else {
            this.method1253();
            return false;
        }
    }

    @ObfuscatedName("bi.an([B[IIIIIIILbi;)I")
    public static int method1274(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1231 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bi.ax(I[B[IIIIIIIILbi;)I")
    public static int method1275(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1231 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bi.at([B[IIIIIIILbi;)I")
    public static int method1276(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1231 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bi.ao(I[B[IIIIIIIILbi;)I")
    public static int method1277(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1231 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bi.al(II[B[IIIIIIILbi;II)I")
    public static int method1364(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1231 = arg4;
        return arg5;
    }

    @ObfuscatedName("bi.ak(II[B[IIIIIIIILbi;II)I")
    public static int method1279(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1231 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bi.as(II[B[IIIIIIILbi;II)I")
    public static int method1280(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1231 = arg4;
        return arg5;
    }

    @ObfuscatedName("bi.bj(II[B[IIIIIIIILbi;II)I")
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
        arg11.field1231 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bi.bq([B[IIIIIIIILbi;)I")
    public static int method1282(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1233 += (var14 - arg3) * arg9.field1220;
        arg9.field1226 += (var14 - arg3) * arg9.field1234;
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
        arg9.field1224 = var12 >> 2;
        arg9.field1231 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bi.bo(I[B[IIIIIIIIIILbi;)I")
    public static int method1283(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1224 += (var19 - arg4) * arg12.field1232;
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
        arg12.field1233 = var15 >> 2;
        arg12.field1226 = var16 >> 2;
        arg12.field1231 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bi.br([B[IIIIIIIILbi;)I")
    public static int method1375(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1233 += (var14 - arg3) * arg9.field1220;
        arg9.field1226 += (var14 - arg3) * arg9.field1234;
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
        arg9.field1224 = var12 >> 2;
        arg9.field1231 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bi.bl(I[B[IIIIIIIIIILbi;)I")
    public static int method1273(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1224 += (var19 - arg4) * arg12.field1232;
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
        arg12.field1233 = var15 >> 2;
        arg12.field1226 = var16 >> 2;
        arg12.field1231 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bi.bd(II[B[IIIIIIIILbi;II)I")
    public static int method1285(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1233 -= arg11.field1220 * arg5;
        arg11.field1226 -= arg11.field1234 * arg5;
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
        arg11.field1233 += arg11.field1220 * arg5;
        arg11.field1226 += arg11.field1234 * arg5;
        arg11.field1224 = arg6;
        arg11.field1231 = arg4;
        return arg5;
    }

    @ObfuscatedName("bi.bh(II[B[IIIIIIIIIILbi;II)I")
    public static int method1286(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1224 -= arg13.field1232 * arg5;
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
        arg13.field1224 += arg13.field1232 * var27;
        arg13.field1233 = arg6;
        arg13.field1226 = arg7;
        arg13.field1231 = arg4;
        return var27;
    }

    @ObfuscatedName("bi.bw(II[B[IIIIIIIILbi;II)I")
    public static int method1287(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1233 -= arg11.field1220 * arg5;
        arg11.field1226 -= arg11.field1234 * arg5;
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
        arg11.field1233 += arg11.field1220 * arg5;
        arg11.field1226 += arg11.field1234 * arg5;
        arg11.field1224 = arg6;
        arg11.field1231 = arg4;
        return arg5;
    }

    @ObfuscatedName("bi.bn(II[B[IIIIIIIIIILbi;II)I")
    public static int method1288(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1224 -= arg13.field1232 * arg5;
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
        arg13.field1224 += arg13.field1232 * var26;
        arg13.field1233 = arg6;
        arg13.field1226 = arg7;
        arg13.field1231 = arg4;
        return var26;
    }
}
