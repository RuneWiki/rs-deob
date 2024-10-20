package deob;

@ObfuscatedName("ev")
public class class153 extends class347 {

    @ObfuscatedName("ev.y")
    public static class221 field1728 = new class221(64);

    @ObfuscatedName("ev.p")
    public static class221 field1729 = new class221(64);

    @ObfuscatedName("ev.j")
    public static class221 field1730 = new class221(20);

    @ObfuscatedName("ev.l")
    public int field1733 = -1;

    @ObfuscatedName("ev.o")
    public int field1746 = 16777215;

    @ObfuscatedName("ev.c")
    public int field1732 = 70;

    @ObfuscatedName("ev.e")
    public int field1736 = -1;

    @ObfuscatedName("ev.g")
    public int field1737 = -1;

    @ObfuscatedName("ev.a")
    public int field1738 = -1;

    @ObfuscatedName("ev.k")
    public int field1739 = -1;

    @ObfuscatedName("ev.m")
    public int field1740 = 0;

    @ObfuscatedName("ev.x")
    public int field1741 = 0;

    @ObfuscatedName("ev.z")
    public int field1750 = -1;

    @ObfuscatedName("ev.w")
    public String field1743 = "";

    @ObfuscatedName("ev.t")
    public int field1744 = -1;

    @ObfuscatedName("ev.h")
    public int field1745 = 0;

    @ObfuscatedName("ev.q")
    public int[] field1727;

    @ObfuscatedName("ev.i")
    public int field1731 = -1;

    @ObfuscatedName("ev.ae")
    public int field1748 = -1;

    @ObfuscatedName("cq.v(II)Lev;")
    public static class153 method1779(int arg0) {
        class153 var1 = (class153) field1728.method3948((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1726.method4468(32, arg0);
        class153 var3 = new class153();
        if (var2 != null) {
            var3.method2671(new class383(var2));
        }
        field1728.method3947(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ev.n(Lnd;I)V")
    public void method2671(class383 arg0) {
        while (true) {
            int var2 = arg0.method5965();
            if (var2 == 0) {
                return;
            }
            this.method2672(arg0, var2);
        }
    }

    @ObfuscatedName("ev.f(Lnd;II)V")
    public void method2672(class383 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1733 = arg0.method5982();
        } else if (arg1 == 2) {
            this.field1746 = arg0.method5969();
        } else if (arg1 == 3) {
            this.field1736 = arg0.method5982();
        } else if (arg1 == 4) {
            this.field1738 = arg0.method5982();
        } else if (arg1 == 5) {
            this.field1737 = arg0.method5982();
        } else if (arg1 == 6) {
            this.field1739 = arg0.method5982();
        } else if (arg1 == 7) {
            this.field1740 = arg0.method6102();
        } else if (arg1 == 8) {
            this.field1743 = arg0.method5975();
        } else if (arg1 == 9) {
            this.field1732 = arg0.method5967();
        } else if (arg1 == 10) {
            this.field1741 = arg0.method6102();
        } else if (arg1 == 11) {
            this.field1750 = 0;
        } else if (arg1 == 12) {
            this.field1744 = arg0.method5965();
        } else if (arg1 == 13) {
            this.field1745 = arg0.method6102();
        } else if (arg1 == 14) {
            this.field1750 = arg0.method5967();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field1731 = arg0.method5967();
            if (this.field1731 == 65535) {
                this.field1731 = -1;
            }
            this.field1748 = arg0.method5967();
            if (this.field1748 == 65535) {
                this.field1748 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method5967();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method5965();
            this.field1727 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field1727[var5] = arg0.method5967();
                if (this.field1727[var5] == 65535) {
                    this.field1727[var5] = -1;
                }
            }
            this.field1727[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("ev.y(I)Lev;")
    public final class153 method2673() {
        int var1 = -1;
        if (this.field1731 != -1) {
            var1 = class242.method3569(this.field1731);
        } else if (this.field1748 != -1) {
            var1 = class242.field2918[this.field1748];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1727.length - 1) {
            var2 = this.field1727[var1];
        } else {
            var2 = this.field1727[this.field1727.length - 1];
        }
        return var2 == -1 ? null : method1779(var2);
    }

    @ObfuscatedName("ev.p(II)Ljava/lang/String;")
    public String method2674(int arg0) {
        String var2 = this.field1743;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class304.method1722(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("ev.j(I)Loh;")
    public class396 method2675() {
        if (this.field1736 < 0) {
            return null;
        }
        class396 var1 = (class396) field1729.method3948((long) this.field1736);
        if (var1 != null) {
            return var1;
        }
        class396 var2 = class397.method3963(Statics.field1735, this.field1736, 0);
        if (var2 != null) {
            field1729.method3947(var2, (long) this.field1736);
        }
        return var2;
    }

    @ObfuscatedName("ev.r(I)Loh;")
    public class396 method2690() {
        if (this.field1737 < 0) {
            return null;
        }
        class396 var1 = (class396) field1729.method3948((long) this.field1737);
        if (var1 != null) {
            return var1;
        }
        class396 var2 = class397.method3963(Statics.field1735, this.field1737, 0);
        if (var2 != null) {
            field1729.method3947(var2, (long) this.field1737);
        }
        return var2;
    }

    @ObfuscatedName("ev.b(I)Loh;")
    public class396 method2710() {
        if (this.field1738 < 0) {
            return null;
        }
        class396 var1 = (class396) field1729.method3948((long) this.field1738);
        if (var1 != null) {
            return var1;
        }
        class396 var2 = class397.method3963(Statics.field1735, this.field1738, 0);
        if (var2 != null) {
            field1729.method3947(var2, (long) this.field1738);
        }
        return var2;
    }

    @ObfuscatedName("ev.d(B)Loh;")
    public class396 method2704() {
        if (this.field1739 < 0) {
            return null;
        }
        class396 var1 = (class396) field1729.method3948((long) this.field1739);
        if (var1 != null) {
            return var1;
        }
        class396 var2 = class397.method3963(Statics.field1735, this.field1739, 0);
        if (var2 != null) {
            field1729.method3947(var2, (long) this.field1739);
        }
        return var2;
    }

    @ObfuscatedName("ev.s(I)Lkt;")
    public class300 method2679() {
        if (this.field1733 == -1) {
            return null;
        }
        class300 var1 = (class300) field1730.method3948((long) this.field1733);
        if (var1 != null) {
            return var1;
        }
        class275 var2 = Statics.field1735;
        class275 var3 = Statics.field1734;
        int var4 = this.field1733;
        byte[] var5 = var2.method4468(var4, 0);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            class397.method3399(var5);
            var6 = true;
        }
        class300 var7;
        if (var6) {
            byte[] var8 = var3.method4468(var4, 0);
            class300 var9;
            if (var8 == null) {
                var9 = null;
            } else {
                class300 var10 = new class300(var8, Statics.field2087, Statics.field3126, Statics.field4259, Statics.field3742, Statics.field1523, Statics.field4260);
                class397.method2359();
                var9 = var10;
            }
            var7 = var9;
        } else {
            var7 = null;
        }
        if (var7 != null) {
            field1730.method3947(var7, (long) this.field1733);
        }
        return var7;
    }

    @ObfuscatedName("dn.u(I)V")
    public static void method2267() {
        field1728.method3957();
        field1729.method3957();
        field1730.method3957();
    }
}
