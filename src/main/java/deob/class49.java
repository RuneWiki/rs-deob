package deob;

@ObfuscatedName("ad")
public class class49 extends class60 {

    @ObfuscatedName("ad.g")
    public class177 field1070 = new class177();

    @ObfuscatedName("ad.v")
    public class177 field1072 = new class177();

    @ObfuscatedName("ad.z")
    public int field1071 = 0;

    @ObfuscatedName("ad.h")
    public int field1069 = -1;

    @ObfuscatedName("ad.g(Lbn;)V")
    public final synchronized void method993(class60 arg0) {
        this.field1070.method3238(arg0);
    }

    @ObfuscatedName("ad.v(Lbn;)V")
    public final synchronized void method975(class60 arg0) {
        arg0.method3322();
    }

    @ObfuscatedName("ad.z()V")
    public void method978() {
        if (this.field1071 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field1072.method3237(); var1 != null; var1 = (class55) this.field1072.method3239()) {
            var1.field1123 -= this.field1071;
        }
        this.field1069 -= this.field1071;
        this.field1071 = 0;
    }

    @ObfuscatedName("ad.h(Lgc;Lbe;)V")
    public void method979(class186 arg0, class55 arg1) {
        while (this.field1072.field2860 != arg0 && ((class55) arg0).field1123 <= arg1.field1123) {
            arg0 = arg0.field2876;
        }
        class177.method3234(arg1, arg0);
        this.field1069 = ((class55) this.field1072.field2860.field2876).field1123;
    }

    @ObfuscatedName("ad.k(Lbe;)V")
    public void method980(class55 arg0) {
        arg0.method3322();
        arg0.method1103();
        class186 var2 = this.field1072.field2860.field2876;
        if (this.field1072.field2860 == var2) {
            this.field1069 = -1;
        } else {
            this.field1069 = ((class55) var2).field1123;
        }
    }

    @ObfuscatedName("ad.l()Lbn;")
    public class60 method1004() {
        return (class60) this.field1070.method3237();
    }

    @ObfuscatedName("ad.e()Lbn;")
    public class60 method998() {
        return (class60) this.field1070.method3239();
    }

    @ObfuscatedName("ad.j()I")
    public int method983() {
        return 0;
    }

    @ObfuscatedName("ad.n([III)V")
    public final synchronized void method984(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1069 < 0) {
                this.method988(arg0, arg1, arg2);
                return;
            }
            if (this.field1071 + arg2 < this.field1069) {
                this.field1071 += arg2;
                this.method988(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1069 - this.field1071;
            this.method988(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1071 += var4;
            this.method978();
            class55 var5 = (class55) this.field1072.method3237();
            synchronized (var5) {
                int var7 = var5.method1098(this);
                if (var7 < 0) {
                    var5.field1123 = 0;
                    this.method980(var5);
                } else {
                    var5.field1123 = var7;
                    this.method979(var5.field2876, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ad.f([III)V")
    public void method988(int[] arg0, int arg1, int arg2) {
        for (class60 var4 = (class60) this.field1070.method3237(); var4 != null; var4 = (class60) this.field1070.method3239()) {
            var4.method1244(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ad.a(I)V")
    public final synchronized void method994(int arg0) {
        do {
            if (this.field1069 < 0) {
                this.method986(arg0);
                return;
            }
            if (this.field1071 + arg0 < this.field1069) {
                this.field1071 += arg0;
                this.method986(arg0);
                return;
            }
            int var2 = this.field1069 - this.field1071;
            this.method986(var2);
            arg0 -= var2;
            this.field1071 += var2;
            this.method978();
            class55 var3 = (class55) this.field1072.method3237();
            synchronized (var3) {
                int var5 = var3.method1098(this);
                if (var5 < 0) {
                    var3.field1123 = 0;
                    this.method980(var3);
                } else {
                    var3.field1123 = var5;
                    this.method979(var3.field2876, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ad.i(I)V")
    public void method986(int arg0) {
        for (class60 var2 = (class60) this.field1070.method3237(); var2 != null; var2 = (class60) this.field1070.method3239()) {
            var2.method994(arg0);
        }
    }
}
