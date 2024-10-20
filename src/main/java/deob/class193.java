package deob;

@ObfuscatedName("hu")
public class class193 extends class469 {

    @ObfuscatedName("hu.ae")
    public static class288 field2012 = new class288(64);

    @ObfuscatedName("hu.ao")
    public char field2009;

    @ObfuscatedName("hu.at")
    public char field2010;

    @ObfuscatedName("hu.ac")
    public String field2011 = class352.field4223;

    @ObfuscatedName("hu.ai")
    public int field2008;

    @ObfuscatedName("hu.az")
    public int field2013 = 0;

    @ObfuscatedName("hu.ap")
    public int[] field2007;

    @ObfuscatedName("hu.aa")
    public int[] field2016;

    @ObfuscatedName("hu.af")
    public String[] field2014;

    @ObfuscatedName("kf.au(II)Lhu;")
    public static class193 method5058(int arg0) {
        class193 var1 = (class193) field2012.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2015.method6128(8, arg0);
        class193 var3 = new class193();
        if (var2 != null) {
            var3.method3382(new class515(var2));
        }
        field2012.method5177(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hu.ae(Ltm;I)V")
    public void method3382(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            this.method3384(arg0, var2);
        }
    }

    @ObfuscatedName("hu.ao(Ltm;II)V")
    public void method3384(class515 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2009 = (char) arg0.method8300();
        } else if (arg1 == 2) {
            this.field2010 = (char) arg0.method8300();
        } else if (arg1 == 3) {
            this.field2011 = arg0.method8311();
        } else if (arg1 == 4) {
            this.field2008 = arg0.method8306();
        } else if (arg1 == 5) {
            this.field2013 = arg0.method8448();
            this.field2007 = new int[this.field2013];
            this.field2014 = new String[this.field2013];
            for (int var3 = 0; var3 < this.field2013; var3++) {
                this.field2007[var3] = arg0.method8306();
                this.field2014[var3] = arg0.method8311();
            }
        } else if (arg1 == 6) {
            this.field2013 = arg0.method8448();
            this.field2007 = new int[this.field2013];
            this.field2016 = new int[this.field2013];
            for (int var4 = 0; var4 < this.field2013; var4++) {
                this.field2007[var4] = arg0.method8306();
                this.field2016[var4] = arg0.method8306();
            }
        }
    }

    @ObfuscatedName("hu.at(B)I")
    public int method3381() {
        return this.field2013;
    }
}
