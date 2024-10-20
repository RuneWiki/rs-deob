package deob;

@ObfuscatedName("fl")
public class class168 extends class365 {

    @ObfuscatedName("fl.a")
    public static class236 field1802 = new class236(64);

    @ObfuscatedName("fl.o")
    public static class236 field1803 = new class236(64);

    @ObfuscatedName("fl.g")
    public static class236 field1811 = new class236(20);

    @ObfuscatedName("fl.y")
    public int field1818 = -1;

    @ObfuscatedName("fl.k")
    public int field1804 = 16777215;

    @ObfuscatedName("fl.t")
    public int field1806 = 70;

    @ObfuscatedName("fl.l")
    public int field1810 = -1;

    @ObfuscatedName("fl.u")
    public int field1814 = -1;

    @ObfuscatedName("fl.n")
    public int field1799 = -1;

    @ObfuscatedName("fl.z")
    public int field1812 = -1;

    @ObfuscatedName("fl.q")
    public int field1813 = 0;

    @ObfuscatedName("fl.d")
    public int field1808 = 0;

    @ObfuscatedName("fl.r")
    public int field1815 = -1;

    @ObfuscatedName("fl.m")
    public String field1816 = "";

    @ObfuscatedName("fl.c")
    public int field1817 = -1;

    @ObfuscatedName("fl.f")
    public int field1821 = 0;

    @ObfuscatedName("fl.h")
    public int[] field1819;

    @ObfuscatedName("fl.v")
    public int field1820 = -1;

    @ObfuscatedName("fl.ag")
    public int field1805 = -1;

    @ObfuscatedName("r.i(Lko;Lko;Lko;I)V")
    public static void method287(class290 arg0, class290 arg1, class290 arg2) {
        Statics.field1809 = arg0;
        Statics.field1800 = arg1;
        Statics.field1801 = arg2;
    }

    @ObfuscatedName("v.w(IB)Lfl;")
    public static class168 method364(int arg0) {
        class168 var1 = (class168) field1802.method4205((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1809.method4743(32, arg0);
        class168 var3 = new class168();
        if (var2 != null) {
            var3.method2964(new class401(var2));
        }
        field1802.method4206(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fl.s(Lop;I)V")
    public void method2964(class401 arg0) {
        while (true) {
            int var2 = arg0.method6240();
            if (var2 == 0) {
                return;
            }
            this.method2935(arg0, var2);
        }
    }

    @ObfuscatedName("fl.a(Lop;II)V")
    public void method2935(class401 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1818 = arg0.method6220();
        } else if (arg1 == 2) {
            this.field1804 = arg0.method6432();
        } else if (arg1 == 3) {
            this.field1810 = arg0.method6220();
        } else if (arg1 == 4) {
            this.field1799 = arg0.method6220();
        } else if (arg1 == 5) {
            this.field1814 = arg0.method6220();
        } else if (arg1 == 6) {
            this.field1812 = arg0.method6220();
        } else if (arg1 == 7) {
            this.field1813 = arg0.method6243();
        } else if (arg1 == 8) {
            this.field1816 = arg0.method6250();
        } else if (arg1 == 9) {
            this.field1806 = arg0.method6242();
        } else if (arg1 == 10) {
            this.field1808 = arg0.method6243();
        } else if (arg1 == 11) {
            this.field1815 = 0;
        } else if (arg1 == 12) {
            this.field1817 = arg0.method6240();
        } else if (arg1 == 13) {
            this.field1821 = arg0.method6243();
        } else if (arg1 == 14) {
            this.field1815 = arg0.method6242();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field1820 = arg0.method6242();
            if (this.field1820 == 65535) {
                this.field1820 = -1;
            }
            this.field1805 = arg0.method6242();
            if (this.field1805 == 65535) {
                this.field1805 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method6242();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method6240();
            this.field1819 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field1819[var5] = arg0.method6242();
                if (this.field1819[var5] == 65535) {
                    this.field1819[var5] = -1;
                }
            }
            this.field1819[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("fl.o(I)Lfl;")
    public final class168 method2936() {
        int var1 = -1;
        if (this.field1820 != -1) {
            var1 = class257.method2410(this.field1820);
        } else if (this.field1805 != -1) {
            var1 = class257.field3015[this.field1805];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1819.length - 1) {
            var2 = this.field1819[var1];
        } else {
            var2 = this.field1819[this.field1819.length - 1];
        }
        return var2 == -1 ? null : method364(var2);
    }

    @ObfuscatedName("fl.g(II)Ljava/lang/String;")
    public String method2953(int arg0) {
        String var2 = this.field1816;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class319.method4254(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("fl.e(I)Low;")
    public class414 method2938() {
        if (this.field1810 < 0) {
            return null;
        }
        class414 var1 = (class414) field1803.method4205((long) this.field1810);
        if (var1 != null) {
            return var1;
        }
        class414 var2 = class415.method3531(Statics.field1800, this.field1810, 0);
        if (var2 != null) {
            field1803.method4206(var2, (long) this.field1810);
        }
        return var2;
    }

    @ObfuscatedName("fl.p(B)Low;")
    public class414 method2968() {
        if (this.field1814 < 0) {
            return null;
        }
        class414 var1 = (class414) field1803.method4205((long) this.field1814);
        if (var1 != null) {
            return var1;
        }
        class414 var2 = class415.method3531(Statics.field1800, this.field1814, 0);
        if (var2 != null) {
            field1803.method4206(var2, (long) this.field1814);
        }
        return var2;
    }

    @ObfuscatedName("fl.j(S)Low;")
    public class414 method2940() {
        if (this.field1799 < 0) {
            return null;
        }
        class414 var1 = (class414) field1803.method4205((long) this.field1799);
        if (var1 != null) {
            return var1;
        }
        class414 var2 = class415.method3531(Statics.field1800, this.field1799, 0);
        if (var2 != null) {
            field1803.method4206(var2, (long) this.field1799);
        }
        return var2;
    }

    @ObfuscatedName("fl.b(B)Low;")
    public class414 method2963() {
        if (this.field1812 < 0) {
            return null;
        }
        class414 var1 = (class414) field1803.method4205((long) this.field1812);
        if (var1 != null) {
            return var1;
        }
        class414 var2 = class415.method3531(Statics.field1800, this.field1812, 0);
        if (var2 != null) {
            field1803.method4206(var2, (long) this.field1812);
        }
        return var2;
    }

    @ObfuscatedName("fl.x(I)Lle;")
    public class315 method2939() {
        if (this.field1818 == -1) {
            return null;
        }
        class315 var1 = (class315) field1811.method4205((long) this.field1818);
        if (var1 != null) {
            return var1;
        }
        class290 var2 = Statics.field1800;
        class290 var3 = Statics.field1801;
        int var4 = this.field1818;
        class315 var5;
        if (class415.method2367(var2, var4, 0)) {
            byte[] var6 = var3.method4743(var4, 0);
            class315 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class315 var8 = new class315(var6, Statics.field4409, Statics.field4405, Statics.field1287, Statics.field4410, Statics.field1807, Statics.field3743);
                class415.method6187();
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field1811.method4206(var5, (long) this.field1818);
        }
        return var5;
    }
}
