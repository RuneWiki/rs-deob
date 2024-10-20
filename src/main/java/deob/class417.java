package deob;

@ObfuscatedName("qy")
public class class417 {

    @ObfuscatedName("qy.aj")
    public int field4587;

    @ObfuscatedName("qy.al")
    public int field4586;

    @ObfuscatedName("qy.ac")
    public int field4589;

    @ObfuscatedName("qy.ab")
    public int field4588;

    public class417(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class417(int arg0, int arg1, int arg2, int arg3) {
        this.method7107(arg0, arg1);
        this.method7108(arg2, arg3);
    }

    @ObfuscatedName("qy.aj(III)V")
    public void method7107(int arg0, int arg1) {
        this.field4587 = arg0;
        this.field4586 = arg1;
    }

    @ObfuscatedName("qy.al(IIB)V")
    public void method7108(int arg0, int arg1) {
        this.field4589 = arg0;
        this.field4588 = arg1;
    }

    @ObfuscatedName("qy.ac(IIB)Z")
    public boolean method7109(int arg0, int arg1) {
        return arg0 >= this.field4587 && arg0 < this.field4589 + this.field4587 && arg1 >= this.field4586 && arg1 < this.field4588 + this.field4586;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("qy.ab(Lqy;Lqy;B)V")
    public void method7132(class417 arg0, class417 arg1) {
        this.method7131(arg0, arg1);
        this.method7112(arg0, arg1);
    }

    @ObfuscatedName("qy.an(Lqy;Lqy;I)V")
    public void method7131(class417 arg0, class417 arg1) {
        arg1.field4587 = this.field4587;
        arg1.field4589 = this.field4589;
        if (this.field4587 < arg0.field4587) {
            arg1.field4589 -= arg0.field4587 - this.field4587;
            arg1.field4587 = arg0.field4587;
        }
        if (arg1.method7113() > arg0.method7113()) {
            arg1.field4589 -= arg1.method7113() - arg0.method7113();
        }
        if (arg1.field4589 < 0) {
            arg1.field4589 = 0;
        }
    }

    @ObfuscatedName("qy.ao(Lqy;Lqy;I)V")
    public void method7112(class417 arg0, class417 arg1) {
        arg1.field4586 = this.field4586;
        arg1.field4588 = this.field4588;
        if (this.field4586 < arg0.field4586) {
            arg1.field4588 -= arg0.field4586 - this.field4586;
            arg1.field4586 = arg0.field4586;
        }
        if (arg1.method7114() > arg0.method7114()) {
            arg1.field4588 -= arg1.method7114() - arg0.method7114();
        }
        if (arg1.field4588 < 0) {
            arg1.field4588 = 0;
        }
    }

    @ObfuscatedName("qy.av(I)I")
    public int method7113() {
        return this.field4589 + this.field4587;
    }

    @ObfuscatedName("qy.aq(I)I")
    public int method7114() {
        return this.field4588 + this.field4586;
    }
}
