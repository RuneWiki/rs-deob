package deob;

@ObfuscatedName("gx")
public class class182 extends class488 {

    @ObfuscatedName("gx.al")
    public static class304 field1914 = new class304(64);

    @ObfuscatedName("gx.ai")
    public static class304 field1910 = new class304(64);

    @ObfuscatedName("gx.ar")
    public int field1919;

    @ObfuscatedName("gx.az")
    public int field1909 = 255;

    @ObfuscatedName("gx.ao")
    public int field1915 = 255;

    @ObfuscatedName("gx.au")
    public int field1907 = -1;

    @ObfuscatedName("gx.ak")
    public int field1917 = 1;

    @ObfuscatedName("gx.ah")
    public int field1918 = 70;

    @ObfuscatedName("gx.aj")
    public int field1916 = -1;

    @ObfuscatedName("gx.af")
    public int field1920 = -1;

    @ObfuscatedName("gx.ax")
    public int field1921 = 30;

    @ObfuscatedName("gx.an")
    public int field1922 = 0;

    @ObfuscatedName("gu.aq(II)Lgx;")
    public static class182 method3270(int arg0) {
        class182 var1 = (class182) field1914.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1911.method6489(33, arg0);
        class182 var3 = new class182();
        var3.field1919 = arg0;
        if (var2 != null) {
            var3.method3331(new class534(var2));
        }
        field1914.method5421(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gx.aw(Luq;I)V")
    public void method3331(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            this.method3329(arg0, var2);
        }
    }

    @ObfuscatedName("gx.al(Luq;II)V")
    public void method3329(class534 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method8593();
        } else if (arg1 == 2) {
            this.field1909 = arg0.method8591();
        } else if (arg1 == 3) {
            this.field1915 = arg0.method8591();
        } else if (arg1 == 4) {
            this.field1907 = 0;
        } else if (arg1 == 5) {
            this.field1918 = arg0.method8593();
        } else if (arg1 == 6) {
            arg0.method8591();
        } else if (arg1 == 7) {
            this.field1916 = arg0.method8811();
        } else if (arg1 == 8) {
            this.field1920 = arg0.method8811();
        } else if (arg1 == 11) {
            this.field1907 = arg0.method8593();
        } else if (arg1 == 14) {
            this.field1921 = arg0.method8591();
        } else if (arg1 == 15) {
            this.field1922 = arg0.method8591();
        }
    }

    @ObfuscatedName("gx.ai(I)Lvd;")
    public class548 method3316() {
        if (this.field1916 < 0) {
            return null;
        }
        class548 var1 = (class548) field1910.method5414((long) this.field1916);
        if (var1 != null) {
            return var1;
        }
        class548 var2 = class549.method3899(Statics.field1908, this.field1916, 0);
        if (var2 != null) {
            field1910.method5421(var2, (long) this.field1916);
        }
        return var2;
    }

    @ObfuscatedName("gx.ar(I)Lvd;")
    public class548 method3317() {
        if (this.field1920 < 0) {
            return null;
        }
        class548 var1 = (class548) field1910.method5414((long) this.field1920);
        if (var1 != null) {
            return var1;
        }
        class548 var2 = class549.method3899(Statics.field1908, this.field1920, 0);
        if (var2 != null) {
            field1910.method5421(var2, (long) this.field1920);
        }
        return var2;
    }

    @ObfuscatedName("kj.as(I)V")
    public static void method4737() {
        field1914.method5418();
        field1910.method5418();
    }
}
