package deob;

@ObfuscatedName("gy")
public class class187 extends class425 {

    @ObfuscatedName("gy.c")
    public static class266 field2009 = new class266(64);

    @ObfuscatedName("gy.x")
    public static class266 field2010 = new class266(30);

    @ObfuscatedName("gy.h")
    public int field2011;

    @ObfuscatedName("gy.j")
    public int field2012;

    @ObfuscatedName("gy.y")
    public int field2015 = -1;

    @ObfuscatedName("gy.d")
    public short[] field2014;

    @ObfuscatedName("gy.n")
    public short[] field2013;

    @ObfuscatedName("gy.r")
    public short[] field2007;

    @ObfuscatedName("gy.l")
    public short[] field2017;

    @ObfuscatedName("gy.s")
    public int field2018 = 128;

    @ObfuscatedName("gy.p")
    public int field2020 = 128;

    @ObfuscatedName("gy.b")
    public int field2016 = 0;

    @ObfuscatedName("gy.o")
    public int field2021 = 0;

    @ObfuscatedName("gy.u")
    public int field2022 = 0;

    @ObfuscatedName("aq.a(IB)Lgy;")
    public static class187 method710(int arg0) {
        class187 var1 = (class187) field2009.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2019.method5859(13, arg0);
        class187 var3 = new class187();
        var3.field2011 = arg0;
        if (var2 != null) {
            var3.method3277(new class464(var2));
        }
        field2009.method4834(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gy.f(Lqr;I)V")
    public void method3277(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            this.method3278(arg0, var2);
        }
    }

    @ObfuscatedName("gy.c(Lqr;II)V")
    public void method3278(class464 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2012 = arg0.method7716();
        } else if (arg1 == 2) {
            this.field2015 = arg0.method7716();
        } else if (arg1 == 4) {
            this.field2018 = arg0.method7716();
        } else if (arg1 == 5) {
            this.field2020 = arg0.method7716();
        } else if (arg1 == 6) {
            this.field2016 = arg0.method7716();
        } else if (arg1 == 7) {
            this.field2021 = arg0.method7735();
        } else if (arg1 == 8) {
            this.field2022 = arg0.method7735();
        } else if (arg1 == 40) {
            int var3 = arg0.method7735();
            this.field2014 = new short[var3];
            this.field2013 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2014[var4] = (short) arg0.method7716();
                this.field2013[var4] = (short) arg0.method7716();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method7735();
            this.field2007 = new short[var5];
            this.field2017 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2007[var6] = (short) arg0.method7716();
                this.field2017[var6] = (short) arg0.method7716();
            }
        }
    }

    @ObfuscatedName("gy.x(II)Lha;")
    public final class221 method3279(int arg0) {
        class221 var2 = (class221) field2010.method4839((long) this.field2011);
        if (var2 == null) {
            class206 var3 = class206.method3710(Statics.field2008, this.field2012, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2014 != null) {
                for (int var4 = 0; var4 < this.field2014.length; var4++) {
                    var3.method3726(this.field2014[var4], this.field2013[var4]);
                }
            }
            if (this.field2007 != null) {
                for (int var5 = 0; var5 < this.field2007.length; var5++) {
                    var3.method3727(this.field2007[var5], this.field2017[var5]);
                }
            }
            var2 = var3.method3732(this.field2021 + 64, this.field2022 + 850, -30, -50, -30);
            field2010.method4834(var2, (long) this.field2011);
        }
        class221 var6;
        if (this.field2015 == -1 || arg0 == -1) {
            var6 = var2.method4163(true);
        } else {
            var6 = class197.method3143(this.field2015).method3561(var2, arg0);
        }
        if (this.field2018 != 128 || this.field2020 != 128) {
            var6.method4227(this.field2018, this.field2020, this.field2018);
        }
        if (this.field2016 != 0) {
            if (this.field2016 == 90) {
                var6.method4247();
            }
            if (this.field2016 == 180) {
                var6.method4247();
                var6.method4247();
            }
            if (this.field2016 == 270) {
                var6.method4247();
                var6.method4247();
                var6.method4247();
            }
        }
        return var6;
    }

    @ObfuscatedName("ct.h(B)V")
    public static void method2417() {
        field2009.method4837();
        field2010.method4837();
    }
}
