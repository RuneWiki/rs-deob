package deob;

@ObfuscatedName("jw")
public class class285 implements Comparable {

    @ObfuscatedName("jw.e")
    public class294 field3679;

    @ObfuscatedName("jw.b")
    public class294 field3680;

    @ObfuscatedName("jw.z(I)Lkh;")
    public class294 method4927() {
        return this.field3679;
    }

    @ObfuscatedName("jw.j(I)Ljava/lang/String;")
    public String method4931() {
        return this.field3679 == null ? "" : this.field3679.method5059();
    }

    @ObfuscatedName("jw.c(I)Ljava/lang/String;")
    public String method4929() {
        return this.field3680 == null ? "" : this.field3680.method5059();
    }

    @ObfuscatedName("jw.av(Lkh;Lkh;I)V")
    public void method4930(class294 arg0, class294 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3679 = arg0;
        this.field3680 = arg1;
    }

    @ObfuscatedName("jw.as(Ljw;S)I")
    public int method4932(class285 arg0) {
        return this.field3679.method5063(arg0.field3679);
    }

    public int compareTo(Object arg0) {
        return this.method4932((class285) arg0);
    }
}
