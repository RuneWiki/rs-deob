package deob;

@ObfuscatedName("an")
public class class45 extends class48 {

    @ObfuscatedName("an.p")
    public int field1049;

    @ObfuscatedName("an.e")
    public int field1039;

    @ObfuscatedName("an.a")
    public int field1040;

    @ObfuscatedName("an.h")
    public int field1041;

    @ObfuscatedName("an.y")
    public int field1042;

    @ObfuscatedName("an.j")
    public int field1043;

    @ObfuscatedName("an.l")
    public int field1044;

    @ObfuscatedName("an.f")
    public int field1045;

    @ObfuscatedName("an.n")
    public int field1050;

    @ObfuscatedName("an.k")
    public int field1047;

    @ObfuscatedName("an.q")
    public boolean field1051;

    @ObfuscatedName("an.v")
    public int field1052;

    @ObfuscatedName("an.z")
    public int field1038;

    @ObfuscatedName("an.m")
    public int field1048;

    @ObfuscatedName("an.r")
    public int field1046;

    @ObfuscatedName("an.p(II)I")
    public static int method1077(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("an.e(II)I")
    public static int method964(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("an.a()I")
    public int method965() {
        int var1 = this.field1042 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1045 == 0) {
            var2 -= this.field1049 * var2 / (((class63) this.field1060).field1236.length << 8);
        } else if (this.field1045 >= 0) {
            var2 -= this.field1050 * var2 / ((class63) this.field1060).field1236.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class45(class63 arg0, int arg1, int arg2) {
        this.field1060 = arg0;
        this.field1050 = arg0.field1237;
        this.field1047 = arg0.field1238;
        this.field1051 = arg0.field1235;
        this.field1039 = arg1;
        this.field1040 = arg2;
        this.field1041 = 8192;
        this.field1049 = 0;
        this.method969();
    }

    public class45(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1060 = arg0;
        this.field1050 = arg0.field1237;
        this.field1047 = arg0.field1238;
        this.field1051 = arg0.field1235;
        this.field1039 = arg1;
        this.field1040 = arg2;
        this.field1041 = arg3;
        this.field1049 = 0;
        this.method969();
    }

    @ObfuscatedName("an.h(Lby;II)Lan;")
    public static class45 method992(class63 arg0, int arg1, int arg2) {
        return arg0.field1236 == null || arg0.field1236.length == 0 ? null : new class45(arg0, (int) ((long) arg0.field1239 * 256L * (long) arg1 / (long) (Statics.field2457 * 100)), arg2 << 6);
    }

    @ObfuscatedName("an.y(Lby;III)Lan;")
    public static class45 method968(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1236 == null || arg0.field1236.length == 0 ? null : new class45(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("an.j()V")
    public void method969() {
        this.field1042 = this.field1040;
        this.field1043 = method1077(this.field1040, this.field1041);
        this.field1044 = method964(this.field1040, this.field1041);
    }

    @ObfuscatedName("an.l(I)V")
    public synchronized void method970(int arg0) {
        this.field1045 = arg0;
    }

    @ObfuscatedName("an.f(I)V")
    public synchronized void method971(int arg0) {
        this.method1058(arg0 << 6, this.method1100());
    }

    @ObfuscatedName("an.n(I)V")
    public synchronized void method972(int arg0) {
        this.method1058(arg0, this.method1100());
    }

    @ObfuscatedName("an.k(II)V")
    public synchronized void method1058(int arg0, int arg1) {
        this.field1040 = arg0;
        this.field1041 = arg1;
        this.field1052 = 0;
        this.method969();
    }

    @ObfuscatedName("an.q()I")
    public synchronized int method974() {
        return this.field1040 == Integer.MIN_VALUE ? 0 : this.field1040;
    }

    @ObfuscatedName("an.w()I")
    public synchronized int method1100() {
        return this.field1041 < 0 ? -1 : this.field1041;
    }

    @ObfuscatedName("an.v(I)V")
    public synchronized void method1039(int arg0) {
        int var2 = ((class63) this.field1060).field1236.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1049 = arg0;
    }

    @ObfuscatedName("an.z(Z)V")
    public synchronized void method1042(boolean arg0) {
        this.field1039 = (this.field1039 >>> 31) + (this.field1039 ^ this.field1039 >> 31);
        if (arg0) {
            this.field1039 = -this.field1039;
        }
    }

    @ObfuscatedName("an.m()V")
    public void method1098() {
        if (this.field1052 == 0) {
            return;
        }
        if (this.field1040 == Integer.MIN_VALUE) {
            this.field1040 = 0;
        }
        this.field1052 = 0;
        this.method969();
    }

    @ObfuscatedName("an.r(II)V")
    public synchronized void method976(int arg0, int arg1) {
        this.method979(arg0, arg1, this.method1100());
    }

    @ObfuscatedName("an.u(III)V")
    public synchronized void method979(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1058(arg1, arg2);
            return;
        }
        int var4 = method1077(arg1, arg2);
        int var5 = method964(arg1, arg2);
        if (this.field1043 == var4 && this.field1044 == var5) {
            this.field1052 = 0;
            return;
        }
        int var6 = arg1 - this.field1042;
        if (this.field1042 - arg1 > var6) {
            var6 = this.field1042 - arg1;
        }
        if (var4 - this.field1043 > var6) {
            var6 = var4 - this.field1043;
        }
        if (this.field1043 - var4 > var6) {
            var6 = this.field1043 - var4;
        }
        if (var5 - this.field1044 > var6) {
            var6 = var5 - this.field1044;
        }
        if (this.field1044 - var5 > var6) {
            var6 = this.field1044 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1052 = arg0;
        this.field1040 = arg1;
        this.field1041 = arg2;
        this.field1038 = (arg1 - this.field1042) / arg0;
        this.field1048 = (var4 - this.field1043) / arg0;
        this.field1046 = (var5 - this.field1044) / arg0;
    }

    @ObfuscatedName("an.i(I)V")
    public synchronized void method980(int arg0) {
        if (arg0 == 0) {
            this.method972(0);
            this.method3360();
        } else if (this.field1043 == 0 && this.field1044 == 0) {
            this.field1052 = 0;
            this.field1040 = 0;
            this.field1042 = 0;
            this.method3360();
        } else {
            int var2 = -this.field1042;
            if (this.field1042 > var2) {
                var2 = this.field1042;
            }
            if (-this.field1043 > var2) {
                var2 = -this.field1043;
            }
            if (this.field1043 > var2) {
                var2 = this.field1043;
            }
            if (-this.field1044 > var2) {
                var2 = -this.field1044;
            }
            if (this.field1044 > var2) {
                var2 = this.field1044;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1052 = arg0;
            this.field1040 = Integer.MIN_VALUE;
            this.field1038 = -this.field1042 / arg0;
            this.field1048 = -this.field1043 / arg0;
            this.field1046 = -this.field1044 / arg0;
        }
    }

    @ObfuscatedName("an.x(I)V")
    public synchronized void method981(int arg0) {
        if (this.field1039 < 0) {
            this.field1039 = -arg0;
        } else {
            this.field1039 = arg0;
        }
    }

    @ObfuscatedName("an.s()I")
    public synchronized int method1069() {
        return this.field1039 < 0 ? -this.field1039 : this.field1039;
    }

    @ObfuscatedName("an.o()Z")
    public boolean method983() {
        return this.field1049 < 0 || this.field1049 >= ((class63) this.field1060).field1236.length << 8;
    }

    @ObfuscatedName("an.g()Z")
    public boolean method984() {
        return this.field1052 != 0;
    }

    @ObfuscatedName("an.d()Las;")
    public class48 method985() {
        return null;
    }

    @ObfuscatedName("an.t()Las;")
    public class48 method986() {
        return null;
    }

    @ObfuscatedName("an.b()I")
    public int method1041() {
        return this.field1040 == 0 && this.field1052 == 0 ? 0 : 1;
    }

    @ObfuscatedName("an.c([III)V")
    public synchronized void method994(int[] arg0, int arg1, int arg2) {
        if (this.field1040 == 0 && this.field1052 == 0) {
            this.method1061(arg2);
            return;
        }
        class63 var4 = (class63) this.field1060;
        int var5 = this.field1050 << 8;
        int var6 = this.field1047 << 8;
        int var7 = var4.field1236.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1045 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1049 < 0) {
            if (this.field1039 <= 0) {
                this.method1098();
                this.method3360();
                return;
            }
            this.field1049 = 0;
        }
        if (this.field1049 >= var7) {
            if (this.field1039 >= 0) {
                this.method1098();
                this.method3360();
                return;
            }
            this.field1049 = var7 - 1;
        }
        if (this.field1045 >= 0) {
            if (this.field1045 > 0) {
                if (this.field1051) {
                    label131: {
                        if (this.field1039 < 0) {
                            var9 = this.method1018(arg0, arg1, var5, var10, var4.field1236[this.field1050]);
                            if (this.field1049 >= var5) {
                                return;
                            }
                            this.field1049 = var5 + var5 - 1 - this.field1049;
                            this.field1039 = -this.field1039;
                            if (--this.field1045 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method990(arg0, var9, var6, var10, var4.field1236[this.field1047 - 1]);
                            if (this.field1049 < var6) {
                                return;
                            }
                            this.field1049 = var6 + var6 - 1 - this.field1049;
                            this.field1039 = -this.field1039;
                            if (--this.field1045 == 0) {
                                break;
                            }
                            var9 = this.method1018(arg0, var9, var5, var10, var4.field1236[this.field1050]);
                            if (this.field1049 >= var5) {
                                return;
                            }
                            this.field1049 = var5 + var5 - 1 - this.field1049;
                            this.field1039 = -this.field1039;
                        } while (--this.field1045 != 0);
                    }
                } else if (this.field1039 < 0) {
                    while (true) {
                        var9 = this.method1018(arg0, var9, var5, var10, var4.field1236[this.field1047 - 1]);
                        if (this.field1049 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1049) / var8;
                        if (var12 >= this.field1045) {
                            this.field1049 += this.field1045 * var8;
                            this.field1045 = 0;
                            break;
                        }
                        this.field1049 += var8 * var12;
                        this.field1045 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method990(arg0, var9, var6, var10, var4.field1236[this.field1050]);
                        if (this.field1049 < var6) {
                            return;
                        }
                        int var13 = (this.field1049 - var5) / var8;
                        if (var13 >= this.field1045) {
                            this.field1049 -= this.field1045 * var8;
                            this.field1045 = 0;
                            break;
                        }
                        this.field1049 -= var8 * var13;
                        this.field1045 -= var13;
                    }
                }
            }
            if (this.field1039 < 0) {
                this.method1018(arg0, var9, 0, var10, 0);
                if (this.field1049 < 0) {
                    this.field1049 = -1;
                    this.method1098();
                    this.method3360();
                }
            } else {
                this.method990(arg0, var9, var7, var10, 0);
                if (this.field1049 >= var7) {
                    this.field1049 = var7;
                    this.method1098();
                    this.method3360();
                }
            }
        } else if (this.field1051) {
            if (this.field1039 < 0) {
                var9 = this.method1018(arg0, arg1, var5, var10, var4.field1236[this.field1050]);
                if (this.field1049 >= var5) {
                    return;
                }
                this.field1049 = var5 + var5 - 1 - this.field1049;
                this.field1039 = -this.field1039;
            }
            while (true) {
                int var11 = this.method990(arg0, var9, var6, var10, var4.field1236[this.field1047 - 1]);
                if (this.field1049 < var6) {
                    return;
                }
                this.field1049 = var6 + var6 - 1 - this.field1049;
                this.field1039 = -this.field1039;
                var9 = this.method1018(arg0, var11, var5, var10, var4.field1236[this.field1050]);
                if (this.field1049 >= var5) {
                    return;
                }
                this.field1049 = var5 + var5 - 1 - this.field1049;
                this.field1039 = -this.field1039;
            }
        } else if (this.field1039 < 0) {
            while (true) {
                var9 = this.method1018(arg0, var9, var5, var10, var4.field1236[this.field1047 - 1]);
                if (this.field1049 >= var5) {
                    return;
                }
                this.field1049 = var6 - 1 - (var6 - 1 - this.field1049) % var8;
            }
        } else {
            while (true) {
                var9 = this.method990(arg0, var9, var6, var10, var4.field1236[this.field1050]);
                if (this.field1049 < var6) {
                    return;
                }
                this.field1049 = (this.field1049 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("an.aw(I)V")
    public synchronized void method1061(int arg0) {
        if (this.field1052 > 0) {
            if (arg0 >= this.field1052) {
                if (this.field1040 == Integer.MIN_VALUE) {
                    this.field1040 = 0;
                    this.field1044 = 0;
                    this.field1043 = 0;
                    this.field1042 = 0;
                    this.method3360();
                    arg0 = this.field1052;
                }
                this.field1052 = 0;
                this.method969();
            } else {
                this.field1042 += this.field1038 * arg0;
                this.field1043 += this.field1048 * arg0;
                this.field1044 += this.field1046 * arg0;
                this.field1052 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1060;
        int var3 = this.field1050 << 8;
        int var4 = this.field1047 << 8;
        int var5 = var2.field1236.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1045 = 0;
        }
        if (this.field1049 < 0) {
            if (this.field1039 <= 0) {
                this.method1098();
                this.method3360();
                return;
            }
            this.field1049 = 0;
        }
        if (this.field1049 >= var5) {
            if (this.field1039 >= 0) {
                this.method1098();
                this.method3360();
                return;
            }
            this.field1049 = var5 - 1;
        }
        this.field1049 += this.field1039 * arg0;
        if (this.field1045 >= 0) {
            if (this.field1045 > 0) {
                if (this.field1051) {
                    label121: {
                        if (this.field1039 < 0) {
                            if (this.field1049 >= var3) {
                                return;
                            }
                            this.field1049 = var3 + var3 - 1 - this.field1049;
                            this.field1039 = -this.field1039;
                            if (--this.field1045 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1049 < var4) {
                                return;
                            }
                            this.field1049 = var4 + var4 - 1 - this.field1049;
                            this.field1039 = -this.field1039;
                            if (--this.field1045 == 0) {
                                break;
                            }
                            if (this.field1049 >= var3) {
                                return;
                            }
                            this.field1049 = var3 + var3 - 1 - this.field1049;
                            this.field1039 = -this.field1039;
                        } while (--this.field1045 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1039 < 0) {
                            if (this.field1049 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1049) / var6;
                            if (var7 >= this.field1045) {
                                this.field1049 += this.field1045 * var6;
                                this.field1045 = 0;
                                break label153;
                            }
                            this.field1049 += var6 * var7;
                            this.field1045 -= var7;
                        } else if (this.field1049 >= var4) {
                            int var8 = (this.field1049 - var3) / var6;
                            if (var8 >= this.field1045) {
                                this.field1049 -= this.field1045 * var6;
                                this.field1045 = 0;
                                break label153;
                            }
                            this.field1049 -= var6 * var8;
                            this.field1045 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1039 < 0) {
                if (this.field1049 < 0) {
                    this.field1049 = -1;
                    this.method1098();
                    this.method3360();
                }
            } else if (this.field1049 >= var5) {
                this.field1049 = var5;
                this.method1098();
                this.method3360();
            }
        } else if (this.field1051) {
            if (this.field1039 < 0) {
                if (this.field1049 >= var3) {
                    return;
                }
                this.field1049 = var3 + var3 - 1 - this.field1049;
                this.field1039 = -this.field1039;
            }
            while (this.field1049 >= var4) {
                this.field1049 = var4 + var4 - 1 - this.field1049;
                this.field1039 = -this.field1039;
                if (this.field1049 >= var3) {
                    return;
                }
                this.field1049 = var3 + var3 - 1 - this.field1049;
                this.field1039 = -this.field1039;
            }
        } else if (this.field1039 < 0) {
            if (this.field1049 >= var3) {
                return;
            }
            this.field1049 = var4 - 1 - (var4 - 1 - this.field1049) % var6;
        } else if (this.field1049 >= var4) {
            this.field1049 = (this.field1049 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("an.ap([IIIII)I")
    public int method990(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1052 > 0) {
                int var6 = this.field1052 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1052 += arg1;
                if (this.field1039 == 256 && (this.field1049 & 0xFF) == 0) {
                    if (Statics.field1089) {
                        arg1 = method1002(0, ((class63) this.field1060).field1236, arg0, this.field1049, arg1, this.field1043, this.field1044, this.field1048, this.field1046, 0, var6, arg2, this);
                    } else {
                        arg1 = method1001(((class63) this.field1060).field1236, arg0, this.field1049, arg1, this.field1042, this.field1038, 0, var6, arg2, this);
                    }
                } else if (Statics.field1089) {
                    arg1 = method1006(0, 0, ((class63) this.field1060).field1236, arg0, this.field1049, arg1, this.field1043, this.field1044, this.field1048, this.field1046, 0, var6, arg2, this, this.field1039, arg4);
                } else {
                    arg1 = method1005(0, 0, ((class63) this.field1060).field1236, arg0, this.field1049, arg1, this.field1042, this.field1038, 0, var6, arg2, this, this.field1039, arg4);
                }
                this.field1052 -= arg1;
                if (this.field1052 != 0) {
                    return arg1;
                }
                if (!this.method963()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1039 == 256 && (this.field1049 & 0xFF) == 0) {
                if (Statics.field1089) {
                    return method1105(0, ((class63) this.field1060).field1236, arg0, this.field1049, arg1, this.field1043, this.field1044, 0, arg3, arg2, this);
                }
                return method1106(((class63) this.field1060).field1236, arg0, this.field1049, arg1, this.field1042, 0, arg3, arg2, this);
            }
            if (Statics.field1089) {
                return method1036(0, 0, ((class63) this.field1060).field1236, arg0, this.field1049, arg1, this.field1043, this.field1044, 0, arg3, arg2, this, this.field1039, arg4);
            }
            return method997(0, 0, ((class63) this.field1060).field1236, arg0, this.field1049, arg1, this.field1042, 0, arg3, arg2, this, this.field1039, arg4);
        }
    }

    @ObfuscatedName("an.am([IIIII)I")
    public int method1018(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1052 > 0) {
                int var6 = this.field1052 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1052 += arg1;
                if (this.field1039 == -256 && (this.field1049 & 0xFF) == 0) {
                    if (Statics.field1089) {
                        arg1 = method1004(0, ((class63) this.field1060).field1236, arg0, this.field1049, arg1, this.field1043, this.field1044, this.field1048, this.field1046, 0, var6, arg2, this);
                    } else {
                        arg1 = method987(((class63) this.field1060).field1236, arg0, this.field1049, arg1, this.field1042, this.field1038, 0, var6, arg2, this);
                    }
                } else if (Statics.field1089) {
                    arg1 = method1020(0, 0, ((class63) this.field1060).field1236, arg0, this.field1049, arg1, this.field1043, this.field1044, this.field1048, this.field1046, 0, var6, arg2, this, this.field1039, arg4);
                } else {
                    arg1 = method1007(0, 0, ((class63) this.field1060).field1236, arg0, this.field1049, arg1, this.field1042, this.field1038, 0, var6, arg2, this, this.field1039, arg4);
                }
                this.field1052 -= arg1;
                if (this.field1052 != 0) {
                    return arg1;
                }
                if (!this.method963()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1039 == -256 && (this.field1049 & 0xFF) == 0) {
                if (Statics.field1089) {
                    return method982(0, ((class63) this.field1060).field1236, arg0, this.field1049, arg1, this.field1043, this.field1044, 0, arg3, arg2, this);
                }
                return method998(((class63) this.field1060).field1236, arg0, this.field1049, arg1, this.field1042, 0, arg3, arg2, this);
            }
            if (Statics.field1089) {
                return method1046(0, 0, ((class63) this.field1060).field1236, arg0, this.field1049, arg1, this.field1043, this.field1044, 0, arg3, arg2, this, this.field1039, arg4);
            }
            return method999(0, 0, ((class63) this.field1060).field1236, arg0, this.field1049, arg1, this.field1042, 0, arg3, arg2, this, this.field1039, arg4);
        }
    }

    @ObfuscatedName("an.az()Z")
    public boolean method963() {
        int var1 = this.field1040;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1077(var1, this.field1041);
            var2 = method964(var1, this.field1041);
        }
        if (this.field1042 != var1 || this.field1043 != var3 || this.field1044 != var2) {
            if (this.field1042 < var1) {
                this.field1038 = 1;
                this.field1052 = var1 - this.field1042;
            } else if (this.field1042 > var1) {
                this.field1038 = -1;
                this.field1052 = this.field1042 - var1;
            } else {
                this.field1038 = 0;
            }
            if (this.field1043 < var3) {
                this.field1048 = 1;
                if (this.field1052 == 0 || this.field1052 > var3 - this.field1043) {
                    this.field1052 = var3 - this.field1043;
                }
            } else if (this.field1043 > var3) {
                this.field1048 = -1;
                if (this.field1052 == 0 || this.field1052 > this.field1043 - var3) {
                    this.field1052 = this.field1043 - var3;
                }
            } else {
                this.field1048 = 0;
            }
            if (this.field1044 < var2) {
                this.field1046 = 1;
                if (this.field1052 == 0 || this.field1052 > var2 - this.field1044) {
                    this.field1052 = var2 - this.field1044;
                }
            } else if (this.field1044 > var2) {
                this.field1046 = -1;
                if (this.field1052 == 0 || this.field1052 > this.field1044 - var2) {
                    this.field1052 = this.field1044 - var2;
                }
            } else {
                this.field1046 = 0;
            }
            return false;
        } else if (this.field1040 == Integer.MIN_VALUE) {
            this.field1040 = 0;
            this.field1044 = 0;
            this.field1043 = 0;
            this.field1042 = 0;
            this.method3360();
            return true;
        } else {
            this.method969();
            return false;
        }
    }

    @ObfuscatedName("an.ax([B[IIIIIIILan;)I")
    public static int method1106(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field1049 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("an.af(I[B[IIIIIIIILan;)I")
    public static int method1105(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field1049 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("an.aa([B[IIIIIIILan;)I")
    public static int method998(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field1049 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("an.ag(I[B[IIIIIIIILan;)I")
    public static int method982(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field1049 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("an.aj(II[B[IIIIIIILan;II)I")
    public static int method997(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field1049 = arg4;
        return arg5;
    }

    @ObfuscatedName("an.aq(II[B[IIIIIIIILan;II)I")
    public static int method1036(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field1049 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("an.ah(II[B[IIIIIIILan;II)I")
    public static int method999(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field1049 = arg4;
        return arg5;
    }

    @ObfuscatedName("an.ae(II[B[IIIIIIIILan;II)I")
    public static int method1046(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field1049 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("an.ar([B[IIIIIIIILan;)I")
    public static int method1001(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1043 += (var14 - arg3) * arg9.field1048;
        arg9.field1044 += (var14 - arg3) * arg9.field1046;
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
        arg9.field1042 = var12 >> 2;
        arg9.field1049 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("an.ab(I[B[IIIIIIIIIILan;)I")
    public static int method1002(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1042 += (var19 - arg4) * arg12.field1038;
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
        arg12.field1043 = var15 >> 2;
        arg12.field1044 = var16 >> 2;
        arg12.field1049 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("an.ay([B[IIIIIIIILan;)I")
    public static int method987(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1043 += (var14 - arg3) * arg9.field1048;
        arg9.field1044 += (var14 - arg3) * arg9.field1046;
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
        arg9.field1042 = var12 >> 2;
        arg9.field1049 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("an.ac(I[B[IIIIIIIIIILan;)I")
    public static int method1004(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1042 += (var19 - arg4) * arg12.field1038;
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
        arg12.field1043 = var15 >> 2;
        arg12.field1044 = var16 >> 2;
        arg12.field1049 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("an.ad(II[B[IIIIIIIILan;II)I")
    public static int method1005(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1043 -= arg11.field1048 * arg5;
        arg11.field1044 -= arg11.field1046 * arg5;
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
        arg11.field1043 += arg11.field1048 * arg5;
        arg11.field1044 += arg11.field1046 * arg5;
        arg11.field1042 = arg6;
        arg11.field1049 = arg4;
        return arg5;
    }

    @ObfuscatedName("an.al(II[B[IIIIIIIIIILan;II)I")
    public static int method1006(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1042 -= arg13.field1038 * arg5;
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
        arg13.field1042 += arg13.field1038 * var27;
        arg13.field1043 = arg6;
        arg13.field1044 = arg7;
        arg13.field1049 = arg4;
        return var27;
    }

    @ObfuscatedName("an.an(II[B[IIIIIIIILan;II)I")
    public static int method1007(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1043 -= arg11.field1048 * arg5;
        arg11.field1044 -= arg11.field1046 * arg5;
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
        arg11.field1043 += arg11.field1048 * arg5;
        arg11.field1044 += arg11.field1046 * arg5;
        arg11.field1042 = arg6;
        arg11.field1049 = arg4;
        return arg5;
    }

    @ObfuscatedName("an.at(II[B[IIIIIIIIIILan;II)I")
    public static int method1020(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1042 -= arg13.field1038 * arg5;
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
        arg13.field1042 += arg13.field1038 * var26;
        arg13.field1043 = arg6;
        arg13.field1044 = arg7;
        arg13.field1049 = arg4;
        return var26;
    }
}
