package deob;

@ObfuscatedName("ha")
public class class194 extends class481 {

    @ObfuscatedName("ha.ar")
    public static class299 field1994 = new class299(64);

    @ObfuscatedName("ha.ao")
    public static class299 field1995 = new class299(30);

    @ObfuscatedName("ha.ab")
    public int field2005;

    @ObfuscatedName("ha.au")
    public int field1997;

    @ObfuscatedName("ha.aa")
    public int field2009 = -1;

    @ObfuscatedName("ha.ac")
    public short[] field1996;

    @ObfuscatedName("ha.al")
    public short[] field2000;

    @ObfuscatedName("ha.az")
    public short[] field2001;

    @ObfuscatedName("ha.ap")
    public short[] field2002;

    @ObfuscatedName("ha.av")
    public int field2003 = 128;

    @ObfuscatedName("ha.ax")
    public int field2004 = 128;

    @ObfuscatedName("ha.as")
    public int field1992 = 0;

    @ObfuscatedName("ha.ay")
    public int field2006 = 0;

    @ObfuscatedName("ha.ak")
    public int field2007 = 0;

    @ObfuscatedName("eh.at(Lol;Lol;I)V")
    public static void method2797(class371 arg0, class371 arg1) {
        Statics.field1998 = arg0;
        Statics.field1999 = arg1;
    }

    @ObfuscatedName("ag.ah(II)Lha;")
    public static class194 method318(int arg0) {
        class194 var1 = (class194) field1994.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1998.method6284(13, arg0);
        class194 var3 = new class194();
        var3.field2005 = arg0;
        if (var2 != null) {
            var3.method3450(new class527(var2));
        }
        field1994.method5303(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ha.ar(Luj;I)V")
    public void method3450(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            this.method3446(arg0, var2);
        }
    }

    @ObfuscatedName("ha.ao(Luj;IB)V")
    public void method3446(class527 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1997 = arg0.method8412();
        } else if (arg1 == 2) {
            this.field2009 = arg0.method8412();
        } else if (arg1 == 4) {
            this.field2003 = arg0.method8412();
        } else if (arg1 == 5) {
            this.field2004 = arg0.method8412();
        } else if (arg1 == 6) {
            this.field1992 = arg0.method8412();
        } else if (arg1 == 7) {
            this.field2006 = arg0.method8410();
        } else if (arg1 == 8) {
            this.field2007 = arg0.method8410();
        } else if (arg1 == 40) {
            int var3 = arg0.method8410();
            this.field1996 = new short[var3];
            this.field2000 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1996[var4] = (short) arg0.method8412();
                this.field2000[var4] = (short) arg0.method8412();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8410();
            this.field2001 = new short[var5];
            this.field2002 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2001[var6] = (short) arg0.method8412();
                this.field2002[var6] = (short) arg0.method8412();
            }
        }
    }

    @ObfuscatedName("ha.ab(IB)Lka;")
    public final class280 method3447(int arg0) {
        class280 var2 = this.method3451();
        class280 var3;
        if (this.field2009 == -1 || arg0 == -1) {
            var3 = var2.method5101(true);
        } else {
            var3 = class205.method2129(this.field2009).method3734(var2, arg0);
        }
        if (this.field2003 != 128 || this.field2004 != 128) {
            var3.method5050(this.field2003, this.field2004, this.field2003);
        }
        if (this.field1992 != 0) {
            if (this.field1992 == 90) {
                var3.method5068();
            }
            if (this.field1992 == 180) {
                var3.method5068();
                var3.method5068();
            }
            if (this.field1992 == 270) {
                var3.method5068();
                var3.method5068();
                var3.method5068();
            }
        }
        return var3;
    }

    @ObfuscatedName("ha.au(B)Lka;")
    public final class280 method3451() {
        class280 var1 = (class280) field1995.method5289((long) this.field2005);
        if (var1 == null) {
            class262 var2 = class262.method4571(Statics.field1999, this.field1997, 0);
            if (var2 == null) {
                return null;
            }
            if (this.field1996 != null) {
                for (int var3 = 0; var3 < this.field1996.length; var3++) {
                    var2.method4585(this.field1996[var3], this.field2000[var3]);
                }
            }
            if (this.field2001 != null) {
                for (int var4 = 0; var4 < this.field2001.length; var4++) {
                    var2.method4641(this.field2001[var4], this.field2002[var4]);
                }
            }
            var1 = var2.method4593(this.field2006 + 64, this.field2007 + 850, -30, -50, -30);
            field1995.method5303(var1, (long) this.field2005);
        }
        return var1;
    }
}
