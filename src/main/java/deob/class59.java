package deob;

@ObfuscatedName("bg")
public class class59 extends class61 {

    @ObfuscatedName("bg.p")
    public int field1155;

    @ObfuscatedName("bg.y")
    public int field1150;

    @ObfuscatedName("bg.d")
    public int field1144;

    @ObfuscatedName("bg.c")
    public int field1145;

    @ObfuscatedName("bg.r")
    public int field1143;

    @ObfuscatedName("bg.f")
    public int field1147;

    @ObfuscatedName("bg.z")
    public int field1148;

    @ObfuscatedName("bg.o")
    public int field1149;

    @ObfuscatedName("bg.k")
    public int field1156;

    @ObfuscatedName("bg.s")
    public int field1151;

    @ObfuscatedName("bg.h")
    public boolean field1152;

    @ObfuscatedName("bg.m")
    public int field1153;

    @ObfuscatedName("bg.q")
    public int field1154;

    @ObfuscatedName("bg.u")
    public int field1146;

    @ObfuscatedName("bg.e")
    public int field1142;

    @ObfuscatedName("bg.p(II)I")
    public static int method1160(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bg.y(II)I")
    public static int method1125(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bg.az()I")
    public int method1126() {
        int var1 = this.field1143 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1149 == 0) {
            var2 -= this.field1155 * var2 / (((class57) this.field1160).field1126.length << 8);
        } else if (this.field1149 >= 0) {
            var2 -= this.field1156 * var2 / ((class57) this.field1160).field1126.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class59(class57 arg0, int arg1, int arg2) {
        this.field1160 = arg0;
        this.field1156 = arg0.field1125;
        this.field1151 = arg0.field1128;
        this.field1152 = arg0.field1129;
        this.field1150 = arg1;
        this.field1144 = arg2;
        this.field1145 = 8192;
        this.field1155 = 0;
        this.method1129();
    }

    public class59(class57 arg0, int arg1, int arg2, int arg3) {
        this.field1160 = arg0;
        this.field1156 = arg0.field1125;
        this.field1151 = arg0.field1128;
        this.field1152 = arg0.field1129;
        this.field1150 = arg1;
        this.field1144 = arg2;
        this.field1145 = arg3;
        this.field1155 = 0;
        this.method1129();
    }

    @ObfuscatedName("bg.d(Lbk;II)Lbg;")
    public static class59 method1167(class57 arg0, int arg1, int arg2) {
        return arg0.field1126 == null || arg0.field1126.length == 0 ? null : new class59(arg0, (int) ((long) arg0.field1127 * 256L * (long) arg1 / (long) (Statics.field1071 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bg.c(Lbk;III)Lbg;")
    public static class59 method1261(class57 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1126 == null || arg0.field1126.length == 0 ? null : new class59(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bg.r()V")
    public void method1129() {
        this.field1143 = this.field1144;
        this.field1147 = method1160(this.field1144, this.field1145);
        this.field1148 = method1125(this.field1144, this.field1145);
    }

    @ObfuscatedName("bg.s(I)V")
    public synchronized void method1248(int arg0) {
        this.field1149 = arg0;
    }

    @ObfuscatedName("bg.m(I)V")
    public synchronized void method1131(int arg0) {
        this.method1133(arg0 << 6, this.method1124());
    }

    @ObfuscatedName("bg.w(I)V")
    public synchronized void method1132(int arg0) {
        this.method1133(arg0, this.method1124());
    }

    @ObfuscatedName("bg.q(II)V")
    public synchronized void method1133(int arg0, int arg1) {
        this.field1144 = arg0;
        this.field1145 = arg1;
        this.field1153 = 0;
        this.method1129();
    }

    @ObfuscatedName("bg.u()I")
    public synchronized int method1264() {
        return this.field1144 == Integer.MIN_VALUE ? 0 : this.field1144;
    }

    @ObfuscatedName("bg.e()I")
    public synchronized int method1124() {
        return this.field1145 < 0 ? -1 : this.field1145;
    }

    @ObfuscatedName("bg.b(I)V")
    public synchronized void method1136(int arg0) {
        int var2 = ((class57) this.field1160).field1126.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1155 = arg0;
    }

    @ObfuscatedName("bg.g(Z)V")
    public synchronized void method1137(boolean arg0) {
        this.field1150 = (this.field1150 >>> 31) + (this.field1150 ^ this.field1150 >> 31);
        if (arg0) {
            this.field1150 = -this.field1150;
        }
    }

    @ObfuscatedName("bg.j()V")
    public void method1127() {
        if (this.field1153 == 0) {
            return;
        }
        if (this.field1144 == Integer.MIN_VALUE) {
            this.field1144 = 0;
        }
        this.field1153 = 0;
        this.method1129();
    }

    @ObfuscatedName("bg.a(II)V")
    public synchronized void method1139(int arg0, int arg1) {
        this.method1153(arg0, arg1, this.method1124());
    }

    @ObfuscatedName("bg.x(III)V")
    public synchronized void method1153(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1133(arg1, arg2);
            return;
        }
        int var4 = method1160(arg1, arg2);
        int var5 = method1125(arg1, arg2);
        if (this.field1147 == var4 && this.field1148 == var5) {
            this.field1153 = 0;
            return;
        }
        int var6 = arg1 - this.field1143;
        if (this.field1143 - arg1 > var6) {
            var6 = this.field1143 - arg1;
        }
        if (var4 - this.field1147 > var6) {
            var6 = var4 - this.field1147;
        }
        if (this.field1147 - var4 > var6) {
            var6 = this.field1147 - var4;
        }
        if (var5 - this.field1148 > var6) {
            var6 = var5 - this.field1148;
        }
        if (this.field1148 - var5 > var6) {
            var6 = this.field1148 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1153 = arg0;
        this.field1144 = arg1;
        this.field1145 = arg2;
        this.field1154 = (arg1 - this.field1143) / arg0;
        this.field1146 = (var4 - this.field1147) / arg0;
        this.field1142 = (var5 - this.field1148) / arg0;
    }

    @ObfuscatedName("bg.n(I)V")
    public synchronized void method1141(int arg0) {
        if (arg0 == 0) {
            this.method1132(0);
            this.method3358();
        } else if (this.field1147 == 0 && this.field1148 == 0) {
            this.field1153 = 0;
            this.field1144 = 0;
            this.field1143 = 0;
            this.method3358();
        } else {
            int var2 = -this.field1143;
            if (this.field1143 > var2) {
                var2 = this.field1143;
            }
            if (-this.field1147 > var2) {
                var2 = -this.field1147;
            }
            if (this.field1147 > var2) {
                var2 = this.field1147;
            }
            if (-this.field1148 > var2) {
                var2 = -this.field1148;
            }
            if (this.field1148 > var2) {
                var2 = this.field1148;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1153 = arg0;
            this.field1144 = Integer.MIN_VALUE;
            this.field1154 = -this.field1143 / arg0;
            this.field1146 = -this.field1147 / arg0;
            this.field1142 = -this.field1148 / arg0;
        }
    }

    @ObfuscatedName("bg.v(I)V")
    public synchronized void method1142(int arg0) {
        if (this.field1150 < 0) {
            this.field1150 = -arg0;
        } else {
            this.field1150 = arg0;
        }
    }

    @ObfuscatedName("bg.l()I")
    public synchronized int method1143() {
        return this.field1150 < 0 ? -this.field1150 : this.field1150;
    }

    @ObfuscatedName("bg.am()Z")
    public boolean method1144() {
        return this.field1155 < 0 || this.field1155 >= ((class57) this.field1160).field1126.length << 8;
    }

    @ObfuscatedName("bg.ax()Z")
    public boolean method1208() {
        return this.field1153 != 0;
    }

    @ObfuscatedName("bg.f()Lbw;")
    public class61 method983() {
        return null;
    }

    @ObfuscatedName("bg.z()Lbw;")
    public class61 method984() {
        return null;
    }

    @ObfuscatedName("bg.o()I")
    public int method985() {
        return this.field1144 == 0 && this.field1153 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bg.k([III)V")
    public synchronized void method986(int[] arg0, int arg1, int arg2) {
        if (this.field1144 == 0 && this.field1153 == 0) {
            this.method977(arg2);
            return;
        }
        class57 var4 = (class57) this.field1160;
        int var5 = this.field1156 << 8;
        int var6 = this.field1151 << 8;
        int var7 = var4.field1126.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1149 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1155 < 0) {
            if (this.field1150 <= 0) {
                this.method1127();
                this.method3358();
                return;
            }
            this.field1155 = 0;
        }
        if (this.field1155 >= var7) {
            if (this.field1150 >= 0) {
                this.method1127();
                this.method3358();
                return;
            }
            this.field1155 = var7 - 1;
        }
        if (this.field1149 >= 0) {
            if (this.field1149 > 0) {
                if (this.field1152) {
                    label131: {
                        if (this.field1150 < 0) {
                            var9 = this.method1148(arg0, arg1, var5, var10, var4.field1126[this.field1156]);
                            if (this.field1155 >= var5) {
                                return;
                            }
                            this.field1155 = var5 + var5 - 1 - this.field1155;
                            this.field1150 = -this.field1150;
                            if (--this.field1149 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1209(arg0, var9, var6, var10, var4.field1126[this.field1151 - 1]);
                            if (this.field1155 < var6) {
                                return;
                            }
                            this.field1155 = var6 + var6 - 1 - this.field1155;
                            this.field1150 = -this.field1150;
                            if (--this.field1149 == 0) {
                                break;
                            }
                            var9 = this.method1148(arg0, var9, var5, var10, var4.field1126[this.field1156]);
                            if (this.field1155 >= var5) {
                                return;
                            }
                            this.field1155 = var5 + var5 - 1 - this.field1155;
                            this.field1150 = -this.field1150;
                        } while (--this.field1149 != 0);
                    }
                } else if (this.field1150 < 0) {
                    while (true) {
                        var9 = this.method1148(arg0, var9, var5, var10, var4.field1126[this.field1151 - 1]);
                        if (this.field1155 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1155) / var8;
                        if (var12 >= this.field1149) {
                            this.field1155 += this.field1149 * var8;
                            this.field1149 = 0;
                            break;
                        }
                        this.field1155 += var8 * var12;
                        this.field1149 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1209(arg0, var9, var6, var10, var4.field1126[this.field1156]);
                        if (this.field1155 < var6) {
                            return;
                        }
                        int var13 = (this.field1155 - var5) / var8;
                        if (var13 >= this.field1149) {
                            this.field1155 -= this.field1149 * var8;
                            this.field1149 = 0;
                            break;
                        }
                        this.field1155 -= var8 * var13;
                        this.field1149 -= var13;
                    }
                }
            }
            if (this.field1150 < 0) {
                this.method1148(arg0, var9, 0, var10, 0);
                if (this.field1155 < 0) {
                    this.field1155 = -1;
                    this.method1127();
                    this.method3358();
                }
            } else {
                this.method1209(arg0, var9, var7, var10, 0);
                if (this.field1155 >= var7) {
                    this.field1155 = var7;
                    this.method1127();
                    this.method3358();
                }
            }
        } else if (this.field1152) {
            if (this.field1150 < 0) {
                var9 = this.method1148(arg0, arg1, var5, var10, var4.field1126[this.field1156]);
                if (this.field1155 >= var5) {
                    return;
                }
                this.field1155 = var5 + var5 - 1 - this.field1155;
                this.field1150 = -this.field1150;
            }
            while (true) {
                int var11 = this.method1209(arg0, var9, var6, var10, var4.field1126[this.field1151 - 1]);
                if (this.field1155 < var6) {
                    return;
                }
                this.field1155 = var6 + var6 - 1 - this.field1155;
                this.field1150 = -this.field1150;
                var9 = this.method1148(arg0, var11, var5, var10, var4.field1126[this.field1156]);
                if (this.field1155 >= var5) {
                    return;
                }
                this.field1155 = var5 + var5 - 1 - this.field1155;
                this.field1150 = -this.field1150;
            }
        } else if (this.field1150 < 0) {
            while (true) {
                var9 = this.method1148(arg0, var9, var5, var10, var4.field1126[this.field1151 - 1]);
                if (this.field1155 >= var5) {
                    return;
                }
                this.field1155 = var6 - 1 - (var6 - 1 - this.field1155) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1209(arg0, var9, var6, var10, var4.field1126[this.field1156]);
                if (this.field1155 < var6) {
                    return;
                }
                this.field1155 = (this.field1155 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bg.h(I)V")
    public synchronized void method977(int arg0) {
        if (this.field1153 > 0) {
            if (arg0 >= this.field1153) {
                if (this.field1144 == Integer.MIN_VALUE) {
                    this.field1144 = 0;
                    this.field1148 = 0;
                    this.field1147 = 0;
                    this.field1143 = 0;
                    this.method3358();
                    arg0 = this.field1153;
                }
                this.field1153 = 0;
                this.method1129();
            } else {
                this.field1143 += this.field1154 * arg0;
                this.field1147 += this.field1146 * arg0;
                this.field1148 += this.field1142 * arg0;
                this.field1153 -= arg0;
            }
        }
        class57 var2 = (class57) this.field1160;
        int var3 = this.field1156 << 8;
        int var4 = this.field1151 << 8;
        int var5 = var2.field1126.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1149 = 0;
        }
        if (this.field1155 < 0) {
            if (this.field1150 <= 0) {
                this.method1127();
                this.method3358();
                return;
            }
            this.field1155 = 0;
        }
        if (this.field1155 >= var5) {
            if (this.field1150 >= 0) {
                this.method1127();
                this.method3358();
                return;
            }
            this.field1155 = var5 - 1;
        }
        this.field1155 += this.field1150 * arg0;
        if (this.field1149 >= 0) {
            if (this.field1149 > 0) {
                if (this.field1152) {
                    label121: {
                        if (this.field1150 < 0) {
                            if (this.field1155 >= var3) {
                                return;
                            }
                            this.field1155 = var3 + var3 - 1 - this.field1155;
                            this.field1150 = -this.field1150;
                            if (--this.field1149 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1155 < var4) {
                                return;
                            }
                            this.field1155 = var4 + var4 - 1 - this.field1155;
                            this.field1150 = -this.field1150;
                            if (--this.field1149 == 0) {
                                break;
                            }
                            if (this.field1155 >= var3) {
                                return;
                            }
                            this.field1155 = var3 + var3 - 1 - this.field1155;
                            this.field1150 = -this.field1150;
                        } while (--this.field1149 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1150 < 0) {
                            if (this.field1155 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1155) / var6;
                            if (var7 >= this.field1149) {
                                this.field1155 += this.field1149 * var6;
                                this.field1149 = 0;
                                break label153;
                            }
                            this.field1155 += var6 * var7;
                            this.field1149 -= var7;
                        } else if (this.field1155 >= var4) {
                            int var8 = (this.field1155 - var3) / var6;
                            if (var8 >= this.field1149) {
                                this.field1155 -= this.field1149 * var6;
                                this.field1149 = 0;
                                break label153;
                            }
                            this.field1155 -= var6 * var8;
                            this.field1149 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1150 < 0) {
                if (this.field1155 < 0) {
                    this.field1155 = -1;
                    this.method1127();
                    this.method3358();
                }
            } else if (this.field1155 >= var5) {
                this.field1155 = var5;
                this.method1127();
                this.method3358();
            }
        } else if (this.field1152) {
            if (this.field1150 < 0) {
                if (this.field1155 >= var3) {
                    return;
                }
                this.field1155 = var3 + var3 - 1 - this.field1155;
                this.field1150 = -this.field1150;
            }
            while (this.field1155 >= var4) {
                this.field1155 = var4 + var4 - 1 - this.field1155;
                this.field1150 = -this.field1150;
                if (this.field1155 >= var3) {
                    return;
                }
                this.field1155 = var3 + var3 - 1 - this.field1155;
                this.field1150 = -this.field1150;
            }
        } else if (this.field1150 < 0) {
            if (this.field1155 >= var3) {
                return;
            }
            this.field1155 = var4 - 1 - (var4 - 1 - this.field1155) % var6;
        } else if (this.field1155 >= var4) {
            this.field1155 = (this.field1155 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bg.ac([IIIII)I")
    public int method1209(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1153 > 0) {
                int var6 = this.field1153 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1153 += arg1;
                if (this.field1150 == 256 && (this.field1155 & 0xFF) == 0) {
                    if (Statics.field1067) {
                        arg1 = method1158(0, ((class57) this.field1160).field1126, arg0, this.field1155, arg1, this.field1147, this.field1148, this.field1146, this.field1142, 0, var6, arg2, this);
                    } else {
                        arg1 = method1166(((class57) this.field1160).field1126, arg0, this.field1155, arg1, this.field1143, this.field1154, 0, var6, arg2, this);
                    }
                } else if (Statics.field1067) {
                    arg1 = method1188(0, 0, ((class57) this.field1160).field1126, arg0, this.field1155, arg1, this.field1147, this.field1148, this.field1146, this.field1142, 0, var6, arg2, this, this.field1150, arg4);
                } else {
                    arg1 = method1161(0, 0, ((class57) this.field1160).field1126, arg0, this.field1155, arg1, this.field1143, this.field1154, 0, var6, arg2, this, this.field1150, arg4);
                }
                this.field1153 -= arg1;
                if (this.field1153 != 0) {
                    return arg1;
                }
                if (!this.method1149()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1150 == 256 && (this.field1155 & 0xFF) == 0) {
                if (Statics.field1067) {
                    return method1162(0, ((class57) this.field1160).field1126, arg0, this.field1155, arg1, this.field1147, this.field1148, 0, arg3, arg2, this);
                }
                return method1150(((class57) this.field1160).field1126, arg0, this.field1155, arg1, this.field1143, 0, arg3, arg2, this);
            }
            if (Statics.field1067) {
                return method1154(0, 0, ((class57) this.field1160).field1126, arg0, this.field1155, arg1, this.field1147, this.field1148, 0, arg3, arg2, this, this.field1150, arg4);
            }
            return method1191(0, 0, ((class57) this.field1160).field1126, arg0, this.field1155, arg1, this.field1143, 0, arg3, arg2, this, this.field1150, arg4);
        }
    }

    @ObfuscatedName("bg.ah([IIIII)I")
    public int method1148(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1153 > 0) {
                int var6 = this.field1153 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1153 += arg1;
                if (this.field1150 == -256 && (this.field1155 & 0xFF) == 0) {
                    if (Statics.field1067) {
                        arg1 = method1200(0, ((class57) this.field1160).field1126, arg0, this.field1155, arg1, this.field1147, this.field1148, this.field1146, this.field1142, 0, var6, arg2, this);
                    } else {
                        arg1 = method1221(((class57) this.field1160).field1126, arg0, this.field1155, arg1, this.field1143, this.field1154, 0, var6, arg2, this);
                    }
                } else if (Statics.field1067) {
                    arg1 = method1164(0, 0, ((class57) this.field1160).field1126, arg0, this.field1155, arg1, this.field1147, this.field1148, this.field1146, this.field1142, 0, var6, arg2, this, this.field1150, arg4);
                } else {
                    arg1 = method1163(0, 0, ((class57) this.field1160).field1126, arg0, this.field1155, arg1, this.field1143, this.field1154, 0, var6, arg2, this, this.field1150, arg4);
                }
                this.field1153 -= arg1;
                if (this.field1153 != 0) {
                    return arg1;
                }
                if (!this.method1149()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1150 == -256 && (this.field1155 & 0xFF) == 0) {
                if (Statics.field1067) {
                    return method1152(0, ((class57) this.field1160).field1126, arg0, this.field1155, arg1, this.field1147, this.field1148, 0, arg3, arg2, this);
                }
                return method1146(((class57) this.field1160).field1126, arg0, this.field1155, arg1, this.field1143, 0, arg3, arg2, this);
            }
            if (Statics.field1067) {
                return method1169(0, 0, ((class57) this.field1160).field1126, arg0, this.field1155, arg1, this.field1147, this.field1148, 0, arg3, arg2, this, this.field1150, arg4);
            }
            return method1155(0, 0, ((class57) this.field1160).field1126, arg0, this.field1155, arg1, this.field1143, 0, arg3, arg2, this, this.field1150, arg4);
        }
    }

    @ObfuscatedName("bg.at()Z")
    public boolean method1149() {
        int var1 = this.field1144;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1160(var1, this.field1145);
            var2 = method1125(var1, this.field1145);
        }
        if (this.field1143 != var1 || this.field1147 != var3 || this.field1148 != var2) {
            if (this.field1143 < var1) {
                this.field1154 = 1;
                this.field1153 = var1 - this.field1143;
            } else if (this.field1143 > var1) {
                this.field1154 = -1;
                this.field1153 = this.field1143 - var1;
            } else {
                this.field1154 = 0;
            }
            if (this.field1147 < var3) {
                this.field1146 = 1;
                if (this.field1153 == 0 || this.field1153 > var3 - this.field1147) {
                    this.field1153 = var3 - this.field1147;
                }
            } else if (this.field1147 > var3) {
                this.field1146 = -1;
                if (this.field1153 == 0 || this.field1153 > this.field1147 - var3) {
                    this.field1153 = this.field1147 - var3;
                }
            } else {
                this.field1146 = 0;
            }
            if (this.field1148 < var2) {
                this.field1142 = 1;
                if (this.field1153 == 0 || this.field1153 > var2 - this.field1148) {
                    this.field1153 = var2 - this.field1148;
                }
            } else if (this.field1148 > var2) {
                this.field1142 = -1;
                if (this.field1153 == 0 || this.field1153 > this.field1148 - var2) {
                    this.field1153 = this.field1148 - var2;
                }
            } else {
                this.field1142 = 0;
            }
            return false;
        } else if (this.field1144 == Integer.MIN_VALUE) {
            this.field1144 = 0;
            this.field1148 = 0;
            this.field1147 = 0;
            this.field1143 = 0;
            this.method3358();
            return true;
        } else {
            this.method1129();
            return false;
        }
    }

    @ObfuscatedName("bg.ap([B[IIIIIIILbg;)I")
    public static int method1150(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class59 arg8) {
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
        arg8.field1155 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.as(I[B[IIIIIIIILbg;)I")
    public static int method1162(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10) {
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
        arg10.field1155 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bg.au([B[IIIIIIILbg;)I")
    public static int method1146(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class59 arg8) {
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
        arg8.field1155 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.ag(I[B[IIIIIIIILbg;)I")
    public static int method1152(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10) {
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
        arg10.field1155 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bg.an(II[B[IIIIIIILbg;II)I")
    public static int method1191(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10, int arg11, int arg12) {
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
        arg10.field1155 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.ad(II[B[IIIIIIIILbg;II)I")
    public static int method1154(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
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
        arg11.field1155 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bg.ae(II[B[IIIIIIILbg;II)I")
    public static int method1155(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10, int arg11, int arg12) {
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
        arg10.field1155 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.ak(II[B[IIIIIIIILbg;II)I")
    public static int method1169(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
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
        arg11.field1155 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bg.ay([B[IIIIIIIILbg;)I")
    public static int method1166(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class59 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1147 += (var14 - arg3) * arg9.field1146;
        arg9.field1148 += (var14 - arg3) * arg9.field1142;
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
        arg9.field1143 = var12 >> 2;
        arg9.field1155 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.ao(I[B[IIIIIIIIIILbg;)I")
    public static int method1158(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class59 arg12) {
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
        arg12.field1143 += (var19 - arg4) * arg12.field1154;
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
        arg12.field1147 = var15 >> 2;
        arg12.field1148 = var16 >> 2;
        arg12.field1155 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bg.ai([B[IIIIIIIILbg;)I")
    public static int method1221(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class59 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1147 += (var14 - arg3) * arg9.field1146;
        arg9.field1148 += (var14 - arg3) * arg9.field1142;
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
        arg9.field1143 = var12 >> 2;
        arg9.field1155 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bg.aa(I[B[IIIIIIIIIILbg;)I")
    public static int method1200(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class59 arg12) {
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
        arg12.field1143 += (var19 - arg4) * arg12.field1154;
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
        arg12.field1147 = var15 >> 2;
        arg12.field1148 = var16 >> 2;
        arg12.field1155 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bg.aj(II[B[IIIIIIIILbg;II)I")
    public static int method1161(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
        arg11.field1147 -= arg11.field1146 * arg5;
        arg11.field1148 -= arg11.field1142 * arg5;
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
        arg11.field1147 += arg11.field1146 * arg5;
        arg11.field1148 += arg11.field1142 * arg5;
        arg11.field1143 = arg6;
        arg11.field1155 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.be(II[B[IIIIIIIIIILbg;II)I")
    public static int method1188(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class59 arg13, int arg14, int arg15) {
        arg13.field1143 -= arg13.field1154 * arg5;
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
        arg13.field1143 += arg13.field1154 * var27;
        arg13.field1147 = arg6;
        arg13.field1148 = arg7;
        arg13.field1155 = arg4;
        return var27;
    }

    @ObfuscatedName("bg.bi(II[B[IIIIIIIILbg;II)I")
    public static int method1163(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
        arg11.field1147 -= arg11.field1146 * arg5;
        arg11.field1148 -= arg11.field1142 * arg5;
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
        arg11.field1147 += arg11.field1146 * arg5;
        arg11.field1148 += arg11.field1142 * arg5;
        arg11.field1143 = arg6;
        arg11.field1155 = arg4;
        return arg5;
    }

    @ObfuscatedName("bg.bn(II[B[IIIIIIIIIILbg;II)I")
    public static int method1164(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class59 arg13, int arg14, int arg15) {
        arg13.field1143 -= arg13.field1154 * arg5;
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
        arg13.field1143 += arg13.field1154 * var26;
        arg13.field1147 = arg6;
        arg13.field1148 = arg7;
        arg13.field1155 = arg4;
        return var26;
    }
}
