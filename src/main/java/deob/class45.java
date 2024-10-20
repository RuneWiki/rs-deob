package deob;

@ObfuscatedName("aw")
public class class45 extends class48 {

    @ObfuscatedName("aw.l")
    public int field1053;

    @ObfuscatedName("aw.b")
    public int field1046;

    @ObfuscatedName("aw.o")
    public int field1041;

    @ObfuscatedName("aw.r")
    public int field1042;

    @ObfuscatedName("aw.k")
    public int field1039;

    @ObfuscatedName("aw.z")
    public int field1048;

    @ObfuscatedName("aw.g")
    public int field1045;

    @ObfuscatedName("aw.n")
    public int field1040;

    @ObfuscatedName("aw.j")
    public int field1047;

    @ObfuscatedName("aw.c")
    public int field1043;

    @ObfuscatedName("aw.m")
    public boolean field1049;

    @ObfuscatedName("aw.a")
    public int field1050;

    @ObfuscatedName("aw.e")
    public int field1051;

    @ObfuscatedName("aw.q")
    public int field1052;

    @ObfuscatedName("aw.y")
    public int field1044;

    @ObfuscatedName("aw.l(II)I")
    public static int method1063(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("aw.b(II)I")
    public static int method1074(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("aw.o()I")
    public int method943() {
        int var1 = this.field1039 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1040 == 0) {
            var2 -= this.field1053 * var2 / (((class63) this.field1059).field1228.length << 8);
        } else if (this.field1040 >= 0) {
            var2 -= this.field1047 * var2 / ((class63) this.field1059).field1228.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class45(class63 arg0, int arg1, int arg2) {
        this.field1059 = arg0;
        this.field1047 = arg0.field1230;
        this.field1043 = arg0.field1232;
        this.field1049 = arg0.field1229;
        this.field1046 = arg1;
        this.field1041 = arg2;
        this.field1042 = 8192;
        this.field1053 = 0;
        this.method1034();
    }

    public class45(class63 arg0, int arg1, int arg2, int arg3) {
        this.field1059 = arg0;
        this.field1047 = arg0.field1230;
        this.field1043 = arg0.field1232;
        this.field1049 = arg0.field1229;
        this.field1046 = arg1;
        this.field1041 = arg2;
        this.field1042 = arg3;
        this.field1053 = 0;
        this.method1034();
    }

    @ObfuscatedName("aw.w(Lbl;II)Law;")
    public static class45 method1024(class63 arg0, int arg1, int arg2) {
        return arg0.field1228 == null || arg0.field1228.length == 0 ? null : new class45(arg0, (int) ((long) arg0.field1231 * 256L * (long) arg1 / (long) (Statics.field745 * 100)), arg2 << 6);
    }

    @ObfuscatedName("aw.r(Lbl;III)Law;")
    public static class45 method945(class63 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1228 == null || arg0.field1228.length == 0 ? null : new class45(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("aw.k()V")
    public void method1034() {
        this.field1039 = this.field1041;
        this.field1048 = method1063(this.field1041, this.field1042);
        this.field1045 = method1074(this.field1041, this.field1042);
    }

    @ObfuscatedName("aw.z(I)V")
    public synchronized void method947(int arg0) {
        this.field1040 = arg0;
    }

    @ObfuscatedName("aw.g(I)V")
    public synchronized void method948(int arg0) {
        this.method954(arg0 << 6, this.method1021());
    }

    @ObfuscatedName("aw.n(I)V")
    public synchronized void method1059(int arg0) {
        this.method954(arg0, this.method1021());
    }

    @ObfuscatedName("aw.j(II)V")
    public synchronized void method954(int arg0, int arg1) {
        this.field1041 = arg0;
        this.field1042 = arg1;
        this.field1050 = 0;
        this.method1034();
    }

    @ObfuscatedName("aw.c()I")
    public synchronized int method951() {
        return this.field1041 == Integer.MIN_VALUE ? 0 : this.field1041;
    }

    @ObfuscatedName("aw.m()I")
    public synchronized int method1021() {
        return this.field1042 < 0 ? -1 : this.field1042;
    }

    @ObfuscatedName("aw.a(I)V")
    public synchronized void method956(int arg0) {
        int var2 = ((class63) this.field1059).field1228.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1053 = arg0;
    }

    @ObfuscatedName("aw.e(Z)V")
    public synchronized void method1065(boolean arg0) {
        this.field1046 = (this.field1046 >>> 31) + (this.field1046 ^ this.field1046 >> 31);
        if (arg0) {
            this.field1046 = -this.field1046;
        }
    }

    @ObfuscatedName("aw.q()V")
    public void method1050() {
        if (this.field1050 == 0) {
            return;
        }
        if (this.field1041 == Integer.MIN_VALUE) {
            this.field1041 = 0;
        }
        this.field1050 = 0;
        this.method1034();
    }

    @ObfuscatedName("aw.y(II)V")
    public synchronized void method1087(int arg0, int arg1) {
        this.method949(arg0, arg1, this.method1021());
    }

    @ObfuscatedName("aw.v(III)V")
    public synchronized void method949(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method954(arg1, arg2);
            return;
        }
        int var4 = method1063(arg1, arg2);
        int var5 = method1074(arg1, arg2);
        if (this.field1048 == var4 && this.field1045 == var5) {
            this.field1050 = 0;
            return;
        }
        int var6 = arg1 - this.field1039;
        if (this.field1039 - arg1 > var6) {
            var6 = this.field1039 - arg1;
        }
        if (var4 - this.field1048 > var6) {
            var6 = var4 - this.field1048;
        }
        if (this.field1048 - var4 > var6) {
            var6 = this.field1048 - var4;
        }
        if (var5 - this.field1045 > var6) {
            var6 = var5 - this.field1045;
        }
        if (this.field1045 - var5 > var6) {
            var6 = this.field1045 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1050 = arg0;
        this.field1041 = arg1;
        this.field1042 = arg2;
        this.field1051 = (arg1 - this.field1039) / arg0;
        this.field1052 = (var4 - this.field1048) / arg0;
        this.field1044 = (var5 - this.field1045) / arg0;
    }

    @ObfuscatedName("aw.s(I)V")
    public synchronized void method1052(int arg0) {
        if (arg0 == 0) {
            this.method1059(0);
            this.method3360();
        } else if (this.field1048 == 0 && this.field1045 == 0) {
            this.field1050 = 0;
            this.field1041 = 0;
            this.field1039 = 0;
            this.method3360();
        } else {
            int var2 = -this.field1039;
            if (this.field1039 > var2) {
                var2 = this.field1039;
            }
            if (-this.field1048 > var2) {
                var2 = -this.field1048;
            }
            if (this.field1048 > var2) {
                var2 = this.field1048;
            }
            if (-this.field1045 > var2) {
                var2 = -this.field1045;
            }
            if (this.field1045 > var2) {
                var2 = this.field1045;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1050 = arg0;
            this.field1041 = Integer.MIN_VALUE;
            this.field1051 = -this.field1039 / arg0;
            this.field1052 = -this.field1048 / arg0;
            this.field1044 = -this.field1045 / arg0;
        }
    }

    @ObfuscatedName("aw.u(I)V")
    public synchronized void method959(int arg0) {
        if (this.field1046 < 0) {
            this.field1046 = -arg0;
        } else {
            this.field1046 = arg0;
        }
    }

    @ObfuscatedName("aw.d()I")
    public synchronized int method960() {
        return this.field1046 < 0 ? -this.field1046 : this.field1046;
    }

    @ObfuscatedName("aw.i()Z")
    public boolean method961() {
        return this.field1053 < 0 || this.field1053 >= ((class63) this.field1059).field1228.length << 8;
    }

    @ObfuscatedName("aw.p()Z")
    public boolean method962() {
        return this.field1050 != 0;
    }

    @ObfuscatedName("aw.h()Las;")
    public class48 method963() {
        return null;
    }

    @ObfuscatedName("aw.f()Las;")
    public class48 method1090() {
        return null;
    }

    @ObfuscatedName("aw.t()I")
    public int method965() {
        return this.field1041 == 0 && this.field1050 == 0 ? 0 : 1;
    }

    @ObfuscatedName("aw.x([III)V")
    public synchronized void method1095(int[] arg0, int arg1, int arg2) {
        if (this.field1041 == 0 && this.field1050 == 0) {
            this.method967(arg2);
            return;
        }
        class63 var4 = (class63) this.field1059;
        int var5 = this.field1047 << 8;
        int var6 = this.field1043 << 8;
        int var7 = var4.field1228.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1040 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1053 < 0) {
            if (this.field1046 <= 0) {
                this.method1050();
                this.method3360();
                return;
            }
            this.field1053 = 0;
        }
        if (this.field1053 >= var7) {
            if (this.field1046 >= 0) {
                this.method1050();
                this.method3360();
                return;
            }
            this.field1053 = var7 - 1;
        }
        if (this.field1040 >= 0) {
            if (this.field1040 > 0) {
                if (this.field1049) {
                    label131: {
                        if (this.field1046 < 0) {
                            var9 = this.method969(arg0, arg1, var5, var10, var4.field1228[this.field1047]);
                            if (this.field1053 >= var5) {
                                return;
                            }
                            this.field1053 = var5 + var5 - 1 - this.field1053;
                            this.field1046 = -this.field1046;
                            if (--this.field1040 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method986(arg0, var9, var6, var10, var4.field1228[this.field1043 - 1]);
                            if (this.field1053 < var6) {
                                return;
                            }
                            this.field1053 = var6 + var6 - 1 - this.field1053;
                            this.field1046 = -this.field1046;
                            if (--this.field1040 == 0) {
                                break;
                            }
                            var9 = this.method969(arg0, var9, var5, var10, var4.field1228[this.field1047]);
                            if (this.field1053 >= var5) {
                                return;
                            }
                            this.field1053 = var5 + var5 - 1 - this.field1053;
                            this.field1046 = -this.field1046;
                        } while (--this.field1040 != 0);
                    }
                } else if (this.field1046 < 0) {
                    while (true) {
                        var9 = this.method969(arg0, var9, var5, var10, var4.field1228[this.field1043 - 1]);
                        if (this.field1053 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1053) / var8;
                        if (var12 >= this.field1040) {
                            this.field1053 += this.field1040 * var8;
                            this.field1040 = 0;
                            break;
                        }
                        this.field1053 += var8 * var12;
                        this.field1040 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method986(arg0, var9, var6, var10, var4.field1228[this.field1047]);
                        if (this.field1053 < var6) {
                            return;
                        }
                        int var13 = (this.field1053 - var5) / var8;
                        if (var13 >= this.field1040) {
                            this.field1053 -= this.field1040 * var8;
                            this.field1040 = 0;
                            break;
                        }
                        this.field1053 -= var8 * var13;
                        this.field1040 -= var13;
                    }
                }
            }
            if (this.field1046 < 0) {
                this.method969(arg0, var9, 0, var10, 0);
                if (this.field1053 < 0) {
                    this.field1053 = -1;
                    this.method1050();
                    this.method3360();
                }
            } else {
                this.method986(arg0, var9, var7, var10, 0);
                if (this.field1053 >= var7) {
                    this.field1053 = var7;
                    this.method1050();
                    this.method3360();
                }
            }
        } else if (this.field1049) {
            if (this.field1046 < 0) {
                var9 = this.method969(arg0, arg1, var5, var10, var4.field1228[this.field1047]);
                if (this.field1053 >= var5) {
                    return;
                }
                this.field1053 = var5 + var5 - 1 - this.field1053;
                this.field1046 = -this.field1046;
            }
            while (true) {
                int var11 = this.method986(arg0, var9, var6, var10, var4.field1228[this.field1043 - 1]);
                if (this.field1053 < var6) {
                    return;
                }
                this.field1053 = var6 + var6 - 1 - this.field1053;
                this.field1046 = -this.field1046;
                var9 = this.method969(arg0, var11, var5, var10, var4.field1228[this.field1047]);
                if (this.field1053 >= var5) {
                    return;
                }
                this.field1053 = var5 + var5 - 1 - this.field1053;
                this.field1046 = -this.field1046;
            }
        } else if (this.field1046 < 0) {
            while (true) {
                var9 = this.method969(arg0, var9, var5, var10, var4.field1228[this.field1043 - 1]);
                if (this.field1053 >= var5) {
                    return;
                }
                this.field1053 = var6 - 1 - (var6 - 1 - this.field1053) % var8;
            }
        } else {
            while (true) {
                var9 = this.method986(arg0, var9, var6, var10, var4.field1228[this.field1047]);
                if (this.field1053 < var6) {
                    return;
                }
                this.field1053 = (this.field1053 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("aw.ar(I)V")
    public synchronized void method967(int arg0) {
        if (this.field1050 > 0) {
            if (arg0 >= this.field1050) {
                if (this.field1041 == Integer.MIN_VALUE) {
                    this.field1041 = 0;
                    this.field1045 = 0;
                    this.field1048 = 0;
                    this.field1039 = 0;
                    this.method3360();
                    arg0 = this.field1050;
                }
                this.field1050 = 0;
                this.method1034();
            } else {
                this.field1039 += this.field1051 * arg0;
                this.field1048 += this.field1052 * arg0;
                this.field1045 += this.field1044 * arg0;
                this.field1050 -= arg0;
            }
        }
        class63 var2 = (class63) this.field1059;
        int var3 = this.field1047 << 8;
        int var4 = this.field1043 << 8;
        int var5 = var2.field1228.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1040 = 0;
        }
        if (this.field1053 < 0) {
            if (this.field1046 <= 0) {
                this.method1050();
                this.method3360();
                return;
            }
            this.field1053 = 0;
        }
        if (this.field1053 >= var5) {
            if (this.field1046 >= 0) {
                this.method1050();
                this.method3360();
                return;
            }
            this.field1053 = var5 - 1;
        }
        this.field1053 += this.field1046 * arg0;
        if (this.field1040 >= 0) {
            if (this.field1040 > 0) {
                if (this.field1049) {
                    label121: {
                        if (this.field1046 < 0) {
                            if (this.field1053 >= var3) {
                                return;
                            }
                            this.field1053 = var3 + var3 - 1 - this.field1053;
                            this.field1046 = -this.field1046;
                            if (--this.field1040 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1053 < var4) {
                                return;
                            }
                            this.field1053 = var4 + var4 - 1 - this.field1053;
                            this.field1046 = -this.field1046;
                            if (--this.field1040 == 0) {
                                break;
                            }
                            if (this.field1053 >= var3) {
                                return;
                            }
                            this.field1053 = var3 + var3 - 1 - this.field1053;
                            this.field1046 = -this.field1046;
                        } while (--this.field1040 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1046 < 0) {
                            if (this.field1053 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1053) / var6;
                            if (var7 >= this.field1040) {
                                this.field1053 += this.field1040 * var6;
                                this.field1040 = 0;
                                break label153;
                            }
                            this.field1053 += var6 * var7;
                            this.field1040 -= var7;
                        } else if (this.field1053 >= var4) {
                            int var8 = (this.field1053 - var3) / var6;
                            if (var8 >= this.field1040) {
                                this.field1053 -= this.field1040 * var6;
                                this.field1040 = 0;
                                break label153;
                            }
                            this.field1053 -= var6 * var8;
                            this.field1040 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1046 < 0) {
                if (this.field1053 < 0) {
                    this.field1053 = -1;
                    this.method1050();
                    this.method3360();
                }
            } else if (this.field1053 >= var5) {
                this.field1053 = var5;
                this.method1050();
                this.method3360();
            }
        } else if (this.field1049) {
            if (this.field1046 < 0) {
                if (this.field1053 >= var3) {
                    return;
                }
                this.field1053 = var3 + var3 - 1 - this.field1053;
                this.field1046 = -this.field1046;
            }
            while (this.field1053 >= var4) {
                this.field1053 = var4 + var4 - 1 - this.field1053;
                this.field1046 = -this.field1046;
                if (this.field1053 >= var3) {
                    return;
                }
                this.field1053 = var3 + var3 - 1 - this.field1053;
                this.field1046 = -this.field1046;
            }
        } else if (this.field1046 < 0) {
            if (this.field1053 >= var3) {
                return;
            }
            this.field1053 = var4 - 1 - (var4 - 1 - this.field1053) % var6;
        } else if (this.field1053 >= var4) {
            this.field1053 = (this.field1053 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("aw.au([IIIII)I")
    public int method986(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1050 > 0) {
                int var6 = this.field1050 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1050 += arg1;
                if (this.field1046 == 256 && (this.field1053 & 0xFF) == 0) {
                    if (Statics.field1731) {
                        arg1 = method1023(0, ((class63) this.field1059).field1228, arg0, this.field1053, arg1, this.field1048, this.field1045, this.field1052, this.field1044, 0, var6, arg2, this);
                    } else {
                        arg1 = method979(((class63) this.field1059).field1228, arg0, this.field1053, arg1, this.field1039, this.field1051, 0, var6, arg2, this);
                    }
                } else if (Statics.field1731) {
                    arg1 = method984(0, 0, ((class63) this.field1059).field1228, arg0, this.field1053, arg1, this.field1048, this.field1045, this.field1052, this.field1044, 0, var6, arg2, this, this.field1046, arg4);
                } else {
                    arg1 = method983(0, 0, ((class63) this.field1059).field1228, arg0, this.field1053, arg1, this.field1039, this.field1051, 0, var6, arg2, this, this.field1046, arg4);
                }
                this.field1050 -= arg1;
                if (this.field1050 != 0) {
                    return arg1;
                }
                if (!this.method944()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1046 == 256 && (this.field1053 & 0xFF) == 0) {
                if (Statics.field1731) {
                    return method1032(0, ((class63) this.field1059).field1228, arg0, this.field1053, arg1, this.field1048, this.field1045, 0, arg3, arg2, this);
                }
                return method1053(((class63) this.field1059).field1228, arg0, this.field1053, arg1, this.field1039, 0, arg3, arg2, this);
            }
            if (Statics.field1731) {
                return method976(0, 0, ((class63) this.field1059).field1228, arg0, this.field1053, arg1, this.field1048, this.field1045, 0, arg3, arg2, this, this.field1046, arg4);
            }
            return method975(0, 0, ((class63) this.field1059).field1228, arg0, this.field1053, arg1, this.field1039, 0, arg3, arg2, this, this.field1046, arg4);
        }
    }

    @ObfuscatedName("aw.an([IIIII)I")
    public int method969(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1050 > 0) {
                int var6 = this.field1050 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1050 += arg1;
                if (this.field1046 == -256 && (this.field1053 & 0xFF) == 0) {
                    if (Statics.field1731) {
                        arg1 = method1088(0, ((class63) this.field1059).field1228, arg0, this.field1053, arg1, this.field1048, this.field1045, this.field1052, this.field1044, 0, var6, arg2, this);
                    } else {
                        arg1 = method1082(((class63) this.field1059).field1228, arg0, this.field1053, arg1, this.field1039, this.field1051, 0, var6, arg2, this);
                    }
                } else if (Statics.field1731) {
                    arg1 = method1005(0, 0, ((class63) this.field1059).field1228, arg0, this.field1053, arg1, this.field1048, this.field1045, this.field1052, this.field1044, 0, var6, arg2, this, this.field1046, arg4);
                } else {
                    arg1 = method972(0, 0, ((class63) this.field1059).field1228, arg0, this.field1053, arg1, this.field1039, this.field1051, 0, var6, arg2, this, this.field1046, arg4);
                }
                this.field1050 -= arg1;
                if (this.field1050 != 0) {
                    return arg1;
                }
                if (!this.method944()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1046 == -256 && (this.field1053 & 0xFF) == 0) {
                if (Statics.field1731) {
                    return method974(0, ((class63) this.field1059).field1228, arg0, this.field1053, arg1, this.field1048, this.field1045, 0, arg3, arg2, this);
                }
                return method973(((class63) this.field1059).field1228, arg0, this.field1053, arg1, this.field1039, 0, arg3, arg2, this);
            }
            if (Statics.field1731) {
                return method978(0, 0, ((class63) this.field1059).field1228, arg0, this.field1053, arg1, this.field1048, this.field1045, 0, arg3, arg2, this, this.field1046, arg4);
            }
            return method977(0, 0, ((class63) this.field1059).field1228, arg0, this.field1053, arg1, this.field1039, 0, arg3, arg2, this, this.field1046, arg4);
        }
    }

    @ObfuscatedName("aw.ad()Z")
    public boolean method944() {
        int var1 = this.field1041;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1063(var1, this.field1042);
            var2 = method1074(var1, this.field1042);
        }
        if (this.field1039 != var1 || this.field1048 != var3 || this.field1045 != var2) {
            if (this.field1039 < var1) {
                this.field1051 = 1;
                this.field1050 = var1 - this.field1039;
            } else if (this.field1039 > var1) {
                this.field1051 = -1;
                this.field1050 = this.field1039 - var1;
            } else {
                this.field1051 = 0;
            }
            if (this.field1048 < var3) {
                this.field1052 = 1;
                if (this.field1050 == 0 || this.field1050 > var3 - this.field1048) {
                    this.field1050 = var3 - this.field1048;
                }
            } else if (this.field1048 > var3) {
                this.field1052 = -1;
                if (this.field1050 == 0 || this.field1050 > this.field1048 - var3) {
                    this.field1050 = this.field1048 - var3;
                }
            } else {
                this.field1052 = 0;
            }
            if (this.field1045 < var2) {
                this.field1044 = 1;
                if (this.field1050 == 0 || this.field1050 > var2 - this.field1045) {
                    this.field1050 = var2 - this.field1045;
                }
            } else if (this.field1045 > var2) {
                this.field1044 = -1;
                if (this.field1050 == 0 || this.field1050 > this.field1045 - var2) {
                    this.field1050 = this.field1045 - var2;
                }
            } else {
                this.field1044 = 0;
            }
            return false;
        } else if (this.field1041 == Integer.MIN_VALUE) {
            this.field1041 = 0;
            this.field1045 = 0;
            this.field1048 = 0;
            this.field1039 = 0;
            this.method3360();
            return true;
        } else {
            this.method1034();
            return false;
        }
    }

    @ObfuscatedName("aw.at([B[IIIIIIILaw;)I")
    public static int method1053(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field1053 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("aw.ay(I[B[IIIIIIIILaw;)I")
    public static int method1032(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field1053 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("aw.ac([B[IIIIIIILaw;)I")
    public static int method973(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field1053 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("aw.av(I[B[IIIIIIIILaw;)I")
    public static int method974(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field1053 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("aw.ae(II[B[IIIIIIILaw;II)I")
    public static int method975(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field1053 = arg4;
        return arg5;
    }

    @ObfuscatedName("aw.ah(II[B[IIIIIIIILaw;II)I")
    public static int method976(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field1053 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("aw.aq(II[B[IIIIIIILaw;II)I")
    public static int method977(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field1053 = arg4;
        return arg5;
    }

    @ObfuscatedName("aw.ax(II[B[IIIIIIIILaw;II)I")
    public static int method978(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field1053 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("aw.am([B[IIIIIIIILaw;)I")
    public static int method979(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1048 += (var14 - arg3) * arg9.field1052;
        arg9.field1045 += (var14 - arg3) * arg9.field1044;
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
        arg9.field1039 = var12 >> 2;
        arg9.field1053 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("aw.af(I[B[IIIIIIIIIILaw;)I")
    public static int method1023(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1039 += (var19 - arg4) * arg12.field1051;
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
        arg12.field1048 = var15 >> 2;
        arg12.field1045 = var16 >> 2;
        arg12.field1053 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("aw.ao([B[IIIIIIIILaw;)I")
    public static int method1082(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1048 += (var14 - arg3) * arg9.field1052;
        arg9.field1045 += (var14 - arg3) * arg9.field1044;
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
        arg9.field1039 = var12 >> 2;
        arg9.field1053 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("aw.ab(I[B[IIIIIIIIIILaw;)I")
    public static int method1088(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field1039 += (var19 - arg4) * arg12.field1051;
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
        arg12.field1048 = var15 >> 2;
        arg12.field1045 = var16 >> 2;
        arg12.field1053 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("aw.aj(II[B[IIIIIIIILaw;II)I")
    public static int method983(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1048 -= arg11.field1052 * arg5;
        arg11.field1045 -= arg11.field1044 * arg5;
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
        arg11.field1048 += arg11.field1052 * arg5;
        arg11.field1045 += arg11.field1044 * arg5;
        arg11.field1039 = arg6;
        arg11.field1053 = arg4;
        return arg5;
    }

    @ObfuscatedName("aw.ag(II[B[IIIIIIIIIILaw;II)I")
    public static int method984(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1039 -= arg13.field1051 * arg5;
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
        arg13.field1039 += arg13.field1051 * var27;
        arg13.field1048 = arg6;
        arg13.field1045 = arg7;
        arg13.field1053 = arg4;
        return var27;
    }

    @ObfuscatedName("aw.aw(II[B[IIIIIIIILaw;II)I")
    public static int method972(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field1048 -= arg11.field1052 * arg5;
        arg11.field1045 -= arg11.field1044 * arg5;
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
        arg11.field1048 += arg11.field1052 * arg5;
        arg11.field1045 += arg11.field1044 * arg5;
        arg11.field1039 = arg6;
        arg11.field1053 = arg4;
        return arg5;
    }

    @ObfuscatedName("aw.az(II[B[IIIIIIIIIILaw;II)I")
    public static int method1005(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field1039 -= arg13.field1051 * arg5;
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
        arg13.field1039 += arg13.field1051 * var26;
        arg13.field1048 = arg6;
        arg13.field1045 = arg7;
        arg13.field1053 = arg4;
        return var26;
    }
}
