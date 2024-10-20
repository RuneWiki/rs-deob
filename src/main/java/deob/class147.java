package deob;

@ObfuscatedName("eq")
public class class147 extends class130 {

    @ObfuscatedName("eq.d")
    public int field2205;

    @ObfuscatedName("eq.k")
    public int field2209;

    @ObfuscatedName("eq.u")
    public int field2206;

    @ObfuscatedName("eq.v")
    public int field2207;

    @ObfuscatedName("eq.f")
    public int field2208;

    @ObfuscatedName("eq.s")
    public int field2218;

    @ObfuscatedName("eq.j")
    public int field2210;

    @ObfuscatedName("eq.e")
    public int field2211;

    @ObfuscatedName("eq.t")
    public int field2212;

    @ObfuscatedName("eq.y")
    public int field2204;

    @ObfuscatedName("eq.b")
    public boolean field2214;

    @ObfuscatedName("eq.w")
    public int field2215;

    @ObfuscatedName("eq.g")
    public int field2216;

    @ObfuscatedName("eq.p")
    public int field2217;

    @ObfuscatedName("eq.z")
    public int field2213;

    @ObfuscatedName("eq.ar(II)I")
    public static int method2138(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("eq.au(II)I")
    public static int method2053(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("eq.r()I")
    public int method1509() {
        int var1 = this.field2208 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2211 == 0) {
            var2 -= this.field2205 * var2 / (((class146) this.field1639).field2200.length << 8);
        } else if (this.field2211 >= 0) {
            var2 -= this.field2212 * var2 / ((class146) this.field1639).field2200.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class147(class146 arg0, int arg1, int arg2) {
        this.field1639 = arg0;
        this.field2212 = arg0.field2201;
        this.field2204 = arg0.field2202;
        this.field2214 = arg0.field2199;
        this.field2209 = arg1;
        this.field2206 = arg2;
        this.field2207 = 8192;
        this.field2205 = 0;
        this.method2057();
    }

    public class147(class146 arg0, int arg1, int arg2, int arg3) {
        this.field1639 = arg0;
        this.field2212 = arg0.field2201;
        this.field2204 = arg0.field2202;
        this.field2214 = arg0.field2199;
        this.field2209 = arg1;
        this.field2206 = arg2;
        this.field2207 = arg3;
        this.field2205 = 0;
        this.method2057();
    }

    @ObfuscatedName("eq.an(Leg;II)Leq;")
    public static class147 method2055(class146 arg0, int arg1, int arg2) {
        return arg0.field2200 == null || arg0.field2200.length == 0 ? null : new class147(arg0, (int) ((long) arg0.field2203 * 256L * (long) arg1 / (long) (Statics.field354 * 100)), arg2 << 6);
    }

    @ObfuscatedName("eq.az(Leg;III)Leq;")
    public static class147 method2056(class146 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2200 == null || arg0.field2200.length == 0 ? null : new class147(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("eq.ac()V")
    public void method2057() {
        this.field2208 = this.field2206;
        this.field2218 = method2138(this.field2206, this.field2207);
        this.field2210 = method2053(this.field2206, this.field2207);
    }

    @ObfuscatedName("eq.ap(I)V")
    public synchronized void method2058(int arg0) {
        this.field2211 = arg0;
    }

    @ObfuscatedName("eq.ad(I)V")
    public synchronized void method2059(int arg0) {
        this.method2061(arg0 << 6, this.method2063());
    }

    @ObfuscatedName("eq.ax(I)V")
    public synchronized void method2060(int arg0) {
        this.method2061(arg0, this.method2063());
    }

    @ObfuscatedName("eq.as(II)V")
    public synchronized void method2061(int arg0, int arg1) {
        this.field2206 = arg0;
        this.field2207 = arg1;
        this.field2215 = 0;
        this.method2057();
    }

    @ObfuscatedName("eq.ak()I")
    public synchronized int method2062() {
        return this.field2206 == Integer.MIN_VALUE ? 0 : this.field2206;
    }

    @ObfuscatedName("eq.av()I")
    public synchronized int method2063() {
        return this.field2207 < 0 ? -1 : this.field2207;
    }

    @ObfuscatedName("eq.ay(I)V")
    public synchronized void method2064(int arg0) {
        int var2 = ((class146) this.field1639).field2200.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2205 = arg0;
    }

    @ObfuscatedName("eq.aw(Z)V")
    public synchronized void method2065(boolean arg0) {
        this.field2209 = (this.field2209 >>> 31) + (this.field2209 ^ this.field2209 >> 31);
        if (arg0) {
            this.field2209 = -this.field2209;
        }
    }

    @ObfuscatedName("eq.ag()V")
    public void method2066() {
        if (this.field2215 == 0) {
            return;
        }
        if (this.field2206 == Integer.MIN_VALUE) {
            this.field2206 = 0;
        }
        this.field2215 = 0;
        this.method2057();
    }

    @ObfuscatedName("eq.al(II)V")
    public synchronized void method2067(int arg0, int arg1) {
        this.method2128(arg0, arg1, this.method2063());
    }

    @ObfuscatedName("eq.aq(III)V")
    public synchronized void method2128(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method2061(arg1, arg2);
            return;
        }
        int var4 = method2138(arg1, arg2);
        int var5 = method2053(arg1, arg2);
        if (this.field2218 == var4 && this.field2210 == var5) {
            this.field2215 = 0;
            return;
        }
        int var6 = arg1 - this.field2208;
        if (this.field2208 - arg1 > var6) {
            var6 = this.field2208 - arg1;
        }
        if (var4 - this.field2218 > var6) {
            var6 = var4 - this.field2218;
        }
        if (this.field2218 - var4 > var6) {
            var6 = this.field2218 - var4;
        }
        if (var5 - this.field2210 > var6) {
            var6 = var5 - this.field2210;
        }
        if (this.field2210 - var5 > var6) {
            var6 = this.field2210 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field2215 = arg0;
        this.field2206 = arg1;
        this.field2207 = arg2;
        this.field2216 = (arg1 - this.field2208) / arg0;
        this.field2217 = (var4 - this.field2218) / arg0;
        this.field2213 = (var5 - this.field2210) / arg0;
    }

    @ObfuscatedName("eq.ah(I)V")
    public synchronized void method2069(int arg0) {
        if (arg0 == 0) {
            this.method2060(0);
            this.method1328();
        } else if (this.field2218 == 0 && this.field2210 == 0) {
            this.field2215 = 0;
            this.field2206 = 0;
            this.field2208 = 0;
            this.method1328();
        } else {
            int var2 = -this.field2208;
            if (this.field2208 > var2) {
                var2 = this.field2208;
            }
            if (-this.field2218 > var2) {
                var2 = -this.field2218;
            }
            if (this.field2218 > var2) {
                var2 = this.field2218;
            }
            if (-this.field2210 > var2) {
                var2 = -this.field2210;
            }
            if (this.field2210 > var2) {
                var2 = this.field2210;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2215 = arg0;
            this.field2206 = Integer.MIN_VALUE;
            this.field2216 = -this.field2208 / arg0;
            this.field2217 = -this.field2218 / arg0;
            this.field2213 = -this.field2210 / arg0;
        }
    }

    @ObfuscatedName("eq.ao(I)V")
    public synchronized void method2070(int arg0) {
        if (this.field2209 < 0) {
            this.field2209 = -arg0;
        } else {
            this.field2209 = arg0;
        }
    }

    @ObfuscatedName("eq.bg()I")
    public synchronized int method2160() {
        return this.field2209 < 0 ? -this.field2209 : this.field2209;
    }

    @ObfuscatedName("eq.be()Z")
    public boolean method2072() {
        return this.field2205 < 0 || this.field2205 >= ((class146) this.field1639).field2200.length << 8;
    }

    @ObfuscatedName("eq.bi()Z")
    public boolean method2118() {
        return this.field2215 != 0;
    }

    @ObfuscatedName("eq.d()Ldr;")
    public class130 method1527() {
        return null;
    }

    @ObfuscatedName("eq.k()Ldr;")
    public class130 method1511() {
        return null;
    }

    @ObfuscatedName("eq.u()I")
    public int method1512() {
        return this.field2206 == 0 && this.field2215 == 0 ? 0 : 1;
    }

    @ObfuscatedName("eq.f([III)V")
    public synchronized void method1514(int[] arg0, int arg1, int arg2) {
        if (this.field2206 == 0 && this.field2215 == 0) {
            this.method1515(arg2);
            return;
        }
        class146 var4 = (class146) this.field1639;
        int var5 = this.field2212 << 8;
        int var6 = this.field2204 << 8;
        int var7 = var4.field2200.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field2211 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field2205 < 0) {
            if (this.field2209 <= 0) {
                this.method2066();
                this.method1328();
                return;
            }
            this.field2205 = 0;
        }
        if (this.field2205 >= var7) {
            if (this.field2209 >= 0) {
                this.method2066();
                this.method1328();
                return;
            }
            this.field2205 = var7 - 1;
        }
        if (this.field2211 >= 0) {
            if (this.field2211 > 0) {
                if (this.field2214) {
                    label131: {
                        if (this.field2209 < 0) {
                            var9 = this.method2078(arg0, arg1, var5, var10, var4.field2200[this.field2212]);
                            if (this.field2205 >= var5) {
                                return;
                            }
                            this.field2205 = var5 + var5 - 1 - this.field2205;
                            this.field2209 = -this.field2209;
                            if (--this.field2211 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2077(arg0, var9, var6, var10, var4.field2200[this.field2204 - 1]);
                            if (this.field2205 < var6) {
                                return;
                            }
                            this.field2205 = var6 + var6 - 1 - this.field2205;
                            this.field2209 = -this.field2209;
                            if (--this.field2211 == 0) {
                                break;
                            }
                            var9 = this.method2078(arg0, var9, var5, var10, var4.field2200[this.field2212]);
                            if (this.field2205 >= var5) {
                                return;
                            }
                            this.field2205 = var5 + var5 - 1 - this.field2205;
                            this.field2209 = -this.field2209;
                        } while (--this.field2211 != 0);
                    }
                } else if (this.field2209 < 0) {
                    while (true) {
                        var9 = this.method2078(arg0, var9, var5, var10, var4.field2200[this.field2204 - 1]);
                        if (this.field2205 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field2205) / var8;
                        if (var12 >= this.field2211) {
                            this.field2205 += this.field2211 * var8;
                            this.field2211 = 0;
                            break;
                        }
                        this.field2205 += var8 * var12;
                        this.field2211 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2077(arg0, var9, var6, var10, var4.field2200[this.field2212]);
                        if (this.field2205 < var6) {
                            return;
                        }
                        int var13 = (this.field2205 - var5) / var8;
                        if (var13 >= this.field2211) {
                            this.field2205 -= this.field2211 * var8;
                            this.field2211 = 0;
                            break;
                        }
                        this.field2205 -= var8 * var13;
                        this.field2211 -= var13;
                    }
                }
            }
            if (this.field2209 < 0) {
                this.method2078(arg0, var9, 0, var10, 0);
                if (this.field2205 < 0) {
                    this.field2205 = -1;
                    this.method2066();
                    this.method1328();
                }
            } else {
                this.method2077(arg0, var9, var7, var10, 0);
                if (this.field2205 >= var7) {
                    this.field2205 = var7;
                    this.method2066();
                    this.method1328();
                }
            }
        } else if (this.field2214) {
            if (this.field2209 < 0) {
                var9 = this.method2078(arg0, arg1, var5, var10, var4.field2200[this.field2212]);
                if (this.field2205 >= var5) {
                    return;
                }
                this.field2205 = var5 + var5 - 1 - this.field2205;
                this.field2209 = -this.field2209;
            }
            while (true) {
                int var11 = this.method2077(arg0, var9, var6, var10, var4.field2200[this.field2204 - 1]);
                if (this.field2205 < var6) {
                    return;
                }
                this.field2205 = var6 + var6 - 1 - this.field2205;
                this.field2209 = -this.field2209;
                var9 = this.method2078(arg0, var11, var5, var10, var4.field2200[this.field2212]);
                if (this.field2205 >= var5) {
                    return;
                }
                this.field2205 = var5 + var5 - 1 - this.field2205;
                this.field2209 = -this.field2209;
            }
        } else if (this.field2209 < 0) {
            while (true) {
                var9 = this.method2078(arg0, var9, var5, var10, var4.field2200[this.field2204 - 1]);
                if (this.field2205 >= var5) {
                    return;
                }
                this.field2205 = var6 - 1 - (var6 - 1 - this.field2205) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2077(arg0, var9, var6, var10, var4.field2200[this.field2212]);
                if (this.field2205 < var6) {
                    return;
                }
                this.field2205 = (this.field2205 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("eq.s(I)V")
    public synchronized void method1515(int arg0) {
        if (this.field2215 > 0) {
            if (arg0 >= this.field2215) {
                if (this.field2206 == Integer.MIN_VALUE) {
                    this.field2206 = 0;
                    this.field2210 = 0;
                    this.field2218 = 0;
                    this.field2208 = 0;
                    this.method1328();
                    arg0 = this.field2215;
                }
                this.field2215 = 0;
                this.method2057();
            } else {
                this.field2208 += this.field2216 * arg0;
                this.field2218 += this.field2217 * arg0;
                this.field2210 += this.field2213 * arg0;
                this.field2215 -= arg0;
            }
        }
        class146 var2 = (class146) this.field1639;
        int var3 = this.field2212 << 8;
        int var4 = this.field2204 << 8;
        int var5 = var2.field2200.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2211 = 0;
        }
        if (this.field2205 < 0) {
            if (this.field2209 <= 0) {
                this.method2066();
                this.method1328();
                return;
            }
            this.field2205 = 0;
        }
        if (this.field2205 >= var5) {
            if (this.field2209 >= 0) {
                this.method2066();
                this.method1328();
                return;
            }
            this.field2205 = var5 - 1;
        }
        this.field2205 += this.field2209 * arg0;
        if (this.field2211 >= 0) {
            if (this.field2211 > 0) {
                if (this.field2214) {
                    label121: {
                        if (this.field2209 < 0) {
                            if (this.field2205 >= var3) {
                                return;
                            }
                            this.field2205 = var3 + var3 - 1 - this.field2205;
                            this.field2209 = -this.field2209;
                            if (--this.field2211 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field2205 < var4) {
                                return;
                            }
                            this.field2205 = var4 + var4 - 1 - this.field2205;
                            this.field2209 = -this.field2209;
                            if (--this.field2211 == 0) {
                                break;
                            }
                            if (this.field2205 >= var3) {
                                return;
                            }
                            this.field2205 = var3 + var3 - 1 - this.field2205;
                            this.field2209 = -this.field2209;
                        } while (--this.field2211 != 0);
                    }
                } else {
                    label153: {
                        if (this.field2209 < 0) {
                            if (this.field2205 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field2205) / var6;
                            if (var7 >= this.field2211) {
                                this.field2205 += this.field2211 * var6;
                                this.field2211 = 0;
                                break label153;
                            }
                            this.field2205 += var6 * var7;
                            this.field2211 -= var7;
                        } else if (this.field2205 >= var4) {
                            int var8 = (this.field2205 - var3) / var6;
                            if (var8 >= this.field2211) {
                                this.field2205 -= this.field2211 * var6;
                                this.field2211 = 0;
                                break label153;
                            }
                            this.field2205 -= var6 * var8;
                            this.field2211 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field2209 < 0) {
                if (this.field2205 < 0) {
                    this.field2205 = -1;
                    this.method2066();
                    this.method1328();
                }
            } else if (this.field2205 >= var5) {
                this.field2205 = var5;
                this.method2066();
                this.method1328();
            }
        } else if (this.field2214) {
            if (this.field2209 < 0) {
                if (this.field2205 >= var3) {
                    return;
                }
                this.field2205 = var3 + var3 - 1 - this.field2205;
                this.field2209 = -this.field2209;
            }
            while (this.field2205 >= var4) {
                this.field2205 = var4 + var4 - 1 - this.field2205;
                this.field2209 = -this.field2209;
                if (this.field2205 >= var3) {
                    return;
                }
                this.field2205 = var3 + var3 - 1 - this.field2205;
                this.field2209 = -this.field2209;
            }
        } else if (this.field2209 < 0) {
            if (this.field2205 >= var3) {
                return;
            }
            this.field2205 = var4 - 1 - (var4 - 1 - this.field2205) % var6;
        } else if (this.field2205 >= var4) {
            this.field2205 = (this.field2205 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("eq.bp([IIIII)I")
    public int method2077(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2215 > 0) {
                int var6 = this.field2215 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2215 += arg1;
                if (this.field2209 == 256 && (this.field2205 & 0xFF) == 0) {
                    if (Statics.field243) {
                        arg1 = method2079(0, ((class146) this.field1639).field2200, arg0, this.field2205, arg1, this.field2218, this.field2210, this.field2217, this.field2213, 0, var6, arg2, this);
                    } else {
                        arg1 = method2107(((class146) this.field1639).field2200, arg0, this.field2205, arg1, this.field2208, this.field2216, 0, var6, arg2, this);
                    }
                } else if (Statics.field243) {
                    arg1 = method2092(0, 0, ((class146) this.field1639).field2200, arg0, this.field2205, arg1, this.field2218, this.field2210, this.field2217, this.field2213, 0, var6, arg2, this, this.field2209, arg4);
                } else {
                    arg1 = method2172(0, 0, ((class146) this.field1639).field2200, arg0, this.field2205, arg1, this.field2208, this.field2216, 0, var6, arg2, this, this.field2209, arg4);
                }
                this.field2215 -= arg1;
                if (this.field2215 != 0) {
                    return arg1;
                }
                if (!this.method2141()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2209 == 256 && (this.field2205 & 0xFF) == 0) {
                if (Statics.field243) {
                    return method2139(0, ((class146) this.field1639).field2200, arg0, this.field2205, arg1, this.field2218, this.field2210, 0, arg3, arg2, this);
                }
                return method2097(((class146) this.field1639).field2200, arg0, this.field2205, arg1, this.field2208, 0, arg3, arg2, this);
            }
            if (Statics.field243) {
                return method2090(0, 0, ((class146) this.field1639).field2200, arg0, this.field2205, arg1, this.field2218, this.field2210, 0, arg3, arg2, this, this.field2209, arg4);
            }
            return method2087(0, 0, ((class146) this.field1639).field2200, arg0, this.field2205, arg1, this.field2208, 0, arg3, arg2, this, this.field2209, arg4);
        }
    }

    @ObfuscatedName("eq.bw([IIIII)I")
    public int method2078(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2215 > 0) {
                int var6 = this.field2215 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2215 += arg1;
                if (this.field2209 == -256 && (this.field2205 & 0xFF) == 0) {
                    if (Statics.field243) {
                        arg1 = method2127(0, ((class146) this.field1639).field2200, arg0, this.field2205, arg1, this.field2218, this.field2210, this.field2217, this.field2213, 0, var6, arg2, this);
                    } else {
                        arg1 = method2080(((class146) this.field1639).field2200, arg0, this.field2205, arg1, this.field2208, this.field2216, 0, var6, arg2, this);
                    }
                } else if (Statics.field243) {
                    arg1 = method2094(0, 0, ((class146) this.field1639).field2200, arg0, this.field2205, arg1, this.field2218, this.field2210, this.field2217, this.field2213, 0, var6, arg2, this, this.field2209, arg4);
                } else {
                    arg1 = method2093(0, 0, ((class146) this.field1639).field2200, arg0, this.field2205, arg1, this.field2208, this.field2216, 0, var6, arg2, this, this.field2209, arg4);
                }
                this.field2215 -= arg1;
                if (this.field2215 != 0) {
                    return arg1;
                }
                if (!this.method2141()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2209 == -256 && (this.field2205 & 0xFF) == 0) {
                if (Statics.field243) {
                    return method2082(0, ((class146) this.field1639).field2200, arg0, this.field2205, arg1, this.field2218, this.field2210, 0, arg3, arg2, this);
                }
                return method2089(((class146) this.field1639).field2200, arg0, this.field2205, arg1, this.field2208, 0, arg3, arg2, this);
            }
            if (Statics.field243) {
                return method2086(0, 0, ((class146) this.field1639).field2200, arg0, this.field2205, arg1, this.field2218, this.field2210, 0, arg3, arg2, this, this.field2209, arg4);
            }
            return method2085(0, 0, ((class146) this.field1639).field2200, arg0, this.field2205, arg1, this.field2208, 0, arg3, arg2, this, this.field2209, arg4);
        }
    }

    @ObfuscatedName("eq.bu()Z")
    public boolean method2141() {
        int var1 = this.field2206;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2138(var1, this.field2207);
            var2 = method2053(var1, this.field2207);
        }
        if (this.field2208 != var1 || this.field2218 != var3 || this.field2210 != var2) {
            if (this.field2208 < var1) {
                this.field2216 = 1;
                this.field2215 = var1 - this.field2208;
            } else if (this.field2208 > var1) {
                this.field2216 = -1;
                this.field2215 = this.field2208 - var1;
            } else {
                this.field2216 = 0;
            }
            if (this.field2218 < var3) {
                this.field2217 = 1;
                if (this.field2215 == 0 || this.field2215 > var3 - this.field2218) {
                    this.field2215 = var3 - this.field2218;
                }
            } else if (this.field2218 > var3) {
                this.field2217 = -1;
                if (this.field2215 == 0 || this.field2215 > this.field2218 - var3) {
                    this.field2215 = this.field2218 - var3;
                }
            } else {
                this.field2217 = 0;
            }
            if (this.field2210 < var2) {
                this.field2213 = 1;
                if (this.field2215 == 0 || this.field2215 > var2 - this.field2210) {
                    this.field2215 = var2 - this.field2210;
                }
            } else if (this.field2210 > var2) {
                this.field2213 = -1;
                if (this.field2215 == 0 || this.field2215 > this.field2210 - var2) {
                    this.field2215 = this.field2210 - var2;
                }
            } else {
                this.field2213 = 0;
            }
            return false;
        } else if (this.field2206 == Integer.MIN_VALUE) {
            this.field2206 = 0;
            this.field2210 = 0;
            this.field2218 = 0;
            this.field2208 = 0;
            this.method1328();
            return true;
        } else {
            this.method2057();
            return false;
        }
    }

    @ObfuscatedName("eq.bf([B[IIIIIIILeq;)I")
    public static int method2097(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class147 arg8) {
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
        arg8.field2205 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("eq.bc(I[B[IIIIIIIILeq;)I")
    public static int method2139(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class147 arg10) {
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
        arg10.field2205 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("eq.bn([B[IIIIIIILeq;)I")
    public static int method2089(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class147 arg8) {
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
        arg8.field2205 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("eq.bk(I[B[IIIIIIIILeq;)I")
    public static int method2082(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class147 arg10) {
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
        arg10.field2205 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("eq.bz(II[B[IIIIIIILeq;II)I")
    public static int method2087(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class147 arg10, int arg11, int arg12) {
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
        arg10.field2205 = arg4;
        return arg5;
    }

    @ObfuscatedName("eq.bj(II[B[IIIIIIIILeq;II)I")
    public static int method2090(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class147 arg11, int arg12, int arg13) {
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
        arg11.field2205 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("eq.bt(II[B[IIIIIIILeq;II)I")
    public static int method2085(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class147 arg10, int arg11, int arg12) {
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
        arg10.field2205 = arg4;
        return arg5;
    }

    @ObfuscatedName("eq.by(II[B[IIIIIIIILeq;II)I")
    public static int method2086(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class147 arg11, int arg12, int arg13) {
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
        arg11.field2205 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("eq.bs([B[IIIIIIIILeq;)I")
    public static int method2107(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class147 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2218 += (var14 - arg3) * arg9.field2217;
        arg9.field2210 += (var14 - arg3) * arg9.field2213;
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
        arg9.field2208 = var12 >> 2;
        arg9.field2205 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("eq.bq(I[B[IIIIIIIIIILeq;)I")
    public static int method2079(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class147 arg12) {
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
        arg12.field2208 += (var19 - arg4) * arg12.field2216;
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
        arg12.field2218 = var15 >> 2;
        arg12.field2210 = var16 >> 2;
        arg12.field2205 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("eq.bd([B[IIIIIIIILeq;)I")
    public static int method2080(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class147 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2218 += (var14 - arg3) * arg9.field2217;
        arg9.field2210 += (var14 - arg3) * arg9.field2213;
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
        arg9.field2208 = var12 >> 2;
        arg9.field2205 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("eq.bx(I[B[IIIIIIIIIILeq;)I")
    public static int method2127(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class147 arg12) {
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
        arg12.field2208 += (var19 - arg4) * arg12.field2216;
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
        arg12.field2218 = var15 >> 2;
        arg12.field2210 = var16 >> 2;
        arg12.field2205 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("eq.bm(II[B[IIIIIIIILeq;II)I")
    public static int method2172(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class147 arg11, int arg12, int arg13) {
        arg11.field2218 -= arg11.field2217 * arg5;
        arg11.field2210 -= arg11.field2213 * arg5;
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
        arg11.field2218 += arg11.field2217 * arg5;
        arg11.field2210 += arg11.field2213 * arg5;
        arg11.field2208 = arg6;
        arg11.field2205 = arg4;
        return arg5;
    }

    @ObfuscatedName("eq.bv(II[B[IIIIIIIIIILeq;II)I")
    public static int method2092(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class147 arg13, int arg14, int arg15) {
        arg13.field2208 -= arg13.field2216 * arg5;
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
        arg13.field2208 += arg13.field2216 * var27;
        arg13.field2218 = arg6;
        arg13.field2210 = arg7;
        arg13.field2205 = arg4;
        return var27;
    }

    @ObfuscatedName("eq.bb(II[B[IIIIIIIILeq;II)I")
    public static int method2093(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class147 arg11, int arg12, int arg13) {
        arg11.field2218 -= arg11.field2217 * arg5;
        arg11.field2210 -= arg11.field2213 * arg5;
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
        arg11.field2218 += arg11.field2217 * arg5;
        arg11.field2210 += arg11.field2213 * arg5;
        arg11.field2208 = arg6;
        arg11.field2205 = arg4;
        return arg5;
    }

    @ObfuscatedName("eq.br(II[B[IIIIIIIIIILeq;II)I")
    public static int method2094(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class147 arg13, int arg14, int arg15) {
        arg13.field2208 -= arg13.field2216 * arg5;
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
        arg13.field2208 += arg13.field2216 * var26;
        arg13.field2218 = arg6;
        arg13.field2210 = arg7;
        arg13.field2205 = arg4;
        return var26;
    }
}
