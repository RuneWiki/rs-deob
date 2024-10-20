package deob;

@ObfuscatedName("ax")
public class class46 extends class48 {

    @ObfuscatedName("ax.q")
    public class177 field1059 = new class177();

    @ObfuscatedName("ax.c")
    public class177 field1057 = new class177();

    @ObfuscatedName("ax.p")
    public int field1058 = 0;

    @ObfuscatedName("ax.z")
    public int field1056 = -1;

    @ObfuscatedName("ax.q(Lav;)V")
    public final synchronized void method1116(class48 arg0) {
        this.field1059.method3277(arg0);
    }

    @ObfuscatedName("ax.c(Lav;)V")
    public final synchronized void method1115(class48 arg0) {
        arg0.method3309();
    }

    @ObfuscatedName("ax.z()V")
    public void method1118() {
        if (this.field1058 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1057.method3286(); var1 != null; var1 = (class61) this.field1057.method3302()) {
            var1.field1211 -= this.field1058;
        }
        this.field1056 -= this.field1058;
        this.field1058 = 0;
    }

    @ObfuscatedName("ax.m(Lft;Lbi;)V")
    public void method1119(class179 arg0, class61 arg1) {
        while (this.field1057.field2825 != arg0 && ((class61) arg0).field1211 <= arg1.field1211) {
            arg0 = arg0.field2829;
        }
        class177.method3295(arg1, arg0);
        this.field1056 = ((class61) this.field1057.field2825.field2829).field1211;
    }

    @ObfuscatedName("ax.k(Lbi;)V")
    public void method1120(class61 arg0) {
        arg0.method3309();
        arg0.method1324();
        class179 var2 = this.field1057.field2825.field2829;
        if (this.field1057.field2825 == var2) {
            this.field1056 = -1;
        } else {
            this.field1056 = ((class61) var2).field1211;
        }
    }

    @ObfuscatedName("ax.w()Lav;")
    public class48 method1006() {
        return (class48) this.field1059.method3286();
    }

    @ObfuscatedName("ax.x()Lav;")
    public class48 method1039() {
        return (class48) this.field1059.method3302();
    }

    @ObfuscatedName("ax.j()I")
    public int method979() {
        return 0;
    }

    @ObfuscatedName("ax.i([III)V")
    public final synchronized void method1059(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1056 < 0) {
                this.method1123(arg0, arg1, arg2);
                return;
            }
            if (this.field1058 + arg2 < this.field1056) {
                this.field1058 += arg2;
                this.method1123(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1056 - this.field1058;
            this.method1123(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1058 += var4;
            this.method1118();
            class61 var5 = (class61) this.field1057.method3286();
            synchronized (var5) {
                int var7 = var5.method1326(this);
                if (var7 < 0) {
                    var5.field1211 = 0;
                    this.method1120(var5);
                } else {
                    var5.field1211 = var7;
                    this.method1119(var5.field2829, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ax.v([III)V")
    public void method1123(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1059.method3286(); var4 != null; var4 = (class48) this.field1059.method3302()) {
            var4.method1139(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ax.ap(I)V")
    public final synchronized void method981(int arg0) {
        do {
            if (this.field1056 < 0) {
                this.method1124(arg0);
                return;
            }
            if (this.field1058 + arg0 < this.field1056) {
                this.field1058 += arg0;
                this.method1124(arg0);
                return;
            }
            int var2 = this.field1056 - this.field1058;
            this.method1124(var2);
            arg0 -= var2;
            this.field1058 += var2;
            this.method1118();
            class61 var3 = (class61) this.field1057.method3286();
            synchronized (var3) {
                int var5 = var3.method1326(this);
                if (var5 < 0) {
                    var3.field1211 = 0;
                    this.method1120(var3);
                } else {
                    var3.field1211 = var5;
                    this.method1119(var3.field2829, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ax.y(I)V")
    public void method1124(int arg0) {
        for (class48 var2 = (class48) this.field1059.method3286(); var2 != null; var2 = (class48) this.field1059.method3302()) {
            var2.method981(arg0);
        }
    }
}
