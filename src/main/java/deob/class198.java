package deob;

@ObfuscatedName("hj")
public class class198 extends class484 {

    @ObfuscatedName("hj.ak")
    public static class302 field1981 = new class302(64);

    @ObfuscatedName("hj.ax")
    public static class302 field1991 = new class302(64);

    @ObfuscatedName("hj.ao")
    public int field1983;

    @ObfuscatedName("hj.ab")
    public int field1990 = 255;

    @ObfuscatedName("hj.am")
    public int field1986 = 255;

    @ObfuscatedName("hj.av")
    public int field1987 = -1;

    @ObfuscatedName("hj.ag")
    public int field1988 = 1;

    @ObfuscatedName("hj.aa")
    public int field1985 = 70;

    @ObfuscatedName("hj.ap")
    public int field1995 = -1;

    @ObfuscatedName("hj.ay")
    public int field1979 = -1;

    @ObfuscatedName("hj.as")
    public int field1992 = 30;

    @ObfuscatedName("hj.aj")
    public int field1993 = 0;

    @ObfuscatedName("rh.ac(IB)Lhj;")
    public static class198 method7510(int arg0) {
        class198 var1 = (class198) field1981.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1982.method6342(33, arg0);
        class198 var3 = new class198();
        var3.field1983 = arg0;
        if (var2 != null) {
            var3.method3413(new class530(var2));
        }
        field1981.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hj.al(Lul;B)V")
    public void method3413(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            this.method3409(arg0, var2);
        }
    }

    @ObfuscatedName("hj.ak(Lul;II)V")
    public void method3409(class530 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method8598();
        } else if (arg1 == 2) {
            this.field1990 = arg0.method8365();
        } else if (arg1 == 3) {
            this.field1986 = arg0.method8365();
        } else if (arg1 == 4) {
            this.field1987 = 0;
        } else if (arg1 == 5) {
            this.field1985 = arg0.method8598();
        } else if (arg1 == 6) {
            arg0.method8365();
        } else if (arg1 == 7) {
            this.field1995 = arg0.method8385();
        } else if (arg1 == 8) {
            this.field1979 = arg0.method8385();
        } else if (arg1 == 11) {
            this.field1987 = arg0.method8598();
        } else if (arg1 == 14) {
            this.field1992 = arg0.method8365();
        } else if (arg1 == 15) {
            this.field1993 = arg0.method8365();
        }
    }

    @ObfuscatedName("hj.ax(I)Lud;")
    public class544 method3407() {
        if (this.field1995 < 0) {
            return null;
        }
        class544 var1 = (class544) field1991.method5286((long) this.field1995);
        if (var1 != null) {
            return var1;
        }
        class544 var2 = class545.method842(Statics.field1980, this.field1995, 0);
        if (var2 != null) {
            field1991.method5289(var2, (long) this.field1995);
        }
        return var2;
    }

    @ObfuscatedName("hj.ao(I)Lud;")
    public class544 method3408() {
        if (this.field1979 < 0) {
            return null;
        }
        class544 var1 = (class544) field1991.method5286((long) this.field1979);
        if (var1 != null) {
            return var1;
        }
        class544 var2 = class545.method842(Statics.field1980, this.field1979, 0);
        if (var2 != null) {
            field1991.method5289(var2, (long) this.field1979);
        }
        return var2;
    }
}
