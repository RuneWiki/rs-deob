package deob;

@ObfuscatedName("ag")
public class class44 extends class47 {

    @ObfuscatedName("ag.z")
    public int field1054;

    @ObfuscatedName("ag.h")
    public int field1048;

    @ObfuscatedName("ag.c")
    public int field1049;

    @ObfuscatedName("ag.p")
    public int field1050;

    @ObfuscatedName("ag.i")
    public int field1058;

    @ObfuscatedName("ag.v")
    public int field1052;

    @ObfuscatedName("ag.l")
    public int field1053;

    @ObfuscatedName("ag.m")
    public int field1060;

    @ObfuscatedName("ag.g")
    public int field1055;

    @ObfuscatedName("ag.t")
    public int field1056;

    @ObfuscatedName("ag.o")
    public boolean field1047;

    @ObfuscatedName("ag.b")
    public int field1059;

    @ObfuscatedName("ag.d")
    public int field1057;

    @ObfuscatedName("ag.k")
    public int field1051;

    @ObfuscatedName("ag.f")
    public int field1061;

    @ObfuscatedName("ag.z(II)I")
    public static int method1035(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ag.h(II)I")
    public static int method997(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ag.c()I")
    public int method941() {
        int var1 = this.field1058 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1060 == 0) {
            var2 -= this.field1054 * var2 / (((class62) this.field1069).field1236.length << 8);
        } else if (this.field1060 >= 0) {
            var2 -= this.field1055 * var2 / ((class62) this.field1069).field1236.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class44(class62 arg0, int arg1, int arg2) {
        this.field1069 = arg0;
        this.field1055 = arg0.field1237;
        this.field1056 = arg0.field1239;
        this.field1047 = arg0.field1238;
        this.field1048 = arg1;
        this.field1049 = arg2;
        this.field1050 = 8192;
        this.field1054 = 0;
        this.method945();
    }

    public class44(class62 arg0, int arg1, int arg2, int arg3) {
        this.field1069 = arg0;
        this.field1055 = arg0.field1237;
        this.field1056 = arg0.field1239;
        this.field1047 = arg0.field1238;
        this.field1048 = arg1;
        this.field1049 = arg2;
        this.field1050 = arg3;
        this.field1054 = 0;
        this.method945();
    }

    @ObfuscatedName("ag.p(Lbe;II)Lag;")
    public static class44 method943(class62 arg0, int arg1, int arg2) {
        return arg0.field1236 == null || arg0.field1236.length == 0 ? null : new class44(arg0, (int) ((long) arg0.field1235 * 256L * (long) arg1 / (long) (Statics.field2409 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ag.i(Lbe;III)Lag;")
    public static class44 method944(class62 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1236 == null || arg0.field1236.length == 0 ? null : new class44(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ag.v()V")
    public void method945() {
        this.field1058 = this.field1049;
        this.field1052 = method1035(this.field1049, this.field1050);
        this.field1053 = method997(this.field1049, this.field1050);
    }

    @ObfuscatedName("ag.l(I)V")
    public synchronized void method946(int arg0) {
        this.field1060 = arg0;
    }

    @ObfuscatedName("ag.m(I)V")
    public synchronized void method947(int arg0) {
        this.method1007(arg0 << 6, this.method951());
    }

    @ObfuscatedName("ag.g(I)V")
    public synchronized void method999(int arg0) {
        this.method1007(arg0, this.method951());
    }

    @ObfuscatedName("ag.t(II)V")
    public synchronized void method1007(int arg0, int arg1) {
        this.field1049 = arg0;
        this.field1050 = arg1;
        this.field1059 = 0;
        this.method945();
    }

    @ObfuscatedName("ag.o()I")
    public synchronized int method1003() {
        return this.field1049 == Integer.MIN_VALUE ? 0 : this.field1049;
    }

    @ObfuscatedName("ag.b()I")
    public synchronized int method951() {
        return this.field1050 < 0 ? -1 : this.field1050;
    }

    @ObfuscatedName("ag.d(I)V")
    public synchronized void method1011(int arg0) {
        int var2 = ((class62) this.field1069).field1236.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1054 = arg0;
    }

    @ObfuscatedName("ag.k(Z)V")
    public synchronized void method1043(boolean arg0) {
        this.field1048 = (this.field1048 >>> 31) + (this.field1048 ^ this.field1048 >> 31);
        if (arg0) {
            this.field1048 = -this.field1048;
        }
    }

    @ObfuscatedName("ag.f()V")
    public void method954() {
        if (this.field1059 == 0) {
            return;
        }
        if (this.field1049 == Integer.MIN_VALUE) {
            this.field1049 = 0;
        }
        this.field1059 = 0;
        this.method945();
    }

    @ObfuscatedName("ag.e(II)V")
    public synchronized void method955(int arg0, int arg1) {
        this.method956(arg0, arg1, this.method951());
    }

    @ObfuscatedName("ag.u(III)V")
    public synchronized void method956(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1007(arg1, arg2);
            return;
        }
        int var4 = method1035(arg1, arg2);
        int var5 = method997(arg1, arg2);
        if (this.field1052 == var4 && this.field1053 == var5) {
            this.field1059 = 0;
            return;
        }
        int var6 = arg1 - this.field1058;
        if (this.field1058 - arg1 > var6) {
            var6 = this.field1058 - arg1;
        }
        if (var4 - this.field1052 > var6) {
            var6 = var4 - this.field1052;
        }
        if (this.field1052 - var4 > var6) {
            var6 = this.field1052 - var4;
        }
        if (var5 - this.field1053 > var6) {
            var6 = var5 - this.field1053;
        }
        if (this.field1053 - var5 > var6) {
            var6 = this.field1053 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1059 = arg0;
        this.field1049 = arg1;
        this.field1050 = arg2;
        this.field1057 = (arg1 - this.field1058) / arg0;
        this.field1051 = (var4 - this.field1052) / arg0;
        this.field1061 = (var5 - this.field1053) / arg0;
    }

    @ObfuscatedName("ag.n(I)V")
    public synchronized void method957(int arg0) {
        if (arg0 == 0) {
            this.method999(0);
            this.method3346();
        } else if (this.field1052 == 0 && this.field1053 == 0) {
            this.field1059 = 0;
            this.field1049 = 0;
            this.field1058 = 0;
            this.method3346();
        } else {
            int var2 = -this.field1058;
            if (this.field1058 > var2) {
                var2 = this.field1058;
            }
            if (-this.field1052 > var2) {
                var2 = -this.field1052;
            }
            if (this.field1052 > var2) {
                var2 = this.field1052;
            }
            if (-this.field1053 > var2) {
                var2 = -this.field1053;
            }
            if (this.field1053 > var2) {
                var2 = this.field1053;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1059 = arg0;
            this.field1049 = Integer.MIN_VALUE;
            this.field1057 = -this.field1058 / arg0;
            this.field1051 = -this.field1052 / arg0;
            this.field1061 = -this.field1053 / arg0;
        }
    }

    @ObfuscatedName("ag.q(I)V")
    public synchronized void method958(int arg0) {
        if (this.field1048 < 0) {
            this.field1048 = -arg0;
        } else {
            this.field1048 = arg0;
        }
    }

    @ObfuscatedName("ag.y()I")
    public synchronized int method1032() {
        return this.field1048 < 0 ? -this.field1048 : this.field1048;
    }

    @ObfuscatedName("ag.a()Z")
    public boolean method1028() {
        return this.field1054 < 0 || this.field1054 >= ((class62) this.field1069).field1236.length << 8;
    }

    @ObfuscatedName("ag.r()Z")
    public boolean method960() {
        return this.field1059 != 0;
    }

    @ObfuscatedName("ag.x()Laa;")
    public class47 method987() {
        return null;
    }

    @ObfuscatedName("ag.w()Laa;")
    public class47 method962() {
        return null;
    }

    @ObfuscatedName("ag.j()I")
    public int method963() {
        return this.field1049 == 0 && this.field1059 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ag.s([III)V")
    public synchronized void method976(int[] arg0, int arg1, int arg2) {
        if (this.field1049 == 0 && this.field1059 == 0) {
            this.method965(arg2);
            return;
        }
        class62 var4 = (class62) this.field1069;
        int var5 = this.field1055 << 8;
        int var6 = this.field1056 << 8;
        int var7 = var4.field1236.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1060 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1054 < 0) {
            if (this.field1048 <= 0) {
                this.method954();
                this.method3346();
                return;
            }
            this.field1054 = 0;
        }
        if (this.field1054 >= var7) {
            if (this.field1048 >= 0) {
                this.method954();
                this.method3346();
                return;
            }
            this.field1054 = var7 - 1;
        }
        if (this.field1060 >= 0) {
            if (this.field1060 > 0) {
                if (this.field1047) {
                    label131: {
                        if (this.field1048 < 0) {
                            var9 = this.method967(arg0, arg1, var5, var10, var4.field1236[this.field1055]);
                            if (this.field1054 >= var5) {
                                return;
                            }
                            this.field1054 = var5 + var5 - 1 - this.field1054;
                            this.field1048 = -this.field1048;
                            if (--this.field1060 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1064(arg0, var9, var6, var10, var4.field1236[this.field1056 - 1]);
                            if (this.field1054 < var6) {
                                return;
                            }
                            this.field1054 = var6 + var6 - 1 - this.field1054;
                            this.field1048 = -this.field1048;
                            if (--this.field1060 == 0) {
                                break;
                            }
                            var9 = this.method967(arg0, var9, var5, var10, var4.field1236[this.field1055]);
                            if (this.field1054 >= var5) {
                                return;
                            }
                            this.field1054 = var5 + var5 - 1 - this.field1054;
                            this.field1048 = -this.field1048;
                        } while (--this.field1060 != 0);
                    }
                } else if (this.field1048 < 0) {
                    while (true) {
                        var9 = this.method967(arg0, var9, var5, var10, var4.field1236[this.field1056 - 1]);
                        if (this.field1054 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1054) / var8;
                        if (var12 >= this.field1060) {
                            this.field1054 += this.field1060 * var8;
                            this.field1060 = 0;
                            break;
                        }
                        this.field1054 += var8 * var12;
                        this.field1060 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1064(arg0, var9, var6, var10, var4.field1236[this.field1055]);
                        if (this.field1054 < var6) {
                            return;
                        }
                        int var13 = (this.field1054 - var5) / var8;
                        if (var13 >= this.field1060) {
                            this.field1054 -= this.field1060 * var8;
                            this.field1060 = 0;
                            break;
                        }
                        this.field1054 -= var8 * var13;
                        this.field1060 -= var13;
                    }
                }
            }
            if (this.field1048 < 0) {
                this.method967(arg0, var9, 0, var10, 0);
                if (this.field1054 < 0) {
                    this.field1054 = -1;
                    this.method954();
                    this.method3346();
                }
            } else {
                this.method1064(arg0, var9, var7, var10, 0);
                if (this.field1054 >= var7) {
                    this.field1054 = var7;
                    this.method954();
                    this.method3346();
                }
            }
        } else if (this.field1047) {
            if (this.field1048 < 0) {
                var9 = this.method967(arg0, arg1, var5, var10, var4.field1236[this.field1055]);
                if (this.field1054 >= var5) {
                    return;
                }
                this.field1054 = var5 + var5 - 1 - this.field1054;
                this.field1048 = -this.field1048;
            }
            while (true) {
                int var11 = this.method1064(arg0, var9, var6, var10, var4.field1236[this.field1056 - 1]);
                if (this.field1054 < var6) {
                    return;
                }
                this.field1054 = var6 + var6 - 1 - this.field1054;
                this.field1048 = -this.field1048;
                var9 = this.method967(arg0, var11, var5, var10, var4.field1236[this.field1055]);
                if (this.field1054 >= var5) {
                    return;
                }
                this.field1054 = var5 + var5 - 1 - this.field1054;
                this.field1048 = -this.field1048;
            }
        } else if (this.field1048 < 0) {
            while (true) {
                var9 = this.method967(arg0, var9, var5, var10, var4.field1236[this.field1056 - 1]);
                if (this.field1054 >= var5) {
                    return;
                }
                this.field1054 = var6 - 1 - (var6 - 1 - this.field1054) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1064(arg0, var9, var6, var10, var4.field1236[this.field1055]);
                if (this.field1054 < var6) {
                    return;
                }
                this.field1054 = (this.field1054 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ag.au(I)V")
    public synchronized void method965(int arg0) {
        if (this.field1059 > 0) {
            if (arg0 >= this.field1059) {
                if (this.field1049 == Integer.MIN_VALUE) {
                    this.field1049 = 0;
                    this.field1053 = 0;
                    this.field1052 = 0;
                    this.field1058 = 0;
                    this.method3346();
                    arg0 = this.field1059;
                }
                this.field1059 = 0;
                this.method945();
            } else {
                this.field1058 += this.field1057 * arg0;
                this.field1052 += this.field1051 * arg0;
                this.field1053 += this.field1061 * arg0;
                this.field1059 -= arg0;
            }
        }
        class62 var2 = (class62) this.field1069;
        int var3 = this.field1055 << 8;
        int var4 = this.field1056 << 8;
        int var5 = var2.field1236.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1060 = 0;
        }
        if (this.field1054 < 0) {
            if (this.field1048 <= 0) {
                this.method954();
                this.method3346();
                return;
            }
            this.field1054 = 0;
        }
        if (this.field1054 >= var5) {
            if (this.field1048 >= 0) {
                this.method954();
                this.method3346();
                return;
            }
            this.field1054 = var5 - 1;
        }
        this.field1054 += this.field1048 * arg0;
        if (this.field1060 >= 0) {
            if (this.field1060 > 0) {
                if (this.field1047) {
                    label121: {
                        if (this.field1048 < 0) {
                            if (this.field1054 >= var3) {
                                return;
                            }
                            this.field1054 = var3 + var3 - 1 - this.field1054;
                            this.field1048 = -this.field1048;
                            if (--this.field1060 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1054 < var4) {
                                return;
                            }
                            this.field1054 = var4 + var4 - 1 - this.field1054;
                            this.field1048 = -this.field1048;
                            if (--this.field1060 == 0) {
                                break;
                            }
                            if (this.field1054 >= var3) {
                                return;
                            }
                            this.field1054 = var3 + var3 - 1 - this.field1054;
                            this.field1048 = -this.field1048;
                        } while (--this.field1060 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1048 < 0) {
                            if (this.field1054 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1054) / var6;
                            if (var7 >= this.field1060) {
                                this.field1054 += this.field1060 * var6;
                                this.field1060 = 0;
                                break label153;
                            }
                            this.field1054 += var6 * var7;
                            this.field1060 -= var7;
                        } else if (this.field1054 >= var4) {
                            int var8 = (this.field1054 - var3) / var6;
                            if (var8 >= this.field1060) {
                                this.field1054 -= this.field1060 * var6;
                                this.field1060 = 0;
                                break label153;
                            }
                            this.field1054 -= var6 * var8;
                            this.field1060 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1048 < 0) {
                if (this.field1054 < 0) {
                    this.field1054 = -1;
                    this.method954();
                    this.method3346();
                }
            } else if (this.field1054 >= var5) {
                this.field1054 = var5;
                this.method954();
                this.method3346();
            }
        } else if (this.field1047) {
            if (this.field1048 < 0) {
                if (this.field1054 >= var3) {
                    return;
                }
                this.field1054 = var3 + var3 - 1 - this.field1054;
                this.field1048 = -this.field1048;
            }
            while (this.field1054 >= var4) {
                this.field1054 = var4 + var4 - 1 - this.field1054;
                this.field1048 = -this.field1048;
                if (this.field1054 >= var3) {
                    return;
                }
                this.field1054 = var3 + var3 - 1 - this.field1054;
                this.field1048 = -this.field1048;
            }
        } else if (this.field1048 < 0) {
            if (this.field1054 >= var3) {
                return;
            }
            this.field1054 = var4 - 1 - (var4 - 1 - this.field1054) % var6;
        } else if (this.field1054 >= var4) {
            this.field1054 = (this.field1054 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ag.ay([IIIII)I")
    public int method1064(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1059 > 0) {
                int var6 = this.field1059 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1059 += arg1;
                if (this.field1048 == 256 && (this.field1054 & 0xFF) == 0) {
                    if (Statics.field955) {
                        arg1 = method978(0, ((class62) this.field1069).field1236, arg0, this.field1054, arg1, this.field1052, this.field1053, this.field1051, this.field1061, 0, var6, arg2, this);
                    } else {
                        arg1 = method977(((class62) this.field1069).field1236, arg0, this.field1054, arg1, this.field1058, this.field1057, 0, var6, arg2, this);
                    }
                } else if (Statics.field955) {
                    arg1 = method982(0, 0, ((class62) this.field1069).field1236, arg0, this.field1054, arg1, this.field1052, this.field1053, this.field1051, this.field1061, 0, var6, arg2, this, this.field1048, arg4);
                } else {
                    arg1 = method981(0, 0, ((class62) this.field1069).field1236, arg0, this.field1054, arg1, this.field1058, this.field1057, 0, var6, arg2, this, this.field1048, arg4);
                }
                this.field1059 -= arg1;
                if (this.field1059 != 0) {
                    return arg1;
                }
                if (!this.method968()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1048 == 256 && (this.field1054 & 0xFF) == 0) {
                if (Statics.field955) {
                    return method970(0, ((class62) this.field1069).field1236, arg0, this.field1054, arg1, this.field1052, this.field1053, 0, arg3, arg2, this);
                }
                return method969(((class62) this.field1069).field1236, arg0, this.field1054, arg1, this.field1058, 0, arg3, arg2, this);
            }
            if (Statics.field955) {
                return method974(0, 0, ((class62) this.field1069).field1236, arg0, this.field1054, arg1, this.field1052, this.field1053, 0, arg3, arg2, this, this.field1048, arg4);
            }
            return method973(0, 0, ((class62) this.field1069).field1236, arg0, this.field1054, arg1, this.field1058, 0, arg3, arg2, this, this.field1048, arg4);
        }
    }

    @ObfuscatedName("ag.ar([IIIII)I")
    public int method967(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1059 > 0) {
                int var6 = this.field1059 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1059 += arg1;
                if (this.field1048 == -256 && (this.field1054 & 0xFF) == 0) {
                    if (Statics.field955) {
                        arg1 = method1086(0, ((class62) this.field1069).field1236, arg0, this.field1054, arg1, this.field1052, this.field1053, this.field1051, this.field1061, 0, var6, arg2, this);
                    } else {
                        arg1 = method979(((class62) this.field1069).field1236, arg0, this.field1054, arg1, this.field1058, this.field1057, 0, var6, arg2, this);
                    }
                } else if (Statics.field955) {
                    arg1 = method961(0, 0, ((class62) this.field1069).field1236, arg0, this.field1054, arg1, this.field1052, this.field1053, this.field1051, this.field1061, 0, var6, arg2, this, this.field1048, arg4);
                } else {
                    arg1 = method1069(0, 0, ((class62) this.field1069).field1236, arg0, this.field1054, arg1, this.field1058, this.field1057, 0, var6, arg2, this, this.field1048, arg4);
                }
                this.field1059 -= arg1;
                if (this.field1059 != 0) {
                    return arg1;
                }
                if (!this.method968()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1048 == -256 && (this.field1054 & 0xFF) == 0) {
                if (Statics.field955) {
                    return method1000(0, ((class62) this.field1069).field1236, arg0, this.field1054, arg1, this.field1052, this.field1053, 0, arg3, arg2, this);
                }
                return method971(((class62) this.field1069).field1236, arg0, this.field1054, arg1, this.field1058, 0, arg3, arg2, this);
            }
            if (Statics.field955) {
                return method996(0, 0, ((class62) this.field1069).field1236, arg0, this.field1054, arg1, this.field1052, this.field1053, 0, arg3, arg2, this, this.field1048, arg4);
            }
            return method975(0, 0, ((class62) this.field1069).field1236, arg0, this.field1054, arg1, this.field1058, 0, arg3, arg2, this, this.field1048, arg4);
        }
    }

    @ObfuscatedName("ag.aj()Z")
    public boolean method968() {
        int var1 = this.field1049;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1035(var1, this.field1050);
            var2 = method997(var1, this.field1050);
        }
        if (this.field1058 != var1 || this.field1052 != var3 || this.field1053 != var2) {
            if (this.field1058 < var1) {
                this.field1057 = 1;
                this.field1059 = var1 - this.field1058;
            } else if (this.field1058 > var1) {
                this.field1057 = -1;
                this.field1059 = this.field1058 - var1;
            } else {
                this.field1057 = 0;
            }
            if (this.field1052 < var3) {
                this.field1051 = 1;
                if (this.field1059 == 0 || this.field1059 > var3 - this.field1052) {
                    this.field1059 = var3 - this.field1052;
                }
            } else if (this.field1052 > var3) {
                this.field1051 = -1;
                if (this.field1059 == 0 || this.field1059 > this.field1052 - var3) {
                    this.field1059 = this.field1052 - var3;
                }
            } else {
                this.field1051 = 0;
            }
            if (this.field1053 < var2) {
                this.field1061 = 1;
                if (this.field1059 == 0 || this.field1059 > var2 - this.field1053) {
                    this.field1059 = var2 - this.field1053;
                }
            } else if (this.field1053 > var2) {
                this.field1061 = -1;
                if (this.field1059 == 0 || this.field1059 > this.field1053 - var2) {
                    this.field1059 = this.field1053 - var2;
                }
            } else {
                this.field1061 = 0;
            }
            return false;
        } else if (this.field1049 == Integer.MIN_VALUE) {
            this.field1049 = 0;
            this.field1053 = 0;
            this.field1052 = 0;
            this.field1058 = 0;
            this.method3346();
            return true;
        } else {
            this.method945();
            return false;
        }
    }

    @ObfuscatedName("ag.ad([B[IIIIIIILag;)I")
    public static int method969(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class44 arg8) {
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
        arg8.field1054 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ag.at(I[B[IIIIIIIILag;)I")
    public static int method970(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10) {
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
        arg10.field1054 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ag.as([B[IIIIIIILag;)I")
    public static int method971(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class44 arg8) {
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
        arg8.field1054 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ag.aw(I[B[IIIIIIIILag;)I")
    public static int method1000(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10) {
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
        arg10.field1054 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ag.ax(II[B[IIIIIIILag;II)I")
    public static int method973(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10, int arg11, int arg12) {
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
        arg10.field1054 = arg4;
        return arg5;
    }

    @ObfuscatedName("ag.am(II[B[IIIIIIIILag;II)I")
    public static int method974(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
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
        arg11.field1054 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ag.an(II[B[IIIIIIILag;II)I")
    public static int method975(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10, int arg11, int arg12) {
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
        arg10.field1054 = arg4;
        return arg5;
    }

    @ObfuscatedName("ag.ap(II[B[IIIIIIIILag;II)I")
    public static int method996(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
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
        arg11.field1054 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ag.ae([B[IIIIIIIILag;)I")
    public static int method977(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class44 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1052 += (var14 - arg3) * arg9.field1051;
        arg9.field1053 += (var14 - arg3) * arg9.field1061;
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
        arg9.field1054 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ag.av(I[B[IIIIIIIIIILag;)I")
    public static int method978(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class44 arg12) {
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
        arg12.field1058 += (var19 - arg4) * arg12.field1057;
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
        arg12.field1052 = var15 >> 2;
        arg12.field1053 = var16 >> 2;
        arg12.field1054 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ag.ac([B[IIIIIIIILag;)I")
    public static int method979(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class44 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1052 += (var14 - arg3) * arg9.field1051;
        arg9.field1053 += (var14 - arg3) * arg9.field1061;
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
        arg9.field1054 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ag.ai(I[B[IIIIIIIIIILag;)I")
    public static int method1086(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class44 arg12) {
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
        arg12.field1058 += (var19 - arg4) * arg12.field1057;
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
        arg12.field1052 = var15 >> 2;
        arg12.field1053 = var16 >> 2;
        arg12.field1054 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ag.ak(II[B[IIIIIIIILag;II)I")
    public static int method981(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
        arg11.field1052 -= arg11.field1051 * arg5;
        arg11.field1053 -= arg11.field1061 * arg5;
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
        arg11.field1052 += arg11.field1051 * arg5;
        arg11.field1053 += arg11.field1061 * arg5;
        arg11.field1058 = arg6;
        arg11.field1054 = arg4;
        return arg5;
    }

    @ObfuscatedName("ag.ag(II[B[IIIIIIIIIILag;II)I")
    public static int method982(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class44 arg13, int arg14, int arg15) {
        arg13.field1058 -= arg13.field1057 * arg5;
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
        arg13.field1058 += arg13.field1057 * var27;
        arg13.field1052 = arg6;
        arg13.field1053 = arg7;
        arg13.field1054 = arg4;
        return var27;
    }

    @ObfuscatedName("ag.ah(II[B[IIIIIIIILag;II)I")
    public static int method1069(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
        arg11.field1052 -= arg11.field1051 * arg5;
        arg11.field1053 -= arg11.field1061 * arg5;
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
        arg11.field1052 += arg11.field1051 * arg5;
        arg11.field1053 += arg11.field1061 * arg5;
        arg11.field1058 = arg6;
        arg11.field1054 = arg4;
        return arg5;
    }

    @ObfuscatedName("ag.af(II[B[IIIIIIIIIILag;II)I")
    public static int method961(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class44 arg13, int arg14, int arg15) {
        arg13.field1058 -= arg13.field1057 * arg5;
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
        arg13.field1058 += arg13.field1057 * var26;
        arg13.field1052 = arg6;
        arg13.field1053 = arg7;
        arg13.field1054 = arg4;
        return var26;
    }
}
