package deob;

@ObfuscatedName("bj")
public class class56 extends class67 {

    @ObfuscatedName("bj.y")
    public class199 field1171 = new class199();

    @ObfuscatedName("bj.d")
    public class199 field1172 = new class199();

    @ObfuscatedName("bj.g")
    public int field1173 = 0;

    @ObfuscatedName("bj.e")
    public int field1170 = -1;

    @ObfuscatedName("bj.y(Lbs;)V")
    public final synchronized void method1112(class67 arg0) {
        this.field1171.method3489(arg0);
    }

    @ObfuscatedName("bj.d(Lbs;)V")
    public final synchronized void method1113(class67 arg0) {
        arg0.method3588();
    }

    @ObfuscatedName("bj.g()V")
    public void method1114() {
        if (this.field1173 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1172.method3493(); var1 != null; var1 = (class62) this.field1172.method3495()) {
            var1.field1230 -= this.field1173;
        }
        this.field1170 -= this.field1173;
        this.field1173 = 0;
    }

    @ObfuscatedName("bj.w(Lgx;Lbn;)V")
    public void method1120(class208 arg0, class62 arg1) {
        while (this.field1172.field3076 != arg0 && ((class62) arg0).field1230 <= arg1.field1230) {
            arg0 = arg0.field3092;
        }
        class199.method3490(arg1, arg0);
        this.field1170 = ((class62) this.field1172.field3076.field3092).field1230;
    }

    @ObfuscatedName("bj.e(Lbn;)V")
    public void method1116(class62 arg0) {
        arg0.method3588();
        arg0.method1243();
        class208 var2 = this.field1172.field3076.field3092;
        if (this.field1172.field3076 == var2) {
            this.field1170 = -1;
        } else {
            this.field1170 = ((class62) var2).field1230;
        }
    }

    @ObfuscatedName("bj.c()Lbs;")
    public class67 method1123() {
        return (class67) this.field1171.method3493();
    }

    @ObfuscatedName("bj.a()Lbs;")
    public class67 method1118() {
        return (class67) this.field1171.method3495();
    }

    @ObfuscatedName("bj.q()I")
    public int method1145() {
        return 0;
    }

    @ObfuscatedName("bj.m([III)V")
    public final synchronized void method1119(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1170 < 0) {
                this.method1147(arg0, arg1, arg2);
                return;
            }
            if (this.field1173 + arg2 < this.field1170) {
                this.field1173 += arg2;
                this.method1147(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1170 - this.field1173;
            this.method1147(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1173 += var4;
            this.method1114();
            class62 var5 = (class62) this.field1172.method3493();
            synchronized (var5) {
                int var7 = var5.method1239(this);
                if (var7 < 0) {
                    var5.field1230 = 0;
                    this.method1116(var5);
                } else {
                    var5.field1230 = var7;
                    this.method1120(var5.field3092, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bj.n([III)V")
    public void method1147(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1171.method3493(); var4 != null; var4 = (class67) this.field1171.method3495()) {
            var4.method1406(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bj.k(I)V")
    public final synchronized void method1134(int arg0) {
        do {
            if (this.field1170 < 0) {
                this.method1122(arg0);
                return;
            }
            if (this.field1173 + arg0 < this.field1170) {
                this.field1173 += arg0;
                this.method1122(arg0);
                return;
            }
            int var2 = this.field1170 - this.field1173;
            this.method1122(var2);
            arg0 -= var2;
            this.field1173 += var2;
            this.method1114();
            class62 var3 = (class62) this.field1172.method3493();
            synchronized (var3) {
                int var5 = var3.method1239(this);
                if (var5 < 0) {
                    var3.field1230 = 0;
                    this.method1116(var3);
                } else {
                    var3.field1230 = var5;
                    this.method1120(var3.field3092, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bj.o(I)V")
    public void method1122(int arg0) {
        for (class67 var2 = (class67) this.field1171.method3493(); var2 != null; var2 = (class67) this.field1171.method3495()) {
            var2.method1134(arg0);
        }
    }
}
