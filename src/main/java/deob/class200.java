package deob;

@ObfuscatedName("hl")
public class class200 extends class489 {

    @ObfuscatedName("hl.af")
    public static class304 field2046 = new class304(64);

    @ObfuscatedName("hl.at")
    public static class304 field2047 = new class304(64);

    @ObfuscatedName("hl.an")
    public int field2062;

    @ObfuscatedName("hl.aw")
    public int field2053 = 255;

    @ObfuscatedName("hl.ad")
    public int field2051 = 255;

    @ObfuscatedName("hl.al")
    public int field2052 = -1;

    @ObfuscatedName("hl.as")
    public int field2050 = 1;

    @ObfuscatedName("hl.ag")
    public int field2049 = 70;

    @ObfuscatedName("hl.ai")
    public int field2055 = -1;

    @ObfuscatedName("hl.ax")
    public int field2054 = -1;

    @ObfuscatedName("hl.ar")
    public int field2057 = 30;

    @ObfuscatedName("hl.aj")
    public int field2058 = 0;

    @ObfuscatedName("hl.az(Lur;B)V")
    public void method3487(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            this.method3490(arg0, var2);
        }
    }

    @ObfuscatedName("hl.ah(Lur;IB)V")
    public void method3490(class535 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method8670();
        } else if (arg1 == 2) {
            this.field2053 = arg0.method8462();
        } else if (arg1 == 3) {
            this.field2051 = arg0.method8462();
        } else if (arg1 == 4) {
            this.field2052 = 0;
        } else if (arg1 == 5) {
            this.field2049 = arg0.method8670();
        } else if (arg1 == 6) {
            arg0.method8462();
        } else if (arg1 == 7) {
            this.field2055 = arg0.method8633();
        } else if (arg1 == 8) {
            this.field2054 = arg0.method8633();
        } else if (arg1 == 11) {
            this.field2052 = arg0.method8670();
        } else if (arg1 == 14) {
            this.field2057 = arg0.method8462();
        } else if (arg1 == 15) {
            this.field2058 = arg0.method8462();
        }
    }

    @ObfuscatedName("hl.af(I)Lvg;")
    public class549 method3489() {
        if (this.field2055 < 0) {
            return null;
        }
        class549 var1 = (class549) field2047.method5336((long) this.field2055);
        if (var1 != null) {
            return var1;
        }
        class549 var2 = class550.method1978(Statics.field2056, this.field2055, 0);
        if (var2 != null) {
            field2047.method5346(var2, (long) this.field2055);
        }
        return var2;
    }

    @ObfuscatedName("hl.at(B)Lvg;")
    public class549 method3492() {
        if (this.field2054 < 0) {
            return null;
        }
        class549 var1 = (class549) field2047.method5336((long) this.field2054);
        if (var1 != null) {
            return var1;
        }
        class549 var2 = class550.method1978(Statics.field2056, this.field2054, 0);
        if (var2 != null) {
            field2047.method5346(var2, (long) this.field2054);
        }
        return var2;
    }

    @ObfuscatedName("au.an(I)V")
    public static void method199() {
        field2046.method5339();
        field2047.method5339();
    }
}
