package deob;

@ObfuscatedName("av")
public class class45 extends class48 {

    @ObfuscatedName("av.b")
    public int field1036;

    @ObfuscatedName("av.e")
    public int field1034;

    @ObfuscatedName("av.g")
    public int field1037;

    @ObfuscatedName("av.o")
    public int field1033;

    @ObfuscatedName("av.a")
    public int field1035;

    @ObfuscatedName("av.h")
    public int field1038;

    @ObfuscatedName("av.j")
    public int field1039;

    @ObfuscatedName("av.f")
    public int field1040;

    @ObfuscatedName("av.q")
    public int field1041;

    @ObfuscatedName("av.l")
    public int field1042;

    @ObfuscatedName("av.d")
    public boolean field1043;

    @ObfuscatedName("av.z")
    public int field1044;

    @ObfuscatedName("av.n")
    public int field1045;

    @ObfuscatedName("av.t")
    public int field1046;

    @ObfuscatedName("av.r")
    public int field1047;

    @ObfuscatedName("av.b(II)I")
    public static int method926(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("av.e(II)I")
    public static int method1019(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("av.g()I")
    public int method921() {
        int var1 = this.field1035 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1040 == 0) {
            var2 -= this.field1036 * var2 / (((class63) this.field1055).field1226.length << 8);
        } else if (this.field1040 >= 0) {
            var2 -= this.field1041 * var2 / ((class63) this.field1055).field1226.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class45(class63 arg0, int arg1, int arg2) {
        this.field1055 = arg0;
        this.field1041 = arg0.field1225;
        this.field1042 = arg0.field1228;
        this.field1043 = arg0.field1229;
        this.field1034 = arg1;
        this.field1037 = arg2;
        this.field1033 = 8192;
        this.field1036 = 0;
        this.method973();
    }

    public class45(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1055 = arg0;
        this.field1041 = arg0.field1225;
        this.field1042 = arg0.field1228;
        this.field1043 = arg0.field1229;
        this.field1034 = arg1;
        this.field1037 = arg2;
        this.field1033 = arg3;
        this.field1036 = 0;
        this.method973();
    }

    @ObfuscatedName("av.o(Lbv;II)Lav;")
    public static class45 method1044(class63 arg0, int arg1, int arg2) {
        return arg0.field1226 == null || arg0.field1226.length == 0 ? null : new class45(arg0, (int) ((long) arg0.field1227 * 256L * (long) arg1 / (long) (Statics.field1093 * 100)), arg2 << 6);
    }

    @ObfuscatedName("av.a(Lbv;III)Lav;")
    public static class45 method1059(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1226 == null || arg0.field1226.length == 0 ? null : new class45(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("av.h()V")
    public void method973() {
        this.field1035 = this.field1037;
        this.field1038 = method926(this.field1037, this.field1033);
        this.field1039 = method1019(this.field1037, this.field1033);
    }

    @ObfuscatedName("av.j(I)V")
    public synchronized void method1001(int arg0) {
        this.field1040 = arg0;
    }

    @ObfuscatedName("av.f(I)V")
    public synchronized void method1005(int arg0) {
        this.method929(arg0 << 6, this.method1002());
    }

    @ObfuscatedName("av.q(I)V")
    public synchronized void method928(int arg0) {
        this.method929(arg0, this.method1002());
    }

    @ObfuscatedName("av.l(II)V")
    public synchronized void method929(int arg0, int arg1) {
        this.field1037 = arg0;
        this.field1033 = arg1;
        this.field1044 = 0;
        this.method973();
    }

    @ObfuscatedName("av.d()I")
    public synchronized int method930() {
        return this.field1037 == Integer.MIN_VALUE ? 0 : this.field1037;
    }

    @ObfuscatedName("av.z()I")
    public synchronized int method1002() {
        return this.field1033 < 0 ? -1 : this.field1033;
    }

    @ObfuscatedName("av.n(I)V")
    public synchronized void method932(int arg0) {
        int var2 = ((class63) this.field1055).field1226.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1036 = arg0;
    }

    @ObfuscatedName("av.t(Z)V")
    public synchronized void method933(boolean arg0) {
        this.field1034 = (this.field1034 >>> 31) + (this.field1034 ^ this.field1034 >> 31);
        if (arg0) {
            this.field1034 = -this.field1034;
        }
    }

    @ObfuscatedName("av.w()V")
    public void method1043() {
        if (this.field1044 == 0) {
            return;
        }
        if (this.field1037 == Integer.MIN_VALUE) {
            this.field1037 = 0;
        }
        this.field1044 = 0;
        this.method973();
    }

    @ObfuscatedName("av.r(II)V")
    public synchronized void method935(int arg0, int arg1) {
        this.method936(arg0, arg1, this.method1002());
    }

    @ObfuscatedName("av.x(III)V")
    public synchronized void method936(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method929(arg1, arg2);
            return;
        }
        int var4 = method926(arg1, arg2);
        int var5 = method1019(arg1, arg2);
        if (this.field1038 == var4 && this.field1039 == var5) {
            this.field1044 = 0;
            return;
        }
        int var6 = arg1 - this.field1035;
        if (this.field1035 - arg1 > var6) {
            var6 = this.field1035 - arg1;
        }
        if (var4 - this.field1038 > var6) {
            var6 = var4 - this.field1038;
        }
        if (this.field1038 - var4 > var6) {
            var6 = this.field1038 - var4;
        }
        if (var5 - this.field1039 > var6) {
            var6 = var5 - this.field1039;
        }
        if (this.field1039 - var5 > var6) {
            var6 = this.field1039 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1044 = arg0;
        this.field1037 = arg1;
        this.field1033 = arg2;
        this.field1045 = (arg1 - this.field1035) / arg0;
        this.field1046 = (var4 - this.field1038) / arg0;
        this.field1047 = (var5 - this.field1039) / arg0;
    }

    @ObfuscatedName("av.v(I)V")
    public synchronized void method937(int arg0) {
        if (arg0 == 0) {
            this.method928(0);
            this.method3341();
        } else if (this.field1038 == 0 && this.field1039 == 0) {
            this.field1044 = 0;
            this.field1037 = 0;
            this.field1035 = 0;
            this.method3341();
        } else {
            int var2 = -this.field1035;
            if (this.field1035 > var2) {
                var2 = this.field1035;
            }
            if (-this.field1038 > var2) {
                var2 = -this.field1038;
            }
            if (this.field1038 > var2) {
                var2 = this.field1038;
            }
            if (-this.field1039 > var2) {
                var2 = -this.field1039;
            }
            if (this.field1039 > var2) {
                var2 = this.field1039;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1044 = arg0;
            this.field1037 = Integer.MIN_VALUE;
            this.field1045 = -this.field1035 / arg0;
            this.field1046 = -this.field1038 / arg0;
            this.field1047 = -this.field1039 / arg0;
        }
    }

    @ObfuscatedName("av.y(I)V")
    public synchronized void method938(int arg0) {
        if (this.field1034 < 0) {
            this.field1034 = -arg0;
        } else {
            this.field1034 = arg0;
        }
    }

    @ObfuscatedName("av.k()I")
    public synchronized int method971() {
        return this.field1034 < 0 ? -this.field1034 : this.field1034;
    }

    @ObfuscatedName("av.p()Z")
    public boolean method940() {
        return this.field1036 < 0 || this.field1036 >= ((class63) this.field1055).field1226.length << 8;
    }

    @ObfuscatedName("av.s()Z")
    public boolean method941() {
        return this.field1044 != 0;
    }

    @ObfuscatedName("av.m()Lai;")
    public class48 method942() {
        return null;
    }

    @ObfuscatedName("av.c()Lai;")
    public class48 method943() {
        return null;
    }

    @ObfuscatedName("av.i()I")
    public int method957() {
        return this.field1037 == 0 && this.field1044 == 0 ? 0 : 1;
    }

    @ObfuscatedName("av.u([III)V")
    public synchronized void method984(int[] arg0, int arg1, int arg2) {
        if (this.field1037 == 0 && this.field1044 == 0) {
            this.method945(arg2);
            return;
        }
        class63 var4 = (class63) this.field1055;
        int var5 = this.field1041 << 8;
        int var6 = this.field1042 << 8;
        int var7 = var4.field1226.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1040 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1036 < 0) {
            if (this.field1034 <= 0) {
                this.method1043();
                this.method3341();
                return;
            }
            this.field1036 = 0;
        }
        if (this.field1036 >= var7) {
            if (this.field1034 >= 0) {
                this.method1043();
                this.method3341();
                return;
            }
            this.field1036 = var7 - 1;
        }
        if (this.field1040 >= 0) {
            if (this.field1040 > 0) {
                if (this.field1043) {
                    label131: {
                        if (this.field1034 < 0) {
                            var9 = this.method948(arg0, arg1, var5, var10, var4.field1226[this.field1041]);
                            if (this.field1036 >= var5) {
                                return;
                            }
                            this.field1036 = var5 + var5 - 1 - this.field1036;
                            this.field1034 = -this.field1034;
                            if (--this.field1040 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1025(arg0, var9, var6, var10, var4.field1226[this.field1042 - 1]);
                            if (this.field1036 < var6) {
                                return;
                            }
                            this.field1036 = var6 + var6 - 1 - this.field1036;
                            this.field1034 = -this.field1034;
                            if (--this.field1040 == 0) {
                                break;
                            }
                            var9 = this.method948(arg0, var9, var5, var10, var4.field1226[this.field1041]);
                            if (this.field1036 >= var5) {
                                return;
                            }
                            this.field1036 = var5 + var5 - 1 - this.field1036;
                            this.field1034 = -this.field1034;
                        } while (--this.field1040 != 0);
                    }
                } else if (this.field1034 < 0) {
                    while (true) {
                        var9 = this.method948(arg0, var9, var5, var10, var4.field1226[this.field1042 - 1]);
                        if (this.field1036 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1036) / var8;
                        if (var12 >= this.field1040) {
                            this.field1036 += this.field1040 * var8;
                            this.field1040 = 0;
                            break;
                        }
                        this.field1036 += var8 * var12;
                        this.field1040 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1025(arg0, var9, var6, var10, var4.field1226[this.field1041]);
                        if (this.field1036 < var6) {
                            return;
                        }
                        int var13 = (this.field1036 - var5) / var8;
                        if (var13 >= this.field1040) {
                            this.field1036 -= this.field1040 * var8;
                            this.field1040 = 0;
                            break;
                        }
                        this.field1036 -= var8 * var13;
                        this.field1040 -= var13;
                    }
                }
            }
            if (this.field1034 < 0) {
                this.method948(arg0, var9, 0, var10, 0);
                if (this.field1036 < 0) {
                    this.field1036 = -1;
                    this.method1043();
                    this.method3341();
                }
            } else {
                this.method1025(arg0, var9, var7, var10, 0);
                if (this.field1036 >= var7) {
                    this.field1036 = var7;
                    this.method1043();
                    this.method3341();
                }
            }
        } else if (this.field1043) {
            if (this.field1034 < 0) {
                var9 = this.method948(arg0, arg1, var5, var10, var4.field1226[this.field1041]);
                if (this.field1036 >= var5) {
                    return;
                }
                this.field1036 = var5 + var5 - 1 - this.field1036;
                this.field1034 = -this.field1034;
            }
            while (true) {
                int var11 = this.method1025(arg0, var9, var6, var10, var4.field1226[this.field1042 - 1]);
                if (this.field1036 < var6) {
                    return;
                }
                this.field1036 = var6 + var6 - 1 - this.field1036;
                this.field1034 = -this.field1034;
                var9 = this.method948(arg0, var11, var5, var10, var4.field1226[this.field1041]);
                if (this.field1036 >= var5) {
                    return;
                }
                this.field1036 = var5 + var5 - 1 - this.field1036;
                this.field1034 = -this.field1034;
            }
        } else if (this.field1034 < 0) {
            while (true) {
                var9 = this.method948(arg0, var9, var5, var10, var4.field1226[this.field1042 - 1]);
                if (this.field1036 >= var5) {
                    return;
                }
                this.field1036 = var6 - 1 - (var6 - 1 - this.field1036) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1025(arg0, var9, var6, var10, var4.field1226[this.field1041]);
                if (this.field1036 < var6) {
                    return;
                }
                this.field1036 = (this.field1036 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("av.at(I)V")
    public synchronized void method945(int arg0) {
        if (this.field1044 > 0) {
            if (arg0 >= this.field1044) {
                if (this.field1037 == Integer.MIN_VALUE) {
                    this.field1037 = 0;
                    this.field1039 = 0;
                    this.field1038 = 0;
                    this.field1035 = 0;
                    this.method3341();
                    arg0 = this.field1044;
                }
                this.field1044 = 0;
                this.method973();
            } else {
                this.field1035 += this.field1045 * arg0;
                this.field1038 += this.field1046 * arg0;
                this.field1039 += this.field1047 * arg0;
                this.field1044 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1055;
        int var3 = this.field1041 << 8;
        int var4 = this.field1042 << 8;
        int var5 = var2.field1226.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1040 = 0;
        }
        if (this.field1036 < 0) {
            if (this.field1034 <= 0) {
                this.method1043();
                this.method3341();
                return;
            }
            this.field1036 = 0;
        }
        if (this.field1036 >= var5) {
            if (this.field1034 >= 0) {
                this.method1043();
                this.method3341();
                return;
            }
            this.field1036 = var5 - 1;
        }
        this.field1036 += this.field1034 * arg0;
        if (this.field1040 >= 0) {
            if (this.field1040 > 0) {
                if (this.field1043) {
                    label121: {
                        if (this.field1034 < 0) {
                            if (this.field1036 >= var3) {
                                return;
                            }
                            this.field1036 = var3 + var3 - 1 - this.field1036;
                            this.field1034 = -this.field1034;
                            if (--this.field1040 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1036 < var4) {
                                return;
                            }
                            this.field1036 = var4 + var4 - 1 - this.field1036;
                            this.field1034 = -this.field1034;
                            if (--this.field1040 == 0) {
                                break;
                            }
                            if (this.field1036 >= var3) {
                                return;
                            }
                            this.field1036 = var3 + var3 - 1 - this.field1036;
                            this.field1034 = -this.field1034;
                        } while (--this.field1040 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1034 < 0) {
                            if (this.field1036 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1036) / var6;
                            if (var7 >= this.field1040) {
                                this.field1036 += this.field1040 * var6;
                                this.field1040 = 0;
                                break label153;
                            }
                            this.field1036 += var6 * var7;
                            this.field1040 -= var7;
                        } else if (this.field1036 >= var4) {
                            int var8 = (this.field1036 - var3) / var6;
                            if (var8 >= this.field1040) {
                                this.field1036 -= this.field1040 * var6;
                                this.field1040 = 0;
                                break label153;
                            }
                            this.field1036 -= var6 * var8;
                            this.field1040 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1034 < 0) {
                if (this.field1036 < 0) {
                    this.field1036 = -1;
                    this.method1043();
                    this.method3341();
                }
            } else if (this.field1036 >= var5) {
                this.field1036 = var5;
                this.method1043();
                this.method3341();
            }
        } else if (this.field1043) {
            if (this.field1034 < 0) {
                if (this.field1036 >= var3) {
                    return;
                }
                this.field1036 = var3 + var3 - 1 - this.field1036;
                this.field1034 = -this.field1034;
            }
            while (this.field1036 >= var4) {
                this.field1036 = var4 + var4 - 1 - this.field1036;
                this.field1034 = -this.field1034;
                if (this.field1036 >= var3) {
                    return;
                }
                this.field1036 = var3 + var3 - 1 - this.field1036;
                this.field1034 = -this.field1034;
            }
        } else if (this.field1034 < 0) {
            if (this.field1036 >= var3) {
                return;
            }
            this.field1036 = var4 - 1 - (var4 - 1 - this.field1036) % var6;
        } else if (this.field1036 >= var4) {
            this.field1036 = (this.field1036 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("av.as([IIIII)I")
    public int method1025(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1044 > 0) {
                int var6 = this.field1044 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1044 += arg1;
                if (this.field1034 == 256 && (this.field1036 & 0xFF) == 0) {
                    if (Statics.field1078) {
                        arg1 = method959(0, ((class63) this.field1055).field1226, arg0, this.field1036, arg1, this.field1038, this.field1039, this.field1046, this.field1047, 0, var6, arg2, this);
                    } else {
                        arg1 = method958(((class63) this.field1055).field1226, arg0, this.field1036, arg1, this.field1035, this.field1045, 0, var6, arg2, this);
                    }
                } else if (Statics.field1078) {
                    arg1 = method963(0, 0, ((class63) this.field1055).field1226, arg0, this.field1036, arg1, this.field1038, this.field1039, this.field1046, this.field1047, 0, var6, arg2, this, this.field1034, arg4);
                } else {
                    arg1 = method962(0, 0, ((class63) this.field1055).field1226, arg0, this.field1036, arg1, this.field1035, this.field1045, 0, var6, arg2, this, this.field1034, arg4);
                }
                this.field1044 -= arg1;
                if (this.field1044 != 0) {
                    return arg1;
                }
                if (!this.method949()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1034 == 256 && (this.field1036 & 0xFF) == 0) {
                if (Statics.field1078) {
                    return method951(0, ((class63) this.field1055).field1226, arg0, this.field1036, arg1, this.field1038, this.field1039, 0, arg3, arg2, this);
                }
                return method950(((class63) this.field1055).field1226, arg0, this.field1036, arg1, this.field1035, 0, arg3, arg2, this);
            }
            if (Statics.field1078) {
                return method955(0, 0, ((class63) this.field1055).field1226, arg0, this.field1036, arg1, this.field1038, this.field1039, 0, arg3, arg2, this, this.field1034, arg4);
            }
            return method954(0, 0, ((class63) this.field1055).field1226, arg0, this.field1036, arg1, this.field1035, 0, arg3, arg2, this, this.field1034, arg4);
        }
    }

    @ObfuscatedName("av.ax([IIIII)I")
    public int method948(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1044 > 0) {
                int var6 = this.field1044 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1044 += arg1;
                if (this.field1034 == -256 && (this.field1036 & 0xFF) == 0) {
                    if (Statics.field1078) {
                        arg1 = method1030(0, ((class63) this.field1055).field1226, arg0, this.field1036, arg1, this.field1038, this.field1039, this.field1046, this.field1047, 0, var6, arg2, this);
                    } else {
                        arg1 = method960(((class63) this.field1055).field1226, arg0, this.field1036, arg1, this.field1035, this.field1045, 0, var6, arg2, this);
                    }
                } else if (Statics.field1078) {
                    arg1 = method965(0, 0, ((class63) this.field1055).field1226, arg0, this.field1036, arg1, this.field1038, this.field1039, this.field1046, this.field1047, 0, var6, arg2, this, this.field1034, arg4);
                } else {
                    arg1 = method964(0, 0, ((class63) this.field1055).field1226, arg0, this.field1036, arg1, this.field1035, this.field1045, 0, var6, arg2, this, this.field1034, arg4);
                }
                this.field1044 -= arg1;
                if (this.field1044 != 0) {
                    return arg1;
                }
                if (!this.method949()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1034 == -256 && (this.field1036 & 0xFF) == 0) {
                if (Statics.field1078) {
                    return method953(0, ((class63) this.field1055).field1226, arg0, this.field1036, arg1, this.field1038, this.field1039, 0, arg3, arg2, this);
                }
                return method944(((class63) this.field1055).field1226, arg0, this.field1036, arg1, this.field1035, 0, arg3, arg2, this);
            }
            if (Statics.field1078) {
                return method1077(0, 0, ((class63) this.field1055).field1226, arg0, this.field1036, arg1, this.field1038, this.field1039, 0, arg3, arg2, this, this.field1034, arg4);
            }
            return method956(0, 0, ((class63) this.field1055).field1226, arg0, this.field1036, arg1, this.field1035, 0, arg3, arg2, this, this.field1034, arg4);
        }
    }

    @ObfuscatedName("av.ao()Z")
    public boolean method949() {
        int var1 = this.field1037;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method926(var1, this.field1033);
            var2 = method1019(var1, this.field1033);
        }
        if (this.field1035 != var1 || this.field1038 != var3 || this.field1039 != var2) {
            if (this.field1035 < var1) {
                this.field1045 = 1;
                this.field1044 = var1 - this.field1035;
            } else if (this.field1035 > var1) {
                this.field1045 = -1;
                this.field1044 = this.field1035 - var1;
            } else {
                this.field1045 = 0;
            }
            if (this.field1038 < var3) {
                this.field1046 = 1;
                if (this.field1044 == 0 || this.field1044 > var3 - this.field1038) {
                    this.field1044 = var3 - this.field1038;
                }
            } else if (this.field1038 > var3) {
                this.field1046 = -1;
                if (this.field1044 == 0 || this.field1044 > this.field1038 - var3) {
                    this.field1044 = this.field1038 - var3;
                }
            } else {
                this.field1046 = 0;
            }
            if (this.field1039 < var2) {
                this.field1047 = 1;
                if (this.field1044 == 0 || this.field1044 > var2 - this.field1039) {
                    this.field1044 = var2 - this.field1039;
                }
            } else if (this.field1039 > var2) {
                this.field1047 = -1;
                if (this.field1044 == 0 || this.field1044 > this.field1039 - var2) {
                    this.field1044 = this.field1039 - var2;
                }
            } else {
                this.field1047 = 0;
            }
            return false;
        } else if (this.field1037 == Integer.MIN_VALUE) {
            this.field1037 = 0;
            this.field1039 = 0;
            this.field1038 = 0;
            this.field1035 = 0;
            this.method3341();
            return true;
        } else {
            this.method973();
            return false;
        }
    }

    @ObfuscatedName("av.aq([B[IIIIIIILav;)I")
    public static int method950(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field1036 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("av.am(I[B[IIIIIIIILav;)I")
    public static int method951(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field1036 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("av.al([B[IIIIIIILav;)I")
    public static int method944(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field1036 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("av.ab(I[B[IIIIIIIILav;)I")
    public static int method953(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field1036 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("av.aw(II[B[IIIIIIILav;II)I")
    public static int method954(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field1036 = arg4;
        return arg5;
    }

    @ObfuscatedName("av.ah(II[B[IIIIIIIILav;II)I")
    public static int method955(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field1036 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("av.aa(II[B[IIIIIIILav;II)I")
    public static int method956(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field1036 = arg4;
        return arg5;
    }

    @ObfuscatedName("av.ay(II[B[IIIIIIIILav;II)I")
    public static int method1077(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field1036 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("av.ak([B[IIIIIIIILav;)I")
    public static int method958(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1038 += (var14 - arg3) * arg9.field1046;
        arg9.field1039 += (var14 - arg3) * arg9.field1047;
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
        arg9.field1035 = var12 >> 2;
        arg9.field1036 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("av.az(I[B[IIIIIIIIIILav;)I")
    public static int method959(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1035 += (var19 - arg4) * arg12.field1045;
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
        arg12.field1038 = var15 >> 2;
        arg12.field1039 = var16 >> 2;
        arg12.field1036 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("av.ap([B[IIIIIIIILav;)I")
    public static int method960(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1038 += (var14 - arg3) * arg9.field1046;
        arg9.field1039 += (var14 - arg3) * arg9.field1047;
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
        arg9.field1035 = var12 >> 2;
        arg9.field1036 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("av.af(I[B[IIIIIIIIIILav;)I")
    public static int method1030(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1035 += (var19 - arg4) * arg12.field1045;
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
        arg12.field1038 = var15 >> 2;
        arg12.field1039 = var16 >> 2;
        arg12.field1036 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("av.au(II[B[IIIIIIIILav;II)I")
    public static int method962(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1038 -= arg11.field1046 * arg5;
        arg11.field1039 -= arg11.field1047 * arg5;
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
        arg11.field1038 += arg11.field1046 * arg5;
        arg11.field1039 += arg11.field1047 * arg5;
        arg11.field1035 = arg6;
        arg11.field1036 = arg4;
        return arg5;
    }

    @ObfuscatedName("av.an(II[B[IIIIIIIIIILav;II)I")
    public static int method963(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1035 -= arg13.field1045 * arg5;
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
        arg13.field1035 += arg13.field1045 * var27;
        arg13.field1038 = arg6;
        arg13.field1039 = arg7;
        arg13.field1036 = arg4;
        return var27;
    }

    @ObfuscatedName("av.av(II[B[IIIIIIIILav;II)I")
    public static int method964(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1038 -= arg11.field1046 * arg5;
        arg11.field1039 -= arg11.field1047 * arg5;
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
        arg11.field1038 += arg11.field1046 * arg5;
        arg11.field1039 += arg11.field1047 * arg5;
        arg11.field1035 = arg6;
        arg11.field1036 = arg4;
        return arg5;
    }

    @ObfuscatedName("av.ac(II[B[IIIIIIIIIILav;II)I")
    public static int method965(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1035 -= arg13.field1045 * arg5;
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
        arg13.field1035 += arg13.field1045 * var26;
        arg13.field1038 = arg6;
        arg13.field1039 = arg7;
        arg13.field1036 = arg4;
        return var26;
    }
}
