package deob;

@ObfuscatedName("ht")
public class class201 extends class484 {

    @ObfuscatedName("ht.al")
    public static class302 field2013 = new class302(64);

    @ObfuscatedName("ht.ak")
    public char field2016;

    @ObfuscatedName("ht.ax")
    public char field2015;

    @ObfuscatedName("ht.ao")
    public String field2012 = class367.field3956;

    @ObfuscatedName("ht.ah")
    public int field2017;

    @ObfuscatedName("ht.ar")
    public int field2018 = 0;

    @ObfuscatedName("ht.ab")
    public int[] field2019;

    @ObfuscatedName("ht.am")
    public int[] field2020;

    @ObfuscatedName("ht.av")
    public String[] field2014;

    @ObfuscatedName("kp.ac(Lom;I)V")
    public static void method5125(class374 arg0) {
        Statics.field2021 = arg0;
    }

    @ObfuscatedName("cd.al(II)Lht;")
    public static class201 method2012(int arg0) {
        class201 var1 = (class201) field2013.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2021.method6342(8, arg0);
        class201 var3 = new class201();
        if (var2 != null) {
            var3.method3446(new class530(var2));
        }
        field2013.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ht.ak(Lul;B)V")
    public void method3446(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            this.method3435(arg0, var2);
        }
    }

    @ObfuscatedName("ht.ax(Lul;IB)V")
    public void method3435(class530 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2016 = (char) arg0.method8365();
        } else if (arg1 == 2) {
            this.field2015 = (char) arg0.method8365();
        } else if (arg1 == 3) {
            this.field2012 = arg0.method8588();
        } else if (arg1 == 4) {
            this.field2017 = arg0.method8371();
        } else if (arg1 == 5) {
            this.field2018 = arg0.method8598();
            this.field2019 = new int[this.field2018];
            this.field2014 = new String[this.field2018];
            for (int var3 = 0; var3 < this.field2018; var3++) {
                this.field2019[var3] = arg0.method8371();
                this.field2014[var3] = arg0.method8588();
            }
        } else if (arg1 == 6) {
            this.field2018 = arg0.method8598();
            this.field2019 = new int[this.field2018];
            this.field2020 = new int[this.field2018];
            for (int var4 = 0; var4 < this.field2018; var4++) {
                this.field2019[var4] = arg0.method8371();
                this.field2020[var4] = arg0.method8371();
            }
        }
    }

    @ObfuscatedName("ht.ao(B)I")
    public int method3438() {
        return this.field2018;
    }
}
