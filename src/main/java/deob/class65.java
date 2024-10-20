package deob;

@ObfuscatedName("bp")
public class class65 extends class67 {

    @ObfuscatedName("bp.y")
    public int field1253;

    @ObfuscatedName("bp.d")
    public int field1248;

    @ObfuscatedName("bp.g")
    public int field1249;

    @ObfuscatedName("bp.e")
    public int field1251;

    @ObfuscatedName("bp.c")
    public int field1252;

    @ObfuscatedName("bp.a")
    public int field1260;

    @ObfuscatedName("bp.q")
    public int field1254;

    @ObfuscatedName("bp.m")
    public int field1255;

    @ObfuscatedName("bp.n")
    public int field1250;

    @ObfuscatedName("bp.k")
    public int field1257;

    @ObfuscatedName("bp.o")
    public boolean field1258;

    @ObfuscatedName("bp.f")
    public int field1259;

    @ObfuscatedName("bp.s")
    public int field1256;

    @ObfuscatedName("bp.z")
    public int field1261;

    @ObfuscatedName("bp.b")
    public int field1262;

    @ObfuscatedName("bp.y(II)I")
    public static int method1367(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bp.d(II)I")
    public static int method1267(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bp.am()I")
    public int method1309() {
        int var1 = this.field1252 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1255 == 0) {
            var2 -= this.field1253 * var2 / (((class63) this.field1266).field1235.length << 8);
        } else if (this.field1255 >= 0) {
            var2 -= this.field1250 * var2 / ((class63) this.field1266).field1235.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class65(class63 arg0, int arg1, int arg2) {
        this.field1266 = arg0;
        this.field1250 = arg0.field1233;
        this.field1257 = arg0.field1234;
        this.field1258 = arg0.field1231;
        this.field1248 = arg1;
        this.field1249 = arg2;
        this.field1251 = 8192;
        this.field1253 = 0;
        this.method1298();
    }

    public class65(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1266 = arg0;
        this.field1250 = arg0.field1233;
        this.field1257 = arg0.field1234;
        this.field1258 = arg0.field1231;
        this.field1248 = arg1;
        this.field1249 = arg2;
        this.field1251 = arg3;
        this.field1253 = 0;
        this.method1298();
    }

    @ObfuscatedName("bp.g(Lbe;II)Lbp;")
    public static class65 method1389(class63 arg0, int arg1, int arg2) {
        return arg0.field1235 == null || arg0.field1235.length == 0 ? null : new class65(arg0, (int) ((long) arg0.field1232 * 256L * (long) arg1 / (long) (Statics.field2644 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bp.w(Lbe;III)Lbp;")
    public static class65 method1271(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1235 == null || arg0.field1235.length == 0 ? null : new class65(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bp.e()V")
    public void method1298() {
        this.field1252 = this.field1249;
        this.field1260 = method1367(this.field1249, this.field1251);
        this.field1254 = method1267(this.field1249, this.field1251);
    }

    @ObfuscatedName("bp.n(I)V")
    public synchronized void method1277(int arg0) {
        this.field1255 = arg0;
    }

    @ObfuscatedName("bp.o(I)V")
    public synchronized void method1274(int arg0) {
        this.method1276(arg0 << 6, this.method1270());
    }

    @ObfuscatedName("bp.f(I)V")
    public synchronized void method1305(int arg0) {
        this.method1276(arg0, this.method1270());
    }

    @ObfuscatedName("bp.s(II)V")
    public synchronized void method1276(int arg0, int arg1) {
        this.field1249 = arg0;
        this.field1251 = arg1;
        this.field1259 = 0;
        this.method1298();
    }

    @ObfuscatedName("bp.z()I")
    public synchronized int method1288() {
        return this.field1249 == Integer.MIN_VALUE ? 0 : this.field1249;
    }

    @ObfuscatedName("bp.b()I")
    public synchronized int method1270() {
        return this.field1251 < 0 ? -1 : this.field1251;
    }

    @ObfuscatedName("bp.p(I)V")
    public synchronized void method1279(int arg0) {
        int var2 = ((class63) this.field1266).field1235.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1253 = arg0;
    }

    @ObfuscatedName("bp.r(Z)V")
    public synchronized void method1280(boolean arg0) {
        this.field1248 = (this.field1248 >>> 31) + (this.field1248 ^ this.field1248 >> 31);
        if (arg0) {
            this.field1248 = -this.field1248;
        }
    }

    @ObfuscatedName("bp.x()V")
    public void method1299() {
        if (this.field1259 == 0) {
            return;
        }
        if (this.field1249 == Integer.MIN_VALUE) {
            this.field1249 = 0;
        }
        this.field1259 = 0;
        this.method1298();
    }

    @ObfuscatedName("bp.h(II)V")
    public synchronized void method1307(int arg0, int arg1) {
        this.method1395(arg0, arg1, this.method1270());
    }

    @ObfuscatedName("bp.j(III)V")
    public synchronized void method1395(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1276(arg1, arg2);
            return;
        }
        int var4 = method1367(arg1, arg2);
        int var5 = method1267(arg1, arg2);
        if (this.field1260 == var4 && this.field1254 == var5) {
            this.field1259 = 0;
            return;
        }
        int var6 = arg1 - this.field1252;
        if (this.field1252 - arg1 > var6) {
            var6 = this.field1252 - arg1;
        }
        if (var4 - this.field1260 > var6) {
            var6 = var4 - this.field1260;
        }
        if (this.field1260 - var4 > var6) {
            var6 = this.field1260 - var4;
        }
        if (var5 - this.field1254 > var6) {
            var6 = var5 - this.field1254;
        }
        if (this.field1254 - var5 > var6) {
            var6 = this.field1254 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1259 = arg0;
        this.field1249 = arg1;
        this.field1251 = arg2;
        this.field1256 = (arg1 - this.field1252) / arg0;
        this.field1261 = (var4 - this.field1260) / arg0;
        this.field1262 = (var5 - this.field1254) / arg0;
    }

    @ObfuscatedName("bp.v(I)V")
    public synchronized void method1308(int arg0) {
        if (arg0 == 0) {
            this.method1305(0);
            this.method3588();
        } else if (this.field1260 == 0 && this.field1254 == 0) {
            this.field1259 = 0;
            this.field1249 = 0;
            this.field1252 = 0;
            this.method3588();
        } else {
            int var2 = -this.field1252;
            if (this.field1252 > var2) {
                var2 = this.field1252;
            }
            if (-this.field1260 > var2) {
                var2 = -this.field1260;
            }
            if (this.field1260 > var2) {
                var2 = this.field1260;
            }
            if (-this.field1254 > var2) {
                var2 = -this.field1254;
            }
            if (this.field1254 > var2) {
                var2 = this.field1254;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1259 = arg0;
            this.field1249 = Integer.MIN_VALUE;
            this.field1256 = -this.field1252 / arg0;
            this.field1261 = -this.field1260 / arg0;
            this.field1262 = -this.field1254 / arg0;
        }
    }

    @ObfuscatedName("bp.l(I)V")
    public synchronized void method1337(int arg0) {
        if (this.field1248 < 0) {
            this.field1248 = -arg0;
        } else {
            this.field1248 = arg0;
        }
    }

    @ObfuscatedName("bp.u()I")
    public synchronized int method1285() {
        return this.field1248 < 0 ? -this.field1248 : this.field1248;
    }

    @ObfuscatedName("bp.t()Z")
    public boolean method1286() {
        return this.field1253 < 0 || this.field1253 >= ((class63) this.field1266).field1235.length << 8;
    }

    @ObfuscatedName("bp.aj()Z")
    public boolean method1287() {
        return this.field1259 != 0;
    }

    @ObfuscatedName("bp.c()Lbs;")
    public class67 method1123() {
        return null;
    }

    @ObfuscatedName("bp.a()Lbs;")
    public class67 method1118() {
        return null;
    }

    @ObfuscatedName("bp.q()I")
    public int method1145() {
        return this.field1249 == 0 && this.field1259 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bp.m([III)V")
    public synchronized void method1119(int[] arg0, int arg1, int arg2) {
        if (this.field1249 == 0 && this.field1259 == 0) {
            this.method1134(arg2);
            return;
        }
        class63 var4 = (class63) this.field1266;
        int var5 = this.field1250 << 8;
        int var6 = this.field1257 << 8;
        int var7 = var4.field1235.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1255 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1253 < 0) {
            if (this.field1248 <= 0) {
                this.method1299();
                this.method3588();
                return;
            }
            this.field1253 = 0;
        }
        if (this.field1253 >= var7) {
            if (this.field1248 >= 0) {
                this.method1299();
                this.method3588();
                return;
            }
            this.field1253 = var7 - 1;
        }
        if (this.field1255 >= 0) {
            if (this.field1255 > 0) {
                if (this.field1258) {
                    label131: {
                        if (this.field1248 < 0) {
                            var9 = this.method1275(arg0, arg1, var5, var10, var4.field1235[this.field1250]);
                            if (this.field1253 >= var5) {
                                return;
                            }
                            this.field1253 = var5 + var5 - 1 - this.field1253;
                            this.field1248 = -this.field1248;
                            if (--this.field1255 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1290(arg0, var9, var6, var10, var4.field1235[this.field1257 - 1]);
                            if (this.field1253 < var6) {
                                return;
                            }
                            this.field1253 = var6 + var6 - 1 - this.field1253;
                            this.field1248 = -this.field1248;
                            if (--this.field1255 == 0) {
                                break;
                            }
                            var9 = this.method1275(arg0, var9, var5, var10, var4.field1235[this.field1250]);
                            if (this.field1253 >= var5) {
                                return;
                            }
                            this.field1253 = var5 + var5 - 1 - this.field1253;
                            this.field1248 = -this.field1248;
                        } while (--this.field1255 != 0);
                    }
                } else if (this.field1248 < 0) {
                    while (true) {
                        var9 = this.method1275(arg0, var9, var5, var10, var4.field1235[this.field1257 - 1]);
                        if (this.field1253 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1253) / var8;
                        if (var12 >= this.field1255) {
                            this.field1253 += this.field1255 * var8;
                            this.field1255 = 0;
                            break;
                        }
                        this.field1253 += var8 * var12;
                        this.field1255 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1290(arg0, var9, var6, var10, var4.field1235[this.field1250]);
                        if (this.field1253 < var6) {
                            return;
                        }
                        int var13 = (this.field1253 - var5) / var8;
                        if (var13 >= this.field1255) {
                            this.field1253 -= this.field1255 * var8;
                            this.field1255 = 0;
                            break;
                        }
                        this.field1253 -= var8 * var13;
                        this.field1255 -= var13;
                    }
                }
            }
            if (this.field1248 < 0) {
                this.method1275(arg0, var9, 0, var10, 0);
                if (this.field1253 < 0) {
                    this.field1253 = -1;
                    this.method1299();
                    this.method3588();
                }
            } else {
                this.method1290(arg0, var9, var7, var10, 0);
                if (this.field1253 >= var7) {
                    this.field1253 = var7;
                    this.method1299();
                    this.method3588();
                }
            }
        } else if (this.field1258) {
            if (this.field1248 < 0) {
                var9 = this.method1275(arg0, arg1, var5, var10, var4.field1235[this.field1250]);
                if (this.field1253 >= var5) {
                    return;
                }
                this.field1253 = var5 + var5 - 1 - this.field1253;
                this.field1248 = -this.field1248;
            }
            while (true) {
                int var11 = this.method1290(arg0, var9, var6, var10, var4.field1235[this.field1257 - 1]);
                if (this.field1253 < var6) {
                    return;
                }
                this.field1253 = var6 + var6 - 1 - this.field1253;
                this.field1248 = -this.field1248;
                var9 = this.method1275(arg0, var11, var5, var10, var4.field1235[this.field1250]);
                if (this.field1253 >= var5) {
                    return;
                }
                this.field1253 = var5 + var5 - 1 - this.field1253;
                this.field1248 = -this.field1248;
            }
        } else if (this.field1248 < 0) {
            while (true) {
                var9 = this.method1275(arg0, var9, var5, var10, var4.field1235[this.field1257 - 1]);
                if (this.field1253 >= var5) {
                    return;
                }
                this.field1253 = var6 - 1 - (var6 - 1 - this.field1253) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1290(arg0, var9, var6, var10, var4.field1235[this.field1250]);
                if (this.field1253 < var6) {
                    return;
                }
                this.field1253 = (this.field1253 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bp.k(I)V")
    public synchronized void method1134(int arg0) {
        if (this.field1259 > 0) {
            if (arg0 >= this.field1259) {
                if (this.field1249 == Integer.MIN_VALUE) {
                    this.field1249 = 0;
                    this.field1254 = 0;
                    this.field1260 = 0;
                    this.field1252 = 0;
                    this.method3588();
                    arg0 = this.field1259;
                }
                this.field1259 = 0;
                this.method1298();
            } else {
                this.field1252 += this.field1256 * arg0;
                this.field1260 += this.field1261 * arg0;
                this.field1254 += this.field1262 * arg0;
                this.field1259 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1266;
        int var3 = this.field1250 << 8;
        int var4 = this.field1257 << 8;
        int var5 = var2.field1235.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1255 = 0;
        }
        if (this.field1253 < 0) {
            if (this.field1248 <= 0) {
                this.method1299();
                this.method3588();
                return;
            }
            this.field1253 = 0;
        }
        if (this.field1253 >= var5) {
            if (this.field1248 >= 0) {
                this.method1299();
                this.method3588();
                return;
            }
            this.field1253 = var5 - 1;
        }
        this.field1253 += this.field1248 * arg0;
        if (this.field1255 >= 0) {
            if (this.field1255 > 0) {
                if (this.field1258) {
                    label121: {
                        if (this.field1248 < 0) {
                            if (this.field1253 >= var3) {
                                return;
                            }
                            this.field1253 = var3 + var3 - 1 - this.field1253;
                            this.field1248 = -this.field1248;
                            if (--this.field1255 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1253 < var4) {
                                return;
                            }
                            this.field1253 = var4 + var4 - 1 - this.field1253;
                            this.field1248 = -this.field1248;
                            if (--this.field1255 == 0) {
                                break;
                            }
                            if (this.field1253 >= var3) {
                                return;
                            }
                            this.field1253 = var3 + var3 - 1 - this.field1253;
                            this.field1248 = -this.field1248;
                        } while (--this.field1255 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1248 < 0) {
                            if (this.field1253 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1253) / var6;
                            if (var7 >= this.field1255) {
                                this.field1253 += this.field1255 * var6;
                                this.field1255 = 0;
                                break label153;
                            }
                            this.field1253 += var6 * var7;
                            this.field1255 -= var7;
                        } else if (this.field1253 >= var4) {
                            int var8 = (this.field1253 - var3) / var6;
                            if (var8 >= this.field1255) {
                                this.field1253 -= this.field1255 * var6;
                                this.field1255 = 0;
                                break label153;
                            }
                            this.field1253 -= var6 * var8;
                            this.field1255 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1248 < 0) {
                if (this.field1253 < 0) {
                    this.field1253 = -1;
                    this.method1299();
                    this.method3588();
                }
            } else if (this.field1253 >= var5) {
                this.field1253 = var5;
                this.method1299();
                this.method3588();
            }
        } else if (this.field1258) {
            if (this.field1248 < 0) {
                if (this.field1253 >= var3) {
                    return;
                }
                this.field1253 = var3 + var3 - 1 - this.field1253;
                this.field1248 = -this.field1248;
            }
            while (this.field1253 >= var4) {
                this.field1253 = var4 + var4 - 1 - this.field1253;
                this.field1248 = -this.field1248;
                if (this.field1253 >= var3) {
                    return;
                }
                this.field1253 = var3 + var3 - 1 - this.field1253;
                this.field1248 = -this.field1248;
            }
        } else if (this.field1248 < 0) {
            if (this.field1253 >= var3) {
                return;
            }
            this.field1253 = var4 - 1 - (var4 - 1 - this.field1253) % var6;
        } else if (this.field1253 >= var4) {
            this.field1253 = (this.field1253 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bp.ay([IIIII)I")
    public int method1290(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1259 > 0) {
                int var6 = this.field1259 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1259 += arg1;
                if (this.field1248 == 256 && (this.field1253 & 0xFF) == 0) {
                    if (Statics.field1178) {
                        arg1 = method1302(0, ((class63) this.field1266).field1235, arg0, this.field1253, arg1, this.field1260, this.field1254, this.field1261, this.field1262, 0, var6, arg2, this);
                    } else {
                        arg1 = method1301(((class63) this.field1266).field1235, arg0, this.field1253, arg1, this.field1252, this.field1256, 0, var6, arg2, this);
                    }
                } else if (Statics.field1178) {
                    arg1 = method1306(0, 0, ((class63) this.field1266).field1235, arg0, this.field1253, arg1, this.field1260, this.field1254, this.field1261, this.field1262, 0, var6, arg2, this, this.field1248, arg4);
                } else {
                    arg1 = method1346(0, 0, ((class63) this.field1266).field1235, arg0, this.field1253, arg1, this.field1252, this.field1256, 0, var6, arg2, this, this.field1248, arg4);
                }
                this.field1259 -= arg1;
                if (this.field1259 != 0) {
                    return arg1;
                }
                if (!this.method1292()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1248 == 256 && (this.field1253 & 0xFF) == 0) {
                if (Statics.field1178) {
                    return method1294(0, ((class63) this.field1266).field1235, arg0, this.field1253, arg1, this.field1260, this.field1254, 0, arg3, arg2, this);
                }
                return method1376(((class63) this.field1266).field1235, arg0, this.field1253, arg1, this.field1252, 0, arg3, arg2, this);
            }
            if (Statics.field1178) {
                return method1396(0, 0, ((class63) this.field1266).field1235, arg0, this.field1253, arg1, this.field1260, this.field1254, 0, arg3, arg2, this, this.field1248, arg4);
            }
            return method1297(0, 0, ((class63) this.field1266).field1235, arg0, this.field1253, arg1, this.field1252, 0, arg3, arg2, this, this.field1248, arg4);
        }
    }

    @ObfuscatedName("bp.af([IIIII)I")
    public int method1275(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1259 > 0) {
                int var6 = this.field1259 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1259 += arg1;
                if (this.field1248 == -256 && (this.field1253 & 0xFF) == 0) {
                    if (Statics.field1178) {
                        arg1 = method1304(0, ((class63) this.field1266).field1235, arg0, this.field1253, arg1, this.field1260, this.field1254, this.field1261, this.field1262, 0, var6, arg2, this);
                    } else {
                        arg1 = method1303(((class63) this.field1266).field1235, arg0, this.field1253, arg1, this.field1252, this.field1256, 0, var6, arg2, this);
                    }
                } else if (Statics.field1178) {
                    arg1 = method1328(0, 0, ((class63) this.field1266).field1235, arg0, this.field1253, arg1, this.field1260, this.field1254, this.field1261, this.field1262, 0, var6, arg2, this, this.field1248, arg4);
                } else {
                    arg1 = method1266(0, 0, ((class63) this.field1266).field1235, arg0, this.field1253, arg1, this.field1252, this.field1256, 0, var6, arg2, this, this.field1248, arg4);
                }
                this.field1259 -= arg1;
                if (this.field1259 != 0) {
                    return arg1;
                }
                if (!this.method1292()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1248 == -256 && (this.field1253 & 0xFF) == 0) {
                if (Statics.field1178) {
                    return method1296(0, ((class63) this.field1266).field1235, arg0, this.field1253, arg1, this.field1260, this.field1254, 0, arg3, arg2, this);
                }
                return method1295(((class63) this.field1266).field1235, arg0, this.field1253, arg1, this.field1252, 0, arg3, arg2, this);
            }
            if (Statics.field1178) {
                return method1300(0, 0, ((class63) this.field1266).field1235, arg0, this.field1253, arg1, this.field1260, this.field1254, 0, arg3, arg2, this, this.field1248, arg4);
            }
            return method1391(0, 0, ((class63) this.field1266).field1235, arg0, this.field1253, arg1, this.field1252, 0, arg3, arg2, this, this.field1248, arg4);
        }
    }

    @ObfuscatedName("bp.al()Z")
    public boolean method1292() {
        int var1 = this.field1249;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1367(var1, this.field1251);
            var2 = method1267(var1, this.field1251);
        }
        if (this.field1252 != var1 || this.field1260 != var3 || this.field1254 != var2) {
            if (this.field1252 < var1) {
                this.field1256 = 1;
                this.field1259 = var1 - this.field1252;
            } else if (this.field1252 > var1) {
                this.field1256 = -1;
                this.field1259 = this.field1252 - var1;
            } else {
                this.field1256 = 0;
            }
            if (this.field1260 < var3) {
                this.field1261 = 1;
                if (this.field1259 == 0 || this.field1259 > var3 - this.field1260) {
                    this.field1259 = var3 - this.field1260;
                }
            } else if (this.field1260 > var3) {
                this.field1261 = -1;
                if (this.field1259 == 0 || this.field1259 > this.field1260 - var3) {
                    this.field1259 = this.field1260 - var3;
                }
            } else {
                this.field1261 = 0;
            }
            if (this.field1254 < var2) {
                this.field1262 = 1;
                if (this.field1259 == 0 || this.field1259 > var2 - this.field1254) {
                    this.field1259 = var2 - this.field1254;
                }
            } else if (this.field1254 > var2) {
                this.field1262 = -1;
                if (this.field1259 == 0 || this.field1259 > this.field1254 - var2) {
                    this.field1259 = this.field1254 - var2;
                }
            } else {
                this.field1262 = 0;
            }
            return false;
        } else if (this.field1249 == Integer.MIN_VALUE) {
            this.field1249 = 0;
            this.field1254 = 0;
            this.field1260 = 0;
            this.field1252 = 0;
            this.method3588();
            return true;
        } else {
            this.method1298();
            return false;
        }
    }

    @ObfuscatedName("bp.az([B[IIIIIIILbp;)I")
    public static int method1376(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1253 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bp.ar(I[B[IIIIIIIILbp;)I")
    public static int method1294(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1253 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bp.as([B[IIIIIIILbp;)I")
    public static int method1295(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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
        arg8.field1253 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bp.an(I[B[IIIIIIIILbp;)I")
    public static int method1296(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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
        arg10.field1253 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bp.au(II[B[IIIIIIILbp;II)I")
    public static int method1297(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1253 = arg4;
        return arg5;
    }

    @ObfuscatedName("bp.av(II[B[IIIIIIIILbp;II)I")
    public static int method1396(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1253 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bp.ac(II[B[IIIIIIILbp;II)I")
    public static int method1391(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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
        arg10.field1253 = arg4;
        return arg5;
    }

    @ObfuscatedName("bp.ap(II[B[IIIIIIIILbp;II)I")
    public static int method1300(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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
        arg11.field1253 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bp.ad([B[IIIIIIIILbp;)I")
    public static int method1301(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1260 += (var14 - arg3) * arg9.field1261;
        arg9.field1254 += (var14 - arg3) * arg9.field1262;
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
        arg9.field1252 = var12 >> 2;
        arg9.field1253 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bp.ag(I[B[IIIIIIIIIILbp;)I")
    public static int method1302(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1252 += (var19 - arg4) * arg12.field1256;
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
        arg12.field1260 = var15 >> 2;
        arg12.field1254 = var16 >> 2;
        arg12.field1253 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bp.ax([B[IIIIIIIILbp;)I")
    public static int method1303(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1260 += (var14 - arg3) * arg9.field1261;
        arg9.field1254 += (var14 - arg3) * arg9.field1262;
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
        arg9.field1252 = var12 >> 2;
        arg9.field1253 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bp.at(I[B[IIIIIIIIIILbp;)I")
    public static int method1304(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1252 += (var19 - arg4) * arg12.field1256;
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
        arg12.field1260 = var15 >> 2;
        arg12.field1254 = var16 >> 2;
        arg12.field1253 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bp.bm(II[B[IIIIIIIILbp;II)I")
    public static int method1346(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1260 -= arg11.field1261 * arg5;
        arg11.field1254 -= arg11.field1262 * arg5;
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
        arg11.field1260 += arg11.field1261 * arg5;
        arg11.field1254 += arg11.field1262 * arg5;
        arg11.field1252 = arg6;
        arg11.field1253 = arg4;
        return arg5;
    }

    @ObfuscatedName("bp.bd(II[B[IIIIIIIIIILbp;II)I")
    public static int method1306(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1252 -= arg13.field1256 * arg5;
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
        arg13.field1252 += arg13.field1256 * var27;
        arg13.field1260 = arg6;
        arg13.field1254 = arg7;
        arg13.field1253 = arg4;
        return var27;
    }

    @ObfuscatedName("bp.bf(II[B[IIIIIIIILbp;II)I")
    public static int method1266(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1260 -= arg11.field1261 * arg5;
        arg11.field1254 -= arg11.field1262 * arg5;
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
        arg11.field1260 += arg11.field1261 * arg5;
        arg11.field1254 += arg11.field1262 * arg5;
        arg11.field1252 = arg6;
        arg11.field1253 = arg4;
        return arg5;
    }

    @ObfuscatedName("bp.bj(II[B[IIIIIIIIIILbp;II)I")
    public static int method1328(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1252 -= arg13.field1256 * arg5;
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
        arg13.field1252 += arg13.field1256 * var26;
        arg13.field1260 = arg6;
        arg13.field1254 = arg7;
        arg13.field1253 = arg4;
        return var26;
    }
}
