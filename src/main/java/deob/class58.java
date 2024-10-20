package deob;

@ObfuscatedName("bd")
public class class58 extends class60 {

    @ObfuscatedName("bd.n")
    public int field1149;

    @ObfuscatedName("bd.x")
    public int field1144;

    @ObfuscatedName("bd.k")
    public int field1146;

    @ObfuscatedName("bd.i")
    public int field1152;

    @ObfuscatedName("bd.d")
    public int field1147;

    @ObfuscatedName("bd.q")
    public int field1148;

    @ObfuscatedName("bd.m")
    public int field1143;

    @ObfuscatedName("bd.a")
    public int field1150;

    @ObfuscatedName("bd.e")
    public int field1151;

    @ObfuscatedName("bd.o")
    public int field1145;

    @ObfuscatedName("bd.v")
    public boolean field1153;

    @ObfuscatedName("bd.z")
    public int field1154;

    @ObfuscatedName("bd.j")
    public int field1155;

    @ObfuscatedName("bd.r")
    public int field1156;

    @ObfuscatedName("bd.c")
    public int field1157;

    @ObfuscatedName("bd.n(II)I")
    public static int method1196(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bd.x(II)I")
    public static int method1120(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("bd.ab()I")
    public int method1215() {
        int var1 = this.field1147 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1150 == 0) {
            var2 -= this.field1149 * var2 / (((class56) this.field1162).field1127.length << 8);
        } else if (this.field1150 >= 0) {
            var2 -= this.field1151 * var2 / ((class56) this.field1162).field1127.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class58(class56 arg0, int arg1, int arg2) {
        this.field1162 = arg0;
        this.field1151 = arg0.field1126;
        this.field1145 = arg0.field1128;
        this.field1153 = arg0.field1130;
        this.field1144 = arg1;
        this.field1146 = arg2;
        this.field1152 = 8192;
        this.field1149 = 0;
        this.method1116();
    }

    public class58(class56 arg0, int arg1, int arg2, int arg3) {
        this.field1162 = arg0;
        this.field1151 = arg0.field1126;
        this.field1145 = arg0.field1128;
        this.field1153 = arg0.field1130;
        this.field1144 = arg1;
        this.field1146 = arg2;
        this.field1152 = arg3;
        this.field1149 = 0;
        this.method1116();
    }

    @ObfuscatedName("bd.k(Lbv;II)Lbd;")
    public static class58 method1186(class56 arg0, int arg1, int arg2) {
        return arg0.field1127 == null || arg0.field1127.length == 0 ? null : new class58(arg0, (int) ((long) arg0.field1129 * 256L * (long) arg1 / (long) (Statics.field1082 * 100)), arg2 << 6);
    }

    @ObfuscatedName("bd.i(Lbv;III)Lbd;")
    public static class58 method1115(class56 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1127 == null || arg0.field1127.length == 0 ? null : new class58(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bd.d()V")
    public void method1116() {
        this.field1147 = this.field1146;
        this.field1148 = method1196(this.field1146, this.field1152);
        this.field1143 = method1120(this.field1146, this.field1152);
    }

    @ObfuscatedName("bd.e(I)V")
    public synchronized void method1117(int arg0) {
        this.field1150 = arg0;
    }

    @ObfuscatedName("bd.v(I)V")
    public synchronized void method1158(int arg0) {
        this.method1138(arg0 << 6, this.method1134());
    }

    @ObfuscatedName("bd.z(I)V")
    public synchronized void method1119(int arg0) {
        this.method1138(arg0, this.method1134());
    }

    @ObfuscatedName("bd.j(II)V")
    public synchronized void method1138(int arg0, int arg1) {
        this.field1146 = arg0;
        this.field1152 = arg1;
        this.field1154 = 0;
        this.method1116();
    }

    @ObfuscatedName("bd.r()I")
    public synchronized int method1121() {
        return this.field1146 == Integer.MIN_VALUE ? 0 : this.field1146;
    }

    @ObfuscatedName("bd.c()I")
    public synchronized int method1134() {
        return this.field1152 < 0 ? -1 : this.field1152;
    }

    @ObfuscatedName("bd.u(I)V")
    public synchronized void method1123(int arg0) {
        int var2 = ((class56) this.field1162).field1127.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1149 = arg0;
    }

    @ObfuscatedName("bd.h(Z)V")
    public synchronized void method1124(boolean arg0) {
        this.field1144 = (this.field1144 >>> 31) + (this.field1144 ^ this.field1144 >> 31);
        if (arg0) {
            this.field1144 = -this.field1144;
        }
    }

    @ObfuscatedName("bd.t()V")
    public void method1156() {
        if (this.field1154 == 0) {
            return;
        }
        if (this.field1146 == Integer.MIN_VALUE) {
            this.field1146 = 0;
        }
        this.field1154 = 0;
        this.method1116();
    }

    @ObfuscatedName("bd.f(II)V")
    public synchronized void method1202(int arg0, int arg1) {
        this.method1127(arg0, arg1, this.method1134());
    }

    @ObfuscatedName("bd.g(III)V")
    public synchronized void method1127(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1138(arg1, arg2);
            return;
        }
        int var4 = method1196(arg1, arg2);
        int var5 = method1120(arg1, arg2);
        if (this.field1148 == var4 && this.field1143 == var5) {
            this.field1154 = 0;
            return;
        }
        int var6 = arg1 - this.field1147;
        if (this.field1147 - arg1 > var6) {
            var6 = this.field1147 - arg1;
        }
        if (var4 - this.field1148 > var6) {
            var6 = var4 - this.field1148;
        }
        if (this.field1148 - var4 > var6) {
            var6 = this.field1148 - var4;
        }
        if (var5 - this.field1143 > var6) {
            var6 = var5 - this.field1143;
        }
        if (this.field1143 - var5 > var6) {
            var6 = this.field1143 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1154 = arg0;
        this.field1146 = arg1;
        this.field1152 = arg2;
        this.field1155 = (arg1 - this.field1147) / arg0;
        this.field1156 = (var4 - this.field1148) / arg0;
        this.field1157 = (var5 - this.field1143) / arg0;
    }

    @ObfuscatedName("bd.s(I)V")
    public synchronized void method1128(int arg0) {
        if (arg0 == 0) {
            this.method1119(0);
            this.method3277();
        } else if (this.field1148 == 0 && this.field1143 == 0) {
            this.field1154 = 0;
            this.field1146 = 0;
            this.field1147 = 0;
            this.method3277();
        } else {
            int var2 = -this.field1147;
            if (this.field1147 > var2) {
                var2 = this.field1147;
            }
            if (-this.field1148 > var2) {
                var2 = -this.field1148;
            }
            if (this.field1148 > var2) {
                var2 = this.field1148;
            }
            if (-this.field1143 > var2) {
                var2 = -this.field1143;
            }
            if (this.field1143 > var2) {
                var2 = this.field1143;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1154 = arg0;
            this.field1146 = Integer.MIN_VALUE;
            this.field1155 = -this.field1147 / arg0;
            this.field1156 = -this.field1148 / arg0;
            this.field1157 = -this.field1143 / arg0;
        }
    }

    @ObfuscatedName("bd.y(I)V")
    public synchronized void method1155(int arg0) {
        if (this.field1144 < 0) {
            this.field1144 = -arg0;
        } else {
            this.field1144 = arg0;
        }
    }

    @ObfuscatedName("bd.p()I")
    public synchronized int method1136() {
        return this.field1144 < 0 ? -this.field1144 : this.field1144;
    }

    @ObfuscatedName("bd.b()Z")
    public boolean method1114() {
        return this.field1149 < 0 || this.field1149 >= ((class56) this.field1162).field1127.length << 8;
    }

    @ObfuscatedName("bd.l()Z")
    public boolean method1132() {
        return this.field1154 != 0;
    }

    @ObfuscatedName("bd.q()Lbn;")
    public class60 method961() {
        return null;
    }

    @ObfuscatedName("bd.m()Lbn;")
    public class60 method962() {
        return null;
    }

    @ObfuscatedName("bd.a()I")
    public int method967() {
        return this.field1146 == 0 && this.field1154 == 0 ? 0 : 1;
    }

    @ObfuscatedName("bd.w([III)V")
    public synchronized void method963(int[] arg0, int arg1, int arg2) {
        if (this.field1146 == 0 && this.field1154 == 0) {
            this.method966(arg2);
            return;
        }
        class56 var4 = (class56) this.field1162;
        int var5 = this.field1151 << 8;
        int var6 = this.field1145 << 8;
        int var7 = var4.field1127.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1150 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1149 < 0) {
            if (this.field1144 <= 0) {
                this.method1156();
                this.method3277();
                return;
            }
            this.field1149 = 0;
        }
        if (this.field1149 >= var7) {
            if (this.field1144 >= 0) {
                this.method1156();
                this.method3277();
                return;
            }
            this.field1149 = var7 - 1;
        }
        if (this.field1150 >= 0) {
            if (this.field1150 > 0) {
                if (this.field1153) {
                    label131: {
                        if (this.field1144 < 0) {
                            var9 = this.method1198(arg0, arg1, var5, var10, var4.field1127[this.field1151]);
                            if (this.field1149 >= var5) {
                                return;
                            }
                            this.field1149 = var5 + var5 - 1 - this.field1149;
                            this.field1144 = -this.field1144;
                            if (--this.field1150 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method1135(arg0, var9, var6, var10, var4.field1127[this.field1145 - 1]);
                            if (this.field1149 < var6) {
                                return;
                            }
                            this.field1149 = var6 + var6 - 1 - this.field1149;
                            this.field1144 = -this.field1144;
                            if (--this.field1150 == 0) {
                                break;
                            }
                            var9 = this.method1198(arg0, var9, var5, var10, var4.field1127[this.field1151]);
                            if (this.field1149 >= var5) {
                                return;
                            }
                            this.field1149 = var5 + var5 - 1 - this.field1149;
                            this.field1144 = -this.field1144;
                        } while (--this.field1150 != 0);
                    }
                } else if (this.field1144 < 0) {
                    while (true) {
                        var9 = this.method1198(arg0, var9, var5, var10, var4.field1127[this.field1145 - 1]);
                        if (this.field1149 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field1149) / var8;
                        if (var12 >= this.field1150) {
                            this.field1149 += this.field1150 * var8;
                            this.field1150 = 0;
                            break;
                        }
                        this.field1149 += var8 * var12;
                        this.field1150 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method1135(arg0, var9, var6, var10, var4.field1127[this.field1151]);
                        if (this.field1149 < var6) {
                            return;
                        }
                        int var13 = (this.field1149 - var5) / var8;
                        if (var13 >= this.field1150) {
                            this.field1149 -= this.field1150 * var8;
                            this.field1150 = 0;
                            break;
                        }
                        this.field1149 -= var8 * var13;
                        this.field1150 -= var13;
                    }
                }
            }
            if (this.field1144 < 0) {
                this.method1198(arg0, var9, 0, var10, 0);
                if (this.field1149 < 0) {
                    this.field1149 = -1;
                    this.method1156();
                    this.method3277();
                }
            } else {
                this.method1135(arg0, var9, var7, var10, 0);
                if (this.field1149 >= var7) {
                    this.field1149 = var7;
                    this.method1156();
                    this.method3277();
                }
            }
        } else if (this.field1153) {
            if (this.field1144 < 0) {
                var9 = this.method1198(arg0, arg1, var5, var10, var4.field1127[this.field1151]);
                if (this.field1149 >= var5) {
                    return;
                }
                this.field1149 = var5 + var5 - 1 - this.field1149;
                this.field1144 = -this.field1144;
            }
            while (true) {
                int var11 = this.method1135(arg0, var9, var6, var10, var4.field1127[this.field1145 - 1]);
                if (this.field1149 < var6) {
                    return;
                }
                this.field1149 = var6 + var6 - 1 - this.field1149;
                this.field1144 = -this.field1144;
                var9 = this.method1198(arg0, var11, var5, var10, var4.field1127[this.field1151]);
                if (this.field1149 >= var5) {
                    return;
                }
                this.field1149 = var5 + var5 - 1 - this.field1149;
                this.field1144 = -this.field1144;
            }
        } else if (this.field1144 < 0) {
            while (true) {
                var9 = this.method1198(arg0, var9, var5, var10, var4.field1127[this.field1145 - 1]);
                if (this.field1149 >= var5) {
                    return;
                }
                this.field1149 = var6 - 1 - (var6 - 1 - this.field1149) % var8;
            }
        } else {
            while (true) {
                var9 = this.method1135(arg0, var9, var6, var10, var4.field1127[this.field1151]);
                if (this.field1149 < var6) {
                    return;
                }
                this.field1149 = (this.field1149 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("bd.o(I)V")
    public synchronized void method966(int arg0) {
        if (this.field1154 > 0) {
            if (arg0 >= this.field1154) {
                if (this.field1146 == Integer.MIN_VALUE) {
                    this.field1146 = 0;
                    this.field1143 = 0;
                    this.field1148 = 0;
                    this.field1147 = 0;
                    this.method3277();
                    arg0 = this.field1154;
                }
                this.field1154 = 0;
                this.method1116();
            } else {
                this.field1147 += this.field1155 * arg0;
                this.field1148 += this.field1156 * arg0;
                this.field1143 += this.field1157 * arg0;
                this.field1154 -= arg0;
            }
        }
        class56 var2 = (class56) this.field1162;
        int var3 = this.field1151 << 8;
        int var4 = this.field1145 << 8;
        int var5 = var2.field1127.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1150 = 0;
        }
        if (this.field1149 < 0) {
            if (this.field1144 <= 0) {
                this.method1156();
                this.method3277();
                return;
            }
            this.field1149 = 0;
        }
        if (this.field1149 >= var5) {
            if (this.field1144 >= 0) {
                this.method1156();
                this.method3277();
                return;
            }
            this.field1149 = var5 - 1;
        }
        this.field1149 += this.field1144 * arg0;
        if (this.field1150 >= 0) {
            if (this.field1150 > 0) {
                if (this.field1153) {
                    label121: {
                        if (this.field1144 < 0) {
                            if (this.field1149 >= var3) {
                                return;
                            }
                            this.field1149 = var3 + var3 - 1 - this.field1149;
                            this.field1144 = -this.field1144;
                            if (--this.field1150 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1149 < var4) {
                                return;
                            }
                            this.field1149 = var4 + var4 - 1 - this.field1149;
                            this.field1144 = -this.field1144;
                            if (--this.field1150 == 0) {
                                break;
                            }
                            if (this.field1149 >= var3) {
                                return;
                            }
                            this.field1149 = var3 + var3 - 1 - this.field1149;
                            this.field1144 = -this.field1144;
                        } while (--this.field1150 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1144 < 0) {
                            if (this.field1149 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field1149) / var6;
                            if (var7 >= this.field1150) {
                                this.field1149 += this.field1150 * var6;
                                this.field1150 = 0;
                                break label153;
                            }
                            this.field1149 += var6 * var7;
                            this.field1150 -= var7;
                        } else if (this.field1149 >= var4) {
                            int var8 = (this.field1149 - var3) / var6;
                            if (var8 >= this.field1150) {
                                this.field1149 -= this.field1150 * var6;
                                this.field1150 = 0;
                                break label153;
                            }
                            this.field1149 -= var6 * var8;
                            this.field1150 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1144 < 0) {
                if (this.field1149 < 0) {
                    this.field1149 = -1;
                    this.method1156();
                    this.method3277();
                }
            } else if (this.field1149 >= var5) {
                this.field1149 = var5;
                this.method1156();
                this.method3277();
            }
        } else if (this.field1153) {
            if (this.field1144 < 0) {
                if (this.field1149 >= var3) {
                    return;
                }
                this.field1149 = var3 + var3 - 1 - this.field1149;
                this.field1144 = -this.field1144;
            }
            while (this.field1149 >= var4) {
                this.field1149 = var4 + var4 - 1 - this.field1149;
                this.field1144 = -this.field1144;
                if (this.field1149 >= var3) {
                    return;
                }
                this.field1149 = var3 + var3 - 1 - this.field1149;
                this.field1144 = -this.field1144;
            }
        } else if (this.field1144 < 0) {
            if (this.field1149 >= var3) {
                return;
            }
            this.field1149 = var4 - 1 - (var4 - 1 - this.field1149) % var6;
        } else if (this.field1149 >= var4) {
            this.field1149 = (this.field1149 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("bd.al([IIIII)I")
    public int method1135(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1154 > 0) {
                int var6 = this.field1154 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1154 += arg1;
                if (this.field1144 == 256 && (this.field1149 & 0xFF) == 0) {
                    if (Statics.field1071) {
                        arg1 = method1147(0, ((class56) this.field1162).field1127, arg0, this.field1149, arg1, this.field1148, this.field1143, this.field1156, this.field1157, 0, var6, arg2, this);
                    } else {
                        arg1 = method1176(((class56) this.field1162).field1127, arg0, this.field1149, arg1, this.field1147, this.field1155, 0, var6, arg2, this);
                    }
                } else if (Statics.field1071) {
                    arg1 = method1151(0, 0, ((class56) this.field1162).field1127, arg0, this.field1149, arg1, this.field1148, this.field1143, this.field1156, this.field1157, 0, var6, arg2, this, this.field1144, arg4);
                } else {
                    arg1 = method1150(0, 0, ((class56) this.field1162).field1127, arg0, this.field1149, arg1, this.field1147, this.field1155, 0, var6, arg2, this, this.field1144, arg4);
                }
                this.field1154 -= arg1;
                if (this.field1154 != 0) {
                    return arg1;
                }
                if (!this.method1225()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1144 == 256 && (this.field1149 & 0xFF) == 0) {
                if (Statics.field1071) {
                    return method1139(0, ((class56) this.field1162).field1127, arg0, this.field1149, arg1, this.field1148, this.field1143, 0, arg3, arg2, this);
                }
                return method1164(((class56) this.field1162).field1127, arg0, this.field1149, arg1, this.field1147, 0, arg3, arg2, this);
            }
            if (Statics.field1071) {
                return method1143(0, 0, ((class56) this.field1162).field1127, arg0, this.field1149, arg1, this.field1148, this.field1143, 0, arg3, arg2, this, this.field1144, arg4);
            }
            return method1142(0, 0, ((class56) this.field1162).field1127, arg0, this.field1149, arg1, this.field1147, 0, arg3, arg2, this, this.field1144, arg4);
        }
    }

    @ObfuscatedName("bd.aa([IIIII)I")
    public int method1198(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1154 > 0) {
                int var6 = this.field1154 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1154 += arg1;
                if (this.field1144 == -256 && (this.field1149 & 0xFF) == 0) {
                    if (Statics.field1071) {
                        arg1 = method1149(0, ((class56) this.field1162).field1127, arg0, this.field1149, arg1, this.field1148, this.field1143, this.field1156, this.field1157, 0, var6, arg2, this);
                    } else {
                        arg1 = method1162(((class56) this.field1162).field1127, arg0, this.field1149, arg1, this.field1147, this.field1155, 0, var6, arg2, this);
                    }
                } else if (Statics.field1071) {
                    arg1 = method1153(0, 0, ((class56) this.field1162).field1127, arg0, this.field1149, arg1, this.field1148, this.field1143, this.field1156, this.field1157, 0, var6, arg2, this, this.field1144, arg4);
                } else {
                    arg1 = method1152(0, 0, ((class56) this.field1162).field1127, arg0, this.field1149, arg1, this.field1147, this.field1155, 0, var6, arg2, this, this.field1144, arg4);
                }
                this.field1154 -= arg1;
                if (this.field1154 != 0) {
                    return arg1;
                }
                if (!this.method1225()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1144 == -256 && (this.field1149 & 0xFF) == 0) {
                if (Statics.field1071) {
                    return method1144(0, ((class56) this.field1162).field1127, arg0, this.field1149, arg1, this.field1148, this.field1143, 0, arg3, arg2, this);
                }
                return method1140(((class56) this.field1162).field1127, arg0, this.field1149, arg1, this.field1147, 0, arg3, arg2, this);
            }
            if (Statics.field1071) {
                return method1145(0, 0, ((class56) this.field1162).field1127, arg0, this.field1149, arg1, this.field1148, this.field1143, 0, arg3, arg2, this, this.field1144, arg4);
            }
            return method1112(0, 0, ((class56) this.field1162).field1127, arg0, this.field1149, arg1, this.field1147, 0, arg3, arg2, this, this.field1144, arg4);
        }
    }

    @ObfuscatedName("bd.ae()Z")
    public boolean method1225() {
        int var1 = this.field1146;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1196(var1, this.field1152);
            var2 = method1120(var1, this.field1152);
        }
        if (this.field1147 != var1 || this.field1148 != var3 || this.field1143 != var2) {
            if (this.field1147 < var1) {
                this.field1155 = 1;
                this.field1154 = var1 - this.field1147;
            } else if (this.field1147 > var1) {
                this.field1155 = -1;
                this.field1154 = this.field1147 - var1;
            } else {
                this.field1155 = 0;
            }
            if (this.field1148 < var3) {
                this.field1156 = 1;
                if (this.field1154 == 0 || this.field1154 > var3 - this.field1148) {
                    this.field1154 = var3 - this.field1148;
                }
            } else if (this.field1148 > var3) {
                this.field1156 = -1;
                if (this.field1154 == 0 || this.field1154 > this.field1148 - var3) {
                    this.field1154 = this.field1148 - var3;
                }
            } else {
                this.field1156 = 0;
            }
            if (this.field1143 < var2) {
                this.field1157 = 1;
                if (this.field1154 == 0 || this.field1154 > var2 - this.field1143) {
                    this.field1154 = var2 - this.field1143;
                }
            } else if (this.field1143 > var2) {
                this.field1157 = -1;
                if (this.field1154 == 0 || this.field1154 > this.field1143 - var2) {
                    this.field1154 = this.field1143 - var2;
                }
            } else {
                this.field1157 = 0;
            }
            return false;
        } else if (this.field1146 == Integer.MIN_VALUE) {
            this.field1146 = 0;
            this.field1143 = 0;
            this.field1148 = 0;
            this.field1147 = 0;
            this.method3277();
            return true;
        } else {
            this.method1116();
            return false;
        }
    }

    @ObfuscatedName("bd.ai([B[IIIIIIILbd;)I")
    public static int method1164(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
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
        arg8.field1149 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bd.as(I[B[IIIIIIIILbd;)I")
    public static int method1139(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
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
        arg10.field1149 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bd.aj([B[IIIIIIILbd;)I")
    public static int method1140(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8) {
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
        arg8.field1149 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("bd.ao(I[B[IIIIIIIILbd;)I")
    public static int method1144(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10) {
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
        arg10.field1149 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("bd.ag(II[B[IIIIIIILbd;II)I")
    public static int method1142(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
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
        arg10.field1149 = arg4;
        return arg5;
    }

    @ObfuscatedName("bd.aq(II[B[IIIIIIIILbd;II)I")
    public static int method1143(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
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
        arg11.field1149 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bd.an(II[B[IIIIIIILbd;II)I")
    public static int method1112(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
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
        arg10.field1149 = arg4;
        return arg5;
    }

    @ObfuscatedName("bd.am(II[B[IIIIIIIILbd;II)I")
    public static int method1145(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
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
        arg11.field1149 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("bd.ad([B[IIIIIIIILbd;)I")
    public static int method1176(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1148 += (var14 - arg3) * arg9.field1156;
        arg9.field1143 += (var14 - arg3) * arg9.field1157;
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
        arg9.field1147 = var12 >> 2;
        arg9.field1149 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bd.ah(I[B[IIIIIIIIIILbd;)I")
    public static int method1147(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
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
        arg12.field1147 += (var19 - arg4) * arg12.field1155;
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
        arg12.field1148 = var15 >> 2;
        arg12.field1143 = var16 >> 2;
        arg12.field1149 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bd.bf([B[IIIIIIIILbd;)I")
    public static int method1162(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class58 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1148 += (var14 - arg3) * arg9.field1156;
        arg9.field1143 += (var14 - arg3) * arg9.field1157;
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
        arg9.field1147 = var12 >> 2;
        arg9.field1149 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("bd.bx(I[B[IIIIIIIIIILbd;)I")
    public static int method1149(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class58 arg12) {
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
        arg12.field1147 += (var19 - arg4) * arg12.field1155;
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
        arg12.field1148 = var15 >> 2;
        arg12.field1143 = var16 >> 2;
        arg12.field1149 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("bd.bb(II[B[IIIIIIIILbd;II)I")
    public static int method1150(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field1148 -= arg11.field1156 * arg5;
        arg11.field1143 -= arg11.field1157 * arg5;
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
        arg11.field1148 += arg11.field1156 * arg5;
        arg11.field1143 += arg11.field1157 * arg5;
        arg11.field1147 = arg6;
        arg11.field1149 = arg4;
        return arg5;
    }

    @ObfuscatedName("bd.bv(II[B[IIIIIIIIIILbd;II)I")
    public static int method1151(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field1147 -= arg13.field1155 * arg5;
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
        arg13.field1147 += arg13.field1155 * var27;
        arg13.field1148 = arg6;
        arg13.field1143 = arg7;
        arg13.field1149 = arg4;
        return var27;
    }

    @ObfuscatedName("bd.bi(II[B[IIIIIIIILbd;II)I")
    public static int method1152(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, int arg12, int arg13) {
        arg11.field1148 -= arg11.field1156 * arg5;
        arg11.field1143 -= arg11.field1157 * arg5;
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
        arg11.field1148 += arg11.field1156 * arg5;
        arg11.field1143 += arg11.field1157 * arg5;
        arg11.field1147 = arg6;
        arg11.field1149 = arg4;
        return arg5;
    }

    @ObfuscatedName("bd.bd(II[B[IIIIIIIIIILbd;II)I")
    public static int method1153(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class58 arg13, int arg14, int arg15) {
        arg13.field1147 -= arg13.field1155 * arg5;
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
        arg13.field1147 += arg13.field1155 * var26;
        arg13.field1148 = arg6;
        arg13.field1143 = arg7;
        arg13.field1149 = arg4;
        return var26;
    }
}
