package deob;

@ObfuscatedName("jd")
public class class238 extends class502 {

    @ObfuscatedName("jd.an")
    public static class315 field2516 = new class315(64);

    @ObfuscatedName("jd.au")
    public static class315 field2508 = new class315(64);

    @ObfuscatedName("jd.ax")
    public int field2512;

    @ObfuscatedName("jd.ac")
    public int field2515 = 255;

    @ObfuscatedName("jd.ae")
    public int field2518 = 255;

    @ObfuscatedName("jd.ad")
    public int field2517 = -1;

    @ObfuscatedName("jd.aq")
    public int field2510 = 1;

    @ObfuscatedName("jd.al")
    public int field2509 = 70;

    @ObfuscatedName("jd.aj")
    public int field2520 = -1;

    @ObfuscatedName("jd.as")
    public int field2521 = -1;

    @ObfuscatedName("jd.aw")
    public int field2522 = 30;

    @ObfuscatedName("jd.af")
    public int field2523 = 0;

    @ObfuscatedName("jd.ab(Lvg;B)V")
    public void method4461(class549 arg0) {
        while (true) {
            int var2 = arg0.method9025();
            if (var2 == 0) {
                return;
            }
            this.method4460(arg0, var2);
        }
    }

    @ObfuscatedName("jd.ay(Lvg;IB)V")
    public void method4460(class549 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method8968();
        } else if (arg1 == 2) {
            this.field2515 = arg0.method9025();
        } else if (arg1 == 3) {
            this.field2518 = arg0.method9025();
        } else if (arg1 == 4) {
            this.field2517 = 0;
        } else if (arg1 == 5) {
            this.field2509 = arg0.method8968();
        } else if (arg1 == 6) {
            arg0.method9025();
        } else if (arg1 == 7) {
            this.field2520 = arg0.method8863();
        } else if (arg1 == 8) {
            this.field2521 = arg0.method8863();
        } else if (arg1 == 11) {
            this.field2517 = arg0.method8968();
        } else if (arg1 == 14) {
            this.field2522 = arg0.method9025();
        } else if (arg1 == 15) {
            this.field2523 = arg0.method9025();
        }
    }

    @ObfuscatedName("jd.an(I)Lvc;")
    public class563 method4467() {
        if (this.field2520 < 0) {
            return null;
        }
        class563 var1 = (class563) field2508.method5586((long) this.field2520);
        if (var1 != null) {
            return var1;
        }
        class563 var2 = class564.method3898(Statics.field2519, this.field2520, 0);
        if (var2 != null) {
            field2508.method5589(var2, (long) this.field2520);
        }
        return var2;
    }

    @ObfuscatedName("jd.au(I)Lvc;")
    public class563 method4464() {
        if (this.field2521 < 0) {
            return null;
        }
        class563 var1 = (class563) field2508.method5586((long) this.field2521);
        if (var1 != null) {
            return var1;
        }
        class563 var2 = class564.method3898(Statics.field2519, this.field2521, 0);
        if (var2 != null) {
            field2508.method5589(var2, (long) this.field2521);
        }
        return var2;
    }

    @ObfuscatedName("ex.ax(I)V")
    public static void method2852() {
        field2516.method5588();
        field2508.method5588();
    }
}
