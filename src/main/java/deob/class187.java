package deob;

@ObfuscatedName("gs")
public class class187 extends class404 {

    @ObfuscatedName("gs.f")
    public static class257 field1995 = new class257(64);

    @ObfuscatedName("gs.b")
    public static class257 field1994 = new class257(64);

    @ObfuscatedName("gs.n")
    public static class257 field2007 = new class257(20);

    @ObfuscatedName("gs.p")
    public int field1997 = -1;

    @ObfuscatedName("gs.w")
    public int field1998 = 16777215;

    @ObfuscatedName("gs.k")
    public int field1999 = 70;

    @ObfuscatedName("gs.d")
    public int field2000 = -1;

    @ObfuscatedName("gs.m")
    public int field2001 = -1;

    @ObfuscatedName("gs.u")
    public int field2002 = -1;

    @ObfuscatedName("gs.t")
    public int field2003 = -1;

    @ObfuscatedName("gs.g")
    public int field2004 = 0;

    @ObfuscatedName("gs.x")
    public int field2005 = 0;

    @ObfuscatedName("gs.a")
    public int field2006 = -1;

    @ObfuscatedName("gs.y")
    public String field2011 = "";

    @ObfuscatedName("gs.j")
    public int field2008 = -1;

    @ObfuscatedName("gs.e")
    public int field2012 = 0;

    @ObfuscatedName("gs.z")
    public int[] field2010;

    @ObfuscatedName("gs.h")
    public int field2013 = -1;

    @ObfuscatedName("gs.ae")
    public int field1992 = -1;

    @ObfuscatedName("dj.v(Lln;Lln;Lln;B)V")
    public static void method2468(class316 arg0, class316 arg1, class316 arg2) {
        Statics.field1993 = arg0;
        Statics.field3262 = arg1;
        Statics.field4144 = arg2;
    }

    @ObfuscatedName("dg.c(IB)Lgs;")
    public static class187 method2480(int arg0) {
        class187 var1 = (class187) field1995.method4644((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1993.method5296(32, arg0);
        class187 var3 = new class187();
        if (var2 != null) {
            var3.method3310(new class438(var2));
        }
        field1995.method4651(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gs.i(Lpi;I)V")
    public void method3310(class438 arg0) {
        while (true) {
            int var2 = arg0.method6971();
            if (var2 == 0) {
                return;
            }
            this.method3309(arg0, var2);
        }
    }

    @ObfuscatedName("gs.f(Lpi;II)V")
    public void method3309(class438 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1997 = arg0.method6989();
        } else if (arg1 == 2) {
            this.field1998 = arg0.method6975();
        } else if (arg1 == 3) {
            this.field2000 = arg0.method6989();
        } else if (arg1 == 4) {
            this.field2002 = arg0.method6989();
        } else if (arg1 == 5) {
            this.field2001 = arg0.method6989();
        } else if (arg1 == 6) {
            this.field2003 = arg0.method6989();
        } else if (arg1 == 7) {
            this.field2004 = arg0.method6974();
        } else if (arg1 == 8) {
            this.field2011 = arg0.method7023();
        } else if (arg1 == 9) {
            this.field1999 = arg0.method7148();
        } else if (arg1 == 10) {
            this.field2005 = arg0.method6974();
        } else if (arg1 == 11) {
            this.field2006 = 0;
        } else if (arg1 == 12) {
            this.field2008 = arg0.method6971();
        } else if (arg1 == 13) {
            this.field2012 = arg0.method6974();
        } else if (arg1 == 14) {
            this.field2006 = arg0.method7148();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2013 = arg0.method7148();
            if (this.field2013 == 65535) {
                this.field2013 = -1;
            }
            this.field1992 = arg0.method7148();
            if (this.field1992 == 65535) {
                this.field1992 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method7148();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method6971();
            this.field2010 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2010[var5] = arg0.method7148();
                if (this.field2010[var5] == 65535) {
                    this.field2010[var5] = -1;
                }
            }
            this.field2010[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gs.b(I)Lgs;")
    public final class187 method3286() {
        int var1 = -1;
        if (this.field2013 != -1) {
            var1 = class289.method1960(this.field2013);
        } else if (this.field1992 != -1) {
            var1 = class289.field3284[this.field1992];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2010.length - 1) {
            var2 = this.field2010[var1];
        } else {
            var2 = this.field2010[this.field2010.length - 1];
        }
        return var2 == -1 ? null : method2480(var2);
    }

    @ObfuscatedName("gs.n(II)Ljava/lang/String;")
    public String method3305(int arg0) {
        String var2 = this.field2011;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class348.method4030(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("gs.s(I)Lqi;")
    public class451 method3288() {
        if (this.field2000 < 0) {
            return null;
        }
        class451 var1 = (class451) field1994.method4644((long) this.field2000);
        if (var1 != null) {
            return var1;
        }
        class451 var2 = class452.method35(Statics.field3262, this.field2000, 0);
        if (var2 != null) {
            field1994.method4651(var2, (long) this.field2000);
        }
        return var2;
    }

    @ObfuscatedName("gs.l(I)Lqi;")
    public class451 method3303() {
        if (this.field2001 < 0) {
            return null;
        }
        class451 var1 = (class451) field1994.method4644((long) this.field2001);
        if (var1 != null) {
            return var1;
        }
        class451 var2 = class452.method35(Statics.field3262, this.field2001, 0);
        if (var2 != null) {
            field1994.method4651(var2, (long) this.field2001);
        }
        return var2;
    }

    @ObfuscatedName("gs.q(I)Lqi;")
    public class451 method3289() {
        if (this.field2002 < 0) {
            return null;
        }
        class451 var1 = (class451) field1994.method4644((long) this.field2002);
        if (var1 != null) {
            return var1;
        }
        class451 var2 = class452.method35(Statics.field3262, this.field2002, 0);
        if (var2 != null) {
            field1994.method4651(var2, (long) this.field2002);
        }
        return var2;
    }

    @ObfuscatedName("gs.o(I)Lqi;")
    public class451 method3290() {
        if (this.field2003 < 0) {
            return null;
        }
        class451 var1 = (class451) field1994.method4644((long) this.field2003);
        if (var1 != null) {
            return var1;
        }
        class451 var2 = class452.method35(Statics.field3262, this.field2003, 0);
        if (var2 != null) {
            field1994.method4651(var2, (long) this.field2003);
        }
        return var2;
    }

    @ObfuscatedName("gs.r(I)Lmd;")
    public class344 method3316() {
        if (this.field1997 == -1) {
            return null;
        }
        class344 var1 = (class344) field2007.method4644((long) this.field1997);
        if (var1 != null) {
            return var1;
        }
        class344 var2 = class452.method3010(Statics.field3262, Statics.field4144, this.field1997, 0);
        if (var2 != null) {
            field2007.method4651(var2, (long) this.field1997);
        }
        return var2;
    }
}
