package deob;

@ObfuscatedName("bg")
public class class65 extends class67 {

    @ObfuscatedName("bg.i")
    public int field1253;

    @ObfuscatedName("bg.v")
    public int field1243;

    @ObfuscatedName("bg.f")
    public int field1242;

    @ObfuscatedName("bg.h")
    public int field1245;

    @ObfuscatedName("bg.a")
    public int field1246;

    @ObfuscatedName("bg.s")
    public int field1248;

    @ObfuscatedName("bg.p")
    public int field1249;

    @ObfuscatedName("bg.r")
    public int field1250;

    @ObfuscatedName("bg.k")
    public int field1254;

    @ObfuscatedName("bg.d")
    public int field1251;

    @ObfuscatedName("bg.n")
    public boolean field1252;

    @ObfuscatedName("bg.z")
    public int field1244;

    @ObfuscatedName("bg.c")
    public int field1247;

    @ObfuscatedName("bg.b")
    public int field1255;

    @ObfuscatedName("bg.g")
    public int field1256;

    @ObfuscatedName("bg.i(II)I")
    public static int method1342(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bg.v(II)I")
    public static int method1224(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bg.aa()I")
    public int method1225() {
        int var1 = this.field1246 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1250 == 0) {
            var2 -= this.field1253 * var2 / (((class63) this.field1260).field1229.length << 8);
        } else if (this.field1250 >= 0) {
            var2 -= this.field1254 * var2 / ((class63) this.field1260).field1229.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class65(class63 arg0, int arg1, int arg2) {
        this.field1260 = arg0;
        this.field1254 = arg0.field1227;
        this.field1251 = arg0.field1225;
        this.field1252 = arg0.field1228;
        this.field1243 = arg1;
        this.field1242 = arg2;
        this.field1245 = 8192;
        this.field1253 = 0;
        this.method1231();
    }

    public class65(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1260 = arg0;
        this.field1254 = arg0.field1227;
        this.field1251 = arg0.field1225;
        this.field1252 = arg0.field1228;
        this.field1243 = arg1;
        this.field1242 = arg2;
        this.field1245 = arg3;
        this.field1253 = 0;
        this.method1231();
    }

    @ObfuscatedName("bg.f(Lbk;II)Lbg;")
    public static class65 method1228(class63 arg0, int arg1, int arg2) {
        return arg0.field1229 == null || arg0.field1229.length == 0 ? null : new class65(arg0, (int) ((long) arg0.field1226 * 256L * (long) arg1 / (long) (Statics.field1192 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bg.h(Lbk;III)Lbg;")
    public static class65 method1229(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1229 == null || arg0.field1229.length == 0 ? null : new class65(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bg.a()V")
    public void method1231() {
        this.field1246 = this.field1242;
        this.field1248 = method1342(this.field1242, this.field1245);
        this.field1249 = method1224(this.field1242, this.field1245);
    }

    @ObfuscatedName("bg.d(I)V")
    public synchronized void method1236(int arg0) {
        this.field1250 = arg0;
    }

    @ObfuscatedName("bg.z(I)V")
    public synchronized void method1232(int arg0) {
        this.method1234(arg0 << 6, this.method1297());
    }

    @ObfuscatedName("bg.c(I)V")
    public synchronized void method1233(int arg0) {
        this.method1234(arg0, this.method1297());
    }

    @ObfuscatedName("bg.b(II)V")
    public synchronized void method1234(int arg0, int arg1) {
        this.field1242 = arg0;
        this.field1245 = arg1;
        this.field1244 = 0;
        this.method1231();
    }

    @ObfuscatedName("bg.w()I")
    public synchronized int method1223() {
        return this.field1242 == Integer.MIN_VALUE ? 0 : this.field1242;
    }

    @ObfuscatedName("bg.g()I")
    public synchronized int method1297() {
        return this.field1245 < 0 ? -1 : this.field1245;
    }

    @ObfuscatedName("bg.x(I)V")
    public synchronized void method1237(int arg0) {
        int var2 = ((class63) this.field1260).field1229.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1253 = arg0;
    }

    @ObfuscatedName("bg.o(Z)V")
    public synchronized void method1299(boolean arg0) {
        this.field1243 = (this.field1243 >>> 31) + (this.field1243 ^ this.field1243 >> 31);
        if (arg0) {
            this.field1243 = -this.field1243;
        }
    }

    @ObfuscatedName("bg.l()V")
    public void method1348() {
        if (this.field1244 == 0) {
            return;
        }
        if (this.field1242 == Integer.MIN_VALUE) {
            this.field1242 = 0;
        }
        this.field1244 = 0;
        this.method1231();
    }

    @ObfuscatedName("bg.j(II)V")
    public synchronized void method1240(int arg0, int arg1) {
        this.method1241(arg0, arg1, this.method1297());
    }

    @ObfuscatedName("bg.m(III)V")
    public synchronized void method1241(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1234(arg1, arg2);
            return;
        }
        int var4 = method1342(arg1, arg2);
        int var5 = method1224(arg1, arg2);
        if (this.field1248 == var4 && this.field1249 == var5) {
            this.field1244 = 0;
            return;
        }
        int var6 = arg1 - this.field1246;
        if (this.field1246 - arg1 > var6) {
            var6 = this.field1246 - arg1;
        }
        if (var4 - this.field1248 > var6) {
            var6 = var4 - this.field1248;
        }
        if (this.field1248 - var4 > var6) {
            var6 = this.field1248 - var4;
        }
        if (var5 - this.field1249 > var6) {
            var6 = var5 - this.field1249;
        }
        if (this.field1249 - var5 > var6) {
            var6 = this.field1249 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1244 = arg0;
        this.field1242 = arg1;
        this.field1245 = arg2;
        this.field1247 = (arg1 - this.field1246) / arg0;
        this.field1255 = (var4 - this.field1248) / arg0;
        this.field1256 = (var5 - this.field1249) / arg0;
    }

    @ObfuscatedName("bg.e(I)V")
    public synchronized void method1242(int arg0) {
        if (arg0 == 0) {
            this.method1233(0);
            this.method3624();
        } else if (this.field1248 == 0 && this.field1249 == 0) {
            this.field1244 = 0;
            this.field1242 = 0;
            this.field1246 = 0;
            this.method3624();
        } else {
            int var2 = -this.field1246;
            if (this.field1246 > var2) {
                var2 = this.field1246;
            }
            if (-this.field1248 > var2) {
                var2 = -this.field1248;
            }
            if (this.field1248 > var2) {
                var2 = this.field1248;
            }
            if (-this.field1249 > var2) {
                var2 = -this.field1249;
            }
            if (this.field1249 > var2) {
                var2 = this.field1249;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1244 = arg0;
            this.field1242 = Integer.MIN_VALUE;
            this.field1247 = -this.field1246 / arg0;
            this.field1255 = -this.field1248 / arg0;
            this.field1256 = -this.field1249 / arg0;
        }
    }

    @ObfuscatedName("bg.u(I)V")
    public synchronized void method1243(int arg0) {
        if (this.field1243 < 0) {
            this.field1243 = -arg0;
        } else {
            this.field1243 = arg0;
        }
    }

    @ObfuscatedName("bg.y()I")
    public synchronized int method1244() {
        return this.field1243 < 0 ? -this.field1243 : this.field1243;
    }

    @ObfuscatedName("bg.t()Z")
    public boolean method1289() {
        return this.field1253 < 0 || this.field1253 >= ((class63) this.field1260).field1229.length << 8;
    }

    @ObfuscatedName("bg.q()Z")
    public boolean method1280() {
        return this.field1244 != 0;
    }

    @ObfuscatedName("bg.s()Lbe;")
    public class67 method1080() {
        return null;
    }

    @ObfuscatedName("bg.p()Lbe;")
    public class67 method1081() {
        return null;
    }

    @ObfuscatedName("bg.r()I")
    public int method1082() {
        return this.field1242 == 0 && this.field1244 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bg.k([III)V")
    public synchronized void method1079(int[] arg0, int arg1, int arg2) {
        if (this.field1242 == 0 && this.field1244 == 0) {
            this.method1074(arg2);
            return;
        }
        class63 var4 = (class63) this.field1260;
        int var5 = this.field1254 << 8;
        int var6 = this.field1251 << 8;
        int var7 = var4.field1229.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1250 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1253 < 0) {
            if (this.field1243 <= 0) {
                this.method1348();
                this.method3624();
                return;
            }
            this.field1253 = 0;
        }
        if (this.field1253 >= var7) {
            if (this.field1243 >= 0) {
                this.method1348();
                this.method3624();
                return;
            }
            this.field1253 = var7 - 1;
        }
        if (this.field1250 >= 0) {
            if (this.field1250 > 0) {
                if (this.field1252) {
                    label131: {
                        if (this.field1243 < 0) {
                            var9 = this.method1248(arg0, arg1, var5, var10, var4.field1229[this.field1254]);
                            if (this.field1253 >= var5) {
                                return;
                            }
                            this.field1253 = var5 + var5 - 1 - this.field1253;
                            this.field1243 = -this.field1243;
                            if (--this.field1250 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1353(arg0, var9, var6, var10, var4.field1229[this.field1251 - 1]);
                            if (this.field1253 < var6) {
                                return;
                            }
                            this.field1253 = var6 + var6 - 1 - this.field1253;
                            this.field1243 = -this.field1243;
                            if (--this.field1250 == 0) {
                                break;
                            }
                            var9 = this.method1248(arg0, var9, var5, var10, var4.field1229[this.field1254]);
                            if (this.field1253 >= var5) {
                                return;
                            }
                            this.field1253 = var5 + var5 - 1 - this.field1253;
                            this.field1243 = -this.field1243;
                        } while (--this.field1250 != 0);
                    }
                } else if (this.field1243 < 0) {
                    while (true) {
                        var9 = this.method1248(arg0, var9, var5, var10, var4.field1229[this.field1251 - 1]);
                        if (this.field1253 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1253) / var8;
                        if (var12 >= this.field1250) {
                            this.field1253 += this.field1250 * var8;
                            this.field1250 = 0;
                            break;
                        }
                        this.field1253 += var8 * var12;
                        this.field1250 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1353(arg0, var9, var6, var10, var4.field1229[this.field1254]);
                        if (this.field1253 < var6) {
                            return;
                        }
                        int var13 = (this.field1253 - var5) / var8;
                        if (var13 >= this.field1250) {
                            this.field1253 -= this.field1250 * var8;
                            this.field1250 = 0;
                            break;
                        }
                        this.field1253 -= var8 * var13;
                        this.field1250 -= var13;
                    }
                }
            }
            if (this.field1243 < 0) {
                this.method1248(arg0, var9, 0, var10, 0);
                if (this.field1253 < 0) {
                    this.field1253 = -1;
                    this.method1348();
                    this.method3624();
                }
            } else {
                this.method1353(arg0, var9, var7, var10, 0);
                if (this.field1253 >= var7) {
                    this.field1253 = var7;
                    this.method1348();
                    this.method3624();
                }
            }
        } else if (this.field1252) {
            if (this.field1243 < 0) {
                var9 = this.method1248(arg0, arg1, var5, var10, var4.field1229[this.field1254]);
                if (this.field1253 >= var5) {
                    return;
                }
                this.field1253 = var5 + var5 - 1 - this.field1253;
                this.field1243 = -this.field1243;
            }
            while (true) {
                int var11 = this.method1353(arg0, var9, var6, var10, var4.field1229[this.field1251 - 1]);
                if (this.field1253 < var6) {
                    return;
                }
                this.field1253 = var6 + var6 - 1 - this.field1253;
                this.field1243 = -this.field1243;
                var9 = this.method1248(arg0, var11, var5, var10, var4.field1229[this.field1254]);
                if (this.field1253 >= var5) {
                    return;
                }
                this.field1253 = var5 + var5 - 1 - this.field1253;
                this.field1243 = -this.field1243;
            }
        } else if (this.field1243 < 0) {
            while (true) {
                var9 = this.method1248(arg0, var9, var5, var10, var4.field1229[this.field1251 - 1]);
                if (this.field1253 >= var5) {
                    return;
                }
                this.field1253 = var6 - 1 - (var6 - 1 - this.field1253) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1353(arg0, var9, var6, var10, var4.field1229[this.field1254]);
                if (this.field1253 < var6) {
                    return;
                }
                this.field1253 = (this.field1253 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bg.n(I)V")
    public synchronized void method1074(int arg0) {
        if (this.field1244 > 0) {
            if (arg0 >= this.field1244) {
                if (this.field1242 == Integer.MIN_VALUE) {
                    this.field1242 = 0;
                    this.field1249 = 0;
                    this.field1248 = 0;
                    this.field1246 = 0;
                    this.method3624();
                    arg0 = this.field1244;
                }
                this.field1244 = 0;
                this.method1231();
            } else {
                this.field1246 += this.field1247 * arg0;
                this.field1248 += this.field1255 * arg0;
                this.field1249 += this.field1256 * arg0;
                this.field1244 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1260;
        int var3 = this.field1254 << 8;
        int var4 = this.field1251 << 8;
        int var5 = var2.field1229.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1250 = 0;
        }
        if (this.field1253 < 0) {
            if (this.field1243 <= 0) {
                this.method1348();
                this.method3624();
                return;
            }
            this.field1253 = 0;
        }
        if (this.field1253 >= var5) {
            if (this.field1243 >= 0) {
                this.method1348();
                this.method3624();
                return;
            }
            this.field1253 = var5 - 1;
        }
        this.field1253 += this.field1243 * arg0;
        if (this.field1250 >= 0) {
            if (this.field1250 > 0) {
                if (this.field1252) {
                    label121: {
                        if (this.field1243 < 0) {
                            if (this.field1253 >= var3) {
                                return;
                            }
                            this.field1253 = var3 + var3 - 1 - this.field1253;
                            this.field1243 = -this.field1243;
                            if (--this.field1250 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1253 < var4) {
                                return;
                            }
                            this.field1253 = var4 + var4 - 1 - this.field1253;
                            this.field1243 = -this.field1243;
                            if (--this.field1250 == 0) {
                                break;
                            }
                            if (this.field1253 >= var3) {
                                return;
                            }
                            this.field1253 = var3 + var3 - 1 - this.field1253;
                            this.field1243 = -this.field1243;
                        } while (--this.field1250 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1243 < 0) {
                            if (this.field1253 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1253) / var6;
                            if (var7 >= this.field1250) {
                                this.field1253 += this.field1250 * var6;
                                this.field1250 = 0;
                                break label153;
                            }
                            this.field1253 += var6 * var7;
                            this.field1250 -= var7;
                        } else if (this.field1253 >= var4) {
                            int var8 = (this.field1253 - var3) / var6;
                            if (var8 >= this.field1250) {
                                this.field1253 -= this.field1250 * var6;
                                this.field1250 = 0;
                                break label153;
                            }
                            this.field1253 -= var6 * var8;
                            this.field1250 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1243 < 0) {
                if (this.field1253 < 0) {
                    this.field1253 = -1;
                    this.method1348();
                    this.method3624();
                }
            } else if (this.field1253 >= var5) {
                this.field1253 = var5;
                this.method1348();
                this.method3624();
            }
        } else if (this.field1252) {
            if (this.field1243 < 0) {
                if (this.field1253 >= var3) {
                    return;
                }
                this.field1253 = var3 + var3 - 1 - this.field1253;
                this.field1243 = -this.field1243;
            }
            while (this.field1253 >= var4) {
                this.field1253 = var4 + var4 - 1 - this.field1253;
                this.field1243 = -this.field1243;
                if (this.field1253 >= var3) {
                    return;
                }
                this.field1253 = var3 + var3 - 1 - this.field1253;
                this.field1243 = -this.field1243;
            }
        } else if (this.field1243 < 0) {
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

    @ObfuscatedName("bg.ak([IIIII)I")
    public int method1353(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1244 > 0) {
                int var6 = this.field1244 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1244 += arg1;
                if (this.field1243 == 256 && (this.field1253 & 0xFF) == 0) {
                    if (Statics.field1175) {
                        arg1 = method1250(0, ((class63) this.field1260).field1229, arg0, this.field1253, arg1, this.field1248, this.field1249, this.field1255, this.field1256, 0, var6, arg2, this);
                    } else {
                        arg1 = method1263(((class63) this.field1260).field1229, arg0, this.field1253, arg1, this.field1246, this.field1247, 0, var6, arg2, this);
                    }
                } else if (Statics.field1175) {
                    arg1 = method1262(0, 0, ((class63) this.field1260).field1229, arg0, this.field1253, arg1, this.field1248, this.field1249, this.field1255, this.field1256, 0, var6, arg2, this, this.field1243, arg4);
                } else {
                    arg1 = method1261(0, 0, ((class63) this.field1260).field1229, arg0, this.field1253, arg1, this.field1246, this.field1247, 0, var6, arg2, this, this.field1243, arg4);
                }
                this.field1244 -= arg1;
                if (this.field1244 != 0) {
                    return arg1;
                }
                if (!this.method1226()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1243 == 256 && (this.field1253 & 0xFF) == 0) {
                if (Statics.field1175) {
                    return method1251(0, ((class63) this.field1260).field1229, arg0, this.field1253, arg1, this.field1248, this.field1249, 0, arg3, arg2, this);
                }
                return method1366(((class63) this.field1260).field1229, arg0, this.field1253, arg1, this.field1246, 0, arg3, arg2, this);
            }
            if (Statics.field1175) {
                return method1254(0, 0, ((class63) this.field1260).field1229, arg0, this.field1253, arg1, this.field1248, this.field1249, 0, arg3, arg2, this, this.field1243, arg4);
            }
            return method1253(0, 0, ((class63) this.field1260).field1229, arg0, this.field1253, arg1, this.field1246, 0, arg3, arg2, this, this.field1243, arg4);
        }
    }

    @ObfuscatedName("bg.af([IIIII)I")
    public int method1248(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1244 > 0) {
                int var6 = this.field1244 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1244 += arg1;
                if (this.field1243 == -256 && (this.field1253 & 0xFF) == 0) {
                    if (Statics.field1175) {
                        arg1 = method1260(0, ((class63) this.field1260).field1229, arg0, this.field1253, arg1, this.field1248, this.field1249, this.field1255, this.field1256, 0, var6, arg2, this);
                    } else {
                        arg1 = method1259(((class63) this.field1260).field1229, arg0, this.field1253, arg1, this.field1246, this.field1247, 0, var6, arg2, this);
                    }
                } else if (Statics.field1175) {
                    arg1 = method1264(0, 0, ((class63) this.field1260).field1229, arg0, this.field1253, arg1, this.field1248, this.field1249, this.field1255, this.field1256, 0, var6, arg2, this, this.field1243, arg4);
                } else {
                    arg1 = method1275(0, 0, ((class63) this.field1260).field1229, arg0, this.field1253, arg1, this.field1246, this.field1247, 0, var6, arg2, this, this.field1243, arg4);
                }
                this.field1244 -= arg1;
                if (this.field1244 != 0) {
                    return arg1;
                }
                if (!this.method1226()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1243 == -256 && (this.field1253 & 0xFF) == 0) {
                if (Statics.field1175) {
                    return method1252(0, ((class63) this.field1260).field1229, arg0, this.field1253, arg1, this.field1248, this.field1249, 0, arg3, arg2, this);
                }
                return method1354(((class63) this.field1260).field1229, arg0, this.field1253, arg1, this.field1246, 0, arg3, arg2, this);
            }
            if (Statics.field1175) {
                return method1256(0, 0, ((class63) this.field1260).field1229, arg0, this.field1253, arg1, this.field1248, this.field1249, 0, arg3, arg2, this, this.field1243, arg4);
            }
            return method1255(0, 0, ((class63) this.field1260).field1229, arg0, this.field1253, arg1, this.field1246, 0, arg3, arg2, this, this.field1243, arg4);
        }
    }

    @ObfuscatedName("bg.ah()Z")
    public boolean method1226() {
        int var1 = this.field1242;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1342(var1, this.field1245);
            var2 = method1224(var1, this.field1245);
        }
        if (this.field1246 != var1 || this.field1248 != var3 || this.field1249 != var2) {
            if (this.field1246 < var1) {
                this.field1247 = 1;
                this.field1244 = var1 - this.field1246;
            } else if (this.field1246 > var1) {
                this.field1247 = -1;
                this.field1244 = this.field1246 - var1;
            } else {
                this.field1247 = 0;
            }
            if (this.field1248 < var3) {
                this.field1255 = 1;
                if (this.field1244 == 0 || this.field1244 > var3 - this.field1248) {
                    this.field1244 = var3 - this.field1248;
                }
            } else if (this.field1248 > var3) {
                this.field1255 = -1;
                if (this.field1244 == 0 || this.field1244 > this.field1248 - var3) {
                    this.field1244 = this.field1248 - var3;
                }
            } else {
                this.field1255 = 0;
            }
            if (this.field1249 < var2) {
                this.field1256 = 1;
                if (this.field1244 == 0 || this.field1244 > var2 - this.field1249) {
                    this.field1244 = var2 - this.field1249;
                }
            } else if (this.field1249 > var2) {
                this.field1256 = -1;
                if (this.field1244 == 0 || this.field1244 > this.field1249 - var2) {
                    this.field1244 = this.field1249 - var2;
                }
            } else {
                this.field1256 = 0;
            }
            return false;
        } else if (this.field1242 == Integer.MIN_VALUE) {
            this.field1242 = 0;
            this.field1249 = 0;
            this.field1248 = 0;
            this.field1246 = 0;
            this.method3624();
            return true;
        } else {
            this.method1231();
            return false;
        }
    }

    @ObfuscatedName("bg.am([B[IIIIIIILbg;)I")
    public static int method1366(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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

    @ObfuscatedName("bg.aw(I[B[IIIIIIIILbg;)I")
    public static int method1251(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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

    @ObfuscatedName("bg.an([B[IIIIIIILbg;)I")
    public static int method1354(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class65 arg8) {
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

    @ObfuscatedName("bg.as(I[B[IIIIIIIILbg;)I")
    public static int method1252(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10) {
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

    @ObfuscatedName("bg.av(II[B[IIIIIIILbg;II)I")
    public static int method1253(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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

    @ObfuscatedName("bg.ao(II[B[IIIIIIIILbg;II)I")
    public static int method1254(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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

    @ObfuscatedName("bg.ad(II[B[IIIIIIILbg;II)I")
    public static int method1255(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class65 arg10, int arg11, int arg12) {
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

    @ObfuscatedName("bg.bi(II[B[IIIIIIIILbg;II)I")
    public static int method1256(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
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

    @ObfuscatedName("bg.bb([B[IIIIIIIILbg;)I")
    public static int method1263(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1248 += (var14 - arg3) * arg9.field1255;
        arg9.field1249 += (var14 - arg3) * arg9.field1256;
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
        arg9.field1246 = var12 >> 2;
        arg9.field1253 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.bp(I[B[IIIIIIIIIILbg;)I")
    public static int method1250(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1246 += (var19 - arg4) * arg12.field1247;
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
        arg12.field1248 = var15 >> 2;
        arg12.field1249 = var16 >> 2;
        arg12.field1253 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bg.bd([B[IIIIIIIILbg;)I")
    public static int method1259(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1248 += (var14 - arg3) * arg9.field1255;
        arg9.field1249 += (var14 - arg3) * arg9.field1256;
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
        arg9.field1246 = var12 >> 2;
        arg9.field1253 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.by(I[B[IIIIIIIIIILbg;)I")
    public static int method1260(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class65 arg12) {
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
        arg12.field1246 += (var19 - arg4) * arg12.field1247;
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
        arg12.field1248 = var15 >> 2;
        arg12.field1249 = var16 >> 2;
        arg12.field1253 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bg.bc(II[B[IIIIIIIILbg;II)I")
    public static int method1261(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1248 -= arg11.field1255 * arg5;
        arg11.field1249 -= arg11.field1256 * arg5;
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
        arg11.field1248 += arg11.field1255 * arg5;
        arg11.field1249 += arg11.field1256 * arg5;
        arg11.field1246 = arg6;
        arg11.field1253 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.bs(II[B[IIIIIIIIIILbg;II)I")
    public static int method1262(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1246 -= arg13.field1247 * arg5;
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
        arg13.field1246 += arg13.field1247 * var27;
        arg13.field1248 = arg6;
        arg13.field1249 = arg7;
        arg13.field1253 = arg4;
        return var27;
    }

    @ObfuscatedName("bg.bw(II[B[IIIIIIIILbg;II)I")
    public static int method1275(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class65 arg11, int arg12, int arg13) {
        arg11.field1248 -= arg11.field1255 * arg5;
        arg11.field1249 -= arg11.field1256 * arg5;
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
        arg11.field1248 += arg11.field1255 * arg5;
        arg11.field1249 += arg11.field1256 * arg5;
        arg11.field1246 = arg6;
        arg11.field1253 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.bn(II[B[IIIIIIIIIILbg;II)I")
    public static int method1264(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class65 arg13, int arg14, int arg15) {
        arg13.field1246 -= arg13.field1247 * arg5;
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
        arg13.field1246 += arg13.field1247 * var26;
        arg13.field1248 = arg6;
        arg13.field1249 = arg7;
        arg13.field1253 = arg4;
        return var26;
    }
}
