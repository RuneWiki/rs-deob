package deob;

@ObfuscatedName("et")
public class class146 extends class129 {

    @ObfuscatedName("et.i")
    public int field2212;

    @ObfuscatedName("et.e")
    public int field2202;

    @ObfuscatedName("et.a")
    public int field2213;

    @ObfuscatedName("et.g")
    public int field2204;

    @ObfuscatedName("et.w")
    public int field2205;

    @ObfuscatedName("et.v")
    public int field2206;

    @ObfuscatedName("et.u")
    public int field2207;

    @ObfuscatedName("et.m")
    public int field2203;

    @ObfuscatedName("et.b")
    public int field2208;

    @ObfuscatedName("et.f")
    public int field2210;

    @ObfuscatedName("et.d")
    public boolean field2211;

    @ObfuscatedName("et.x")
    public int field2201;

    @ObfuscatedName("et.z")
    public int field2209;

    @ObfuscatedName("et.o")
    public int field2214;

    @ObfuscatedName("et.c")
    public int field2215;

    @ObfuscatedName("et.ak(II)I")
    public static int method2067(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("et.ap(II)I")
    public static int method2138(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("et.r()I")
    public int method1497() {
        int var1 = this.field2205 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2203 == 0) {
            var2 -= this.field2212 * var2 / (((class145) this.field1641).field2199.length << 8);
        } else if (this.field2203 >= 0) {
            var2 -= this.field2208 * var2 / ((class145) this.field1641).field2199.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class146(class145 arg0, int arg1, int arg2) {
        this.field1641 = arg0;
        this.field2208 = arg0.field2198;
        this.field2210 = arg0.field2197;
        this.field2211 = arg0.field2200;
        this.field2202 = arg1;
        this.field2213 = arg2;
        this.field2204 = 8192;
        this.field2212 = 0;
        this.method2055();
    }

    public class146(class145 arg0, int arg1, int arg2, int arg3) {
        this.field1641 = arg0;
        this.field2208 = arg0.field2198;
        this.field2210 = arg0.field2197;
        this.field2211 = arg0.field2200;
        this.field2202 = arg1;
        this.field2213 = arg2;
        this.field2204 = arg3;
        this.field2212 = 0;
        this.method2055();
    }

    @ObfuscatedName("et.ai(Lee;II)Let;")
    public static class146 method2094(class145 arg0, int arg1, int arg2) {
        return arg0.field2199 == null || arg0.field2199.length == 0 ? null : new class146(arg0, (int) ((long) arg0.field2196 * 256L * (long) arg1 / (long) (Statics.field823 * 100)), arg2 << 6);
    }

    @ObfuscatedName("et.ae(Lee;III)Let;")
    public static class146 method2133(class145 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2199 == null || arg0.field2199.length == 0 ? null : new class146(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("et.ad()V")
    public void method2055() {
        this.field2205 = this.field2213;
        this.field2206 = method2067(this.field2213, this.field2204);
        this.field2207 = method2138(this.field2213, this.field2204);
    }

    @ObfuscatedName("et.am(I)V")
    public synchronized void method2056(int arg0) {
        this.field2203 = arg0;
    }

    @ObfuscatedName("et.ah(I)V")
    public synchronized void method2073(int arg0) {
        this.method2058(arg0 << 6, this.method2144());
    }

    @ObfuscatedName("et.au(I)V")
    public synchronized void method2151(int arg0) {
        this.method2058(arg0, this.method2144());
    }

    @ObfuscatedName("et.ac(II)V")
    public synchronized void method2058(int arg0, int arg1) {
        this.field2213 = arg0;
        this.field2204 = arg1;
        this.field2201 = 0;
        this.method2055();
    }

    @ObfuscatedName("et.at()I")
    public synchronized int method2059() {
        return this.field2213 == Integer.MIN_VALUE ? 0 : this.field2213;
    }

    @ObfuscatedName("et.aq()I")
    public synchronized int method2144() {
        return this.field2204 < 0 ? -1 : this.field2204;
    }

    @ObfuscatedName("et.ar(I)V")
    public synchronized void method2061(int arg0) {
        int var2 = ((class145) this.field1641).field2199.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2212 = arg0;
    }

    @ObfuscatedName("et.aa(Z)V")
    public synchronized void method2062(boolean arg0) {
        this.field2202 = (this.field2202 >>> 31) + (this.field2202 ^ this.field2202 >> 31);
        if (arg0) {
            this.field2202 = -this.field2202;
        }
    }

    @ObfuscatedName("et.ay()V")
    public void method2063() {
        if (this.field2201 == 0) {
            return;
        }
        if (this.field2213 == Integer.MIN_VALUE) {
            this.field2213 = 0;
        }
        this.field2201 = 0;
        this.method2055();
    }

    @ObfuscatedName("et.ax(II)V")
    public synchronized void method2064(int arg0, int arg1) {
        this.method2065(arg0, arg1, this.method2144());
    }

    @ObfuscatedName("et.av(III)V")
    public synchronized void method2065(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2058(arg1, arg2);
            return;
        }
        int var4 = method2067(arg1, arg2);
        int var5 = method2138(arg1, arg2);
        if (this.field2206 == var4 && this.field2207 == var5) {
            this.field2201 = 0;
            return;
        }
        int var6 = arg1 - this.field2205;
        if (this.field2205 - arg1 > var6) {
            var6 = this.field2205 - arg1;
        }
        if (var4 - this.field2206 > var6) {
            var6 = var4 - this.field2206;
        }
        if (this.field2206 - var4 > var6) {
            var6 = this.field2206 - var4;
        }
        if (var5 - this.field2207 > var6) {
            var6 = var5 - this.field2207;
        }
        if (this.field2207 - var5 > var6) {
            var6 = this.field2207 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field2201 = arg0;
        this.field2213 = arg1;
        this.field2204 = arg2;
        this.field2209 = (arg1 - this.field2205) / arg0;
        this.field2214 = (var4 - this.field2206) / arg0;
        this.field2215 = (var5 - this.field2207) / arg0;
    }

    @ObfuscatedName("et.az(I)V")
    public synchronized void method2075(int arg0) {
        if (arg0 == 0) {
            this.method2151(0);
            this.method1307();
        } else if (this.field2206 == 0 && this.field2207 == 0) {
            this.field2201 = 0;
            this.field2213 = 0;
            this.field2205 = 0;
            this.method1307();
        } else {
            int var2 = -this.field2205;
            if (this.field2205 > var2) {
                var2 = this.field2205;
            }
            if (-this.field2206 > var2) {
                var2 = -this.field2206;
            }
            if (this.field2206 > var2) {
                var2 = this.field2206;
            }
            if (-this.field2207 > var2) {
                var2 = -this.field2207;
            }
            if (this.field2207 > var2) {
                var2 = this.field2207;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2201 = arg0;
            this.field2213 = Integer.MIN_VALUE;
            this.field2209 = -this.field2205 / arg0;
            this.field2214 = -this.field2206 / arg0;
            this.field2215 = -this.field2207 / arg0;
        }
    }

    @ObfuscatedName("et.al(I)V")
    public synchronized void method2128(int arg0) {
        if (this.field2202 < 0) {
            this.field2202 = -arg0;
        } else {
            this.field2202 = arg0;
        }
    }

    @ObfuscatedName("et.ag()I")
    public synchronized int method2068() {
        return this.field2202 < 0 ? -this.field2202 : this.field2202;
    }

    @ObfuscatedName("et.as()Z")
    public boolean method2069() {
        return this.field2212 < 0 || this.field2212 >= ((class145) this.field1641).field2199.length << 8;
    }

    @ObfuscatedName("et.ab()Z")
    public boolean method2070() {
        return this.field2201 != 0;
    }

    @ObfuscatedName("et.l()Ldb;")
    public class129 method1512() {
        return null;
    }

    @ObfuscatedName("et.i()Ldb;")
    public class129 method1493() {
        return null;
    }

    @ObfuscatedName("et.e()I")
    public int method1504() {
        return this.field2213 == 0 && this.field2201 == 0 ? 0 : 1;
    }

    @ObfuscatedName("et.g([III)V")
    public synchronized void method1499(int[] arg0, int arg1, int arg2) {
        if (this.field2213 == 0 && this.field2201 == 0) {
            this.method1500(arg2);
            return;
        }
        class145 var4 = (class145) this.field1641;
        int var5 = this.field2208 << 8;
        int var6 = this.field2210 << 8;
        int var7 = var4.field2199.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field2203 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field2212 < 0) {
            if (this.field2202 <= 0) {
                this.method2063();
                this.method1307();
                return;
            }
            this.field2212 = 0;
        }
        if (this.field2212 >= var7) {
            if (this.field2202 >= 0) {
                this.method2063();
                this.method1307();
                return;
            }
            this.field2212 = var7 - 1;
        }
        if (this.field2203 >= 0) {
            if (this.field2203 > 0) {
                if (this.field2211) {
                    label131: {
                        if (this.field2202 < 0) {
                            var9 = this.method2123(arg0, arg1, var5, var10, var4.field2199[this.field2208]);
                            if (this.field2212 >= var5) {
                                return;
                            }
                            this.field2212 = var5 + var5 - 1 - this.field2212;
                            this.field2202 = -this.field2202;
                            if (--this.field2203 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2161(arg0, var9, var6, var10, var4.field2199[this.field2210 - 1]);
                            if (this.field2212 < var6) {
                                return;
                            }
                            this.field2212 = var6 + var6 - 1 - this.field2212;
                            this.field2202 = -this.field2202;
                            if (--this.field2203 == 0) {
                                break;
                            }
                            var9 = this.method2123(arg0, var9, var5, var10, var4.field2199[this.field2208]);
                            if (this.field2212 >= var5) {
                                return;
                            }
                            this.field2212 = var5 + var5 - 1 - this.field2212;
                            this.field2202 = -this.field2202;
                        } while (--this.field2203 != 0);
                    }
                } else if (this.field2202 < 0) {
                    while (true) {
                        var9 = this.method2123(arg0, var9, var5, var10, var4.field2199[this.field2210 - 1]);
                        if (this.field2212 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field2212) / var8;
                        if (var12 >= this.field2203) {
                            this.field2212 += this.field2203 * var8;
                            this.field2203 = 0;
                            break;
                        }
                        this.field2212 += var8 * var12;
                        this.field2203 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2161(arg0, var9, var6, var10, var4.field2199[this.field2208]);
                        if (this.field2212 < var6) {
                            return;
                        }
                        int var13 = (this.field2212 - var5) / var8;
                        if (var13 >= this.field2203) {
                            this.field2212 -= this.field2203 * var8;
                            this.field2203 = 0;
                            break;
                        }
                        this.field2212 -= var8 * var13;
                        this.field2203 -= var13;
                    }
                }
            }
            if (this.field2202 < 0) {
                this.method2123(arg0, var9, 0, var10, 0);
                if (this.field2212 < 0) {
                    this.field2212 = -1;
                    this.method2063();
                    this.method1307();
                }
            } else {
                this.method2161(arg0, var9, var7, var10, 0);
                if (this.field2212 >= var7) {
                    this.field2212 = var7;
                    this.method2063();
                    this.method1307();
                }
            }
        } else if (this.field2211) {
            if (this.field2202 < 0) {
                var9 = this.method2123(arg0, arg1, var5, var10, var4.field2199[this.field2208]);
                if (this.field2212 >= var5) {
                    return;
                }
                this.field2212 = var5 + var5 - 1 - this.field2212;
                this.field2202 = -this.field2202;
            }
            while (true) {
                int var11 = this.method2161(arg0, var9, var6, var10, var4.field2199[this.field2210 - 1]);
                if (this.field2212 < var6) {
                    return;
                }
                this.field2212 = var6 + var6 - 1 - this.field2212;
                this.field2202 = -this.field2202;
                var9 = this.method2123(arg0, var11, var5, var10, var4.field2199[this.field2208]);
                if (this.field2212 >= var5) {
                    return;
                }
                this.field2212 = var5 + var5 - 1 - this.field2212;
                this.field2202 = -this.field2202;
            }
        } else if (this.field2202 < 0) {
            while (true) {
                var9 = this.method2123(arg0, var9, var5, var10, var4.field2199[this.field2210 - 1]);
                if (this.field2212 >= var5) {
                    return;
                }
                this.field2212 = var6 - 1 - (var6 - 1 - this.field2212) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2161(arg0, var9, var6, var10, var4.field2199[this.field2208]);
                if (this.field2212 < var6) {
                    return;
                }
                this.field2212 = (this.field2212 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("et.w(I)V")
    public synchronized void method1500(int arg0) {
        if (this.field2201 > 0) {
            if (arg0 >= this.field2201) {
                if (this.field2213 == Integer.MIN_VALUE) {
                    this.field2213 = 0;
                    this.field2207 = 0;
                    this.field2206 = 0;
                    this.field2205 = 0;
                    this.method1307();
                    arg0 = this.field2201;
                }
                this.field2201 = 0;
                this.method2055();
            } else {
                this.field2205 += this.field2209 * arg0;
                this.field2206 += this.field2214 * arg0;
                this.field2207 += this.field2215 * arg0;
                this.field2201 -= arg0;
            }
        }
        class145 var2 = (class145) this.field1641;
        int var3 = this.field2208 << 8;
        int var4 = this.field2210 << 8;
        int var5 = var2.field2199.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2203 = 0;
        }
        if (this.field2212 < 0) {
            if (this.field2202 <= 0) {
                this.method2063();
                this.method1307();
                return;
            }
            this.field2212 = 0;
        }
        if (this.field2212 >= var5) {
            if (this.field2202 >= 0) {
                this.method2063();
                this.method1307();
                return;
            }
            this.field2212 = var5 - 1;
        }
        this.field2212 += this.field2202 * arg0;
        if (this.field2203 >= 0) {
            if (this.field2203 > 0) {
                if (this.field2211) {
                    label121: {
                        if (this.field2202 < 0) {
                            if (this.field2212 >= var3) {
                                return;
                            }
                            this.field2212 = var3 + var3 - 1 - this.field2212;
                            this.field2202 = -this.field2202;
                            if (--this.field2203 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field2212 < var4) {
                                return;
                            }
                            this.field2212 = var4 + var4 - 1 - this.field2212;
                            this.field2202 = -this.field2202;
                            if (--this.field2203 == 0) {
                                break;
                            }
                            if (this.field2212 >= var3) {
                                return;
                            }
                            this.field2212 = var3 + var3 - 1 - this.field2212;
                            this.field2202 = -this.field2202;
                        } while (--this.field2203 != 0);
                    }
                } else {
                    label153: {
                        if (this.field2202 < 0) {
                            if (this.field2212 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field2212) / var6;
                            if (var7 >= this.field2203) {
                                this.field2212 += this.field2203 * var6;
                                this.field2203 = 0;
                                break label153;
                            }
                            this.field2212 += var6 * var7;
                            this.field2203 -= var7;
                        } else if (this.field2212 >= var4) {
                            int var8 = (this.field2212 - var3) / var6;
                            if (var8 >= this.field2203) {
                                this.field2212 -= this.field2203 * var6;
                                this.field2203 = 0;
                                break label153;
                            }
                            this.field2212 -= var6 * var8;
                            this.field2203 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field2202 < 0) {
                if (this.field2212 < 0) {
                    this.field2212 = -1;
                    this.method2063();
                    this.method1307();
                }
            } else if (this.field2212 >= var5) {
                this.field2212 = var5;
                this.method2063();
                this.method1307();
            }
        } else if (this.field2211) {
            if (this.field2202 < 0) {
                if (this.field2212 >= var3) {
                    return;
                }
                this.field2212 = var3 + var3 - 1 - this.field2212;
                this.field2202 = -this.field2202;
            }
            while (this.field2212 >= var4) {
                this.field2212 = var4 + var4 - 1 - this.field2212;
                this.field2202 = -this.field2202;
                if (this.field2212 >= var3) {
                    return;
                }
                this.field2212 = var3 + var3 - 1 - this.field2212;
                this.field2202 = -this.field2202;
            }
        } else if (this.field2202 < 0) {
            if (this.field2212 >= var3) {
                return;
            }
            this.field2212 = var4 - 1 - (var4 - 1 - this.field2212) % var6;
        } else if (this.field2212 >= var4) {
            this.field2212 = (this.field2212 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("et.af([IIIII)I")
    public int method2161(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2201 > 0) {
                int var6 = this.field2201 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2201 += arg1;
                if (this.field2202 == 256 && (this.field2212 & 0xFF) == 0) {
                    if (Statics.field251) {
                        arg1 = method2117(0, ((class145) this.field1641).field2199, arg0, this.field2212, arg1, this.field2206, this.field2207, this.field2214, this.field2215, 0, var6, arg2, this);
                    } else {
                        arg1 = method2053(((class145) this.field1641).field2199, arg0, this.field2212, arg1, this.field2205, this.field2209, 0, var6, arg2, this);
                    }
                } else if (Statics.field251) {
                    arg1 = method2087(0, 0, ((class145) this.field1641).field2199, arg0, this.field2212, arg1, this.field2206, this.field2207, this.field2214, this.field2215, 0, var6, arg2, this, this.field2202, arg4);
                } else {
                    arg1 = method2086(0, 0, ((class145) this.field1641).field2199, arg0, this.field2212, arg1, this.field2205, this.field2209, 0, var6, arg2, this, this.field2202, arg4);
                }
                this.field2201 -= arg1;
                if (this.field2201 != 0) {
                    return arg1;
                }
                if (!this.method2147()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2202 == 256 && (this.field2212 & 0xFF) == 0) {
                if (Statics.field251) {
                    return method2076(0, ((class145) this.field1641).field2199, arg0, this.field2212, arg1, this.field2206, this.field2207, 0, arg3, arg2, this);
                }
                return method2054(((class145) this.field1641).field2199, arg0, this.field2212, arg1, this.field2205, 0, arg3, arg2, this);
            }
            if (Statics.field251) {
                return method2080(0, 0, ((class145) this.field1641).field2199, arg0, this.field2212, arg1, this.field2206, this.field2207, 0, arg3, arg2, this, this.field2202, arg4);
            }
            return method2079(0, 0, ((class145) this.field1641).field2199, arg0, this.field2212, arg1, this.field2205, 0, arg3, arg2, this, this.field2202, arg4);
        }
    }

    @ObfuscatedName("et.aw([IIIII)I")
    public int method2123(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2201 > 0) {
                int var6 = this.field2201 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2201 += arg1;
                if (this.field2202 == -256 && (this.field2212 & 0xFF) == 0) {
                    if (Statics.field251) {
                        arg1 = method2085(0, ((class145) this.field1641).field2199, arg0, this.field2212, arg1, this.field2206, this.field2207, this.field2214, this.field2215, 0, var6, arg2, this);
                    } else {
                        arg1 = method2084(((class145) this.field1641).field2199, arg0, this.field2212, arg1, this.field2205, this.field2209, 0, var6, arg2, this);
                    }
                } else if (Statics.field251) {
                    arg1 = method2089(0, 0, ((class145) this.field1641).field2199, arg0, this.field2212, arg1, this.field2206, this.field2207, this.field2214, this.field2215, 0, var6, arg2, this, this.field2202, arg4);
                } else {
                    arg1 = method2088(0, 0, ((class145) this.field1641).field2199, arg0, this.field2212, arg1, this.field2205, this.field2209, 0, var6, arg2, this, this.field2202, arg4);
                }
                this.field2201 -= arg1;
                if (this.field2201 != 0) {
                    return arg1;
                }
                if (!this.method2147()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2202 == -256 && (this.field2212 & 0xFF) == 0) {
                if (Statics.field251) {
                    return method2078(0, ((class145) this.field1641).field2199, arg0, this.field2212, arg1, this.field2206, this.field2207, 0, arg3, arg2, this);
                }
                return method2077(((class145) this.field1641).field2199, arg0, this.field2212, arg1, this.field2205, 0, arg3, arg2, this);
            }
            if (Statics.field251) {
                return method2082(0, 0, ((class145) this.field1641).field2199, arg0, this.field2212, arg1, this.field2206, this.field2207, 0, arg3, arg2, this, this.field2202, arg4);
            }
            return method2081(0, 0, ((class145) this.field1641).field2199, arg0, this.field2212, arg1, this.field2205, 0, arg3, arg2, this, this.field2202, arg4);
        }
    }

    @ObfuscatedName("et.bk()Z")
    public boolean method2147() {
        int var1 = this.field2213;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2067(var1, this.field2204);
            var2 = method2138(var1, this.field2204);
        }
        if (this.field2205 != var1 || this.field2206 != var3 || this.field2207 != var2) {
            if (this.field2205 < var1) {
                this.field2209 = 1;
                this.field2201 = var1 - this.field2205;
            } else if (this.field2205 > var1) {
                this.field2209 = -1;
                this.field2201 = this.field2205 - var1;
            } else {
                this.field2209 = 0;
            }
            if (this.field2206 < var3) {
                this.field2214 = 1;
                if (this.field2201 == 0 || this.field2201 > var3 - this.field2206) {
                    this.field2201 = var3 - this.field2206;
                }
            } else if (this.field2206 > var3) {
                this.field2214 = -1;
                if (this.field2201 == 0 || this.field2201 > this.field2206 - var3) {
                    this.field2201 = this.field2206 - var3;
                }
            } else {
                this.field2214 = 0;
            }
            if (this.field2207 < var2) {
                this.field2215 = 1;
                if (this.field2201 == 0 || this.field2201 > var2 - this.field2207) {
                    this.field2201 = var2 - this.field2207;
                }
            } else if (this.field2207 > var2) {
                this.field2215 = -1;
                if (this.field2201 == 0 || this.field2201 > this.field2207 - var2) {
                    this.field2201 = this.field2207 - var2;
                }
            } else {
                this.field2215 = 0;
            }
            return false;
        } else if (this.field2213 == Integer.MIN_VALUE) {
            this.field2213 = 0;
            this.field2207 = 0;
            this.field2206 = 0;
            this.field2205 = 0;
            this.method1307();
            return true;
        } else {
            this.method2055();
            return false;
        }
    }

    @ObfuscatedName("et.ba([B[IIIIIIILet;)I")
    public static int method2054(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class146 arg8) {
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
        arg8.field2212 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("et.bj(I[B[IIIIIIIILet;)I")
    public static int method2076(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class146 arg10) {
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
        arg10.field2212 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("et.bs([B[IIIIIIILet;)I")
    public static int method2077(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class146 arg8) {
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
        arg8.field2212 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("et.bz(I[B[IIIIIIIILet;)I")
    public static int method2078(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class146 arg10) {
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
        arg10.field2212 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("et.bl(II[B[IIIIIIILet;II)I")
    public static int method2079(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class146 arg10, int arg11, int arg12) {
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
        arg10.field2212 = arg4;
        return arg5;
    }

    @ObfuscatedName("et.bf(II[B[IIIIIIIILet;II)I")
    public static int method2080(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class146 arg11, int arg12, int arg13) {
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
        arg11.field2212 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("et.bn(II[B[IIIIIIILet;II)I")
    public static int method2081(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class146 arg10, int arg11, int arg12) {
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
        arg10.field2212 = arg4;
        return arg5;
    }

    @ObfuscatedName("et.bq(II[B[IIIIIIIILet;II)I")
    public static int method2082(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class146 arg11, int arg12, int arg13) {
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
        arg11.field2212 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("et.bh([B[IIIIIIIILet;)I")
    public static int method2053(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class146 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2206 += (var14 - arg3) * arg9.field2214;
        arg9.field2207 += (var14 - arg3) * arg9.field2215;
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
        arg9.field2205 = var12 >> 2;
        arg9.field2212 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("et.be(I[B[IIIIIIIIIILet;)I")
    public static int method2117(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class146 arg12) {
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
        arg12.field2205 += (var19 - arg4) * arg12.field2209;
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
        arg12.field2206 = var15 >> 2;
        arg12.field2207 = var16 >> 2;
        arg12.field2212 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("et.bx([B[IIIIIIIILet;)I")
    public static int method2084(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class146 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2206 += (var14 - arg3) * arg9.field2214;
        arg9.field2207 += (var14 - arg3) * arg9.field2215;
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
        arg9.field2205 = var12 >> 2;
        arg9.field2212 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("et.bd(I[B[IIIIIIIIIILet;)I")
    public static int method2085(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class146 arg12) {
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
        arg12.field2205 += (var19 - arg4) * arg12.field2209;
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
        arg12.field2206 = var15 >> 2;
        arg12.field2207 = var16 >> 2;
        arg12.field2212 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("et.bo(II[B[IIIIIIIILet;II)I")
    public static int method2086(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class146 arg11, int arg12, int arg13) {
        arg11.field2206 -= arg11.field2214 * arg5;
        arg11.field2207 -= arg11.field2215 * arg5;
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
        arg11.field2206 += arg11.field2214 * arg5;
        arg11.field2207 += arg11.field2215 * arg5;
        arg11.field2205 = arg6;
        arg11.field2212 = arg4;
        return arg5;
    }

    @ObfuscatedName("et.bi(II[B[IIIIIIIIIILet;II)I")
    public static int method2087(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class146 arg13, int arg14, int arg15) {
        arg13.field2205 -= arg13.field2209 * arg5;
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
        arg13.field2205 += arg13.field2209 * var27;
        arg13.field2206 = arg6;
        arg13.field2207 = arg7;
        arg13.field2212 = arg4;
        return var27;
    }

    @ObfuscatedName("et.bu(II[B[IIIIIIIILet;II)I")
    public static int method2088(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class146 arg11, int arg12, int arg13) {
        arg11.field2206 -= arg11.field2214 * arg5;
        arg11.field2207 -= arg11.field2215 * arg5;
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
        arg11.field2206 += arg11.field2214 * arg5;
        arg11.field2207 += arg11.field2215 * arg5;
        arg11.field2205 = arg6;
        arg11.field2212 = arg4;
        return arg5;
    }

    @ObfuscatedName("et.bt(II[B[IIIIIIIIIILet;II)I")
    public static int method2089(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class146 arg13, int arg14, int arg15) {
        arg13.field2205 -= arg13.field2209 * arg5;
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
        arg13.field2205 += arg13.field2209 * var26;
        arg13.field2206 = arg6;
        arg13.field2207 = arg7;
        arg13.field2212 = arg4;
        return var26;
    }
}
