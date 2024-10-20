package deob;

@ObfuscatedName("ad")
public class class49 extends class60 {

    @ObfuscatedName("ad.y")
    public class176 field1059 = new class176();

    @ObfuscatedName("ad.u")
    public class176 field1058 = new class176();

    @ObfuscatedName("ad.k")
    public int field1057 = 0;

    @ObfuscatedName("ad.v")
    public int field1060 = -1;

    @ObfuscatedName("ad.y(Lba;)V")
    public final synchronized void method973(class60 arg0) {
        this.field1059.method3211(arg0);
    }

    @ObfuscatedName("ad.u(Lba;)V")
    public final synchronized void method944(class60 arg0) {
        arg0.method3268();
    }

    @ObfuscatedName("ad.k()V")
    public void method960() {
        if (this.field1057 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1058.method3234(); var1 != null; var1 = (class55) this.field1058.method3209()) {
            var1.field1114 -= this.field1057;
        }
        this.field1060 -= this.field1057;
        this.field1057 = 0;
    }

    @ObfuscatedName("ad.v(Lgw;Lbl;)V")
    public void method946(class183 arg0, class55 arg1) {
        while (this.field1058.field2817 != arg0 && ((class55) arg0).field1114 <= arg1.field1114) {
            arg0 = arg0.field2829;
        }
        class176.method3200(arg1, arg0);
        this.field1060 = ((class55) this.field1058.field2817.field2829).field1114;
    }

    @ObfuscatedName("ad.l(Lbl;)V")
    public void method947(class55 arg0) {
        arg0.method3268();
        arg0.method1058();
        class183 var2 = this.field1058.field2817.field2829;
        if (this.field1058.field2817 == var2) {
            this.field1060 = -1;
        } else {
            this.field1060 = ((class55) var2).field1114;
        }
    }

    @ObfuscatedName("ad.g()Lba;")
    public class60 method948() {
        return (class60) this.field1059.method3234();
    }

    @ObfuscatedName("ad.a()Lba;")
    public class60 method949() {
        return (class60) this.field1059.method3209();
    }

    @ObfuscatedName("ad.x()I")
    public int method965() {
        return 0;
    }

    @ObfuscatedName("ad.r([III)V")
    public final synchronized void method951(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1060 < 0) {
                this.method972(arg0, arg1, arg2);
                return;
            }
            if (this.field1057 + arg2 < this.field1060) {
                this.field1057 += arg2;
                this.method972(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1060 - this.field1057;
            this.method972(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1057 += var4;
            this.method960();
            class55 var5 = (class55) this.field1058.method3234();
            synchronized (var5) {
                int var7 = var5.method1057(this);
                if (var7 < 0) {
                    var5.field1114 = 0;
                    this.method947(var5);
                } else {
                    var5.field1114 = var7;
                    this.method946(var5.field2829, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ad.w([III)V")
    public void method972(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1059.method3234(); var4 != null; var4 = (class60) this.field1059.method3209()) {
            var4.method1222(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ad.c(I)V")
    public final synchronized void method953(int arg0) {
        do {
            if (this.field1060 < 0) {
                this.method954(arg0);
                return;
            }
            if (this.field1057 + arg0 < this.field1060) {
                this.field1057 += arg0;
                this.method954(arg0);
                return;
            }
            int var2 = this.field1060 - this.field1057;
            this.method954(var2);
            arg0 -= var2;
            this.field1057 += var2;
            this.method960();
            class55 var3 = (class55) this.field1058.method3234();
            synchronized (var3) {
                int var5 = var3.method1057(this);
                if (var5 < 0) {
                    var3.field1114 = 0;
                    this.method947(var3);
                } else {
                    var3.field1114 = var5;
                    this.method946(var3.field2829, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ad.f(I)V")
    public void method954(int arg0) {
        for (class60 var2 = (class60) this.field1059.method3234(); var2 != null; var2 = (class60) this.field1059.method3209()) {
            var2.method953(arg0);
        }
    }
}
