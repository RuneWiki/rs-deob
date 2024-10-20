package deob;

@ObfuscatedName("jk")
public class class275 implements Comparable {

    @ObfuscatedName("jk.o")
    public class284 field3582;

    @ObfuscatedName("jk.e")
    public class284 field3583;

    @ObfuscatedName("jk.a(B)Ljz;")
    public class284 method4689() {
        return this.field3582;
    }

    @ObfuscatedName("jk.u(I)Ljava/lang/String;")
    public String method4690() {
        return this.field3582 == null ? "" : this.field3582.method4829();
    }

    @ObfuscatedName("jk.ae(I)Ljava/lang/String;")
    public String method4709() {
        return this.field3583 == null ? "" : this.field3583.method4829();
    }

    @ObfuscatedName("jk.af(Ljz;Ljz;I)V")
    public void method4692(class284 arg0, class284 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3582 = arg0;
        this.field3583 = arg1;
    }

    @ObfuscatedName("jk.az(Ljk;I)I")
    public int method4693(class275 arg0) {
        return this.field3582.method4832(arg0.field3582);
    }

    public int compareTo(Object arg0) {
        return this.method4693((class275) arg0);
    }
}
