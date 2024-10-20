package deob;

@ObfuscatedName("aq")
public class class46 extends class48 {

    @ObfuscatedName("aq.j")
    public class177 field1057 = new class177();

    @ObfuscatedName("aq.r")
    public class177 field1058 = new class177();

    @ObfuscatedName("aq.v")
    public int field1059 = 0;

    @ObfuscatedName("aq.p")
    public int field1060 = -1;

    @ObfuscatedName("aq.j(Law;)V")
    public final synchronized void method1123(class48 arg0) {
        this.field1057.method3333(arg0);
    }

    @ObfuscatedName("aq.r(Law;)V")
    public final synchronized void method1100(class48 arg0) {
        arg0.method3359();
    }

    @ObfuscatedName("aq.p()V")
    public void method1101() {
        if (this.field1059 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1058.method3326(); var1 != null; var1 = (class61) this.field1058.method3347()) {
            var1.field1220 -= this.field1059;
        }
        this.field1060 -= this.field1059;
        this.field1059 = 0;
    }

    @ObfuscatedName("aq.e(Lfi;Lbf;)V")
    public void method1102(class179 arg0, class61 arg1) {
        while (this.field1058.field2805 != arg0 && ((class61) arg0).field1220 <= arg1.field1220) {
            arg0 = arg0.field2808;
        }
        class177.method3353(arg1, arg0);
        this.field1060 = ((class61) this.field1058.field2805.field2808).field1220;
    }

    @ObfuscatedName("aq.d(Lbf;)V")
    public void method1103(class61 arg0) {
        arg0.method3359();
        arg0.method1303();
        class179 var2 = this.field1058.field2805.field2808;
        if (this.field1058.field2805 == var2) {
            this.field1060 = -1;
        } else {
            this.field1060 = ((class61) var2).field1220;
        }
    }

    @ObfuscatedName("aq.h()Law;")
    public class48 method962() {
        return (class48) this.field1057.method3326();
    }

    @ObfuscatedName("aq.n()Law;")
    public class48 method963() {
        return (class48) this.field1057.method3347();
    }

    @ObfuscatedName("aq.s()I")
    public int method1080() {
        return 0;
    }

    @ObfuscatedName("aq.c([III)V")
    public final synchronized void method965(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1060 < 0) {
                this.method1105(arg0, arg1, arg2);
                return;
            }
            if (this.field1059 + arg2 < this.field1060) {
                this.field1059 += arg2;
                this.method1105(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1060 - this.field1059;
            this.method1105(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1059 += var4;
            this.method1101();
            class61 var5 = (class61) this.field1058.method3326();
            synchronized (var5) {
                int var7 = var5.method1302(this);
                if (var7 < 0) {
                    var5.field1220 = 0;
                    this.method1103(var5);
                } else {
                    var5.field1220 = var7;
                    this.method1102(var5.field2808, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("aq.y([III)V")
    public void method1105(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1057.method3326(); var4 != null; var4 = (class48) this.field1057.method3347()) {
            var4.method1127(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("aq.am(I)V")
    public final synchronized void method966(int arg0) {
        do {
            if (this.field1060 < 0) {
                this.method1106(arg0);
                return;
            }
            if (this.field1059 + arg0 < this.field1060) {
                this.field1059 += arg0;
                this.method1106(arg0);
                return;
            }
            int var2 = this.field1060 - this.field1059;
            this.method1106(var2);
            arg0 -= var2;
            this.field1059 += var2;
            this.method1101();
            class61 var3 = (class61) this.field1058.method3326();
            synchronized (var3) {
                int var5 = var3.method1302(this);
                if (var5 < 0) {
                    var3.field1220 = 0;
                    this.method1103(var3);
                } else {
                    var3.field1220 = var5;
                    this.method1102(var3.field2808, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("aq.x(I)V")
    public void method1106(int arg0) {
        for (class48 var2 = (class48) this.field1057.method3326(); var2 != null; var2 = (class48) this.field1057.method3347()) {
            var2.method966(arg0);
        }
    }
}
