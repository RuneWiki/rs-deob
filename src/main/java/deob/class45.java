package deob;

@ObfuscatedName("am")
public class class45 extends class48 {

    @ObfuscatedName("am.i")
    public int field1062;

    @ObfuscatedName("am.f")
    public int field1059;

    @ObfuscatedName("am.e")
    public int field1056;

    @ObfuscatedName("am.t")
    public int field1057;

    @ObfuscatedName("am.d")
    public int field1058;

    @ObfuscatedName("am.p")
    public int field1068;

    @ObfuscatedName("am.k")
    public int field1060;

    @ObfuscatedName("am.r")
    public int field1061;

    @ObfuscatedName("am.l")
    public int field1054;

    @ObfuscatedName("am.a")
    public int field1063;

    @ObfuscatedName("am.z")
    public boolean field1064;

    @ObfuscatedName("am.s")
    public int field1065;

    @ObfuscatedName("am.m")
    public int field1055;

    @ObfuscatedName("am.u")
    public int field1067;

    @ObfuscatedName("am.g")
    public int field1066;

    @ObfuscatedName("am.i(II)I")
    public static int method1089(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("am.w(II)I")
    public static int method1036(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("am.f()I")
    public int method954() {
        int var1 = this.field1058 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1061 == 0) {
            var2 -= this.field1062 * var2 / (((class63) this.field1076).field1238.length << 8);
        } else if (this.field1061 >= 0) {
            var2 -= this.field1054 * var2 / ((class63) this.field1076).field1238.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class45(class63 arg0, int arg1, int arg2) {
        this.field1076 = arg0;
        this.field1054 = arg0.field1240;
        this.field1063 = arg0.field1239;
        this.field1064 = arg0.field1242;
        this.field1059 = arg1;
        this.field1056 = arg2;
        this.field1057 = 8192;
        this.field1062 = 0;
        this.method957();
    }

    public class45(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1076 = arg0;
        this.field1054 = arg0.field1240;
        this.field1063 = arg0.field1239;
        this.field1064 = arg0.field1242;
        this.field1059 = arg1;
        this.field1056 = arg2;
        this.field1057 = arg3;
        this.field1062 = 0;
        this.method957();
    }

    @ObfuscatedName("am.e(Lbb;II)Lam;")
    public static class45 method1068(class63 arg0, int arg1, int arg2) {
        return arg0.field1238 == null || arg0.field1238.length == 0 ? null : new class45(arg0, (int) ((long) arg0.field1241 * 256L * (long) arg1 / (long) (Statics.field1100 * 100)), arg2 << 6);
    }

    @ObfuscatedName("am.t(Lbb;III)Lam;")
    public static class45 method956(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1238 == null || arg0.field1238.length == 0 ? null : new class45(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("am.d()V")
    public void method957() {
        this.field1058 = this.field1056;
        this.field1068 = method1089(this.field1056, this.field1057);
        this.field1060 = method1036(this.field1056, this.field1057);
    }

    @ObfuscatedName("am.p(I)V")
    public synchronized void method1032(int arg0) {
        this.field1061 = arg0;
    }

    @ObfuscatedName("am.k(I)V")
    public synchronized void method959(int arg0) {
        this.method1047(arg0 << 6, this.method963());
    }

    @ObfuscatedName("am.r(I)V")
    public synchronized void method960(int arg0) {
        this.method1047(arg0, this.method963());
    }

    @ObfuscatedName("am.l(II)V")
    public synchronized void method1047(int arg0, int arg1) {
        this.field1056 = arg0;
        this.field1057 = arg1;
        this.field1065 = 0;
        this.method957();
    }

    @ObfuscatedName("am.a()I")
    public synchronized int method1020() {
        return this.field1056 == Integer.MIN_VALUE ? 0 : this.field1056;
    }

    @ObfuscatedName("am.z()I")
    public synchronized int method963() {
        return this.field1057 < 0 ? -1 : this.field1057;
    }

    @ObfuscatedName("am.s(I)V")
    public synchronized void method964(int arg0) {
        int var2 = ((class63) this.field1076).field1238.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1062 = arg0;
    }

    @ObfuscatedName("am.m(Z)V")
    public synchronized void method965(boolean arg0) {
        this.field1059 = (this.field1059 >>> 31) + (this.field1059 ^ this.field1059 >> 31);
        if (arg0) {
            this.field1059 = -this.field1059;
        }
    }

    @ObfuscatedName("am.u()V")
    public void method966() {
        if (this.field1065 == 0) {
            return;
        }
        if (this.field1056 == Integer.MIN_VALUE) {
            this.field1056 = 0;
        }
        this.field1065 = 0;
        this.method957();
    }

    @ObfuscatedName("am.g(II)V")
    public synchronized void method967(int arg0, int arg1) {
        this.method1038(arg0, arg1, this.method963());
    }

    @ObfuscatedName("am.o(III)V")
    public synchronized void method1038(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1047(arg1, arg2);
            return;
        }
        int var4 = method1089(arg1, arg2);
        int var5 = method1036(arg1, arg2);
        if (this.field1068 == var4 && this.field1060 == var5) {
            this.field1065 = 0;
            return;
        }
        int var6 = arg1 - this.field1058;
        if (this.field1058 - arg1 > var6) {
            var6 = this.field1058 - arg1;
        }
        if (var4 - this.field1068 > var6) {
            var6 = var4 - this.field1068;
        }
        if (this.field1068 - var4 > var6) {
            var6 = this.field1068 - var4;
        }
        if (var5 - this.field1060 > var6) {
            var6 = var5 - this.field1060;
        }
        if (this.field1060 - var5 > var6) {
            var6 = this.field1060 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1065 = arg0;
        this.field1056 = arg1;
        this.field1057 = arg2;
        this.field1055 = (arg1 - this.field1058) / arg0;
        this.field1067 = (var4 - this.field1068) / arg0;
        this.field1066 = (var5 - this.field1060) / arg0;
    }

    @ObfuscatedName("am.v(I)V")
    public synchronized void method969(int arg0) {
        if (arg0 == 0) {
            this.method960(0);
            this.method3328();
        } else if (this.field1068 == 0 && this.field1060 == 0) {
            this.field1065 = 0;
            this.field1056 = 0;
            this.field1058 = 0;
            this.method3328();
        } else {
            int var2 = -this.field1058;
            if (this.field1058 > var2) {
                var2 = this.field1058;
            }
            if (-this.field1068 > var2) {
                var2 = -this.field1068;
            }
            if (this.field1068 > var2) {
                var2 = this.field1068;
            }
            if (-this.field1060 > var2) {
                var2 = -this.field1060;
            }
            if (this.field1060 > var2) {
                var2 = this.field1060;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1065 = arg0;
            this.field1056 = Integer.MIN_VALUE;
            this.field1055 = -this.field1058 / arg0;
            this.field1067 = -this.field1068 / arg0;
            this.field1066 = -this.field1060 / arg0;
        }
    }

    @ObfuscatedName("am.j(I)V")
    public synchronized void method970(int arg0) {
        if (this.field1059 < 0) {
            this.field1059 = -arg0;
        } else {
            this.field1059 = arg0;
        }
    }

    @ObfuscatedName("am.n()I")
    public synchronized int method971() {
        return this.field1059 < 0 ? -this.field1059 : this.field1059;
    }

    @ObfuscatedName("am.q()Z")
    public boolean method972() {
        return this.field1062 < 0 || this.field1062 >= ((class63) this.field1076).field1238.length << 8;
    }

    @ObfuscatedName("am.c()Z")
    public boolean method973() {
        return this.field1065 != 0;
    }

    @ObfuscatedName("am.h()Lar;")
    public class48 method974() {
        return null;
    }

    @ObfuscatedName("am.b()Lar;")
    public class48 method975() {
        return null;
    }

    @ObfuscatedName("am.y()I")
    public int method976() {
        return this.field1056 == 0 && this.field1065 == 0 ? 0 : 1;
    }

    @ObfuscatedName("am.x([III)V")
    public synchronized void method1005(int[] arg0, int arg1, int arg2) {
        if (this.field1056 == 0 && this.field1065 == 0) {
            this.method988(arg2);
            return;
        }
        class63 var4 = (class63) this.field1076;
        int var5 = this.field1054 << 8;
        int var6 = this.field1063 << 8;
        int var7 = var4.field1238.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1061 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1062 < 0) {
            if (this.field1059 <= 0) {
                this.method966();
                this.method3328();
                return;
            }
            this.field1062 = 0;
        }
        if (this.field1062 >= var7) {
            if (this.field1059 >= 0) {
                this.method966();
                this.method3328();
                return;
            }
            this.field1062 = var7 - 1;
        }
        if (this.field1061 >= 0) {
            if (this.field1061 > 0) {
                if (this.field1064) {
                    label131: {
                        if (this.field1059 < 0) {
                            var9 = this.method980(arg0, arg1, var5, var10, var4.field1238[this.field1054]);
                            if (this.field1062 >= var5) {
                                return;
                            }
                            this.field1062 = var5 + var5 - 1 - this.field1062;
                            this.field1059 = -this.field1059;
                            if (--this.field1061 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1096(arg0, var9, var6, var10, var4.field1238[this.field1063 - 1]);
                            if (this.field1062 < var6) {
                                return;
                            }
                            this.field1062 = var6 + var6 - 1 - this.field1062;
                            this.field1059 = -this.field1059;
                            if (--this.field1061 == 0) {
                                break;
                            }
                            var9 = this.method980(arg0, var9, var5, var10, var4.field1238[this.field1054]);
                            if (this.field1062 >= var5) {
                                return;
                            }
                            this.field1062 = var5 + var5 - 1 - this.field1062;
                            this.field1059 = -this.field1059;
                        } while (--this.field1061 != 0);
                    }
                } else if (this.field1059 < 0) {
                    while (true) {
                        var9 = this.method980(arg0, var9, var5, var10, var4.field1238[this.field1063 - 1]);
                        if (this.field1062 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1062) / var8;
                        if (var12 >= this.field1061) {
                            this.field1062 += this.field1061 * var8;
                            this.field1061 = 0;
                            break;
                        }
                        this.field1062 += var8 * var12;
                        this.field1061 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1096(arg0, var9, var6, var10, var4.field1238[this.field1054]);
                        if (this.field1062 < var6) {
                            return;
                        }
                        int var13 = (this.field1062 - var5) / var8;
                        if (var13 >= this.field1061) {
                            this.field1062 -= this.field1061 * var8;
                            this.field1061 = 0;
                            break;
                        }
                        this.field1062 -= var8 * var13;
                        this.field1061 -= var13;
                    }
                }
            }
            if (this.field1059 < 0) {
                this.method980(arg0, var9, 0, var10, 0);
                if (this.field1062 < 0) {
                    this.field1062 = -1;
                    this.method966();
                    this.method3328();
                }
            } else {
                this.method1096(arg0, var9, var7, var10, 0);
                if (this.field1062 >= var7) {
                    this.field1062 = var7;
                    this.method966();
                    this.method3328();
                }
            }
        } else if (this.field1064) {
            if (this.field1059 < 0) {
                var9 = this.method980(arg0, arg1, var5, var10, var4.field1238[this.field1054]);
                if (this.field1062 >= var5) {
                    return;
                }
                this.field1062 = var5 + var5 - 1 - this.field1062;
                this.field1059 = -this.field1059;
            }
            while (true) {
                int var11 = this.method1096(arg0, var9, var6, var10, var4.field1238[this.field1063 - 1]);
                if (this.field1062 < var6) {
                    return;
                }
                this.field1062 = var6 + var6 - 1 - this.field1062;
                this.field1059 = -this.field1059;
                var9 = this.method980(arg0, var11, var5, var10, var4.field1238[this.field1054]);
                if (this.field1062 >= var5) {
                    return;
                }
                this.field1062 = var5 + var5 - 1 - this.field1062;
                this.field1059 = -this.field1059;
            }
        } else if (this.field1059 < 0) {
            while (true) {
                var9 = this.method980(arg0, var9, var5, var10, var4.field1238[this.field1063 - 1]);
                if (this.field1062 >= var5) {
                    return;
                }
                this.field1062 = var6 - 1 - (var6 - 1 - this.field1062) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1096(arg0, var9, var6, var10, var4.field1238[this.field1054]);
                if (this.field1062 < var6) {
                    return;
                }
                this.field1062 = (this.field1062 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("am.ao(I)V")
    public synchronized void method988(int arg0) {
        if (this.field1065 > 0) {
            if (arg0 >= this.field1065) {
                if (this.field1056 == Integer.MIN_VALUE) {
                    this.field1056 = 0;
                    this.field1060 = 0;
                    this.field1068 = 0;
                    this.field1058 = 0;
                    this.method3328();
                    arg0 = this.field1065;
                }
                this.field1065 = 0;
                this.method957();
            } else {
                this.field1058 += this.field1055 * arg0;
                this.field1068 += this.field1067 * arg0;
                this.field1060 += this.field1066 * arg0;
                this.field1065 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1076;
        int var3 = this.field1054 << 8;
        int var4 = this.field1063 << 8;
        int var5 = var2.field1238.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1061 = 0;
        }
        if (this.field1062 < 0) {
            if (this.field1059 <= 0) {
                this.method966();
                this.method3328();
                return;
            }
            this.field1062 = 0;
        }
        if (this.field1062 >= var5) {
            if (this.field1059 >= 0) {
                this.method966();
                this.method3328();
                return;
            }
            this.field1062 = var5 - 1;
        }
        this.field1062 += this.field1059 * arg0;
        if (this.field1061 >= 0) {
            if (this.field1061 > 0) {
                if (this.field1064) {
                    label121: {
                        if (this.field1059 < 0) {
                            if (this.field1062 >= var3) {
                                return;
                            }
                            this.field1062 = var3 + var3 - 1 - this.field1062;
                            this.field1059 = -this.field1059;
                            if (--this.field1061 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1062 < var4) {
                                return;
                            }
                            this.field1062 = var4 + var4 - 1 - this.field1062;
                            this.field1059 = -this.field1059;
                            if (--this.field1061 == 0) {
                                break;
                            }
                            if (this.field1062 >= var3) {
                                return;
                            }
                            this.field1062 = var3 + var3 - 1 - this.field1062;
                            this.field1059 = -this.field1059;
                        } while (--this.field1061 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1059 < 0) {
                            if (this.field1062 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1062) / var6;
                            if (var7 >= this.field1061) {
                                this.field1062 += this.field1061 * var6;
                                this.field1061 = 0;
                                break label153;
                            }
                            this.field1062 += var6 * var7;
                            this.field1061 -= var7;
                        } else if (this.field1062 >= var4) {
                            int var8 = (this.field1062 - var3) / var6;
                            if (var8 >= this.field1061) {
                                this.field1062 -= this.field1061 * var6;
                                this.field1061 = 0;
                                break label153;
                            }
                            this.field1062 -= var6 * var8;
                            this.field1061 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1059 < 0) {
                if (this.field1062 < 0) {
                    this.field1062 = -1;
                    this.method966();
                    this.method3328();
                }
            } else if (this.field1062 >= var5) {
                this.field1062 = var5;
                this.method966();
                this.method3328();
            }
        } else if (this.field1064) {
            if (this.field1059 < 0) {
                if (this.field1062 >= var3) {
                    return;
                }
                this.field1062 = var3 + var3 - 1 - this.field1062;
                this.field1059 = -this.field1059;
            }
            while (this.field1062 >= var4) {
                this.field1062 = var4 + var4 - 1 - this.field1062;
                this.field1059 = -this.field1059;
                if (this.field1062 >= var3) {
                    return;
                }
                this.field1062 = var3 + var3 - 1 - this.field1062;
                this.field1059 = -this.field1059;
            }
        } else if (this.field1059 < 0) {
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

    @ObfuscatedName("am.ae([IIIII)I")
    public int method1096(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1065 > 0) {
                int var6 = this.field1065 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1065 += arg1;
                if (this.field1059 == 256 && (this.field1062 & 0xFF) == 0) {
                    if (Statics.field1099) {
                        arg1 = method1101(0, ((class63) this.field1076).field1238, arg0, this.field1062, arg1, this.field1068, this.field1060, this.field1067, this.field1066, 0, var6, arg2, this);
                    } else {
                        arg1 = method999(((class63) this.field1076).field1238, arg0, this.field1062, arg1, this.field1058, this.field1055, 0, var6, arg2, this);
                    }
                } else if (Statics.field1099) {
                    arg1 = method953(0, 0, ((class63) this.field1076).field1238, arg0, this.field1062, arg1, this.field1068, this.field1060, this.field1067, this.field1066, 0, var6, arg2, this, this.field1059, arg4);
                } else {
                    arg1 = method994(0, 0, ((class63) this.field1076).field1238, arg0, this.field1062, arg1, this.field1058, this.field1055, 0, var6, arg2, this, this.field1059, arg4);
                }
                this.field1065 -= arg1;
                if (this.field1065 != 0) {
                    return arg1;
                }
                if (!this.method991()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1059 == 256 && (this.field1062 & 0xFF) == 0) {
                if (Statics.field1099) {
                    return method983(0, ((class63) this.field1076).field1238, arg0, this.field1062, arg1, this.field1068, this.field1060, 0, arg3, arg2, this);
                }
                return method982(((class63) this.field1076).field1238, arg0, this.field1062, arg1, this.field1058, 0, arg3, arg2, this);
            }
            if (Statics.field1099) {
                return method1053(0, 0, ((class63) this.field1076).field1238, arg0, this.field1062, arg1, this.field1068, this.field1060, 0, arg3, arg2, this, this.field1059, arg4);
            }
            return method986(0, 0, ((class63) this.field1076).field1238, arg0, this.field1062, arg1, this.field1058, 0, arg3, arg2, this, this.field1059, arg4);
        }
    }

    @ObfuscatedName("am.aa([IIIII)I")
    public int method980(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1065 > 0) {
                int var6 = this.field1065 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1065 += arg1;
                if (this.field1059 == -256 && (this.field1062 & 0xFF) == 0) {
                    if (Statics.field1099) {
                        arg1 = method1033(0, ((class63) this.field1076).field1238, arg0, this.field1062, arg1, this.field1068, this.field1060, this.field1067, this.field1066, 0, var6, arg2, this);
                    } else {
                        arg1 = method992(((class63) this.field1076).field1238, arg0, this.field1062, arg1, this.field1058, this.field1055, 0, var6, arg2, this);
                    }
                } else if (Statics.field1099) {
                    arg1 = method997(0, 0, ((class63) this.field1076).field1238, arg0, this.field1062, arg1, this.field1068, this.field1060, this.field1067, this.field1066, 0, var6, arg2, this, this.field1059, arg4);
                } else {
                    arg1 = method996(0, 0, ((class63) this.field1076).field1238, arg0, this.field1062, arg1, this.field1058, this.field1055, 0, var6, arg2, this, this.field1059, arg4);
                }
                this.field1065 -= arg1;
                if (this.field1065 != 0) {
                    return arg1;
                }
                if (!this.method991()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1059 == -256 && (this.field1062 & 0xFF) == 0) {
                if (Statics.field1099) {
                    return method1074(0, ((class63) this.field1076).field1238, arg0, this.field1062, arg1, this.field1068, this.field1060, 0, arg3, arg2, this);
                }
                return method984(((class63) this.field1076).field1238, arg0, this.field1062, arg1, this.field1058, 0, arg3, arg2, this);
            }
            if (Statics.field1099) {
                return method989(0, 0, ((class63) this.field1076).field1238, arg0, this.field1062, arg1, this.field1068, this.field1060, 0, arg3, arg2, this, this.field1059, arg4);
            }
            return method1021(0, 0, ((class63) this.field1076).field1238, arg0, this.field1062, arg1, this.field1058, 0, arg3, arg2, this, this.field1059, arg4);
        }
    }

    @ObfuscatedName("am.ah()Z")
    public boolean method991() {
        int var1 = this.field1056;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1089(var1, this.field1057);
            var2 = method1036(var1, this.field1057);
        }
        if (this.field1058 != var1 || this.field1068 != var3 || this.field1060 != var2) {
            if (this.field1058 < var1) {
                this.field1055 = 1;
                this.field1065 = var1 - this.field1058;
            } else if (this.field1058 > var1) {
                this.field1055 = -1;
                this.field1065 = this.field1058 - var1;
            } else {
                this.field1055 = 0;
            }
            if (this.field1068 < var3) {
                this.field1067 = 1;
                if (this.field1065 == 0 || this.field1065 > var3 - this.field1068) {
                    this.field1065 = var3 - this.field1068;
                }
            } else if (this.field1068 > var3) {
                this.field1067 = -1;
                if (this.field1065 == 0 || this.field1065 > this.field1068 - var3) {
                    this.field1065 = this.field1068 - var3;
                }
            } else {
                this.field1067 = 0;
            }
            if (this.field1060 < var2) {
                this.field1066 = 1;
                if (this.field1065 == 0 || this.field1065 > var2 - this.field1060) {
                    this.field1065 = var2 - this.field1060;
                }
            } else if (this.field1060 > var2) {
                this.field1066 = -1;
                if (this.field1065 == 0 || this.field1065 > this.field1060 - var2) {
                    this.field1065 = this.field1060 - var2;
                }
            } else {
                this.field1066 = 0;
            }
            return false;
        } else if (this.field1056 == Integer.MIN_VALUE) {
            this.field1056 = 0;
            this.field1060 = 0;
            this.field1068 = 0;
            this.field1058 = 0;
            this.method3328();
            return true;
        } else {
            this.method957();
            return false;
        }
    }

    @ObfuscatedName("am.aw([B[IIIIIIILam;)I")
    public static int method982(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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

    @ObfuscatedName("am.an(I[B[IIIIIIIILam;)I")
    public static int method983(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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

    @ObfuscatedName("am.av([B[IIIIIIILam;)I")
    public static int method984(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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

    @ObfuscatedName("am.ak(I[B[IIIIIIIILam;)I")
    public static int method1074(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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

    @ObfuscatedName("am.ax(II[B[IIIIIIILam;II)I")
    public static int method986(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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

    @ObfuscatedName("am.ab(II[B[IIIIIIIILam;II)I")
    public static int method1053(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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

    @ObfuscatedName("am.af(II[B[IIIIIIILam;II)I")
    public static int method1021(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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

    @ObfuscatedName("am.ai(II[B[IIIIIIIILam;II)I")
    public static int method989(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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

    @ObfuscatedName("am.at([B[IIIIIIIILam;)I")
    public static int method999(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1068 += (var14 - arg3) * arg9.field1067;
        arg9.field1060 += (var14 - arg3) * arg9.field1066;
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

    @ObfuscatedName("am.aq(I[B[IIIIIIIIIILam;)I")
    public static int method1101(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1058 += (var19 - arg4) * arg12.field1055;
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
        arg12.field1068 = var15 >> 2;
        arg12.field1060 = var16 >> 2;
        arg12.field1062 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("am.ac([B[IIIIIIIILam;)I")
    public static int method992(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1068 += (var14 - arg3) * arg9.field1067;
        arg9.field1060 += (var14 - arg3) * arg9.field1066;
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

    @ObfuscatedName("am.al(I[B[IIIIIIIIIILam;)I")
    public static int method1033(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1058 += (var19 - arg4) * arg12.field1055;
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
        arg12.field1068 = var15 >> 2;
        arg12.field1060 = var16 >> 2;
        arg12.field1062 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("am.ag(II[B[IIIIIIIILam;II)I")
    public static int method994(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1068 -= arg11.field1067 * arg5;
        arg11.field1060 -= arg11.field1066 * arg5;
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
        arg11.field1068 += arg11.field1067 * arg5;
        arg11.field1060 += arg11.field1066 * arg5;
        arg11.field1058 = arg6;
        arg11.field1062 = arg4;
        return arg5;
    }

    @ObfuscatedName("am.ap(II[B[IIIIIIIIIILam;II)I")
    public static int method953(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1058 -= arg13.field1055 * arg5;
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
        arg13.field1058 += arg13.field1055 * var27;
        arg13.field1068 = arg6;
        arg13.field1060 = arg7;
        arg13.field1062 = arg4;
        return var27;
    }

    @ObfuscatedName("am.am(II[B[IIIIIIIILam;II)I")
    public static int method996(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1068 -= arg11.field1067 * arg5;
        arg11.field1060 -= arg11.field1066 * arg5;
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
        arg11.field1068 += arg11.field1067 * arg5;
        arg11.field1060 += arg11.field1066 * arg5;
        arg11.field1058 = arg6;
        arg11.field1062 = arg4;
        return arg5;
    }

    @ObfuscatedName("am.as(II[B[IIIIIIIIIILam;II)I")
    public static int method997(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1058 -= arg13.field1055 * arg5;
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
        arg13.field1058 += arg13.field1055 * var26;
        arg13.field1068 = arg6;
        arg13.field1060 = arg7;
        arg13.field1062 = arg4;
        return var26;
    }
}
