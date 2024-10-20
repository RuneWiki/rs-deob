package deob;

@ObfuscatedName("av")
public class class46 extends class48 {

    @ObfuscatedName("av.f")
    public class177 field1049 = new class177();

    @ObfuscatedName("av.t")
    public class177 field1047 = new class177();

    @ObfuscatedName("av.n")
    public int field1048 = 0;

    @ObfuscatedName("av.e")
    public int field1046 = -1;

    @ObfuscatedName("av.f(Laj;)V")
    public final synchronized void method1096(class48 arg0) {
        this.field1049.method3334(arg0);
    }

    @ObfuscatedName("av.t(Laj;)V")
    public final synchronized void method1098(class48 arg0) {
        arg0.method3374();
    }

    @ObfuscatedName("av.e()V")
    public void method1105() {
        if (this.field1048 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1047.method3362(); var1 != null; var1 = (class61) this.field1047.method3350()) {
            var1.field1208 -= this.field1048;
        }
        this.field1046 -= this.field1048;
        this.field1048 = 0;
    }

    @ObfuscatedName("av.l(Lfy;Lbk;)V")
    public void method1099(class179 arg0, class61 arg1) {
        while (this.field1047.field2808 != arg0 && ((class61) arg0).field1208 <= arg1.field1208) {
            arg0 = arg0.field2813;
        }
        class177.method3335(arg1, arg0);
        this.field1046 = ((class61) this.field1047.field2808.field2813).field1208;
    }

    @ObfuscatedName("av.d(Lbk;)V")
    public void method1100(class61 arg0) {
        arg0.method3374();
        arg0.method1318();
        class179 var2 = this.field1047.field2808.field2813;
        if (this.field1047.field2808 == var2) {
            this.field1046 = -1;
        } else {
            this.field1046 = ((class61) var2).field1208;
        }
    }

    @ObfuscatedName("av.y()Laj;")
    public class48 method1069() {
        return (class48) this.field1049.method3362();
    }

    @ObfuscatedName("av.x()Laj;")
    public class48 method964() {
        return (class48) this.field1049.method3350();
    }

    @ObfuscatedName("av.p()I")
    public int method1000() {
        return 0;
    }

    @ObfuscatedName("av.i([III)V")
    public final synchronized void method954(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1046 < 0) {
                this.method1102(arg0, arg1, arg2);
                return;
            }
            if (this.field1048 + arg2 < this.field1046) {
                this.field1048 += arg2;
                this.method1102(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1046 - this.field1048;
            this.method1102(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1048 += var4;
            this.method1105();
            class61 var5 = (class61) this.field1047.method3362();
            synchronized (var5) {
                int var7 = var5.method1319(this);
                if (var7 < 0) {
                    var5.field1208 = 0;
                    this.method1100(var5);
                } else {
                    var5.field1208 = var7;
                    this.method1099(var5.field2813, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("av.r([III)V")
    public void method1102(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1049.method3362(); var4 != null; var4 = (class48) this.field1049.method3350()) {
            var4.method1119(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("av.aa(I)V")
    public final synchronized void method1085(int arg0) {
        do {
            if (this.field1046 < 0) {
                this.method1110(arg0);
                return;
            }
            if (this.field1048 + arg0 < this.field1046) {
                this.field1048 += arg0;
                this.method1110(arg0);
                return;
            }
            int var2 = this.field1046 - this.field1048;
            this.method1110(var2);
            arg0 -= var2;
            this.field1048 += var2;
            this.method1105();
            class61 var3 = (class61) this.field1047.method3362();
            synchronized (var3) {
                int var5 = var3.method1319(this);
                if (var5 < 0) {
                    var3.field1208 = 0;
                    this.method1100(var3);
                } else {
                    var3.field1208 = var5;
                    this.method1099(var3.field2813, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("av.k(I)V")
    public void method1110(int arg0) {
        for (class48 var2 = (class48) this.field1049.method3362(); var2 != null; var2 = (class48) this.field1049.method3350()) {
            var2.method1085(arg0);
        }
    }
}
