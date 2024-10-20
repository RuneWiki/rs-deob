package deob;

@ObfuscatedName("hm")
public class class186 extends class444 {

    @ObfuscatedName("hm.aw")
    public static class280 field1962 = new class280(64);

    @ObfuscatedName("hm.ac")
    public static class280 field1963 = new class280(64);

    @ObfuscatedName("hm.au")
    public int field1960;

    @ObfuscatedName("hm.al")
    public int field1965 = 255;

    @ObfuscatedName("hm.at")
    public int field1968 = 255;

    @ObfuscatedName("hm.aa")
    public int field1967 = -1;

    @ObfuscatedName("hm.ay")
    public int field1972 = 1;

    @ObfuscatedName("hm.ao")
    public int field1969 = 70;

    @ObfuscatedName("hm.ax")
    public int field1970 = -1;

    @ObfuscatedName("hm.ai")
    public int field1971 = -1;

    @ObfuscatedName("hm.ag")
    public int field1966 = 30;

    @ObfuscatedName("hm.ah")
    public int field1973 = 0;

    @ObfuscatedName("hm.af(Lsg;B)V")
    public void method3400(class489 arg0) {
        while (true) {
            int var2 = arg0.method8248();
            if (var2 == 0) {
                return;
            }
            this.method3402(arg0, var2);
        }
    }

    @ObfuscatedName("hm.an(Lsg;IB)V")
    public void method3402(class489 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method8250();
        } else if (arg1 == 2) {
            this.field1965 = arg0.method8248();
        } else if (arg1 == 3) {
            this.field1968 = arg0.method8248();
        } else if (arg1 == 4) {
            this.field1967 = 0;
        } else if (arg1 == 5) {
            this.field1969 = arg0.method8250();
        } else if (arg1 == 6) {
            arg0.method8248();
        } else if (arg1 == 7) {
            this.field1970 = arg0.method8300();
        } else if (arg1 == 8) {
            this.field1971 = arg0.method8300();
        } else if (arg1 == 11) {
            this.field1967 = arg0.method8250();
        } else if (arg1 == 14) {
            this.field1966 = arg0.method8248();
        } else if (arg1 == 15) {
            this.field1973 = arg0.method8248();
        }
    }

    @ObfuscatedName("hm.aw(B)Ltq;")
    public class503 method3404() {
        if (this.field1970 < 0) {
            return null;
        }
        class503 var1 = (class503) field1963.method5119((long) this.field1970);
        if (var1 != null) {
            return var1;
        }
        class503 var2 = class504.method8178(Statics.field1961, this.field1970, 0);
        if (var2 != null) {
            field1963.method5121(var2, (long) this.field1970);
        }
        return var2;
    }

    @ObfuscatedName("hm.ac(I)Ltq;")
    public class503 method3403() {
        if (this.field1971 < 0) {
            return null;
        }
        class503 var1 = (class503) field1963.method5119((long) this.field1971);
        if (var1 != null) {
            return var1;
        }
        class503 var2 = class504.method8178(Statics.field1961, this.field1971, 0);
        if (var2 != null) {
            field1963.method5121(var2, (long) this.field1971);
        }
        return var2;
    }

    @ObfuscatedName("nu.au(I)V")
    public static void method6227() {
        field1962.method5125();
        field1963.method5125();
    }
}
