package deob;

@ObfuscatedName("ar")
public class class46 extends class48 {

    @ObfuscatedName("ar.x")
    public class177 field1039 = new class177();

    @ObfuscatedName("ar.p")
    public class177 field1041 = new class177();

    @ObfuscatedName("ar.k")
    public int field1040 = 0;

    @ObfuscatedName("ar.a")
    public int field1038 = -1;

    @ObfuscatedName("ar.x(Lau;)V")
    public final synchronized void method1074(class48 arg0) {
        this.field1039.method3268(arg0);
    }

    @ObfuscatedName("ar.p(Lau;)V")
    public final synchronized void method1075(class48 arg0) {
        arg0.method3301();
    }

    @ObfuscatedName("ar.a()V")
    public void method1093() {
        if (this.field1040 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1041.method3280(); var1 != null; var1 = (class61) this.field1041.method3269()) {
            var1.field1196 -= this.field1040;
        }
        this.field1038 -= this.field1040;
        this.field1040 = 0;
    }

    @ObfuscatedName("ar.q(Lfz;Lbe;)V")
    public void method1077(class179 arg0, class61 arg1) {
        while (this.field1041.field2810 != arg0 && ((class61) arg0).field1196 <= arg1.field1196) {
            arg0 = arg0.field2815;
        }
        class177.method3292(arg1, arg0);
        this.field1038 = ((class61) this.field1041.field2810.field2815).field1196;
    }

    @ObfuscatedName("ar.j(Lbe;)V")
    public void method1078(class61 arg0) {
        arg0.method3301();
        arg0.method1276();
        class179 var2 = this.field1041.field2810.field2815;
        if (this.field1041.field2810 == var2) {
            this.field1038 = -1;
        } else {
            this.field1038 = ((class61) var2).field1196;
        }
    }

    @ObfuscatedName("ar.f()Lau;")
    public class48 method946() {
        return (class48) this.field1039.method3280();
    }

    @ObfuscatedName("ar.i()Lau;")
    public class48 method947() {
        return (class48) this.field1039.method3269();
    }

    @ObfuscatedName("ar.d()I")
    public int method976() {
        return 0;
    }

    @ObfuscatedName("ar.z([III)V")
    public final synchronized void method1006(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1038 < 0) {
                this.method1083(arg0, arg1, arg2);
                return;
            }
            if (this.field1040 + arg2 < this.field1038) {
                this.field1040 += arg2;
                this.method1083(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1038 - this.field1040;
            this.method1083(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1040 += var4;
            this.method1093();
            class61 var5 = (class61) this.field1041.method3280();
            synchronized (var5) {
                int var7 = var5.method1277(this);
                if (var7 < 0) {
                    var5.field1196 = 0;
                    this.method1078(var5);
                } else {
                    var5.field1196 = var7;
                    this.method1077(var5.field2815, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ar.v([III)V")
    public void method1083(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1039.method3280(); var4 != null; var4 = (class48) this.field1039.method3269()) {
            var4.method1097(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ar.ai(I)V")
    public final synchronized void method950(int arg0) {
        do {
            if (this.field1038 < 0) {
                this.method1081(arg0);
                return;
            }
            if (this.field1040 + arg0 < this.field1038) {
                this.field1040 += arg0;
                this.method1081(arg0);
                return;
            }
            int var2 = this.field1038 - this.field1040;
            this.method1081(var2);
            arg0 -= var2;
            this.field1040 += var2;
            this.method1093();
            class61 var3 = (class61) this.field1041.method3280();
            synchronized (var3) {
                int var5 = var3.method1277(this);
                if (var5 < 0) {
                    var3.field1196 = 0;
                    this.method1078(var3);
                } else {
                    var3.field1196 = var5;
                    this.method1077(var3.field2815, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ar.w(I)V")
    public void method1081(int arg0) {
        for (class48 var2 = (class48) this.field1039.method3280(); var2 != null; var2 = (class48) this.field1039.method3269()) {
            var2.method950(arg0);
        }
    }
}
