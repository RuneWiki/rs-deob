package deob;

@ObfuscatedName("es")
public class class148 extends class347 {

    @ObfuscatedName("es.f")
    public static class221 field1678 = new class221(64);

    @ObfuscatedName("es.y")
    public static class221 field1679 = new class221(30);

    @ObfuscatedName("es.p")
    public int field1682;

    @ObfuscatedName("es.j")
    public int field1681;

    @ObfuscatedName("es.r")
    public int field1690 = -1;

    @ObfuscatedName("es.b")
    public short[] field1692;

    @ObfuscatedName("es.d")
    public short[] field1684;

    @ObfuscatedName("es.s")
    public short[] field1677;

    @ObfuscatedName("es.u")
    public short[] field1686;

    @ObfuscatedName("es.l")
    public int field1687 = 128;

    @ObfuscatedName("es.o")
    public int field1688 = 128;

    @ObfuscatedName("es.c")
    public int field1689 = 0;

    @ObfuscatedName("es.e")
    public int field1685 = 0;

    @ObfuscatedName("es.g")
    public int field1691 = 0;

    @ObfuscatedName("n.v(Ljv;Ljv;B)V")
    public static void method9(class275 arg0, class275 arg1) {
        Statics.field1676 = arg0;
        Statics.field1683 = arg1;
    }

    @ObfuscatedName("ej.n(IS)Les;")
    public static class148 method2427(int arg0) {
        class148 var1 = (class148) field1678.method3948((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1676.method4468(13, arg0);
        class148 var3 = new class148();
        var3.field1682 = arg0;
        if (var2 != null) {
            var3.method2560(new class383(var2));
        }
        field1678.method3947(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("es.f(Lnd;I)V")
    public void method2560(class383 arg0) {
        while (true) {
            int var2 = arg0.method5965();
            if (var2 == 0) {
                return;
            }
            this.method2561(arg0, var2);
        }
    }

    @ObfuscatedName("es.y(Lnd;IB)V")
    public void method2561(class383 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1681 = arg0.method5967();
        } else if (arg1 == 2) {
            this.field1690 = arg0.method5967();
        } else if (arg1 == 4) {
            this.field1687 = arg0.method5967();
        } else if (arg1 == 5) {
            this.field1688 = arg0.method5967();
        } else if (arg1 == 6) {
            this.field1689 = arg0.method5967();
        } else if (arg1 == 7) {
            this.field1685 = arg0.method5965();
        } else if (arg1 == 8) {
            this.field1691 = arg0.method5965();
        } else if (arg1 == 40) {
            int var3 = arg0.method5965();
            this.field1692 = new short[var3];
            this.field1684 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1692[var4] = (short) arg0.method5967();
                this.field1684[var4] = (short) arg0.method5967();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5965();
            this.field1677 = new short[var5];
            this.field1686 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1677[var6] = (short) arg0.method5967();
                this.field1686[var6] = (short) arg0.method5967();
            }
        }
    }

    @ObfuscatedName("es.p(IB)Lgr;")
    public final class205 method2562(int arg0) {
        class205 var2 = (class205) field1679.method3948((long) this.field1682);
        if (var2 == null) {
            class191 var3 = class191.method3418(Statics.field1683, this.field1681, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1692 != null) {
                for (int var4 = 0; var4 < this.field1692.length; var4++) {
                    var3.method3414(this.field1692[var4], this.field1684[var4]);
                }
            }
            if (this.field1677 != null) {
                for (int var5 = 0; var5 < this.field1677.length; var5++) {
                    var3.method3412(this.field1677[var5], this.field1686[var5]);
                }
            }
            var2 = var3.method3421(this.field1685 + 64, this.field1691 + 850, -30, -50, -30);
            field1679.method3947(var2, (long) this.field1682);
        }
        class205 var6;
        if (this.field1690 == -1 || arg0 == -1) {
            var6 = var2.method3797(true);
        } else {
            var6 = class157.method2030(this.field1690).method2890(var2, arg0);
        }
        if (this.field1687 != 128 || this.field1688 != 128) {
            var6.method3803(this.field1687, this.field1688, this.field1687);
        }
        if (this.field1689 != 0) {
            if (this.field1689 == 90) {
                var6.method3798();
            }
            if (this.field1689 == 180) {
                var6.method3798();
                var6.method3798();
            }
            if (this.field1689 == 270) {
                var6.method3798();
                var6.method3798();
                var6.method3798();
            }
        }
        return var6;
    }
}
