package deob;

@ObfuscatedName("ay")
public class class44 extends class47 {

    @ObfuscatedName("ay.u")
    public int field1048;

    @ObfuscatedName("ay.k")
    public int field1045;

    @ObfuscatedName("ay.x")
    public int field1038;

    @ObfuscatedName("ay.m")
    public int field1040;

    @ObfuscatedName("ay.n")
    public int field1041;

    @ObfuscatedName("ay.q")
    public int field1042;

    @ObfuscatedName("ay.a")
    public int field1037;

    @ObfuscatedName("ay.g")
    public int field1044;

    @ObfuscatedName("ay.j")
    public int field1043;

    @ObfuscatedName("ay.l")
    public int field1051;

    @ObfuscatedName("ay.z")
    public boolean field1047;

    @ObfuscatedName("ay.e")
    public int field1039;

    @ObfuscatedName("ay.b")
    public int field1049;

    @ObfuscatedName("ay.c")
    public int field1050;

    @ObfuscatedName("ay.d")
    public int field1046;

    @ObfuscatedName("ay.u(II)I")
    public static int method1060(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ay.k(II)I")
    public static int method942(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ay.x()I")
    public int method969() {
        int var1 = this.field1041 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1044 == 0) {
            var2 -= this.field1048 * var2 / (((class62) this.field1059).field1224.length << 8);
        } else if (this.field1044 >= 0) {
            var2 -= this.field1043 * var2 / ((class62) this.field1059).field1224.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class44(class62 arg0, int arg1, int arg2) {
        this.field1059 = arg0;
        this.field1043 = arg0.field1223;
        this.field1051 = arg0.field1225;
        this.field1047 = arg0.field1226;
        this.field1045 = arg1;
        this.field1038 = arg2;
        this.field1040 = 8192;
        this.field1048 = 0;
        this.method947();
    }

    public class44(class62 arg0, int arg1, int arg2, int arg3) {
        this.field1059 = arg0;
        this.field1043 = arg0.field1223;
        this.field1051 = arg0.field1225;
        this.field1047 = arg0.field1226;
        this.field1045 = arg1;
        this.field1038 = arg2;
        this.field1040 = arg3;
        this.field1048 = 0;
        this.method947();
    }

    @ObfuscatedName("ay.m(Lbp;II)Lay;")
    public static class44 method945(class62 arg0, int arg1, int arg2) {
        return arg0.field1224 == null || arg0.field1224.length == 0 ? null : new class44(arg0, (int) ((long) arg0.field1222 * 256L * (long) arg1 / (long) (Statics.field1083 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ay.n(Lbp;III)Lay;")
    public static class44 method946(class62 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1224 == null || arg0.field1224.length == 0 ? null : new class44(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ay.q()V")
    public void method947() {
        this.field1041 = this.field1038;
        this.field1042 = method1060(this.field1038, this.field1040);
        this.field1037 = method942(this.field1038, this.field1040);
    }

    @ObfuscatedName("ay.a(I)V")
    public synchronized void method948(int arg0) {
        this.field1044 = arg0;
    }

    @ObfuscatedName("ay.g(I)V")
    public synchronized void method949(int arg0) {
        this.method1032(arg0 << 6, this.method953());
    }

    @ObfuscatedName("ay.j(I)V")
    public synchronized void method950(int arg0) {
        this.method1032(arg0, this.method953());
    }

    @ObfuscatedName("ay.l(II)V")
    public synchronized void method1032(int arg0, int arg1) {
        this.field1038 = arg0;
        this.field1040 = arg1;
        this.field1039 = 0;
        this.method947();
    }

    @ObfuscatedName("ay.w()I")
    public synchronized int method1000() {
        return this.field1038 == Integer.MIN_VALUE ? 0 : this.field1038;
    }

    @ObfuscatedName("ay.z()I")
    public synchronized int method953() {
        return this.field1040 < 0 ? -1 : this.field1040;
    }

    @ObfuscatedName("ay.e(I)V")
    public synchronized void method954(int arg0) {
        int var2 = ((class62) this.field1059).field1224.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1048 = arg0;
    }

    @ObfuscatedName("ay.b(Z)V")
    public synchronized void method955(boolean arg0) {
        this.field1045 = (this.field1045 >>> 31) + (this.field1045 ^ this.field1045 >> 31);
        if (arg0) {
            this.field1045 = -this.field1045;
        }
    }

    @ObfuscatedName("ay.c()V")
    public void method1090() {
        if (this.field1039 == 0) {
            return;
        }
        if (this.field1038 == Integer.MIN_VALUE) {
            this.field1038 = 0;
        }
        this.field1039 = 0;
        this.method947();
    }

    @ObfuscatedName("ay.d(II)V")
    public synchronized void method957(int arg0, int arg1) {
        this.method1037(arg0, arg1, this.method953());
    }

    @ObfuscatedName("ay.h(III)V")
    public synchronized void method1037(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1032(arg1, arg2);
            return;
        }
        int var4 = method1060(arg1, arg2);
        int var5 = method942(arg1, arg2);
        if (this.field1042 == var4 && this.field1037 == var5) {
            this.field1039 = 0;
            return;
        }
        int var6 = arg1 - this.field1041;
        if (this.field1041 - arg1 > var6) {
            var6 = this.field1041 - arg1;
        }
        if (var4 - this.field1042 > var6) {
            var6 = var4 - this.field1042;
        }
        if (this.field1042 - var4 > var6) {
            var6 = this.field1042 - var4;
        }
        if (var5 - this.field1037 > var6) {
            var6 = var5 - this.field1037;
        }
        if (this.field1037 - var5 > var6) {
            var6 = this.field1037 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1039 = arg0;
        this.field1038 = arg1;
        this.field1040 = arg2;
        this.field1049 = (arg1 - this.field1041) / arg0;
        this.field1050 = (var4 - this.field1042) / arg0;
        this.field1046 = (var5 - this.field1037) / arg0;
    }

    @ObfuscatedName("ay.i(I)V")
    public synchronized void method959(int arg0) {
        if (arg0 == 0) {
            this.method950(0);
            this.method3357();
        } else if (this.field1042 == 0 && this.field1037 == 0) {
            this.field1039 = 0;
            this.field1038 = 0;
            this.field1041 = 0;
            this.method3357();
        } else {
            int var2 = -this.field1041;
            if (this.field1041 > var2) {
                var2 = this.field1041;
            }
            if (-this.field1042 > var2) {
                var2 = -this.field1042;
            }
            if (this.field1042 > var2) {
                var2 = this.field1042;
            }
            if (-this.field1037 > var2) {
                var2 = -this.field1037;
            }
            if (this.field1037 > var2) {
                var2 = this.field1037;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1039 = arg0;
            this.field1038 = Integer.MIN_VALUE;
            this.field1049 = -this.field1041 / arg0;
            this.field1050 = -this.field1042 / arg0;
            this.field1046 = -this.field1037 / arg0;
        }
    }

    @ObfuscatedName("ay.v(I)V")
    public synchronized void method960(int arg0) {
        if (this.field1045 < 0) {
            this.field1045 = -arg0;
        } else {
            this.field1045 = arg0;
        }
    }

    @ObfuscatedName("ay.s()I")
    public synchronized int method961() {
        return this.field1045 < 0 ? -this.field1045 : this.field1045;
    }

    @ObfuscatedName("ay.f()Z")
    public boolean method962() {
        return this.field1048 < 0 || this.field1048 >= ((class62) this.field1059).field1224.length << 8;
    }

    @ObfuscatedName("ay.y()Z")
    public boolean method963() {
        return this.field1039 != 0;
    }

    @ObfuscatedName("ay.t()Lac;")
    public class47 method964() {
        return null;
    }

    @ObfuscatedName("ay.r()Lac;")
    public class47 method970() {
        return null;
    }

    @ObfuscatedName("ay.p()I")
    public int method1056() {
        return this.field1038 == 0 && this.field1039 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ay.o([III)V")
    public synchronized void method1066(int[] arg0, int arg1, int arg2) {
        if (this.field1038 == 0 && this.field1039 == 0) {
            this.method968(arg2);
            return;
        }
        class62 var4 = (class62) this.field1059;
        int var5 = this.field1043 << 8;
        int var6 = this.field1051 << 8;
        int var7 = var4.field1224.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1044 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1048 < 0) {
            if (this.field1045 <= 0) {
                this.method1090();
                this.method3357();
                return;
            }
            this.field1048 = 0;
        }
        if (this.field1048 >= var7) {
            if (this.field1045 >= 0) {
                this.method1090();
                this.method3357();
                return;
            }
            this.field1048 = var7 - 1;
        }
        if (this.field1044 >= 0) {
            if (this.field1044 > 0) {
                if (this.field1047) {
                    label131: {
                        if (this.field1045 < 0) {
                            var9 = this.method999(arg0, arg1, var5, var10, var4.field1224[this.field1043]);
                            if (this.field1048 >= var5) {
                                return;
                            }
                            this.field1048 = var5 + var5 - 1 - this.field1048;
                            this.field1045 = -this.field1045;
                            if (--this.field1044 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1035(arg0, var9, var6, var10, var4.field1224[this.field1051 - 1]);
                            if (this.field1048 < var6) {
                                return;
                            }
                            this.field1048 = var6 + var6 - 1 - this.field1048;
                            this.field1045 = -this.field1045;
                            if (--this.field1044 == 0) {
                                break;
                            }
                            var9 = this.method999(arg0, var9, var5, var10, var4.field1224[this.field1043]);
                            if (this.field1048 >= var5) {
                                return;
                            }
                            this.field1048 = var5 + var5 - 1 - this.field1048;
                            this.field1045 = -this.field1045;
                        } while (--this.field1044 != 0);
                    }
                } else if (this.field1045 < 0) {
                    while (true) {
                        var9 = this.method999(arg0, var9, var5, var10, var4.field1224[this.field1051 - 1]);
                        if (this.field1048 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1048) / var8;
                        if (var12 >= this.field1044) {
                            this.field1048 += this.field1044 * var8;
                            this.field1044 = 0;
                            break;
                        }
                        this.field1048 += var8 * var12;
                        this.field1044 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1035(arg0, var9, var6, var10, var4.field1224[this.field1043]);
                        if (this.field1048 < var6) {
                            return;
                        }
                        int var13 = (this.field1048 - var5) / var8;
                        if (var13 >= this.field1044) {
                            this.field1048 -= this.field1044 * var8;
                            this.field1044 = 0;
                            break;
                        }
                        this.field1048 -= var8 * var13;
                        this.field1044 -= var13;
                    }
                }
            }
            if (this.field1045 < 0) {
                this.method999(arg0, var9, 0, var10, 0);
                if (this.field1048 < 0) {
                    this.field1048 = -1;
                    this.method1090();
                    this.method3357();
                }
            } else {
                this.method1035(arg0, var9, var7, var10, 0);
                if (this.field1048 >= var7) {
                    this.field1048 = var7;
                    this.method1090();
                    this.method3357();
                }
            }
        } else if (this.field1047) {
            if (this.field1045 < 0) {
                var9 = this.method999(arg0, arg1, var5, var10, var4.field1224[this.field1043]);
                if (this.field1048 >= var5) {
                    return;
                }
                this.field1048 = var5 + var5 - 1 - this.field1048;
                this.field1045 = -this.field1045;
            }
            while (true) {
                int var11 = this.method1035(arg0, var9, var6, var10, var4.field1224[this.field1051 - 1]);
                if (this.field1048 < var6) {
                    return;
                }
                this.field1048 = var6 + var6 - 1 - this.field1048;
                this.field1045 = -this.field1045;
                var9 = this.method999(arg0, var11, var5, var10, var4.field1224[this.field1043]);
                if (this.field1048 >= var5) {
                    return;
                }
                this.field1048 = var5 + var5 - 1 - this.field1048;
                this.field1045 = -this.field1045;
            }
        } else if (this.field1045 < 0) {
            while (true) {
                var9 = this.method999(arg0, var9, var5, var10, var4.field1224[this.field1051 - 1]);
                if (this.field1048 >= var5) {
                    return;
                }
                this.field1048 = var6 - 1 - (var6 - 1 - this.field1048) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1035(arg0, var9, var6, var10, var4.field1224[this.field1043]);
                if (this.field1048 < var6) {
                    return;
                }
                this.field1048 = (this.field1048 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ay.ax(I)V")
    public synchronized void method968(int arg0) {
        if (this.field1039 > 0) {
            if (arg0 >= this.field1039) {
                if (this.field1038 == Integer.MIN_VALUE) {
                    this.field1038 = 0;
                    this.field1037 = 0;
                    this.field1042 = 0;
                    this.field1041 = 0;
                    this.method3357();
                    arg0 = this.field1039;
                }
                this.field1039 = 0;
                this.method947();
            } else {
                this.field1041 += this.field1049 * arg0;
                this.field1042 += this.field1050 * arg0;
                this.field1037 += this.field1046 * arg0;
                this.field1039 -= arg0;
            }
        }
        class62 var2 = (class62) this.field1059;
        int var3 = this.field1043 << 8;
        int var4 = this.field1051 << 8;
        int var5 = var2.field1224.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1044 = 0;
        }
        if (this.field1048 < 0) {
            if (this.field1045 <= 0) {
                this.method1090();
                this.method3357();
                return;
            }
            this.field1048 = 0;
        }
        if (this.field1048 >= var5) {
            if (this.field1045 >= 0) {
                this.method1090();
                this.method3357();
                return;
            }
            this.field1048 = var5 - 1;
        }
        this.field1048 += this.field1045 * arg0;
        if (this.field1044 >= 0) {
            if (this.field1044 > 0) {
                if (this.field1047) {
                    label121: {
                        if (this.field1045 < 0) {
                            if (this.field1048 >= var3) {
                                return;
                            }
                            this.field1048 = var3 + var3 - 1 - this.field1048;
                            this.field1045 = -this.field1045;
                            if (--this.field1044 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1048 < var4) {
                                return;
                            }
                            this.field1048 = var4 + var4 - 1 - this.field1048;
                            this.field1045 = -this.field1045;
                            if (--this.field1044 == 0) {
                                break;
                            }
                            if (this.field1048 >= var3) {
                                return;
                            }
                            this.field1048 = var3 + var3 - 1 - this.field1048;
                            this.field1045 = -this.field1045;
                        } while (--this.field1044 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1045 < 0) {
                            if (this.field1048 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1048) / var6;
                            if (var7 >= this.field1044) {
                                this.field1048 += this.field1044 * var6;
                                this.field1044 = 0;
                                break label153;
                            }
                            this.field1048 += var6 * var7;
                            this.field1044 -= var7;
                        } else if (this.field1048 >= var4) {
                            int var8 = (this.field1048 - var3) / var6;
                            if (var8 >= this.field1044) {
                                this.field1048 -= this.field1044 * var6;
                                this.field1044 = 0;
                                break label153;
                            }
                            this.field1048 -= var6 * var8;
                            this.field1044 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1045 < 0) {
                if (this.field1048 < 0) {
                    this.field1048 = -1;
                    this.method1090();
                    this.method3357();
                }
            } else if (this.field1048 >= var5) {
                this.field1048 = var5;
                this.method1090();
                this.method3357();
            }
        } else if (this.field1047) {
            if (this.field1045 < 0) {
                if (this.field1048 >= var3) {
                    return;
                }
                this.field1048 = var3 + var3 - 1 - this.field1048;
                this.field1045 = -this.field1045;
            }
            while (this.field1048 >= var4) {
                this.field1048 = var4 + var4 - 1 - this.field1048;
                this.field1045 = -this.field1045;
                if (this.field1048 >= var3) {
                    return;
                }
                this.field1048 = var3 + var3 - 1 - this.field1048;
                this.field1045 = -this.field1045;
            }
        } else if (this.field1045 < 0) {
            if (this.field1048 >= var3) {
                return;
            }
            this.field1048 = var4 - 1 - (var4 - 1 - this.field1048) % var6;
        } else if (this.field1048 >= var4) {
            this.field1048 = (this.field1048 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ay.aa([IIIII)I")
    public int method1035(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1039 > 0) {
                int var6 = this.field1039 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1039 += arg1;
                if (this.field1045 == 256 && (this.field1048 & 0xFF) == 0) {
                    if (Statics.field1091) {
                        arg1 = method981(0, ((class62) this.field1059).field1224, arg0, this.field1048, arg1, this.field1042, this.field1037, this.field1050, this.field1046, 0, var6, arg2, this);
                    } else {
                        arg1 = method1045(((class62) this.field1059).field1224, arg0, this.field1048, arg1, this.field1041, this.field1049, 0, var6, arg2, this);
                    }
                } else if (Statics.field1091) {
                    arg1 = method1009(0, 0, ((class62) this.field1059).field1224, arg0, this.field1048, arg1, this.field1042, this.field1037, this.field1050, this.field1046, 0, var6, arg2, this, this.field1045, arg4);
                } else {
                    arg1 = method984(0, 0, ((class62) this.field1059).field1224, arg0, this.field1048, arg1, this.field1041, this.field1049, 0, var6, arg2, this, this.field1045, arg4);
                }
                this.field1039 -= arg1;
                if (this.field1039 != 0) {
                    return arg1;
                }
                if (!this.method967()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1045 == 256 && (this.field1048 & 0xFF) == 0) {
                if (Statics.field1091) {
                    return method973(0, ((class62) this.field1059).field1224, arg0, this.field1048, arg1, this.field1042, this.field1037, 0, arg3, arg2, this);
                }
                return method1077(((class62) this.field1059).field1224, arg0, this.field1048, arg1, this.field1041, 0, arg3, arg2, this);
            }
            if (Statics.field1091) {
                return method977(0, 0, ((class62) this.field1059).field1224, arg0, this.field1048, arg1, this.field1042, this.field1037, 0, arg3, arg2, this, this.field1045, arg4);
            }
            return method1049(0, 0, ((class62) this.field1059).field1224, arg0, this.field1048, arg1, this.field1041, 0, arg3, arg2, this, this.field1045, arg4);
        }
    }

    @ObfuscatedName("ay.af([IIIII)I")
    public int method999(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1039 > 0) {
                int var6 = this.field1039 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1039 += arg1;
                if (this.field1045 == -256 && (this.field1048 & 0xFF) == 0) {
                    if (Statics.field1091) {
                        arg1 = method1075(0, ((class62) this.field1059).field1224, arg0, this.field1048, arg1, this.field1042, this.field1037, this.field1050, this.field1046, 0, var6, arg2, this);
                    } else {
                        arg1 = method958(((class62) this.field1059).field1224, arg0, this.field1048, arg1, this.field1041, this.field1049, 0, var6, arg2, this);
                    }
                } else if (Statics.field1091) {
                    arg1 = method986(0, 0, ((class62) this.field1059).field1224, arg0, this.field1048, arg1, this.field1042, this.field1037, this.field1050, this.field1046, 0, var6, arg2, this, this.field1045, arg4);
                } else {
                    arg1 = method985(0, 0, ((class62) this.field1059).field1224, arg0, this.field1048, arg1, this.field1041, this.field1049, 0, var6, arg2, this, this.field1045, arg4);
                }
                this.field1039 -= arg1;
                if (this.field1039 != 0) {
                    return arg1;
                }
                if (!this.method967()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1045 == -256 && (this.field1048 & 0xFF) == 0) {
                if (Statics.field1091) {
                    return method1074(0, ((class62) this.field1059).field1224, arg0, this.field1048, arg1, this.field1042, this.field1037, 0, arg3, arg2, this);
                }
                return method974(((class62) this.field1059).field1224, arg0, this.field1048, arg1, this.field1041, 0, arg3, arg2, this);
            }
            if (Statics.field1091) {
                return method979(0, 0, ((class62) this.field1059).field1224, arg0, this.field1048, arg1, this.field1042, this.field1037, 0, arg3, arg2, this, this.field1045, arg4);
            }
            return method978(0, 0, ((class62) this.field1059).field1224, arg0, this.field1048, arg1, this.field1041, 0, arg3, arg2, this, this.field1045, arg4);
        }
    }

    @ObfuscatedName("ay.al()Z")
    public boolean method967() {
        int var1 = this.field1038;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1060(var1, this.field1040);
            var2 = method942(var1, this.field1040);
        }
        if (this.field1041 != var1 || this.field1042 != var3 || this.field1037 != var2) {
            if (this.field1041 < var1) {
                this.field1049 = 1;
                this.field1039 = var1 - this.field1041;
            } else if (this.field1041 > var1) {
                this.field1049 = -1;
                this.field1039 = this.field1041 - var1;
            } else {
                this.field1049 = 0;
            }
            if (this.field1042 < var3) {
                this.field1050 = 1;
                if (this.field1039 == 0 || this.field1039 > var3 - this.field1042) {
                    this.field1039 = var3 - this.field1042;
                }
            } else if (this.field1042 > var3) {
                this.field1050 = -1;
                if (this.field1039 == 0 || this.field1039 > this.field1042 - var3) {
                    this.field1039 = this.field1042 - var3;
                }
            } else {
                this.field1050 = 0;
            }
            if (this.field1037 < var2) {
                this.field1046 = 1;
                if (this.field1039 == 0 || this.field1039 > var2 - this.field1037) {
                    this.field1039 = var2 - this.field1037;
                }
            } else if (this.field1037 > var2) {
                this.field1046 = -1;
                if (this.field1039 == 0 || this.field1039 > this.field1037 - var2) {
                    this.field1039 = this.field1037 - var2;
                }
            } else {
                this.field1046 = 0;
            }
            return false;
        } else if (this.field1038 == Integer.MIN_VALUE) {
            this.field1038 = 0;
            this.field1037 = 0;
            this.field1042 = 0;
            this.field1041 = 0;
            this.method3357();
            return true;
        } else {
            this.method947();
            return false;
        }
    }

    @ObfuscatedName("ay.av([B[IIIIIIILay;)I")
    public static int method1077(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class44 arg8) {
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
        arg8.field1048 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ay.ab(I[B[IIIIIIIILay;)I")
    public static int method973(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10) {
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
        arg10.field1048 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ay.ad([B[IIIIIIILay;)I")
    public static int method974(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class44 arg8) {
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
        arg8.field1048 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ay.ai(I[B[IIIIIIIILay;)I")
    public static int method1074(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10) {
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
        arg10.field1048 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ay.ak(II[B[IIIIIIILay;II)I")
    public static int method1049(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10, int arg11, int arg12) {
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
        arg10.field1048 = arg4;
        return arg5;
    }

    @ObfuscatedName("ay.ao(II[B[IIIIIIIILay;II)I")
    public static int method977(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
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
        arg11.field1048 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ay.aq(II[B[IIIIIIILay;II)I")
    public static int method978(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class44 arg10, int arg11, int arg12) {
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
        arg10.field1048 = arg4;
        return arg5;
    }

    @ObfuscatedName("ay.aj(II[B[IIIIIIIILay;II)I")
    public static int method979(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
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
        arg11.field1048 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ay.ag([B[IIIIIIIILay;)I")
    public static int method1045(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class44 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1042 += (var14 - arg3) * arg9.field1050;
        arg9.field1037 += (var14 - arg3) * arg9.field1046;
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
        arg9.field1041 = var12 >> 2;
        arg9.field1048 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ay.ap(I[B[IIIIIIIIIILay;)I")
    public static int method981(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class44 arg12) {
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
        arg12.field1041 += (var19 - arg4) * arg12.field1049;
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
        arg12.field1042 = var15 >> 2;
        arg12.field1037 = var16 >> 2;
        arg12.field1048 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ay.an([B[IIIIIIIILay;)I")
    public static int method958(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class44 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1042 += (var14 - arg3) * arg9.field1050;
        arg9.field1037 += (var14 - arg3) * arg9.field1046;
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
        arg9.field1041 = var12 >> 2;
        arg9.field1048 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ay.as(I[B[IIIIIIIIIILay;)I")
    public static int method1075(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class44 arg12) {
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
        arg12.field1041 += (var19 - arg4) * arg12.field1049;
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
        arg12.field1042 = var15 >> 2;
        arg12.field1037 = var16 >> 2;
        arg12.field1048 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ay.au(II[B[IIIIIIIILay;II)I")
    public static int method984(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
        arg11.field1042 -= arg11.field1050 * arg5;
        arg11.field1037 -= arg11.field1046 * arg5;
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
        arg11.field1042 += arg11.field1050 * arg5;
        arg11.field1037 += arg11.field1046 * arg5;
        arg11.field1041 = arg6;
        arg11.field1048 = arg4;
        return arg5;
    }

    @ObfuscatedName("ay.ay(II[B[IIIIIIIIIILay;II)I")
    public static int method1009(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class44 arg13, int arg14, int arg15) {
        arg13.field1041 -= arg13.field1049 * arg5;
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
        arg13.field1041 += arg13.field1049 * var27;
        arg13.field1042 = arg6;
        arg13.field1037 = arg7;
        arg13.field1048 = arg4;
        return var27;
    }

    @ObfuscatedName("ay.ah(II[B[IIIIIIIILay;II)I")
    public static int method985(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class44 arg11, int arg12, int arg13) {
        arg11.field1042 -= arg11.field1050 * arg5;
        arg11.field1037 -= arg11.field1046 * arg5;
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
        arg11.field1042 += arg11.field1050 * arg5;
        arg11.field1037 += arg11.field1046 * arg5;
        arg11.field1041 = arg6;
        arg11.field1048 = arg4;
        return arg5;
    }

    @ObfuscatedName("ay.aw(II[B[IIIIIIIIIILay;II)I")
    public static int method986(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class44 arg13, int arg14, int arg15) {
        arg13.field1041 -= arg13.field1049 * arg5;
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
        arg13.field1041 += arg13.field1049 * var26;
        arg13.field1042 = arg6;
        arg13.field1037 = arg7;
        arg13.field1048 = arg4;
        return var26;
    }
}
