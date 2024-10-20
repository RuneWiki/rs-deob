package deob;

@ObfuscatedName("as")
public class class46 extends class48 {

    @ObfuscatedName("as.i")
    public class177 field1070 = new class177();

    @ObfuscatedName("as.f")
    public class177 field1069 = new class177();

    @ObfuscatedName("as.e")
    public int field1071 = 0;

    @ObfuscatedName("as.t")
    public int field1072 = -1;

    @ObfuscatedName("as.i(Lar;)V")
    public final synchronized void method1102(class48 arg0) {
        this.field1070.method3290(arg0);
    }

    @ObfuscatedName("as.w(Lar;)V")
    public final synchronized void method1103(class48 arg0) {
        arg0.method3328();
    }

    @ObfuscatedName("as.e()V")
    public void method1115() {
        if (this.field1071 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1069.method3294(); var1 != null; var1 = (class61) this.field1069.method3296()) {
            var1.field1226 -= this.field1071;
        }
        this.field1072 -= this.field1071;
        this.field1071 = 0;
    }

    @ObfuscatedName("as.t(Lft;Lbg;)V")
    public void method1104(class179 arg0, class61 arg1) {
        while (this.field1069.field2812 != arg0 && ((class61) arg0).field1226 <= arg1.field1226) {
            arg0 = arg0.field2816;
        }
        class177.method3291(arg1, arg0);
        this.field1072 = ((class61) this.field1069.field2812.field2816).field1226;
    }

    @ObfuscatedName("as.d(Lbg;)V")
    public void method1109(class61 arg0) {
        arg0.method3328();
        arg0.method1293();
        class179 var2 = this.field1069.field2812.field2816;
        if (this.field1069.field2812 == var2) {
            this.field1072 = -1;
        } else {
            this.field1072 = ((class61) var2).field1226;
        }
    }

    @ObfuscatedName("as.h()Lar;")
    public class48 method974() {
        return (class48) this.field1070.method3294();
    }

    @ObfuscatedName("as.b()Lar;")
    public class48 method975() {
        return (class48) this.field1070.method3296();
    }

    @ObfuscatedName("as.y()I")
    public int method976() {
        return 0;
    }

    @ObfuscatedName("as.x([III)V")
    public final synchronized void method1005(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1072 < 0) {
                this.method1108(arg0, arg1, arg2);
                return;
            }
            if (this.field1071 + arg2 < this.field1072) {
                this.field1071 += arg2;
                this.method1108(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1072 - this.field1071;
            this.method1108(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1071 += var4;
            this.method1115();
            class61 var5 = (class61) this.field1069.method3294();
            synchronized (var5) {
                int var7 = var5.method1294(this);
                if (var7 < 0) {
                    var5.field1226 = 0;
                    this.method1109(var5);
                } else {
                    var5.field1226 = var7;
                    this.method1104(var5.field2816, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("as.p([III)V")
    public void method1108(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1070.method3294(); var4 != null; var4 = (class48) this.field1070.method3296()) {
            var4.method1124(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("as.ao(I)V")
    public final synchronized void method988(int arg0) {
        do {
            if (this.field1072 < 0) {
                this.method1120(arg0);
                return;
            }
            if (this.field1071 + arg0 < this.field1072) {
                this.field1071 += arg0;
                this.method1120(arg0);
                return;
            }
            int var2 = this.field1072 - this.field1071;
            this.method1120(var2);
            arg0 -= var2;
            this.field1071 += var2;
            this.method1115();
            class61 var3 = (class61) this.field1069.method3294();
            synchronized (var3) {
                int var5 = var3.method1294(this);
                if (var5 < 0) {
                    var3.field1226 = 0;
                    this.method1109(var3);
                } else {
                    var3.field1226 = var5;
                    this.method1104(var3.field2816, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("as.k(I)V")
    public void method1120(int arg0) {
        for (class48 var2 = (class48) this.field1070.method3294(); var2 != null; var2 = (class48) this.field1070.method3296()) {
            var2.method988(arg0);
        }
    }
}
