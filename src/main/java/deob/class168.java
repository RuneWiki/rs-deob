package deob;

@ObfuscatedName("fn")
public class class168 extends class365 {

    @ObfuscatedName("fn.j")
    public static class236 field1801 = new class236(64);

    @ObfuscatedName("fn.m")
    public static class236 field1802 = new class236(64);

    @ObfuscatedName("fn.k")
    public static class236 field1803 = new class236(20);

    @ObfuscatedName("fn.w")
    public int field1805 = -1;

    @ObfuscatedName("fn.g")
    public int field1808 = 16777215;

    @ObfuscatedName("fn.v")
    public int field1807 = 70;

    @ObfuscatedName("fn.s")
    public int field1820 = -1;

    @ObfuscatedName("fn.c")
    public int field1809 = -1;

    @ObfuscatedName("fn.b")
    public int field1806 = -1;

    @ObfuscatedName("fn.x")
    public int field1813 = -1;

    @ObfuscatedName("fn.p")
    public int field1812 = 0;

    @ObfuscatedName("fn.z")
    public int field1811 = 0;

    @ObfuscatedName("fn.h")
    public int field1814 = -1;

    @ObfuscatedName("fn.o")
    public String field1815 = "";

    @ObfuscatedName("fn.r")
    public int field1816 = -1;

    @ObfuscatedName("fn.n")
    public int field1799 = 0;

    @ObfuscatedName("fn.u")
    public int[] field1818;

    @ObfuscatedName("fn.d")
    public int field1819 = -1;

    @ObfuscatedName("fn.ab")
    public int field1817 = -1;

    @ObfuscatedName("br.l(II)Lfn;")
    public static class168 method1966(int arg0) {
        class168 var1 = (class168) field1801.method4223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1810.method4756(32, arg0);
        class168 var3 = new class168();
        if (var2 != null) {
            var3.method2940(new class401(var2));
        }
        field1801.method4225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fn.q(Lot;B)V")
    public void method2940(class401 arg0) {
        while (true) {
            int var2 = arg0.method6272();
            if (var2 == 0) {
                return;
            }
            this.method2901(arg0, var2);
        }
    }

    @ObfuscatedName("fn.f(Lot;II)V")
    public void method2901(class401 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1805 = arg0.method6353();
        } else if (arg1 == 2) {
            this.field1808 = arg0.method6276();
        } else if (arg1 == 3) {
            this.field1820 = arg0.method6353();
        } else if (arg1 == 4) {
            this.field1806 = arg0.method6353();
        } else if (arg1 == 5) {
            this.field1809 = arg0.method6353();
        } else if (arg1 == 6) {
            this.field1813 = arg0.method6353();
        } else if (arg1 == 7) {
            this.field1812 = arg0.method6308();
        } else if (arg1 == 8) {
            this.field1815 = arg0.method6282();
        } else if (arg1 == 9) {
            this.field1807 = arg0.method6284();
        } else if (arg1 == 10) {
            this.field1811 = arg0.method6308();
        } else if (arg1 == 11) {
            this.field1814 = 0;
        } else if (arg1 == 12) {
            this.field1816 = arg0.method6272();
        } else if (arg1 == 13) {
            this.field1799 = arg0.method6308();
        } else if (arg1 == 14) {
            this.field1814 = arg0.method6284();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field1819 = arg0.method6284();
            if (this.field1819 == 65535) {
                this.field1819 = -1;
            }
            this.field1817 = arg0.method6284();
            if (this.field1817 == 65535) {
                this.field1817 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method6284();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method6272();
            this.field1818 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field1818[var5] = arg0.method6284();
                if (this.field1818[var5] == 65535) {
                    this.field1818[var5] = -1;
                }
            }
            this.field1818[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("fn.j(I)Lfn;")
    public final class168 method2902() {
        int var1 = -1;
        if (this.field1819 != -1) {
            var1 = class257.method2185(this.field1819);
        } else if (this.field1817 != -1) {
            var1 = class257.field3009[this.field1817];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1818.length - 1) {
            var2 = this.field1818[var1];
        } else {
            var2 = this.field1818[this.field1818.length - 1];
        }
        return var2 == -1 ? null : method1966(var2);
    }

    @ObfuscatedName("fn.m(II)Ljava/lang/String;")
    public String method2903(int arg0) {
        String var2 = this.field1815;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class319.method174(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("fn.k(I)Lon;")
    public class414 method2904() {
        if (this.field1820 < 0) {
            return null;
        }
        class414 var1 = (class414) field1802.method4223((long) this.field1820);
        if (var1 != null) {
            return var1;
        }
        class414 var2 = class415.method6113(Statics.field1800, this.field1820, 0);
        if (var2 != null) {
            field1802.method4225(var2, (long) this.field1820);
        }
        return var2;
    }

    @ObfuscatedName("fn.t(I)Lon;")
    public class414 method2905() {
        if (this.field1809 < 0) {
            return null;
        }
        class414 var1 = (class414) field1802.method4223((long) this.field1809);
        if (var1 != null) {
            return var1;
        }
        class414 var2 = class415.method6113(Statics.field1800, this.field1809, 0);
        if (var2 != null) {
            field1802.method4225(var2, (long) this.field1809);
        }
        return var2;
    }

    @ObfuscatedName("fn.a(I)Lon;")
    public class414 method2906() {
        if (this.field1806 < 0) {
            return null;
        }
        class414 var1 = (class414) field1802.method4223((long) this.field1806);
        if (var1 != null) {
            return var1;
        }
        class414 var2 = class415.method6113(Statics.field1800, this.field1806, 0);
        if (var2 != null) {
            field1802.method4225(var2, (long) this.field1806);
        }
        return var2;
    }

    @ObfuscatedName("fn.e(I)Lon;")
    public class414 method2922() {
        if (this.field1813 < 0) {
            return null;
        }
        class414 var1 = (class414) field1802.method4223((long) this.field1813);
        if (var1 != null) {
            return var1;
        }
        class414 var2 = class415.method6113(Statics.field1800, this.field1813, 0);
        if (var2 != null) {
            field1802.method4225(var2, (long) this.field1813);
        }
        return var2;
    }

    @ObfuscatedName("fn.i(I)Llt;")
    public class315 method2919() {
        if (this.field1805 == -1) {
            return null;
        }
        class315 var1 = (class315) field1803.method4223((long) this.field1805);
        if (var1 != null) {
            return var1;
        }
        class315 var2 = class415.method2057(Statics.field1800, Statics.field94, this.field1805, 0);
        if (var2 != null) {
            field1803.method4225(var2, (long) this.field1805);
        }
        return var2;
    }

    @ObfuscatedName("en.y(I)V")
    public static void method2622() {
        field1801.method4226();
        field1802.method4226();
        field1803.method4226();
    }
}
