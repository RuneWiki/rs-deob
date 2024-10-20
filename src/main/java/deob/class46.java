package deob;

@ObfuscatedName("aj")
public class class46 extends class49 {

    @ObfuscatedName("aj.i")
    public int field1059;

    @ObfuscatedName("aj.b")
    public int field1067;

    @ObfuscatedName("aj.r")
    public int field1066;

    @ObfuscatedName("aj.l")
    public int field1060;

    @ObfuscatedName("aj.s")
    public int field1061;

    @ObfuscatedName("aj.d")
    public int field1062;

    @ObfuscatedName("aj.e")
    public int field1063;

    @ObfuscatedName("aj.u")
    public int field1064;

    @ObfuscatedName("aj.q")
    public int field1065;

    @ObfuscatedName("aj.o")
    public int field1069;

    @ObfuscatedName("aj.v")
    public boolean field1057;

    @ObfuscatedName("aj.m")
    public int field1068;

    @ObfuscatedName("aj.x")
    public int field1058;

    @ObfuscatedName("aj.p")
    public int field1070;

    @ObfuscatedName("aj.z")
    public int field1071;

    @ObfuscatedName("aj.i(II)I")
    public static int method998(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("aj.b(II)I")
    public static int method1019(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("aj.r()I")
    public int method1016() {
        int var1 = this.field1061 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1064 == 0) {
            var2 -= this.field1059 * var2 / (((class64) this.field1079).field1243.length << 8);
        } else if (this.field1064 >= 0) {
            var2 -= this.field1065 * var2 / ((class64) this.field1079).field1243.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class46(class64 arg0, int arg1, int arg2) {
        this.field1079 = arg0;
        this.field1065 = arg0.field1241;
        this.field1069 = arg0.field1244;
        this.field1057 = arg0.field1245;
        this.field1067 = arg1;
        this.field1066 = arg2;
        this.field1060 = 8192;
        this.field1059 = 0;
        this.method959();
    }

    public class46(class64 arg0, int arg1, int arg2, int arg3) {
        this.field1079 = arg0;
        this.field1065 = arg0.field1241;
        this.field1069 = arg0.field1244;
        this.field1057 = arg0.field1245;
        this.field1067 = arg1;
        this.field1066 = arg2;
        this.field1060 = arg3;
        this.field1059 = 0;
        this.method959();
    }

    @ObfuscatedName("aj.l(Lbq;II)Laj;")
    public static class46 method957(class64 arg0, int arg1, int arg2) {
        return arg0.field1243 == null || arg0.field1243.length == 0 ? null : new class46(arg0, (int) ((long) arg0.field1242 * 256L * (long) arg1 / (long) (Statics.field2014 * 100)), arg2 << 6);
    }

    @ObfuscatedName("aj.s(Lbq;III)Laj;")
    public static class46 method958(class64 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1243 == null || arg0.field1243.length == 0 ? null : new class46(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("aj.d()V")
    public void method959() {
        this.field1061 = this.field1066;
        this.field1062 = method998(this.field1066, this.field1060);
        this.field1063 = method1019(this.field1066, this.field1060);
    }

    @ObfuscatedName("aj.e(I)V")
    public synchronized void method1033(int arg0) {
        this.field1064 = arg0;
    }

    @ObfuscatedName("aj.u(I)V")
    public synchronized void method960(int arg0) {
        this.method962(arg0 << 6, this.method1024());
    }

    @ObfuscatedName("aj.q(I)V")
    public synchronized void method961(int arg0) {
        this.method962(arg0, this.method1024());
    }

    @ObfuscatedName("aj.o(II)V")
    public synchronized void method962(int arg0, int arg1) {
        this.field1066 = arg0;
        this.field1060 = arg1;
        this.field1068 = 0;
        this.method959();
    }

    @ObfuscatedName("aj.v()I")
    public synchronized int method1000() {
        return this.field1066 == Integer.MIN_VALUE ? 0 : this.field1066;
    }

    @ObfuscatedName("aj.m()I")
    public synchronized int method1024() {
        return this.field1060 < 0 ? -1 : this.field1060;
    }

    @ObfuscatedName("aj.x(I)V")
    public synchronized void method965(int arg0) {
        int var2 = ((class64) this.field1079).field1243.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1059 = arg0;
    }

    @ObfuscatedName("aj.w(Z)V")
    public synchronized void method966(boolean arg0) {
        this.field1067 = (this.field1067 >>> 31) + (this.field1067 ^ this.field1067 >> 31);
        if (arg0) {
            this.field1067 = -this.field1067;
        }
    }

    @ObfuscatedName("aj.p()V")
    public void method967() {
        if (this.field1068 == 0) {
            return;
        }
        if (this.field1066 == Integer.MIN_VALUE) {
            this.field1066 = 0;
        }
        this.field1068 = 0;
        this.method959();
    }

    @ObfuscatedName("aj.z(II)V")
    public synchronized void method968(int arg0, int arg1) {
        this.method1027(arg0, arg1, this.method1024());
    }

    @ObfuscatedName("aj.h(III)V")
    public synchronized void method1027(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method962(arg1, arg2);
            return;
        }
        int var4 = method998(arg1, arg2);
        int var5 = method1019(arg1, arg2);
        if (this.field1062 == var4 && this.field1063 == var5) {
            this.field1068 = 0;
            return;
        }
        int var6 = arg1 - this.field1061;
        if (this.field1061 - arg1 > var6) {
            var6 = this.field1061 - arg1;
        }
        if (var4 - this.field1062 > var6) {
            var6 = var4 - this.field1062;
        }
        if (this.field1062 - var4 > var6) {
            var6 = this.field1062 - var4;
        }
        if (var5 - this.field1063 > var6) {
            var6 = var5 - this.field1063;
        }
        if (this.field1063 - var5 > var6) {
            var6 = this.field1063 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1068 = arg0;
        this.field1066 = arg1;
        this.field1060 = arg2;
        this.field1058 = (arg1 - this.field1061) / arg0;
        this.field1070 = (var4 - this.field1062) / arg0;
        this.field1071 = (var5 - this.field1063) / arg0;
    }

    @ObfuscatedName("aj.a(I)V")
    public synchronized void method970(int arg0) {
        if (arg0 == 0) {
            this.method961(0);
            this.method3363();
        } else if (this.field1062 == 0 && this.field1063 == 0) {
            this.field1068 = 0;
            this.field1066 = 0;
            this.field1061 = 0;
            this.method3363();
        } else {
            int var2 = -this.field1061;
            if (this.field1061 > var2) {
                var2 = this.field1061;
            }
            if (-this.field1062 > var2) {
                var2 = -this.field1062;
            }
            if (this.field1062 > var2) {
                var2 = this.field1062;
            }
            if (-this.field1063 > var2) {
                var2 = -this.field1063;
            }
            if (this.field1063 > var2) {
                var2 = this.field1063;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1068 = arg0;
            this.field1066 = Integer.MIN_VALUE;
            this.field1058 = -this.field1061 / arg0;
            this.field1070 = -this.field1062 / arg0;
            this.field1071 = -this.field1063 / arg0;
        }
    }

    @ObfuscatedName("aj.c(I)V")
    public synchronized void method971(int arg0) {
        if (this.field1067 < 0) {
            this.field1067 = -arg0;
        } else {
            this.field1067 = arg0;
        }
    }

    @ObfuscatedName("aj.k()I")
    public synchronized int method972() {
        return this.field1067 < 0 ? -this.field1067 : this.field1067;
    }

    @ObfuscatedName("aj.n()Z")
    public boolean method973() {
        return this.field1059 < 0 || this.field1059 >= ((class64) this.field1079).field1243.length << 8;
    }

    @ObfuscatedName("aj.t()Z")
    public boolean method986() {
        return this.field1068 != 0;
    }

    @ObfuscatedName("aj.y()Laz;")
    public class49 method969() {
        return null;
    }

    @ObfuscatedName("aj.g()Laz;")
    public class49 method1008() {
        return null;
    }

    @ObfuscatedName("aj.f()I")
    public int method1068() {
        return this.field1066 == 0 && this.field1068 == 0 ? 0 : 1;
    }

    @ObfuscatedName("aj.j([III)V")
    public synchronized void method978(int[] arg0, int arg1, int arg2) {
        if (this.field1066 == 0 && this.field1068 == 0) {
            this.method974(arg2);
            return;
        }
        class64 var4 = (class64) this.field1079;
        int var5 = this.field1065 << 8;
        int var6 = this.field1069 << 8;
        int var7 = var4.field1243.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1064 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1059 < 0) {
            if (this.field1067 <= 0) {
                this.method967();
                this.method3363();
                return;
            }
            this.field1059 = 0;
        }
        if (this.field1059 >= var7) {
            if (this.field1067 >= 0) {
                this.method967();
                this.method3363();
                return;
            }
            this.field1059 = var7 - 1;
        }
        if (this.field1064 >= 0) {
            if (this.field1064 > 0) {
                if (this.field1057) {
                    label131: {
                        if (this.field1067 < 0) {
                            var9 = this.method981(arg0, arg1, var5, var10, var4.field1243[this.field1065]);
                            if (this.field1059 >= var5) {
                                return;
                            }
                            this.field1059 = var5 + var5 - 1 - this.field1059;
                            this.field1067 = -this.field1067;
                            if (--this.field1064 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method980(arg0, var9, var6, var10, var4.field1243[this.field1069 - 1]);
                            if (this.field1059 < var6) {
                                return;
                            }
                            this.field1059 = var6 + var6 - 1 - this.field1059;
                            this.field1067 = -this.field1067;
                            if (--this.field1064 == 0) {
                                break;
                            }
                            var9 = this.method981(arg0, var9, var5, var10, var4.field1243[this.field1065]);
                            if (this.field1059 >= var5) {
                                return;
                            }
                            this.field1059 = var5 + var5 - 1 - this.field1059;
                            this.field1067 = -this.field1067;
                        } while (--this.field1064 != 0);
                    }
                } else if (this.field1067 < 0) {
                    while (true) {
                        var9 = this.method981(arg0, var9, var5, var10, var4.field1243[this.field1069 - 1]);
                        if (this.field1059 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1059) / var8;
                        if (var12 >= this.field1064) {
                            this.field1059 += this.field1064 * var8;
                            this.field1064 = 0;
                            break;
                        }
                        this.field1059 += var8 * var12;
                        this.field1064 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method980(arg0, var9, var6, var10, var4.field1243[this.field1065]);
                        if (this.field1059 < var6) {
                            return;
                        }
                        int var13 = (this.field1059 - var5) / var8;
                        if (var13 >= this.field1064) {
                            this.field1059 -= this.field1064 * var8;
                            this.field1064 = 0;
                            break;
                        }
                        this.field1059 -= var8 * var13;
                        this.field1064 -= var13;
                    }
                }
            }
            if (this.field1067 < 0) {
                this.method981(arg0, var9, 0, var10, 0);
                if (this.field1059 < 0) {
                    this.field1059 = -1;
                    this.method967();
                    this.method3363();
                }
            } else {
                this.method980(arg0, var9, var7, var10, 0);
                if (this.field1059 >= var7) {
                    this.field1059 = var7;
                    this.method967();
                    this.method3363();
                }
            }
        } else if (this.field1057) {
            if (this.field1067 < 0) {
                var9 = this.method981(arg0, arg1, var5, var10, var4.field1243[this.field1065]);
                if (this.field1059 >= var5) {
                    return;
                }
                this.field1059 = var5 + var5 - 1 - this.field1059;
                this.field1067 = -this.field1067;
            }
            while (true) {
                int var11 = this.method980(arg0, var9, var6, var10, var4.field1243[this.field1069 - 1]);
                if (this.field1059 < var6) {
                    return;
                }
                this.field1059 = var6 + var6 - 1 - this.field1059;
                this.field1067 = -this.field1067;
                var9 = this.method981(arg0, var11, var5, var10, var4.field1243[this.field1065]);
                if (this.field1059 >= var5) {
                    return;
                }
                this.field1059 = var5 + var5 - 1 - this.field1059;
                this.field1067 = -this.field1067;
            }
        } else if (this.field1067 < 0) {
            while (true) {
                var9 = this.method981(arg0, var9, var5, var10, var4.field1243[this.field1069 - 1]);
                if (this.field1059 >= var5) {
                    return;
                }
                this.field1059 = var6 - 1 - (var6 - 1 - this.field1059) % var8;
            }
        } else {
            while (true) {
                var9 = this.method980(arg0, var9, var6, var10, var4.field1243[this.field1065]);
                if (this.field1059 < var6) {
                    return;
                }
                this.field1059 = (this.field1059 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("aj.af(I)V")
    public synchronized void method974(int arg0) {
        if (this.field1068 > 0) {
            if (arg0 >= this.field1068) {
                if (this.field1066 == Integer.MIN_VALUE) {
                    this.field1066 = 0;
                    this.field1063 = 0;
                    this.field1062 = 0;
                    this.field1061 = 0;
                    this.method3363();
                    arg0 = this.field1068;
                }
                this.field1068 = 0;
                this.method959();
            } else {
                this.field1061 += this.field1058 * arg0;
                this.field1062 += this.field1070 * arg0;
                this.field1063 += this.field1071 * arg0;
                this.field1068 -= arg0;
            }
        }
        class64 var2 = (class64) this.field1079;
        int var3 = this.field1065 << 8;
        int var4 = this.field1069 << 8;
        int var5 = var2.field1243.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1064 = 0;
        }
        if (this.field1059 < 0) {
            if (this.field1067 <= 0) {
                this.method967();
                this.method3363();
                return;
            }
            this.field1059 = 0;
        }
        if (this.field1059 >= var5) {
            if (this.field1067 >= 0) {
                this.method967();
                this.method3363();
                return;
            }
            this.field1059 = var5 - 1;
        }
        this.field1059 += this.field1067 * arg0;
        if (this.field1064 >= 0) {
            if (this.field1064 > 0) {
                if (this.field1057) {
                    label121: {
                        if (this.field1067 < 0) {
                            if (this.field1059 >= var3) {
                                return;
                            }
                            this.field1059 = var3 + var3 - 1 - this.field1059;
                            this.field1067 = -this.field1067;
                            if (--this.field1064 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1059 < var4) {
                                return;
                            }
                            this.field1059 = var4 + var4 - 1 - this.field1059;
                            this.field1067 = -this.field1067;
                            if (--this.field1064 == 0) {
                                break;
                            }
                            if (this.field1059 >= var3) {
                                return;
                            }
                            this.field1059 = var3 + var3 - 1 - this.field1059;
                            this.field1067 = -this.field1067;
                        } while (--this.field1064 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1067 < 0) {
                            if (this.field1059 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1059) / var6;
                            if (var7 >= this.field1064) {
                                this.field1059 += this.field1064 * var6;
                                this.field1064 = 0;
                                break label153;
                            }
                            this.field1059 += var6 * var7;
                            this.field1064 -= var7;
                        } else if (this.field1059 >= var4) {
                            int var8 = (this.field1059 - var3) / var6;
                            if (var8 >= this.field1064) {
                                this.field1059 -= this.field1064 * var6;
                                this.field1064 = 0;
                                break label153;
                            }
                            this.field1059 -= var6 * var8;
                            this.field1064 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1067 < 0) {
                if (this.field1059 < 0) {
                    this.field1059 = -1;
                    this.method967();
                    this.method3363();
                }
            } else if (this.field1059 >= var5) {
                this.field1059 = var5;
                this.method967();
                this.method3363();
            }
        } else if (this.field1057) {
            if (this.field1067 < 0) {
                if (this.field1059 >= var3) {
                    return;
                }
                this.field1059 = var3 + var3 - 1 - this.field1059;
                this.field1067 = -this.field1067;
            }
            while (this.field1059 >= var4) {
                this.field1059 = var4 + var4 - 1 - this.field1059;
                this.field1067 = -this.field1067;
                if (this.field1059 >= var3) {
                    return;
                }
                this.field1059 = var3 + var3 - 1 - this.field1059;
                this.field1067 = -this.field1067;
            }
        } else if (this.field1067 < 0) {
            if (this.field1059 >= var3) {
                return;
            }
            this.field1059 = var4 - 1 - (var4 - 1 - this.field1059) % var6;
        } else if (this.field1059 >= var4) {
            this.field1059 = (this.field1059 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("aj.ar([IIIII)I")
    public int method980(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1068 > 0) {
                int var6 = this.field1068 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1068 += arg1;
                if (this.field1067 == 256 && (this.field1059 & 0xFF) == 0) {
                    if (Statics.field1104) {
                        arg1 = method992(0, ((class64) this.field1079).field1243, arg0, this.field1059, arg1, this.field1062, this.field1063, this.field1070, this.field1071, 0, var6, arg2, this);
                    } else {
                        arg1 = method991(((class64) this.field1079).field1243, arg0, this.field1059, arg1, this.field1061, this.field1058, 0, var6, arg2, this);
                    }
                } else if (Statics.field1104) {
                    arg1 = method1057(0, 0, ((class64) this.field1079).field1243, arg0, this.field1059, arg1, this.field1062, this.field1063, this.field1070, this.field1071, 0, var6, arg2, this, this.field1067, arg4);
                } else {
                    arg1 = method1053(0, 0, ((class64) this.field1079).field1243, arg0, this.field1059, arg1, this.field1061, this.field1058, 0, var6, arg2, this, this.field1067, arg4);
                }
                this.field1068 -= arg1;
                if (this.field1068 != 0) {
                    return arg1;
                }
                if (!this.method963()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1067 == 256 && (this.field1059 & 0xFF) == 0) {
                if (Statics.field1104) {
                    return method984(0, ((class64) this.field1079).field1243, arg0, this.field1059, arg1, this.field1062, this.field1063, 0, arg3, arg2, this);
                }
                return method983(((class64) this.field1079).field1243, arg0, this.field1059, arg1, this.field1061, 0, arg3, arg2, this);
            }
            if (Statics.field1104) {
                return method997(0, 0, ((class64) this.field1079).field1243, arg0, this.field1059, arg1, this.field1062, this.field1063, 0, arg3, arg2, this, this.field1067, arg4);
            }
            return method987(0, 0, ((class64) this.field1079).field1243, arg0, this.field1059, arg1, this.field1061, 0, arg3, arg2, this, this.field1067, arg4);
        }
    }

    @ObfuscatedName("aj.ax([IIIII)I")
    public int method981(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1068 > 0) {
                int var6 = this.field1068 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1068 += arg1;
                if (this.field1067 == -256 && (this.field1059 & 0xFF) == 0) {
                    if (Statics.field1104) {
                        arg1 = method994(0, ((class64) this.field1079).field1243, arg0, this.field1059, arg1, this.field1062, this.field1063, this.field1070, this.field1071, 0, var6, arg2, this);
                    } else {
                        arg1 = method993(((class64) this.field1079).field1243, arg0, this.field1059, arg1, this.field1061, this.field1058, 0, var6, arg2, this);
                    }
                } else if (Statics.field1104) {
                    arg1 = method1040(0, 0, ((class64) this.field1079).field1243, arg0, this.field1059, arg1, this.field1062, this.field1063, this.field1070, this.field1071, 0, var6, arg2, this, this.field1067, arg4);
                } else {
                    arg1 = method995(0, 0, ((class64) this.field1079).field1243, arg0, this.field1059, arg1, this.field1061, this.field1058, 0, var6, arg2, this, this.field1067, arg4);
                }
                this.field1068 -= arg1;
                if (this.field1068 != 0) {
                    return arg1;
                }
                if (!this.method963()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1067 == -256 && (this.field1059 & 0xFF) == 0) {
                if (Statics.field1104) {
                    return method985(0, ((class64) this.field1079).field1243, arg0, this.field1059, arg1, this.field1062, this.field1063, 0, arg3, arg2, this);
                }
                return method990(((class64) this.field1079).field1243, arg0, this.field1059, arg1, this.field1061, 0, arg3, arg2, this);
            }
            if (Statics.field1104) {
                return method976(0, 0, ((class64) this.field1079).field1243, arg0, this.field1059, arg1, this.field1062, this.field1063, 0, arg3, arg2, this, this.field1067, arg4);
            }
            return method989(0, 0, ((class64) this.field1079).field1243, arg0, this.field1059, arg1, this.field1061, 0, arg3, arg2, this, this.field1067, arg4);
        }
    }

    @ObfuscatedName("aj.at()Z")
    public boolean method963() {
        int var1 = this.field1066;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method998(var1, this.field1060);
            var2 = method1019(var1, this.field1060);
        }
        if (this.field1061 != var1 || this.field1062 != var3 || this.field1063 != var2) {
            if (this.field1061 < var1) {
                this.field1058 = 1;
                this.field1068 = var1 - this.field1061;
            } else if (this.field1061 > var1) {
                this.field1058 = -1;
                this.field1068 = this.field1061 - var1;
            } else {
                this.field1058 = 0;
            }
            if (this.field1062 < var3) {
                this.field1070 = 1;
                if (this.field1068 == 0 || this.field1068 > var3 - this.field1062) {
                    this.field1068 = var3 - this.field1062;
                }
            } else if (this.field1062 > var3) {
                this.field1070 = -1;
                if (this.field1068 == 0 || this.field1068 > this.field1062 - var3) {
                    this.field1068 = this.field1062 - var3;
                }
            } else {
                this.field1070 = 0;
            }
            if (this.field1063 < var2) {
                this.field1071 = 1;
                if (this.field1068 == 0 || this.field1068 > var2 - this.field1063) {
                    this.field1068 = var2 - this.field1063;
                }
            } else if (this.field1063 > var2) {
                this.field1071 = -1;
                if (this.field1068 == 0 || this.field1068 > this.field1063 - var2) {
                    this.field1068 = this.field1063 - var2;
                }
            } else {
                this.field1071 = 0;
            }
            return false;
        } else if (this.field1066 == Integer.MIN_VALUE) {
            this.field1066 = 0;
            this.field1063 = 0;
            this.field1062 = 0;
            this.field1061 = 0;
            this.method3363();
            return true;
        } else {
            this.method959();
            return false;
        }
    }

    @ObfuscatedName("aj.ah([B[IIIIIIILaj;)I")
    public static int method983(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class46 arg8) {
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
        arg8.field1059 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("aj.ap(I[B[IIIIIIIILaj;)I")
    public static int method984(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class46 arg10) {
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
        arg10.field1059 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("aj.ay([B[IIIIIIILaj;)I")
    public static int method990(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class46 arg8) {
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
        arg8.field1059 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("aj.ag(I[B[IIIIIIIILaj;)I")
    public static int method985(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class46 arg10) {
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
        arg10.field1059 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("aj.ai(II[B[IIIIIIILaj;II)I")
    public static int method987(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class46 arg10, int arg11, int arg12) {
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
        arg10.field1059 = arg4;
        return arg5;
    }

    @ObfuscatedName("aj.aw(II[B[IIIIIIIILaj;II)I")
    public static int method997(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class46 arg11, int arg12, int arg13) {
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
        arg11.field1059 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("aj.am(II[B[IIIIIIILaj;II)I")
    public static int method989(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class46 arg10, int arg11, int arg12) {
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
        arg10.field1059 = arg4;
        return arg5;
    }

    @ObfuscatedName("aj.an(II[B[IIIIIIIILaj;II)I")
    public static int method976(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class46 arg11, int arg12, int arg13) {
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
        arg11.field1059 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("aj.as([B[IIIIIIIILaj;)I")
    public static int method991(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class46 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1062 += (var14 - arg3) * arg9.field1070;
        arg9.field1063 += (var14 - arg3) * arg9.field1071;
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
        arg9.field1061 = var12 >> 2;
        arg9.field1059 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("aj.au(I[B[IIIIIIIIIILaj;)I")
    public static int method992(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class46 arg12) {
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
        arg12.field1061 += (var19 - arg4) * arg12.field1058;
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
        arg12.field1062 = var15 >> 2;
        arg12.field1063 = var16 >> 2;
        arg12.field1059 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("aj.aq([B[IIIIIIIILaj;)I")
    public static int method993(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class46 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1062 += (var14 - arg3) * arg9.field1070;
        arg9.field1063 += (var14 - arg3) * arg9.field1071;
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
        arg9.field1061 = var12 >> 2;
        arg9.field1059 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("aj.ac(I[B[IIIIIIIIIILaj;)I")
    public static int method994(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class46 arg12) {
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
        arg12.field1061 += (var19 - arg4) * arg12.field1058;
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
        arg12.field1062 = var15 >> 2;
        arg12.field1063 = var16 >> 2;
        arg12.field1059 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("aj.ae(II[B[IIIIIIIILaj;II)I")
    public static int method1053(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class46 arg11, int arg12, int arg13) {
        arg11.field1062 -= arg11.field1070 * arg5;
        arg11.field1063 -= arg11.field1071 * arg5;
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
        arg11.field1062 += arg11.field1070 * arg5;
        arg11.field1063 += arg11.field1071 * arg5;
        arg11.field1061 = arg6;
        arg11.field1059 = arg4;
        return arg5;
    }

    @ObfuscatedName("aj.ad(II[B[IIIIIIIIIILaj;II)I")
    public static int method1057(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class46 arg13, int arg14, int arg15) {
        arg13.field1061 -= arg13.field1058 * arg5;
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
        arg13.field1061 += arg13.field1058 * var27;
        arg13.field1062 = arg6;
        arg13.field1063 = arg7;
        arg13.field1059 = arg4;
        return var27;
    }

    @ObfuscatedName("aj.ao(II[B[IIIIIIIILaj;II)I")
    public static int method995(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class46 arg11, int arg12, int arg13) {
        arg11.field1062 -= arg11.field1070 * arg5;
        arg11.field1063 -= arg11.field1071 * arg5;
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
        arg11.field1062 += arg11.field1070 * arg5;
        arg11.field1063 += arg11.field1071 * arg5;
        arg11.field1061 = arg6;
        arg11.field1059 = arg4;
        return arg5;
    }

    @ObfuscatedName("aj.aj(II[B[IIIIIIIIIILaj;II)I")
    public static int method1040(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class46 arg13, int arg14, int arg15) {
        arg13.field1061 -= arg13.field1058 * arg5;
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
        arg13.field1061 += arg13.field1058 * var26;
        arg13.field1062 = arg6;
        arg13.field1063 = arg7;
        arg13.field1059 = arg4;
        return var26;
    }
}
