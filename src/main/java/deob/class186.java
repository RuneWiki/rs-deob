package deob;

@ObfuscatedName("gi")
public class class186 extends class435 {

    @ObfuscatedName("gi.v")
    public static class273 field1987 = new class273(64);

    @ObfuscatedName("gi.s")
    public static class273 field1984 = new class273(64);

    @ObfuscatedName("gi.z")
    public int field1983;

    @ObfuscatedName("gi.n")
    public int field1980 = 255;

    @ObfuscatedName("gi.l")
    public int field1982 = 255;

    @ObfuscatedName("gi.k")
    public int field1981 = -1;

    @ObfuscatedName("gi.c")
    public int field1985 = 1;

    @ObfuscatedName("gi.r")
    public int field1989 = 70;

    @ObfuscatedName("gi.b")
    public int field1990 = -1;

    @ObfuscatedName("gi.m")
    public int field1991 = -1;

    @ObfuscatedName("gi.t")
    public int field1992 = 30;

    @ObfuscatedName("gi.h")
    public int field1993 = 0;

    @ObfuscatedName("bu.f(Lln;Lln;B)V")
    public static void method2076(class337 arg0, class337 arg1) {
        Statics.field3474 = arg0;
        Statics.field1986 = arg1;
    }

    @ObfuscatedName("dc.w(II)Lgi;")
    public static class186 method2888(int arg0) {
        class186 var1 = (class186) field1987.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3474.method5990(33, arg0);
        class186 var3 = new class186();
        if (var2 != null) {
            var3.method3370(new class474(var2));
        }
        field1987.method5027(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gi.v(Lrd;I)V")
    public void method3370(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            this.method3385(arg0, var2);
        }
    }

    @ObfuscatedName("gi.s(Lrd;II)V")
    public void method3385(class474 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method8032();
        } else if (arg1 == 2) {
            this.field1980 = arg0.method7964();
        } else if (arg1 == 3) {
            this.field1982 = arg0.method7964();
        } else if (arg1 == 4) {
            this.field1981 = 0;
        } else if (arg1 == 5) {
            this.field1989 = arg0.method8032();
        } else if (arg1 == 6) {
            arg0.method7964();
        } else if (arg1 == 7) {
            this.field1990 = arg0.method8029();
        } else if (arg1 == 8) {
            this.field1991 = arg0.method8029();
        } else if (arg1 == 11) {
            this.field1981 = arg0.method8032();
        } else if (arg1 == 14) {
            this.field1992 = arg0.method7964();
        } else if (arg1 == 15) {
            this.field1993 = arg0.method7964();
        }
    }

    @ObfuscatedName("gi.z(I)Lrs;")
    public class488 method3378() {
        if (this.field1990 < 0) {
            return null;
        }
        class488 var1 = (class488) field1984.method5028((long) this.field1990);
        if (var1 != null) {
            return var1;
        }
        class488 var2 = class489.method8225(Statics.field1986, this.field1990, 0);
        if (var2 != null) {
            field1984.method5027(var2, (long) this.field1990);
        }
        return var2;
    }

    @ObfuscatedName("gi.j(I)Lrs;")
    public class488 method3369() {
        if (this.field1991 < 0) {
            return null;
        }
        class488 var1 = (class488) field1984.method5028((long) this.field1991);
        if (var1 != null) {
            return var1;
        }
        class488 var2 = class489.method8225(Statics.field1986, this.field1991, 0);
        if (var2 != null) {
            field1984.method5027(var2, (long) this.field1991);
        }
        return var2;
    }

    @ObfuscatedName("ar.i(I)V")
    public static void method453() {
        field1987.method5033();
        field1984.method5033();
    }
}
