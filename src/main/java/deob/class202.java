package deob;

@ObfuscatedName("hl")
public class class202 extends class500 {

    @ObfuscatedName("hl.aj")
    public static class312 field2059 = new class312(64);

    @ObfuscatedName("hl.az")
    public static class312 field2060 = new class312(64);

    @ObfuscatedName("hl.af")
    public int field2067;

    @ObfuscatedName("hl.ab")
    public int field2061 = 255;

    @ObfuscatedName("hl.ac")
    public int field2063 = 255;

    @ObfuscatedName("hl.ao")
    public int field2066 = -1;

    @ObfuscatedName("hl.ah")
    public int field2070 = 1;

    @ObfuscatedName("hl.av")
    public int field2058 = 70;

    @ObfuscatedName("hl.aq")
    public int field2069 = -1;

    @ObfuscatedName("hl.ap")
    public int field2057 = -1;

    @ObfuscatedName("hl.ae")
    public int field2071 = 30;

    @ObfuscatedName("hl.ax")
    public int field2072 = 0;

    @ObfuscatedName("hl.ak(Lua;B)V")
    public void method3611(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            this.method3614(arg0, var2);
        }
    }

    @ObfuscatedName("hl.al(Lua;II)V")
    public void method3614(class546 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method8798();
        } else if (arg1 == 2) {
            this.field2061 = arg0.method8796();
        } else if (arg1 == 3) {
            this.field2063 = arg0.method8796();
        } else if (arg1 == 4) {
            this.field2066 = 0;
        } else if (arg1 == 5) {
            this.field2058 = arg0.method8798();
        } else if (arg1 == 6) {
            arg0.method8796();
        } else if (arg1 == 7) {
            this.field2069 = arg0.method8814();
        } else if (arg1 == 8) {
            this.field2057 = arg0.method8814();
        } else if (arg1 == 11) {
            this.field2066 = arg0.method8798();
        } else if (arg1 == 14) {
            this.field2071 = arg0.method8796();
        } else if (arg1 == 15) {
            this.field2072 = arg0.method8796();
        }
    }

    @ObfuscatedName("hl.aj(I)Lvc;")
    public class560 method3602() {
        if (this.field2069 < 0) {
            return null;
        }
        class560 var1 = (class560) field2060.method5570((long) this.field2069);
        if (var1 != null) {
            return var1;
        }
        class560 var2 = class561.method8728(Statics.field2065, this.field2069, 0);
        if (var2 != null) {
            field2060.method5564(var2, (long) this.field2069);
        }
        return var2;
    }

    @ObfuscatedName("hl.az(B)Lvc;")
    public class560 method3603() {
        if (this.field2057 < 0) {
            return null;
        }
        class560 var1 = (class560) field2060.method5570((long) this.field2057);
        if (var1 != null) {
            return var1;
        }
        class560 var2 = class561.method8728(Statics.field2065, this.field2057, 0);
        if (var2 != null) {
            field2060.method5564(var2, (long) this.field2057);
        }
        return var2;
    }
}
