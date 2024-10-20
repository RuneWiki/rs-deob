package deob;

@ObfuscatedName("oq")
public class class404 {

    @ObfuscatedName("oq.a")
    public int field4547;

    @ObfuscatedName("oq.f")
    public int field4548;

    @ObfuscatedName("oq.c")
    public int field4549;

    @ObfuscatedName("oq.x")
    public int field4546;

    public class404(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class404(int arg0, int arg1, int arg2, int arg3) {
        this.method6932(arg0, arg1);
        this.method6933(arg2, arg3);
    }

    @ObfuscatedName("oq.a(III)V")
    public void method6932(int arg0, int arg1) {
        this.field4547 = arg0;
        this.field4548 = arg1;
    }

    @ObfuscatedName("oq.f(III)V")
    public void method6933(int arg0, int arg1) {
        this.field4549 = arg0;
        this.field4546 = arg1;
    }

    @ObfuscatedName("oq.c(III)Z")
    public boolean method6934(int arg0, int arg1) {
        return arg0 >= this.field4547 && arg0 < this.field4549 + this.field4547 && arg1 >= this.field4548 && arg1 < this.field4548 + this.field4546;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("oq.x(Loq;Loq;I)V")
    public void method6935(class404 arg0, class404 arg1) {
        this.method6936(arg0, arg1);
        this.method6931(arg0, arg1);
    }

    @ObfuscatedName("oq.h(Loq;Loq;B)V")
    public void method6936(class404 arg0, class404 arg1) {
        arg1.field4547 = this.field4547;
        arg1.field4549 = this.field4549;
        if (this.field4547 < arg0.field4547) {
            arg1.field4549 -= arg0.field4547 - this.field4547;
            arg1.field4547 = arg0.field4547;
        }
        if (arg1.method6938() > arg0.method6938()) {
            arg1.field4549 -= arg1.method6938() - arg0.method6938();
        }
        if (arg1.field4549 < 0) {
            arg1.field4549 = 0;
        }
    }

    @ObfuscatedName("oq.j(Loq;Loq;I)V")
    public void method6931(class404 arg0, class404 arg1) {
        arg1.field4548 = this.field4548;
        arg1.field4546 = this.field4546;
        if (this.field4548 < arg0.field4548) {
            arg1.field4546 -= arg0.field4548 - this.field4548;
            arg1.field4548 = arg0.field4548;
        }
        if (arg1.method6944() > arg0.method6944()) {
            arg1.field4546 -= arg1.method6944() - arg0.method6944();
        }
        if (arg1.field4546 < 0) {
            arg1.field4546 = 0;
        }
    }

    @ObfuscatedName("oq.y(B)I")
    public int method6938() {
        return this.field4549 + this.field4547;
    }

    @ObfuscatedName("oq.d(B)I")
    public int method6944() {
        return this.field4548 + this.field4546;
    }
}
