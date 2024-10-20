package deob;

@ObfuscatedName("av")
public class class46 extends class48 {

    @ObfuscatedName("av.d")
    public class177 field1061 = new class177();

    @ObfuscatedName("av.g")
    public class177 field1063 = new class177();

    @ObfuscatedName("av.a")
    public int field1062 = 0;

    @ObfuscatedName("av.t")
    public int field1064 = -1;

    @ObfuscatedName("av.d(Lao;)V")
    public final synchronized void method1090(class48 arg0) {
        this.field1061.method3289(arg0);
    }

    @ObfuscatedName("av.g(Lao;)V")
    public final synchronized void method1091(class48 arg0) {
        arg0.method3306();
    }

    @ObfuscatedName("av.t()V")
    public void method1089() {
        if (this.field1062 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1063.method3278(); var1 != null; var1 = (class61) this.field1063.method3280()) {
            var1.field1219 -= this.field1062;
        }
        this.field1064 -= this.field1062;
        this.field1062 = 0;
    }

    @ObfuscatedName("av.f(Lfy;Lbk;)V")
    public void method1093(class179 arg0, class61 arg1) {
        while (this.field1063.field2815 != arg0 && ((class61) arg0).field1219 <= arg1.field1219) {
            arg0 = arg0.field2819;
        }
        class177.method3275(arg1, arg0);
        this.field1064 = ((class61) this.field1063.field2815.field2819).field1219;
    }

    @ObfuscatedName("av.c(Lbk;)V")
    public void method1094(class61 arg0) {
        arg0.method3306();
        arg0.method1274();
        class179 var2 = this.field1063.field2815.field2819;
        if (this.field1063.field2815 == var2) {
            this.field1064 = -1;
        } else {
            this.field1064 = ((class61) var2).field1219;
        }
    }

    @ObfuscatedName("av.q()Lao;")
    public class48 method974() {
        return (class48) this.field1061.method3278();
    }

    @ObfuscatedName("av.w()Lao;")
    public class48 method951() {
        return (class48) this.field1061.method3280();
    }

    @ObfuscatedName("av.o()I")
    public int method952() {
        return 0;
    }

    @ObfuscatedName("av.j([III)V")
    public final synchronized void method1018(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1064 < 0) {
                this.method1097(arg0, arg1, arg2);
                return;
            }
            if (this.field1062 + arg2 < this.field1064) {
                this.field1062 += arg2;
                this.method1097(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1064 - this.field1062;
            this.method1097(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1062 += var4;
            this.method1089();
            class61 var5 = (class61) this.field1063.method3278();
            synchronized (var5) {
                int var7 = var5.method1276(this);
                if (var7 < 0) {
                    var5.field1219 = 0;
                    this.method1094(var5);
                } else {
                    var5.field1219 = var7;
                    this.method1093(var5.field2819, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("av.p([III)V")
    public void method1097(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1061.method3278(); var4 != null; var4 = (class48) this.field1061.method3280()) {
            var4.method1112(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("av.ae(I)V")
    public final synchronized void method954(int arg0) {
        do {
            if (this.field1064 < 0) {
                this.method1099(arg0);
                return;
            }
            if (this.field1062 + arg0 < this.field1064) {
                this.field1062 += arg0;
                this.method1099(arg0);
                return;
            }
            int var2 = this.field1064 - this.field1062;
            this.method1099(var2);
            arg0 -= var2;
            this.field1062 += var2;
            this.method1089();
            class61 var3 = (class61) this.field1063.method3278();
            synchronized (var3) {
                int var5 = var3.method1276(this);
                if (var5 < 0) {
                    var3.field1219 = 0;
                    this.method1094(var3);
                } else {
                    var3.field1219 = var5;
                    this.method1093(var3.field2819, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("av.s(I)V")
    public void method1099(int arg0) {
        for (class48 var2 = (class48) this.field1061.method3278(); var2 != null; var2 = (class48) this.field1061.method3280()) {
            var2.method954(arg0);
        }
    }
}
