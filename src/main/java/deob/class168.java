package deob;

@ObfuscatedName("fe")
public class class168 extends class364 {

    @ObfuscatedName("fe.k")
    public static class236 field1817 = new class236(64);

    @ObfuscatedName("fe.o")
    public static class236 field1800 = new class236(64);

    @ObfuscatedName("fe.g")
    public static class236 field1806 = new class236(20);

    @ObfuscatedName("fe.y")
    public int field1816 = -1;

    @ObfuscatedName("fe.v")
    public int field1804 = 16777215;

    @ObfuscatedName("fe.f")
    public int field1805 = 70;

    @ObfuscatedName("fe.s")
    public int field1801 = -1;

    @ObfuscatedName("fe.h")
    public int field1807 = -1;

    @ObfuscatedName("fe.d")
    public int field1815 = -1;

    @ObfuscatedName("fe.q")
    public int field1809 = -1;

    @ObfuscatedName("fe.j")
    public int field1810 = 0;

    @ObfuscatedName("fe.x")
    public int field1811 = 0;

    @ObfuscatedName("fe.b")
    public int field1812 = -1;

    @ObfuscatedName("fe.t")
    public String field1813 = "";

    @ObfuscatedName("fe.r")
    public int field1814 = -1;

    @ObfuscatedName("fe.p")
    public int field1818 = 0;

    @ObfuscatedName("fe.w")
    public int[] field1803;

    @ObfuscatedName("fe.i")
    public int field1797 = -1;

    @ObfuscatedName("fe.aq")
    public int field1808 = -1;

    @ObfuscatedName("eu.n(Lkk;Lkk;Lkk;B)V")
    public static void method2500(class290 arg0, class290 arg1, class290 arg2) {
        Statics.field1799 = arg0;
        Statics.field1798 = arg1;
        Statics.field2883 = arg2;
    }

    @ObfuscatedName("cb.c(IB)Lfe;")
    public static class168 method2013(int arg0) {
        class168 var1 = (class168) field1817.method4167((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1799.method4710(32, arg0);
        class168 var3 = new class168();
        if (var2 != null) {
            var3.method2845(new class400(var2));
        }
        field1817.method4169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fe.m(Lot;I)V")
    public void method2845(class400 arg0) {
        while (true) {
            int var2 = arg0.method6217();
            if (var2 == 0) {
                return;
            }
            this.method2846(arg0, var2);
        }
    }

    @ObfuscatedName("fe.k(Lot;II)V")
    public void method2846(class400 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1816 = arg0.method6387();
        } else if (arg1 == 2) {
            this.field1804 = arg0.method6327();
        } else if (arg1 == 3) {
            this.field1801 = arg0.method6387();
        } else if (arg1 == 4) {
            this.field1815 = arg0.method6387();
        } else if (arg1 == 5) {
            this.field1807 = arg0.method6387();
        } else if (arg1 == 6) {
            this.field1809 = arg0.method6387();
        } else if (arg1 == 7) {
            this.field1810 = arg0.method6220();
        } else if (arg1 == 8) {
            this.field1813 = arg0.method6390();
        } else if (arg1 == 9) {
            this.field1805 = arg0.method6219();
        } else if (arg1 == 10) {
            this.field1811 = arg0.method6220();
        } else if (arg1 == 11) {
            this.field1812 = 0;
        } else if (arg1 == 12) {
            this.field1814 = arg0.method6217();
        } else if (arg1 == 13) {
            this.field1818 = arg0.method6220();
        } else if (arg1 == 14) {
            this.field1812 = arg0.method6219();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field1797 = arg0.method6219();
            if (this.field1797 == 65535) {
                this.field1797 = -1;
            }
            this.field1808 = arg0.method6219();
            if (this.field1808 == 65535) {
                this.field1808 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method6219();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method6217();
            this.field1803 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field1803[var5] = arg0.method6219();
                if (this.field1803[var5] == 65535) {
                    this.field1803[var5] = -1;
                }
            }
            this.field1803[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("fe.o(B)Lfe;")
    public final class168 method2860() {
        int var1 = -1;
        if (this.field1797 != -1) {
            var1 = class257.method4239(this.field1797);
        } else if (this.field1808 != -1) {
            var1 = class257.field3001[this.field1808];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1803.length - 1) {
            var2 = this.field1803[var1];
        } else {
            var2 = this.field1803[this.field1803.length - 1];
        }
        return var2 == -1 ? null : method2013(var2);
    }

    @ObfuscatedName("fe.g(II)Ljava/lang/String;")
    public String method2848(int arg0) {
        String var2 = this.field1813;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class319.method2705(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("fe.z(B)Loc;")
    public class413 method2849() {
        if (this.field1801 < 0) {
            return null;
        }
        class413 var1 = (class413) field1800.method4167((long) this.field1801);
        if (var1 != null) {
            return var1;
        }
        class413 var2 = class414.method4473(Statics.field1798, this.field1801, 0);
        if (var2 != null) {
            field1800.method4169(var2, (long) this.field1801);
        }
        return var2;
    }

    @ObfuscatedName("fe.a(I)Loc;")
    public class413 method2879() {
        if (this.field1807 < 0) {
            return null;
        }
        class413 var1 = (class413) field1800.method4167((long) this.field1807);
        if (var1 != null) {
            return var1;
        }
        class413 var2 = class414.method4473(Statics.field1798, this.field1807, 0);
        if (var2 != null) {
            field1800.method4169(var2, (long) this.field1807);
        }
        return var2;
    }

    @ObfuscatedName("fe.u(I)Loc;")
    public class413 method2880() {
        if (this.field1815 < 0) {
            return null;
        }
        class413 var1 = (class413) field1800.method4167((long) this.field1815);
        if (var1 != null) {
            return var1;
        }
        class413 var2 = class414.method4473(Statics.field1798, this.field1815, 0);
        if (var2 != null) {
            field1800.method4169(var2, (long) this.field1815);
        }
        return var2;
    }

    @ObfuscatedName("fe.e(S)Loc;")
    public class413 method2865() {
        if (this.field1809 < 0) {
            return null;
        }
        class413 var1 = (class413) field1800.method4167((long) this.field1809);
        if (var1 != null) {
            return var1;
        }
        class413 var2 = class414.method4473(Statics.field1798, this.field1809, 0);
        if (var2 != null) {
            field1800.method4169(var2, (long) this.field1809);
        }
        return var2;
    }

    @ObfuscatedName("fe.l(B)Llu;")
    public class315 method2876() {
        if (this.field1816 == -1) {
            return null;
        }
        class315 var1 = (class315) field1806.method4167((long) this.field1816);
        if (var1 != null) {
            return var1;
        }
        class315 var2 = class414.method5577(Statics.field1798, Statics.field2883, this.field1816, 0);
        if (var2 != null) {
            field1806.method4169(var2, (long) this.field1816);
        }
        return var2;
    }
}
