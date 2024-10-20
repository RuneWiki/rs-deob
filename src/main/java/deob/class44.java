package deob;

@ObfuscatedName("ar")
public class class44 extends class47 {

    @ObfuscatedName("ar.g")
    public int field1040;

    @ObfuscatedName("ar.e")
    public int field1041;

    @ObfuscatedName("ar.n")
    public int field1042;

    @ObfuscatedName("ar.j")
    public int field1043;

    @ObfuscatedName("ar.i")
    public int field1044;

    @ObfuscatedName("ar.o")
    public int field1045;

    @ObfuscatedName("ar.l")
    public int field1046;

    @ObfuscatedName("ar.p")
    public int field1054;

    @ObfuscatedName("ar.t")
    public int field1051;

    @ObfuscatedName("ar.r")
    public int field1049;

    @ObfuscatedName("ar.a")
    public boolean field1050;

    @ObfuscatedName("ar.q")
    public int field1047;

    @ObfuscatedName("ar.z")
    public int field1048;

    @ObfuscatedName("ar.d")
    public int field1053;

    @ObfuscatedName("ar.x")
    public int field1052;

    @ObfuscatedName("ar.g(II)I")
    public static int method958(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ar.e(II)I")
    public static int method948(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ar.n()I")
    public int method1004() {
        int var1 = this.field1044 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1054 == 0) {
            var2 -= this.field1040 * var2 / (((class62) this.field1060).field1221.length << 8);
        } else if (this.field1054 >= 0) {
            var2 -= this.field1051 * var2 / ((class62) this.field1060).field1221.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class44(class62 arg0, int arg1, int arg2) {
        this.field1060 = arg0;
        this.field1051 = arg0.field1222;
        this.field1049 = arg0.field1223;
        this.field1050 = arg0.field1220;
        this.field1041 = arg1;
        this.field1042 = arg2;
        this.field1043 = 8192;
        this.field1040 = 0;
        this.method953();
    }

    public class44(class62 arg0, int arg1, int arg2, int arg3) {
        this.field1060 = arg0;
        this.field1051 = arg0.field1222;
        this.field1049 = arg0.field1223;
        this.field1050 = arg0.field1220;
        this.field1041 = arg1;
        this.field1042 = arg2;
        this.field1043 = arg3;
        this.field1040 = 0;
        this.method953();
    }

    @ObfuscatedName("ar.j(Lbf;II)Lar;")
    public static class44 method951(class62 arg0, int arg1, int arg2) {
        return arg0.field1221 == null || arg0.field1221.length == 0 ? null : new class44(arg0, (int) ((long) arg0.field1224 * 256L * (long) arg1 / (long) (Statics.field1989 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ar.i(Lbf;III)Lar;")
    public static class44 method952(class62 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1221 == null || arg0.field1221.length == 0 ? null : new class44(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ar.o()V")
    public void method953() {
        this.field1044 = this.field1042;
        this.field1045 = method958(this.field1042, this.field1043);
        this.field1046 = method948(this.field1042, this.field1043);
    }

    @ObfuscatedName("ar.l(I)V")
    public synchronized void method954(int arg0) {
        this.field1054 = arg0;
    }

    @ObfuscatedName("ar.p(I)V")
    public synchronized void method955(int arg0) {
        this.method1005(arg0 << 6, this.method959());
    }

    @ObfuscatedName("ar.t(I)V")
    public synchronized void method956(int arg0) {
        this.method1005(arg0, this.method959());
    }

    @ObfuscatedName("ar.w(II)V")
    public synchronized void method1005(int arg0, int arg1) {
        this.field1042 = arg0;
        this.field1043 = arg1;
        this.field1047 = 0;
        this.method953();
    }

    @ObfuscatedName("ar.r()I")
    public synchronized int method1031() {
        return this.field1042 == Integer.MIN_VALUE ? 0 : this.field1042;
    }

    @ObfuscatedName("ar.a()I")
    public synchronized int method959() {
        return this.field1043 < 0 ? -1 : this.field1043;
    }

    @ObfuscatedName("ar.q(I)V")
    public synchronized void method960(int arg0) {
        int var2 = ((class62) this.field1060).field1221.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1040 = arg0;
    }

    @ObfuscatedName("ar.z(Z)V")
    public synchronized void method961(boolean arg0) {
        this.field1041 = (this.field1041 >>> 31) + (this.field1041 ^ this.field1041 >> 31);
        if (arg0) {
            this.field1041 = -this.field1041;
        }
    }

    @ObfuscatedName("ar.d()V")
    public void method962() {
        if (this.field1047 == 0) {
            return;
        }
        if (this.field1042 == Integer.MIN_VALUE) {
            this.field1042 = 0;
        }
        this.field1047 = 0;
        this.method953();
    }

    @ObfuscatedName("ar.x(II)V")
    public synchronized void method963(int arg0, int arg1) {
        this.method964(arg0, arg1, this.method959());
    }

    @ObfuscatedName("ar.s(III)V")
    public synchronized void method964(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1005(arg1, arg2);
            return;
        }
        int var4 = method958(arg1, arg2);
        int var5 = method948(arg1, arg2);
        if (this.field1045 == var4 && this.field1046 == var5) {
            this.field1047 = 0;
            return;
        }
        int var6 = arg1 - this.field1044;
        if (this.field1044 - arg1 > var6) {
            var6 = this.field1044 - arg1;
        }
        if (var4 - this.field1045 > var6) {
            var6 = var4 - this.field1045;
        }
        if (this.field1045 - var4 > var6) {
            var6 = this.field1045 - var4;
        }
        if (var5 - this.field1046 > var6) {
            var6 = var5 - this.field1046;
        }
        if (this.field1046 - var5 > var6) {
            var6 = this.field1046 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1047 = arg0;
        this.field1042 = arg1;
        this.field1043 = arg2;
        this.field1048 = (arg1 - this.field1044) / arg0;
        this.field1053 = (var4 - this.field1045) / arg0;
        this.field1052 = (var5 - this.field1046) / arg0;
    }

    @ObfuscatedName("ar.m(I)V")
    public synchronized void method1084(int arg0) {
        if (arg0 == 0) {
            this.method956(0);
            this.method3415();
        } else if (this.field1045 == 0 && this.field1046 == 0) {
            this.field1047 = 0;
            this.field1042 = 0;
            this.field1044 = 0;
            this.method3415();
        } else {
            int var2 = -this.field1044;
            if (this.field1044 > var2) {
                var2 = this.field1044;
            }
            if (-this.field1045 > var2) {
                var2 = -this.field1045;
            }
            if (this.field1045 > var2) {
                var2 = this.field1045;
            }
            if (-this.field1046 > var2) {
                var2 = -this.field1046;
            }
            if (this.field1046 > var2) {
                var2 = this.field1046;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1047 = arg0;
            this.field1042 = Integer.MIN_VALUE;
            this.field1048 = -this.field1044 / arg0;
            this.field1053 = -this.field1045 / arg0;
            this.field1052 = -this.field1046 / arg0;
        }
    }

    @ObfuscatedName("ar.y(I)V")
    public synchronized void method1026(int arg0) {
        if (this.field1041 < 0) {
            this.field1041 = -arg0;
        } else {
            this.field1041 = arg0;
        }
    }

    @ObfuscatedName("ar.b()I")
    public synchronized int method1040() {
        return this.field1041 < 0 ? -this.field1041 : this.field1041;
    }

    @ObfuscatedName("ar.h()Z")
    public boolean method968() {
        return this.field1040 < 0 || this.field1040 >= ((class62) this.field1060).field1221.length << 8;
    }

    @ObfuscatedName("ar.f()Z")
    public boolean method969() {
        return this.field1047 != 0;
    }

    @ObfuscatedName("ar.v()Laz;")
    public class47 method1030() {
        return null;
    }

    @ObfuscatedName("ar.u()Laz;")
    public class47 method971() {
        return null;
    }

    @ObfuscatedName("ar.k()I")
    public int method972() {
        return this.field1042 == 0 && this.field1047 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ar.c([III)V")
    public synchronized void method973(int[] arg0, int arg1, int arg2) {
        if (this.field1042 == 0 && this.field1047 == 0) {
            this.method974(arg2);
            return;
        }
        class62 var4 = (class62) this.field1060;
        int var5 = this.field1051 << 8;
        int var6 = this.field1049 << 8;
        int var7 = var4.field1221.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1054 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1040 < 0) {
            if (this.field1041 <= 0) {
                this.method962();
                this.method3415();
                return;
            }
            this.field1040 = 0;
        }
        if (this.field1040 >= var7) {
            if (this.field1041 >= 0) {
                this.method962();
                this.method3415();
                return;
            }
            this.field1040 = var7 - 1;
        }
        if (this.field1054 >= 0) {
            if (this.field1054 > 0) {
                if (this.field1050) {
                    label131: {
                        if (this.field1041 < 0) {
                            var9 = this.method970(arg0, arg1, var5, var10, var4.field1221[this.field1051]);
                            if (this.field1040 >= var5) {
                                return;
                            }
                            this.field1040 = var5 + var5 - 1 - this.field1040;
                            this.field1041 = -this.field1041;
                            if (--this.field1054 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1039(arg0, var9, var6, var10, var4.field1221[this.field1049 - 1]);
                            if (this.field1040 < var6) {
                                return;
                            }
                            this.field1040 = var6 + var6 - 1 - this.field1040;
                            this.field1041 = -this.field1041;
                            if (--this.field1054 == 0) {
                                break;
                            }
                            var9 = this.method970(arg0, var9, var5, var10, var4.field1221[this.field1051]);
                            if (this.field1040 >= var5) {
                                return;
                            }
                            this.field1040 = var5 + var5 - 1 - this.field1040;
                            this.field1041 = -this.field1041;
                        } while (--this.field1054 != 0);
                    }
                } else if (this.field1041 < 0) {
                    while (true) {
                        var9 = this.method970(arg0, var9, var5, var10, var4.field1221[this.field1049 - 1]);
                        if (this.field1040 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1040) / var8;
                        if (var12 >= this.field1054) {
                            this.field1040 += this.field1054 * var8;
                            this.field1054 = 0;
                            break;
                        }
                        this.field1040 += var8 * var12;
                        this.field1054 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1039(arg0, var9, var6, var10, var4.field1221[this.field1051]);
                        if (this.field1040 < var6) {
                            return;
                        }
                        int var13 = (this.field1040 - var5) / var8;
                        if (var13 >= this.field1054) {
                            this.field1040 -= this.field1054 * var8;
                            this.field1054 = 0;
                            break;
                        }
                        this.field1040 -= var8 * var13;
                        this.field1054 -= var13;
                    }
                }
            }
            if (this.field1041 < 0) {
                this.method970(arg0, var9, 0, var10, 0);
                if (this.field1040 < 0) {
                    this.field1040 = -1;
                    this.method962();
                    this.method3415();
                }
            } else {
                this.method1039(arg0, var9, var7, var10, 0);
                if (this.field1040 >= var7) {
                    this.field1040 = var7;
                    this.method962();
                    this.method3415();
                }
            }
        } else if (this.field1050) {
            if (this.field1041 < 0) {
                var9 = this.method970(arg0, arg1, var5, var10, var4.field1221[this.field1051]);
                if (this.field1040 >= var5) {
                    return;
                }
                this.field1040 = var5 + var5 - 1 - this.field1040;
                this.field1041 = -this.field1041;
            }
            while (true) {
                int var11 = this.method1039(arg0, var9, var6, var10, var4.field1221[this.field1049 - 1]);
                if (this.field1040 < var6) {
                    return;
                }
                this.field1040 = var6 + var6 - 1 - this.field1040;
                this.field1041 = -this.field1041;
                var9 = this.method970(arg0, var11, var5, var10, var4.field1221[this.field1051]);
                if (this.field1040 >= var5) {
                    return;
                }
                this.field1040 = var5 + var5 - 1 - this.field1040;
                this.field1041 = -this.field1041;
            }
        } else if (this.field1041 < 0) {
            while (true) {
                var9 = this.method970(arg0, var9, var5, var10, var4.field1221[this.field1049 - 1]);
                if (this.field1040 >= var5) {
                    return;
                }
                this.field1040 = var6 - 1 - (var6 - 1 - this.field1040) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1039(arg0, var9, var6, var10, var4.field1221[this.field1051]);
                if (this.field1040 < var6) {
                    return;
                }
                this.field1040 = (this.field1040 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ar.al(I)V")
    public synchronized void method974(int arg0) {
        if (this.field1047 > 0) {
            if (arg0 >= this.field1047) {
                if (this.field1042 == Integer.MIN_VALUE) {
                    this.field1042 = 0;
                    this.field1046 = 0;
                    this.field1045 = 0;
                    this.field1044 = 0;
                    this.method3415();
                    arg0 = this.field1047;
                }
                this.field1047 = 0;
                this.method953();
            } else {
                this.field1044 += this.field1048 * arg0;
                this.field1045 += this.field1053 * arg0;
                this.field1046 += this.field1052 * arg0;
                this.field1047 -= arg0;
            }
        }
        class62 var2 = (class62) this.field1060;
        int var3 = this.field1051 << 8;
        int var4 = this.field1049 << 8;
        int var5 = var2.field1221.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1054 = 0;
        }
        if (this.field1040 < 0) {
            if (this.field1041 <= 0) {
                this.method962();
                this.method3415();
                return;
            }
            this.field1040 = 0;
        }
        if (this.field1040 >= var5) {
            if (this.field1041 >= 0) {
                this.method962();
                this.method3415();
                return;
            }
            this.field1040 = var5 - 1;
        }
        this.field1040 += this.field1041 * arg0;
        if (this.field1054 >= 0) {
            if (this.field1054 > 0) {
                if (this.field1050) {
                    label121: {
                        if (this.field1041 < 0) {
                            if (this.field1040 >= var3) {
                                return;
                            }
                            this.field1040 = var3 + var3 - 1 - this.field1040;
                            this.field1041 = -this.field1041;
                            if (--this.field1054 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1040 < var4) {
                                return;
                            }
                            this.field1040 = var4 + var4 - 1 - this.field1040;
                            this.field1041 = -this.field1041;
                            if (--this.field1054 == 0) {
                                break;
                            }
                            if (this.field1040 >= var3) {
                                return;
                            }
                            this.field1040 = var3 + var3 - 1 - this.field1040;
                            this.field1041 = -this.field1041;
                        } while (--this.field1054 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1041 < 0) {
                            if (this.field1040 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1040) / var6;
                            if (var7 >= this.field1054) {
                                this.field1040 += this.field1054 * var6;
                                this.field1054 = 0;
                                break label153;
                            }
                            this.field1040 += var6 * var7;
                            this.field1054 -= var7;
                        } else if (this.field1040 >= var4) {
                            int var8 = (this.field1040 - var3) / var6;
                            if (var8 >= this.field1054) {
                                this.field1040 -= this.field1054 * var6;
                                this.field1054 = 0;
                                break label153;
                            }
                            this.field1040 -= var6 * var8;
                            this.field1054 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1041 < 0) {
                if (this.field1040 < 0) {
                    this.field1040 = -1;
                    this.method962();
                    this.method3415();
                }
            } else if (this.field1040 >= var5) {
                this.field1040 = var5;
                this.method962();
                this.method3415();
            }
        } else if (this.field1050) {
            if (this.field1041 < 0) {
                if (this.field1040 >= var3) {
                    return;
                }
                this.field1040 = var3 + var3 - 1 - this.field1040;
                this.field1041 = -this.field1041;
            }
            while (this.field1040 >= var4) {
                this.field1040 = var4 + var4 - 1 - this.field1040;
                this.field1041 = -this.field1041;
                if (this.field1040 >= var3) {
                    return;
                }
                this.field1040 = var3 + var3 - 1 - this.field1040;
                this.field1041 = -this.field1041;
            }
        } else if (this.field1041 < 0) {
            if (this.field1040 >= var3) {
                return;
            }
            this.field1040 = var4 - 1 - (var4 - 1 - this.field1040) % var6;
        } else if (this.field1040 >= var4) {
            this.field1040 = (this.field1040 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ar.ai([IIIII)I")
    public int method1039(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1047 > 0) {
                int var6 = this.field1047 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1047 += arg1;
                if (this.field1041 == 256 && (this.field1040 & 0xFF) == 0) {
                    if (Statics.field1970) {
                        arg1 = method1088(0, ((class62) this.field1060).field1221, arg0, this.field1040, arg1, this.field1045, this.field1046, this.field1053, this.field1052, 0, var6, arg2, this);
                    } else {
                        arg1 = method985(((class62) this.field1060).field1221, arg0, this.field1040, arg1, this.field1044, this.field1048, 0, var6, arg2, this);
                    }
                } else if (Statics.field1970) {
                    arg1 = method957(0, 0, ((class62) this.field1060).field1221, arg0, this.field1040, arg1, this.field1045, this.field1046, this.field1053, this.field1052, 0, var6, arg2, this, this.field1041, arg4);
                } else {
                    arg1 = method949(0, 0, ((class62) this.field1060).field1221, arg0, this.field1040, arg1, this.field1044, this.field1048, 0, var6, arg2, this, this.field1041, arg4);
                }
                this.field1047 -= arg1;
                if (this.field1047 != 0) {
                    return arg1;
                }
                if (!this.method977()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1041 == 256 && (this.field1040 & 0xFF) == 0) {
                if (Statics.field1970) {
                    return method1046(0, ((class62) this.field1060).field1221, arg0, this.field1040, arg1, this.field1045, this.field1046, 0, arg3, arg2, this);
                }
                return method978(((class62) this.field1060).field1221, arg0, this.field1040, arg1, this.field1044, 0, arg3, arg2, this);
            }
            if (Statics.field1970) {
                return method983(0, 0, ((class62) this.field1060).field1221, arg0, this.field1040, arg1, this.field1045, this.field1046, 0, arg3, arg2, this, this.field1041, arg4);
            }
            return method1029(0, 0, ((class62) this.field1060).field1221, arg0, this.field1040, arg1, this.field1044, 0, arg3, arg2, this, this.field1041, arg4);
        }
    }

    @ObfuscatedName("ar.ad([IIIII)I")
    public int method970(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1047 > 0) {
                int var6 = this.field1047 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1047 += arg1;
                if (this.field1041 == -256 && (this.field1040 & 0xFF) == 0) {
                    if (Statics.field1970) {
                        arg1 = method988(0, ((class62) this.field1060).field1221, arg0, this.field1040, arg1, this.field1045, this.field1046, this.field1053, this.field1052, 0, var6, arg2, this);
                    } else {
                        arg1 = method1074(((class62) this.field1060).field1221, arg0, this.field1040, arg1, this.field1044, this.field1048, 0, var6, arg2, this);
                    }
                } else if (Statics.field1970) {
                    arg1 = method992(0, 0, ((class62) this.field1060).field1221, arg0, this.field1040, arg1, this.field1045, this.field1046, this.field1053, this.field1052, 0, var6, arg2, this, this.field1041, arg4);
                } else {
                    arg1 = method991(0, 0, ((class62) this.field1060).field1221, arg0, this.field1040, arg1, this.field1044, this.field1048, 0, var6, arg2, this, this.field1041, arg4);
                }
                this.field1047 -= arg1;
                if (this.field1047 != 0) {
                    return arg1;
                }
                if (!this.method977()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1041 == -256 && (this.field1040 & 0xFF) == 0) {
                if (Statics.field1970) {
                    return method981(0, ((class62) this.field1060).field1221, arg0, this.field1040, arg1, this.field1045, this.field1046, 0, arg3, arg2, this);
                }
                return method980(((class62) this.field1060).field1221, arg0, this.field1040, arg1, this.field1044, 0, arg3, arg2, this);
            }
            if (Statics.field1970) {
                return method1056(0, 0, ((class62) this.field1060).field1221, arg0, this.field1040, arg1, this.field1045, this.field1046, 0, arg3, arg2, this, this.field1041, arg4);
            }
            return method984(0, 0, ((class62) this.field1060).field1221, arg0, this.field1040, arg1, this.field1044, 0, arg3, arg2, this, this.field1041, arg4);
        }
    }

    @ObfuscatedName("ar.aw()Z")
    public boolean method977() {
        int var1 = this.field1042;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method958(var1, this.field1043);
            var2 = method948(var1, this.field1043);
        }
        if (this.field1044 != var1 || this.field1045 != var3 || this.field1046 != var2) {
            if (this.field1044 < var1) {
                this.field1048 = 1;
                this.field1047 = var1 - this.field1044;
            } else if (this.field1044 > var1) {
                this.field1048 = -1;
                this.field1047 = this.field1044 - var1;
            } else {
                this.field1048 = 0;
            }
            if (this.field1045 < var3) {
                this.field1053 = 1;
                if (this.field1047 == 0 || this.field1047 > var3 - this.field1045) {
                    this.field1047 = var3 - this.field1045;
                }
            } else if (this.field1045 > var3) {
                this.field1053 = -1;
                if (this.field1047 == 0 || this.field1047 > this.field1045 - var3) {
                    this.field1047 = this.field1045 - var3;
                }
            } else {
                this.field1053 = 0;
            }
            if (this.field1046 < var2) {
                this.field1052 = 1;
                if (this.field1047 == 0 || this.field1047 > var2 - this.field1046) {
                    this.field1047 = var2 - this.field1046;
                }
            } else if (this.field1046 > var2) {
                this.field1052 = -1;
                if (this.field1047 == 0 || this.field1047 > this.field1046 - var2) {
                    this.field1047 = this.field1046 - var2;
                }
            } else {
                this.field1052 = 0;
            }
            return false;
        } else if (this.field1042 == Integer.MIN_VALUE) {
            this.field1042 = 0;
            this.field1046 = 0;
            this.field1045 = 0;
            this.field1044 = 0;
            this.method3415();
            return true;
        } else {
            this.method953();
            return false;
        }
    }

    @ObfuscatedName("ar.af([B[IIIIIIILar;)I")
    public static int method978(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class44 arg8) {
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
        arg8.field1040 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ar.an(I[B[IIIIIIIILar;)I")
    public static int method1046(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10) {
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
        arg10.field1040 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ar.ao([B[IIIIIIILar;)I")
    public static int method980(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class44 arg8) {
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
        arg8.field1040 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ar.ak(I[B[IIIIIIIILar;)I")
    public static int method981(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10) {
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
        arg10.field1040 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ar.ah(II[B[IIIIIIILar;II)I")
    public static int method1029(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10, int arg11, int arg12) {
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
        arg10.field1040 = arg4;
        return arg5;
    }

    @ObfuscatedName("ar.aq(II[B[IIIIIIIILar;II)I")
    public static int method983(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
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
        arg11.field1040 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ar.ax(II[B[IIIIIIILar;II)I")
    public static int method984(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10, int arg11, int arg12) {
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
        arg10.field1040 = arg4;
        return arg5;
    }

    @ObfuscatedName("ar.ag(II[B[IIIIIIIILar;II)I")
    public static int method1056(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
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
        arg11.field1040 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ar.am([B[IIIIIIIILar;)I")
    public static int method985(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class44 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1045 += (var14 - arg3) * arg9.field1053;
        arg9.field1046 += (var14 - arg3) * arg9.field1052;
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
        arg9.field1044 = var12 >> 2;
        arg9.field1040 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ar.at(I[B[IIIIIIIIIILar;)I")
    public static int method1088(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class44 arg12) {
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
        arg12.field1044 += (var19 - arg4) * arg12.field1048;
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
        arg12.field1045 = var15 >> 2;
        arg12.field1046 = var16 >> 2;
        arg12.field1040 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ar.ae([B[IIIIIIIILar;)I")
    public static int method1074(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class44 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1045 += (var14 - arg3) * arg9.field1053;
        arg9.field1046 += (var14 - arg3) * arg9.field1052;
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
        arg9.field1044 = var12 >> 2;
        arg9.field1040 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ar.ay(I[B[IIIIIIIIIILar;)I")
    public static int method988(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class44 arg12) {
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
        arg12.field1044 += (var19 - arg4) * arg12.field1048;
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
        arg12.field1045 = var15 >> 2;
        arg12.field1046 = var16 >> 2;
        arg12.field1040 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ar.as(II[B[IIIIIIIILar;II)I")
    public static int method949(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
        arg11.field1045 -= arg11.field1053 * arg5;
        arg11.field1046 -= arg11.field1052 * arg5;
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
        arg11.field1045 += arg11.field1053 * arg5;
        arg11.field1046 += arg11.field1052 * arg5;
        arg11.field1044 = arg6;
        arg11.field1040 = arg4;
        return arg5;
    }

    @ObfuscatedName("ar.ar(II[B[IIIIIIIIIILar;II)I")
    public static int method957(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class44 arg13, int arg14, int arg15) {
        arg13.field1044 -= arg13.field1048 * arg5;
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
        arg13.field1044 += arg13.field1048 * var27;
        arg13.field1045 = arg6;
        arg13.field1046 = arg7;
        arg13.field1040 = arg4;
        return var27;
    }

    @ObfuscatedName("ar.aj(II[B[IIIIIIIILar;II)I")
    public static int method991(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
        arg11.field1045 -= arg11.field1053 * arg5;
        arg11.field1046 -= arg11.field1052 * arg5;
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
        arg11.field1045 += arg11.field1053 * arg5;
        arg11.field1046 += arg11.field1052 * arg5;
        arg11.field1044 = arg6;
        arg11.field1040 = arg4;
        return arg5;
    }

    @ObfuscatedName("ar.av(II[B[IIIIIIIIIILar;II)I")
    public static int method992(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class44 arg13, int arg14, int arg15) {
        arg13.field1044 -= arg13.field1048 * arg5;
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
        arg13.field1044 += arg13.field1048 * var26;
        arg13.field1045 = arg6;
        arg13.field1046 = arg7;
        arg13.field1040 = arg4;
        return var26;
    }
}
