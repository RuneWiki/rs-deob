package deob;

@ObfuscatedName("ak")
public class class46 extends class57 {

    @ObfuscatedName("ak.m")
    public class171 field1043 = new class171();

    @ObfuscatedName("ak.k")
    public class171 field1042 = new class171();

    @ObfuscatedName("ak.y")
    public int field1041 = 0;

    @ObfuscatedName("ak.g")
    public int field1044 = -1;

    @ObfuscatedName("ak.m(Lbm;)V")
    public final synchronized void method914(class57 arg0) {
        this.field1043.method3176(arg0);
    }

    @ObfuscatedName("ak.k(Lbm;)V")
    public final synchronized void method946(class57 arg0) {
        arg0.method3223();
    }

    @ObfuscatedName("ak.y()V")
    public void method943() {
        if (this.field1041 <= 0) {
            return;
        }
        for (class52 var1 = (class52) this.field1042.method3178(); var1 != null; var1 = (class52) this.field1042.method3179()) {
            var1.field1100 -= this.field1041;
        }
        this.field1044 -= this.field1041;
        this.field1041 = 0;
    }

    @ObfuscatedName("ak.g(Lfv;Lae;)V")
    public void method917(class176 arg0, class52 arg1) {
        while (this.field1042.field2803 != arg0 && ((class52) arg0).field1100 <= arg1.field1100) {
            arg0 = arg0.field2813;
        }
        class171.method3175(arg1, arg0);
        this.field1044 = ((class52) this.field1042.field2803.field2813).field1100;
    }

    @ObfuscatedName("ak.r(Lae;)V")
    public void method933(class52 arg0) {
        arg0.method3223();
        arg0.method1059();
        class176 var2 = this.field1042.field2803.field2813;
        if (this.field1042.field2803 == var2) {
            this.field1044 = -1;
        } else {
            this.field1044 = ((class52) var2).field1100;
        }
    }

    @ObfuscatedName("ak.i()Lbm;")
    public class57 method919() {
        return (class57) this.field1043.method3178();
    }

    @ObfuscatedName("ak.f()Lbm;")
    public class57 method920() {
        return (class57) this.field1043.method3179();
    }

    @ObfuscatedName("ak.a()I")
    public int method921() {
        return 0;
    }

    @ObfuscatedName("ak.w([III)V")
    public final synchronized void method922(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1044 < 0) {
                this.method935(arg0, arg1, arg2);
                return;
            }
            if (this.field1041 + arg2 < this.field1044) {
                this.field1041 += arg2;
                this.method935(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1044 - this.field1041;
            this.method935(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1041 += var4;
            this.method943();
            class52 var5 = (class52) this.field1042.method3178();
            synchronized (var5) {
                int var7 = var5.method1060(this);
                if (var7 < 0) {
                    var5.field1100 = 0;
                    this.method933(var5);
                } else {
                    var5.field1100 = var7;
                    this.method917(var5.field2813, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ak.u([III)V")
    public void method935(int[] arg0, int arg1, int arg2) {
        for (class57 var4 = (class57) this.field1043.method3178(); var4 != null; var4 = (class57) this.field1043.method3179()) {
            var4.method1219(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ak.d(I)V")
    public final synchronized void method924(int arg0) {
        do {
            if (this.field1044 < 0) {
                this.method938(arg0);
                return;
            }
            if (this.field1041 + arg0 < this.field1044) {
                this.field1041 += arg0;
                this.method938(arg0);
                return;
            }
            int var2 = this.field1044 - this.field1041;
            this.method938(var2);
            arg0 -= var2;
            this.field1041 += var2;
            this.method943();
            class52 var3 = (class52) this.field1042.method3178();
            synchronized (var3) {
                int var5 = var3.method1060(this);
                if (var5 < 0) {
                    var3.field1100 = 0;
                    this.method933(var3);
                } else {
                    var3.field1100 = var5;
                    this.method917(var3.field2813, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ak.t(I)V")
    public void method938(int arg0) {
        for (class57 var2 = (class57) this.field1043.method3178(); var2 != null; var2 = (class57) this.field1043.method3179()) {
            var2.method924(arg0);
        }
    }
}
