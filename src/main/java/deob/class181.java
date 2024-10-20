package deob;

@ObfuscatedName("gd")
public class class181 extends class485 {

    @ObfuscatedName("gd.af")
    public static class302 field1884 = new class302(64);

    @ObfuscatedName("gd.aj")
    public static class302 field1887 = new class302(64);

    @ObfuscatedName("gd.aq")
    public int field1888;

    @ObfuscatedName("gd.ao")
    public int field1894 = 255;

    @ObfuscatedName("gd.ae")
    public int field1892 = 255;

    @ObfuscatedName("gd.aa")
    public int field1893 = -1;

    @ObfuscatedName("gd.au")
    public int field1886 = 1;

    @ObfuscatedName("gd.an")
    public int field1895 = 70;

    @ObfuscatedName("gd.ad")
    public int field1901 = -1;

    @ObfuscatedName("gd.ax")
    public int field1897 = -1;

    @ObfuscatedName("gd.aw")
    public int field1896 = 30;

    @ObfuscatedName("gd.az")
    public int field1899 = 0;

    @ObfuscatedName("gd.am(Luk;I)V")
    public void method3354(class531 arg0) {
        while (true) {
            int var2 = arg0.method8561();
            if (var2 == 0) {
                return;
            }
            this.method3362(arg0, var2);
        }
    }

    @ObfuscatedName("gd.ap(Luk;II)V")
    public void method3362(class531 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method8775();
        } else if (arg1 == 2) {
            this.field1894 = arg0.method8561();
        } else if (arg1 == 3) {
            this.field1892 = arg0.method8561();
        } else if (arg1 == 4) {
            this.field1893 = 0;
        } else if (arg1 == 5) {
            this.field1895 = arg0.method8775();
        } else if (arg1 == 6) {
            arg0.method8561();
        } else if (arg1 == 7) {
            this.field1901 = arg0.method8721();
        } else if (arg1 == 8) {
            this.field1897 = arg0.method8721();
        } else if (arg1 == 11) {
            this.field1893 = arg0.method8775();
        } else if (arg1 == 14) {
            this.field1896 = arg0.method8561();
        } else if (arg1 == 15) {
            this.field1899 = arg0.method8561();
        }
    }

    @ObfuscatedName("gd.af(I)Luc;")
    public class545 method3355() {
        if (this.field1901 < 0) {
            return null;
        }
        class545 var1 = (class545) field1887.method5400((long) this.field1901);
        if (var1 != null) {
            return var1;
        }
        class545 var2 = class546.method3015(Statics.field1885, this.field1901, 0);
        if (var2 != null) {
            field1887.method5402(var2, (long) this.field1901);
        }
        return var2;
    }

    @ObfuscatedName("gd.aj(I)Luc;")
    public class545 method3357() {
        if (this.field1897 < 0) {
            return null;
        }
        class545 var1 = (class545) field1887.method5400((long) this.field1897);
        if (var1 != null) {
            return var1;
        }
        class545 var2 = class546.method3015(Statics.field1885, this.field1897, 0);
        if (var2 != null) {
            field1887.method5402(var2, (long) this.field1897);
        }
        return var2;
    }
}
