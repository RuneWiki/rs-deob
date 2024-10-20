package deob;

@ObfuscatedName("al")
public class class50 extends class61 {

    @ObfuscatedName("al.e")
    public class180 field1087 = new class180();

    @ObfuscatedName("al.v")
    public class180 field1088 = new class180();

    @ObfuscatedName("al.k")
    public int field1089 = 0;

    @ObfuscatedName("al.g")
    public int field1090 = -1;

    @ObfuscatedName("al.e(Lbz;)V")
    public final synchronized void method956(class61 arg0) {
        this.field1087.method3225(arg0);
    }

    @ObfuscatedName("al.v(Lbz;)V")
    public final synchronized void method948(class61 arg0) {
        arg0.method3324();
    }

    @ObfuscatedName("al.k()V")
    public void method949() {
        if (this.field1089 <= 0) {
            return;
        }
        for (class56 var1 = (class56) this.field1088.method3226(); var1 != null; var1 = (class56) this.field1088.method3231()) {
            var1.field1152 -= this.field1089;
        }
        this.field1090 -= this.field1089;
        this.field1089 = 0;
    }

    @ObfuscatedName("al.g(Lgp;Lbv;)V")
    public void method967(class189 arg0, class56 arg1) {
        while (this.field1088.field2879 != arg0 && ((class56) arg0).field1152 <= arg1.field1152) {
            arg0 = arg0.field2895;
        }
        class180.method3235(arg1, arg0);
        this.field1090 = ((class56) this.field1088.field2879.field2895).field1152;
    }

    @ObfuscatedName("al.q(Lbv;)V")
    public void method951(class56 arg0) {
        arg0.method3324();
        arg0.method1081();
        class189 var2 = this.field1088.field2879.field2895;
        if (this.field1088.field2879 == var2) {
            this.field1090 = -1;
        } else {
            this.field1090 = ((class56) var2).field1152;
        }
    }

    @ObfuscatedName("al.l()Lbz;")
    public class61 method980() {
        return (class61) this.field1087.method3226();
    }

    @ObfuscatedName("al.a()Lbz;")
    public class61 method946() {
        return (class61) this.field1087.method3231();
    }

    @ObfuscatedName("al.b()I")
    public int method950() {
        return 0;
    }

    @ObfuscatedName("al.z([III)V")
    public final synchronized void method952(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1090 < 0) {
                this.method974(arg0, arg1, arg2);
                return;
            }
            if (this.field1089 + arg2 < this.field1090) {
                this.field1089 += arg2;
                this.method974(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1090 - this.field1089;
            this.method974(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1089 += var4;
            this.method949();
            class56 var5 = (class56) this.field1088.method3226();
            synchronized (var5) {
                int var7 = var5.method1085(this);
                if (var7 < 0) {
                    var5.field1152 = 0;
                    this.method951(var5);
                } else {
                    var5.field1152 = var7;
                    this.method967(var5.field2895, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("al.w([III)V")
    public void method974(int[] arg0, int arg1, int arg2) {
        for (class61 var4 = (class61) this.field1087.method3226(); var4 != null; var4 = (class61) this.field1087.method3231()) {
            var4.method1256(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("al.j(I)V")
    public final synchronized void method957(int arg0) {
        do {
            if (this.field1090 < 0) {
                this.method958(arg0);
                return;
            }
            if (this.field1089 + arg0 < this.field1090) {
                this.field1089 += arg0;
                this.method958(arg0);
                return;
            }
            int var2 = this.field1090 - this.field1089;
            this.method958(var2);
            arg0 -= var2;
            this.field1089 += var2;
            this.method949();
            class56 var3 = (class56) this.field1088.method3226();
            synchronized (var3) {
                int var5 = var3.method1085(this);
                if (var5 < 0) {
                    var3.field1152 = 0;
                    this.method951(var3);
                } else {
                    var3.field1152 = var5;
                    this.method967(var3.field2895, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("al.p(I)V")
    public void method958(int arg0) {
        for (class61 var2 = (class61) this.field1087.method3226(); var2 != null; var2 = (class61) this.field1087.method3231()) {
            var2.method957(arg0);
        }
    }
}
