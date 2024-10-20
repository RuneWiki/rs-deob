package deob;

@ObfuscatedName("ey")
public class class134 {

    @ObfuscatedName("ey.i")
    public static boolean field2012 = false;

    @ObfuscatedName("ey.j")
    public static int field2003 = 0;

    @ObfuscatedName("ey.a")
    public static int field2002 = 0;

    @ObfuscatedName("ey.r")
    public static boolean field2005 = false;

    @ObfuscatedName("ey.y")
    public static int field2010 = 0;

    @ObfuscatedName("ey.v")
    public static int[] field2004 = new int[1000];

    public class134() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("v.i(B)Z")
    public static final boolean method79() {
        return field2012;
    }

    @ObfuscatedName("dc.j(I)I")
    public static final int method2171() {
        return field2003;
    }

    @ObfuscatedName("ig.a(I)I")
    public static final int method3974() {
        return field2002;
    }

    @ObfuscatedName("gr.r(I)V")
    public static final void method3599() {
        if (field2005) {
            return;
        }
        int var0 = Statics.field2088;
        int var1 = Statics.field2103;
        int var2 = Statics.field2086;
        int var3 = Statics.field2091;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field2003 - Statics.field2032) * var4 / class136.field2031;
        int var7 = (field2002 - Statics.field2020) * var4 / class136.field2031;
        int var8 = (field2003 - Statics.field2032) * var5 / class136.field2031;
        int var9 = (field2002 - Statics.field2020) * var5 / class136.field2031;
        int var10 = class136.method2441(var7, var4, var1, var0);
        int var11 = class136.method2434(var7, var4, var1, var0);
        int var13 = class136.method2441(var9, var5, var1, var0);
        int var14 = class136.method2434(var9, var5, var1, var0);
        int var16 = class136.method2436(var6, var11, var3, var2);
        int var17 = class136.method2432(var6, var11, var3, var2);
        int var19 = class136.method2436(var8, var14, var3, var2);
        int var20 = class136.method2432(var8, var14, var3, var2);
        Statics.field2006 = (var16 + var19) / 2;
        Statics.field794 = (var10 + var13) / 2;
        Statics.field2007 = (var17 + var20) / 2;
        Statics.field2008 = (var19 - var16) / 2;
        Statics.field2346 = (var13 - var10) / 2;
        Statics.field554 = (var20 - var17) / 2;
        Statics.field793 = Math.abs(Statics.field2008);
        Statics.field3387 = Math.abs(Statics.field2346);
        Statics.field2009 = Math.abs(Statics.field554);
    }

    @ObfuscatedName("l.o(Lem;IIII)Z")
    public static final boolean method50(class133 arg0, int arg1, int arg2, int arg3) {
        if (!method79()) {
            return false;
        }
        method3599();
        int var4 = arg0.field1964 + arg1;
        int var5 = arg0.field1933 + arg2;
        int var6 = arg0.field1966 + arg3;
        int var7 = arg0.field1976;
        int var8 = arg0.field1983;
        int var9 = arg0.field1969;
        int var10 = Statics.field2006 - var4;
        int var11 = Statics.field794 - var5;
        int var12 = Statics.field2007 - var6;
        if (Math.abs(var10) > Statics.field793 + var7) {
            return false;
        } else if (Math.abs(var11) > Statics.field3387 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field2009 + var9) {
            return false;
        } else if (Math.abs(Statics.field2346 * var12 - Statics.field554 * var11) > Statics.field3387 * var9 + Statics.field2009 * var8) {
            return false;
        } else if (Math.abs(Statics.field554 * var10 - Statics.field2008 * var12) > Statics.field793 * var9 + Statics.field2009 * var7) {
            return false;
        } else {
            return Math.abs(Statics.field2008 * var11 - Statics.field2346 * var10) <= Statics.field793 * var8 + Statics.field3387 * var7;
        }
    }
}
