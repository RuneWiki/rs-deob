package deob;

@ObfuscatedName("fd")
public class class167 extends class382 {

    @ObfuscatedName("fd.p")
    public static class249 field1795 = new class249(64);

    @ObfuscatedName("fd.m")
    public static class249 field1796 = new class249(64);

    @ObfuscatedName("fd.t")
    public int field1797;

    @ObfuscatedName("fd.w")
    public int field1811 = 255;

    @ObfuscatedName("fd.n")
    public int field1801 = 255;

    @ObfuscatedName("fd.r")
    public int field1804 = -1;

    @ObfuscatedName("fd.o")
    public int field1799 = 1;

    @ObfuscatedName("fd.v")
    public int field1805 = 70;

    @ObfuscatedName("fd.d")
    public int field1810 = -1;

    @ObfuscatedName("fd.h")
    public int field1806 = -1;

    @ObfuscatedName("fd.g")
    public int field1807 = 30;

    @ObfuscatedName("fd.e")
    public int field1794 = 0;

    @ObfuscatedName("bz.c(Lku;Lku;B)V")
    public static void method1716(class302 arg0, class302 arg1) {
        Statics.field3884 = arg0;
        Statics.field1803 = arg1;
    }

    @ObfuscatedName("dc.b(IB)Lfd;")
    public static class167 method2545(int arg0) {
        class167 var1 = (class167) field1795.method4514((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3884.method5053(33, arg0);
        class167 var3 = new class167();
        if (var2 != null) {
            var3.method2941(new class419(var2));
        }
        field1795.method4515(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fd.p(Lpi;I)V")
    public void method2941(class419 arg0) {
        while (true) {
            int var2 = arg0.method6781();
            if (var2 == 0) {
                return;
            }
            this.method2942(arg0, var2);
        }
    }

    @ObfuscatedName("fd.m(Lpi;II)V")
    public void method2942(class419 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method6672();
        } else if (arg1 == 2) {
            this.field1811 = arg0.method6781();
        } else if (arg1 == 3) {
            this.field1801 = arg0.method6781();
        } else if (arg1 == 4) {
            this.field1804 = 0;
        } else if (arg1 == 5) {
            this.field1805 = arg0.method6672();
        } else if (arg1 == 6) {
            arg0.method6781();
        } else if (arg1 == 7) {
            this.field1810 = arg0.method6708();
        } else if (arg1 == 8) {
            this.field1806 = arg0.method6708();
        } else if (arg1 == 11) {
            this.field1804 = arg0.method6672();
        } else if (arg1 == 14) {
            this.field1807 = arg0.method6781();
        } else if (arg1 == 15) {
            this.field1794 = arg0.method6781();
        }
    }

    @ObfuscatedName("fd.t(I)Lpl;")
    public class432 method2940() {
        if (this.field1810 < 0) {
            return null;
        }
        class432 var1 = (class432) field1796.method4514((long) this.field1810);
        if (var1 != null) {
            return var1;
        }
        class432 var2 = class433.method55(Statics.field1803, this.field1810, 0);
        if (var2 != null) {
            field1796.method4515(var2, (long) this.field1810);
        }
        return var2;
    }

    @ObfuscatedName("fd.s(I)Lpl;")
    public class432 method2956() {
        if (this.field1806 < 0) {
            return null;
        }
        class432 var1 = (class432) field1796.method4514((long) this.field1806);
        if (var1 != null) {
            return var1;
        }
        class432 var2 = class433.method55(Statics.field1803, this.field1806, 0);
        if (var2 != null) {
            field1796.method4515(var2, (long) this.field1806);
        }
        return var2;
    }
}
