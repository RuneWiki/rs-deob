package deob;

@ObfuscatedName("fs")
public class class167 extends class387 {

    @ObfuscatedName("fs.s")
    public static class249 field1809 = new class249(64);

    @ObfuscatedName("fs.e")
    public static class249 field1813 = new class249(64);

    @ObfuscatedName("fs.r")
    public int field1810;

    @ObfuscatedName("fs.w")
    public int field1812 = 255;

    @ObfuscatedName("fs.v")
    public int field1820 = 255;

    @ObfuscatedName("fs.a")
    public int field1811 = -1;

    @ObfuscatedName("fs.y")
    public int field1815 = 1;

    @ObfuscatedName("fs.u")
    public int field1816 = 70;

    @ObfuscatedName("fs.h")
    public int field1817 = -1;

    @ObfuscatedName("fs.q")
    public int field1818 = -1;

    @ObfuscatedName("fs.x")
    public int field1819 = 30;

    @ObfuscatedName("fs.p")
    public int field1814 = 0;

    @ObfuscatedName("ix.c(Lkq;Lkq;I)V")
    public static void method4366(class307 arg0, class307 arg1) {
        Statics.field1808 = arg0;
        Statics.field1807 = arg1;
    }

    @ObfuscatedName("fc.l(IB)Lfs;")
    public static class167 method2779(int arg0) {
        class167 var1 = (class167) field1809.method4472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1808.method5066(33, arg0);
        class167 var3 = new class167();
        if (var2 != null) {
            var3.method2928(new class421(var2));
        }
        field1809.method4482(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fs.s(Lpi;B)V")
    public void method2928(class421 arg0) {
        while (true) {
            int var2 = arg0.method6686();
            if (var2 == 0) {
                return;
            }
            this.method2917(arg0, var2);
        }
    }

    @ObfuscatedName("fs.e(Lpi;II)V")
    public void method2917(class421 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method6666();
        } else if (arg1 == 2) {
            this.field1812 = arg0.method6686();
        } else if (arg1 == 3) {
            this.field1820 = arg0.method6686();
        } else if (arg1 == 4) {
            this.field1811 = 0;
        } else if (arg1 == 5) {
            this.field1816 = arg0.method6666();
        } else if (arg1 == 6) {
            arg0.method6686();
        } else if (arg1 == 7) {
            this.field1817 = arg0.method6649();
        } else if (arg1 == 8) {
            this.field1818 = arg0.method6649();
        } else if (arg1 == 11) {
            this.field1811 = arg0.method6666();
        } else if (arg1 == 14) {
            this.field1819 = arg0.method6686();
        } else if (arg1 == 15) {
            this.field1814 = arg0.method6686();
        }
    }

    @ObfuscatedName("fs.r(I)Lpt;")
    public class434 method2935() {
        if (this.field1817 < 0) {
            return null;
        }
        class434 var1 = (class434) field1813.method4472((long) this.field1817);
        if (var1 != null) {
            return var1;
        }
        class434 var2 = class435.method2593(Statics.field1807, this.field1817, 0);
        if (var2 != null) {
            field1813.method4482(var2, (long) this.field1817);
        }
        return var2;
    }

    @ObfuscatedName("fs.o(I)Lpt;")
    public class434 method2927() {
        if (this.field1818 < 0) {
            return null;
        }
        class434 var1 = (class434) field1813.method4472((long) this.field1818);
        if (var1 != null) {
            return var1;
        }
        class434 var2 = class435.method2593(Statics.field1807, this.field1818, 0);
        if (var2 != null) {
            field1813.method4482(var2, (long) this.field1818);
        }
        return var2;
    }

    @ObfuscatedName("d.i(I)V")
    public static void method264() {
        field1809.method4475();
        field1813.method4475();
    }
}
