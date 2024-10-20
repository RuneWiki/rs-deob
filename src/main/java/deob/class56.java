package deob;

@ObfuscatedName("br")
public class class56 extends class67 {

    @ObfuscatedName("br.e")
    public class200 field1145 = new class200();

    @ObfuscatedName("br.f")
    public class200 field1146 = new class200();

    @ObfuscatedName("br.s")
    public int field1147 = 0;

    @ObfuscatedName("br.p")
    public int field1148 = -1;

    @ObfuscatedName("br.e(Lbf;)V")
    public final synchronized void method1103(class67 arg0) {
        this.field1145.method3540(arg0);
    }

    @ObfuscatedName("br.w(Lbf;)V")
    public final synchronized void method1121(class67 arg0) {
        arg0.method3632();
    }

    @ObfuscatedName("br.f()V")
    public void method1115() {
        if (this.field1147 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1146.method3544(); var1 != null; var1 = (class62) this.field1146.method3546()) {
            var1.field1202 -= this.field1147;
        }
        this.field1148 -= this.field1147;
        this.field1147 = 0;
    }

    @ObfuscatedName("br.s(Lhd;Lby;)V")
    public void method1117(class209 arg0, class62 arg1) {
        while (this.field1146.field3100 != arg0 && ((class62) arg0).field1202 <= arg1.field1202) {
            arg0 = arg0.field3115;
        }
        class200.method3541(arg1, arg0);
        this.field1148 = ((class62) this.field1146.field3100.field3115).field1202;
    }

    @ObfuscatedName("br.p(Lby;)V")
    public void method1107(class62 arg0) {
        arg0.method3632();
        arg0.method1222();
        class209 var2 = this.field1146.field3100.field3115;
        if (this.field1146.field3100 == var2) {
            this.field1148 = -1;
        } else {
            this.field1148 = ((class62) var2).field1202;
        }
    }

    @ObfuscatedName("br.h()Lbf;")
    public class67 method1104() {
        return (class67) this.field1145.method3544();
    }

    @ObfuscatedName("br.g()Lbf;")
    public class67 method1109() {
        return (class67) this.field1145.method3546();
    }

    @ObfuscatedName("br.a()I")
    public int method1110() {
        return 0;
    }

    @ObfuscatedName("br.r([III)V")
    public final synchronized void method1135(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1148 < 0) {
                this.method1112(arg0, arg1, arg2);
                return;
            }
            if (this.field1147 + arg2 < this.field1148) {
                this.field1147 += arg2;
                this.method1112(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1148 - this.field1147;
            this.method1112(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1147 += var4;
            this.method1115();
            class62 var5 = (class62) this.field1146.method3544();
            synchronized (var5) {
                int var7 = var5.method1227(this);
                if (var7 < 0) {
                    var5.field1202 = 0;
                    this.method1107(var5);
                } else {
                    var5.field1202 = var7;
                    this.method1117(var5.field3115, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("br.k([III)V")
    public void method1112(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1145.method3544(); var4 != null; var4 = (class67) this.field1145.method3546()) {
            var4.method1393(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("br.m(I)V")
    public final synchronized void method1113(int arg0) {
        do {
            if (this.field1148 < 0) {
                this.method1114(arg0);
                return;
            }
            if (this.field1147 + arg0 < this.field1148) {
                this.field1147 += arg0;
                this.method1114(arg0);
                return;
            }
            int var2 = this.field1148 - this.field1147;
            this.method1114(var2);
            arg0 -= var2;
            this.field1147 += var2;
            this.method1115();
            class62 var3 = (class62) this.field1146.method3544();
            synchronized (var3) {
                int var5 = var3.method1227(this);
                if (var5 < 0) {
                    var3.field1202 = 0;
                    this.method1107(var3);
                } else {
                    var3.field1202 = var5;
                    this.method1117(var3.field3115, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("br.n(I)V")
    public void method1114(int arg0) {
        for (class67 var2 = (class67) this.field1145.method3544(); var2 != null; var2 = (class67) this.field1145.method3546()) {
            var2.method1113(arg0);
        }
    }
}
