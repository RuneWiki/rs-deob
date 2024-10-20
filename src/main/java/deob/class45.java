package deob;

@ObfuscatedName("ar")
public class class45 extends class48 {

    @ObfuscatedName("ar.g")
    public int field1043;

    @ObfuscatedName("ar.m")
    public int field1042;

    @ObfuscatedName("ar.v")
    public int field1047;

    @ObfuscatedName("ar.r")
    public int field1044;

    @ObfuscatedName("ar.n")
    public int field1046;

    @ObfuscatedName("ar.i")
    public int field1052;

    @ObfuscatedName("ar.s")
    public int field1054;

    @ObfuscatedName("ar.d")
    public int field1048;

    @ObfuscatedName("ar.t")
    public int field1049;

    @ObfuscatedName("ar.f")
    public int field1050;

    @ObfuscatedName("ar.b")
    public boolean field1051;

    @ObfuscatedName("ar.z")
    public int field1041;

    @ObfuscatedName("ar.l")
    public int field1053;

    @ObfuscatedName("ar.e")
    public int field1045;

    @ObfuscatedName("ar.p")
    public int field1055;

    @ObfuscatedName("ar.g(II)I")
    public static int method1100(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ar.m(II)I")
    public static int method933(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ar.v()I")
    public int method934() {
        int var1 = this.field1046 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1048 == 0) {
            var2 -= this.field1043 * var2 / (((class63) this.field1064).field1227.length << 8);
        } else if (this.field1048 >= 0) {
            var2 -= this.field1049 * var2 / ((class63) this.field1064).field1227.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class45(class63 arg0, int arg1, int arg2) {
        this.field1064 = arg0;
        this.field1049 = arg0.field1228;
        this.field1050 = arg0.field1226;
        this.field1051 = arg0.field1230;
        this.field1042 = arg1;
        this.field1047 = arg2;
        this.field1044 = 8192;
        this.field1043 = 0;
        this.method937();
    }

    public class45(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1064 = arg0;
        this.field1049 = arg0.field1228;
        this.field1050 = arg0.field1226;
        this.field1051 = arg0.field1230;
        this.field1042 = arg1;
        this.field1047 = arg2;
        this.field1044 = arg3;
        this.field1043 = 0;
        this.method937();
    }

    @ObfuscatedName("ar.r(Lbd;II)Lar;")
    public static class45 method1077(class63 arg0, int arg1, int arg2) {
        return arg0.field1227 == null || arg0.field1227.length == 0 ? null : new class45(arg0, (int) ((long) arg0.field1229 * 256L * (long) arg1 / (long) (Statics.field1096 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ar.n(Lbd;III)Lar;")
    public static class45 method936(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1227 == null || arg0.field1227.length == 0 ? null : new class45(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ar.i()V")
    public void method937() {
        this.field1046 = this.field1047;
        this.field1052 = method1100(this.field1047, this.field1044);
        this.field1054 = method933(this.field1047, this.field1044);
    }

    @ObfuscatedName("ar.s(I)V")
    public synchronized void method938(int arg0) {
        this.field1048 = arg0;
    }

    @ObfuscatedName("ar.w(I)V")
    public synchronized void method939(int arg0) {
        this.method941(arg0 << 6, this.method943());
    }

    @ObfuscatedName("ar.d(I)V")
    public synchronized void method940(int arg0) {
        this.method941(arg0, this.method943());
    }

    @ObfuscatedName("ar.t(II)V")
    public synchronized void method941(int arg0, int arg1) {
        this.field1047 = arg0;
        this.field1044 = arg1;
        this.field1041 = 0;
        this.method937();
    }

    @ObfuscatedName("ar.f()I")
    public synchronized int method942() {
        return this.field1047 == Integer.MIN_VALUE ? 0 : this.field1047;
    }

    @ObfuscatedName("ar.b()I")
    public synchronized int method943() {
        return this.field1044 < 0 ? -1 : this.field1044;
    }

    @ObfuscatedName("ar.z(I)V")
    public synchronized void method1057(int arg0) {
        int var2 = ((class63) this.field1064).field1227.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1043 = arg0;
    }

    @ObfuscatedName("ar.l(Z)V")
    public synchronized void method1032(boolean arg0) {
        this.field1042 = (this.field1042 >>> 31) + (this.field1042 ^ this.field1042 >> 31);
        if (arg0) {
            this.field1042 = -this.field1042;
        }
    }

    @ObfuscatedName("ar.e()V")
    public void method988() {
        if (this.field1041 == 0) {
            return;
        }
        if (this.field1047 == Integer.MIN_VALUE) {
            this.field1047 = 0;
        }
        this.field1041 = 0;
        this.method937();
    }

    @ObfuscatedName("ar.p(II)V")
    public synchronized void method1059(int arg0, int arg1) {
        this.method993(arg0, arg1, this.method943());
    }

    @ObfuscatedName("ar.o(III)V")
    public synchronized void method993(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method941(arg1, arg2);
            return;
        }
        int var4 = method1100(arg1, arg2);
        int var5 = method933(arg1, arg2);
        if (this.field1052 == var4 && this.field1054 == var5) {
            this.field1041 = 0;
            return;
        }
        int var6 = arg1 - this.field1046;
        if (this.field1046 - arg1 > var6) {
            var6 = this.field1046 - arg1;
        }
        if (var4 - this.field1052 > var6) {
            var6 = var4 - this.field1052;
        }
        if (this.field1052 - var4 > var6) {
            var6 = this.field1052 - var4;
        }
        if (var5 - this.field1054 > var6) {
            var6 = var5 - this.field1054;
        }
        if (this.field1054 - var5 > var6) {
            var6 = this.field1054 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1041 = arg0;
        this.field1047 = arg1;
        this.field1044 = arg2;
        this.field1053 = (arg1 - this.field1046) / arg0;
        this.field1045 = (var4 - this.field1052) / arg0;
        this.field1055 = (var5 - this.field1054) / arg0;
    }

    @ObfuscatedName("ar.h(I)V")
    public synchronized void method949(int arg0) {
        if (arg0 == 0) {
            this.method940(0);
            this.method3346();
        } else if (this.field1052 == 0 && this.field1054 == 0) {
            this.field1041 = 0;
            this.field1047 = 0;
            this.field1046 = 0;
            this.method3346();
        } else {
            int var2 = -this.field1046;
            if (this.field1046 > var2) {
                var2 = this.field1046;
            }
            if (-this.field1052 > var2) {
                var2 = -this.field1052;
            }
            if (this.field1052 > var2) {
                var2 = this.field1052;
            }
            if (-this.field1054 > var2) {
                var2 = -this.field1054;
            }
            if (this.field1054 > var2) {
                var2 = this.field1054;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1041 = arg0;
            this.field1047 = Integer.MIN_VALUE;
            this.field1053 = -this.field1046 / arg0;
            this.field1045 = -this.field1052 / arg0;
            this.field1055 = -this.field1054 / arg0;
        }
    }

    @ObfuscatedName("ar.j(I)V")
    public synchronized void method963(int arg0) {
        if (this.field1042 < 0) {
            this.field1042 = -arg0;
        } else {
            this.field1042 = arg0;
        }
    }

    @ObfuscatedName("ar.x()I")
    public synchronized int method951() {
        return this.field1042 < 0 ? -this.field1042 : this.field1042;
    }

    @ObfuscatedName("ar.k()Z")
    public boolean method952() {
        return this.field1043 < 0 || this.field1043 >= ((class63) this.field1064).field1227.length << 8;
    }

    @ObfuscatedName("ar.a()Z")
    public boolean method953() {
        return this.field1041 != 0;
    }

    @ObfuscatedName("ar.y()Lax;")
    public class48 method935() {
        return null;
    }

    @ObfuscatedName("ar.q()Lax;")
    public class48 method1044() {
        return null;
    }

    @ObfuscatedName("ar.c()I")
    public int method946() {
        return this.field1047 == 0 && this.field1041 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ar.u([III)V")
    public synchronized void method957(int[] arg0, int arg1, int arg2) {
        if (this.field1047 == 0 && this.field1041 == 0) {
            this.method958(arg2);
            return;
        }
        class63 var4 = (class63) this.field1064;
        int var5 = this.field1049 << 8;
        int var6 = this.field1050 << 8;
        int var7 = var4.field1227.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1048 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1043 < 0) {
            if (this.field1042 <= 0) {
                this.method988();
                this.method3346();
                return;
            }
            this.field1043 = 0;
        }
        if (this.field1043 >= var7) {
            if (this.field1042 >= 0) {
                this.method988();
                this.method3346();
                return;
            }
            this.field1043 = var7 - 1;
        }
        if (this.field1048 >= 0) {
            if (this.field1048 > 0) {
                if (this.field1051) {
                    label131: {
                        if (this.field1042 < 0) {
                            var9 = this.method976(arg0, arg1, var5, var10, var4.field1227[this.field1049]);
                            if (this.field1043 >= var5) {
                                return;
                            }
                            this.field1043 = var5 + var5 - 1 - this.field1043;
                            this.field1042 = -this.field1042;
                            if (--this.field1048 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1051(arg0, var9, var6, var10, var4.field1227[this.field1050 - 1]);
                            if (this.field1043 < var6) {
                                return;
                            }
                            this.field1043 = var6 + var6 - 1 - this.field1043;
                            this.field1042 = -this.field1042;
                            if (--this.field1048 == 0) {
                                break;
                            }
                            var9 = this.method976(arg0, var9, var5, var10, var4.field1227[this.field1049]);
                            if (this.field1043 >= var5) {
                                return;
                            }
                            this.field1043 = var5 + var5 - 1 - this.field1043;
                            this.field1042 = -this.field1042;
                        } while (--this.field1048 != 0);
                    }
                } else if (this.field1042 < 0) {
                    while (true) {
                        var9 = this.method976(arg0, var9, var5, var10, var4.field1227[this.field1050 - 1]);
                        if (this.field1043 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1043) / var8;
                        if (var12 >= this.field1048) {
                            this.field1043 += this.field1048 * var8;
                            this.field1048 = 0;
                            break;
                        }
                        this.field1043 += var8 * var12;
                        this.field1048 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1051(arg0, var9, var6, var10, var4.field1227[this.field1049]);
                        if (this.field1043 < var6) {
                            return;
                        }
                        int var13 = (this.field1043 - var5) / var8;
                        if (var13 >= this.field1048) {
                            this.field1043 -= this.field1048 * var8;
                            this.field1048 = 0;
                            break;
                        }
                        this.field1043 -= var8 * var13;
                        this.field1048 -= var13;
                    }
                }
            }
            if (this.field1042 < 0) {
                this.method976(arg0, var9, 0, var10, 0);
                if (this.field1043 < 0) {
                    this.field1043 = -1;
                    this.method988();
                    this.method3346();
                }
            } else {
                this.method1051(arg0, var9, var7, var10, 0);
                if (this.field1043 >= var7) {
                    this.field1043 = var7;
                    this.method988();
                    this.method3346();
                }
            }
        } else if (this.field1051) {
            if (this.field1042 < 0) {
                var9 = this.method976(arg0, arg1, var5, var10, var4.field1227[this.field1049]);
                if (this.field1043 >= var5) {
                    return;
                }
                this.field1043 = var5 + var5 - 1 - this.field1043;
                this.field1042 = -this.field1042;
            }
            while (true) {
                int var11 = this.method1051(arg0, var9, var6, var10, var4.field1227[this.field1050 - 1]);
                if (this.field1043 < var6) {
                    return;
                }
                this.field1043 = var6 + var6 - 1 - this.field1043;
                this.field1042 = -this.field1042;
                var9 = this.method976(arg0, var11, var5, var10, var4.field1227[this.field1049]);
                if (this.field1043 >= var5) {
                    return;
                }
                this.field1043 = var5 + var5 - 1 - this.field1043;
                this.field1042 = -this.field1042;
            }
        } else if (this.field1042 < 0) {
            while (true) {
                var9 = this.method976(arg0, var9, var5, var10, var4.field1227[this.field1050 - 1]);
                if (this.field1043 >= var5) {
                    return;
                }
                this.field1043 = var6 - 1 - (var6 - 1 - this.field1043) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1051(arg0, var9, var6, var10, var4.field1227[this.field1049]);
                if (this.field1043 < var6) {
                    return;
                }
                this.field1043 = (this.field1043 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ar.ah(I)V")
    public synchronized void method958(int arg0) {
        if (this.field1041 > 0) {
            if (arg0 >= this.field1041) {
                if (this.field1047 == Integer.MIN_VALUE) {
                    this.field1047 = 0;
                    this.field1054 = 0;
                    this.field1052 = 0;
                    this.field1046 = 0;
                    this.method3346();
                    arg0 = this.field1041;
                }
                this.field1041 = 0;
                this.method937();
            } else {
                this.field1046 += this.field1053 * arg0;
                this.field1052 += this.field1045 * arg0;
                this.field1054 += this.field1055 * arg0;
                this.field1041 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1064;
        int var3 = this.field1049 << 8;
        int var4 = this.field1050 << 8;
        int var5 = var2.field1227.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1048 = 0;
        }
        if (this.field1043 < 0) {
            if (this.field1042 <= 0) {
                this.method988();
                this.method3346();
                return;
            }
            this.field1043 = 0;
        }
        if (this.field1043 >= var5) {
            if (this.field1042 >= 0) {
                this.method988();
                this.method3346();
                return;
            }
            this.field1043 = var5 - 1;
        }
        this.field1043 += this.field1042 * arg0;
        if (this.field1048 >= 0) {
            if (this.field1048 > 0) {
                if (this.field1051) {
                    label121: {
                        if (this.field1042 < 0) {
                            if (this.field1043 >= var3) {
                                return;
                            }
                            this.field1043 = var3 + var3 - 1 - this.field1043;
                            this.field1042 = -this.field1042;
                            if (--this.field1048 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1043 < var4) {
                                return;
                            }
                            this.field1043 = var4 + var4 - 1 - this.field1043;
                            this.field1042 = -this.field1042;
                            if (--this.field1048 == 0) {
                                break;
                            }
                            if (this.field1043 >= var3) {
                                return;
                            }
                            this.field1043 = var3 + var3 - 1 - this.field1043;
                            this.field1042 = -this.field1042;
                        } while (--this.field1048 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1042 < 0) {
                            if (this.field1043 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1043) / var6;
                            if (var7 >= this.field1048) {
                                this.field1043 += this.field1048 * var6;
                                this.field1048 = 0;
                                break label153;
                            }
                            this.field1043 += var6 * var7;
                            this.field1048 -= var7;
                        } else if (this.field1043 >= var4) {
                            int var8 = (this.field1043 - var3) / var6;
                            if (var8 >= this.field1048) {
                                this.field1043 -= this.field1048 * var6;
                                this.field1048 = 0;
                                break label153;
                            }
                            this.field1043 -= var6 * var8;
                            this.field1048 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1042 < 0) {
                if (this.field1043 < 0) {
                    this.field1043 = -1;
                    this.method988();
                    this.method3346();
                }
            } else if (this.field1043 >= var5) {
                this.field1043 = var5;
                this.method988();
                this.method3346();
            }
        } else if (this.field1051) {
            if (this.field1042 < 0) {
                if (this.field1043 >= var3) {
                    return;
                }
                this.field1043 = var3 + var3 - 1 - this.field1043;
                this.field1042 = -this.field1042;
            }
            while (this.field1043 >= var4) {
                this.field1043 = var4 + var4 - 1 - this.field1043;
                this.field1042 = -this.field1042;
                if (this.field1043 >= var3) {
                    return;
                }
                this.field1043 = var3 + var3 - 1 - this.field1043;
                this.field1042 = -this.field1042;
            }
        } else if (this.field1042 < 0) {
            if (this.field1043 >= var3) {
                return;
            }
            this.field1043 = var4 - 1 - (var4 - 1 - this.field1043) % var6;
        } else if (this.field1043 >= var4) {
            this.field1043 = (this.field1043 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ar.az([IIIII)I")
    public int method1051(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1041 > 0) {
                int var6 = this.field1041 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1041 += arg1;
                if (this.field1042 == 256 && (this.field1043 & 0xFF) == 0) {
                    if (Statics.field1085) {
                        arg1 = method971(0, ((class63) this.field1064).field1227, arg0, this.field1043, arg1, this.field1052, this.field1054, this.field1045, this.field1055, 0, var6, arg2, this);
                    } else {
                        arg1 = method1025(((class63) this.field1064).field1227, arg0, this.field1043, arg1, this.field1046, this.field1053, 0, var6, arg2, this);
                    }
                } else if (Statics.field1085) {
                    arg1 = method995(0, 0, ((class63) this.field1064).field1227, arg0, this.field1043, arg1, this.field1052, this.field1054, this.field1045, this.field1055, 0, var6, arg2, this, this.field1042, arg4);
                } else {
                    arg1 = method1063(0, 0, ((class63) this.field1064).field1227, arg0, this.field1043, arg1, this.field1046, this.field1053, 0, var6, arg2, this, this.field1042, arg4);
                }
                this.field1041 -= arg1;
                if (this.field1041 != 0) {
                    return arg1;
                }
                if (!this.method1061()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1042 == 256 && (this.field1043 & 0xFF) == 0) {
                if (Statics.field1085) {
                    return method978(0, ((class63) this.field1064).field1227, arg0, this.field1043, arg1, this.field1052, this.field1054, 0, arg3, arg2, this);
                }
                return method962(((class63) this.field1064).field1227, arg0, this.field1043, arg1, this.field1046, 0, arg3, arg2, this);
            }
            if (Statics.field1085) {
                return method967(0, 0, ((class63) this.field1064).field1227, arg0, this.field1043, arg1, this.field1052, this.field1054, 0, arg3, arg2, this, this.field1042, arg4);
            }
            return method966(0, 0, ((class63) this.field1064).field1227, arg0, this.field1043, arg1, this.field1046, 0, arg3, arg2, this, this.field1042, arg4);
        }
    }

    @ObfuscatedName("ar.au([IIIII)I")
    public int method976(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1041 > 0) {
                int var6 = this.field1041 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1041 += arg1;
                if (this.field1042 == -256 && (this.field1043 & 0xFF) == 0) {
                    if (Statics.field1085) {
                        arg1 = method973(0, ((class63) this.field1064).field1227, arg0, this.field1043, arg1, this.field1052, this.field1054, this.field1045, this.field1055, 0, var6, arg2, this);
                    } else {
                        arg1 = method1065(((class63) this.field1064).field1227, arg0, this.field1043, arg1, this.field1046, this.field1053, 0, var6, arg2, this);
                    }
                } else if (Statics.field1085) {
                    arg1 = method977(0, 0, ((class63) this.field1064).field1227, arg0, this.field1043, arg1, this.field1052, this.field1054, this.field1045, this.field1055, 0, var6, arg2, this, this.field1042, arg4);
                } else {
                    arg1 = method1024(0, 0, ((class63) this.field1064).field1227, arg0, this.field1043, arg1, this.field1046, this.field1053, 0, var6, arg2, this, this.field1042, arg4);
                }
                this.field1041 -= arg1;
                if (this.field1041 != 0) {
                    return arg1;
                }
                if (!this.method1061()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1042 == -256 && (this.field1043 & 0xFF) == 0) {
                if (Statics.field1085) {
                    return method965(0, ((class63) this.field1064).field1227, arg0, this.field1043, arg1, this.field1052, this.field1054, 0, arg3, arg2, this);
                }
                return method964(((class63) this.field1064).field1227, arg0, this.field1043, arg1, this.field1046, 0, arg3, arg2, this);
            }
            if (Statics.field1085) {
                return method969(0, 0, ((class63) this.field1064).field1227, arg0, this.field1043, arg1, this.field1052, this.field1054, 0, arg3, arg2, this, this.field1042, arg4);
            }
            return method968(0, 0, ((class63) this.field1064).field1227, arg0, this.field1043, arg1, this.field1046, 0, arg3, arg2, this, this.field1042, arg4);
        }
    }

    @ObfuscatedName("ar.ae()Z")
    public boolean method1061() {
        int var1 = this.field1047;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1100(var1, this.field1044);
            var2 = method933(var1, this.field1044);
        }
        if (this.field1046 != var1 || this.field1052 != var3 || this.field1054 != var2) {
            if (this.field1046 < var1) {
                this.field1053 = 1;
                this.field1041 = var1 - this.field1046;
            } else if (this.field1046 > var1) {
                this.field1053 = -1;
                this.field1041 = this.field1046 - var1;
            } else {
                this.field1053 = 0;
            }
            if (this.field1052 < var3) {
                this.field1045 = 1;
                if (this.field1041 == 0 || this.field1041 > var3 - this.field1052) {
                    this.field1041 = var3 - this.field1052;
                }
            } else if (this.field1052 > var3) {
                this.field1045 = -1;
                if (this.field1041 == 0 || this.field1041 > this.field1052 - var3) {
                    this.field1041 = this.field1052 - var3;
                }
            } else {
                this.field1045 = 0;
            }
            if (this.field1054 < var2) {
                this.field1055 = 1;
                if (this.field1041 == 0 || this.field1041 > var2 - this.field1054) {
                    this.field1041 = var2 - this.field1054;
                }
            } else if (this.field1054 > var2) {
                this.field1055 = -1;
                if (this.field1041 == 0 || this.field1041 > this.field1054 - var2) {
                    this.field1041 = this.field1054 - var2;
                }
            } else {
                this.field1055 = 0;
            }
            return false;
        } else if (this.field1047 == Integer.MIN_VALUE) {
            this.field1047 = 0;
            this.field1054 = 0;
            this.field1052 = 0;
            this.field1046 = 0;
            this.method3346();
            return true;
        } else {
            this.method937();
            return false;
        }
    }

    @ObfuscatedName("ar.aa([B[IIIIIIILar;)I")
    public static int method962(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field1043 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ar.av(I[B[IIIIIIIILar;)I")
    public static int method978(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field1043 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ar.aq([B[IIIIIIILar;)I")
    public static int method964(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field1043 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ar.ak(I[B[IIIIIIIILar;)I")
    public static int method965(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field1043 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ar.ad(II[B[IIIIIIILar;II)I")
    public static int method966(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field1043 = arg4;
        return arg5;
    }

    @ObfuscatedName("ar.at(II[B[IIIIIIIILar;II)I")
    public static int method967(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field1043 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ar.an(II[B[IIIIIIILar;II)I")
    public static int method968(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field1043 = arg4;
        return arg5;
    }

    @ObfuscatedName("ar.aw(II[B[IIIIIIIILar;II)I")
    public static int method969(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field1043 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ar.am([B[IIIIIIIILar;)I")
    public static int method1025(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1052 += (var14 - arg3) * arg9.field1045;
        arg9.field1054 += (var14 - arg3) * arg9.field1055;
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
        arg9.field1046 = var12 >> 2;
        arg9.field1043 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ar.af(I[B[IIIIIIIIIILar;)I")
    public static int method971(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1046 += (var19 - arg4) * arg12.field1053;
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
        arg12.field1054 = var16 >> 2;
        arg12.field1043 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ar.as([B[IIIIIIIILar;)I")
    public static int method1065(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1052 += (var14 - arg3) * arg9.field1045;
        arg9.field1054 += (var14 - arg3) * arg9.field1055;
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
        arg9.field1046 = var12 >> 2;
        arg9.field1043 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ar.ao(I[B[IIIIIIIIIILar;)I")
    public static int method973(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1046 += (var19 - arg4) * arg12.field1053;
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
        arg12.field1054 = var16 >> 2;
        arg12.field1043 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ar.ab(II[B[IIIIIIIILar;II)I")
    public static int method1063(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1052 -= arg11.field1045 * arg5;
        arg11.field1054 -= arg11.field1055 * arg5;
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
        arg11.field1052 += arg11.field1045 * arg5;
        arg11.field1054 += arg11.field1055 * arg5;
        arg11.field1046 = arg6;
        arg11.field1043 = arg4;
        return arg5;
    }

    @ObfuscatedName("ar.ay(II[B[IIIIIIIIIILar;II)I")
    public static int method995(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1046 -= arg13.field1053 * arg5;
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
        arg13.field1046 += arg13.field1053 * var27;
        arg13.field1052 = arg6;
        arg13.field1054 = arg7;
        arg13.field1043 = arg4;
        return var27;
    }

    @ObfuscatedName("ar.ar(II[B[IIIIIIIILar;II)I")
    public static int method1024(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1052 -= arg11.field1045 * arg5;
        arg11.field1054 -= arg11.field1055 * arg5;
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
        arg11.field1052 += arg11.field1045 * arg5;
        arg11.field1054 += arg11.field1055 * arg5;
        arg11.field1046 = arg6;
        arg11.field1043 = arg4;
        return arg5;
    }

    @ObfuscatedName("ar.aj(II[B[IIIIIIIIIILar;II)I")
    public static int method977(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1046 -= arg13.field1053 * arg5;
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
        arg13.field1046 += arg13.field1053 * var26;
        arg13.field1052 = arg6;
        arg13.field1054 = arg7;
        arg13.field1043 = arg4;
        return var26;
    }
}
