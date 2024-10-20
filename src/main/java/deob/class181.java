package deob;

@ObfuscatedName("fw")
public class class181 extends class406 {

    @ObfuscatedName("fw.l")
    public static class257 field2008 = new class257(64);

    @ObfuscatedName("fw.k")
    public static class257 field2004 = new class257(30);

    @ObfuscatedName("fw.a")
    public int field2006;

    @ObfuscatedName("fw.m")
    public int field2007;

    @ObfuscatedName("fw.p")
    public int field2011 = -1;

    @ObfuscatedName("fw.s")
    public short[] field2009;

    @ObfuscatedName("fw.r")
    public short[] field2010;

    @ObfuscatedName("fw.v")
    public short[] field2005;

    @ObfuscatedName("fw.y")
    public short[] field2017;

    @ObfuscatedName("fw.c")
    public int field2013 = 128;

    @ObfuscatedName("fw.w")
    public int field2018 = 128;

    @ObfuscatedName("fw.b")
    public int field2015 = 0;

    @ObfuscatedName("fw.t")
    public int field2016 = 0;

    @ObfuscatedName("fw.g")
    public int field2014 = 0;

    @ObfuscatedName("er.o(II)Lfw;")
    public static class181 method2676(int arg0) {
        class181 var1 = (class181) field2008.method4566((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2012.method5249(13, arg0);
        class181 var3 = new class181();
        var3.field2006 = arg0;
        if (var2 != null) {
            var3.method3162(new class440(var2));
        }
        field2008.method4571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fw.q(Lpx;B)V")
    public void method3162(class440 arg0) {
        while (true) {
            int var2 = arg0.method7071();
            if (var2 == 0) {
                return;
            }
            this.method3153(arg0, var2);
        }
    }

    @ObfuscatedName("fw.l(Lpx;II)V")
    public void method3153(class440 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2007 = arg0.method7082();
        } else if (arg1 == 2) {
            this.field2011 = arg0.method7082();
        } else if (arg1 == 4) {
            this.field2013 = arg0.method7082();
        } else if (arg1 == 5) {
            this.field2018 = arg0.method7082();
        } else if (arg1 == 6) {
            this.field2015 = arg0.method7082();
        } else if (arg1 == 7) {
            this.field2016 = arg0.method7071();
        } else if (arg1 == 8) {
            this.field2014 = arg0.method7071();
        } else if (arg1 == 40) {
            int var3 = arg0.method7071();
            this.field2009 = new short[var3];
            this.field2010 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2009[var4] = (short) arg0.method7082();
                this.field2010[var4] = (short) arg0.method7082();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method7071();
            this.field2005 = new short[var5];
            this.field2017 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2005[var6] = (short) arg0.method7082();
                this.field2017[var6] = (short) arg0.method7082();
            }
        }
    }

    @ObfuscatedName("fw.k(II)Lhv;")
    public final class212 method3155(int arg0) {
        class212 var2 = (class212) field2004.method4566((long) this.field2006);
        if (var2 == null) {
            class197 var3 = class197.method3507(Statics.field1924, this.field2007, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2009 != null) {
                for (int var4 = 0; var4 < this.field2009.length; var4++) {
                    var3.method3574(this.field2009[var4], this.field2010[var4]);
                }
            }
            if (this.field2005 != null) {
                for (int var5 = 0; var5 < this.field2005.length; var5++) {
                    var3.method3523(this.field2005[var5], this.field2017[var5]);
                }
            }
            var2 = var3.method3530(this.field2016 + 64, this.field2014 + 850, -30, -50, -30);
            field2004.method4571(var2, (long) this.field2006);
        }
        class212 var6;
        if (this.field2011 == -1 || arg0 == -1) {
            var6 = var2.method3988(true);
        } else {
            var6 = class191.method2497(this.field2011).method3413(var2, arg0);
        }
        if (this.field2013 != 128 || this.field2018 != 128) {
            var6.method3963(this.field2013, this.field2018, this.field2013);
        }
        if (this.field2015 != 0) {
            if (this.field2015 == 90) {
                var6.method3958();
            }
            if (this.field2015 == 180) {
                var6.method3958();
                var6.method3958();
            }
            if (this.field2015 == 270) {
                var6.method3958();
                var6.method3958();
                var6.method3958();
            }
        }
        return var6;
    }
}
