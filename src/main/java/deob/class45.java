package deob;

@ObfuscatedName("ah")
public class class45 extends class48 {

    @ObfuscatedName("ah.c")
    public int field1069;

    @ObfuscatedName("ah.q")
    public int field1066;

    @ObfuscatedName("ah.y")
    public int field1067;

    @ObfuscatedName("ah.v")
    public int field1068;

    @ObfuscatedName("ah.g")
    public int field1072;

    @ObfuscatedName("ah.x")
    public int field1070;

    @ObfuscatedName("ah.u")
    public int field1071;

    @ObfuscatedName("ah.l")
    public int field1076;

    @ObfuscatedName("ah.a")
    public int field1073;

    @ObfuscatedName("ah.h")
    public int field1074;

    @ObfuscatedName("ah.t")
    public boolean field1075;

    @ObfuscatedName("ah.m")
    public int field1077;

    @ObfuscatedName("ah.s")
    public int field1065;

    @ObfuscatedName("ah.j")
    public int field1078;

    @ObfuscatedName("ah.b")
    public int field1079;

    @ObfuscatedName("ah.c(II)I")
    public static int method950(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ah.q(II)I")
    public static int method911(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ah.y()I")
    public int method912() {
        int var1 = this.field1072 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1076 == 0) {
            var2 -= this.field1069 * var2 / (((class63) this.field1087).field1251.length << 8);
        } else if (this.field1076 >= 0) {
            var2 -= this.field1073 * var2 / ((class63) this.field1087).field1251.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class45(class63 arg0, int arg1, int arg2) {
        this.field1087 = arg0;
        this.field1073 = arg0.field1252;
        this.field1074 = arg0.field1253;
        this.field1075 = arg0.field1254;
        this.field1066 = arg1;
        this.field1067 = arg2;
        this.field1068 = 8192;
        this.field1069 = 0;
        this.method931();
    }

    public class45(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1087 = arg0;
        this.field1073 = arg0.field1252;
        this.field1074 = arg0.field1253;
        this.field1075 = arg0.field1254;
        this.field1066 = arg1;
        this.field1067 = arg2;
        this.field1068 = arg3;
        this.field1069 = 0;
        this.method931();
    }

    @ObfuscatedName("ah.v(Lbo;II)Lah;")
    public static class45 method1022(class63 arg0, int arg1, int arg2) {
        return arg0.field1251 == null || arg0.field1251.length == 0 ? null : new class45(arg0, (int) ((long) arg0.field1250 * 256L * (long) arg1 / (long) (Statics.field1118 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ah.g(Lbo;III)Lah;")
    public static class45 method915(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1251 == null || arg0.field1251.length == 0 ? null : new class45(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ah.x()V")
    public void method931() {
        this.field1072 = this.field1067;
        this.field1070 = method950(this.field1067, this.field1068);
        this.field1071 = method911(this.field1067, this.field1068);
    }

    @ObfuscatedName("ah.u(I)V")
    public synchronized void method917(int arg0) {
        this.field1076 = arg0;
    }

    @ObfuscatedName("ah.l(I)V")
    public synchronized void method1044(int arg0) {
        this.method1050(arg0 << 6, this.method922());
    }

    @ObfuscatedName("ah.a(I)V")
    public synchronized void method919(int arg0) {
        this.method1050(arg0, this.method922());
    }

    @ObfuscatedName("ah.h(II)V")
    public synchronized void method1050(int arg0, int arg1) {
        this.field1067 = arg0;
        this.field1068 = arg1;
        this.field1077 = 0;
        this.method931();
    }

    @ObfuscatedName("ah.t()I")
    public synchronized int method921() {
        return this.field1067 == Integer.MIN_VALUE ? 0 : this.field1067;
    }

    @ObfuscatedName("ah.m()I")
    public synchronized int method922() {
        return this.field1068 < 0 ? -1 : this.field1068;
    }

    @ObfuscatedName("ah.s(I)V")
    public synchronized void method923(int arg0) {
        int var2 = ((class63) this.field1087).field1251.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1069 = arg0;
    }

    @ObfuscatedName("ah.j(Z)V")
    public synchronized void method924(boolean arg0) {
        this.field1066 = (this.field1066 >>> 31) + (this.field1066 ^ this.field1066 >> 31);
        if (arg0) {
            this.field1066 = -this.field1066;
        }
    }

    @ObfuscatedName("ah.b()V")
    public void method1017() {
        if (this.field1077 == 0) {
            return;
        }
        if (this.field1067 == Integer.MIN_VALUE) {
            this.field1067 = 0;
        }
        this.field1077 = 0;
        this.method931();
    }

    @ObfuscatedName("ah.n(II)V")
    public synchronized void method1046(int arg0, int arg1) {
        this.method934(arg0, arg1, this.method922());
    }

    @ObfuscatedName("ah.z(III)V")
    public synchronized void method934(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1050(arg1, arg2);
            return;
        }
        int var4 = method950(arg1, arg2);
        int var5 = method911(arg1, arg2);
        if (this.field1070 == var4 && this.field1071 == var5) {
            this.field1077 = 0;
            return;
        }
        int var6 = arg1 - this.field1072;
        if (this.field1072 - arg1 > var6) {
            var6 = this.field1072 - arg1;
        }
        if (var4 - this.field1070 > var6) {
            var6 = var4 - this.field1070;
        }
        if (this.field1070 - var4 > var6) {
            var6 = this.field1070 - var4;
        }
        if (var5 - this.field1071 > var6) {
            var6 = var5 - this.field1071;
        }
        if (this.field1071 - var5 > var6) {
            var6 = this.field1071 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1077 = arg0;
        this.field1067 = arg1;
        this.field1068 = arg2;
        this.field1065 = (arg1 - this.field1072) / arg0;
        this.field1078 = (var4 - this.field1070) / arg0;
        this.field1079 = (var5 - this.field1071) / arg0;
    }

    @ObfuscatedName("ah.d(I)V")
    public synchronized void method928(int arg0) {
        if (arg0 == 0) {
            this.method919(0);
            this.method3196();
        } else if (this.field1070 == 0 && this.field1071 == 0) {
            this.field1077 = 0;
            this.field1067 = 0;
            this.field1072 = 0;
            this.method3196();
        } else {
            int var2 = -this.field1072;
            if (this.field1072 > var2) {
                var2 = this.field1072;
            }
            if (-this.field1070 > var2) {
                var2 = -this.field1070;
            }
            if (this.field1070 > var2) {
                var2 = this.field1070;
            }
            if (-this.field1071 > var2) {
                var2 = -this.field1071;
            }
            if (this.field1071 > var2) {
                var2 = this.field1071;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1077 = arg0;
            this.field1067 = Integer.MIN_VALUE;
            this.field1065 = -this.field1072 / arg0;
            this.field1078 = -this.field1070 / arg0;
            this.field1079 = -this.field1071 / arg0;
        }
    }

    @ObfuscatedName("ah.f(I)V")
    public synchronized void method927(int arg0) {
        if (this.field1066 < 0) {
            this.field1066 = -arg0;
        } else {
            this.field1066 = arg0;
        }
    }

    @ObfuscatedName("ah.o()I")
    public synchronized int method930() {
        return this.field1066 < 0 ? -this.field1066 : this.field1066;
    }

    @ObfuscatedName("ah.r()Z")
    public boolean method946() {
        return this.field1069 < 0 || this.field1069 >= ((class63) this.field1087).field1251.length << 8;
    }

    @ObfuscatedName("ah.k()Z")
    public boolean method932() {
        return this.field1077 != 0;
    }

    @ObfuscatedName("ah.w()Lab;")
    public class48 method933() {
        return null;
    }

    @ObfuscatedName("ah.e()Lab;")
    public class48 method974() {
        return null;
    }

    @ObfuscatedName("ah.p()I")
    public int method935() {
        return this.field1067 == 0 && this.field1077 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ah.i([III)V")
    public synchronized void method976(int[] arg0, int arg1, int arg2) {
        if (this.field1067 == 0 && this.field1077 == 0) {
            this.method937(arg2);
            return;
        }
        class63 var4 = (class63) this.field1087;
        int var5 = this.field1073 << 8;
        int var6 = this.field1074 << 8;
        int var7 = var4.field1251.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1076 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1069 < 0) {
            if (this.field1066 <= 0) {
                this.method1017();
                this.method3196();
                return;
            }
            this.field1069 = 0;
        }
        if (this.field1069 >= var7) {
            if (this.field1066 >= 0) {
                this.method1017();
                this.method3196();
                return;
            }
            this.field1069 = var7 - 1;
        }
        if (this.field1076 >= 0) {
            if (this.field1076 > 0) {
                if (this.field1075) {
                    label131: {
                        if (this.field1066 < 0) {
                            var9 = this.method939(arg0, arg1, var5, var10, var4.field1251[this.field1073]);
                            if (this.field1069 >= var5) {
                                return;
                            }
                            this.field1069 = var5 + var5 - 1 - this.field1069;
                            this.field1066 = -this.field1066;
                            if (--this.field1076 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method938(arg0, var9, var6, var10, var4.field1251[this.field1074 - 1]);
                            if (this.field1069 < var6) {
                                return;
                            }
                            this.field1069 = var6 + var6 - 1 - this.field1069;
                            this.field1066 = -this.field1066;
                            if (--this.field1076 == 0) {
                                break;
                            }
                            var9 = this.method939(arg0, var9, var5, var10, var4.field1251[this.field1073]);
                            if (this.field1069 >= var5) {
                                return;
                            }
                            this.field1069 = var5 + var5 - 1 - this.field1069;
                            this.field1066 = -this.field1066;
                        } while (--this.field1076 != 0);
                    }
                } else if (this.field1066 < 0) {
                    while (true) {
                        var9 = this.method939(arg0, var9, var5, var10, var4.field1251[this.field1074 - 1]);
                        if (this.field1069 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1069) / var8;
                        if (var12 >= this.field1076) {
                            this.field1069 += this.field1076 * var8;
                            this.field1076 = 0;
                            break;
                        }
                        this.field1069 += var8 * var12;
                        this.field1076 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method938(arg0, var9, var6, var10, var4.field1251[this.field1073]);
                        if (this.field1069 < var6) {
                            return;
                        }
                        int var13 = (this.field1069 - var5) / var8;
                        if (var13 >= this.field1076) {
                            this.field1069 -= this.field1076 * var8;
                            this.field1076 = 0;
                            break;
                        }
                        this.field1069 -= var8 * var13;
                        this.field1076 -= var13;
                    }
                }
            }
            if (this.field1066 < 0) {
                this.method939(arg0, var9, 0, var10, 0);
                if (this.field1069 < 0) {
                    this.field1069 = -1;
                    this.method1017();
                    this.method3196();
                }
            } else {
                this.method938(arg0, var9, var7, var10, 0);
                if (this.field1069 >= var7) {
                    this.field1069 = var7;
                    this.method1017();
                    this.method3196();
                }
            }
        } else if (this.field1075) {
            if (this.field1066 < 0) {
                var9 = this.method939(arg0, arg1, var5, var10, var4.field1251[this.field1073]);
                if (this.field1069 >= var5) {
                    return;
                }
                this.field1069 = var5 + var5 - 1 - this.field1069;
                this.field1066 = -this.field1066;
            }
            while (true) {
                int var11 = this.method938(arg0, var9, var6, var10, var4.field1251[this.field1074 - 1]);
                if (this.field1069 < var6) {
                    return;
                }
                this.field1069 = var6 + var6 - 1 - this.field1069;
                this.field1066 = -this.field1066;
                var9 = this.method939(arg0, var11, var5, var10, var4.field1251[this.field1073]);
                if (this.field1069 >= var5) {
                    return;
                }
                this.field1069 = var5 + var5 - 1 - this.field1069;
                this.field1066 = -this.field1066;
            }
        } else if (this.field1066 < 0) {
            while (true) {
                var9 = this.method939(arg0, var9, var5, var10, var4.field1251[this.field1074 - 1]);
                if (this.field1069 >= var5) {
                    return;
                }
                this.field1069 = var6 - 1 - (var6 - 1 - this.field1069) % var8;
            }
        } else {
            while (true) {
                var9 = this.method938(arg0, var9, var6, var10, var4.field1251[this.field1073]);
                if (this.field1069 < var6) {
                    return;
                }
                this.field1069 = (this.field1069 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ah.ap(I)V")
    public synchronized void method937(int arg0) {
        if (this.field1077 > 0) {
            if (arg0 >= this.field1077) {
                if (this.field1067 == Integer.MIN_VALUE) {
                    this.field1067 = 0;
                    this.field1071 = 0;
                    this.field1070 = 0;
                    this.field1072 = 0;
                    this.method3196();
                    arg0 = this.field1077;
                }
                this.field1077 = 0;
                this.method931();
            } else {
                this.field1072 += this.field1065 * arg0;
                this.field1070 += this.field1078 * arg0;
                this.field1071 += this.field1079 * arg0;
                this.field1077 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1087;
        int var3 = this.field1073 << 8;
        int var4 = this.field1074 << 8;
        int var5 = var2.field1251.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1076 = 0;
        }
        if (this.field1069 < 0) {
            if (this.field1066 <= 0) {
                this.method1017();
                this.method3196();
                return;
            }
            this.field1069 = 0;
        }
        if (this.field1069 >= var5) {
            if (this.field1066 >= 0) {
                this.method1017();
                this.method3196();
                return;
            }
            this.field1069 = var5 - 1;
        }
        this.field1069 += this.field1066 * arg0;
        if (this.field1076 >= 0) {
            if (this.field1076 > 0) {
                if (this.field1075) {
                    label121: {
                        if (this.field1066 < 0) {
                            if (this.field1069 >= var3) {
                                return;
                            }
                            this.field1069 = var3 + var3 - 1 - this.field1069;
                            this.field1066 = -this.field1066;
                            if (--this.field1076 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1069 < var4) {
                                return;
                            }
                            this.field1069 = var4 + var4 - 1 - this.field1069;
                            this.field1066 = -this.field1066;
                            if (--this.field1076 == 0) {
                                break;
                            }
                            if (this.field1069 >= var3) {
                                return;
                            }
                            this.field1069 = var3 + var3 - 1 - this.field1069;
                            this.field1066 = -this.field1066;
                        } while (--this.field1076 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1066 < 0) {
                            if (this.field1069 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1069) / var6;
                            if (var7 >= this.field1076) {
                                this.field1069 += this.field1076 * var6;
                                this.field1076 = 0;
                                break label153;
                            }
                            this.field1069 += var6 * var7;
                            this.field1076 -= var7;
                        } else if (this.field1069 >= var4) {
                            int var8 = (this.field1069 - var3) / var6;
                            if (var8 >= this.field1076) {
                                this.field1069 -= this.field1076 * var6;
                                this.field1076 = 0;
                                break label153;
                            }
                            this.field1069 -= var6 * var8;
                            this.field1076 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1066 < 0) {
                if (this.field1069 < 0) {
                    this.field1069 = -1;
                    this.method1017();
                    this.method3196();
                }
            } else if (this.field1069 >= var5) {
                this.field1069 = var5;
                this.method1017();
                this.method3196();
            }
        } else if (this.field1075) {
            if (this.field1066 < 0) {
                if (this.field1069 >= var3) {
                    return;
                }
                this.field1069 = var3 + var3 - 1 - this.field1069;
                this.field1066 = -this.field1066;
            }
            while (this.field1069 >= var4) {
                this.field1069 = var4 + var4 - 1 - this.field1069;
                this.field1066 = -this.field1066;
                if (this.field1069 >= var3) {
                    return;
                }
                this.field1069 = var3 + var3 - 1 - this.field1069;
                this.field1066 = -this.field1066;
            }
        } else if (this.field1066 < 0) {
            if (this.field1069 >= var3) {
                return;
            }
            this.field1069 = var4 - 1 - (var4 - 1 - this.field1069) % var6;
        } else if (this.field1069 >= var4) {
            this.field1069 = (this.field1069 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ah.as([IIIII)I")
    public int method938(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1077 > 0) {
                int var6 = this.field1077 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1077 += arg1;
                if (this.field1066 == 256 && (this.field1069 & 0xFF) == 0) {
                    if (Statics.field1110) {
                        arg1 = method916(0, ((class63) this.field1087).field1251, arg0, this.field1069, arg1, this.field1070, this.field1071, this.field1078, this.field1079, 0, var6, arg2, this);
                    } else {
                        arg1 = method949(((class63) this.field1087).field1251, arg0, this.field1069, arg1, this.field1072, this.field1065, 0, var6, arg2, this);
                    }
                } else if (Statics.field1110) {
                    arg1 = method1034(0, 0, ((class63) this.field1087).field1251, arg0, this.field1069, arg1, this.field1070, this.field1071, this.field1078, this.field1079, 0, var6, arg2, this, this.field1066, arg4);
                } else {
                    arg1 = method953(0, 0, ((class63) this.field1087).field1251, arg0, this.field1069, arg1, this.field1072, this.field1065, 0, var6, arg2, this, this.field1066, arg4);
                }
                this.field1077 -= arg1;
                if (this.field1077 != 0) {
                    return arg1;
                }
                if (!this.method940()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1066 == 256 && (this.field1069 & 0xFF) == 0) {
                if (Statics.field1110) {
                    return method942(0, ((class63) this.field1087).field1251, arg0, this.field1069, arg1, this.field1070, this.field1071, 0, arg3, arg2, this);
                }
                return method941(((class63) this.field1087).field1251, arg0, this.field1069, arg1, this.field1072, 0, arg3, arg2, this);
            }
            if (Statics.field1110) {
                return method981(0, 0, ((class63) this.field1087).field1251, arg0, this.field1069, arg1, this.field1070, this.field1071, 0, arg3, arg2, this, this.field1066, arg4);
            }
            return method945(0, 0, ((class63) this.field1087).field1251, arg0, this.field1069, arg1, this.field1072, 0, arg3, arg2, this, this.field1066, arg4);
        }
    }

    @ObfuscatedName("ah.ak([IIIII)I")
    public int method939(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1077 > 0) {
                int var6 = this.field1077 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1077 += arg1;
                if (this.field1066 == -256 && (this.field1069 & 0xFF) == 0) {
                    if (Statics.field1110) {
                        arg1 = method952(0, ((class63) this.field1087).field1251, arg0, this.field1069, arg1, this.field1070, this.field1071, this.field1078, this.field1079, 0, var6, arg2, this);
                    } else {
                        arg1 = method951(((class63) this.field1087).field1251, arg0, this.field1069, arg1, this.field1072, this.field1065, 0, var6, arg2, this);
                    }
                } else if (Statics.field1110) {
                    arg1 = method964(0, 0, ((class63) this.field1087).field1251, arg0, this.field1069, arg1, this.field1070, this.field1071, this.field1078, this.field1079, 0, var6, arg2, this, this.field1066, arg4);
                } else {
                    arg1 = method956(0, 0, ((class63) this.field1087).field1251, arg0, this.field1069, arg1, this.field1072, this.field1065, 0, var6, arg2, this, this.field1066, arg4);
                }
                this.field1077 -= arg1;
                if (this.field1077 != 0) {
                    return arg1;
                }
                if (!this.method940()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1066 == -256 && (this.field1069 & 0xFF) == 0) {
                if (Statics.field1110) {
                    return method944(0, ((class63) this.field1087).field1251, arg0, this.field1069, arg1, this.field1070, this.field1071, 0, arg3, arg2, this);
                }
                return method943(((class63) this.field1087).field1251, arg0, this.field1069, arg1, this.field1072, 0, arg3, arg2, this);
            }
            if (Statics.field1110) {
                return method958(0, 0, ((class63) this.field1087).field1251, arg0, this.field1069, arg1, this.field1070, this.field1071, 0, arg3, arg2, this, this.field1066, arg4);
            }
            return method947(0, 0, ((class63) this.field1087).field1251, arg0, this.field1069, arg1, this.field1072, 0, arg3, arg2, this, this.field1066, arg4);
        }
    }

    @ObfuscatedName("ah.af()Z")
    public boolean method940() {
        int var1 = this.field1067;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method950(var1, this.field1068);
            var2 = method911(var1, this.field1068);
        }
        if (this.field1072 != var1 || this.field1070 != var3 || this.field1071 != var2) {
            if (this.field1072 < var1) {
                this.field1065 = 1;
                this.field1077 = var1 - this.field1072;
            } else if (this.field1072 > var1) {
                this.field1065 = -1;
                this.field1077 = this.field1072 - var1;
            } else {
                this.field1065 = 0;
            }
            if (this.field1070 < var3) {
                this.field1078 = 1;
                if (this.field1077 == 0 || this.field1077 > var3 - this.field1070) {
                    this.field1077 = var3 - this.field1070;
                }
            } else if (this.field1070 > var3) {
                this.field1078 = -1;
                if (this.field1077 == 0 || this.field1077 > this.field1070 - var3) {
                    this.field1077 = this.field1070 - var3;
                }
            } else {
                this.field1078 = 0;
            }
            if (this.field1071 < var2) {
                this.field1079 = 1;
                if (this.field1077 == 0 || this.field1077 > var2 - this.field1071) {
                    this.field1077 = var2 - this.field1071;
                }
            } else if (this.field1071 > var2) {
                this.field1079 = -1;
                if (this.field1077 == 0 || this.field1077 > this.field1071 - var2) {
                    this.field1077 = this.field1071 - var2;
                }
            } else {
                this.field1079 = 0;
            }
            return false;
        } else if (this.field1067 == Integer.MIN_VALUE) {
            this.field1067 = 0;
            this.field1071 = 0;
            this.field1070 = 0;
            this.field1072 = 0;
            this.method3196();
            return true;
        } else {
            this.method931();
            return false;
        }
    }

    @ObfuscatedName("ah.ag([B[IIIIIIILah;)I")
    public static int method941(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field1069 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ah.aj(I[B[IIIIIIIILah;)I")
    public static int method942(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field1069 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ah.ac([B[IIIIIIILah;)I")
    public static int method943(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field1069 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ah.an(I[B[IIIIIIIILah;)I")
    public static int method944(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field1069 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ah.ad(II[B[IIIIIIILah;II)I")
    public static int method945(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field1069 = arg4;
        return arg5;
    }

    @ObfuscatedName("ah.ai(II[B[IIIIIIIILah;II)I")
    public static int method981(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field1069 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ah.ae(II[B[IIIIIIILah;II)I")
    public static int method947(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field1069 = arg4;
        return arg5;
    }

    @ObfuscatedName("ah.au(II[B[IIIIIIIILah;II)I")
    public static int method958(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field1069 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ah.at([B[IIIIIIIILah;)I")
    public static int method949(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1070 += (var14 - arg3) * arg9.field1078;
        arg9.field1071 += (var14 - arg3) * arg9.field1079;
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
        arg9.field1072 = var12 >> 2;
        arg9.field1069 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ah.ax(I[B[IIIIIIIIIILah;)I")
    public static int method916(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1072 += (var19 - arg4) * arg12.field1065;
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
        arg12.field1070 = var15 >> 2;
        arg12.field1071 = var16 >> 2;
        arg12.field1069 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ah.aq([B[IIIIIIIILah;)I")
    public static int method951(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1070 += (var14 - arg3) * arg9.field1078;
        arg9.field1071 += (var14 - arg3) * arg9.field1079;
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
        arg9.field1072 = var12 >> 2;
        arg9.field1069 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ah.aw(I[B[IIIIIIIIIILah;)I")
    public static int method952(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1072 += (var19 - arg4) * arg12.field1065;
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
        arg12.field1070 = var15 >> 2;
        arg12.field1071 = var16 >> 2;
        arg12.field1069 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ah.ao(II[B[IIIIIIIILah;II)I")
    public static int method953(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1070 -= arg11.field1078 * arg5;
        arg11.field1071 -= arg11.field1079 * arg5;
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
        arg11.field1070 += arg11.field1078 * arg5;
        arg11.field1071 += arg11.field1079 * arg5;
        arg11.field1072 = arg6;
        arg11.field1069 = arg4;
        return arg5;
    }

    @ObfuscatedName("ah.aa(II[B[IIIIIIIIIILah;II)I")
    public static int method1034(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1072 -= arg13.field1065 * arg5;
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
        arg13.field1072 += arg13.field1065 * var27;
        arg13.field1070 = arg6;
        arg13.field1071 = arg7;
        arg13.field1069 = arg4;
        return var27;
    }

    @ObfuscatedName("ah.ah(II[B[IIIIIIIILah;II)I")
    public static int method956(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1070 -= arg11.field1078 * arg5;
        arg11.field1071 -= arg11.field1079 * arg5;
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
        arg11.field1070 += arg11.field1078 * arg5;
        arg11.field1071 += arg11.field1079 * arg5;
        arg11.field1072 = arg6;
        arg11.field1069 = arg4;
        return arg5;
    }

    @ObfuscatedName("ah.av(II[B[IIIIIIIIIILah;II)I")
    public static int method964(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1072 -= arg13.field1065 * arg5;
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
        arg13.field1072 += arg13.field1065 * var26;
        arg13.field1070 = arg6;
        arg13.field1071 = arg7;
        arg13.field1069 = arg4;
        return var26;
    }
}
