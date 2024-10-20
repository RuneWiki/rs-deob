package deob;

@ObfuscatedName("kv")
public class class297 implements Comparable {

    @ObfuscatedName("kv.i")
    public class306 field3827;

    @ObfuscatedName("kv.a")
    public class306 field3826;

    @ObfuscatedName("kv.r(I)Lkb;")
    public class306 method4856() {
        return this.field3827;
    }

    @ObfuscatedName("kv.y(I)Ljava/lang/String;")
    public String method4874() {
        return this.field3827 == null ? "" : this.field3827.method5022();
    }

    @ObfuscatedName("kv.h(I)Ljava/lang/String;")
    public String method4857() {
        return this.field3826 == null ? "" : this.field3826.method5022();
    }

    @ObfuscatedName("kv.av(Lkb;Lkb;B)V")
    public void method4873(class306 arg0, class306 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3827 = arg0;
        this.field3826 = arg1;
    }

    @ObfuscatedName("kv.aj(Lkv;I)I")
    public int method4859(class297 arg0) {
        return this.field3827.method5007(arg0.field3827);
    }

    public int compareTo(Object arg0) {
        return this.method4859((class297) arg0);
    }
}
