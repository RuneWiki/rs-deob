package deob;

@ObfuscatedName("fd")
public class class157 extends class365 {

    @ObfuscatedName("fd.s")
    public static class236 field1661 = new class236(64);

    @ObfuscatedName("fd.a")
    public static class236 field1662 = new class236(64);

    @ObfuscatedName("fd.o")
    public int field1669;

    @ObfuscatedName("fd.p")
    public int field1664 = 255;

    @ObfuscatedName("fd.j")
    public int field1665 = 255;

    @ObfuscatedName("fd.b")
    public int field1666 = -1;

    @ObfuscatedName("fd.x")
    public int field1667 = 1;

    @ObfuscatedName("fd.y")
    public int field1675 = 70;

    @ObfuscatedName("fd.k")
    public int field1673 = -1;

    @ObfuscatedName("fd.t")
    public int field1670 = -1;

    @ObfuscatedName("fd.l")
    public int field1668 = 30;

    @ObfuscatedName("fd.u")
    public int field1672 = 0;

    @ObfuscatedName("br.i(II)Lfd;")
    public static class157 method1676(int arg0) {
        class157 var1 = (class157) field1661.method4205((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1671.method4743(33, arg0);
        class157 var3 = new class157();
        if (var2 != null) {
            var3.method2755(new class401(var2));
        }
        field1661.method4206(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fd.w(Lop;B)V")
    public void method2755(class401 arg0) {
        while (true) {
            int var2 = arg0.method6240();
            if (var2 == 0) {
                return;
            }
            this.method2760(arg0, var2);
        }
    }

    @ObfuscatedName("fd.s(Lop;IB)V")
    public void method2760(class401 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method6242();
        } else if (arg1 == 2) {
            this.field1664 = arg0.method6240();
        } else if (arg1 == 3) {
            this.field1665 = arg0.method6240();
        } else if (arg1 == 4) {
            this.field1666 = 0;
        } else if (arg1 == 5) {
            this.field1675 = arg0.method6242();
        } else if (arg1 == 6) {
            arg0.method6240();
        } else if (arg1 == 7) {
            this.field1673 = arg0.method6220();
        } else if (arg1 == 8) {
            this.field1670 = arg0.method6220();
        } else if (arg1 == 11) {
            this.field1666 = arg0.method6242();
        } else if (arg1 == 14) {
            this.field1668 = arg0.method6240();
        } else if (arg1 == 15) {
            this.field1672 = arg0.method6240();
        }
    }

    @ObfuscatedName("fd.a(I)Low;")
    public class414 method2752() {
        if (this.field1673 < 0) {
            return null;
        }
        class414 var1 = (class414) field1662.method4205((long) this.field1673);
        if (var1 != null) {
            return var1;
        }
        class414 var2 = class415.method3531(Statics.field1659, this.field1673, 0);
        if (var2 != null) {
            field1662.method4206(var2, (long) this.field1673);
        }
        return var2;
    }

    @ObfuscatedName("fd.o(I)Low;")
    public class414 method2753() {
        if (this.field1670 < 0) {
            return null;
        }
        class414 var1 = (class414) field1662.method4205((long) this.field1670);
        if (var1 != null) {
            return var1;
        }
        class414 var2 = class415.method3531(Statics.field1659, this.field1670, 0);
        if (var2 != null) {
            field1662.method4206(var2, (long) this.field1670);
        }
        return var2;
    }

    @ObfuscatedName("ez.g(I)V")
    public static void method2610() {
        field1661.method4207();
        field1662.method4207();
    }
}
