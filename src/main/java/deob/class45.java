package deob;

@ObfuscatedName("ag")
public class class45 extends class48 {

    @ObfuscatedName("ag.p")
    public int field1062;

    @ObfuscatedName("ag.i")
    public int field1051;

    @ObfuscatedName("ag.o")
    public int field1052;

    @ObfuscatedName("ag.n")
    public int field1053;

    @ObfuscatedName("ag.l")
    public int field1058;

    @ObfuscatedName("ag.v")
    public int field1055;

    @ObfuscatedName("ag.g")
    public int field1056;

    @ObfuscatedName("ag.x")
    public int field1057;

    @ObfuscatedName("ag.c")
    public int field1060;

    @ObfuscatedName("ag.f")
    public int field1059;

    @ObfuscatedName("ag.r")
    public boolean field1064;

    @ObfuscatedName("ag.d")
    public int field1061;

    @ObfuscatedName("ag.a")
    public int field1050;

    @ObfuscatedName("ag.q")
    public int field1063;

    @ObfuscatedName("ag.u")
    public int field1054;

    @ObfuscatedName("ag.p(II)I")
    public static int method1129(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ag.i(II)I")
    public static int method968(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ag.o()I")
    public int method969() {
        int var1 = this.field1058 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1057 == 0) {
            var2 -= this.field1062 * var2 / (((class63) this.field1073).field1242.length << 8);
        } else if (this.field1057 >= 0) {
            var2 -= this.field1060 * var2 / ((class63) this.field1073).field1242.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class45(class63 arg0, int arg1, int arg2) {
        this.field1073 = arg0;
        this.field1060 = arg0.field1243;
        this.field1059 = arg0.field1244;
        this.field1064 = arg0.field1245;
        this.field1051 = arg1;
        this.field1052 = arg2;
        this.field1053 = 8192;
        this.field1062 = 0;
        this.method973();
    }

    public class45(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1073 = arg0;
        this.field1060 = arg0.field1243;
        this.field1059 = arg0.field1244;
        this.field1064 = arg0.field1245;
        this.field1051 = arg1;
        this.field1052 = arg2;
        this.field1053 = arg3;
        this.field1062 = 0;
        this.method973();
    }

    @ObfuscatedName("ag.n(Lbj;II)Lag;")
    public static class45 method1130(class63 arg0, int arg1, int arg2) {
        return arg0.field1242 == null || arg0.field1242.length == 0 ? null : new class45(arg0, (int) ((long) arg0.field1241 * 256L * (long) arg1 / (long) (Statics.field1112 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ag.l(Lbj;III)Lag;")
    public static class45 method972(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1242 == null || arg0.field1242.length == 0 ? null : new class45(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ag.v()V")
    public void method973() {
        this.field1058 = this.field1052;
        this.field1055 = method1129(this.field1052, this.field1053);
        this.field1056 = method968(this.field1052, this.field1053);
    }

    @ObfuscatedName("ag.g(I)V")
    public synchronized void method974(int arg0) {
        this.field1057 = arg0;
    }

    @ObfuscatedName("ag.x(I)V")
    public synchronized void method1006(int arg0) {
        this.method977(arg0 << 6, this.method979());
    }

    @ObfuscatedName("ag.c(I)V")
    public synchronized void method976(int arg0) {
        this.method977(arg0, this.method979());
    }

    @ObfuscatedName("ag.f(II)V")
    public synchronized void method977(int arg0, int arg1) {
        this.field1052 = arg0;
        this.field1053 = arg1;
        this.field1061 = 0;
        this.method973();
    }

    @ObfuscatedName("ag.r()I")
    public synchronized int method1076() {
        return this.field1052 == Integer.MIN_VALUE ? 0 : this.field1052;
    }

    @ObfuscatedName("ag.d()I")
    public synchronized int method979() {
        return this.field1053 < 0 ? -1 : this.field1053;
    }

    @ObfuscatedName("ag.a(I)V")
    public synchronized void method971(int arg0) {
        int var2 = ((class63) this.field1073).field1242.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1062 = arg0;
    }

    @ObfuscatedName("ag.q(Z)V")
    public synchronized void method1060(boolean arg0) {
        this.field1051 = (this.field1051 >>> 31) + (this.field1051 ^ this.field1051 >> 31);
        if (arg0) {
            this.field1051 = -this.field1051;
        }
    }

    @ObfuscatedName("ag.u()V")
    public void method982() {
        if (this.field1061 == 0) {
            return;
        }
        if (this.field1052 == Integer.MIN_VALUE) {
            this.field1052 = 0;
        }
        this.field1061 = 0;
        this.method973();
    }

    @ObfuscatedName("ag.w(II)V")
    public synchronized void method983(int arg0, int arg1) {
        this.method984(arg0, arg1, this.method979());
    }

    @ObfuscatedName("ag.s(III)V")
    public synchronized void method984(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method977(arg1, arg2);
            return;
        }
        int var4 = method1129(arg1, arg2);
        int var5 = method968(arg1, arg2);
        if (this.field1055 == var4 && this.field1056 == var5) {
            this.field1061 = 0;
            return;
        }
        int var6 = arg1 - this.field1058;
        if (this.field1058 - arg1 > var6) {
            var6 = this.field1058 - arg1;
        }
        if (var4 - this.field1055 > var6) {
            var6 = var4 - this.field1055;
        }
        if (this.field1055 - var4 > var6) {
            var6 = this.field1055 - var4;
        }
        if (var5 - this.field1056 > var6) {
            var6 = var5 - this.field1056;
        }
        if (this.field1056 - var5 > var6) {
            var6 = this.field1056 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1061 = arg0;
        this.field1052 = arg1;
        this.field1053 = arg2;
        this.field1050 = (arg1 - this.field1058) / arg0;
        this.field1063 = (var4 - this.field1055) / arg0;
        this.field1054 = (var5 - this.field1056) / arg0;
    }

    @ObfuscatedName("ag.e(I)V")
    public synchronized void method985(int arg0) {
        if (arg0 == 0) {
            this.method976(0);
            this.method3360();
        } else if (this.field1055 == 0 && this.field1056 == 0) {
            this.field1061 = 0;
            this.field1052 = 0;
            this.field1058 = 0;
            this.method3360();
        } else {
            int var2 = -this.field1058;
            if (this.field1058 > var2) {
                var2 = this.field1058;
            }
            if (-this.field1055 > var2) {
                var2 = -this.field1055;
            }
            if (this.field1055 > var2) {
                var2 = this.field1055;
            }
            if (-this.field1056 > var2) {
                var2 = -this.field1056;
            }
            if (this.field1056 > var2) {
                var2 = this.field1056;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1061 = arg0;
            this.field1052 = Integer.MIN_VALUE;
            this.field1050 = -this.field1058 / arg0;
            this.field1063 = -this.field1055 / arg0;
            this.field1054 = -this.field1056 / arg0;
        }
    }

    @ObfuscatedName("ag.b(I)V")
    public synchronized void method986(int arg0) {
        if (this.field1051 < 0) {
            this.field1051 = -arg0;
        } else {
            this.field1051 = arg0;
        }
    }

    @ObfuscatedName("ag.j()I")
    public synchronized int method987() {
        return this.field1051 < 0 ? -this.field1051 : this.field1051;
    }

    @ObfuscatedName("ag.h()Z")
    public boolean method1057() {
        return this.field1062 < 0 || this.field1062 >= ((class63) this.field1073).field1242.length << 8;
    }

    @ObfuscatedName("ag.m()Z")
    public boolean method1042() {
        return this.field1061 != 0;
    }

    @ObfuscatedName("ag.y()Law;")
    public class48 method990() {
        return null;
    }

    @ObfuscatedName("ag.t()Law;")
    public class48 method989() {
        return null;
    }

    @ObfuscatedName("ag.k()I")
    public int method1046() {
        return this.field1052 == 0 && this.field1061 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ag.z([III)V")
    public synchronized void method1044(int[] arg0, int arg1, int arg2) {
        if (this.field1052 == 0 && this.field1061 == 0) {
            this.method988(arg2);
            return;
        }
        class63 var4 = (class63) this.field1073;
        int var5 = this.field1060 << 8;
        int var6 = this.field1059 << 8;
        int var7 = var4.field1242.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1057 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1062 < 0) {
            if (this.field1051 <= 0) {
                this.method982();
                this.method3360();
                return;
            }
            this.field1062 = 0;
        }
        if (this.field1062 >= var7) {
            if (this.field1051 >= 0) {
                this.method982();
                this.method3360();
                return;
            }
            this.field1062 = var7 - 1;
        }
        if (this.field1057 >= 0) {
            if (this.field1057 > 0) {
                if (this.field1064) {
                    label131: {
                        if (this.field1051 < 0) {
                            var9 = this.method996(arg0, arg1, var5, var10, var4.field1242[this.field1060]);
                            if (this.field1062 >= var5) {
                                return;
                            }
                            this.field1062 = var5 + var5 - 1 - this.field1062;
                            this.field1051 = -this.field1051;
                            if (--this.field1057 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method995(arg0, var9, var6, var10, var4.field1242[this.field1059 - 1]);
                            if (this.field1062 < var6) {
                                return;
                            }
                            this.field1062 = var6 + var6 - 1 - this.field1062;
                            this.field1051 = -this.field1051;
                            if (--this.field1057 == 0) {
                                break;
                            }
                            var9 = this.method996(arg0, var9, var5, var10, var4.field1242[this.field1060]);
                            if (this.field1062 >= var5) {
                                return;
                            }
                            this.field1062 = var5 + var5 - 1 - this.field1062;
                            this.field1051 = -this.field1051;
                        } while (--this.field1057 != 0);
                    }
                } else if (this.field1051 < 0) {
                    while (true) {
                        var9 = this.method996(arg0, var9, var5, var10, var4.field1242[this.field1059 - 1]);
                        if (this.field1062 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1062) / var8;
                        if (var12 >= this.field1057) {
                            this.field1062 += this.field1057 * var8;
                            this.field1057 = 0;
                            break;
                        }
                        this.field1062 += var8 * var12;
                        this.field1057 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method995(arg0, var9, var6, var10, var4.field1242[this.field1060]);
                        if (this.field1062 < var6) {
                            return;
                        }
                        int var13 = (this.field1062 - var5) / var8;
                        if (var13 >= this.field1057) {
                            this.field1062 -= this.field1057 * var8;
                            this.field1057 = 0;
                            break;
                        }
                        this.field1062 -= var8 * var13;
                        this.field1057 -= var13;
                    }
                }
            }
            if (this.field1051 < 0) {
                this.method996(arg0, var9, 0, var10, 0);
                if (this.field1062 < 0) {
                    this.field1062 = -1;
                    this.method982();
                    this.method3360();
                }
            } else {
                this.method995(arg0, var9, var7, var10, 0);
                if (this.field1062 >= var7) {
                    this.field1062 = var7;
                    this.method982();
                    this.method3360();
                }
            }
        } else if (this.field1064) {
            if (this.field1051 < 0) {
                var9 = this.method996(arg0, arg1, var5, var10, var4.field1242[this.field1060]);
                if (this.field1062 >= var5) {
                    return;
                }
                this.field1062 = var5 + var5 - 1 - this.field1062;
                this.field1051 = -this.field1051;
            }
            while (true) {
                int var11 = this.method995(arg0, var9, var6, var10, var4.field1242[this.field1059 - 1]);
                if (this.field1062 < var6) {
                    return;
                }
                this.field1062 = var6 + var6 - 1 - this.field1062;
                this.field1051 = -this.field1051;
                var9 = this.method996(arg0, var11, var5, var10, var4.field1242[this.field1060]);
                if (this.field1062 >= var5) {
                    return;
                }
                this.field1062 = var5 + var5 - 1 - this.field1062;
                this.field1051 = -this.field1051;
            }
        } else if (this.field1051 < 0) {
            while (true) {
                var9 = this.method996(arg0, var9, var5, var10, var4.field1242[this.field1059 - 1]);
                if (this.field1062 >= var5) {
                    return;
                }
                this.field1062 = var6 - 1 - (var6 - 1 - this.field1062) % var8;
            }
        } else {
            while (true) {
                var9 = this.method995(arg0, var9, var6, var10, var4.field1242[this.field1060]);
                if (this.field1062 < var6) {
                    return;
                }
                this.field1062 = (this.field1062 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ag.at(I)V")
    public synchronized void method988(int arg0) {
        if (this.field1061 > 0) {
            if (arg0 >= this.field1061) {
                if (this.field1052 == Integer.MIN_VALUE) {
                    this.field1052 = 0;
                    this.field1056 = 0;
                    this.field1055 = 0;
                    this.field1058 = 0;
                    this.method3360();
                    arg0 = this.field1061;
                }
                this.field1061 = 0;
                this.method973();
            } else {
                this.field1058 += this.field1050 * arg0;
                this.field1055 += this.field1063 * arg0;
                this.field1056 += this.field1054 * arg0;
                this.field1061 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1073;
        int var3 = this.field1060 << 8;
        int var4 = this.field1059 << 8;
        int var5 = var2.field1242.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1057 = 0;
        }
        if (this.field1062 < 0) {
            if (this.field1051 <= 0) {
                this.method982();
                this.method3360();
                return;
            }
            this.field1062 = 0;
        }
        if (this.field1062 >= var5) {
            if (this.field1051 >= 0) {
                this.method982();
                this.method3360();
                return;
            }
            this.field1062 = var5 - 1;
        }
        this.field1062 += this.field1051 * arg0;
        if (this.field1057 >= 0) {
            if (this.field1057 > 0) {
                if (this.field1064) {
                    label121: {
                        if (this.field1051 < 0) {
                            if (this.field1062 >= var3) {
                                return;
                            }
                            this.field1062 = var3 + var3 - 1 - this.field1062;
                            this.field1051 = -this.field1051;
                            if (--this.field1057 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1062 < var4) {
                                return;
                            }
                            this.field1062 = var4 + var4 - 1 - this.field1062;
                            this.field1051 = -this.field1051;
                            if (--this.field1057 == 0) {
                                break;
                            }
                            if (this.field1062 >= var3) {
                                return;
                            }
                            this.field1062 = var3 + var3 - 1 - this.field1062;
                            this.field1051 = -this.field1051;
                        } while (--this.field1057 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1051 < 0) {
                            if (this.field1062 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1062) / var6;
                            if (var7 >= this.field1057) {
                                this.field1062 += this.field1057 * var6;
                                this.field1057 = 0;
                                break label153;
                            }
                            this.field1062 += var6 * var7;
                            this.field1057 -= var7;
                        } else if (this.field1062 >= var4) {
                            int var8 = (this.field1062 - var3) / var6;
                            if (var8 >= this.field1057) {
                                this.field1062 -= this.field1057 * var6;
                                this.field1057 = 0;
                                break label153;
                            }
                            this.field1062 -= var6 * var8;
                            this.field1057 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1051 < 0) {
                if (this.field1062 < 0) {
                    this.field1062 = -1;
                    this.method982();
                    this.method3360();
                }
            } else if (this.field1062 >= var5) {
                this.field1062 = var5;
                this.method982();
                this.method3360();
            }
        } else if (this.field1064) {
            if (this.field1051 < 0) {
                if (this.field1062 >= var3) {
                    return;
                }
                this.field1062 = var3 + var3 - 1 - this.field1062;
                this.field1051 = -this.field1051;
            }
            while (this.field1062 >= var4) {
                this.field1062 = var4 + var4 - 1 - this.field1062;
                this.field1051 = -this.field1051;
                if (this.field1062 >= var3) {
                    return;
                }
                this.field1062 = var3 + var3 - 1 - this.field1062;
                this.field1051 = -this.field1051;
            }
        } else if (this.field1051 < 0) {
            if (this.field1062 >= var3) {
                return;
            }
            this.field1062 = var4 - 1 - (var4 - 1 - this.field1062) % var6;
        } else if (this.field1062 >= var4) {
            this.field1062 = (this.field1062 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ag.ay([IIIII)I")
    public int method995(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1061 > 0) {
                int var6 = this.field1061 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1061 += arg1;
                if (this.field1051 == 256 && (this.field1062 & 0xFF) == 0) {
                    if (Statics.field1095) {
                        arg1 = method1048(0, ((class63) this.field1073).field1242, arg0, this.field1062, arg1, this.field1055, this.field1056, this.field1063, this.field1054, 0, var6, arg2, this);
                    } else {
                        arg1 = method1121(((class63) this.field1073).field1242, arg0, this.field1062, arg1, this.field1058, this.field1050, 0, var6, arg2, this);
                    }
                } else if (Statics.field1095) {
                    arg1 = method1033(0, 0, ((class63) this.field1073).field1242, arg0, this.field1062, arg1, this.field1055, this.field1056, this.field1063, this.field1054, 0, var6, arg2, this, this.field1051, arg4);
                } else {
                    arg1 = method975(0, 0, ((class63) this.field1073).field1242, arg0, this.field1062, arg1, this.field1058, this.field1050, 0, var6, arg2, this, this.field1051, arg4);
                }
                this.field1061 -= arg1;
                if (this.field1061 != 0) {
                    return arg1;
                }
                if (!this.method1132()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1051 == 256 && (this.field1062 & 0xFF) == 0) {
                if (Statics.field1095) {
                    return method980(0, ((class63) this.field1073).field1242, arg0, this.field1062, arg1, this.field1055, this.field1056, 0, arg3, arg2, this);
                }
                return method1031(((class63) this.field1073).field1242, arg0, this.field1062, arg1, this.field1058, 0, arg3, arg2, this);
            }
            if (Statics.field1095) {
                return method1003(0, 0, ((class63) this.field1073).field1242, arg0, this.field1062, arg1, this.field1055, this.field1056, 0, arg3, arg2, this, this.field1051, arg4);
            }
            return method1002(0, 0, ((class63) this.field1073).field1242, arg0, this.field1062, arg1, this.field1058, 0, arg3, arg2, this, this.field1051, arg4);
        }
    }

    @ObfuscatedName("ag.ae([IIIII)I")
    public int method996(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1061 > 0) {
                int var6 = this.field1061 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1061 += arg1;
                if (this.field1051 == -256 && (this.field1062 & 0xFF) == 0) {
                    if (Statics.field1095) {
                        arg1 = method1009(0, ((class63) this.field1073).field1242, arg0, this.field1062, arg1, this.field1055, this.field1056, this.field1063, this.field1054, 0, var6, arg2, this);
                    } else {
                        arg1 = method1008(((class63) this.field1073).field1242, arg0, this.field1062, arg1, this.field1058, this.field1050, 0, var6, arg2, this);
                    }
                } else if (Statics.field1095) {
                    arg1 = method1013(0, 0, ((class63) this.field1073).field1242, arg0, this.field1062, arg1, this.field1055, this.field1056, this.field1063, this.field1054, 0, var6, arg2, this, this.field1051, arg4);
                } else {
                    arg1 = method1012(0, 0, ((class63) this.field1073).field1242, arg0, this.field1062, arg1, this.field1058, this.field1050, 0, var6, arg2, this, this.field1051, arg4);
                }
                this.field1061 -= arg1;
                if (this.field1061 != 0) {
                    return arg1;
                }
                if (!this.method1132()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1051 == -256 && (this.field1062 & 0xFF) == 0) {
                if (Statics.field1095) {
                    return method1019(0, ((class63) this.field1073).field1242, arg0, this.field1062, arg1, this.field1055, this.field1056, 0, arg3, arg2, this);
                }
                return method1000(((class63) this.field1073).field1242, arg0, this.field1062, arg1, this.field1058, 0, arg3, arg2, this);
            }
            if (Statics.field1095) {
                return method1005(0, 0, ((class63) this.field1073).field1242, arg0, this.field1062, arg1, this.field1055, this.field1056, 0, arg3, arg2, this, this.field1051, arg4);
            }
            return method1020(0, 0, ((class63) this.field1073).field1242, arg0, this.field1062, arg1, this.field1058, 0, arg3, arg2, this, this.field1051, arg4);
        }
    }

    @ObfuscatedName("ag.af()Z")
    public boolean method1132() {
        int var1 = this.field1052;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1129(var1, this.field1053);
            var2 = method968(var1, this.field1053);
        }
        if (this.field1058 != var1 || this.field1055 != var3 || this.field1056 != var2) {
            if (this.field1058 < var1) {
                this.field1050 = 1;
                this.field1061 = var1 - this.field1058;
            } else if (this.field1058 > var1) {
                this.field1050 = -1;
                this.field1061 = this.field1058 - var1;
            } else {
                this.field1050 = 0;
            }
            if (this.field1055 < var3) {
                this.field1063 = 1;
                if (this.field1061 == 0 || this.field1061 > var3 - this.field1055) {
                    this.field1061 = var3 - this.field1055;
                }
            } else if (this.field1055 > var3) {
                this.field1063 = -1;
                if (this.field1061 == 0 || this.field1061 > this.field1055 - var3) {
                    this.field1061 = this.field1055 - var3;
                }
            } else {
                this.field1063 = 0;
            }
            if (this.field1056 < var2) {
                this.field1054 = 1;
                if (this.field1061 == 0 || this.field1061 > var2 - this.field1056) {
                    this.field1061 = var2 - this.field1056;
                }
            } else if (this.field1056 > var2) {
                this.field1054 = -1;
                if (this.field1061 == 0 || this.field1061 > this.field1056 - var2) {
                    this.field1061 = this.field1056 - var2;
                }
            } else {
                this.field1054 = 0;
            }
            return false;
        } else if (this.field1052 == Integer.MIN_VALUE) {
            this.field1052 = 0;
            this.field1056 = 0;
            this.field1055 = 0;
            this.field1058 = 0;
            this.method3360();
            return true;
        } else {
            this.method973();
            return false;
        }
    }

    @ObfuscatedName("ag.ao([B[IIIIIIILag;)I")
    public static int method1031(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field1062 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ag.ad(I[B[IIIIIIIILag;)I")
    public static int method980(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field1062 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ag.aj([B[IIIIIIILag;)I")
    public static int method1000(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field1062 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ag.ah(I[B[IIIIIIIILag;)I")
    public static int method1019(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field1062 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ag.aq(II[B[IIIIIIILag;II)I")
    public static int method1002(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field1062 = arg4;
        return arg5;
    }

    @ObfuscatedName("ag.ar(II[B[IIIIIIIILag;II)I")
    public static int method1003(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field1062 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ag.aa(II[B[IIIIIIILag;II)I")
    public static int method1020(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field1062 = arg4;
        return arg5;
    }

    @ObfuscatedName("ag.an(II[B[IIIIIIIILag;II)I")
    public static int method1005(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field1062 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ag.ab([B[IIIIIIIILag;)I")
    public static int method1121(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1055 += (var14 - arg3) * arg9.field1063;
        arg9.field1056 += (var14 - arg3) * arg9.field1054;
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
        arg9.field1058 = var12 >> 2;
        arg9.field1062 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ag.ai(I[B[IIIIIIIIIILag;)I")
    public static int method1048(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1058 += (var19 - arg4) * arg12.field1050;
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
        arg12.field1055 = var15 >> 2;
        arg12.field1056 = var16 >> 2;
        arg12.field1062 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ag.ac([B[IIIIIIIILag;)I")
    public static int method1008(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1055 += (var14 - arg3) * arg9.field1063;
        arg9.field1056 += (var14 - arg3) * arg9.field1054;
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
        arg9.field1058 = var12 >> 2;
        arg9.field1062 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ag.ak(I[B[IIIIIIIIIILag;)I")
    public static int method1009(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1058 += (var19 - arg4) * arg12.field1050;
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
        arg12.field1055 = var15 >> 2;
        arg12.field1056 = var16 >> 2;
        arg12.field1062 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ag.au(II[B[IIIIIIIILag;II)I")
    public static int method975(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1055 -= arg11.field1063 * arg5;
        arg11.field1056 -= arg11.field1054 * arg5;
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
        arg11.field1055 += arg11.field1063 * arg5;
        arg11.field1056 += arg11.field1054 * arg5;
        arg11.field1058 = arg6;
        arg11.field1062 = arg4;
        return arg5;
    }

    @ObfuscatedName("ag.am(II[B[IIIIIIIIIILag;II)I")
    public static int method1033(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1058 -= arg13.field1050 * arg5;
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
        arg13.field1058 += arg13.field1050 * var27;
        arg13.field1055 = arg6;
        arg13.field1056 = arg7;
        arg13.field1062 = arg4;
        return var27;
    }

    @ObfuscatedName("ag.ag(II[B[IIIIIIIILag;II)I")
    public static int method1012(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1055 -= arg11.field1063 * arg5;
        arg11.field1056 -= arg11.field1054 * arg5;
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
        arg11.field1055 += arg11.field1063 * arg5;
        arg11.field1056 += arg11.field1054 * arg5;
        arg11.field1058 = arg6;
        arg11.field1062 = arg4;
        return arg5;
    }

    @ObfuscatedName("ag.al(II[B[IIIIIIIIIILag;II)I")
    public static int method1013(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1058 -= arg13.field1050 * arg5;
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
        arg13.field1058 += arg13.field1050 * var26;
        arg13.field1055 = arg6;
        arg13.field1056 = arg7;
        arg13.field1062 = arg4;
        return var26;
    }
}
