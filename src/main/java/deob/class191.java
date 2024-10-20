package deob;

@ObfuscatedName("hl")
public class class191 extends class469 {

    @ObfuscatedName("hl.ao")
    public static class288 field1993 = new class288(64);

    @ObfuscatedName("hl.at")
    public static class288 field1994 = new class288(64);

    @ObfuscatedName("hl.ac")
    public int field1995;

    @ObfuscatedName("hl.ap")
    public int field1998 = 255;

    @ObfuscatedName("hl.aa")
    public int field1997 = 255;

    @ObfuscatedName("hl.af")
    public int field2000 = -1;

    @ObfuscatedName("hl.ad")
    public int field1999 = 1;

    @ObfuscatedName("hl.aq")
    public int field1996 = 70;

    @ObfuscatedName("hl.al")
    public int field2001 = -1;

    @ObfuscatedName("hl.an")
    public int field2002 = -1;

    @ObfuscatedName("hl.ar")
    public int field2003 = 30;

    @ObfuscatedName("hl.ab")
    public int field2004 = 0;

    @ObfuscatedName("fy.au(Lnu;Lnu;I)V")
    public static void method2983(class359 arg0, class359 arg1) {
        Statics.field1992 = arg0;
        Statics.field4610 = arg1;
    }

    @ObfuscatedName("hl.ae(Ltm;B)V")
    public void method3372(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            this.method3362(arg0, var2);
        }
    }

    @ObfuscatedName("hl.ao(Ltm;II)V")
    public void method3362(class515 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method8448();
        } else if (arg1 == 2) {
            this.field1998 = arg0.method8300();
        } else if (arg1 == 3) {
            this.field1997 = arg0.method8300();
        } else if (arg1 == 4) {
            this.field2000 = 0;
        } else if (arg1 == 5) {
            this.field1996 = arg0.method8448();
        } else if (arg1 == 6) {
            arg0.method8300();
        } else if (arg1 == 7) {
            this.field2001 = arg0.method8440();
        } else if (arg1 == 8) {
            this.field2002 = arg0.method8440();
        } else if (arg1 == 11) {
            this.field2000 = arg0.method8448();
        } else if (arg1 == 14) {
            this.field2003 = arg0.method8300();
        } else if (arg1 == 15) {
            this.field2004 = arg0.method8300();
        }
    }

    @ObfuscatedName("hl.at(B)Lui;")
    public class529 method3363() {
        if (this.field2001 < 0) {
            return null;
        }
        class529 var1 = (class529) field1994.method5182((long) this.field2001);
        if (var1 != null) {
            return var1;
        }
        class529 var2 = class530.method2154(Statics.field4610, this.field2001, 0);
        if (var2 != null) {
            field1994.method5177(var2, (long) this.field2001);
        }
        return var2;
    }

    @ObfuscatedName("hl.ac(I)Lui;")
    public class529 method3364() {
        if (this.field2002 < 0) {
            return null;
        }
        class529 var1 = (class529) field1994.method5182((long) this.field2002);
        if (var1 != null) {
            return var1;
        }
        class529 var2 = class530.method2154(Statics.field4610, this.field2002, 0);
        if (var2 != null) {
            field1994.method5177(var2, (long) this.field2002);
        }
        return var2;
    }
}
