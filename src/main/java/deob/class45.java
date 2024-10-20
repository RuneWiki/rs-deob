package deob;

@ObfuscatedName("af")
public class class45 extends class48 {

    @ObfuscatedName("af.x")
    public int field1026;

    @ObfuscatedName("af.p")
    public int field1024;

    @ObfuscatedName("af.k")
    public int field1027;

    @ObfuscatedName("af.a")
    public int field1028;

    @ObfuscatedName("af.q")
    public int field1033;

    @ObfuscatedName("af.j")
    public int field1029;

    @ObfuscatedName("af.v")
    public int field1030;

    @ObfuscatedName("af.l")
    public int field1025;

    @ObfuscatedName("af.s")
    public int field1031;

    @ObfuscatedName("af.n")
    public int field1032;

    @ObfuscatedName("af.c")
    public boolean field1023;

    @ObfuscatedName("af.h")
    public int field1034;

    @ObfuscatedName("af.u")
    public int field1035;

    @ObfuscatedName("af.y")
    public int field1036;

    @ObfuscatedName("af.b")
    public int field1037;

    @ObfuscatedName("af.x(II)I")
    public static int method1065(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("af.p(II)I")
    public static int method1009(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("af.k()I")
    public int method995() {
        int var1 = this.field1033 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1025 == 0) {
            var2 -= this.field1026 * var2 / (((class63) this.field1043).field1207.length << 8);
        } else if (this.field1025 >= 0) {
            var2 -= this.field1031 * var2 / ((class63) this.field1043).field1207.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class45(class63 arg0, int arg1, int arg2) {
        this.field1043 = arg0;
        this.field1031 = arg0.field1208;
        this.field1032 = arg0.field1209;
        this.field1023 = arg0.field1206;
        this.field1024 = arg1;
        this.field1027 = arg2;
        this.field1028 = 8192;
        this.field1026 = 0;
        this.method948();
    }

    public class45(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1043 = arg0;
        this.field1031 = arg0.field1208;
        this.field1032 = arg0.field1209;
        this.field1023 = arg0.field1206;
        this.field1024 = arg1;
        this.field1027 = arg2;
        this.field1028 = arg3;
        this.field1026 = 0;
        this.method948();
    }

    @ObfuscatedName("af.a(Lbj;II)Laf;")
    public static class45 method926(class63 arg0, int arg1, int arg2) {
        return arg0.field1207 == null || arg0.field1207.length == 0 ? null : new class45(arg0, (int) ((long) arg0.field1210 * 256L * (long) arg1 / (long) (Statics.field1082 * 100)), arg2 << 6);
    }

    @ObfuscatedName("af.q(Lbj;III)Laf;")
    public static class45 method928(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1207 == null || arg0.field1207.length == 0 ? null : new class45(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("af.j()V")
    public void method948() {
        this.field1033 = this.field1027;
        this.field1029 = method1065(this.field1027, this.field1028);
        this.field1030 = method1009(this.field1027, this.field1028);
    }

    @ObfuscatedName("af.v(I)V")
    public synchronized void method1028(int arg0) {
        this.field1025 = arg0;
    }

    @ObfuscatedName("af.w(I)V")
    public synchronized void method941(int arg0) {
        this.method933(arg0 << 6, this.method935());
    }

    @ObfuscatedName("af.l(I)V")
    public synchronized void method932(int arg0) {
        this.method933(arg0, this.method935());
    }

    @ObfuscatedName("af.s(II)V")
    public synchronized void method933(int arg0, int arg1) {
        this.field1027 = arg0;
        this.field1028 = arg1;
        this.field1034 = 0;
        this.method948();
    }

    @ObfuscatedName("af.n()I")
    public synchronized int method934() {
        return this.field1027 == Integer.MIN_VALUE ? 0 : this.field1027;
    }

    @ObfuscatedName("af.c()I")
    public synchronized int method935() {
        return this.field1028 < 0 ? -1 : this.field1028;
    }

    @ObfuscatedName("af.h(I)V")
    public synchronized void method936(int arg0) {
        int var2 = ((class63) this.field1043).field1207.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1026 = arg0;
    }

    @ObfuscatedName("af.u(Z)V")
    public synchronized void method937(boolean arg0) {
        this.field1024 = (this.field1024 >>> 31) + (this.field1024 ^ this.field1024 >> 31);
        if (arg0) {
            this.field1024 = -this.field1024;
        }
    }

    @ObfuscatedName("af.y()V")
    public void method938() {
        if (this.field1034 == 0) {
            return;
        }
        if (this.field1027 == Integer.MIN_VALUE) {
            this.field1027 = 0;
        }
        this.field1034 = 0;
        this.method948();
    }

    @ObfuscatedName("af.b(II)V")
    public synchronized void method939(int arg0, int arg1) {
        this.method940(arg0, arg1, this.method935());
    }

    @ObfuscatedName("af.t(III)V")
    public synchronized void method940(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method933(arg1, arg2);
            return;
        }
        int var4 = method1065(arg1, arg2);
        int var5 = method1009(arg1, arg2);
        if (this.field1029 == var4 && this.field1030 == var5) {
            this.field1034 = 0;
            return;
        }
        int var6 = arg1 - this.field1033;
        if (this.field1033 - arg1 > var6) {
            var6 = this.field1033 - arg1;
        }
        if (var4 - this.field1029 > var6) {
            var6 = var4 - this.field1029;
        }
        if (this.field1029 - var4 > var6) {
            var6 = this.field1029 - var4;
        }
        if (var5 - this.field1030 > var6) {
            var6 = var5 - this.field1030;
        }
        if (this.field1030 - var5 > var6) {
            var6 = this.field1030 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1034 = arg0;
        this.field1027 = arg1;
        this.field1028 = arg2;
        this.field1035 = (arg1 - this.field1033) / arg0;
        this.field1036 = (var4 - this.field1029) / arg0;
        this.field1037 = (var5 - this.field1030) / arg0;
    }

    @ObfuscatedName("af.r(I)V")
    public synchronized void method1069(int arg0) {
        if (arg0 == 0) {
            this.method932(0);
            this.method3301();
        } else if (this.field1029 == 0 && this.field1030 == 0) {
            this.field1034 = 0;
            this.field1027 = 0;
            this.field1033 = 0;
            this.method3301();
        } else {
            int var2 = -this.field1033;
            if (this.field1033 > var2) {
                var2 = this.field1033;
            }
            if (-this.field1029 > var2) {
                var2 = -this.field1029;
            }
            if (this.field1029 > var2) {
                var2 = this.field1029;
            }
            if (-this.field1030 > var2) {
                var2 = -this.field1030;
            }
            if (this.field1030 > var2) {
                var2 = this.field1030;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1034 = arg0;
            this.field1027 = Integer.MIN_VALUE;
            this.field1035 = -this.field1033 / arg0;
            this.field1036 = -this.field1029 / arg0;
            this.field1037 = -this.field1030 / arg0;
        }
    }

    @ObfuscatedName("af.g(I)V")
    public synchronized void method942(int arg0) {
        if (this.field1024 < 0) {
            this.field1024 = -arg0;
        } else {
            this.field1024 = arg0;
        }
    }

    @ObfuscatedName("af.m()I")
    public synchronized int method1029() {
        return this.field1024 < 0 ? -this.field1024 : this.field1024;
    }

    @ObfuscatedName("af.o()Z")
    public boolean method944() {
        return this.field1026 < 0 || this.field1026 >= ((class63) this.field1043).field1207.length << 8;
    }

    @ObfuscatedName("af.e()Z")
    public boolean method945() {
        return this.field1034 != 0;
    }

    @ObfuscatedName("af.f()Lau;")
    public class48 method946() {
        return null;
    }

    @ObfuscatedName("af.i()Lau;")
    public class48 method947() {
        return null;
    }

    @ObfuscatedName("af.d()I")
    public int method976() {
        return this.field1027 == 0 && this.field1034 == 0 ? 0 : 1;
    }

    @ObfuscatedName("af.z([III)V")
    public synchronized void method1006(int[] arg0, int arg1, int arg2) {
        if (this.field1027 == 0 && this.field1034 == 0) {
            this.method950(arg2);
            return;
        }
        class63 var4 = (class63) this.field1043;
        int var5 = this.field1031 << 8;
        int var6 = this.field1032 << 8;
        int var7 = var4.field1207.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1025 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1026 < 0) {
            if (this.field1024 <= 0) {
                this.method938();
                this.method3301();
                return;
            }
            this.field1026 = 0;
        }
        if (this.field1026 >= var7) {
            if (this.field1024 >= 0) {
                this.method938();
                this.method3301();
                return;
            }
            this.field1026 = var7 - 1;
        }
        if (this.field1025 >= 0) {
            if (this.field1025 > 0) {
                if (this.field1023) {
                    label131: {
                        if (this.field1024 < 0) {
                            var9 = this.method1002(arg0, arg1, var5, var10, var4.field1207[this.field1031]);
                            if (this.field1026 >= var5) {
                                return;
                            }
                            this.field1026 = var5 + var5 - 1 - this.field1026;
                            this.field1024 = -this.field1024;
                            if (--this.field1025 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method951(arg0, var9, var6, var10, var4.field1207[this.field1032 - 1]);
                            if (this.field1026 < var6) {
                                return;
                            }
                            this.field1026 = var6 + var6 - 1 - this.field1026;
                            this.field1024 = -this.field1024;
                            if (--this.field1025 == 0) {
                                break;
                            }
                            var9 = this.method1002(arg0, var9, var5, var10, var4.field1207[this.field1031]);
                            if (this.field1026 >= var5) {
                                return;
                            }
                            this.field1026 = var5 + var5 - 1 - this.field1026;
                            this.field1024 = -this.field1024;
                        } while (--this.field1025 != 0);
                    }
                } else if (this.field1024 < 0) {
                    while (true) {
                        var9 = this.method1002(arg0, var9, var5, var10, var4.field1207[this.field1032 - 1]);
                        if (this.field1026 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1026) / var8;
                        if (var12 >= this.field1025) {
                            this.field1026 += this.field1025 * var8;
                            this.field1025 = 0;
                            break;
                        }
                        this.field1026 += var8 * var12;
                        this.field1025 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method951(arg0, var9, var6, var10, var4.field1207[this.field1031]);
                        if (this.field1026 < var6) {
                            return;
                        }
                        int var13 = (this.field1026 - var5) / var8;
                        if (var13 >= this.field1025) {
                            this.field1026 -= this.field1025 * var8;
                            this.field1025 = 0;
                            break;
                        }
                        this.field1026 -= var8 * var13;
                        this.field1025 -= var13;
                    }
                }
            }
            if (this.field1024 < 0) {
                this.method1002(arg0, var9, 0, var10, 0);
                if (this.field1026 < 0) {
                    this.field1026 = -1;
                    this.method938();
                    this.method3301();
                }
            } else {
                this.method951(arg0, var9, var7, var10, 0);
                if (this.field1026 >= var7) {
                    this.field1026 = var7;
                    this.method938();
                    this.method3301();
                }
            }
        } else if (this.field1023) {
            if (this.field1024 < 0) {
                var9 = this.method1002(arg0, arg1, var5, var10, var4.field1207[this.field1031]);
                if (this.field1026 >= var5) {
                    return;
                }
                this.field1026 = var5 + var5 - 1 - this.field1026;
                this.field1024 = -this.field1024;
            }
            while (true) {
                int var11 = this.method951(arg0, var9, var6, var10, var4.field1207[this.field1032 - 1]);
                if (this.field1026 < var6) {
                    return;
                }
                this.field1026 = var6 + var6 - 1 - this.field1026;
                this.field1024 = -this.field1024;
                var9 = this.method1002(arg0, var11, var5, var10, var4.field1207[this.field1031]);
                if (this.field1026 >= var5) {
                    return;
                }
                this.field1026 = var5 + var5 - 1 - this.field1026;
                this.field1024 = -this.field1024;
            }
        } else if (this.field1024 < 0) {
            while (true) {
                var9 = this.method1002(arg0, var9, var5, var10, var4.field1207[this.field1032 - 1]);
                if (this.field1026 >= var5) {
                    return;
                }
                this.field1026 = var6 - 1 - (var6 - 1 - this.field1026) % var8;
            }
        } else {
            while (true) {
                var9 = this.method951(arg0, var9, var6, var10, var4.field1207[this.field1031]);
                if (this.field1026 < var6) {
                    return;
                }
                this.field1026 = (this.field1026 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("af.ai(I)V")
    public synchronized void method950(int arg0) {
        if (this.field1034 > 0) {
            if (arg0 >= this.field1034) {
                if (this.field1027 == Integer.MIN_VALUE) {
                    this.field1027 = 0;
                    this.field1030 = 0;
                    this.field1029 = 0;
                    this.field1033 = 0;
                    this.method3301();
                    arg0 = this.field1034;
                }
                this.field1034 = 0;
                this.method948();
            } else {
                this.field1033 += this.field1035 * arg0;
                this.field1029 += this.field1036 * arg0;
                this.field1030 += this.field1037 * arg0;
                this.field1034 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1043;
        int var3 = this.field1031 << 8;
        int var4 = this.field1032 << 8;
        int var5 = var2.field1207.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1025 = 0;
        }
        if (this.field1026 < 0) {
            if (this.field1024 <= 0) {
                this.method938();
                this.method3301();
                return;
            }
            this.field1026 = 0;
        }
        if (this.field1026 >= var5) {
            if (this.field1024 >= 0) {
                this.method938();
                this.method3301();
                return;
            }
            this.field1026 = var5 - 1;
        }
        this.field1026 += this.field1024 * arg0;
        if (this.field1025 >= 0) {
            if (this.field1025 > 0) {
                if (this.field1023) {
                    label121: {
                        if (this.field1024 < 0) {
                            if (this.field1026 >= var3) {
                                return;
                            }
                            this.field1026 = var3 + var3 - 1 - this.field1026;
                            this.field1024 = -this.field1024;
                            if (--this.field1025 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1026 < var4) {
                                return;
                            }
                            this.field1026 = var4 + var4 - 1 - this.field1026;
                            this.field1024 = -this.field1024;
                            if (--this.field1025 == 0) {
                                break;
                            }
                            if (this.field1026 >= var3) {
                                return;
                            }
                            this.field1026 = var3 + var3 - 1 - this.field1026;
                            this.field1024 = -this.field1024;
                        } while (--this.field1025 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1024 < 0) {
                            if (this.field1026 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1026) / var6;
                            if (var7 >= this.field1025) {
                                this.field1026 += this.field1025 * var6;
                                this.field1025 = 0;
                                break label153;
                            }
                            this.field1026 += var6 * var7;
                            this.field1025 -= var7;
                        } else if (this.field1026 >= var4) {
                            int var8 = (this.field1026 - var3) / var6;
                            if (var8 >= this.field1025) {
                                this.field1026 -= this.field1025 * var6;
                                this.field1025 = 0;
                                break label153;
                            }
                            this.field1026 -= var6 * var8;
                            this.field1025 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1024 < 0) {
                if (this.field1026 < 0) {
                    this.field1026 = -1;
                    this.method938();
                    this.method3301();
                }
            } else if (this.field1026 >= var5) {
                this.field1026 = var5;
                this.method938();
                this.method3301();
            }
        } else if (this.field1023) {
            if (this.field1024 < 0) {
                if (this.field1026 >= var3) {
                    return;
                }
                this.field1026 = var3 + var3 - 1 - this.field1026;
                this.field1024 = -this.field1024;
            }
            while (this.field1026 >= var4) {
                this.field1026 = var4 + var4 - 1 - this.field1026;
                this.field1024 = -this.field1024;
                if (this.field1026 >= var3) {
                    return;
                }
                this.field1026 = var3 + var3 - 1 - this.field1026;
                this.field1024 = -this.field1024;
            }
        } else if (this.field1024 < 0) {
            if (this.field1026 >= var3) {
                return;
            }
            this.field1026 = var4 - 1 - (var4 - 1 - this.field1026) % var6;
        } else if (this.field1026 >= var4) {
            this.field1026 = (this.field1026 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("af.ag([IIIII)I")
    public int method951(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1034 > 0) {
                int var6 = this.field1034 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1034 += arg1;
                if (this.field1024 == 256 && (this.field1026 & 0xFF) == 0) {
                    if (Statics.field1974) {
                        arg1 = method963(0, ((class63) this.field1043).field1207, arg0, this.field1026, arg1, this.field1029, this.field1030, this.field1036, this.field1037, 0, var6, arg2, this);
                    } else {
                        arg1 = method931(((class63) this.field1043).field1207, arg0, this.field1026, arg1, this.field1033, this.field1035, 0, var6, arg2, this);
                    }
                } else if (Statics.field1974) {
                    arg1 = method967(0, 0, ((class63) this.field1043).field1207, arg0, this.field1026, arg1, this.field1029, this.field1030, this.field1036, this.field1037, 0, var6, arg2, this, this.field1024, arg4);
                } else {
                    arg1 = method1026(0, 0, ((class63) this.field1043).field1207, arg0, this.field1026, arg1, this.field1033, this.field1035, 0, var6, arg2, this, this.field1024, arg4);
                }
                this.field1034 -= arg1;
                if (this.field1034 != 0) {
                    return arg1;
                }
                if (!this.method1051()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1024 == 256 && (this.field1026 & 0xFF) == 0) {
                if (Statics.field1974) {
                    return method955(0, ((class63) this.field1043).field1207, arg0, this.field1026, arg1, this.field1029, this.field1030, 0, arg3, arg2, this);
                }
                return method954(((class63) this.field1043).field1207, arg0, this.field1026, arg1, this.field1033, 0, arg3, arg2, this);
            }
            if (Statics.field1974) {
                return method1024(0, 0, ((class63) this.field1043).field1207, arg0, this.field1026, arg1, this.field1029, this.field1030, 0, arg3, arg2, this, this.field1024, arg4);
            }
            return method992(0, 0, ((class63) this.field1043).field1207, arg0, this.field1026, arg1, this.field1033, 0, arg3, arg2, this, this.field1024, arg4);
        }
    }

    @ObfuscatedName("af.as([IIIII)I")
    public int method1002(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1034 > 0) {
                int var6 = this.field1034 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1034 += arg1;
                if (this.field1024 == -256 && (this.field1026 & 0xFF) == 0) {
                    if (Statics.field1974) {
                        arg1 = method975(0, ((class63) this.field1043).field1207, arg0, this.field1026, arg1, this.field1029, this.field1030, this.field1036, this.field1037, 0, var6, arg2, this);
                    } else {
                        arg1 = method964(((class63) this.field1043).field1207, arg0, this.field1026, arg1, this.field1033, this.field1035, 0, var6, arg2, this);
                    }
                } else if (Statics.field1974) {
                    arg1 = method1063(0, 0, ((class63) this.field1043).field1207, arg0, this.field1026, arg1, this.field1029, this.field1030, this.field1036, this.field1037, 0, var6, arg2, this, this.field1024, arg4);
                } else {
                    arg1 = method1049(0, 0, ((class63) this.field1043).field1207, arg0, this.field1026, arg1, this.field1033, this.field1035, 0, var6, arg2, this, this.field1024, arg4);
                }
                this.field1034 -= arg1;
                if (this.field1034 != 0) {
                    return arg1;
                }
                if (!this.method1051()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1024 == -256 && (this.field1026 & 0xFF) == 0) {
                if (Statics.field1974) {
                    return method957(0, ((class63) this.field1043).field1207, arg0, this.field1026, arg1, this.field1029, this.field1030, 0, arg3, arg2, this);
                }
                return method956(((class63) this.field1043).field1207, arg0, this.field1026, arg1, this.field1033, 0, arg3, arg2, this);
            }
            if (Statics.field1974) {
                return method961(0, 0, ((class63) this.field1043).field1207, arg0, this.field1026, arg1, this.field1029, this.field1030, 0, arg3, arg2, this, this.field1024, arg4);
            }
            return method960(0, 0, ((class63) this.field1043).field1207, arg0, this.field1026, arg1, this.field1033, 0, arg3, arg2, this, this.field1024, arg4);
        }
    }

    @ObfuscatedName("af.al()Z")
    public boolean method1051() {
        int var1 = this.field1027;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1065(var1, this.field1028);
            var2 = method1009(var1, this.field1028);
        }
        if (this.field1033 != var1 || this.field1029 != var3 || this.field1030 != var2) {
            if (this.field1033 < var1) {
                this.field1035 = 1;
                this.field1034 = var1 - this.field1033;
            } else if (this.field1033 > var1) {
                this.field1035 = -1;
                this.field1034 = this.field1033 - var1;
            } else {
                this.field1035 = 0;
            }
            if (this.field1029 < var3) {
                this.field1036 = 1;
                if (this.field1034 == 0 || this.field1034 > var3 - this.field1029) {
                    this.field1034 = var3 - this.field1029;
                }
            } else if (this.field1029 > var3) {
                this.field1036 = -1;
                if (this.field1034 == 0 || this.field1034 > this.field1029 - var3) {
                    this.field1034 = this.field1029 - var3;
                }
            } else {
                this.field1036 = 0;
            }
            if (this.field1030 < var2) {
                this.field1037 = 1;
                if (this.field1034 == 0 || this.field1034 > var2 - this.field1030) {
                    this.field1034 = var2 - this.field1030;
                }
            } else if (this.field1030 > var2) {
                this.field1037 = -1;
                if (this.field1034 == 0 || this.field1034 > this.field1030 - var2) {
                    this.field1034 = this.field1030 - var2;
                }
            } else {
                this.field1037 = 0;
            }
            return false;
        } else if (this.field1027 == Integer.MIN_VALUE) {
            this.field1027 = 0;
            this.field1030 = 0;
            this.field1029 = 0;
            this.field1033 = 0;
            this.method3301();
            return true;
        } else {
            this.method948();
            return false;
        }
    }

    @ObfuscatedName("af.aj([B[IIIIIIILaf;)I")
    public static int method954(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field1026 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("af.am(I[B[IIIIIIIILaf;)I")
    public static int method955(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field1026 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("af.ab([B[IIIIIIILaf;)I")
    public static int method956(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field1026 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("af.ao(I[B[IIIIIIIILaf;)I")
    public static int method957(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field1026 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("af.ac(II[B[IIIIIIILaf;II)I")
    public static int method992(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field1026 = arg4;
        return arg5;
    }

    @ObfuscatedName("af.ap(II[B[IIIIIIIILaf;II)I")
    public static int method1024(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field1026 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("af.at(II[B[IIIIIIILaf;II)I")
    public static int method960(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field1026 = arg4;
        return arg5;
    }

    @ObfuscatedName("af.az(II[B[IIIIIIIILaf;II)I")
    public static int method961(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field1026 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("af.ae([B[IIIIIIIILaf;)I")
    public static int method931(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1029 += (var14 - arg3) * arg9.field1036;
        arg9.field1030 += (var14 - arg3) * arg9.field1037;
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
        arg9.field1033 = var12 >> 2;
        arg9.field1026 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("af.ad(I[B[IIIIIIIIIILaf;)I")
    public static int method963(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1033 += (var19 - arg4) * arg12.field1035;
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
        arg12.field1029 = var15 >> 2;
        arg12.field1030 = var16 >> 2;
        arg12.field1026 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("af.aw([B[IIIIIIIILaf;)I")
    public static int method964(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1029 += (var14 - arg3) * arg9.field1036;
        arg9.field1030 += (var14 - arg3) * arg9.field1037;
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
        arg9.field1033 = var12 >> 2;
        arg9.field1026 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("af.an(I[B[IIIIIIIIIILaf;)I")
    public static int method975(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1033 += (var19 - arg4) * arg12.field1035;
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
        arg12.field1029 = var15 >> 2;
        arg12.field1030 = var16 >> 2;
        arg12.field1026 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("af.aq(II[B[IIIIIIIILaf;II)I")
    public static int method1026(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1029 -= arg11.field1036 * arg5;
        arg11.field1030 -= arg11.field1037 * arg5;
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
        arg11.field1029 += arg11.field1036 * arg5;
        arg11.field1030 += arg11.field1037 * arg5;
        arg11.field1033 = arg6;
        arg11.field1026 = arg4;
        return arg5;
    }

    @ObfuscatedName("af.ax(II[B[IIIIIIIIIILaf;II)I")
    public static int method967(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1033 -= arg13.field1035 * arg5;
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
        arg13.field1033 += arg13.field1035 * var27;
        arg13.field1029 = arg6;
        arg13.field1030 = arg7;
        arg13.field1026 = arg4;
        return var27;
    }

    @ObfuscatedName("af.af(II[B[IIIIIIIILaf;II)I")
    public static int method1049(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1029 -= arg11.field1036 * arg5;
        arg11.field1030 -= arg11.field1037 * arg5;
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
        arg11.field1029 += arg11.field1036 * arg5;
        arg11.field1030 += arg11.field1037 * arg5;
        arg11.field1033 = arg6;
        arg11.field1026 = arg4;
        return arg5;
    }

    @ObfuscatedName("af.ar(II[B[IIIIIIIIIILaf;II)I")
    public static int method1063(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1033 -= arg13.field1035 * arg5;
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
        arg13.field1033 += arg13.field1035 * var26;
        arg13.field1029 = arg6;
        arg13.field1030 = arg7;
        arg13.field1026 = arg4;
        return var26;
    }
}
