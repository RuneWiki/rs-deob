package deob;

@ObfuscatedName("hy")
public class class185 extends class501 {

    @ObfuscatedName("hy.ag")
    public static class313 field1933 = new class313(64);

    @ObfuscatedName("hy.ak")
    public static class313 field1932 = new class313(64);

    @ObfuscatedName("hy.ap")
    public int field1942;

    @ObfuscatedName("hy.av")
    public int field1934 = 255;

    @ObfuscatedName("hy.ab")
    public int field1935 = 255;

    @ObfuscatedName("hy.ai")
    public int field1936 = -1;

    @ObfuscatedName("hy.ae")
    public int field1937 = 1;

    @ObfuscatedName("hy.au")
    public int field1938 = 70;

    @ObfuscatedName("hy.ah")
    public int field1939 = -1;

    @ObfuscatedName("hy.az")
    public int field1940 = -1;

    @ObfuscatedName("hy.ax")
    public int field1941 = 30;

    @ObfuscatedName("hy.ac")
    public int field1943 = 0;

    @ObfuscatedName("hy.aq(Lvp;I)V")
    public void method3362(class547 arg0) {
        while (true) {
            int var2 = arg0.method8804();
            if (var2 == 0) {
                return;
            }
            this.method3356(arg0, var2);
        }
    }

    @ObfuscatedName("hy.ad(Lvp;IB)V")
    public void method3356(class547 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method8899();
        } else if (arg1 == 2) {
            this.field1934 = arg0.method8804();
        } else if (arg1 == 3) {
            this.field1935 = arg0.method8804();
        } else if (arg1 == 4) {
            this.field1936 = 0;
        } else if (arg1 == 5) {
            this.field1938 = arg0.method8899();
        } else if (arg1 == 6) {
            arg0.method8804();
        } else if (arg1 == 7) {
            this.field1939 = arg0.method8773();
        } else if (arg1 == 8) {
            this.field1940 = arg0.method8773();
        } else if (arg1 == 11) {
            this.field1936 = arg0.method8899();
        } else if (arg1 == 14) {
            this.field1941 = arg0.method8804();
        } else if (arg1 == 15) {
            this.field1943 = arg0.method8804();
        }
    }

    @ObfuscatedName("hy.ag(I)Lvg;")
    public class561 method3354() {
        if (this.field1939 < 0) {
            return null;
        }
        class561 var1 = (class561) field1932.method5495((long) this.field1939);
        if (var1 != null) {
            return var1;
        }
        class561 var2 = class562.method6477(Statics.field1930, this.field1939, 0);
        if (var2 != null) {
            field1932.method5498(var2, (long) this.field1939);
        }
        return var2;
    }

    @ObfuscatedName("hy.ak(B)Lvg;")
    public class561 method3355() {
        if (this.field1940 < 0) {
            return null;
        }
        class561 var1 = (class561) field1932.method5495((long) this.field1940);
        if (var1 != null) {
            return var1;
        }
        class561 var2 = class562.method6477(Statics.field1930, this.field1940, 0);
        if (var2 != null) {
            field1932.method5498(var2, (long) this.field1940);
        }
        return var2;
    }
}
