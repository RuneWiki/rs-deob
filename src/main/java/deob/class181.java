package deob;

@ObfuscatedName("ft")
public class class181 extends class407 {

    @ObfuscatedName("ft.f")
    public static class257 field1989 = new class257(64);

    @ObfuscatedName("ft.n")
    public static class257 field1991 = new class257(30);

    @ObfuscatedName("ft.k")
    public int field1988;

    @ObfuscatedName("ft.w")
    public int field1992;

    @ObfuscatedName("ft.s")
    public int field1993 = -1;

    @ObfuscatedName("ft.q")
    public short[] field1994;

    @ObfuscatedName("ft.m")
    public short[] field1995;

    @ObfuscatedName("ft.x")
    public short[] field1996;

    @ObfuscatedName("ft.j")
    public short[] field1999;

    @ObfuscatedName("ft.v")
    public int field1998 = 128;

    @ObfuscatedName("ft.h")
    public int field2002 = 128;

    @ObfuscatedName("ft.t")
    public int field2000 = 0;

    @ObfuscatedName("ft.u")
    public int field2001 = 0;

    @ObfuscatedName("ft.d")
    public int field2003 = 0;

    @ObfuscatedName("ao.c(Llv;Llv;I)V")
    public static void method409(class317 arg0, class317 arg1) {
        Statics.field2005 = arg0;
        Statics.field59 = arg1;
    }

    @ObfuscatedName("kf.p(II)Lft;")
    public static class181 method5344(int arg0) {
        class181 var1 = (class181) field1989.method4789((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2005.method5499(13, arg0);
        class181 var3 = new class181();
        var3.field1988 = arg0;
        if (var2 != null) {
            var3.method3305(new class445(var2));
        }
        field1989.method4781(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ft.f(Lqq;I)V")
    public void method3305(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            this.method3306(arg0, var2);
        }
    }

    @ObfuscatedName("ft.n(Lqq;IS)V")
    public void method3306(class445 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1992 = arg0.method7198();
        } else if (arg1 == 2) {
            this.field1993 = arg0.method7198();
        } else if (arg1 == 4) {
            this.field1998 = arg0.method7198();
        } else if (arg1 == 5) {
            this.field2002 = arg0.method7198();
        } else if (arg1 == 6) {
            this.field2000 = arg0.method7198();
        } else if (arg1 == 7) {
            this.field2001 = arg0.method7196();
        } else if (arg1 == 8) {
            this.field2003 = arg0.method7196();
        } else if (arg1 == 40) {
            int var3 = arg0.method7196();
            this.field1994 = new short[var3];
            this.field1995 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1994[var4] = (short) arg0.method7198();
                this.field1995[var4] = (short) arg0.method7198();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method7196();
            this.field1996 = new short[var5];
            this.field1999 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1996[var6] = (short) arg0.method7198();
                this.field1999[var6] = (short) arg0.method7198();
            }
        }
    }

    @ObfuscatedName("ft.k(II)Lha;")
    public final class212 method3307(int arg0) {
        class212 var2 = (class212) field1991.method4789((long) this.field1988);
        if (var2 == null) {
            class197 var3 = class197.method3742(Statics.field59, this.field1992, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field1994 != null) {
                for (int var4 = 0; var4 < this.field1994.length; var4++) {
                    var3.method3683(this.field1994[var4], this.field1995[var4]);
                }
            }
            if (this.field1996 != null) {
                for (int var5 = 0; var5 < this.field1996.length; var5++) {
                    var3.method3722(this.field1996[var5], this.field1999[var5]);
                }
            }
            var2 = var3.method3690(this.field2001 + 64, this.field2003 + 850, -30, -50, -30);
            field1991.method4781(var2, (long) this.field1988);
        }
        class212 var6;
        if (this.field1993 == -1 || arg0 == -1) {
            var6 = var2.method4133(true);
        } else {
            var6 = class191.method22(this.field1993).method3584(var2, arg0);
        }
        if (this.field1998 != 128 || this.field2002 != 128) {
            var6.method4153(this.field1998, this.field2002, this.field1998);
        }
        if (this.field2000 != 0) {
            if (this.field2000 == 90) {
                var6.method4148();
            }
            if (this.field2000 == 180) {
                var6.method4148();
                var6.method4148();
            }
            if (this.field2000 == 270) {
                var6.method4148();
                var6.method4148();
                var6.method4148();
            }
        }
        return var6;
    }

    @ObfuscatedName("ci.w(B)V")
    public static void method2463() {
        field1989.method4782();
        field1991.method4782();
    }
}
