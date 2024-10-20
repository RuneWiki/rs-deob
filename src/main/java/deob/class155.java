package deob;

@ObfuscatedName("es")
public class class155 extends class349 {

    @ObfuscatedName("es.j")
    public static class223 field1709 = new class223(64);

    @ObfuscatedName("es.l")
    public static class223 field1708 = new class223(64);

    @ObfuscatedName("es.n")
    public static class223 field1710 = new class223(20);

    @ObfuscatedName("es.p")
    public int field1715 = -1;

    @ObfuscatedName("es.h")
    public int field1724 = 16777215;

    @ObfuscatedName("es.k")
    public int field1717 = 70;

    @ObfuscatedName("es.a")
    public int field1718 = -1;

    @ObfuscatedName("es.q")
    public int field1721 = -1;

    @ObfuscatedName("es.u")
    public int field1720 = -1;

    @ObfuscatedName("es.e")
    public int field1719 = -1;

    @ObfuscatedName("es.c")
    public int field1722 = 0;

    @ObfuscatedName("es.i")
    public int field1723 = 0;

    @ObfuscatedName("es.m")
    public int field1707 = -1;

    @ObfuscatedName("es.b")
    public String field1725 = "";

    @ObfuscatedName("es.z")
    public int field1726 = -1;

    @ObfuscatedName("es.d")
    public int field1727 = 0;

    @ObfuscatedName("es.y")
    public int[] field1730;

    @ObfuscatedName("es.g")
    public int field1729 = -1;

    @ObfuscatedName("es.ae")
    public int field1716 = -1;

    @ObfuscatedName("kj.s(Ljy;Ljy;Ljy;I)V")
    public static void method4689(class277 arg0, class277 arg1, class277 arg2) {
        Statics.field1711 = arg0;
        Statics.field1914 = arg1;
        Statics.field1733 = arg2;
    }

    @ObfuscatedName("em.t(II)Les;")
    public static class155 method2725(int arg0) {
        class155 var1 = (class155) field1709.method3927((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1711.method4459(32, arg0);
        class155 var3 = new class155();
        if (var2 != null) {
            var3.method2649(new class385(var2));
        }
        field1709.method3929(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("es.v(Lnv;I)V")
    public void method2649(class385 arg0) {
        while (true) {
            int var2 = arg0.method5958();
            if (var2 == 0) {
                return;
            }
            this.method2664(arg0, var2);
        }
    }

    @ObfuscatedName("es.j(Lnv;II)V")
    public void method2664(class385 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1715 = arg0.method5975();
        } else if (arg1 == 2) {
            this.field1724 = arg0.method5962();
        } else if (arg1 == 3) {
            this.field1718 = arg0.method5975();
        } else if (arg1 == 4) {
            this.field1720 = arg0.method5975();
        } else if (arg1 == 5) {
            this.field1721 = arg0.method5975();
        } else if (arg1 == 6) {
            this.field1719 = arg0.method5975();
        } else if (arg1 == 7) {
            this.field1722 = arg0.method5961();
        } else if (arg1 == 8) {
            this.field1725 = arg0.method6104();
        } else if (arg1 == 9) {
            this.field1717 = arg0.method6053();
        } else if (arg1 == 10) {
            this.field1723 = arg0.method5961();
        } else if (arg1 == 11) {
            this.field1707 = 0;
        } else if (arg1 == 12) {
            this.field1726 = arg0.method5958();
        } else if (arg1 == 13) {
            this.field1727 = arg0.method5961();
        } else if (arg1 == 14) {
            this.field1707 = arg0.method6053();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field1729 = arg0.method6053();
            if (this.field1729 == 65535) {
                this.field1729 = -1;
            }
            this.field1716 = arg0.method6053();
            if (this.field1716 == 65535) {
                this.field1716 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method6053();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method5958();
            this.field1730 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field1730[var5] = arg0.method6053();
                if (this.field1730[var5] == 65535) {
                    this.field1730[var5] = -1;
                }
            }
            this.field1730[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("es.l(I)Les;")
    public final class155 method2638() {
        int var1 = -1;
        if (this.field1729 != -1) {
            var1 = class244.method3219(this.field1729);
        } else if (this.field1716 != -1) {
            var1 = class244.field2911[this.field1716];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1730.length - 1) {
            var2 = this.field1730[var1];
        } else {
            var2 = this.field1730[this.field1730.length - 1];
        }
        return var2 == -1 ? null : method2725(var2);
    }

    @ObfuscatedName("es.n(II)Ljava/lang/String;")
    public String method2639(int arg0) {
        String var2 = this.field1725;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class306.method4178(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("es.w(I)Lom;")
    public class398 method2651() {
        if (this.field1718 < 0) {
            return null;
        }
        class398 var1 = (class398) field1708.method3927((long) this.field1718);
        if (var1 != null) {
            return var1;
        }
        class398 var2 = class399.method3879(Statics.field1914, this.field1718, 0);
        if (var2 != null) {
            field1708.method3929(var2, (long) this.field1718);
        }
        return var2;
    }

    @ObfuscatedName("es.f(B)Lom;")
    public class398 method2641() {
        if (this.field1721 < 0) {
            return null;
        }
        class398 var1 = (class398) field1708.method3927((long) this.field1721);
        if (var1 != null) {
            return var1;
        }
        class398 var2 = class399.method3879(Statics.field1914, this.field1721, 0);
        if (var2 != null) {
            field1708.method3929(var2, (long) this.field1721);
        }
        return var2;
    }

    @ObfuscatedName("es.o(I)Lom;")
    public class398 method2642() {
        if (this.field1720 < 0) {
            return null;
        }
        class398 var1 = (class398) field1708.method3927((long) this.field1720);
        if (var1 != null) {
            return var1;
        }
        class398 var2 = class399.method3879(Statics.field1914, this.field1720, 0);
        if (var2 != null) {
            field1708.method3929(var2, (long) this.field1720);
        }
        return var2;
    }

    @ObfuscatedName("es.x(B)Lom;")
    public class398 method2643() {
        if (this.field1719 < 0) {
            return null;
        }
        class398 var1 = (class398) field1708.method3927((long) this.field1719);
        if (var1 != null) {
            return var1;
        }
        class398 var2 = class399.method3879(Statics.field1914, this.field1719, 0);
        if (var2 != null) {
            field1708.method3929(var2, (long) this.field1719);
        }
        return var2;
    }

    @ObfuscatedName("es.r(I)Lkt;")
    public class302 method2644() {
        if (this.field1715 == -1) {
            return null;
        }
        class302 var1 = (class302) field1710.method3927((long) this.field1715);
        if (var1 != null) {
            return var1;
        }
        class302 var2 = class399.method4338(Statics.field1914, Statics.field1733, this.field1715, 0);
        if (var2 != null) {
            field1710.method3929(var2, (long) this.field1715);
        }
        return var2;
    }
}
