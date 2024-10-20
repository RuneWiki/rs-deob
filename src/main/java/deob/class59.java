package deob;

@ObfuscatedName("bm")
public class class59 extends class61 {

    @ObfuscatedName("bm.c")
    public int field1151;

    @ObfuscatedName("bm.j")
    public int field1147;

    @ObfuscatedName("bm.y")
    public int field1148;

    @ObfuscatedName("bm.r")
    public int field1155;

    @ObfuscatedName("bm.f")
    public int field1160;

    @ObfuscatedName("bm.l")
    public int field1156;

    @ObfuscatedName("bm.b")
    public int field1152;

    @ObfuscatedName("bm.k")
    public int field1153;

    @ObfuscatedName("bm.g")
    public int field1154;

    @ObfuscatedName("bm.v")
    public int field1146;

    @ObfuscatedName("bm.i")
    public boolean field1150;

    @ObfuscatedName("bm.x")
    public int field1157;

    @ObfuscatedName("bm.h")
    public int field1158;

    @ObfuscatedName("bm.s")
    public int field1159;

    @ObfuscatedName("bm.p")
    public int field1149;

    @ObfuscatedName("bm.c(II)I")
    public static int method1150(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bm.j(II)I")
    public static int method1196(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bm.az()I")
    public int method1126() {
        int var1 = this.field1160 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1153 == 0) {
            var2 -= this.field1151 * var2 / (((class57) this.field1164).field1130.length << 8);
        } else if (this.field1153 >= 0) {
            var2 -= this.field1154 * var2 / ((class57) this.field1164).field1130.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class59(class57 arg0, int arg1, int arg2) {
        this.field1164 = arg0;
        this.field1154 = arg0.field1133;
        this.field1146 = arg0.field1132;
        this.field1150 = arg0.field1129;
        this.field1147 = arg1;
        this.field1148 = arg2;
        this.field1155 = 8192;
        this.field1151 = 0;
        this.method1112();
    }

    public class59(class57 arg0, int arg1, int arg2, int arg3) {
        this.field1164 = arg0;
        this.field1154 = arg0.field1133;
        this.field1146 = arg0.field1132;
        this.field1150 = arg0.field1129;
        this.field1147 = arg1;
        this.field1148 = arg2;
        this.field1155 = arg3;
        this.field1151 = 0;
        this.method1112();
    }

    @ObfuscatedName("bm.y(Lbg;II)Lbm;")
    public static class59 method1110(class57 arg0, int arg1, int arg2) {
        return arg0.field1130 == null || arg0.field1130.length == 0 ? null : new class59(arg0, (int) ((long) arg0.field1131 * 256L * (long) arg1 / (long) (Statics.field1814 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bm.r(Lbg;III)Lbm;")
    public static class59 method1228(class57 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1130 == null || arg0.field1130.length == 0 ? null : new class59(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bm.f()V")
    public void method1112() {
        this.field1160 = this.field1148;
        this.field1156 = method1150(this.field1148, this.field1155);
        this.field1152 = method1196(this.field1148, this.field1155);
    }

    @ObfuscatedName("bm.v(I)V")
    public synchronized void method1152(int arg0) {
        this.field1153 = arg0;
    }

    @ObfuscatedName("bm.x(I)V")
    public synchronized void method1114(int arg0) {
        this.method1116(arg0 << 6, this.method1117());
    }

    @ObfuscatedName("bm.h(I)V")
    public synchronized void method1115(int arg0) {
        this.method1116(arg0, this.method1117());
    }

    @ObfuscatedName("bm.w(II)V")
    public synchronized void method1116(int arg0, int arg1) {
        this.field1148 = arg0;
        this.field1155 = arg1;
        this.field1157 = 0;
        this.method1112();
    }

    @ObfuscatedName("bm.s()I")
    public synchronized int method1160() {
        return this.field1148 == Integer.MIN_VALUE ? 0 : this.field1148;
    }

    @ObfuscatedName("bm.p()I")
    public synchronized int method1117() {
        return this.field1155 < 0 ? -1 : this.field1155;
    }

    @ObfuscatedName("bm.z(I)V")
    public synchronized void method1162(int arg0) {
        int var2 = ((class57) this.field1164).field1130.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1151 = arg0;
    }

    @ObfuscatedName("bm.n(Z)V")
    public synchronized void method1109(boolean arg0) {
        this.field1147 = (this.field1147 >>> 31) + (this.field1147 ^ this.field1147 >> 31);
        if (arg0) {
            this.field1147 = -this.field1147;
        }
    }

    @ObfuscatedName("bm.u()V")
    public void method1158() {
        if (this.field1157 == 0) {
            return;
        }
        if (this.field1148 == Integer.MIN_VALUE) {
            this.field1148 = 0;
        }
        this.field1157 = 0;
        this.method1112();
    }

    @ObfuscatedName("bm.a(II)V")
    public synchronized void method1121(int arg0, int arg1) {
        this.method1122(arg0, arg1, this.method1117());
    }

    @ObfuscatedName("bm.d(III)V")
    public synchronized void method1122(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1116(arg1, arg2);
            return;
        }
        int var4 = method1150(arg1, arg2);
        int var5 = method1196(arg1, arg2);
        if (this.field1156 == var4 && this.field1152 == var5) {
            this.field1157 = 0;
            return;
        }
        int var6 = arg1 - this.field1160;
        if (this.field1160 - arg1 > var6) {
            var6 = this.field1160 - arg1;
        }
        if (var4 - this.field1156 > var6) {
            var6 = var4 - this.field1156;
        }
        if (this.field1156 - var4 > var6) {
            var6 = this.field1156 - var4;
        }
        if (var5 - this.field1152 > var6) {
            var6 = var5 - this.field1152;
        }
        if (this.field1152 - var5 > var6) {
            var6 = this.field1152 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1157 = arg0;
        this.field1148 = arg1;
        this.field1155 = arg2;
        this.field1158 = (arg1 - this.field1160) / arg0;
        this.field1159 = (var4 - this.field1156) / arg0;
        this.field1149 = (var5 - this.field1152) / arg0;
    }

    @ObfuscatedName("bm.m(I)V")
    public synchronized void method1123(int arg0) {
        if (arg0 == 0) {
            this.method1115(0);
            this.method3334();
        } else if (this.field1156 == 0 && this.field1152 == 0) {
            this.field1157 = 0;
            this.field1148 = 0;
            this.field1160 = 0;
            this.method3334();
        } else {
            int var2 = -this.field1160;
            if (this.field1160 > var2) {
                var2 = this.field1160;
            }
            if (-this.field1156 > var2) {
                var2 = -this.field1156;
            }
            if (this.field1156 > var2) {
                var2 = this.field1156;
            }
            if (-this.field1152 > var2) {
                var2 = -this.field1152;
            }
            if (this.field1152 > var2) {
                var2 = this.field1152;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1157 = arg0;
            this.field1148 = Integer.MIN_VALUE;
            this.field1158 = -this.field1160 / arg0;
            this.field1159 = -this.field1156 / arg0;
            this.field1149 = -this.field1152 / arg0;
        }
    }

    @ObfuscatedName("bm.q(I)V")
    public synchronized void method1221(int arg0) {
        if (this.field1147 < 0) {
            this.field1147 = -arg0;
        } else {
            this.field1147 = arg0;
        }
    }

    @ObfuscatedName("bm.e()I")
    public synchronized int method1151() {
        return this.field1147 < 0 ? -this.field1147 : this.field1147;
    }

    @ObfuscatedName("bm.t()Z")
    public boolean method1125() {
        return this.field1151 < 0 || this.field1151 >= ((class57) this.field1164).field1130.length << 8;
    }

    @ObfuscatedName("bm.o()Z")
    public boolean method1165() {
        return this.field1157 != 0;
    }

    @ObfuscatedName("bm.l()Lbr;")
    public class61 method961() {
        return null;
    }

    @ObfuscatedName("bm.b()Lbr;")
    public class61 method962() {
        return null;
    }

    @ObfuscatedName("bm.k()I")
    public int method963() {
        return this.field1148 == 0 && this.field1157 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bm.g([III)V")
    public synchronized void method986(int[] arg0, int arg1, int arg2) {
        if (this.field1148 == 0 && this.field1157 == 0) {
            this.method964(arg2);
            return;
        }
        class57 var4 = (class57) this.field1164;
        int var5 = this.field1154 << 8;
        int var6 = this.field1146 << 8;
        int var7 = var4.field1130.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1153 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1151 < 0) {
            if (this.field1147 <= 0) {
                this.method1158();
                this.method3334();
                return;
            }
            this.field1151 = 0;
        }
        if (this.field1151 >= var7) {
            if (this.field1147 >= 0) {
                this.method1158();
                this.method3334();
                return;
            }
            this.field1151 = var7 - 1;
        }
        if (this.field1153 >= 0) {
            if (this.field1153 > 0) {
                if (this.field1150) {
                    label131: {
                        if (this.field1147 < 0) {
                            var9 = this.method1129(arg0, arg1, var5, var10, var4.field1130[this.field1154]);
                            if (this.field1151 >= var5) {
                                return;
                            }
                            this.field1151 = var5 + var5 - 1 - this.field1151;
                            this.field1147 = -this.field1147;
                            if (--this.field1153 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1159(arg0, var9, var6, var10, var4.field1130[this.field1146 - 1]);
                            if (this.field1151 < var6) {
                                return;
                            }
                            this.field1151 = var6 + var6 - 1 - this.field1151;
                            this.field1147 = -this.field1147;
                            if (--this.field1153 == 0) {
                                break;
                            }
                            var9 = this.method1129(arg0, var9, var5, var10, var4.field1130[this.field1154]);
                            if (this.field1151 >= var5) {
                                return;
                            }
                            this.field1151 = var5 + var5 - 1 - this.field1151;
                            this.field1147 = -this.field1147;
                        } while (--this.field1153 != 0);
                    }
                } else if (this.field1147 < 0) {
                    while (true) {
                        var9 = this.method1129(arg0, var9, var5, var10, var4.field1130[this.field1146 - 1]);
                        if (this.field1151 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1151) / var8;
                        if (var12 >= this.field1153) {
                            this.field1151 += this.field1153 * var8;
                            this.field1153 = 0;
                            break;
                        }
                        this.field1151 += var8 * var12;
                        this.field1153 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1159(arg0, var9, var6, var10, var4.field1130[this.field1154]);
                        if (this.field1151 < var6) {
                            return;
                        }
                        int var13 = (this.field1151 - var5) / var8;
                        if (var13 >= this.field1153) {
                            this.field1151 -= this.field1153 * var8;
                            this.field1153 = 0;
                            break;
                        }
                        this.field1151 -= var8 * var13;
                        this.field1153 -= var13;
                    }
                }
            }
            if (this.field1147 < 0) {
                this.method1129(arg0, var9, 0, var10, 0);
                if (this.field1151 < 0) {
                    this.field1151 = -1;
                    this.method1158();
                    this.method3334();
                }
            } else {
                this.method1159(arg0, var9, var7, var10, 0);
                if (this.field1151 >= var7) {
                    this.field1151 = var7;
                    this.method1158();
                    this.method3334();
                }
            }
        } else if (this.field1150) {
            if (this.field1147 < 0) {
                var9 = this.method1129(arg0, arg1, var5, var10, var4.field1130[this.field1154]);
                if (this.field1151 >= var5) {
                    return;
                }
                this.field1151 = var5 + var5 - 1 - this.field1151;
                this.field1147 = -this.field1147;
            }
            while (true) {
                int var11 = this.method1159(arg0, var9, var6, var10, var4.field1130[this.field1146 - 1]);
                if (this.field1151 < var6) {
                    return;
                }
                this.field1151 = var6 + var6 - 1 - this.field1151;
                this.field1147 = -this.field1147;
                var9 = this.method1129(arg0, var11, var5, var10, var4.field1130[this.field1154]);
                if (this.field1151 >= var5) {
                    return;
                }
                this.field1151 = var5 + var5 - 1 - this.field1151;
                this.field1147 = -this.field1147;
            }
        } else if (this.field1147 < 0) {
            while (true) {
                var9 = this.method1129(arg0, var9, var5, var10, var4.field1130[this.field1146 - 1]);
                if (this.field1151 >= var5) {
                    return;
                }
                this.field1151 = var6 - 1 - (var6 - 1 - this.field1151) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1159(arg0, var9, var6, var10, var4.field1130[this.field1154]);
                if (this.field1151 < var6) {
                    return;
                }
                this.field1151 = (this.field1151 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bm.i(I)V")
    public synchronized void method964(int arg0) {
        if (this.field1157 > 0) {
            if (arg0 >= this.field1157) {
                if (this.field1148 == Integer.MIN_VALUE) {
                    this.field1148 = 0;
                    this.field1152 = 0;
                    this.field1156 = 0;
                    this.field1160 = 0;
                    this.method3334();
                    arg0 = this.field1157;
                }
                this.field1157 = 0;
                this.method1112();
            } else {
                this.field1160 += this.field1158 * arg0;
                this.field1156 += this.field1159 * arg0;
                this.field1152 += this.field1149 * arg0;
                this.field1157 -= arg0;
            }
        }
        class57 var2 = (class57) this.field1164;
        int var3 = this.field1154 << 8;
        int var4 = this.field1146 << 8;
        int var5 = var2.field1130.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1153 = 0;
        }
        if (this.field1151 < 0) {
            if (this.field1147 <= 0) {
                this.method1158();
                this.method3334();
                return;
            }
            this.field1151 = 0;
        }
        if (this.field1151 >= var5) {
            if (this.field1147 >= 0) {
                this.method1158();
                this.method3334();
                return;
            }
            this.field1151 = var5 - 1;
        }
        this.field1151 += this.field1147 * arg0;
        if (this.field1153 >= 0) {
            if (this.field1153 > 0) {
                if (this.field1150) {
                    label121: {
                        if (this.field1147 < 0) {
                            if (this.field1151 >= var3) {
                                return;
                            }
                            this.field1151 = var3 + var3 - 1 - this.field1151;
                            this.field1147 = -this.field1147;
                            if (--this.field1153 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1151 < var4) {
                                return;
                            }
                            this.field1151 = var4 + var4 - 1 - this.field1151;
                            this.field1147 = -this.field1147;
                            if (--this.field1153 == 0) {
                                break;
                            }
                            if (this.field1151 >= var3) {
                                return;
                            }
                            this.field1151 = var3 + var3 - 1 - this.field1151;
                            this.field1147 = -this.field1147;
                        } while (--this.field1153 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1147 < 0) {
                            if (this.field1151 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1151) / var6;
                            if (var7 >= this.field1153) {
                                this.field1151 += this.field1153 * var6;
                                this.field1153 = 0;
                                break label153;
                            }
                            this.field1151 += var6 * var7;
                            this.field1153 -= var7;
                        } else if (this.field1151 >= var4) {
                            int var8 = (this.field1151 - var3) / var6;
                            if (var8 >= this.field1153) {
                                this.field1151 -= this.field1153 * var6;
                                this.field1153 = 0;
                                break label153;
                            }
                            this.field1151 -= var6 * var8;
                            this.field1153 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1147 < 0) {
                if (this.field1151 < 0) {
                    this.field1151 = -1;
                    this.method1158();
                    this.method3334();
                }
            } else if (this.field1151 >= var5) {
                this.field1151 = var5;
                this.method1158();
                this.method3334();
            }
        } else if (this.field1150) {
            if (this.field1147 < 0) {
                if (this.field1151 >= var3) {
                    return;
                }
                this.field1151 = var3 + var3 - 1 - this.field1151;
                this.field1147 = -this.field1147;
            }
            while (this.field1151 >= var4) {
                this.field1151 = var4 + var4 - 1 - this.field1151;
                this.field1147 = -this.field1147;
                if (this.field1151 >= var3) {
                    return;
                }
                this.field1151 = var3 + var3 - 1 - this.field1151;
                this.field1147 = -this.field1147;
            }
        } else if (this.field1147 < 0) {
            if (this.field1151 >= var3) {
                return;
            }
            this.field1151 = var4 - 1 - (var4 - 1 - this.field1151) % var6;
        } else if (this.field1151 >= var4) {
            this.field1151 = (this.field1151 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bm.aj([IIIII)I")
    public int method1159(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1157 > 0) {
                int var6 = this.field1157 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1157 += arg1;
                if (this.field1147 == 256 && (this.field1151 & 0xFF) == 0) {
                    if (Statics.field1099) {
                        arg1 = method1138(0, ((class57) this.field1164).field1130, arg0, this.field1151, arg1, this.field1156, this.field1152, this.field1159, this.field1149, 0, var6, arg2, this);
                    } else {
                        arg1 = method1137(((class57) this.field1164).field1130, arg0, this.field1151, arg1, this.field1160, this.field1158, 0, var6, arg2, this);
                    }
                } else if (Statics.field1099) {
                    arg1 = method1222(0, 0, ((class57) this.field1164).field1130, arg0, this.field1151, arg1, this.field1156, this.field1152, this.field1159, this.field1149, 0, var6, arg2, this, this.field1147, arg4);
                } else {
                    arg1 = method1185(0, 0, ((class57) this.field1164).field1130, arg0, this.field1151, arg1, this.field1160, this.field1158, 0, var6, arg2, this, this.field1147, arg4);
                }
                this.field1157 -= arg1;
                if (this.field1157 != 0) {
                    return arg1;
                }
                if (!this.method1177()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1147 == 256 && (this.field1151 & 0xFF) == 0) {
                if (Statics.field1099) {
                    return method1131(0, ((class57) this.field1164).field1130, arg0, this.field1151, arg1, this.field1156, this.field1152, 0, arg3, arg2, this);
                }
                return method1128(((class57) this.field1164).field1130, arg0, this.field1151, arg1, this.field1160, 0, arg3, arg2, this);
            }
            if (Statics.field1099) {
                return method1134(0, 0, ((class57) this.field1164).field1130, arg0, this.field1151, arg1, this.field1156, this.field1152, 0, arg3, arg2, this, this.field1147, arg4);
            }
            return method1133(0, 0, ((class57) this.field1164).field1130, arg0, this.field1151, arg1, this.field1160, 0, arg3, arg2, this, this.field1147, arg4);
        }
    }

    @ObfuscatedName("bm.am([IIIII)I")
    public int method1129(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1157 > 0) {
                int var6 = this.field1157 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1157 += arg1;
                if (this.field1147 == -256 && (this.field1151 & 0xFF) == 0) {
                    if (Statics.field1099) {
                        arg1 = method1140(0, ((class57) this.field1164).field1130, arg0, this.field1151, arg1, this.field1156, this.field1152, this.field1159, this.field1149, 0, var6, arg2, this);
                    } else {
                        arg1 = method1139(((class57) this.field1164).field1130, arg0, this.field1151, arg1, this.field1160, this.field1158, 0, var6, arg2, this);
                    }
                } else if (Statics.field1099) {
                    arg1 = method1144(0, 0, ((class57) this.field1164).field1130, arg0, this.field1151, arg1, this.field1156, this.field1152, this.field1159, this.field1149, 0, var6, arg2, this, this.field1147, arg4);
                } else {
                    arg1 = method1143(0, 0, ((class57) this.field1164).field1130, arg0, this.field1151, arg1, this.field1160, this.field1158, 0, var6, arg2, this, this.field1147, arg4);
                }
                this.field1157 -= arg1;
                if (this.field1157 != 0) {
                    return arg1;
                }
                if (!this.method1177()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1147 == -256 && (this.field1151 & 0xFF) == 0) {
                if (Statics.field1099) {
                    return method1149(0, ((class57) this.field1164).field1130, arg0, this.field1151, arg1, this.field1156, this.field1152, 0, arg3, arg2, this);
                }
                return method1132(((class57) this.field1164).field1130, arg0, this.field1151, arg1, this.field1160, 0, arg3, arg2, this);
            }
            if (Statics.field1099) {
                return method1136(0, 0, ((class57) this.field1164).field1130, arg0, this.field1151, arg1, this.field1156, this.field1152, 0, arg3, arg2, this, this.field1147, arg4);
            }
            return method1135(0, 0, ((class57) this.field1164).field1130, arg0, this.field1151, arg1, this.field1160, 0, arg3, arg2, this, this.field1147, arg4);
        }
    }

    @ObfuscatedName("bm.ay()Z")
    public boolean method1177() {
        int var1 = this.field1148;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1150(var1, this.field1155);
            var2 = method1196(var1, this.field1155);
        }
        if (this.field1160 != var1 || this.field1156 != var3 || this.field1152 != var2) {
            if (this.field1160 < var1) {
                this.field1158 = 1;
                this.field1157 = var1 - this.field1160;
            } else if (this.field1160 > var1) {
                this.field1158 = -1;
                this.field1157 = this.field1160 - var1;
            } else {
                this.field1158 = 0;
            }
            if (this.field1156 < var3) {
                this.field1159 = 1;
                if (this.field1157 == 0 || this.field1157 > var3 - this.field1156) {
                    this.field1157 = var3 - this.field1156;
                }
            } else if (this.field1156 > var3) {
                this.field1159 = -1;
                if (this.field1157 == 0 || this.field1157 > this.field1156 - var3) {
                    this.field1157 = this.field1156 - var3;
                }
            } else {
                this.field1159 = 0;
            }
            if (this.field1152 < var2) {
                this.field1149 = 1;
                if (this.field1157 == 0 || this.field1157 > var2 - this.field1152) {
                    this.field1157 = var2 - this.field1152;
                }
            } else if (this.field1152 > var2) {
                this.field1149 = -1;
                if (this.field1157 == 0 || this.field1157 > this.field1152 - var2) {
                    this.field1157 = this.field1152 - var2;
                }
            } else {
                this.field1149 = 0;
            }
            return false;
        } else if (this.field1148 == Integer.MIN_VALUE) {
            this.field1148 = 0;
            this.field1152 = 0;
            this.field1156 = 0;
            this.field1160 = 0;
            this.method3334();
            return true;
        } else {
            this.method1112();
            return false;
        }
    }

    @ObfuscatedName("bm.au([B[IIIIIIILbm;)I")
    public static int method1128(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class59 arg8) {
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
        arg8.field1151 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bm.aa(I[B[IIIIIIIILbm;)I")
    public static int method1131(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10) {
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
        arg10.field1151 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bm.av([B[IIIIIIILbm;)I")
    public static int method1132(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class59 arg8) {
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
        arg8.field1151 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bm.aw(I[B[IIIIIIIILbm;)I")
    public static int method1149(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10) {
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
        arg10.field1151 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bm.al(II[B[IIIIIIILbm;II)I")
    public static int method1133(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10, int arg11, int arg12) {
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
        arg10.field1151 = arg4;
        return arg5;
    }

    @ObfuscatedName("bm.ar(II[B[IIIIIIIILbm;II)I")
    public static int method1134(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
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
        arg11.field1151 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bm.ax(II[B[IIIIIIILbm;II)I")
    public static int method1135(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10, int arg11, int arg12) {
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
        arg10.field1151 = arg4;
        return arg5;
    }

    @ObfuscatedName("bm.be(II[B[IIIIIIIILbm;II)I")
    public static int method1136(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
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
        arg11.field1151 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bm.bh([B[IIIIIIIILbm;)I")
    public static int method1137(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class59 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1156 += (var14 - arg3) * arg9.field1159;
        arg9.field1152 += (var14 - arg3) * arg9.field1149;
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
        arg9.field1160 = var12 >> 2;
        arg9.field1151 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bm.bn(I[B[IIIIIIIIIILbm;)I")
    public static int method1138(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class59 arg12) {
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
        arg12.field1160 += (var19 - arg4) * arg12.field1158;
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
        arg12.field1156 = var15 >> 2;
        arg12.field1152 = var16 >> 2;
        arg12.field1151 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bm.by([B[IIIIIIIILbm;)I")
    public static int method1139(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class59 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1156 += (var14 - arg3) * arg9.field1159;
        arg9.field1152 += (var14 - arg3) * arg9.field1149;
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
        arg9.field1160 = var12 >> 2;
        arg9.field1151 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bm.bg(I[B[IIIIIIIIIILbm;)I")
    public static int method1140(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class59 arg12) {
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
        arg12.field1160 += (var19 - arg4) * arg12.field1158;
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
        arg12.field1156 = var15 >> 2;
        arg12.field1152 = var16 >> 2;
        arg12.field1151 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bm.bb(II[B[IIIIIIIILbm;II)I")
    public static int method1185(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
        arg11.field1156 -= arg11.field1159 * arg5;
        arg11.field1152 -= arg11.field1149 * arg5;
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
        arg11.field1156 += arg11.field1159 * arg5;
        arg11.field1152 += arg11.field1149 * arg5;
        arg11.field1160 = arg6;
        arg11.field1151 = arg4;
        return arg5;
    }

    @ObfuscatedName("bm.bm(II[B[IIIIIIIIIILbm;II)I")
    public static int method1222(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class59 arg13, int arg14, int arg15) {
        arg13.field1160 -= arg13.field1158 * arg5;
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
        arg13.field1160 += arg13.field1158 * var27;
        arg13.field1156 = arg6;
        arg13.field1152 = arg7;
        arg13.field1151 = arg4;
        return var27;
    }

    @ObfuscatedName("bm.bq(II[B[IIIIIIIILbm;II)I")
    public static int method1143(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class59 arg11, int arg12, int arg13) {
        arg11.field1156 -= arg11.field1159 * arg5;
        arg11.field1152 -= arg11.field1149 * arg5;
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
        arg11.field1156 += arg11.field1159 * arg5;
        arg11.field1152 += arg11.field1149 * arg5;
        arg11.field1160 = arg6;
        arg11.field1151 = arg4;
        return arg5;
    }

    @ObfuscatedName("bm.br(II[B[IIIIIIIIIILbm;II)I")
    public static int method1144(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class59 arg13, int arg14, int arg15) {
        arg13.field1160 -= arg13.field1158 * arg5;
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
        arg13.field1160 += arg13.field1158 * var26;
        arg13.field1156 = arg6;
        arg13.field1152 = arg7;
        arg13.field1151 = arg4;
        return var26;
    }
}
