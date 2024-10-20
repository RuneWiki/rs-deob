package deob;

@ObfuscatedName("es")
public class class154 extends class348 {

    @ObfuscatedName("es.y")
    public static class222 field1752 = new class222(64);

    @ObfuscatedName("es.j")
    public static class222 field1735 = new class222(64);

    @ObfuscatedName("es.o")
    public static class222 field1736 = new class222(20);

    @ObfuscatedName("es.b")
    public int field1733 = -1;

    @ObfuscatedName("es.i")
    public int field1738 = 16777215;

    @ObfuscatedName("es.k")
    public int field1739 = 70;

    @ObfuscatedName("es.g")
    public int field1740 = -1;

    @ObfuscatedName("es.t")
    public int field1737 = -1;

    @ObfuscatedName("es.x")
    public int field1731 = -1;

    @ObfuscatedName("es.u")
    public int field1755 = -1;

    @ObfuscatedName("es.q")
    public int field1734 = 0;

    @ObfuscatedName("es.s")
    public int field1745 = 0;

    @ObfuscatedName("es.p")
    public int field1746 = -1;

    @ObfuscatedName("es.c")
    public String field1747 = "";

    @ObfuscatedName("es.n")
    public int field1748 = -1;

    @ObfuscatedName("es.l")
    public int field1749 = 0;

    @ObfuscatedName("es.w")
    public int[] field1750;

    @ObfuscatedName("es.a")
    public int field1751 = -1;

    @ObfuscatedName("es.aw")
    public int field1743 = -1;

    @ObfuscatedName("ck.f(Ljp;Ljp;Ljp;B)V")
    public static void method2046(class276 arg0, class276 arg1, class276 arg2) {
        Statics.field1744 = arg0;
        Statics.field1742 = arg1;
        Statics.field1732 = arg2;
    }

    @ObfuscatedName("bt.e(IB)Les;")
    public static class154 method942(int arg0) {
        class154 var1 = (class154) field1752.method3987((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1744.method4504(32, arg0);
        class154 var3 = new class154();
        if (var2 != null) {
            var3.method2661(new class384(var2));
        }
        field1752.method3988(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("es.v(Lnt;I)V")
    public void method2661(class384 arg0) {
        while (true) {
            int var2 = arg0.method5902();
            if (var2 == 0) {
                return;
            }
            this.method2676(arg0, var2);
        }
    }

    @ObfuscatedName("es.y(Lnt;II)V")
    public void method2676(class384 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1733 = arg0.method5914();
        } else if (arg1 == 2) {
            this.field1738 = arg0.method5901();
        } else if (arg1 == 3) {
            this.field1740 = arg0.method5914();
        } else if (arg1 == 4) {
            this.field1731 = arg0.method5914();
        } else if (arg1 == 5) {
            this.field1737 = arg0.method5914();
        } else if (arg1 == 6) {
            this.field1755 = arg0.method5914();
        } else if (arg1 == 7) {
            this.field1734 = arg0.method6109();
        } else if (arg1 == 8) {
            this.field1747 = arg0.method5907();
        } else if (arg1 == 9) {
            this.field1739 = arg0.method5899();
        } else if (arg1 == 10) {
            this.field1745 = arg0.method6109();
        } else if (arg1 == 11) {
            this.field1746 = 0;
        } else if (arg1 == 12) {
            this.field1748 = arg0.method5902();
        } else if (arg1 == 13) {
            this.field1749 = arg0.method6109();
        } else if (arg1 == 14) {
            this.field1746 = arg0.method5899();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field1751 = arg0.method5899();
            if (this.field1751 == 65535) {
                this.field1751 = -1;
            }
            this.field1743 = arg0.method5899();
            if (this.field1743 == 65535) {
                this.field1743 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method5899();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method5902();
            this.field1750 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field1750[var5] = arg0.method5899();
                if (this.field1750[var5] == 65535) {
                    this.field1750[var5] = -1;
                }
            }
            this.field1750[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("es.j(B)Les;")
    public final class154 method2663() {
        int var1 = -1;
        if (this.field1751 != -1) {
            var1 = class243.method1005(this.field1751);
        } else if (this.field1743 != -1) {
            var1 = class243.field2924[this.field1743];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1750.length - 1) {
            var2 = this.field1750[var1];
        } else {
            var2 = this.field1750[this.field1750.length - 1];
        }
        return var2 == -1 ? null : method942(var2);
    }

    @ObfuscatedName("es.o(II)Ljava/lang/String;")
    public String method2691(int arg0) {
        String var2 = this.field1747;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class305.method2482(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("es.m(B)Loa;")
    public class397 method2665() {
        if (this.field1740 < 0) {
            return null;
        }
        class397 var1 = (class397) field1735.method3987((long) this.field1740);
        if (var1 != null) {
            return var1;
        }
        class397 var2 = class398.method3491(Statics.field1742, this.field1740, 0);
        if (var2 != null) {
            field1735.method3988(var2, (long) this.field1740);
        }
        return var2;
    }

    @ObfuscatedName("es.r(B)Loa;")
    public class397 method2692() {
        if (this.field1737 < 0) {
            return null;
        }
        class397 var1 = (class397) field1735.method3987((long) this.field1737);
        if (var1 != null) {
            return var1;
        }
        class397 var2 = class398.method3491(Statics.field1742, this.field1737, 0);
        if (var2 != null) {
            field1735.method3988(var2, (long) this.field1737);
        }
        return var2;
    }

    @ObfuscatedName("es.h(I)Loa;")
    public class397 method2667() {
        if (this.field1731 < 0) {
            return null;
        }
        class397 var1 = (class397) field1735.method3987((long) this.field1731);
        if (var1 != null) {
            return var1;
        }
        class397 var2 = class398.method3491(Statics.field1742, this.field1731, 0);
        if (var2 != null) {
            field1735.method3988(var2, (long) this.field1731);
        }
        return var2;
    }

    @ObfuscatedName("es.d(B)Loa;")
    public class397 method2668() {
        if (this.field1755 < 0) {
            return null;
        }
        class397 var1 = (class397) field1735.method3987((long) this.field1755);
        if (var1 != null) {
            return var1;
        }
        class397 var2 = class398.method3491(Statics.field1742, this.field1755, 0);
        if (var2 != null) {
            field1735.method3988(var2, (long) this.field1755);
        }
        return var2;
    }

    @ObfuscatedName("es.z(I)Lkj;")
    public class301 method2669() {
        if (this.field1733 == -1) {
            return null;
        }
        class301 var1 = (class301) field1736.method3987((long) this.field1733);
        if (var1 != null) {
            return var1;
        }
        class301 var2 = class398.method5361(Statics.field1742, Statics.field1732, this.field1733, 0);
        if (var2 != null) {
            field1736.method3988(var2, (long) this.field1733);
        }
        return var2;
    }

    @ObfuscatedName("fp.b(I)V")
    public static void method3270() {
        field1752.method3989();
        field1735.method3989();
        field1736.method3989();
    }
}
