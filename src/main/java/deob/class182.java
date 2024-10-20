package deob;

@ObfuscatedName("fw")
public class class182 extends class428 {

    @ObfuscatedName("fw.v")
    public static class269 field1979 = new class269(64);

    @ObfuscatedName("fw.x")
    public static class269 field1978 = new class269(64);

    @ObfuscatedName("fw.m")
    public int field1984;

    @ObfuscatedName("fw.r")
    public int field1981 = 255;

    @ObfuscatedName("fw.u")
    public int field1982 = 255;

    @ObfuscatedName("fw.b")
    public int field1983 = -1;

    @ObfuscatedName("fw.j")
    public int field1977 = 1;

    @ObfuscatedName("fw.g")
    public int field1975 = 70;

    @ObfuscatedName("fw.i")
    public int field1986 = -1;

    @ObfuscatedName("fw.o")
    public int field1987 = -1;

    @ObfuscatedName("fw.n")
    public int field1988 = 30;

    @ObfuscatedName("fw.k")
    public int field1989 = 0;

    @ObfuscatedName("dj.h(Lly;Lly;I)V")
    public static void method2834(class333 arg0, class333 arg1) {
        Statics.field1985 = arg0;
        Statics.field1976 = arg1;
    }

    @ObfuscatedName("fw.e(Lqy;B)V")
    public void method3273(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            this.method3270(arg0, var2);
        }
    }

    @ObfuscatedName("fw.v(Lqy;IB)V")
    public void method3270(class467 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method7794();
        } else if (arg1 == 2) {
            this.field1981 = arg0.method7792();
        } else if (arg1 == 3) {
            this.field1982 = arg0.method7792();
        } else if (arg1 == 4) {
            this.field1983 = 0;
        } else if (arg1 == 5) {
            this.field1975 = arg0.method7794();
        } else if (arg1 == 6) {
            arg0.method7792();
        } else if (arg1 == 7) {
            this.field1986 = arg0.method7810();
        } else if (arg1 == 8) {
            this.field1987 = arg0.method7810();
        } else if (arg1 == 11) {
            this.field1983 = arg0.method7794();
        } else if (arg1 == 14) {
            this.field1988 = arg0.method7792();
        } else if (arg1 == 15) {
            this.field1989 = arg0.method7792();
        }
    }

    @ObfuscatedName("fw.x(I)Lrx;")
    public class481 method3271() {
        if (this.field1986 < 0) {
            return null;
        }
        class481 var1 = (class481) field1978.method4917((long) this.field1986);
        if (var1 != null) {
            return var1;
        }
        class481 var2 = Statics.method2794(Statics.field1976, this.field1986, 0);
        if (var2 != null) {
            field1978.method4925(var2, (long) this.field1986);
        }
        return var2;
    }

    @ObfuscatedName("fw.m(I)Lrx;")
    public class481 method3272() {
        if (this.field1987 < 0) {
            return null;
        }
        class481 var1 = (class481) field1978.method4917((long) this.field1987);
        if (var1 != null) {
            return var1;
        }
        class481 var2 = Statics.method2794(Statics.field1976, this.field1987, 0);
        if (var2 != null) {
            field1978.method4925(var2, (long) this.field1987);
        }
        return var2;
    }

    @ObfuscatedName("hb.q(I)V")
    public static void method4420() {
        field1979.method4918();
        field1978.method4918();
    }
}
