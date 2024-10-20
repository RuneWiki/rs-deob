package deob;

@ObfuscatedName("jw")
public class class283 implements Comparable {

    @ObfuscatedName("jw.o")
    public class292 field3702;

    @ObfuscatedName("jw.p")
    public class292 field3701;

    @ObfuscatedName("jw.ao(I)Lkp;")
    public class292 method4780() {
        return this.field3702;
    }

    @ObfuscatedName("jw.am(I)Ljava/lang/String;")
    public String method4781() {
        return this.field3702 == null ? "" : this.field3702.method4926();
    }

    @ObfuscatedName("jw.aj(I)Ljava/lang/String;")
    public String method4779() {
        return this.field3701 == null ? "" : this.field3701.method4926();
    }

    @ObfuscatedName("jw.ah(Lkp;Lkp;I)V")
    public void method4796(class292 arg0, class292 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3702 = arg0;
        this.field3701 = arg1;
    }

    @ObfuscatedName("jw.af(Ljw;I)I")
    public int method4799(class283 arg0) {
        return this.field3702.method4928(arg0.field3702);
    }

    public int compareTo(Object arg0) {
        return this.method4799((class283) arg0);
    }
}
